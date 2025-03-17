package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class O4 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f48769a = Charset.forName(Constants.ENCODING);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f48770b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f48770b = bArr;
        ByteBuffer.wrap(bArr);
        C7390q4.c(bArr, 0, bArr.length, false);
    }

    static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a10 = a(length, bArr, 0, length);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    static <T> T e(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T f(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static boolean g(C7406s5 s5Var) {
        boolean z10 = s5Var instanceof V3;
        return false;
    }
}
