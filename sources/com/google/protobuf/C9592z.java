package com.google.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z  reason: case insensitive filesystem */
public final class C9592z {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f69429a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f69430b = Charset.forName(Constants.ENCODING);

    /* renamed from: c  reason: collision with root package name */
    static final Charset f69431c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f69432d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f69433e;

    /* renamed from: f  reason: collision with root package name */
    public static final C9576i f69434f;

    /* renamed from: com.google.protobuf.z$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: com.google.protobuf.z$b */
    public interface b extends i<Double> {
    }

    /* renamed from: com.google.protobuf.z$c */
    public interface c {
        int d();
    }

    /* renamed from: com.google.protobuf.z$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* renamed from: com.google.protobuf.z$e */
    public interface e {
        boolean a(int i10);
    }

    /* renamed from: com.google.protobuf.z$f */
    public interface f extends i<Float> {
    }

    /* renamed from: com.google.protobuf.z$g */
    public interface g extends i<Integer> {
        void P1(int i10);

        g f(int i10);

        int getInt(int i10);
    }

    /* renamed from: com.google.protobuf.z$h */
    public interface h extends i<Long> {
        h f(int i10);
    }

    /* renamed from: com.google.protobuf.z$i */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> f(int i10);

        void o();

        boolean u();
    }

    static {
        byte[] bArr = new byte[0];
        f69432d = bArr;
        f69433e = ByteBuffer.wrap(bArr);
        f69434f = C9576i.f(bArr);
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
        return ((S) obj).toBuilder().S0((S) obj2).q();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f69430b);
    }
}
