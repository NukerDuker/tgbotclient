package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CallbackQuery(
    val id: String,
    val from: User,
    val message: Message?,
    @JsonProperty("inline_message_id")
    val inlineMessageId: String? = null,
    @JsonProperty("chat_instance")
    val chatInstance: String,
    val data: String? = null,
    @JsonProperty("game_short_name")
    val gameShortName: String? = null
)
