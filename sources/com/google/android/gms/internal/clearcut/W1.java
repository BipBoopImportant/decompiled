package com.google.android.gms.internal.clearcut;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class W1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f48274a = Charset.forName(Constants.ENCODING);

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f48275b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final Object f48276c = new Object();

    public static boolean a(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static boolean b(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    public static boolean c(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || objArr[i10] != null) {
                while (i11 < length2 && objArr2[i11] == null) {
                    i11++;
                }
                boolean z10 = i10 >= length;
                boolean z11 = i11 >= length2;
                if (z10 && z11) {
                    return true;
                }
                if (z10 != z11 || !objArr[i10].equals(objArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }

    public static int d(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static int e(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int f(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                i10 = (i10 * 31) + obj.hashCode();
            }
        }
        return i10;
    }

    public static int g(byte[][] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            byte[] bArr2 = bArr[i11];
            if (bArr2 != null) {
                i10 = (i10 * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i10;
    }

    public static void h(T1 t12, T1 t13) {
        U1 u12 = t12.f48261b;
        if (u12 != null) {
            t13.f48261b = (U1) u12.clone();
        }
    }

    public static boolean i(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || bArr[i10] != null) {
                while (i11 < length2 && bArr2[i11] == null) {
                    i11++;
                }
                boolean z10 = i10 >= length;
                boolean z11 = i11 >= length2;
                if (z10 && z11) {
                    return true;
                }
                if (z10 != z11 || !Arrays.equals(bArr[i10], bArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }
}
