package fJ;

import AI.C15428i;
import AI.C15429j;
import AI.C15435p;
import CJ.C15519a;
import DI.C15534E;
import DI.C15535F;
import DI.C15538I;
import DI.C15543N;
import DI.C15544O;
import DI.C15551W;
import DI.C15553Y;
import DI.C15554a;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.C15562i;
import DI.C15565l;
import DI.C15566m;
import DI.C15568o;
import DI.C15569p;
import DI.C15573t;
import DI.C15574u;
import DI.C15576w;
import DI.C15579z;
import DI.Z;
import DI.a0;
import DI.b0;
import DI.c0;
import DI.d0;
import DI.m0;
import DI.n0;
import DI.r0;
import DI.u0;
import DI.v0;
import EI.C15642a;
import EI.C15644c;
import EI.C15646e;
import HJ.C15835a;
import HJ.C15854t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.C16877v;
import YH.g0;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import cJ.C17071h;
import fJ.n;
import gJ.C17278i;
import iJ.C17367a;
import iJ.C17368b;
import iJ.C17373g;
import iJ.C17386t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import org.slf4j.Marker;
import uJ.C18087K;
import uJ.C18095T;
import uJ.C18096U;
import uJ.C18100Y;
import uJ.C18102a;
import uJ.C18113f0;
import uJ.C18121j0;
import uJ.C18131o0;
import uJ.C18145z;
import uJ.E0;
import uJ.M0;
import uJ.P0;
import uJ.Q0;
import uJ.R0;
import uJ.y0;
import wJ.C18227i;
import wJ.C18228j;
import wJ.C18230l;
import zJ.C18755d;

public final class u extends n implements w {

    /* renamed from: m  reason: collision with root package name */
    private final z f143193m;

    /* renamed from: n  reason: collision with root package name */
    private final C16824o f143194n = C16825p.b(new o(this));

    private final class a implements C15568o<C16807N, StringBuilder> {

