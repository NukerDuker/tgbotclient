package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Location(
    val longitude: Float,
    val latitude: Float,
    @JsonProperty("horizontal_accuracy")
    val horizontalAccuracy: Float? = null,
    @JsonProperty("live_period")
    val livePeriod: Int? = null,
    val heading: Int? = null,
    @JsonProperty("proximity_alert_radius")
    val proximityAlertRadius: Int? = null
)
