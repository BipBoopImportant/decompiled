package com.google.crypto.tink.shaded.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f67906a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f67907b = Charset.forName(Constants.ENCODING);

    /* renamed from: c  reason: collision with root package name */
    static final Charset f67908c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f67909d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f67910e;

    /* renamed from: f  reason: collision with root package name */
    public static final C9526i f67911f;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int d();
    }

    public interface d<T extends c> {
        T a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        i<E> f(int i10);

        void o();

        boolean u();
    }

    static {
        byte[] bArr = new byte[0];
        f67909d = bArr;
        f67910e = ByteBuffer.wrap(bArr);
        f67911f = C9526i.h(bArr);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return t0.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((S) obj).toBuilder().z2((S) obj2).q();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f67907b);
    }
}
