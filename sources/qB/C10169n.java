package qb;

import Cb.C;
import Cb.D;
import Cb.I;
import Cb.t;
import Cb.z;
import com.google.crypto.tink.internal.i;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qb.C10177v;

/* renamed from: qb.n  reason: case insensitive filesystem */
public final class C10169n {

    /* renamed from: a  reason: collision with root package name */
    private final C f75980a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f75981b;

    /* renamed from: c  reason: collision with root package name */
    private final Ab.a f75982c = Ab.a.f58659b;

    /* renamed from: qb.n$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f75983a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                Cb.z[] r0 = Cb.z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f75983a = r0
                Cb.z r1 = Cb.z.ENABLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f75983a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.z r1 = Cb.z.DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f75983a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.z r1 = Cb.z.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qb.C10169n.a.<clinit>():void");
        }
    }

    /* renamed from: qb.n$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C10162g f75984a;

        /* renamed from: b  reason: collision with root package name */
        private final C10166k f75985b;

        /* renamed from: c  reason: collision with root package name */
        private final int f75986c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f75987d;

        /* synthetic */ b(C10162g gVar, C10166k kVar, int i10, boolean z10, a aVar) {
            this(gVar, kVar, i10, z10);
        }

        public C10162g a() {
            return this.f75984a;
        }

        private b(C10162g gVar, C10166k kVar, int i10, boolean z10) {
            this.f75984a = gVar;
            this.f75985b = kVar;
            this.f75986c = i10;
            this.f75987d = z10;
        }
    }

    private C10169n(C c10, List<b> list) {
        this.f75980a = c10;
        this.f75981b = list;
    }

    private static void a(t tVar) {
        if (tVar == null || tVar.T().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(C c10) {
        if (c10 == null || c10.W() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static C c(t tVar, C10156a aVar, byte[] bArr) {
        try {
            C b02 = C.b0(aVar.b(tVar.T().E(), bArr), C9533p.b());
            b(b02);
            return b02;
        } catch (B unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t d(C c10, C10156a aVar, byte[] bArr) {
        byte[] a10 = aVar.a(c10.a(), bArr);
        try {
            if (C.b0(aVar.b(a10, bArr), C9533p.b()).equals(c10)) {
                return (t) t.U().w(C9525h.m(a10)).y(C10181z.b(c10)).g();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (B unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final C10169n e(C c10) {
        b(c10);
        return new C10169n(c10, f(c10));
    }

    private static List<b> f(C c10) {
        ArrayList arrayList = new ArrayList(c10.W());
        for (C.c next : c10.X()) {
            int W10 = next.W();
            try {
                arrayList.add(new b(i.a().d(q(next), C10161f.a()), m(next.Y()), W10, W10 == c10.Y(), (a) null));
            } catch (GeneralSecurityException unused) {
                arrayList.add((Object) null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private <B> B g(C10162g gVar, Class<B> cls) {
        try {
            return C10179x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B j(C.c cVar, Class<B> cls) {
        try {
            return C10179x.e(cVar.V(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private <B, P> P l(Class<P> cls, Class<B> cls2) {
        C10181z.d(this.f75980a);
        C10177v.b<P> j10 = C10177v.j(cls2);
        j10.e(this.f75982c);
        for (int i10 = 0; i10 < p(); i10++) {
            C.c V10 = this.f75980a.V(i10);
            if (V10.Y().equals(z.ENABLED)) {
                Object j11 = j(V10, cls2);
                Object g10 = this.f75981b.get(i10) != null ? g(this.f75981b.get(i10).a(), cls2) : null;
                if (V10.W() == this.f75980a.Y()) {
                    j10.b(g10, j11, V10);
                } else {
                    j10.a(g10, j11, V10);
                }
            }
        }
        return C10179x.o(j10.d(), cls);
    }

    private static C10166k m(z zVar) {
        int i10 = a.f75983a[zVar.ordinal()];
        if (i10 == 1) {
            return C10166k.f75973b;
        }
        if (i10 == 2) {
            return C10166k.f75974c;
        }
        if (i10 == 3) {
            return C10166k.f75975d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final C10169n n(C10171p pVar, C10156a aVar) {
        return o(pVar, aVar, new byte[0]);
    }

    public static final C10169n o(C10171p pVar, C10156a aVar, byte[] bArr) {
        t a10 = pVar.a();
        a(a10);
        return e(c(a10, aVar, bArr));
    }

    private static o q(C.c cVar) {
        try {
            return o.b(cVar.V().W(), cVar.V().X(), cVar.V().V(), cVar.X(), cVar.X() == I.RAW ? null : Integer.valueOf(cVar.W()));
        } catch (GeneralSecurityException e10) {
            throw new s("Creating a protokey serialization failed", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public C h() {
        return this.f75980a;
    }

    public D i() {
        return C10181z.b(this.f75980a);
    }

    public <P> P k(Class<P> cls) {
        Class<?> d10 = C10179x.d(cls);
        if (d10 != null) {
            return l(cls, d10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public int p() {
        return this.f75980a.W();
    }

    public void r(C10172q qVar, C10156a aVar) {
        s(qVar, aVar, new byte[0]);
    }

    public void s(C10172q qVar, C10156a aVar, byte[] bArr) {
        qVar.b(d(this.f75980a, aVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
