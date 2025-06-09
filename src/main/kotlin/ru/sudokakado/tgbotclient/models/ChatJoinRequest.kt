package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatJoinRequest(
    val chat: Chat,
    val from: User,
    @JsonProperty("user_chat_id")
    val userChatId: Long,
    val date: Int,
    val bio: String? = null,
    @JsonProperty("invite_link")
    val inviteLink: ChatInviteLink? = null
)