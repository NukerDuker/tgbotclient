package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChosenInlineResult(
    @JsonProperty("result_id")
    val resultId: String,
    val from: User,
    val query: String,
    val location: Location? = null,
    @JsonProperty("inline_message_id")
    val inlineMessageId: String? = null
)
