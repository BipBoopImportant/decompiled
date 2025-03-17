package com.oppwa.mobile.connect.core.nfc.model;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

public enum EmvTag {
    APPLICATION_IDENTIFIER(79, 5, 16),
    APPLICATION_FILE_LOCATOR(148, 0, 252),
    PRIMARY_ACCOUNT_NUMBER(90, 0, 10),
    APPLICATION_EXPIRATION_DATE(95, 36, 3, 3),
    PROCESSING_OPTIONS_DATA_OBJECT_LIST(159, 56, 0, Integer.MAX_VALUE),
    TERMINAL_TRANSACTION_QUALIFIERS(159, CheckoutActivity.RESULT_ERROR, 4, 4),
    UNPREDICTABLE_NUMBER(159, 55, 4, 4),
    TRACK_2_EQUIVALENT_DATA(87, 0, 19);
    

    /* renamed from: a  reason: collision with root package name */
    private final byte f121575a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f121576b;

    /* renamed from: c  reason: collision with root package name */
    private final int f121577c;

    /* renamed from: d  reason: collision with root package name */
    private final int f121578d;

    private EmvTag(int i10, int i11, int i12) {
        this(r8, r9, (byte) i10, 0, i11, i12);
    }

    public byte getB1() {
        return this.f121575a;
    }

    public byte getB2() {
        return this.f121576b;
    }

    public int getMaxLength() {
        return this.f121578d;
    }

    public int getMinLength() {
        return this.f121577c;
    }

    private EmvTag(int i10, int i11, int i12, int i13) {
        this.f121575a = (byte) i10;
        this.f121576b = (byte) i11;
        this.f121577c = i12;
        this.f121578d = i13;
    }

    public static EmvTag valueOf(byte b10) {
        return valueOf(b10, (byte) 0);
    }

    public static EmvTag valueOf(byte b10, byte b11) {
        for (EmvTag emvTag : values()) {
            if (emvTag.getB2() == 0) {
                if (emvTag.getB1() == b10) {
                    return emvTag;
                }
            } else if (emvTag.getB1() == b10 && emvTag.getB2() == b11) {
                return emvTag;
            }
        }
        return null;
    }
}
