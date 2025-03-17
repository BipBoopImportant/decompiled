package GI;

import DI.C15535F;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15566m;
import DI.C15568o;
import DI.C15574u;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.s0;
import EI.C15649h;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17278i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kJ.C17506e;
import nI.C17642l;
import nJ.C17656k;
import nJ.C17665t;
import tJ.C17986f;
import uJ.C18080D;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.C18141v;
import uJ.C18144y;
import uJ.H0;
import uJ.J0;
import uJ.M0;
import uJ.Q0;
import uJ.y0;
import vJ.g;

/* renamed from: GI.y  reason: case insensitive filesystem */
public class C15755y extends C15756z {

    /* renamed from: b  reason: collision with root package name */
    private final C15756z f134709b;

    /* renamed from: c  reason: collision with root package name */
    private final J0 f134710c;

    /* renamed from: d  reason: collision with root package name */
    private J0 f134711d;

    /* renamed from: e  reason: collision with root package name */
    private List<n0> f134712e;

    /* renamed from: f  reason: collision with root package name */
    private List<n0> f134713f;

    /* renamed from: g  reason: collision with root package name */
    private y0 f134714g;

    /* renamed from: GI.y$a */
    class a implements C17642l<n0, Boolean> {
        a() {
        }

        /* renamed from: a */
        public Boolean invoke(n0 n0Var) {
            return Boolean.valueOf(!n0Var.Q());
        }
    }

    /* renamed from: GI.y$b */
    class b implements C17642l<C18113f0, C18113f0> {
        b() {
        }

        /* renamed from: a */
        public C18113f0 invoke(C18113f0 f0Var) {
            return C15755y.this.M0(f0Var);
        }
    }

