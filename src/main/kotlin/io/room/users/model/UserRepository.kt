package io.room.users.model

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

@Repository
interface UserRepository : ReactiveCrudRepository<User, UUID> {

    fun findByOrderByName() : Flux<User>

    fun findByName(name: String) : Mono<User>
}
