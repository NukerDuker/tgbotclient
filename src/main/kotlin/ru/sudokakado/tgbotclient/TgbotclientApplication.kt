package ru.sudokakado.tgbotclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TgbotclientApplication

fun main(args: Array<String>) {
	runApplication<TgbotclientApplication>(*args)
}
