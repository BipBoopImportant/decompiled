package com.google.android.gms.internal.vision;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class U0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f49276a = Charset.forName(Constants.ENCODING);

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f49277b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f49278c;

    /* renamed from: d  reason: collision with root package name */
    private static final ByteBuffer f49279d;

    /* renamed from: e  reason: collision with root package name */
    private static final C7541v0 f49280e;

    static {
        byte[] bArr = new byte[0];
        f49278c = bArr;
        f49279d = ByteBuffer.wrap(bArr);
        f49280e = C7541v0.b(bArr, 0, bArr.length, false);
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

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    static Object e(Object obj, Object obj2) {
        return ((A1) obj).j().H2((A1) obj2).h();
    }

    static <T> T f(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static boolean g(A1 a12) {
        boolean z10 = a12 instanceof Z;
        return false;
    }

    public static boolean h(byte[] bArr) {
        return t2.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f49276a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int a10 = a(length, bArr, 0, length);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
