package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PollAnswer(
    @JsonProperty("poll_id")
    val pollId: String,
    val user: User,
    @JsonProperty("option_ids")
    val optionIds: List<Int>
)