    public C15755y(C15756z zVar, J0 j02) {
        this.f134709b = zVar;
        this.f134710c = j02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void F0(int r15) {
        /*
            r0 = 23
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = r7
            goto L_0x0034
        L_0x0033:
            r9 = r6
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "getMemberScope"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "substitute"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00c2;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00a8;
                case 19: goto L_0x00a3;
                case 20: goto L_0x009e;
                case 21: goto L_0x0099;
                case 22: goto L_0x0094;
                case 23: goto L_0x00c2;
                case 24: goto L_0x0091;
                case 25: goto L_0x008c;
                case 26: goto L_0x0087;
                case 27: goto L_0x0082;
                case 28: goto L_0x007d;
                case 29: goto L_0x0078;
                case 30: goto L_0x0073;
                case 31: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00c4
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00c4
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00c4
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0091:
            r9[r14] = r13
            goto L_0x00c4
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00c4
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00ad:
            java.lang.String r10 = "getContextReceivers"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b2:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00bc:
            r9[r14] = r12
            goto L_0x00c4
        L_0x00bf:
            r9[r14] = r11
            goto L_0x00c4
        L_0x00c2:
            r9[r14] = r10
        L_0x00c4:
            if (r15 == r7) goto L_0x00db
            if (r15 == r6) goto L_0x00db
            if (r15 == r5) goto L_0x00db
            if (r15 == r4) goto L_0x00db
            if (r15 == r3) goto L_0x00db
            if (r15 == r2) goto L_0x00db
            if (r15 == r1) goto L_0x00d8
            if (r15 == r0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            r9[r7] = r13
            goto L_0x00dd
        L_0x00d8:
            r9[r7] = r12
            goto L_0x00dd
        L_0x00db:
            r9[r7] = r11
        L_0x00dd:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f7
            if (r15 == r6) goto L_0x00f7
            if (r15 == r5) goto L_0x00f7
            if (r15 == r4) goto L_0x00f7
            if (r15 == r3) goto L_0x00f7
            if (r15 == r2) goto L_0x00f7
            if (r15 == r1) goto L_0x00f7
            if (r15 == r0) goto L_0x00f7
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00fc
        L_0x00f7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00fc:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: GI.C15755y.F0(int):void");
    }

    private J0 K0() {
        if (this.f134711d == null) {
            if (this.f134710c.k()) {
                this.f134711d = this.f134710c;
            } else {
                List<n0> parameters = this.f134709b.k().getParameters();
                this.f134712e = new ArrayList(parameters.size());
                this.f134711d = C18080D.b(parameters, this.f134710c.j(), this, this.f134712e);
                this.f134713f = C16877v.s0(this.f134712e, new a());
            }
        }
        return this.f134711d;
    }

    /* access modifiers changed from: private */
    public C18113f0 M0(C18113f0 f0Var) {
        return (f0Var == null || this.f134710c.k()) ? f0Var : (C18113f0) K0().p(f0Var, Q0.INVARIANT);
    }

    public C17656k B(H0 h02) {
        if (h02 == null) {
            F0(10);
        }
        C17656k S10 = S(h02, C17506e.r(C17278i.g(this)));
        if (S10 == null) {
            F0(11);
        }
        return S10;
    }

    public C15557d F() {
        return this.f134709b.F();
    }

    public boolean I0() {
        return this.f134709b.I0();
    }

    public d0 J0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: L0 */
    public C15558e c(J0 j02) {
        if (j02 == null) {
            F0(23);
        }
        return j02.k() ? this : new C15755y(this, J0.h(j02.j(), K0().j()));
    }

    public C17656k S(H0 h02, g gVar) {
        if (h02 == null) {
            F0(5);
        }
        if (gVar == null) {
            F0(6);
        }
        C17656k S10 = this.f134709b.S(h02, gVar);
        if (!this.f134710c.k()) {
            return new C17665t(S10, K0());
        }
        if (S10 == null) {
            F0(7);
        }
        return S10;
    }

    public C17656k U() {
        C17656k U10 = this.f134709b.U();
        if (U10 == null) {
            F0(28);
        }
        return U10;
    }

    public s0<C18113f0> V() {
        s0<C18113f0> V10 = this.f134709b.V();
        if (V10 == null) {
            return null;
        }
        return V10.b(new b());
    }

    public C17656k X() {
        C17656k j02 = j0(C17506e.r(C17278i.g(this.f134709b)));
        if (j02 == null) {
            F0(12);
        }
        return j02;
    }

    public boolean Y() {
        return this.f134709b.Y();
    }

    public List<d0> Z() {
        List<d0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(17);
        }
        return emptyList;
    }

    public <R, D> R a0(C15568o<R, D> oVar, D d10) {
        return oVar.m(this, d10);
    }

    public C15566m b() {
        C15566m b10 = this.f134709b.b();
        if (b10 == null) {
            F0(22);
        }
        return b10;
    }

    public boolean b0() {
        return this.f134709b.b0();
    }

    public boolean g0() {
        return this.f134709b.g0();
    }

    public C15649h getAnnotations() {
        C15649h annotations = this.f134709b.getAnnotations();
        if (annotations == null) {
            F0(19);
        }
        return annotations;
    }

    public C17069f getName() {
        C17069f name = this.f134709b.getName();
        if (name == null) {
            F0(20);
        }
        return name;
    }

    public C15574u getVisibility() {
        C15574u visibility = this.f134709b.getVisibility();
        if (visibility == null) {
            F0(27);
        }
        return visibility;
    }

    public C15559f h() {
        C15559f h10 = this.f134709b.h();
        if (h10 == null) {
            F0(25);
        }
        return h10;
    }

    public i0 i() {
        i0 i0Var = i0.f133841a;
        if (i0Var == null) {
            F0(29);
        }
        return i0Var;
    }

    public boolean isExternal() {
        return this.f134709b.isExternal();
    }

    public boolean isInline() {
        return this.f134709b.isInline();
    }

    public C17656k j0(g gVar) {
        if (gVar == null) {
            F0(13);
        }
        C17656k j02 = this.f134709b.j0(gVar);
        if (!this.f134710c.k()) {
            return new C17665t(j02, K0());
        }
        if (j02 == null) {
            F0(14);
        }
        return j02;
    }

    public y0 k() {
        y0 k10 = this.f134709b.k();
        if (this.f134710c.k()) {
            if (k10 == null) {
                F0(0);
            }
            return k10;
        }
        if (this.f134714g == null) {
            J0 K02 = K0();
            Collection<C18096U> a10 = k10.a();
            ArrayList arrayList = new ArrayList(a10.size());
            for (C18096U p10 : a10) {
                arrayList.add(K02.p(p10, Q0.INVARIANT));
            }
            this.f134714g = new C18141v(this, this.f134712e, arrayList, C17986f.f147352e);
        }
        y0 y0Var = this.f134714g;
        if (y0Var == null) {
            F0(1);
        }
        return y0Var;
    }

    public Collection<C15557d> l() {
        Collection<C15557d> l10 = this.f134709b.l();
        ArrayList arrayList = new ArrayList(l10.size());
        for (C15557d next : l10) {
            arrayList.add(((C15557d) next.x().s(next.a()).c(next.u()).f(next.getVisibility()).p(next.h()).o(false).g()).c(K0()));
        }
        return arrayList;
    }

    public Collection<C15558e> m() {
        Collection<C15558e> m10 = this.f134709b.m();
        if (m10 == null) {
            F0(31);
        }
        return m10;
    }

    public boolean m0() {
        return this.f134709b.m0();
    }

    public boolean n() {
        return this.f134709b.n();
    }

    public C17656k o0() {
        C17656k o02 = this.f134709b.o0();
        if (o02 == null) {
            F0(15);
        }
        return o02;
    }

    public C15558e p0() {
        return this.f134709b.p0();
    }

    public C18113f0 r() {
        C18113f0 m10 = C18099X.m(C18144y.f147952a.a(getAnnotations(), (y0) null, (C15566m) null), k(), M0.g(k().getParameters()), false, X());
        if (m10 == null) {
            F0(16);
        }
        return m10;
    }

    public List<n0> t() {
        K0();
        List<n0> list = this.f134713f;
        if (list == null) {
            F0(30);
        }
        return list;
    }

    public C15535F u() {
        C15535F u10 = this.f134709b.u();
        if (u10 == null) {
            F0(26);
        }
        return u10;
    }

    public boolean v() {
        return this.f134709b.v();
    }

    public C15558e a() {
        C15558e a10 = this.f134709b.a();
        if (a10 == null) {
            F0(21);
        }
        return a10;
    }
}
