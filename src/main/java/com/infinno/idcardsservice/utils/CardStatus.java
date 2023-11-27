package com.infinno.idcardsservice.utils;

import com.google.gson.annotations.SerializedName;

public enum CardStatus {
    @SerializedName("NEW")
    NEW,
    @SerializedName("IN_REVIEW")
    IN_REVIEW,
    @SerializedName("END_USER_SUBMISSION")
    END_USER_SUBMISSION,
    @SerializedName("AUTO_COMPLETED")
    AUTO_COMPLETED,
    @SerializedName("MANUALLY_COMPLETED")
    MANUALLY_COMPLETED,
    @SerializedName("INVALID")
    INVALID
}
