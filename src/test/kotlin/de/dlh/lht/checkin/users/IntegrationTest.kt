package de.dlh.lht.checkin.users

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@Target(AnnotationTarget.CLASS)
@SpringBootTest
@ActiveProfiles("test")
annotation class IntegrationTest
