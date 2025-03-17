package com.google.crypto.tink.internal;

import Eb.a;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f67905a = Charset.forName(Constants.ENCODING);

    public static Integer a() {
        if (!b()) {
            return null;
        }
        return a.a();
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    private static final byte d(char c10) {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new s("Not a printable ASCII character: " + c10);
    }

    public static final a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = d(str.charAt(i10));
        }
        return a.a(bArr);
    }
}
