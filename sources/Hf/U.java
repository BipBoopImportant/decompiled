package Hf;

import E1.I;
import G1.C4504g;
import Gf.c;
import J1.j;
import L1.i;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.u;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import s0.C5872r;
import wf.C10366b;
import xf.h;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aE\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u0002"}, d2 = {"LGf/c$g;", "item", "Lkotlin/Function3;", "", "LGf/c$j;", "Lxf/h;", "LXH/N;", "onPillClicked", "Lkotlin/Function0;", "onClearRecentSearchesClicked", "m", "(LGf/c$g;LnI/q;LnI/a;LU0/m;I)V", "onCloseDialog", "onClearAllClicked", "h", "(LnI/a;LnI/a;LU0/m;I)V", "", "openDialog", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class U {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.g f60858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<String, c.j, h, C16807N> f60859b;

        a(c.g gVar, q<? super String, ? super c.j, ? super h, C16807N> qVar) {
            this.f60858a = gVar;
            this.f60859b = qVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(q qVar, String str) {
            qVar.invoke(str, c.j.TEXT, h.RECENTLY_SEARCHED);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5872r r17, U0.C4889m r18, int r19) {
            /*
                r16 = this;
                r0 = r16
                r13 = r18
                r1 = r19
                java.lang.String r2 = "$this$FlowRow"
                r3 = r17
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001e
                boolean r2 = r18.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001e
            L_0x001a:
                r18.L()
                goto L_0x008d
            L_0x001e:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002d
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.browseandsearch.searchv2.compose.RecentSearchesFlowRow.<anonymous>.<anonymous> (RecentSearchesFlowRow.kt:84)"
                r4 = 1129829962(0x4357d64a, float:215.83707)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002d:
                Gf.c$g r1 = r0.f60858a
                java.util.List r1 = r1.g()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                nI.q<java.lang.String, Gf.c$j, xf.h, XH.N> r14 = r0.f60859b
                java.util.Iterator r15 = r1.iterator()
            L_0x003b:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto L_0x0084
                java.lang.Object r1 = r15.next()
                java.lang.String r1 = (java.lang.String) r1
                SC.J1 r5 = SC.J1.Small
                r2 = -983282666(0xffffffffc5644c16, float:-3652.7554)
                r13.W(r2)
                boolean r2 = r13.V(r14)
                boolean r3 = r13.V(r1)
                r2 = r2 | r3
                java.lang.Object r3 = r18.D()
                if (r2 != 0) goto L_0x0066
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x006e
            L_0x0066:
                Hf.T r3 = new Hf.T
                r3.<init>(r14, r1)
                r13.u(r3)
            L_0x006e:
                r9 = r3
                nI.a r9 = (nI.C17631a) r9
                r18.P()
                r11 = 24576(0x6000, float:3.4438E-41)
                r12 = 238(0xee, float:3.34E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = r18
                SC.I1.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                goto L_0x003b
            L_0x0084:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x008d
                U0.C4895p.R()
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hf.U.a.b(s0.r, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(nI.C17631a<XH.C16807N> r17, nI.C17631a<XH.C16807N> r18, U0.C4889m r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = -1533469193(0xffffffffa4991df7, float:-6.6403935E-17)
            r4 = r19
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 4
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x001c
            r4 = r5
            goto L_0x001d
        L_0x001c:
            r4 = 2
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x002e
            r6 = r7
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r4 = r4 | r6
        L_0x0031:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x0043
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r15.L()
            goto L_0x0115
        L_0x0043:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x004f
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.app.browseandsearch.searchv2.compose.ClearPrompt (RecentSearchesFlowRow.kt:102)"
            U0.C4895p.S(r3, r4, r6, r8)
        L_0x004f:
            int r3 = wf.C10366b.f77652m
            r6 = 0
            java.lang.String r3 = J1.j.b(r3, r15, r6)
            int r8 = Oo.b.f84777s1
            java.lang.String r8 = J1.j.b(r8, r15, r6)
            r9 = -1807079535(0xffffffff944a2791, float:-1.0206197E-26)
            r15.W(r9)
            r9 = r4 & 14
            r10 = 1
            if (r9 != r5) goto L_0x0069
            r11 = r10
            goto L_0x006a
        L_0x0069:
            r11 = r6
        L_0x006a:
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r7) goto L_0x0070
            r4 = r10
            goto L_0x0071
        L_0x0070:
            r4 = r6
        L_0x0071:
            r4 = r4 | r11
            java.lang.Object r7 = r15.D()
            if (r4 != 0) goto L_0x0080
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x0088
        L_0x0080:
            Hf.O r7 = new Hf.O
            r7.<init>(r0, r1)
            r15.u(r7)
        L_0x0088:
            nI.a r7 = (nI.C17631a) r7
            r15.P()
            SC.W1 r11 = new SC.W1
            r11.<init>(r8, r7)
            int r4 = Oo.b.f84518U0
            java.lang.String r4 = J1.j.b(r4, r15, r6)
            r7 = -1807072819(0xffffffff944a41cd, float:-1.0211371E-26)
            r15.W(r7)
            if (r9 != r5) goto L_0x00a2
            r7 = r10
            goto L_0x00a3
        L_0x00a2:
            r7 = r6
        L_0x00a3:
            java.lang.Object r8 = r15.D()
            if (r7 != 0) goto L_0x00b1
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00b9
        L_0x00b1:
            Hf.P r8 = new Hf.P
            r8.<init>(r0)
            r15.u(r8)
        L_0x00b9:
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            SC.W1 r7 = new SC.W1
            r7.<init>(r4, r8)
            r4 = -1807062427(0xffffffff944a6a65, float:-1.02193764E-26)
            r15.W(r4)
            if (r9 != r5) goto L_0x00cc
            r6 = r10
        L_0x00cc:
            java.lang.Object r4 = r15.D()
            if (r6 != 0) goto L_0x00da
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x00e2
        L_0x00da:
            Hf.Q r4 = new Hf.Q
            r4.<init>(r0)
            r15.u(r4)
        L_0x00e2:
            r8 = r4
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            Hf.a r4 = Hf.C9097a.f60882a
            nI.p r12 = r4.a()
            int r4 = SC.W1.f116045c
            int r5 = r4 << 3
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r6
            int r4 = r4 << 6
            r13 = r5 | r4
            r14 = 112(0x70, float:1.57E-43)
            r9 = 0
            r10 = 0
            r16 = 0
            r4 = r3
            r5 = r11
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r16
            r11 = r12
            r12 = r15
            SC.Z1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0115
            U0.C4895p.R()
        L_0x0115:
            U0.Y0 r3 = r15.n()
            if (r3 == 0) goto L_0x0123
            Hf.S r4 = new Hf.S
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.U.h(nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17631a aVar, C17631a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        h(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void m(c.g gVar, q<? super String, ? super c.j, ? super h, C16807N> qVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        c.g gVar2 = gVar;
        q<? super String, ? super c.j, ? super h, C16807N> qVar2 = qVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(gVar2, "item");
        C17542s.j(qVar2, "onPillClicked");
        C17542s.j(aVar2, "onClearRecentSearchesClicked");
        C4889m k10 = mVar.k(-751951697);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(gVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(qVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-751951697, i13, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.RecentSearchesFlowRow (RecentSearchesFlowRow.kt:43)");
            }
            d.a aVar3 = d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar4 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar4.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, aVar3);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            d k11 = D.k(e.i(aVar3), 0.0f, c2.h.B((float) 24), 1, (Object) null);
            float f10 = (float) 8;
            I b11 = G.b(dVar.n(c2.h.B(f10)), aVar4.l(), k10, 6);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = androidx.compose.ui.c.e(k10, k11);
            C17631a<C4504g> a15 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar5.c());
            F1.c(a16, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b12 = aVar5.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar5.d());
            C5843N n10 = C5843N.f28726a;
            float f11 = f10;
            int i14 = i13;
            C5073d dVar2 = dVar;
            C4889m mVar2 = k10;
            C13607l.j(j.b(C10366b.f77653n, k10, 0), C13679b.C2857b.f.f116688a, C5842M.e(n10, aVar3, 3.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            C4889m mVar3 = mVar2;
            mVar3.W(82279432);
            Object D10 = mVar3.D();
            C4889m.a aVar6 = C4889m.f14007a;
            if (D10 == aVar6.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                mVar3.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            mVar3.P();
            String b13 = j.b(C10366b.f77648i, mVar3, 0);
            C13679b.a.C2856b bVar = C13679b.a.C2856b.f116680a;
            d e12 = C5842M.e(n10, aVar3, 1.0f, false, 2, (Object) null);
            mVar3.W(82287879);
            Object D11 = mVar3.D();
            if (D11 == aVar6.a()) {
                D11 = new L(r0Var);
                mVar3.u(D11);
            }
            mVar3.P();
            C4899r0 r0Var2 = r0Var;
            C4889m mVar4 = mVar3;
            C13607l.j(b13, bVar, androidx.compose.foundation.d.d(e12, false, (String) null, (i) null, (C17631a) D11, 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(Y1.j.f14783b.b()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 48, 0, 261112);
            k10 = mVar4;
            k10.W(82292450);
            if (n(r0Var2)) {
                k10.W(82294920);
                Object D12 = k10.D();
                if (D12 == aVar6.a()) {
                    D12 = new M(r0Var2);
                    k10.u(D12);
                }
                k10.P();
                h((C17631a) D12, aVar2, k10, ((i14 >> 3) & 112) | 6);
            }
            k10.P();
            k10.x();
            C5073d dVar3 = dVar2;
            androidx.compose.foundation.layout.p.a(D.k(aVar3, c2.h.B((float) 16), 0.0f, 2, (Object) null), dVar3.n(c2.h.B(f11)), dVar3.n(c2.h.B((float) 4)), 0, 0, (u) null, c1.c.e(1129829962, true, new a(gVar2, qVar2), k10, 54), k10, 1573302, 56);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new N(gVar2, qVar2, aVar2, i12));
        }
    }

    private static final boolean n(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void o(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C4899r0 r0Var) {
        o(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C4899r0 r0Var) {
        o(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(c.g gVar, q qVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        m(gVar, qVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
