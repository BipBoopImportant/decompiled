package yJ;

import XH.t;
import kotlin.jvm.internal.C17542s;
import uJ.Q0;

public final class q {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f152757a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uJ.Q0[] r0 = uJ.Q0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uJ.Q0 r1 = uJ.Q0.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uJ.Q0 r1 = uJ.Q0.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uJ.Q0 r1 = uJ.Q0.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f152757a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yJ.q.a.<clinit>():void");
        }
    }

    public static final u a(Q0 q02) {
        C17542s.j(q02, "<this>");
        int i10 = a.f152757a[q02.ordinal()];
        if (i10 == 1) {
            return u.INV;
        }
        if (i10 == 2) {
            return u.IN;
        }
        if (i10 == 3) {
            return u.OUT;
        }
        throw new t();
    }
}