        /* renamed from: fJ.u$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3493a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f143196a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    fJ.E[] r0 = fJ.C17227E.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    fJ.E r1 = fJ.C17227E.PRETTY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    fJ.E r1 = fJ.C17227E.DEBUG     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    fJ.E r1 = fJ.C17227E.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f143196a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: fJ.u.a.C3493a.<clinit>():void");
            }
        }

        public a() {
        }

        private final void t(Z z10, StringBuilder sb2, String str) {
            int i10 = C3493a.f143196a[u.this.P0().ordinal()];
            if (i10 == 1) {
                u.this.w1(z10, sb2);
                sb2.append(str + " for ");
                u uVar = u.this;
                a0 W10 = z10.W();
                C17542s.i(W10, "getCorrespondingProperty(...)");
                uVar.h2(W10, sb2);
            } else if (i10 == 2) {
                p(z10, sb2);
            } else if (i10 != 3) {
                throw new t();
            }
        }

        public void A(u0 u0Var, StringBuilder sb2) {
            C17542s.j(u0Var, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.B2(u0Var, true, sb2, true);
        }

        public /* bridge */ /* synthetic */ Object a(b0 b0Var, Object obj) {
            v(b0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object b(C15579z zVar, Object obj) {
            p(zVar, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object c(C15565l lVar, Object obj) {
            o(lVar, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object d(d0 d0Var, Object obj) {
            x(d0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object e(C15544O o10, Object obj) {
            r(o10, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object f(C15551W w10, Object obj) {
            s(w10, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object g(m0 m0Var, Object obj) {
            y(m0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object h(n0 n0Var, Object obj) {
            z(n0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object i(u0 u0Var, Object obj) {
            A(u0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object j(c0 c0Var, Object obj) {
            w(c0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object k(a0 a0Var, Object obj) {
            u(a0Var, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object l(C15538I i10, Object obj) {
            q(i10, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object m(C15558e eVar, Object obj) {
            n(eVar, (StringBuilder) obj);
            return C16807N.f139792a;
        }

        public void n(C15558e eVar, StringBuilder sb2) {
            C17542s.j(eVar, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.C1(eVar, sb2);
        }

        public void o(C15565l lVar, StringBuilder sb2) {
            C17542s.j(lVar, "constructorDescriptor");
            C17542s.j(sb2, "builder");
            u.this.H1(lVar, sb2);
        }

        public void p(C15579z zVar, StringBuilder sb2) {
            C17542s.j(zVar, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.P1(zVar, sb2);
        }

        public void q(C15538I i10, StringBuilder sb2) {
            C17542s.j(i10, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.Z1(i10, sb2, true);
        }

        public void r(C15544O o10, StringBuilder sb2) {
            C17542s.j(o10, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.d2(o10, sb2);
        }

        public void s(C15551W w10, StringBuilder sb2) {
            C17542s.j(w10, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.f2(w10, sb2);
        }

        public void u(a0 a0Var, StringBuilder sb2) {
            C17542s.j(a0Var, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.h2(a0Var, sb2);
        }

        public void v(b0 b0Var, StringBuilder sb2) {
            C17542s.j(b0Var, "descriptor");
            C17542s.j(sb2, "builder");
            t(b0Var, sb2, "getter");
        }

        public void w(c0 c0Var, StringBuilder sb2) {
            C17542s.j(c0Var, "descriptor");
            C17542s.j(sb2, "builder");
            t(c0Var, sb2, "setter");
        }

        public void x(d0 d0Var, StringBuilder sb2) {
            C17542s.j(d0Var, "descriptor");
            C17542s.j(sb2, "builder");
            sb2.append(d0Var.getName());
        }

        public void y(m0 m0Var, StringBuilder sb2) {
            C17542s.j(m0Var, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.q2(m0Var, sb2);
        }

        public void z(n0 n0Var, StringBuilder sb2) {
            C17542s.j(n0Var, "descriptor");
            C17542s.j(sb2, "builder");
            u.this.w2(n0Var, sb2, true);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f143197a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f143198b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                fJ.F[] r0 = fJ.C17228F.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                fJ.F r2 = fJ.C17228F.PLAIN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                fJ.F r3 = fJ.C17228F.HTML     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f143197a = r0
                fJ.D[] r0 = fJ.C17226D.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fJ.D r3 = fJ.C17226D.ALL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                fJ.D r1 = fJ.C17226D.ONLY_NON_SYNTHESIZED     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                fJ.D r1 = fJ.C17226D.NONE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f143198b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fJ.u.b.<clinit>():void");
        }
    }

    public u(z zVar) {
        C17542s.j(zVar, "options");
        this.f143193m = zVar;
        zVar.p0();
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb2, C15642a aVar, C15646e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        uVar.z1(sb2, aVar, eVar);
    }

    static /* synthetic */ void A2(u uVar, v0 v0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(v0Var, sb2, z10);
    }

    private final void B1(C15562i iVar, StringBuilder sb2) {
        List<n0> t10 = iVar.t();
        C17542s.i(t10, "getDeclaredTypeParameters(...)");
        List<n0> parameters = iVar.k().getParameters();
        C17542s.i(parameters, "getParameters(...)");
        if (j1() && iVar.n() && parameters.size() > t10.size()) {
            sb2.append(" /*captured type parameters: ");
            x2(sb2, parameters.subList(t10.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B2(DI.u0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.S1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.j1()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r5 = 2
            r6 = 0
            r4 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            A1(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.s0()
            java.lang.String r1 = "crossinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r10.r0()
            java.lang.String r1 = "noinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r9.Y0()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            DI.a r0 = r10.b()
            boolean r3 = r0 instanceof DI.C15557d
            if (r3 == 0) goto L_0x0055
            DI.d r0 = (DI.C15557d) r0
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.d0()
            if (r0 != r2) goto L_0x0060
            r8 = r2
            goto L_0x0061
        L_0x0060:
            r8 = r1
        L_0x0061:
            if (r8 == 0) goto L_0x006c
            boolean r0 = r9.t0()
            java.lang.String r3 = "actual"
            r9.Y1(r12, r0, r3)
        L_0x006c:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.D2(r4, r5, r6, r7, r8)
            nI.l r11 = r9.z0()
            if (r11 == 0) goto L_0x008c
            boolean r11 = r9.i()
            if (r11 == 0) goto L_0x0085
            boolean r11 = r10.B0()
            goto L_0x0089
        L_0x0085:
            boolean r11 = kJ.C17506e.f(r10)
        L_0x0089:
            if (r11 == 0) goto L_0x008c
            r1 = r2
        L_0x008c:
            if (r1 == 0) goto L_0x00af
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            nI.l r13 = r9.z0()
            kotlin.jvm.internal.C17542s.g(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fJ.u.B2(DI.u0, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final u C0() {
        return (u) this.f143194n.getValue();
    }

    /* access modifiers changed from: private */
    public final void C1(C15558e eVar, StringBuilder sb2) {
        C15557d F10;
        boolean z10 = eVar.h() == C15559f.ENUM_ENTRY;
        if (!d1()) {
            List<d0> Z10 = eVar.Z();
            C17542s.i(Z10, "getContextReceivers(...)");
            J1(Z10, sb2);
            A1(this, sb2, eVar, (C15646e) null, 2, (Object) null);
            if (!z10) {
                C15574u visibility = eVar.getVisibility();
                C17542s.i(visibility, "getVisibility(...)");
                E2(visibility, sb2);
            }
            if (!(eVar.h() == C15559f.INTERFACE && eVar.u() == C15535F.ABSTRACT) && (!eVar.h().b() || eVar.u() != C15535F.FINAL)) {
                C15535F u10 = eVar.u();
                C17542s.i(u10, "getModality(...)");
                W1(u10, sb2, r1(eVar));
            }
            U1(eVar, sb2);
            Y1(sb2, I0().contains(v.INNER) && eVar.n(), "inner");
            Y1(sb2, I0().contains(v.DATA) && eVar.I0(), "data");
            Y1(sb2, I0().contains(v.INLINE) && eVar.isInline(), "inline");
            Y1(sb2, I0().contains(v.VALUE) && eVar.v(), "value");
            Y1(sb2, I0().contains(v.FUN) && eVar.g0(), "fun");
            D1(eVar, sb2);
        }
        if (!C17278i.x(eVar)) {
            if (!d1()) {
                m2(sb2);
            }
            Z1(eVar, sb2, true);
        } else {
            F1(eVar, sb2);
        }
        if (!z10) {
            List<n0> t10 = eVar.t();
            C17542s.i(t10, "getDeclaredTypeParameters(...)");
            y2(t10, sb2, false);
            B1(eVar, sb2);
            if (!eVar.h().b() && x0() && (F10 = eVar.F()) != null) {
                sb2.append(" ");
                A1(this, sb2, F10, (C15646e) null, 2, (Object) null);
                C15574u visibility2 = F10.getVisibility();
                C17542s.i(visibility2, "getVisibility(...)");
                E2(visibility2, sb2);
                sb2.append(S1("constructor"));
                List<u0> j10 = F10.j();
                C17542s.i(j10, "getValueParameters(...)");
                C2(j10, F10.i0(), sb2);
            }
            n2(eVar, sb2);
            F2(t10, sb2);
        }
    }

    private final void C2(Collection<? extends u0> collection, boolean z10, StringBuilder sb2) {
        boolean H22 = H2(z10);
        int size = collection.size();
        i1().a(size, sb2);
        int i10 = 0;
        for (u0 u0Var : collection) {
            i1().b(u0Var, i10, size, sb2);
            B2(u0Var, H22, sb2, false);
            i1().d(u0Var, i10, size, sb2);
            i10++;
        }
        i1().c(size, sb2);
    }

    private final void D1(C15558e eVar, StringBuilder sb2) {
        sb2.append(S1(n.f143173a.a(eVar)));
    }

    private final void D2(v0 v0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        C18096U type = v0Var.getType();
        C17542s.i(type, "getType(...)");
        C18096U u10 = null;
        u0 u0Var = v0Var instanceof u0 ? (u0) v0Var : null;
        if (u0Var != null) {
            u10 = u0Var.w0();
        }
        C18096U u11 = u10 == null ? type : u10;
        Y1(sb2, u10 != null, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(v0Var, sb2, z12);
        }
        if (z10) {
            Z1(v0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(S(u11));
        R1(v0Var, sb2);
        if (j1() && u10 != null) {
            sb2.append(" /*");
            sb2.append(S(type));
            sb2.append("*/");
        }
    }

    private final boolean E2(C15574u uVar, StringBuilder sb2) {
        if (!I0().contains(v.VISIBILITY)) {
            return false;
        }
        if (J0()) {
            uVar = uVar.f();
        }
        if (!X0() && C17542s.e(uVar, C15573t.f133860l)) {
            return false;
        }
        sb2.append(S1(uVar.c()));
        sb2.append(" ");
        return true;
    }

    private final void F1(C15566m mVar, StringBuilder sb2) {
        if (S0()) {
            if (d1()) {
                sb2.append("companion object");
            }
            m2(sb2);
            C15566m b10 = mVar.b();
            if (b10 != null) {
                sb2.append("of ");
                C17069f name = b10.getName();
                C17542s.i(name, "getName(...)");
                sb2.append(R(name, false));
            }
        }
        if (j1() || !C17542s.e(mVar.getName(), C17071h.f141265d)) {
            if (!d1()) {
                m2(sb2);
            }
            C17069f name2 = mVar.getName();
            C17542s.i(name2, "getName(...)");
            sb2.append(R(name2, true));
        }
    }

    private final void F2(List<? extends n0> list, StringBuilder sb2) {
        if (!o1()) {
            ArrayList arrayList = new ArrayList(0);
            for (n0 n0Var : list) {
                List<C18096U> upperBounds = n0Var.getUpperBounds();
                C17542s.i(upperBounds, "getUpperBounds(...)");
                for (C18096U u10 : C16877v.n0(upperBounds, 1)) {
                    StringBuilder sb3 = new StringBuilder();
                    C17069f name = n0Var.getName();
                    C17542s.i(name, "getName(...)");
                    sb3.append(R(name, false));
                    sb3.append(" : ");
                    C17542s.g(u10);
                    sb3.append(S(u10));
                    arrayList.add(sb3.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" ");
                sb2.append(S1("where"));
                sb2.append(" ");
                C16877v.E0(arrayList, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 124, (Object) null);
            }
        }
    }

    private final String G1(C17373g<?> gVar) {
        C17642l<C17373g<?>, String> P10 = this.f143193m.P();
        if (P10 != null) {
            return P10.invoke(gVar);
        }
        if (gVar instanceof C17368b) {
            ArrayList arrayList = new ArrayList();
            for (C17373g G12 : (Iterable) ((C17368b) gVar).b()) {
                String G13 = G1(G12);
                if (G13 != null) {
                    arrayList.add(G13);
                }
            }
            return C16877v.G0(arrayList, ", ", "{", "}", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
        } else if (gVar instanceof C17367a) {
            return C15854t.O0(n.O(this, (C15644c) ((C17367a) gVar).b(), (C15646e) null, 2, (Object) null), "@");
        } else {
            if (!(gVar instanceof C17386t)) {
                return gVar.toString();
            }
            C17386t.b bVar = (C17386t.b) ((C17386t) gVar).b();
            if (bVar instanceof C17386t.b.a) {
                return ((C17386t.b.a) bVar).a() + "::class";
            } else if (bVar instanceof C17386t.b.C3505b) {
                C17386t.b.C3505b bVar2 = (C17386t.b.C3505b) bVar;
                String a10 = bVar2.b().a().a();
                for (int i10 = 0; i10 < bVar2.a(); i10++) {
                    a10 = "kotlin.Array<" + a10 + '>';
                }
                return a10 + "::class";
            } else {
                throw new t();
            }
        }
    }

    private final boolean G2(C18096U u10) {
        if (C15428i.p(u10)) {
            Iterable<E0> L02 = u10.L0();
            if (!(L02 instanceof Collection) || !((Collection) L02).isEmpty()) {
                for (E0 a10 : L02) {
                    if (a10.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H1(DI.C15565l r18, java.lang.StringBuilder r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r17
            r1 = r19
            r2 = r18
            A1(r0, r1, r2, r3, r4, r5)
            fJ.z r0 = r6.f143193m
            boolean r0 = r0.X()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0026
            DI.e r0 = r18.e0()
            DI.F r0 = r0.u()
            DI.F r3 = DI.C15535F.SEALED
            if (r0 == r3) goto L_0x0037
        L_0x0026:
            DI.u r0 = r18.getVisibility()
            java.lang.String r3 = "getVisibility(...)"
            kotlin.jvm.internal.C17542s.i(r0, r3)
            boolean r0 = r6.E2(r0, r7)
            if (r0 == 0) goto L_0x0037
            r0 = r2
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            r17.T1(r18, r19)
            boolean r3 = r17.U0()
            if (r3 != 0) goto L_0x004c
            boolean r3 = r18.d0()
            if (r3 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = r1
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 == 0) goto L_0x0058
            java.lang.String r3 = "constructor"
            java.lang.String r3 = r6.S1(r3)
            r7.append(r3)
        L_0x0058:
            DI.i r3 = r18.b()
            java.lang.String r4 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            boolean r4 = r17.b1()
            java.lang.String r5 = "getTypeParameters(...)"
            if (r4 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = " "
            r7.append(r0)
        L_0x0070:
            r6.Z1(r3, r7, r2)
            java.util.List r0 = r18.getTypeParameters()
            kotlin.jvm.internal.C17542s.i(r0, r5)
            r6.y2(r0, r7, r1)
        L_0x007d:
            java.util.List r0 = r18.j()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r2 = r18.i0()
            r6.C2(r0, r2, r7)
            boolean r0 = r17.T0()
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r18.d0()
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r3 instanceof DI.C15558e
            if (r0 == 0) goto L_0x00ff
            DI.e r3 = (DI.C15558e) r3
            DI.d r0 = r3.F()
            if (r0 == 0) goto L_0x00ff
            java.util.List r0 = r0.j()
            kotlin.jvm.internal.C17542s.i(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            r2 = r1
            DI.u0 r2 = (DI.u0) r2
            boolean r3 = r2.B0()
            if (r3 != 0) goto L_0x00b9
            uJ.U r2 = r2.w0()
            if (r2 != 0) goto L_0x00b9
            r8.add(r1)
            goto L_0x00b9
        L_0x00d6:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = " : "
            r7.append(r0)
            java.lang.String r0 = "this"
            java.lang.String r0 = r6.S1(r0)
            r7.append(r0)
            fJ.r r14 = fJ.r.f143190a
            r15 = 24
            r16 = 0
            java.lang.String r9 = ", "
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            r12 = 0
            r13 = 0
            java.lang.String r0 = YH.C16877v.G0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.append(r0)
        L_0x00ff:
            boolean r0 = r17.b1()
            if (r0 == 0) goto L_0x010f
            java.util.List r0 = r18.getTypeParameters()
            kotlin.jvm.internal.C17542s.i(r0, r5)
            r6.F2(r0, r7)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fJ.u.H1(DI.l, java.lang.StringBuilder):void");
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f143198b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new t();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final CharSequence I1(u0 u0Var) {
        return "";
    }

    private final void J1(List<? extends d0> list, StringBuilder sb2) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            int i10 = 0;
            for (d0 d0Var : list) {
                int i11 = i10 + 1;
                z1(sb2, d0Var, C15646e.RECEIVER);
                C18096U type = d0Var.getType();
                C17542s.i(type, "getType(...)");
                sb2.append(N1(type));
                if (i10 == C16877v.p(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i10 = i11;
            }
        }
    }

    private final void K1(StringBuilder sb2, C18096U u10) {
        A1(this, sb2, u10, (C15646e) null, 2, (Object) null);
        C18113f0 f0Var = null;
        C18145z zVar = u10 instanceof C18145z ? (C18145z) u10 : null;
        if (zVar != null) {
            f0Var = zVar.Z0();
        }
        if (C18100Y.a(u10)) {
            if (!C18755d.z(u10) || !O0()) {
                if (!(u10 instanceof C18227i) || H0()) {
                    sb2.append(u10.N0().toString());
                } else {
                    sb2.append(((C18227i) u10).W0());
                }
                sb2.append(r2(u10.L0()));
            } else {
                sb2.append(L1(C18230l.f149170a.p(u10)));
            }
        } else if (u10 instanceof C18131o0) {
            sb2.append(((C18131o0) u10).W0().toString());
        } else if (f0Var instanceof C18131o0) {
            sb2.append(((C18131o0) f0Var).W0().toString());
        } else {
            v2(this, sb2, u10, (y0) null, 2, (Object) null);
            C16807N n10 = C16807N.f139792a;
        }
        if (u10.O0()) {
            sb2.append("?");
        }
        if (C18121j0.c(u10)) {
            sb2.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f143197a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return "<font color=red><b>" + str + "</b></font>";
        }
        throw new t();
    }

    private final void M1(StringBuilder sb2, C18102a aVar) {
        C17228F e12 = e1();
        C17228F f10 = C17228F.HTML;
        if (e12 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        b2(sb2, aVar.I());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    private final String N1(C18096U u10) {
        String S10 = S(u10);
        if ((!G2(u10) || M0.l(u10)) && !(u10 instanceof C18145z)) {
            return S10;
        }
        return '(' + S10 + ')';
    }

    private final String O1(List<C17069f> list) {
        return q0(C17229G.c(list));
    }

    /* access modifiers changed from: private */
    public final void P1(C15579z zVar, StringBuilder sb2) {
        if (!d1()) {
            if (!c1()) {
                List<d0> y02 = zVar.y0();
                C17542s.i(y02, "getContextReceiverParameters(...)");
                J1(y02, sb2);
                A1(this, sb2, zVar, (C15646e) null, 2, (Object) null);
                C15574u visibility = zVar.getVisibility();
                C17542s.i(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                X1(zVar, sb2);
                if (D0()) {
                    U1(zVar, sb2);
                }
                c2(zVar, sb2);
                if (D0()) {
                    x1(zVar, sb2);
                } else {
                    p2(zVar, sb2);
                }
                T1(zVar, sb2);
                if (j1()) {
                    if (zVar.D0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (zVar.G0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(S1("fun"));
            sb2.append(" ");
            List<n0> typeParameters = zVar.getTypeParameters();
            C17542s.i(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(zVar, sb2);
        }
        Z1(zVar, sb2, true);
        List<u0> j10 = zVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        C2(j10, zVar.i0(), sb2);
        k2(zVar, sb2);
        C18096U returnType = zVar.getReturnType();
        if (!m1() && (h1() || returnType == null || !C15429j.D0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : S(returnType));
        }
        List<n0> typeParameters2 = zVar.getTypeParameters();
        C17542s.i(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void Q1(StringBuilder sb2, C18096U u10) {
        C17069f fVar;
        int length = sb2.length();
        A1(C0(), sb2, u10, (C15646e) null, 2, (Object) null);
        boolean z10 = sb2.length() != length;
        C18096U k10 = C15428i.k(u10);
        List<C18096U> e10 = C15428i.e(u10);
        boolean r10 = C15428i.r(u10);
        boolean O02 = u10.O0();
        boolean z11 = O02 || (z10 && k10 != null);
        if (z11) {
            if (r10) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    C15835a.c(C15854t.H1(sb2));
                    if (sb2.charAt(C15854t.m0(sb2) - 1) != ')') {
                        sb2.insert(C15854t.m0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!e10.isEmpty()) {
            sb2.append("context(");
            for (C18096U a22 : e10.subList(0, C16877v.p(e10))) {
                a2(sb2, a22);
                sb2.append(", ");
            }
            a2(sb2, (C18096U) C16877v.I0(e10));
            sb2.append(") ");
        }
        Y1(sb2, r10, "suspend");
        if (k10 != null) {
            boolean z12 = (G2(k10) && !k10.O0()) || q1(k10) || (k10 instanceof C18145z);
            if (z12) {
                sb2.append("(");
            }
            a2(sb2, k10);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!C15428i.n(u10) || u10.L0().size() > 1) {
            int i10 = 0;
            for (E0 e02 : C15428i.m(u10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (N0()) {
                    C18096U type = e02.getType();
                    C17542s.i(type, "getType(...)");
                    fVar = C15428i.d(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(R(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(T(e02));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(p0());
        sb2.append(" ");
        a2(sb2, C15428i.l(u10));
        if (z11) {
            sb2.append(")");
        }
        if (O02) {
            sb2.append("?");
        }
    }

    private final void R1(v0 v0Var, StringBuilder sb2) {
        C17373g<?> q02;
        String G12;
        if (G0() && (q02 = v0Var.q0()) != null && (G12 = G1(q02)) != null) {
            sb2.append(" = ");
            sb2.append(q0(G12));
        }
    }

    private final String S1(String str) {
        int i10 = b.f143197a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new t();
        } else if (w0()) {
            return str;
        } else {
            return "<b>" + str + "</b>";
        }
    }

    private final void T1(C15555b bVar, StringBuilder sb2) {
        if (I0().contains(v.MEMBER_KIND) && j1() && bVar.h() != C15555b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(C15519a.f(bVar.h().name()));
            sb2.append("*/ ");
        }
    }

    private final void U1(C15534E e10, StringBuilder sb2) {
        Y1(sb2, e10.isExternal(), "external");
        boolean z10 = false;
        Y1(sb2, I0().contains(v.EXPECT) && e10.m0(), "expect");
        if (I0().contains(v.ACTUAL) && e10.Y()) {
            z10 = true;
        }
        Y1(sb2, z10, "actual");
    }

    private final void W1(C15535F f10, StringBuilder sb2, C15535F f11) {
        if (W0() || f10 != f11) {
            Y1(sb2, I0().contains(v.MODALITY), C15519a.f(f10.name()));
        }
    }

    private final void X1(C15555b bVar, StringBuilder sb2) {
        if (C17278i.J(bVar) && bVar.u() == C15535F.FINAL) {
            return;
        }
        if (L0() != C17225C.RENDER_OVERRIDE || bVar.u() != C15535F.OPEN || !u1(bVar)) {
            C15535F u10 = bVar.u();
            C17542s.i(u10, "getModality(...)");
            W1(u10, sb2, r1(bVar));
        }
    }

    private final void Y1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(S1(str));
            sb2.append(" ");
        }
    }

    /* access modifiers changed from: private */
    public final void Z1(C15566m mVar, StringBuilder sb2, boolean z10) {
        C17069f name = mVar.getName();
        C17542s.i(name, "getName(...)");
        sb2.append(R(name, z10));
    }

    private final void a2(StringBuilder sb2, C18096U u10) {
        P0 Q02 = u10.Q0();
        C18102a aVar = Q02 instanceof C18102a ? (C18102a) Q02 : null;
        if (aVar == null) {
            b2(sb2, u10);
        } else if (Z0()) {
            b2(sb2, aVar.I());
            if (R0()) {
                v1(sb2, aVar);
            }
        } else {
            b2(sb2, aVar.Z0());
            if (a1()) {
                M1(sb2, aVar);
            }
        }
    }

    private final void b2(StringBuilder sb2, C18096U u10) {
        if (!(u10 instanceof R0) || !i() || ((R0) u10).S0()) {
            P0 Q02 = u10.Q0();
            if (Q02 instanceof C18087K) {
                sb2.append(((C18087K) Q02).X0(this, this));
            } else if (Q02 instanceof C18113f0) {
                l2(sb2, (C18113f0) Q02);
            } else {
                throw new t();
            }
        } else {
            sb2.append("<Not computed yet>");
        }
    }

    private final void c2(C15555b bVar, StringBuilder sb2) {
        if (I0().contains(v.OVERRIDE) && u1(bVar) && L0() != C17225C.RENDER_OPEN) {
            Y1(sb2, true, "override");
            if (j1()) {
                sb2.append("/*");
                sb2.append(bVar.e().size());
                sb2.append("*/ ");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void d2(C15544O o10, StringBuilder sb2) {
        e2(o10.f(), "package-fragment", sb2);
        if (i()) {
            sb2.append(" in ");
            Z1(o10.b(), sb2, false);
        }
    }

    private final void e2(C17066c cVar, String str, StringBuilder sb2) {
        sb2.append(S1(str));
        String Q10 = Q(cVar.i());
        if (Q10.length() > 0) {
            sb2.append(" ");
            sb2.append(Q10);
        }
    }

    /* access modifiers changed from: private */
    public final void f2(C15551W w10, StringBuilder sb2) {
        e2(w10.f(), "package", sb2);
        if (i()) {
            sb2.append(" in context of ");
            Z1(w10.C0(), sb2, false);
        }
    }

    private final void g2(StringBuilder sb2, C15553Y y10) {
        C15553Y c10 = y10.c();
        if (c10 != null) {
            g2(sb2, c10);
            sb2.append('.');
            C17069f name = y10.b().getName();
            C17542s.i(name, "getName(...)");
            sb2.append(R(name, false));
        } else {
            y0 k10 = y10.b().k();
            C17542s.i(k10, "getTypeConstructor(...)");
            sb2.append(s2(k10));
        }
        sb2.append(r2(y10.a()));
    }

    /* access modifiers changed from: private */
    public final void h2(a0 a0Var, StringBuilder sb2) {
        if (!d1()) {
            if (!c1()) {
                List<d0> y02 = a0Var.y0();
                C17542s.i(y02, "getContextReceiverParameters(...)");
                J1(y02, sb2);
                i2(a0Var, sb2);
                C15574u visibility = a0Var.getVisibility();
                C17542s.i(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                boolean z10 = false;
                Y1(sb2, I0().contains(v.CONST) && a0Var.c0(), "const");
                U1(a0Var, sb2);
                X1(a0Var, sb2);
                c2(a0Var, sb2);
                if (I0().contains(v.LATEINIT) && a0Var.z0()) {
                    z10 = true;
                }
                Y1(sb2, z10, "lateinit");
                T1(a0Var, sb2);
            }
            A2(this, a0Var, sb2, false, 4, (Object) null);
            List<n0> typeParameters = a0Var.getTypeParameters();
            C17542s.i(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(a0Var, sb2);
        }
        Z1(a0Var, sb2, true);
        sb2.append(": ");
        C18096U type = a0Var.getType();
        C17542s.i(type, "getType(...)");
        sb2.append(S(type));
        k2(a0Var, sb2);
        R1(a0Var, sb2);
        List<n0> typeParameters2 = a0Var.getTypeParameters();
        C17542s.i(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void i2(a0 a0Var, StringBuilder sb2) {
        if (I0().contains(v.ANNOTATIONS)) {
            A1(this, sb2, a0Var, (C15646e) null, 2, (Object) null);
            C15576w x02 = a0Var.x0();
            if (x02 != null) {
                z1(sb2, x02, C15646e.FIELD);
            }
            C15576w P10 = a0Var.P();
            if (P10 != null) {
                z1(sb2, P10, C15646e.PROPERTY_DELEGATE_FIELD);
            }
            if (P0() == C17227E.NONE) {
                b0 d10 = a0Var.d();
                if (d10 != null) {
                    z1(sb2, d10, C15646e.PROPERTY_GETTER);
                }
                c0 g10 = a0Var.g();
                if (g10 != null) {
                    z1(sb2, g10, C15646e.PROPERTY_SETTER);
                    List<u0> j10 = g10.j();
                    C17542s.i(j10, "getValueParameters(...)");
                    u0 u0Var = (u0) C16877v.b1(j10);
                    C17542s.g(u0Var);
                    z1(sb2, u0Var, C15646e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void j2(C15554a aVar, StringBuilder sb2) {
        d0 O10 = aVar.O();
        if (O10 != null) {
            z1(sb2, O10, C15646e.RECEIVER);
            C18096U type = O10.getType();
            C17542s.i(type, "getType(...)");
            sb2.append(N1(type));
            sb2.append(".");
        }
    }

    private final void k2(C15554a aVar, StringBuilder sb2) {
        d0 O10;
        if (Q0() && (O10 = aVar.O()) != null) {
            sb2.append(" on ");
            C18096U type = O10.getType();
            C17542s.i(type, "getType(...)");
            sb2.append(S(type));
        }
    }

    private final void l2(StringBuilder sb2, C18113f0 f0Var) {
        if (C17542s.e(f0Var, M0.f147834b) || M0.k(f0Var)) {
            sb2.append("???");
        } else if (C18230l.o(f0Var)) {
            if (g1()) {
                y0 N02 = f0Var.N0();
                C17542s.h(N02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(L1(((C18228j) N02).h(0)));
                return;
            }
            sb2.append("???");
        } else if (C18100Y.a(f0Var)) {
            K1(sb2, f0Var);
        } else if (G2(f0Var)) {
            Q1(sb2, f0Var);
        } else {
            K1(sb2, f0Var);
        }
    }

    private final void m0(StringBuilder sb2, C15566m mVar) {
        C15566m b10;
        String name;
        if (!(mVar instanceof C15544O) && !(mVar instanceof C15551W) && (b10 = mVar.b()) != null && !(b10 instanceof C15538I)) {
            sb2.append(" ");
            sb2.append(V1("defined in"));
            sb2.append(" ");
            C17067d m10 = C17278i.m(b10);
            C17542s.i(m10, "getFqName(...)");
            sb2.append(m10.e() ? "root package" : Q(m10));
            if (l1() && (b10 instanceof C15544O) && (mVar instanceof C15569p) && (name = ((C15569p) mVar).i().b().getName()) != null) {
                sb2.append(" ");
                sb2.append(V1("in file"));
                sb2.append(" ");
                sb2.append(name);
            }
        }
    }

    private final void m2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void n0(StringBuilder sb2, List<? extends E0> list) {
        C16877v.E0(list, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new q(this), 60, (Object) null);
    }

    private final void n2(C15558e eVar, StringBuilder sb2) {
        if (!n1() && !C15429j.o0(eVar.r())) {
            Collection<C18096U> a10 = eVar.k().a();
            C17542s.i(a10, "getSupertypes(...)");
            if (a10.isEmpty()) {
                return;
            }
            if (a10.size() != 1 || !C15429j.c0(a10.iterator().next())) {
                m2(sb2);
                sb2.append(": ");
                C16877v.E0(a10, sb2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new s(this), 60, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence o0(u uVar, E0 e02) {
        C17542s.j(e02, "it");
        if (e02.a()) {
            return Marker.ANY_MARKER;
        }
        C18096U type = e02.getType();
        C17542s.i(type, "getType(...)");
        String S10 = uVar.S(type);
        if (e02.c() == Q0.INVARIANT) {
            return S10;
        }
        return e02.c() + ' ' + S10;
    }

    /* access modifiers changed from: private */
    public static final CharSequence o2(u uVar, C18096U u10) {
        C17542s.g(u10);
        return uVar.S(u10);
    }

    private final String p0() {
        int i10 = b.f143197a[e1().ordinal()];
        if (i10 == 1) {
            return q0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new t();
    }

    private final String p1() {
        return q0(">");
    }

    private final void p2(C15579z zVar, StringBuilder sb2) {
        Y1(sb2, zVar.isSuspend(), "suspend");
    }

    private final String q0(String str) {
        return e1().b(str);
    }

    private final boolean q1(C18096U u10) {
        return C15428i.r(u10) || !u10.getAnnotations().isEmpty();
    }

    /* access modifiers changed from: private */
    public final void q2(m0 m0Var, StringBuilder sb2) {
        A1(this, sb2, m0Var, (C15646e) null, 2, (Object) null);
        C15574u visibility = m0Var.getVisibility();
        C17542s.i(visibility, "getVisibility(...)");
        E2(visibility, sb2);
        U1(m0Var, sb2);
        sb2.append(S1("typealias"));
        sb2.append(" ");
        Z1(m0Var, sb2, true);
        List<n0> t10 = m0Var.t();
        C17542s.i(t10, "getDeclaredTypeParameters(...)");
        y2(t10, sb2, false);
        B1(m0Var, sb2);
        sb2.append(" = ");
        sb2.append(S(m0Var.u0()));
    }

    /* access modifiers changed from: private */
    public static final u r0(u uVar) {
        n U10 = uVar.U(t.f143192a);
        C17542s.h(U10, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) U10;
    }

    private final C15535F r1(C15534E e10) {
        if (e10 instanceof C15558e) {
            return ((C15558e) e10).h() == C15559f.INTERFACE ? C15535F.ABSTRACT : C15535F.FINAL;
        }
        C15566m b10 = e10.b();
        C15558e eVar = b10 instanceof C15558e ? (C15558e) b10 : null;
        if (eVar == null) {
            return C15535F.FINAL;
        }
        if (!(e10 instanceof C15555b)) {
            return C15535F.FINAL;
        }
        C15555b bVar = (C15555b) e10;
        Collection<? extends C15555b> e11 = bVar.e();
        C17542s.i(e11, "getOverriddenDescriptors(...)");
        if (!e11.isEmpty() && eVar.u() != C15535F.FINAL) {
            return C15535F.OPEN;
        }
        if (eVar.h() != C15559f.INTERFACE || C17542s.e(bVar.getVisibility(), C15573t.f133849a)) {
            return C15535F.FINAL;
        }
        C15535F u10 = bVar.u();
        C15535F f10 = C15535F.ABSTRACT;
        return u10 == f10 ? f10 : C15535F.OPEN;
    }

    /* access modifiers changed from: private */
    public static final C16807N s0(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.k(g0.k(wVar.h(), C16877v.q(C15435p.a.f133053C, C15435p.a.f133055D)));
        return C16807N.f139792a;
    }

    private final boolean s1(C15644c cVar) {
        return C17542s.e(cVar.f(), C15435p.a.f133057E);
    }

    private final String t1() {
        return q0("<");
    }

    /* access modifiers changed from: private */
    public static final Object t2(C18096U u10) {
        C17542s.j(u10, "it");
        return u10 instanceof C18131o0 ? ((C18131o0) u10).W0() : u10;
    }

    private final boolean u1(C15555b bVar) {
        return !bVar.e().isEmpty();
    }

    private final void u2(StringBuilder sb2, C18096U u10, y0 y0Var) {
        C15553Y d10 = r0.d(u10);
        if (d10 == null) {
            sb2.append(s2(y0Var));
            sb2.append(r2(u10.L0()));
            return;
        }
        g2(sb2, d10);
    }

    private final void v1(StringBuilder sb2, C18102a aVar) {
        C17228F e12 = e1();
        C17228F f10 = C17228F.HTML;
        if (e12 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        b2(sb2, aVar.Z0());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb2, C18096U u10, y0 y0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            y0Var = u10.N0();
        }
        uVar.u2(sb2, u10, y0Var);
    }

    /* access modifiers changed from: private */
    public final void w1(Z z10, StringBuilder sb2) {
        U1(z10, sb2);
    }

    /* access modifiers changed from: private */
    public final void w2(n0 n0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(t1());
        }
        if (j1()) {
            sb2.append("/*");
            sb2.append(n0Var.getIndex());
            sb2.append("*/ ");
        }
        Y1(sb2, n0Var.A(), "reified");
        String j10 = n0Var.o().j();
        boolean z11 = true;
        Y1(sb2, j10.length() > 0, j10);
        A1(this, sb2, n0Var, (C15646e) null, 2, (Object) null);
        Z1(n0Var, sb2, z10);
        int size = n0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            C18096U next = n0Var.getUpperBounds().iterator().next();
            if (!C15429j.k0(next)) {
                sb2.append(" : ");
                C17542s.g(next);
                sb2.append(S(next));
            }
        } else if (z10) {
            for (C18096U next2 : n0Var.getUpperBounds()) {
                if (!C15429j.k0(next2)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    C17542s.g(next2);
                    sb2.append(S(next2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(p1());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (u0() != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (u0() != false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x1(DI.C15579z r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "getOverriddenDescriptors(...)"
            if (r0 == 0) goto L_0x003b
            java.util.Collection r0 = r6.e()
            kotlin.jvm.internal.C17542s.i(r0, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r0.next()
            DI.z r4 = (DI.C15579z) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L_0x0021
            boolean r0 = r5.u0()
            if (r0 == 0) goto L_0x003b
        L_0x0039:
            r0 = r2
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L_0x0072
            java.util.Collection r4 = r6.e()
            kotlin.jvm.internal.C17542s.i(r4, r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0055
            goto L_0x0071
        L_0x0055:
            java.util.Iterator r3 = r4.iterator()
        L_0x0059:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r3.next()
            DI.z r4 = (DI.C15579z) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L_0x0059
            boolean r3 = r5.u0()
            if (r3 == 0) goto L_0x0072
        L_0x0071:
            r1 = r2
        L_0x0072:
            boolean r2 = r6.E()
            java.lang.String r3 = "tailrec"
            r5.Y1(r7, r2, r3)
            r5.p2(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r2 = "inline"
            r5.Y1(r7, r6, r2)
            java.lang.String r6 = "infix"
            r5.Y1(r7, r1, r6)
            java.lang.String r6 = "operator"
            r5.Y1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fJ.u.x1(DI.z, java.lang.StringBuilder):void");
    }

    private final void x2(StringBuilder sb2, List<? extends n0> list) {
        Iterator<? extends n0> it = list.iterator();
        while (it.hasNext()) {
            w2((n0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List<String> y1(C15644c cVar) {
        C15557d F10;
        List<u0> j10;
        Map<C17069f, C17373g<?>> a10 = cVar.a();
        List list = null;
        C15558e l10 = V0() ? C17506e.l(cVar) : null;
        if (!(l10 == null || (F10 = l10.F()) == null || (j10 = F10.j()) == null)) {
            ArrayList<u0> arrayList = new ArrayList<>();
            for (Object next : j10) {
                if (((u0) next).B0()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
            for (u0 name : arrayList) {
                arrayList2.add(name.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = C16877v.n();
        }
        ArrayList<C17069f> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            if (!a10.containsKey((C17069f) next2)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList3, 10));
        for (C17069f b10 : arrayList3) {
            arrayList4.add(b10.b() + " = ...");
        }
        Iterable<Map.Entry> entrySet = a10.entrySet();
        ArrayList arrayList5 = new ArrayList(C16877v.y(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            C17069f fVar = (C17069f) entry.getKey();
            C17373g gVar = (C17373g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            sb2.append(!list.contains(fVar) ? G1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        return C16877v.f1(C16877v.V0(arrayList4, arrayList5));
    }

    private final void y2(List<? extends n0> list, StringBuilder sb2, boolean z10) {
        if (!o1() && !list.isEmpty()) {
            sb2.append(t1());
            x2(sb2, list);
            sb2.append(p1());
            if (z10) {
                sb2.append(" ");
            }
        }
    }

    private final void z1(StringBuilder sb2, C15642a aVar, C15646e eVar) {
        if (I0().contains(v.ANNOTATIONS)) {
            Set<C17066c> h10 = aVar instanceof C18096U ? h() : B0();
            C17642l<C15644c, Boolean> v02 = v0();
            for (C15644c cVar : aVar.getAnnotations()) {
                if (!C16877v.l0(h10, cVar.f()) && !s1(cVar)) {
                    if (v02 == null || v02.invoke(cVar).booleanValue()) {
                        sb2.append(N(cVar, eVar));
                        if (A0()) {
                            sb2.append(10);
                        } else {
                            sb2.append(" ");
                        }
                    }
                }
            }
        }
    }

    private final void z2(v0 v0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(v0Var instanceof u0)) {
            sb2.append(S1(v0Var.N() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public boolean A0() {
        return this.f143193m.B();
    }

    public Set<C17066c> B0() {
        return this.f143193m.C();
    }

    public boolean D0() {
        return this.f143193m.D();
    }

    public boolean E0() {
        return this.f143193m.E();
    }

    public String E1(C15561h hVar) {
        C17542s.j(hVar, "klass");
        return C18230l.m(hVar) ? hVar.k().toString() : y0().a(hVar, this);
    }

    public boolean F0() {
        return this.f143193m.F();
    }

    public boolean G0() {
        return this.f143193m.G();
    }

    public boolean H0() {
        return this.f143193m.H();
    }

    public Set<v> I0() {
        return this.f143193m.I();
    }

    public boolean J0() {
        return this.f143193m.J();
    }

    public final z K0() {
        return this.f143193m;
    }

    public C17225C L0() {
        return this.f143193m.K();
    }

    public String M(C15566m mVar) {
        C17542s.j(mVar, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        mVar.a0(new a(), sb2);
        if (k1()) {
            m0(sb2, mVar);
        }
        return sb2.toString();
    }

    public C17226D M0() {
        return this.f143193m.L();
    }

    public String N(C15644c cVar, C15646e eVar) {
        C17542s.j(cVar, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.b() + ':');
        }
        C18096U type = cVar.getType();
        sb2.append(S(type));
        if (E0()) {
            List<String> y12 = y1(cVar);
            if (F0() || !y12.isEmpty()) {
                C16877v.E0(y12, sb2, ", ", "(", ")", 0, (CharSequence) null, (C17642l) null, 112, (Object) null);
            }
        }
        if (j1() && (C18100Y.a(type) || (type.N0().e() instanceof C15543N.b))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public boolean N0() {
        return this.f143193m.M();
    }

    public boolean O0() {
        return this.f143193m.N();
    }

    public String P(String str, String str2, C15429j jVar) {
        C17542s.j(str, "lowerRendered");
        C17542s.j(str2, "upperRendered");
        C17542s.j(jVar, "builtIns");
        if (!C17229G.f(str, str2)) {
            C17231b y02 = y0();
            C15558e x10 = jVar.x();
            C17542s.i(x10, "getCollection(...)");
            String t12 = C15854t.t1(y02.a(x10, this), "Collection", (String) null, 2, (Object) null);
            String d10 = C17229G.d(str, t12 + "Mutable", str2, t12, t12 + '(' + "Mutable" + ')');
            if (d10 != null) {
                return d10;
            }
            String d11 = C17229G.d(str, t12 + "MutableMap.MutableEntry", str2, t12 + "Map.Entry", t12 + "(Mutable)Map.(Mutable)Entry");
            if (d11 != null) {
                return d11;
            }
            C17231b y03 = y0();
            C15558e j10 = jVar.j();
            C17542s.i(j10, "getArray(...)");
            String t13 = C15854t.t1(y03.a(j10, this), "Array", (String) null, 2, (Object) null);
            String d12 = C17229G.d(str, t13 + q0("Array<"), str2, t13 + q0("Array<out "), t13 + q0("Array<(out) "));
            if (d12 != null) {
                return d12;
            }
            return '(' + str + ".." + str2 + ')';
        } else if (C15854t.W(str2, "(", false, 2, (Object) null)) {
            return '(' + str + ")!";
        } else {
            return str + '!';
        }
    }

    public C17227E P0() {
        return this.f143193m.O();
    }

    public String Q(C17067d dVar) {
        C17542s.j(dVar, "fqName");
        return O1(dVar.h());
    }

    public boolean Q0() {
        return this.f143193m.Q();
    }

    public String R(C17069f fVar, boolean z10) {
        C17542s.j(fVar, "name");
        String q02 = q0(C17229G.b(fVar));
        if (!w0() || e1() != C17228F.HTML || !z10) {
            return q02;
        }
        return "<b>" + q02 + "</b>";
    }

    public boolean R0() {
        return this.f143193m.R();
    }

    public String S(C18096U u10) {
        C17542s.j(u10, "type");
        StringBuilder sb2 = new StringBuilder();
        a2(sb2, f1().invoke(u10));
        return sb2.toString();
    }

    public boolean S0() {
        return this.f143193m.S();
    }

    public String T(E0 e02) {
        C17542s.j(e02, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        n0(sb2, C16877v.e(e02));
        return sb2.toString();
    }

    public boolean T0() {
        return this.f143193m.T();
    }

    public boolean U0() {
        return this.f143193m.U();
    }

    public boolean V0() {
        return this.f143193m.V();
    }

    public String V1(String str) {
        C17542s.j(str, "message");
        int i10 = b.f143197a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return "<i>" + str + "</i>";
        }
        throw new t();
    }

    public boolean W0() {
        return this.f143193m.W();
    }

    public boolean X0() {
        return this.f143193m.X();
    }

    public boolean Y0() {
        return this.f143193m.Y();
    }

    public boolean Z0() {
        return this.f143193m.Z();
    }

    public void a(C17228F f10) {
        C17542s.j(f10, "<set-?>");
        this.f143193m.a(f10);
    }

    public boolean a1() {
        return this.f143193m.a0();
    }

    public void b(boolean z10) {
        this.f143193m.b(z10);
    }

    public boolean b1() {
        return this.f143193m.b0();
    }

    public void c(boolean z10) {
        this.f143193m.c(z10);
    }

    public boolean c1() {
        return this.f143193m.c0();
    }

    public boolean d() {
        return this.f143193m.d();
    }

    public boolean d1() {
        return this.f143193m.d0();
    }

    public void e(boolean z10) {
        this.f143193m.e(z10);
    }

    public C17228F e1() {
        return this.f143193m.e0();
    }

    public void f(boolean z10) {
        this.f143193m.f(z10);
    }

    public C17642l<C18096U, C18096U> f1() {
        return this.f143193m.f0();
    }

    public void g(C17226D d10) {
        C17542s.j(d10, "<set-?>");
        this.f143193m.g(d10);
    }

    public boolean g1() {
        return this.f143193m.g0();
    }

    public Set<C17066c> h() {
        return this.f143193m.h();
    }

    public boolean h1() {
        return this.f143193m.h0();
    }

    public boolean i() {
        return this.f143193m.i();
    }

    public n.b i1() {
        return this.f143193m.i0();
    }

    public C17230a j() {
        return this.f143193m.j();
    }

    public boolean j1() {
        return this.f143193m.j0();
    }

    public void k(Set<C17066c> set) {
        C17542s.j(set, "<set-?>");
        this.f143193m.k(set);
    }

    public boolean k1() {
        return this.f143193m.k0();
    }

    public void l(Set<? extends v> set) {
        C17542s.j(set, "<set-?>");
        this.f143193m.l(set);
    }

    public boolean l1() {
        return this.f143193m.l0();
    }

    public void m(boolean z10) {
        this.f143193m.m(z10);
    }

    public boolean m1() {
        return this.f143193m.m0();
    }

    public void n(boolean z10) {
        this.f143193m.n(z10);
    }

    public boolean n1() {
        return this.f143193m.n0();
    }

    public void o(C17231b bVar) {
        C17542s.j(bVar, "<set-?>");
        this.f143193m.o(bVar);
    }

    public boolean o1() {
        return this.f143193m.o0();
    }

    public void p(boolean z10) {
        this.f143193m.p(z10);
    }

    public String r2(List<? extends E0> list) {
        C17542s.j(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t1());
        n0(sb2, list);
        sb2.append(p1());
        return sb2.toString();
    }

    public String s2(y0 y0Var) {
        C17542s.j(y0Var, "typeConstructor");
        C15561h e10 = y0Var.e();
        if ((e10 instanceof n0) || (e10 instanceof C15558e) || (e10 instanceof m0)) {
            return E1(e10);
        }
        if (e10 == null) {
            return y0Var instanceof C18095T ? ((C18095T) y0Var).n(p.f143188a) : y0Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + e10.getClass()).toString());
    }

    public boolean t0() {
        return this.f143193m.u();
    }

    public boolean u0() {
        return this.f143193m.v();
    }

    public C17642l<C15644c, Boolean> v0() {
        return this.f143193m.w();
    }

    public boolean w0() {
        return this.f143193m.x();
    }

    public boolean x0() {
        return this.f143193m.y();
    }

    public C17231b y0() {
        return this.f143193m.z();
    }

    public C17642l<u0, String> z0() {
        return this.f143193m.A();
    }
}
