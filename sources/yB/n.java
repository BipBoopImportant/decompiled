package yb;

import Cb.I;
import Cb.u;
import Cb.v;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.c;
import com.google.crypto.tink.internal.i;
import com.google.crypto.tink.internal.j;
import com.google.crypto.tink.internal.k;
import com.google.crypto.tink.internal.o;
import com.google.crypto.tink.internal.p;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.security.GeneralSecurityException;
import qb.C10180y;
import rb.C10212j;
import rb.C10213k;
import rb.l;
import yb.C10425l;

final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Eb.a f77869a;

    /* renamed from: b  reason: collision with root package name */
    private static final k<C10425l, p> f77870b;

    /* renamed from: c  reason: collision with root package name */
    private static final j<p> f77871c;

    /* renamed from: d  reason: collision with root package name */
    private static final c<C10422i, o> f77872d;

    /* renamed from: e  reason: collision with root package name */
    private static final b<o> f77873e;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f77874a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f77875b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        static {
            /*
                Cb.I[] r0 = Cb.I.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f77875b = r0
                r1 = 1
                Cb.I r2 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f77875b     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.I r3 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f77875b     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.I r4 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f77875b     // Catch:{ NoSuchFieldError -> 0x0033 }
                Cb.I r5 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                Cb.u[] r4 = Cb.u.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f77874a = r4
                Cb.u r5 = Cb.u.SHA1     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f77874a     // Catch:{ NoSuchFieldError -> 0x004e }
                Cb.u r4 = Cb.u.SHA224     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f77874a     // Catch:{ NoSuchFieldError -> 0x0058 }
                Cb.u r1 = Cb.u.SHA256     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f77874a     // Catch:{ NoSuchFieldError -> 0x0062 }
                Cb.u r1 = Cb.u.SHA384     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f77874a     // Catch:{ NoSuchFieldError -> 0x006d }
                Cb.u r1 = Cb.u.SHA512     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yb.n.a.<clinit>():void");
        }
    }

    static {
        Eb.a e10 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f77869a = e10;
        Class<p> cls = p.class;
        f77870b = k.a(new C10212j(), C10425l.class, cls);
        f77871c = j.a(new C10213k(), e10, cls);
        Class<o> cls2 = o.class;
        f77872d = c.a(new l(), C10422i.class, cls2);
        f77873e = b.a(new C10426m(), e10, cls2);
    }

    /* access modifiers changed from: private */
    public static C10422i b(o oVar, C10180y yVar) {
        if (oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                v Z10 = v.Z(oVar.g(), C9533p.b());
                if (Z10.X() == 0) {
                    return C10422i.c().e(C10425l.a().c(Z10.V().size()).d(Z10.W().V()).b(e(Z10.W().U())).e(f(oVar.e())).a()).d(Eb.b.a(Z10.V().E(), C10180y.b(yVar))).c(oVar.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (B | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    public static void c() {
        d(i.a());
    }

    public static void d(i iVar) {
        iVar.h(f77870b);
        iVar.g(f77871c);
        iVar.f(f77872d);
        iVar.e(f77873e);
    }

    private static C10425l.c e(u uVar) {
        int i10 = a.f77874a[uVar.ordinal()];
        if (i10 == 1) {
            return C10425l.c.f77858b;
        }
        if (i10 == 2) {
            return C10425l.c.f77859c;
        }
        if (i10 == 3) {
            return C10425l.c.f77860d;
        }
        if (i10 == 4) {
            return C10425l.c.f77861e;
        }
        if (i10 == 5) {
            return C10425l.c.f77862f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.d());
    }

    private static C10425l.d f(I i10) {
        int i11 = a.f77875b[i10.ordinal()];
        if (i11 == 1) {
            return C10425l.d.f77864b;
        }
        if (i11 == 2) {
            return C10425l.d.f77865c;
        }
        if (i11 == 3) {
            return C10425l.d.f77866d;
        }
        if (i11 == 4) {
            return C10425l.d.f77867e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.d());
    }
}
