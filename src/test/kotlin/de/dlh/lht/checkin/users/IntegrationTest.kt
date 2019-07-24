package de.dlh.lht.checkin.users

import de.otto.prada.metadata.configuration.OAuth2TestConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles

@Target(AnnotationTarget.CLASS)
@SpringBootTest
@ActiveProfiles("test")
@Import(OAuth2TestConfiguration::class)
annotation class IntegrationTest
