package ru.sudokakado.tgbotclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import ru.sudokakado.tgbotclient.models.Update

@Component
class TelegramBot(
    @Value("\${telegram.bot.token}")
    private val botToken: String,
    @Value("\${telegram.bot.username}")
    private val botUsername: String) {

    fun onUpdateReceived(update: Update): Unit {
        println("Some logic with update: $update")
    }

    fun getBotToken(): String {
        return botToken
    }

    fun getBotUsername(): String {
        return botUsername
    }
}
