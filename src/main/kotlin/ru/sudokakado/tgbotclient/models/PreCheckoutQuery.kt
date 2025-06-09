package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PreCheckoutQuery(
    val id: String,
    val from: User,
    val currency: String,
    val totalAmount: Int,
    val invoicePayload: String,
    @JsonProperty("shipping_option_id")
    val shippingOptionId: String? = null,
    @JsonProperty("order_info")
    val orderInfo: OrderInfo? = null
)
