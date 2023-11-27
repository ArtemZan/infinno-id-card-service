package com.infinno.idcardsservice.utils;

import com.google.gson.annotations.SerializedName;

public enum ActionType {
    @SerializedName("CARD_RENEWED")
    CARD_RENEWED,
    @SerializedName("CARD_EXPIRED")
    CARD_EXPIRED,
    @SerializedName("CARD_BECOMES_INVALID")
    CARD_BECOMES_INVALID
}
