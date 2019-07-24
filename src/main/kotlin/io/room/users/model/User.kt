package io.room.users.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document
data class User(

        @Id
        val uuid: UUID = UUID.randomUUID(),
        var name: String
)
