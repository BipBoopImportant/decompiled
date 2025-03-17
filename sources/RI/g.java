package RI;

import DI.n0;
import XH.t;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18084H;
import uJ.C18085I;
import uJ.C18096U;
import uJ.D0;
import uJ.E0;
import uJ.G0;
import uJ.M0;
import uJ.Q0;

public final class g extends C18084H {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f138005a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                RI.c[] r0 = RI.C16379c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                RI.c r1 = RI.C16379c.FLEXIBLE_LOWER_BOUND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                RI.c r1 = RI.C16379c.FLEXIBLE_UPPER_BOUND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                RI.c r1 = RI.C16379c.INFLEXIBLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f138005a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: RI.g.a.<clinit>():void");
        }
    }

    public E0 a(n0 n0Var, C18085I i10, D0 d02, C18096U u10) {
        C17542s.j(n0Var, "parameter");
        C17542s.j(i10, "typeAttr");
        C17542s.j(d02, "typeParameterUpperBoundEraser");
        C17542s.j(u10, "erasedUpperBound");
        if (!(i10 instanceof C16377a)) {
            return super.a(n0Var, i10, d02, u10);
        }
        C16377a aVar = (C16377a) i10;
        if (!aVar.i()) {
            aVar = aVar.l(C16379c.INFLEXIBLE);
        }
        int i11 = a.f138005a[aVar.g().ordinal()];
        if (i11 == 1) {
            return new G0(Q0.INVARIANT, u10);
        }
        if (i11 != 2 && i11 != 3) {
            throw new t();
        } else if (!n0Var.o().b()) {
            return new G0(Q0.INVARIANT, C17506e.m(n0Var).I());
        } else {
            List<n0> parameters = u10.N0().getParameters();
            C17542s.i(parameters, "getParameters(...)");
            if (!parameters.isEmpty()) {
                return new G0(Q0.OUT_VARIANCE, u10);
            }
            E0 t10 = M0.t(n0Var, aVar);
            C17542s.g(t10);
            return t10;
        }
    }
}
