package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatInviteLink(
    @JsonProperty("invite_link")
    val inviteLink: String,
    val creator: User,
    @JsonProperty("is_primary")
    val isPrimary: Boolean,
    @JsonProperty("is_revoked")
    val isRevoked: Boolean,
    @JsonProperty("expire_date")
    val expireDate: Int? = null,
    @JsonProperty("member_limit")
    val memberLimit: Int? = null,
)