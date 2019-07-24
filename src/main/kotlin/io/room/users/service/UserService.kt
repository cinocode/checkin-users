package io.room.users.service

import io.room.users.model.User
import io.room.users.model.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.UUID

@Service
class UserService(
        private val userRepository: UserRepository
) {

    fun createUser(name: String) : Mono<User> = userRepository.findByName(name)
            .switchIfEmpty(userRepository.save(User(name=name)))

    fun deleteUser(uuid: UUID) = userRepository.findById(uuid)
            .switchIfEmpty(Mono.error(IllegalArgumentException("invalid uuid")))
            .flatMap{ userRepository.delete(it) }

    fun listUsers() = userRepository.findByOrderByName()
}