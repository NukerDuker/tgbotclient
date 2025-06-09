package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatMember(
    val user: User,
    @JsonProperty("status")
    val status: String,
    val untilDate: Int? = null,
    val canBeEdited: Boolean? = null,
    val canChangeInfo: Boolean? = null,
    val canPostMessages: Boolean? = null,
    val canEditMessages: Boolean? = null,
    val canDeleteMessages: Boolean? = null,
    val canInviteUsers: Boolean? = null,
    val canRestrictMembers: Boolean? = null,
    val canPinMessages: Boolean? = null,
    val canPromoteMembers: Boolean? = null,
    val canSendMessages: Boolean? = null,
    val canSendMediaMessages: Boolean? = null,
    val canSendPolls: Boolean? = null,
    val canSendOtherMessages: Boolean? = null,
    val canAddWebPagePreviews: Boolean? = null,
    val isMember: Boolean? = null
)