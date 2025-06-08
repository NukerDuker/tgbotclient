package ru.sudokakado.tgbotclient

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import ru.sudokakado.tgbotclient.models.Update
private val logger = logger {}

@Component
class TelegramBot(
    @Value("\${telegram.bot.token}")
    private val botToken: String,
    @Value("\${telegram.bot.username}")
    private val botUsername: String) {

    fun onUpdateReceived(update: Update): Unit {
        logger.info { "Update received $update" }
    }

    fun getBotToken(): String {
        return botToken
    }

    fun getBotUsername(): String {
        return botUsername
    }
}
