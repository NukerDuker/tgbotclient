package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class OrderInfo(
    val name: String? = null,

    @JsonProperty("phone_number")
    val phoneNumber: String? = null,

    val email: String? = null,

    @JsonProperty("shipping_address")
    val shippingAddress: ShippingAddress? = null
)
