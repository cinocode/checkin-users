package io.room

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@Target(AnnotationTarget.CLASS)
@SpringBootTest
@ActiveProfiles("test")
annotation class IntegrationTest
