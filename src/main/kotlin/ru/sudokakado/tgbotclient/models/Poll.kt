package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Poll(
    val id: String,
    val question: String,
    val options: List<PollOption>,
    @JsonProperty("total_voter_count")
    val totalVoterCount: Int,
    @JsonProperty("is_closed")
    val isClosed: Boolean,
    @JsonProperty("is_anonymous")
    val isAnonymous: Boolean,
    val type: String,
    @JsonProperty("allows_multiple_answers")
    val allowsMultipleAnswers: Boolean,
    val explanation: String? = null,
    @JsonProperty("explanation_entities")
    val explanationEntities: List<MessageEntity>? = null,
    @JsonProperty("open_period")
    val openPeriod: Int? = null,
    @JsonProperty("close_date")
    val closeDate: Int? = null
)