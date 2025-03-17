package com.google.android.gms.internal.clearcut;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.i0  reason: case insensitive filesystem */
public final class C7192i0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f48408a = Charset.forName(Constants.ENCODING);

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f48409b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f48410c;

    /* renamed from: d  reason: collision with root package name */
    private static final ByteBuffer f48411d;

    /* renamed from: e  reason: collision with root package name */
    private static final J f48412e;

    static {
        byte[] bArr = new byte[0];
        f48410c = bArr;
        f48411d = ByteBuffer.wrap(bArr);
        f48412e = J.b(bArr, 0, bArr.length, false);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c10 = c(length, bArr, 0, length);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object d(Object obj, Object obj2) {
        return ((M0) obj).v().y2((M0) obj2).B();
    }

    static <T> T e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int f(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static boolean g(byte[] bArr) {
        return E1.h(bArr);
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f48408a);
    }

    static boolean i(M0 m02) {
        return false;
    }

    public static int j(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
