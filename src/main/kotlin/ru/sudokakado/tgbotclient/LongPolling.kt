package ru.sudokakado.tgbotclient

import io.github.oshai.kotlinlogging.KotlinLogging
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient
import ru.sudokakado.tgbotclient.models.Update
import ru.sudokakado.tgbotclient.models.UpdateResponse
import ru.sudokakado.tgbotclient.models.requests.GetUpdate
import java.util.*

private val logger = KotlinLogging.logger {}

@Service
@Slf4j
class LongPolling(
    val restClientBuilder: RestClient.Builder,
    final val bot: TelegramBot
) {

    private final val restClient: RestClient

    init {
        restClient = restClientBuilder.baseUrl("https://api.telegram.org/bot${bot.getBotToken()}").build()
    }

    fun sendRequest() {
        logger.debug { "Sending request to ${bot.getBotToken()}." }
        logger.debug { "Trying to get updates" }
        var updateResponse: UpdateResponse = restClient.post()
            .uri("/getUpdates")
            .retrieve()
            .body(UpdateResponse::class.java)!!
        if (Objects.nonNull(updateResponse)) {
            logger.debug { "Updates found: $updateResponse" }
            updateResponse.result.forEach { bot.onUpdateReceived(it) }
        }
    }
}