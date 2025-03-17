package Vi;

import HJ.C15854t;
import SC.L2;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rz.Y;
import rz.Z;
import s0.C5861g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/d0;", "viewModel", "Lkotlin/Function1;", "", "LXH/N;", "energyLabelClicked", "Lcom/ingka/ikea/core/model/Link;", "onLinkClicked", "d", "(LVi/d0;LnI/l;LnI/l;LU0/m;I)V", "Lrz/Y$a;", "stockStatus", "LSC/L2;", "h", "(Lrz/Y$a;LU0/m;I)LSC/L2;", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(Vi.d0 r45, nI.C17642l<? super java.lang.String, XH.C16807N> r46, nI.C17642l<? super com.ingka.ikea.core.model.Link, XH.C16807N> r47, U0.C4889m r48, int r49) {
        /*
            r0 = r45
            r1 = r46
            r12 = r47
            r13 = r49
            java.lang.String r2 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "energyLabelClicked"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onLinkClicked"
            kotlin.jvm.internal.C17542s.j(r12, r2)
            r2 = -2026963951(0xffffffff872efc11, float:-1.3164381E-34)
            r3 = r48
            U0.m r15 = r3.k(r2)
            r3 = 6
            r4 = r13 & 6
            if (r4 != 0) goto L_0x0030
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x002d
            r4 = 4
            goto L_0x002e
        L_0x002d:
            r4 = 2
        L_0x002e:
            r4 = r4 | r13
            goto L_0x0031
        L_0x0030:
            r4 = r13
        L_0x0031:
            r5 = r13 & 48
            r6 = 16
            r7 = 32
            if (r5 != 0) goto L_0x0043
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0041
            r5 = r7
            goto L_0x0042
        L_0x0041:
            r5 = r6
        L_0x0042:
            r4 = r4 | r5
        L_0x0043:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0053
            boolean r5 = r15.F(r12)
            if (r5 == 0) goto L_0x0050
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r4 = r4 | r5
        L_0x0053:
            r14 = r4
            r4 = r14 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0067
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r15.L()
            r10 = r15
            goto L_0x0378
        L_0x0067:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0073
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.ScanAndGoPipPricePackage (PricePackageWithStockDelegate.kt:104)"
            U0.C4895p.S(r2, r14, r4, r5)
        L_0x0073:
            androidx.compose.ui.d$a r40 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r16 = TC.e.i(r40)
            r2 = 8
            float r2 = (float) r2
            float r20 = c2.h.B(r2)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r6 = r5.n(r6)
            i1.c$a r41 = i1.C5437c.f24302a
            i1.c$c r8 = r41.l()
            E1.I r3 = androidx.compose.foundation.layout.G.b(r6, r8, r15, r3)
            r11 = 0
            int r6 = U0.C4883j.a(r15, r11)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r42 = G1.C4504g.f6515W
            nI.a r9 = r42.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00bf
            U0.C4883j.c()
        L_0x00bf:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00cc
            r15.p(r9)
            goto L_0x00cf
        L_0x00cc:
            r15.t()
        L_0x00cf:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r42.c()
            U0.F1.c(r9, r3, r10)
            nI.p r3 = r42.e()
            U0.F1.c(r9, r8, r3)
            nI.p r3 = r42.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x00f9
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0107
        L_0x00f9:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r3)
        L_0x0107:
            nI.p r3 = r42.d()
            U0.F1.c(r9, r4, r3)
            s0.N r43 = s0.C5843N.f28726a
            r20 = 2
            r21 = 0
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 0
            r16 = r43
            r17 = r40
            androidx.compose.ui.d r3 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.d$m r4 = r5.g()
            i1.c$b r5 = r41.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r11)
            int r5 = U0.C4883j.a(r15, r11)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            nI.a r8 = r42.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x0145
            U0.C4883j.c()
        L_0x0145:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x0152
            r15.p(r8)
            goto L_0x0155
        L_0x0152:
            r15.t()
        L_0x0155:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r42.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r42.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r42.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x017f
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x018d
        L_0x017f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x018d:
            nI.p r4 = r42.d()
            U0.F1.c(r8, r3, r4)
            s0.h r10 = s0.C5862h.f28810a
            Op.d$h r3 = r45.i()
            Op.i1 r4 = new Op.i1
            kp.d r5 = r45.g()
            r4.<init>(r5)
            SC.Q1$b r8 = new SC.Q1$b
            SC.P1 r17 = SC.P1.Medium
            r20 = 4
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            boolean r5 = r45.h()
            r6 = -1893880892(0xffffffff8f1dabc4, float:-7.7737785E-30)
            r15.W(r6)
            r6 = r14 & 112(0x70, float:1.57E-43)
            if (r6 != r7) goto L_0x01c4
            r6 = 1
            goto L_0x01c5
        L_0x01c4:
            r6 = r11
        L_0x01c5:
            boolean r7 = r15.F(r0)
            r6 = r6 | r7
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x01d8
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x01e0
        L_0x01d8:
            Vi.Z r7 = new Vi.Z
            r7.<init>(r1, r0)
            r15.u(r7)
        L_0x01e0:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            int r7 = SC.Q1.b.f115896e
            int r16 = r7 << 15
            r17 = 16
            r7 = 0
            r9 = r15
            r44 = r10
            r10 = r16
            r0 = r11
            r11 = r17
            Op.F.g(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = -1893868201(0xffffffff8f1ddd57, float:-7.783326E-30)
            r15.W(r3)
            KJ.c r3 = r45.n()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0264
            java.lang.String r3 = r45.j()
            KJ.c r4 = r45.n()
            float r18 = c2.h.B(r2)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r40
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            Op.d$h r5 = r45.i()
            java.lang.String r7 = r5.k()
            r5 = -1893860883(0xffffffff8f1df9ed, float:-7.7888316E-30)
            r15.W(r5)
            java.lang.Object r5 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0248
            Vi.a0 r5 = new Vi.a0
            r6 = r44
            r5.<init>(r6)
            r15.u(r5)
        L_0x0248:
            nI.l r5 = (nI.C17642l) r5
            r15.P()
            int r6 = r14 << 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r9 = 1597440(0x186000, float:2.23849E-39)
            r10 = r6 | r9
            r11 = 0
            r6 = 0
            r16 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r47
            r9 = r15
            Op.C10848n.l(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0266
        L_0x0264:
            r16 = r2
        L_0x0266:
            r15.P()
            r2 = -1893844690(0xffffffff8f1e392e, float:-7.801014E-30)
            r15.W(r2)
            boolean r2 = r45.p()
            if (r2 != 0) goto L_0x02bc
            int r2 = Oo.b.f84512T4
            java.lang.String r14 = J1.j.b(r2, r15, r0)
            TC.b$a$b r2 = TC.C13679b.a.C2856b.f116680a
            r10 = r15
            r15 = r2
            float r18 = c2.h.B(r16)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r40
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r38 = 0
            r39 = 262136(0x3fff8, float:3.67331E-40)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 432(0x1b0, float:6.05E-43)
            r36 = r10
            SC.C13607l.j(r14, r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x02bd
        L_0x02bc:
            r10 = r15
        L_0x02bd:
            r10.P()
            r10.x()
            rz.Y$a r2 = r45.o()
            r3 = 1046080939(0x3e59edab, float:0.2128207)
            r10.W(r3)
            if (r2 != 0) goto L_0x02d1
            goto L_0x0369
        L_0x02d1:
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r43
            r17 = r40
            androidx.compose.ui.d r3 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            i1.c r4 = r41.f()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r0)
            int r5 = U0.C4883j.a(r10, r0)
            U0.y r6 = r10.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r10, r3)
            nI.a r7 = r42.a()
            U0.f r8 = r10.m()
            if (r8 != 0) goto L_0x0302
            U0.C4883j.c()
        L_0x0302:
            r10.I()
            boolean r8 = r10.i()
            if (r8 == 0) goto L_0x030f
            r10.p(r7)
            goto L_0x0312
        L_0x030f:
            r10.t()
        L_0x0312:
            U0.m r7 = U0.F1.a(r10)
            nI.p r8 = r42.c()
            U0.F1.c(r7, r4, r8)
            nI.p r4 = r42.e()
            U0.F1.c(r7, r6, r4)
            nI.p r4 = r42.b()
            boolean r6 = r7.i()
            if (r6 != 0) goto L_0x033c
            java.lang.Object r6 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r8)
            if (r6 != 0) goto L_0x034a
        L_0x033c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.w(r5, r4)
        L_0x034a:
            nI.p r4 = r42.d()
            U0.F1.c(r7, r3, r4)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            SC.L2 r4 = h(r2, r10, r0)
            java.lang.String r3 = r2.c()
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 4
            r5 = 0
            r6 = 0
            r7 = r10
            SC.K2.d(r3, r4, r5, r6, r7, r8, r9)
            r10.x()
            XH.N r0 = XH.C16807N.f139792a
        L_0x0369:
            r10.P()
            r10.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0378
            U0.C4895p.R()
        L_0x0378:
            U0.Y0 r0 = r10.n()
            if (r0 == 0) goto L_0x0388
            Vi.b0 r2 = new Vi.b0
            r3 = r45
            r2.<init>(r3, r1, r12, r13)
            r0.a(r2)
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Vi.c0.d(Vi.d0, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, d0 d0Var) {
        lVar.invoke(d0Var.j());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C5861g gVar, String str) {
        C17542s.j(str, "<unused var>");
        IllegalStateException illegalStateException = new IllegalStateException("We should not get color info on the PIP");
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = gVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d0 d0Var, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        d(d0Var, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final L2 h(Y.a aVar, C4889m mVar, int i10) {
        L2 l22;
        mVar.W(-980431442);
        if (C4895p.J()) {
            C4895p.S(-980431442, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.getStatusVariant (PricePackageWithStockDelegate.kt:172)");
        }
        Z a10 = aVar.a();
        if (C17542s.e(a10, Z.a.f130793a) || C17542s.e(a10, Z.c.f130795a)) {
            l22 = L2.Available;
        } else if (C17542s.e(a10, Z.b.f130794a)) {
            l22 = L2.Low;
        } else if (C17542s.e(a10, Z.d.f130796a) || C17542s.e(a10, Z.e.f130797a)) {
            l22 = L2.Indeterminate;
        } else if (C17542s.e(a10, Z.f.f130798a)) {
            l22 = L2.Unavailable;
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return l22;
    }
}
