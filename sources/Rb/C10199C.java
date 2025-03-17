package rb;

import Cb.I;
import Cb.r;
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
import rb.C10197A;

/* renamed from: rb.C  reason: case insensitive filesystem */
final class C10199C {

    /* renamed from: a  reason: collision with root package name */
    private static final Eb.a f76256a;

    /* renamed from: b  reason: collision with root package name */
    private static final k<C10197A, p> f76257b;

    /* renamed from: c  reason: collision with root package name */
    private static final j<p> f76258c;

    /* renamed from: d  reason: collision with root package name */
    private static final c<y, o> f76259d;

    /* renamed from: e  reason: collision with root package name */
    private static final b<o> f76260e;

    /* renamed from: rb.C$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f76261a;

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
                f76261a = r0
                Cb.I r1 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f76261a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.I r1 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f76261a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.I r1 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f76261a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Cb.I r1 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rb.C10199C.a.<clinit>():void");
        }
    }

    static {
        Eb.a e10 = t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f76256a = e10;
        Class<p> cls = p.class;
        f76257b = k.a(new C10212j(), C10197A.class, cls);
        f76258c = j.a(new C10213k(), e10, cls);
        Class<o> cls2 = o.class;
        f76259d = c.a(new l(), y.class, cls2);
        f76260e = b.a(new C10198B(), e10, cls2);
    }

    /* access modifiers changed from: private */
    public static y b(o oVar, C10180y yVar) {
        if (oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                r W10 = r.W(oVar.g(), C9533p.b());
                if (W10.U() == 0) {
                    return y.a(e(oVar.e()), Eb.b.a(W10.T().E(), C10180y.b(yVar)), oVar.c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (B unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
    }

    public static void c() {
        d(i.a());
    }

    public static void d(i iVar) {
        iVar.h(f76257b);
        iVar.g(f76258c);
        iVar.f(f76259d);
        iVar.e(f76260e);
    }

    private static C10197A.a e(I i10) {
        int i11 = a.f76261a[i10.ordinal()];
        if (i11 == 1) {
            return C10197A.a.f76252b;
        }
        if (i11 == 2 || i11 == 3) {
            return C10197A.a.f76253c;
        }
        if (i11 == 4) {
            return C10197A.a.f76254d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.d());
    }
}
