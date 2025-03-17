package qb;

import Cb.C;
import Cb.I;
import Cb.z;
import Db.k;
import com.google.crypto.tink.internal.i;
import com.google.crypto.tink.internal.o;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: qb.v  reason: case insensitive filesystem */
public final class C10177v<P> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<d, List<c<P>>> f75990a;

    /* renamed from: b  reason: collision with root package name */
    private c<P> f75991b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<P> f75992c;

    /* renamed from: d  reason: collision with root package name */
    private final Ab.a f75993d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f75994e;

    /* renamed from: qb.v$b */
    public static class b<P> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<P> f75995a;

        /* renamed from: b  reason: collision with root package name */
        private ConcurrentMap<d, List<c<P>>> f75996b;

        /* renamed from: c  reason: collision with root package name */
        private c<P> f75997c;

        /* renamed from: d  reason: collision with root package name */
        private Ab.a f75998d;

        private b<P> c(P p10, P p11, C.c cVar, boolean z10) {
            if (this.f75996b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            } else if (p10 == null && p11 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            } else if (cVar.Y() == z.ENABLED) {
                c<P> a10 = C10177v.b(p10, p11, cVar, this.f75996b);
                if (z10) {
                    if (this.f75997c == null) {
                        this.f75997c = a10;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            } else {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
        }

        public b<P> a(P p10, P p11, C.c cVar) {
            return c(p10, p11, cVar, false);
        }

        public b<P> b(P p10, P p11, C.c cVar) {
            return c(p10, p11, cVar, true);
        }

        public C10177v<P> d() {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.f75996b;
            if (concurrentMap != null) {
                C10177v vVar = new C10177v(concurrentMap, this.f75997c, this.f75998d, this.f75995a);
                this.f75996b = null;
                return vVar;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        public b<P> e(Ab.a aVar) {
            if (this.f75996b != null) {
                this.f75998d = aVar;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }

        private b(Class<P> cls) {
            this.f75996b = new ConcurrentHashMap();
            this.f75995a = cls;
            this.f75998d = Ab.a.f58659b;
        }
    }

    /* renamed from: qb.v$c */
    public static final class c<P> {

        /* renamed from: a  reason: collision with root package name */
        private final P f75999a;

        /* renamed from: b  reason: collision with root package name */
        private final P f76000b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f76001c;

        /* renamed from: d  reason: collision with root package name */
        private final z f76002d;

        /* renamed from: e  reason: collision with root package name */
        private final I f76003e;

        /* renamed from: f  reason: collision with root package name */
        private final int f76004f;

        /* renamed from: g  reason: collision with root package name */
        private final String f76005g;

        /* renamed from: h  reason: collision with root package name */
        private final C10162g f76006h;

        c(P p10, P p11, byte[] bArr, z zVar, I i10, int i11, String str, C10162g gVar) {
            this.f75999a = p10;
            this.f76000b = p11;
            this.f76001c = Arrays.copyOf(bArr, bArr.length);
            this.f76002d = zVar;
            this.f76003e = i10;
            this.f76004f = i11;
            this.f76005g = str;
            this.f76006h = gVar;
        }

        public P a() {
            return this.f75999a;
        }

        public final byte[] b() {
            byte[] bArr = this.f76001c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public C10162g c() {
            return this.f76006h;
        }

        public int d() {
            return this.f76004f;
        }

        public String e() {
            return this.f76005g;
        }

        public I f() {
            return this.f76003e;
        }

        public P g() {
            return this.f76000b;
        }

        public z h() {
            return this.f76002d;
        }
    }

    /* renamed from: qb.v$d */
    private static class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f76007a;

        /* renamed from: a */
        public int compareTo(d dVar) {
            byte[] bArr = this.f76007a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f76007a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f76007a;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = dVar.f76007a[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            return Arrays.equals(this.f76007a, ((d) obj).f76007a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f76007a);
        }

        public String toString() {
            return k.b(this.f76007a);
        }

        private d(byte[] bArr) {
            this.f76007a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* access modifiers changed from: private */
    public static <P> c<P> b(P p10, P p11, C.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) {
        ConcurrentMap<d, List<c<P>>> concurrentMap2 = concurrentMap;
        Integer valueOf = Integer.valueOf(cVar.W());
        if (cVar.X() == I.RAW) {
            valueOf = null;
        }
        c cVar2 = new c(p10, p11, C10159d.a(cVar), cVar.Y(), cVar.X(), cVar.W(), cVar.V().W(), i.a().d(o.b(cVar.V().W(), cVar.V().X(), cVar.V().V(), cVar.X(), valueOf), C10161f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List put = concurrentMap2.put(dVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar2);
            concurrentMap2.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static <P> b<P> j(Class<P> cls) {
        return new b<>(cls);
    }

    public Collection<List<c<P>>> c() {
        return this.f75990a.values();
    }

    public Ab.a d() {
        return this.f75993d;
    }

    public c<P> e() {
        return this.f75991b;
    }

    public List<c<P>> f(byte[] bArr) {
        List<c<P>> list = this.f75990a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> g() {
        return this.f75992c;
    }

    public List<c<P>> h() {
        return f(C10159d.f75965a);
    }

    public boolean i() {
        return !this.f75993d.b().isEmpty();
    }

    private C10177v(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, Ab.a aVar, Class<P> cls) {
        this.f75990a = concurrentMap;
        this.f75991b = cVar;
        this.f75992c = cls;
        this.f75993d = aVar;
        this.f75994e = false;
    }
}
