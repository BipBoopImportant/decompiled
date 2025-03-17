package com.oppwa.mobile.connect.core.nfc.model.apdu;

import java.util.Arrays;

public class ResponseApdu {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f121586a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private byte f121587b;

    /* renamed from: c  reason: collision with root package name */
    private byte f121588c;

    public ResponseApdu(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f121587b = bArr[bArr.length - 2];
            this.f121588c = bArr[bArr.length - 1];
            if (bArr.length > 2) {
                this.f121586a = Arrays.copyOfRange(bArr, 0, bArr.length - 2);
            }
        }
    }

    public byte[] getData() {
        return this.f121586a;
    }

    public byte getSw1() {
        return this.f121587b;
    }

    public byte getSw2() {
        return this.f121588c;
    }

    public boolean isSuccessful() {
        return this.f121587b == -112 && this.f121588c == 0;
    }
}
