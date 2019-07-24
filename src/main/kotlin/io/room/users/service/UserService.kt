package io.room.users.service

import io.room.users.model.User
import io.room.users.model.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(
        private val userRepository: UserRepository
) {

    fun createUser(name: String) : Mono<User> = userRepository.findByName(name)
            .switchIfEmpty(userRepository.save(User(name=name)))

    fun listUsers() = userRepository.findByOrderByName()
}