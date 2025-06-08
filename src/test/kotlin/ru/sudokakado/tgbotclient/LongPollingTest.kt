package ru.sudokakado.tgbotclient

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import kotlin.test.Test

@SpringBootTest
class LongPollingTest {

    @Autowired
    private lateinit var longPolling: LongPolling

    @Test
    fun test() {
        longPolling.sendRequest()
    }
}