package com.mycompany.myapp

import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest

/**
 * Base composite annotation for integration tests.
 */
@kotlin.annotation.Target(AnnotationTarget.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@SpringBootTest(classes = [KhipsterSampleAppApp::class])
@ExtendWith(RedisTestContainerExtension::class)
annotation class IntegrationTest
