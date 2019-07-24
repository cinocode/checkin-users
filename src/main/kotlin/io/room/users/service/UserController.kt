package io.room.users.service

import io.room.users.model.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

@RestController
@RequestMapping("/users")
class UserController(
        private val userService: UserService
) {

    @GetMapping
    fun listUsers() : Flux<User> = userService.listUsers()

    @PostMapping
    fun createUser(@RequestBody request: Mono<UserCreationRequest>) : Mono<ResponseEntity<User>> = request
            .flatMap { userService.createUser(it.name) }
            .map { ResponseEntity.ok(it) }

    @DeleteMapping("/{uuid}")
    fun deleteUser(@PathVariable uuid: UUID) = userService.deleteUser(uuid)
}
