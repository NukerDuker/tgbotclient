package ru.sudokakado.tgbotclient.models

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Update(
    @JsonProperty("update_id")
    val updateId: Int,
    val message: Message?,
    @JsonProperty("edited_message")
    val editedMessage: Message?,
    @JsonProperty("channel_post")
    val channelPost: Message?,
    @JsonProperty("edited_channel_post")
    val editedChannelPost: Message?,
    @JsonProperty("inline_query")
    val inlineQuery: InlineQuery?,
    @JsonProperty("chosen_inline_result")
    val chosenInlineResult: ChosenInlineResult?,
    @JsonProperty("callback_query")
    val callbackQuery: CallbackQuery?,
    @JsonProperty("shipping_query")
    val shippingQuery: ShippingQuery?,
    @JsonProperty("pre_checkout_query")
    val preCheckoutQuery: PreCheckoutQuery?,
    val poll: Poll?,
    @JsonProperty("poll_answer")
    val pollAnswer: PollAnswer?,
    @JsonProperty("my_chat_member")
    val myChatMember: ChatMemberUpdated?,
    @JsonProperty("chat_member")
    val chatMember: ChatMemberUpdated?,
    @JsonProperty("chat_join_request")
    val chatJoinRequest: ChatJoinRequest?
)
