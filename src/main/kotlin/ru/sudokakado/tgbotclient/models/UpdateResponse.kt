package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class UpdateResponse(
    val ok: Boolean,
    val result: List<Update>
)