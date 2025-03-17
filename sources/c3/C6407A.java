package C3;

import A3.v1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import q3.C5803n;

/* renamed from: C3.A  reason: case insensitive filesystem */
public interface C6407A {

    /* renamed from: C3.A$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f33551a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33552b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33553c;

        public a(byte[] bArr, String str, int i10) {
            this.f33551a = bArr;
            this.f33552b = str;
            this.f33553c = i10;
        }

        public byte[] a() {
            return this.f33551a;
        }

        public String b() {
            return this.f33552b;
        }
    }

    /* renamed from: C3.A$b */
    public interface b {
        void a(C6407A a10, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* renamed from: C3.A$c */
    public interface c {
        C6407A a(UUID uuid);
    }

    /* renamed from: C3.A$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f33554a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33555b;

        public d(byte[] bArr, String str) {
            this.f33554a = bArr;
            this.f33555b = str;
        }

        public byte[] a() {
            return this.f33554a;
        }

        public String b() {
            return this.f33555b;
        }
    }

    void a(b bVar);

    Map<String, String> b(byte[] bArr);

    d c();

    byte[] d();

    void e(byte[] bArr, byte[] bArr2);

    void f(byte[] bArr);

    int g();

    void h(byte[] bArr, v1 v1Var) {
    }

    y3.b i(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List<C5803n.b> list, int i10, HashMap<String, String> hashMap);

    void release();
}
