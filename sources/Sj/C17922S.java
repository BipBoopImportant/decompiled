package sJ;

import GI.C15732b;
import XI.q;
import XI.s;
import YH.C16877v;
import ZI.f;
import java.util.ArrayList;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import qJ.C17810X;
import qJ.C17828p;
import uJ.C18096U;

/* renamed from: sJ.S  reason: case insensitive filesystem */
public final class C17922S extends C15732b {

    /* renamed from: k  reason: collision with root package name */
    private final C17828p f147044k;

    /* renamed from: l  reason: collision with root package name */
    private final s f147045l;

    /* renamed from: m  reason: collision with root package name */
    private final C17924a f147046m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17922S(qJ.C17828p r12, XI.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            tJ.n r2 = r12.h()
            DI.m r3 = r12.e()
            EI.h$a r0 = EI.C15649h.f134231V
            EI.h r4 = r0.b()
            ZI.c r0 = r12.g()
            int r1 = r13.I()
            cJ.f r5 = qJ.C17799L.b(r0, r1)
            qJ.O r0 = qJ.C17802O.f146513a
            XI.s$c r1 = r13.O()
            java.lang.String r6 = "getVariance(...)"
            kotlin.jvm.internal.C17542s.i(r1, r6)
            uJ.Q0 r6 = r0.d(r1)
            boolean r7 = r13.J()
            DI.i0 r9 = DI.i0.f133841a
            DI.l0$a r10 = DI.l0.a.f133844a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f147044k = r12
            r11.f147045l = r13
            sJ.a r13 = new sJ.a
            tJ.n r12 = r12.h()
            sJ.Q r14 = new sJ.Q
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r11.f147046m = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sJ.C17922S.<init>(qJ.p, XI.s, int):void");
    }

    /* access modifiers changed from: private */
    public static final List N0(C17922S s10) {
        return C16877v.t1(s10.f147044k.c().d().b(s10.f147045l, s10.f147044k.g()));
    }

    /* access modifiers changed from: protected */
    public List<C18096U> L0() {
        List<q> s10 = f.s(this.f147045l, this.f147044k.j());
        if (s10.isEmpty()) {
            return C16877v.e(C17506e.m(this).z());
        }
        Iterable<q> iterable = s10;
        C17810X i10 = this.f147044k.i();
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (q u10 : iterable) {
            arrayList.add(i10.u(u10));
        }
        return arrayList;
    }

    /* renamed from: O0 */
    public C17924a getAnnotations() {
        return this.f147046m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public Void K0(C18096U u10) {
        C17542s.j(u10, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
