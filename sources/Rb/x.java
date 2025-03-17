package rb;

import Cb.I;
import Cb.n;
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
import rb.v;

final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final Eb.a f76369a;

    /* renamed from: b  reason: collision with root package name */
    private static final k<v, p> f76370b;

    /* renamed from: c  reason: collision with root package name */
    private static final j<p> f76371c;

    /* renamed from: d  reason: collision with root package name */
    private static final c<t, o> f76372d;

    /* renamed from: e  reason: collision with root package name */
    private static final b<o> f76373e;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f76374a;

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
                f76374a = r0
                Cb.I r1 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f76374a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.I r1 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f76374a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.I r1 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f76374a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Cb.I r1 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rb.x.a.<clinit>():void");
        }
    }

    static {
        Eb.a e10 = t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f76369a = e10;
        Class<p> cls = p.class;
        f76370b = k.a(new C10212j(), v.class, cls);
        f76371c = j.a(new C10213k(), e10, cls);
        Class<o> cls2 = o.class;
        f76372d = c.a(new l(), t.class, cls2);
        f76373e = b.a(new w(), e10, cls2);
    }

    /* access modifiers changed from: private */
    public static t b(o oVar, C10180y yVar) {
        if (oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                n W10 = n.W(oVar.g(), C9533p.b());
                if (W10.U() == 0) {
                    return t.a().e(v.a().b(W10.T().size()).c(e(oVar.e())).a()).d(Eb.b.a(W10.T().E(), C10180y.b(yVar))).c(oVar.c()).a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (B unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
    }

    public static void c() {
        d(i.a());
    }

    public static void d(i iVar) {
        iVar.h(f76370b);
        iVar.g(f76371c);
        iVar.f(f76372d);
        iVar.e(f76373e);
    }

    private static v.c e(I i10) {
        int i11 = a.f76374a[i10.ordinal()];
        if (i11 == 1) {
            return v.c.f76365b;
        }
        if (i11 == 2 || i11 == 3) {
            return v.c.f76366c;
        }
        if (i11 == 4) {
            return v.c.f76367d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.d());
    }
}
