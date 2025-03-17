package com.oppwa.mobile.connect.core.nfc.model;

import java.util.Objects;

public class EmvFileInfo {

    /* renamed from: a  reason: collision with root package name */
    private final byte f121571a;

    /* renamed from: b  reason: collision with root package name */
    private final int f121572b;

    /* renamed from: c  reason: collision with root package name */
    private final int f121573c;

    public EmvFileInfo(byte b10, int i10, int i11) {
        this.f121571a = b10;
        this.f121572b = i10;
        this.f121573c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmvFileInfo emvFileInfo = (EmvFileInfo) obj;
        return this.f121571a == emvFileInfo.f121571a && this.f121572b == emvFileInfo.f121572b && this.f121573c == emvFileInfo.f121573c;
    }

    public int getFirstRecord() {
        return this.f121572b;
    }

    public int getLastRecord() {
        return this.f121573c;
    }

    public byte getSfi() {
        return this.f121571a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Byte.valueOf(this.f121571a), Integer.valueOf(this.f121572b), Integer.valueOf(this.f121573c)});
    }
}
