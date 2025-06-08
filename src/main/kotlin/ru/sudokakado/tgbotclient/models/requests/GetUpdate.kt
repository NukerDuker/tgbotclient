package ru.sudokakado.tgbotclient.models.requests

import lombok.Builder

@Builder
data class GetUpdate(
    val offset: Int,
    val limit: Int,
    val timeout: Int,
    val allowedUpdates: List<String>
)