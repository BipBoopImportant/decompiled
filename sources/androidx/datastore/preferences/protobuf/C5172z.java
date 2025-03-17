package androidx.datastore.preferences.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.z  reason: case insensitive filesystem */
public final class C5172z {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f21468a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f21469b = Charset.forName(Constants.ENCODING);

    /* renamed from: c  reason: collision with root package name */
    static final Charset f21470c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f21471d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f21472e;

    /* renamed from: f  reason: collision with root package name */
    public static final C5155h f21473f;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$b */
    public interface b extends i<Double> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$c */
    public interface c {
        int d();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$e */
    public interface e {
        boolean a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$f */
    public interface f extends i<Float> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$g */
    public interface g extends i<Integer> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$h */
    public interface h extends i<Long> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$i */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> f(int i10);

        void o();

        boolean u();
    }

    static {
        byte[] bArr = new byte[0];
        f21471d = bArr;
        f21472e = ByteBuffer.wrap(bArr);
        f21473f = C5155h.i(bArr);
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
        int h10 = h(i11, bArr, i10, i11);
        if (h10 == 0) {
            return 1;
        }
        return h10;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static Object g(Object obj, Object obj2) {
        return ((S) obj).toBuilder().U((S) obj2).q();
    }

    static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
