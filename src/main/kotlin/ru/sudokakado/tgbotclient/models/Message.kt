package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Message(
    @JsonProperty("message_id")
    val messageId: Int,
    val from: User?,
    val chat: Chat,
    val text: String?,
    val date: Int
)
