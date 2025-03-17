package yb;

import Cb.C9051a;
import Cb.I;
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
import yb.C10417d;

/* renamed from: yb.f  reason: case insensitive filesystem */
final class C10419f {

    /* renamed from: a  reason: collision with root package name */
    private static final Eb.a f77832a;

    /* renamed from: b  reason: collision with root package name */
    private static final k<C10417d, p> f77833b;

    /* renamed from: c  reason: collision with root package name */
    private static final j<p> f77834c;

    /* renamed from: d  reason: collision with root package name */
    private static final c<C10414a, o> f77835d;

    /* renamed from: e  reason: collision with root package name */
    private static final b<o> f77836e;

    /* renamed from: yb.f$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f77837a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Cb.I[] r0 = Cb.I.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f77837a = r0
                Cb.I r1 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f77837a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.I r1 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f77837a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.I r1 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f77837a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Cb.I r1 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yb.C10419f.a.<clinit>():void");
        }
    }

    static {
        Eb.a e10 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f77832a = e10;
        Class<p> cls = p.class;
        f77833b = k.a(new C10212j(), C10417d.class, cls);
        f77834c = j.a(new C10213k(), e10, cls);
        Class<o> cls2 = o.class;
        f77835d = c.a(new l(), C10414a.class, cls2);
        f77836e = b.a(new C10418e(), e10, cls2);
    }

    /* access modifiers changed from: private */
    public static C10414a b(o oVar, C10180y yVar) {
        if (oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C9051a Y10 = C9051a.Y(oVar.g(), C9533p.b());
                if (Y10.W() == 0) {
                    return C10414a.c().e(C10417d.a().b(Y10.U().size()).c(Y10.V().T()).d(e(oVar.e())).a()).c(Eb.b.a(Y10.U().E(), C10180y.b(yVar))).d(oVar.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (B | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }

    public static void c() {
        d(i.a());
    }

    public static void d(i iVar) {
        iVar.h(f77833b);
        iVar.g(f77834c);
        iVar.f(f77835d);
        iVar.e(f77836e);
    }

    private static C10417d.c e(I i10) {
        int i11 = a.f77837a[i10.ordinal()];
        if (i11 == 1) {
            return C10417d.c.f77827b;
        }
        if (i11 == 2) {
            return C10417d.c.f77828c;
        }
        if (i11 == 3) {
            return C10417d.c.f77829d;
        }
        if (i11 == 4) {
            return C10417d.c.f77830e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.d());
    }
}
