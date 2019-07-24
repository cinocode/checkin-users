package io.room.users.model

import java.util.UUID

data class User(
        val uuid: UUID = UUID.randomUUID(),
        var name: String
)
