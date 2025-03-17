package com.oppwa.mobile.connect.core.nfc.model.apdu;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class CommandApdu {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f121579a;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public byte f121580a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public byte f121581b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public byte f121582c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte f121583d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public byte f121584e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public byte[] f121585f = new byte[0];

        public CommandApdu build() {
            return new CommandApdu(this);
        }

        public Builder setCla(int i10) {
            this.f121580a = (byte) i10;
            return this;
        }

        public Builder setData(byte[] bArr) {
            this.f121585f = bArr;
            return this;
        }

        public Builder setIns(int i10) {
            this.f121581b = (byte) i10;
            return this;
        }

        public Builder setLc(int i10) {
            this.f121584e = (byte) i10;
            return this;
        }

        public Builder setP1(int i10) {
            this.f121582c = (byte) i10;
            return this;
        }

        public Builder setP2(int i10) {
            this.f121583d = (byte) i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f121579a, ((CommandApdu) obj).f121579a);
    }

    public byte[] getBytes() {
        return this.f121579a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f121579a);
    }

    private CommandApdu(Builder builder) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(builder.f121580a);
        byteArrayOutputStream.write(builder.f121581b);
        byteArrayOutputStream.write(builder.f121582c);
        byteArrayOutputStream.write(builder.f121583d);
        byteArrayOutputStream.write(builder.f121584e);
        byteArrayOutputStream.write(builder.f121585f, 0, builder.f121585f.length);
        this.f121579a = byteArrayOutputStream.toByteArray();
    }
}
