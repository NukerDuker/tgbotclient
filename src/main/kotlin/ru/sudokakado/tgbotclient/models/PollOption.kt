package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PollOption(
    val text: String,
    @JsonProperty("voter_count")
    val voterCount: Int
)
