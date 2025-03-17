package C7;

import Y7.k;
import java.security.MessageDigest;

public final class h<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final b<Object> f33751e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final T f33752a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f33753b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33754c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f33755d;

    class a implements b<Object> {
        a() {
        }

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    private h(String str, T t10, b<T> bVar) {
        this.f33754c = k.b(str);
        this.f33752a = t10;
        this.f33753b = (b) k.d(bVar);
    }

    public static <T> h<T> a(String str, T t10, b<T> bVar) {
        return new h<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return f33751e;
    }

    private byte[] d() {
        if (this.f33755d == null) {
            this.f33755d = this.f33754c.getBytes(f.f33749a);
        }
        return this.f33755d;
    }

    public static <T> h<T> e(String str) {
        return new h<>(str, (Object) null, b());
    }

    public static <T> h<T> f(String str, T t10) {
        return new h<>(str, t10, b());
    }

    public T c() {
        return this.f33752a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f33754c.equals(((h) obj).f33754c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f33753b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f33754c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f33754c + '\'' + '}';
    }
}
