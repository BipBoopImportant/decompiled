package yb;

import Cb.u;
import Cb.v;
import Cb.w;
import Cb.x;
import Cb.y;
import Db.n;
import Db.o;
import Db.p;
import Db.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import qb.C10167l;
import qb.C10175t;
import qb.C10179x;
import vb.C10302b;

/* renamed from: yb.k  reason: case insensitive filesystem */
public final class C10424k extends d<v> {

    /* renamed from: d  reason: collision with root package name */
    private static final l<C10422i, C10420g> f77847d = l.b(new C10423j(), C10422i.class, C10420g.class);

    /* renamed from: yb.k$a */
    class a extends m<C10175t, v> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public C10175t a(v vVar) {
            u U10 = vVar.W().U();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.V().E(), "HMAC");
            int V10 = vVar.W().V();
            int i10 = c.f77849a[U10.ordinal()];
            if (i10 == 1) {
                return new o(new n("HMACSHA1", secretKeySpec), V10);
            }
            if (i10 == 2) {
                return new o(new n("HMACSHA224", secretKeySpec), V10);
            }
            if (i10 == 3) {
                return new o(new n("HMACSHA256", secretKeySpec), V10);
            }
            if (i10 == 4) {
                return new o(new n("HMACSHA384", secretKeySpec), V10);
            }
            if (i10 == 5) {
                return new o(new n("HMACSHA512", secretKeySpec), V10);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: yb.k$b */
    class b extends d.a<w, v> {
        b(Class cls) {
            super(cls);
        }

        public Map<String, d.a.C1174a<w>> c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            C10167l.b bVar = C10167l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", C10424k.m(32, 16, uVar, bVar));
            C10167l.b bVar2 = C10167l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", C10424k.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", C10424k.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", C10424k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", C10424k.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", C10424k.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", C10424k.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", C10424k.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", C10424k.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", C10424k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: f */
        public v a(w wVar) {
            return (v) v.Y().z(C10424k.this.n()).y(wVar.V()).w(C9525h.m(p.c(wVar.U()))).g();
        }

        /* renamed from: g */
        public w d(C9525h hVar) {
            return w.X(hVar, C9533p.b());
        }

        /* renamed from: h */
        public void e(w wVar) {
            if (wVar.U() >= 16) {
                C10424k.r(wVar.V());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* renamed from: yb.k$c */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f77849a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Cb.u[] r0 = Cb.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f77849a = r0
                Cb.u r1 = Cb.u.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f77849a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.u r1 = Cb.u.SHA224     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f77849a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.u r1 = Cb.u.SHA256     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f77849a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Cb.u r1 = Cb.u.SHA384     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f77849a     // Catch:{ NoSuchFieldError -> 0x003e }
                Cb.u r1 = Cb.u.SHA512     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yb.C10424k.c.<clinit>():void");
        }
    }

    public C10424k() {
        super(v.class, new a(C10175t.class));
    }

    /* access modifiers changed from: private */
    public static d.a.C1174a<w> m(int i10, int i11, u uVar, C10167l.b bVar) {
        return new d.a.C1174a<>((w) w.W().y((x) x.W().w(uVar).y(i11).g()).w(i10).g(), bVar);
    }

    public static void p(boolean z10) {
        C10179x.l(new C10424k(), z10);
        n.c();
        h.c().d(f77847d);
    }

    /* access modifiers changed from: private */
    public static void r(x xVar) {
        if (xVar.V() >= 10) {
            int i10 = c.f77849a[xVar.U().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (xVar.V() > 64) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (xVar.V() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (xVar.V() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.V() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.V() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public C10302b.C1424b a() {
        return C10302b.C1424b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public d.a<w, v> f() {
        return new b(w.class);
    }

    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    /* renamed from: o */
    public v h(C9525h hVar) {
        return v.Z(hVar, C9533p.b());
    }

    /* renamed from: q */
    public void j(v vVar) {
        r.c(vVar.X(), n());
        if (vVar.V().size() >= 16) {
            r(vVar.W());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
