package jF;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kF.C14721q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "title", "body", "LkF/q;", "clickableTextData", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/String;LkF/q;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jF.v  reason: case insensitive filesystem */
public final class C14650v {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r30, java.lang.String r31, kF.C14721q r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r30
            r15 = r31
            r13 = r34
            r14 = 6
            java.lang.String r1 = "title"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            java.lang.String r1 = "body"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            r1 = -458344081(0xffffffffe4ae396f, float:-2.5710976E22)
            r2 = r33
            U0.m r12 = r2.k(r1)
            r11 = 1
            r2 = r35 & 1
            r10 = 2
            r3 = 4
            if (r2 == 0) goto L_0x0024
            r2 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0033
            boolean r2 = r12.V(r0)
            if (r2 == 0) goto L_0x0030
            r2 = r3
            goto L_0x0031
        L_0x0030:
            r2 = r10
        L_0x0031:
            r2 = r2 | r13
            goto L_0x0034
        L_0x0033:
            r2 = r13
        L_0x0034:
            r4 = r35 & 2
            if (r4 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x004b
            boolean r4 = r12.V(r15)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r2 = r2 | r4
        L_0x004b:
            r4 = r35 & 4
            if (r4 == 0) goto L_0x0055
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r5 = r32
        L_0x0053:
            r8 = r2
            goto L_0x0068
        L_0x0055:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0051
            r5 = r32
            boolean r6 = r12.V(r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r2 = r2 | r6
            goto L_0x0053
        L_0x0068:
            r2 = r8 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r2 != r6) goto L_0x007c
            boolean r2 = r12.l()
            if (r2 != 0) goto L_0x0075
            goto L_0x007c
        L_0x0075:
            r12.L()
            r3 = r5
            r9 = r12
            goto L_0x02d1
        L_0x007c:
            if (r4 == 0) goto L_0x0081
            r25 = 0
            goto L_0x0083
        L_0x0081:
            r25 = r5
        L_0x0083:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x008f
            r2 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.compose.capture.chooseroom.ScanTip (ScanTip.kt:39)"
            U0.C4895p.S(r1, r8, r2, r4)
        L_0x008f:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r2.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r6 = r5.k()
            r9 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r6, r12, r9)
            int r6 = U0.C4883j.a(r12, r9)
            U0.y r10 = r12.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r12, r1)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r14 = r17.a()
            U0.f r19 = r12.m()
            if (r19 != 0) goto L_0x00bd
            U0.C4883j.c()
        L_0x00bd:
            r12.I()
            boolean r19 = r12.i()
            if (r19 == 0) goto L_0x00ca
            r12.p(r14)
            goto L_0x00cd
        L_0x00ca:
            r12.t()
        L_0x00cd:
            U0.m r14 = U0.F1.a(r12)
            nI.p r7 = r17.c()
            U0.F1.c(r14, r4, r7)
            nI.p r4 = r17.e()
            U0.F1.c(r14, r10, r4)
            nI.p r4 = r17.b()
            boolean r7 = r14.i()
            if (r7 != 0) goto L_0x00f7
            java.lang.Object r7 = r14.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x0105
        L_0x00f7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.w(r6, r4)
        L_0x0105:
            nI.p r4 = r17.d()
            U0.F1.c(r14, r9, r4)
            s0.h r4 = s0.C5862h.f28810a
            float r14 = (float) r3
            float r3 = c2.h.B(r14)
            r10 = 0
            r7 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r1, r10, r3, r11, r7)
            r4 = 6
            s0.C5844O.a(r3, r12, r4)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r1, r10, r11, r7)
            androidx.compose.foundation.layout.d$e r2 = r2.f()
            i1.c$c r4 = r5.l()
            r5 = 0
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r4, r12, r5)
            int r4 = U0.C4883j.a(r12, r5)
            U0.y r5 = r12.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r12, r3)
            nI.a r6 = r17.a()
            U0.f r9 = r12.m()
            if (r9 != 0) goto L_0x0147
            U0.C4883j.c()
        L_0x0147:
            r12.I()
            boolean r9 = r12.i()
            if (r9 == 0) goto L_0x0154
            r12.p(r6)
            goto L_0x0157
        L_0x0154:
            r12.t()
        L_0x0157:
            U0.m r6 = U0.F1.a(r12)
            nI.p r9 = r17.c()
            U0.F1.c(r6, r2, r9)
            nI.p r2 = r17.e()
            U0.F1.c(r6, r5, r2)
            nI.p r2 = r17.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x0181
            java.lang.Object r5 = r6.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x018f
        L_0x0181:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.w(r4, r2)
        L_0x018f:
            nI.p r2 = r17.d()
            U0.F1.c(r6, r3, r2)
            s0.N r2 = s0.C5843N.f28726a
            r2 = 24
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r1, r2)
            uK.c r2 = uK.C18148c.InformationCircle
            int r2 = r2.m()
            r3 = 0
            t1.c r2 = J1.e.c(r2, r12, r3)
            p1.w0$a r19 = p1.C5749w0.f27365b
            tK.v r9 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r3 = r9.a(r12, r6)
            long r20 = r3.G0()
            r23 = 2
            r24 = 0
            r22 = 0
            p1.w0 r17 = p1.C5749w0.a.b(r19, r20, r22, r23, r24)
            int r3 = OE.n.f113188D2
            r5 = 0
            java.lang.String r3 = J1.j.b(r3, r12, r5)
            r19 = 384(0x180, float:5.38E-43)
            r20 = 56
            r5 = 0
            r21 = 0
            r22 = 0
            r26 = r6
            r6 = r21
            r15 = r7
            r7 = r22
            r27 = r8
            r8 = r17
            r28 = r9
            r9 = r12
            r13 = r10
            r10 = r19
            r11 = r20
            n0.C5583F.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r2 = c2.h.B(r14)
            r3 = 2
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r1, r2, r13, r3, r15)
            r11 = 6
            s0.C5844O.a(r2, r12, r11)
            r3 = r26
            r2 = r28
            tK.w r2 = r2.b(r12, r3)
            tK.r r2 = r2.c()
            N1.Y r20 = r2.c()
            r22 = r27 & 14
            r23 = 0
            r24 = 65534(0xfffe, float:9.1833E-41)
            r2 = 0
            r9 = r1
            r1 = r2
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r29 = r9
            r9 = r16
            r16 = 0
            r17 = r11
            r11 = r16
            r32 = r12
            r12 = r16
            r18 = 0
            r26 = r14
            r13 = r18
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r30
            r21 = r32
            I0.b1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r32.x()
            r0 = -1764156226(0xffffffff96d91cbe, float:-3.507638E-25)
            r9 = r32
            r9.W(r0)
            if (r25 != 0) goto L_0x0252
            r10 = r29
            r11 = 6
            goto L_0x02b2
        L_0x0252:
            java.lang.String r0 = r25.a()
            nI.l r1 = r25.b()
            r2 = 16
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            r3 = 8
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            r10 = r29
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.j(r10, r2, r3)
            r3 = 522850361(0x1f2a1039, float:3.601232E-20)
            r9.W(r3)
            boolean r3 = r9.V(r1)
            boolean r4 = r9.V(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r9.D()
            if (r3 != 0) goto L_0x028b
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0293
        L_0x028b:
            jF.t r4 = new jF.t
            r4.<init>(r1, r0)
            r9.u(r4)
        L_0x0293:
            nI.l r4 = (nI.C17642l) r4
            r9.P()
            kF.q r3 = new kF.q
            r3.<init>(r0, r4)
            r0 = r27 & 112(0x70, float:1.57E-43)
            r11 = 6
            r7 = r0 | 6
            r8 = 56
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r2
            r1 = r31
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            kF.C14724t.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x02b2:
            r9.P()
            float r0 = c2.h.B(r26)
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r10, r3, r0, r1, r2)
            s0.C5844O.a(r0, r9, r11)
            r9.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02cf
            U0.C4895p.R()
        L_0x02cf:
            r3 = r25
        L_0x02d1:
            U0.Y0 r6 = r9.n()
            if (r6 == 0) goto L_0x02e8
            jF.u r7 = new jF.u
            r0 = r7
            r1 = r30
            r2 = r31
            r4 = r34
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jF.C14650v.c(java.lang.String, java.lang.String, kF.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, String str, String str2) {
        C17542s.j(str2, "it");
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, String str2, C14721q qVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, str2, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
