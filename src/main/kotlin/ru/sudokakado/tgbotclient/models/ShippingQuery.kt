package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ShippingQuery(
    val id: String,
    val from: User,
    @JsonProperty("invoice_payload")
    val invoicePayload: String,
    val shippingAddress: ShippingAddress
)
