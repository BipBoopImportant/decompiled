package com.oppwa.mobile.connect.provider.model.yookassa;

public enum YooKassaStatus {
    SUCCEEDED,
    PENDING,
    WAITING_FOR_CAPTURE,
    CANCELED,
    UNDEFINED;

    public static YooKassaStatus forName(String str) {
        for (YooKassaStatus yooKassaStatus : values()) {
            if (yooKassaStatus.name().equalsIgnoreCase(str)) {
                return yooKassaStatus;
            }
        }
        return UNDEFINED;
    }
}
