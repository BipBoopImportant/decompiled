package qb;

import Cb.A;
import Cb.I;
import com.google.crypto.tink.shaded.protobuf.C9525h;

/* renamed from: qb.l  reason: case insensitive filesystem */
public final class C10167l {

    /* renamed from: a  reason: collision with root package name */
    private final A f75977a;

    /* renamed from: qb.l$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f75978a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f75979b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                qb.l$b[] r0 = qb.C10167l.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f75979b = r0
                r1 = 1
                qb.l$b r2 = qb.C10167l.b.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f75979b     // Catch:{ NoSuchFieldError -> 0x001d }
                qb.l$b r3 = qb.C10167l.b.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f75979b     // Catch:{ NoSuchFieldError -> 0x0028 }
                qb.l$b r4 = qb.C10167l.b.RAW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f75979b     // Catch:{ NoSuchFieldError -> 0x0033 }
                qb.l$b r5 = qb.C10167l.b.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                Cb.I[] r4 = Cb.I.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f75978a = r4
                Cb.I r5 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f75978a     // Catch:{ NoSuchFieldError -> 0x004e }
                Cb.I r4 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f75978a     // Catch:{ NoSuchFieldError -> 0x0058 }
                Cb.I r1 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f75978a     // Catch:{ NoSuchFieldError -> 0x0062 }
                Cb.I r1 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qb.C10167l.a.<clinit>():void");
        }
    }

    /* renamed from: qb.l$b */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private C10167l(A a10) {
        this.f75977a = a10;
    }

    public static C10167l a(String str, byte[] bArr, b bVar) {
        return new C10167l((A) A.Y().y(str).z(C9525h.m(bArr)).w(c(bVar)).g());
    }

    static I c(b bVar) {
        int i10 = a.f75979b[bVar.ordinal()];
        if (i10 == 1) {
            return I.TINK;
        }
        if (i10 == 2) {
            return I.LEGACY;
        }
        if (i10 == 3) {
            return I.RAW;
        }
        if (i10 == 4) {
            return I.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* access modifiers changed from: package-private */
    public A b() {
        return this.f75977a;
    }
}
