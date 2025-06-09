package ru.sudokakado.tgbotclient.models


data class InlineQuery(
    val id: String,
    val from: User,
    val query: String,
    val offset: String
)