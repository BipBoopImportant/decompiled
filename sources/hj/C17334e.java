package hJ;

import DI.n0;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tJ.C17986f;
import tJ.C17994n;
import uJ.C18077A;
import uJ.C18091O;
import uJ.C18096U;
import uJ.C18103a0;
import uJ.E0;
import uJ.G0;
import uJ.H0;
import uJ.Q0;
import uJ.u0;

/* renamed from: hJ.e  reason: case insensitive filesystem */
public final class C17334e {

    /* renamed from: hJ.e$a */
    public static final class a extends C18077A {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f143426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H0 h02, boolean z10) {
            super(h02);
            this.f143426d = z10;
        }

        public boolean b() {
            return this.f143426d;
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [DI.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public uJ.E0 e(uJ.C18096U r4) {
            /*
                r3 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.C17542s.j(r4, r0)
                uJ.E0 r0 = super.e(r4)
                r1 = 0
                if (r0 == 0) goto L_0x001f
                uJ.y0 r4 = r4.N0()
                DI.h r4 = r4.e()
                boolean r2 = r4 instanceof DI.n0
                if (r2 == 0) goto L_0x001b
                r1 = r4
                DI.n0 r1 = (DI.n0) r1
            L_0x001b:
                uJ.E0 r1 = hJ.C17334e.c(r0, r1)
            L_0x001f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hJ.C17334e.a.e(uJ.U):uJ.E0");
        }
    }

    /* access modifiers changed from: private */
    public static final E0 c(E0 e02, n0 n0Var) {
        if (n0Var == null || e02.c() == Q0.INVARIANT) {
            return e02;
        }
        if (n0Var.o() != e02.c()) {
            return new G0(e(e02));
        }
        if (!e02.a()) {
            return new G0(e02.getType());
        }
        C17994n nVar = C17986f.f147352e;
        C17542s.i(nVar, "NO_LOCKS");
        return new G0(new C18103a0(nVar, new C17333d(e02)));
    }

    /* access modifiers changed from: private */
    public static final C18096U d(E0 e02) {
        C18096U type = e02.getType();
        C17542s.i(type, "getType(...)");
        return type;
    }

    public static final C18096U e(E0 e02) {
        C17542s.j(e02, "typeProjection");
        return new C17330a(e02, (C17331b) null, false, (u0) null, 14, (DefaultConstructorMarker) null);
    }

    public static final boolean f(C18096U u10) {
        C17542s.j(u10, "<this>");
        return u10.N0() instanceof C17331b;
    }

    public static final H0 g(H0 h02, boolean z10) {
        C17542s.j(h02, "<this>");
        if (!(h02 instanceof C18091O)) {
            return new a(h02, z10);
        }
        C18091O o10 = (C18091O) h02;
        n0[] j10 = o10.j();
        Iterable<v> s12 = C16870n.s1(o10.i(), o10.j());
        ArrayList arrayList = new ArrayList(C16877v.y(s12, 10));
        for (v vVar : s12) {
            arrayList.add(c((E0) vVar.c(), (n0) vVar.d()));
        }
        return new C18091O(j10, (E0[]) arrayList.toArray(new E0[0]), z10);
    }

    public static /* synthetic */ H0 h(H0 h02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(h02, z10);
    }
}
