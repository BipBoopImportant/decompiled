package wK;

import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.focus.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\r²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u0010\f\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"LwK/H9;", "aspectRatio", "Lkotlin/Function0;", "LXH/N;", "player", "", "contentDescription", "onClick", "f", "(LwK/H9;LnI/p;Ljava/lang/String;LnI/a;LU0/m;I)V", "", "isPlaying", "isFirstTime", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class G9 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(wK.H9 r29, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r30, java.lang.String r31, nI.C17631a<XH.C16807N> r32, U0.C4889m r33, int r34) {
        /*
            r1 = r29
            r2 = r30
            r4 = r32
            r5 = r34
            java.lang.String r0 = "aspectRatio"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "player"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 1089023508(0x40e92e14, float:7.286875)
            r3 = r33
            U0.m r3 = r3.k(r0)
            r6 = r5 & 6
            r7 = 2
            if (r6 != 0) goto L_0x0030
            boolean r6 = r3.V(r1)
            if (r6 == 0) goto L_0x002d
            r6 = 4
            goto L_0x002e
        L_0x002d:
            r6 = r7
        L_0x002e:
            r6 = r6 | r5
            goto L_0x0031
        L_0x0030:
            r6 = r5
        L_0x0031:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r3.F(r2)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r6 = r6 | r8
        L_0x0041:
            r8 = r5 & 384(0x180, float:5.38E-43)
            r15 = r31
            if (r8 != 0) goto L_0x0053
            boolean r8 = r3.V(r15)
            if (r8 == 0) goto L_0x0050
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0052
        L_0x0050:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0052:
            r6 = r6 | r8
        L_0x0053:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 != 0) goto L_0x0064
            boolean r8 = r3.F(r4)
            if (r8 == 0) goto L_0x0061
            r8 = r9
            goto L_0x0063
        L_0x0061:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0063:
            r6 = r6 | r8
        L_0x0064:
            r8 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r8 != r10) goto L_0x0076
            boolean r8 = r3.l()
            if (r8 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r3.L()
            goto L_0x02ac
        L_0x0076:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0082
            r8 = -1
            java.lang.String r10 = "net.ikea.skapa.ui.components.SimpleVideo (SimpleVideo.kt:19)"
            U0.C4895p.S(r0, r6, r8, r10)
        L_0x0082:
            r0 = -504538630(0xffffffffe1ed59fa, float:-5.4729523E20)
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r10 = r8.a()
            r11 = 0
            if (r0 != r10) goto L_0x009e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            U0.r0 r0 = U0.u1.e(r0, r11, r7, r11)
            r3.u(r0)
        L_0x009e:
            U0.r0 r0 = (U0.C4899r0) r0
            r3.P()
            r10 = -504536775(0xffffffffe1ed6139, float:-5.473605E20)
            r3.W(r10)
            java.lang.Object r10 = r3.D()
            java.lang.Object r12 = r8.a()
            if (r10 != r12) goto L_0x00bc
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            U0.r0 r10 = U0.u1.e(r10, r11, r7, r11)
            r3.u(r10)
        L_0x00bc:
            U0.r0 r10 = (U0.C4899r0) r10
            r3.P()
            r12 = -504534900(0xffffffffe1ed688c, float:-5.4742647E20)
            r3.W(r12)
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            r13 = 1
            if (r12 != r9) goto L_0x00ce
            r9 = r13
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            java.lang.Object r12 = r3.D()
            if (r9 != 0) goto L_0x00db
            java.lang.Object r9 = r8.a()
            if (r12 != r9) goto L_0x00e3
        L_0x00db:
            wK.B9 r12 = new wK.B9
            r12.<init>(r4, r10, r0)
            r3.u(r12)
        L_0x00e3:
            nI.a r12 = (nI.C17631a) r12
            r3.P()
            boolean r0 = g(r0)
            if (r0 == 0) goto L_0x00f1
            int r0 = sK.C17950a.f147157f
            goto L_0x00f3
        L_0x00f1:
            int r0 = sK.C17950a.f147158g
        L_0x00f3:
            boolean r9 = m(r10)
            if (r9 == 0) goto L_0x00fe
            wK.k3 r9 = wK.C18381k3.Medium
        L_0x00fb:
            r16 = r9
            goto L_0x0101
        L_0x00fe:
            wK.k3 r9 = wK.C18381k3.Small
            goto L_0x00fb
        L_0x0101:
            boolean r9 = m(r10)
            if (r9 == 0) goto L_0x010e
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c r9 = r9.e()
            goto L_0x0114
        L_0x010e:
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c r9 = r9.d()
        L_0x0114:
            boolean r10 = m(r10)
            r7 = 3
            r14 = 0
            if (r10 != 0) goto L_0x0133
            tK.u r10 = tK.C18029u.f147649a
            float r18 = r10.c()
            float r21 = r10.c()
            r22 = 6
            r23 = 0
            r19 = 0
            r20 = 0
            s0.E r10 = androidx.compose.foundation.layout.D.e(r18, r19, r20, r21, r22, r23)
            goto L_0x0137
        L_0x0133:
            s0.E r10 = androidx.compose.foundation.layout.D.c(r14, r14, r7, r11)
        L_0x0137:
            r7 = -504517345(0xffffffffe1edad1f, float:-5.4804413E20)
            r3.W(r7)
            java.lang.Object r7 = r3.D()
            java.lang.Object r11 = r8.a()
            if (r7 != r11) goto L_0x014e
            r0.m r7 = r0.l.a()
            r3.u(r7)
        L_0x014e:
            r0.m r7 = (r0.m) r7
            r3.P()
            r11 = 6
            U0.A1 r11 = r0.C5814f.a(r7, r3, r11)
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r4 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.h(r1, r14, r13, r4)
            float r14 = r29.b()
            r5 = 2
            r15 = 0
            androidx.compose.ui.d r20 = androidx.compose.foundation.layout.C5074e.b(r13, r14, r15, r5, r4)
            L1.i$a r4 = L1.i.f8936b
            int r4 = r4.a()
            L1.i r25 = L1.i.h(r4)
            r4 = -504504923(0xffffffffe1eddda5, float:-5.484812E20)
            r3.W(r4)
            boolean r4 = r3.V(r12)
            java.lang.Object r5 = r3.D()
            if (r4 != 0) goto L_0x0189
            java.lang.Object r4 = r8.a()
            if (r5 != r4) goto L_0x0191
        L_0x0189:
            wK.C9 r5 = new wK.C9
            r5.<init>(r12)
            r3.u(r5)
        L_0x0191:
            r26 = r5
            nI.a r26 = (nI.C17631a) r26
            r3.P()
            r27 = 12
            r28 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r21 = r7
            androidx.compose.ui.d r20 = androidx.compose.foundation.d.b(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r27 = 62
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r21 = r11
            androidx.compose.ui.d r4 = zK.C18756a.d(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c r5 = r5.o()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r7)
            int r7 = U0.C4883j.a(r3, r7)
            U0.y r11 = r3.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r3, r4)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r3.m()
            if (r15 != 0) goto L_0x01de
            U0.C4883j.c()
        L_0x01de:
            r3.I()
            boolean r15 = r3.i()
            if (r15 == 0) goto L_0x01eb
            r3.p(r14)
            goto L_0x01ee
        L_0x01eb:
            r3.t()
        L_0x01ee:
            U0.m r14 = U0.F1.a(r3)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r5, r15)
            nI.p r5 = r13.e()
            U0.F1.c(r14, r11, r5)
            nI.p r5 = r13.b()
            boolean r11 = r14.i()
            if (r11 != 0) goto L_0x0218
            java.lang.Object r11 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x0226
        L_0x0218:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r14.u(r11)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.w(r7, r5)
        L_0x0226:
            nI.p r5 = r13.d()
            U0.F1.c(r14, r4, r5)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            r5 = 3
            int r5 = r6 >> 3
            r6 = r5 & 14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.invoke(r3, r6)
            wK.m3$b r11 = wK.C18405m3.b.f151237b
            androidx.compose.ui.d r1 = r4.a(r1, r9)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r1, r10)
            r4 = -2033019989(0xffffffff86d293ab, float:-7.92102E-35)
            r3.W(r4)
            java.lang.Object r4 = r3.D()
            java.lang.Object r6 = r8.a()
            if (r4 != r6) goto L_0x025d
            wK.D9 r4 = new wK.D9
            r4.<init>()
            r3.u(r4)
        L_0x025d:
            nI.l r4 = (nI.C17642l) r4
            r3.P()
            androidx.compose.ui.d r1 = androidx.compose.ui.focus.k.a(r1, r4)
            r4 = -2033018556(0xffffffff86d29944, float:-7.9218424E-35)
            r3.W(r4)
            boolean r4 = r3.V(r12)
            java.lang.Object r6 = r3.D()
            if (r4 != 0) goto L_0x027c
            java.lang.Object r4 = r8.a()
            if (r6 != r4) goto L_0x0284
        L_0x027c:
            wK.E9 r6 = new wK.E9
            r6.<init>(r12)
            r3.u(r6)
        L_0x0284:
            r14 = r6
            nI.a r14 = (nI.C17631a) r14
            r3.P()
            r4 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r17 = 200(0xc8, float:2.8E-43)
            r9 = 0
            r12 = 0
            r13 = 0
            r6 = r0
            r7 = r31
            r8 = r1
            r10 = r11
            r11 = r16
            r15 = r3
            r16 = r4
            wK.C18357i3.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02ac
            U0.C4895p.R()
        L_0x02ac:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x02c5
            wK.F9 r7 = new wK.F9
            r0 = r7
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.G9.f(wK.H9, nI.p, java.lang.String, nI.a, U0.m, int):void");
    }

    private static final boolean g(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(i iVar) {
        C17542s.j(iVar, "$this$focusProperties");
        iVar.w(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(H9 h92, p pVar, String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        f(h92, pVar, str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void l(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean m(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void n(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17631a aVar, C4899r0 r0Var, C4899r0 r0Var2) {
        n(r0Var, false);
        l(r0Var2, !g(r0Var2));
        aVar.invoke();
        return C16807N.f139792a;
    }
}
