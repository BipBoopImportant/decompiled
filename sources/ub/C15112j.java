package uB;

import L1.v;
import L1.x;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import vB.C15128a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LvB/a;", "carouselShoppingList", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClick", "c", "(LvB/a;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uB.j  reason: case insensitive filesystem */
public final class C15112j {
    /* JADX WARNING: Removed duplicated region for block: B:129:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(vB.C15128a r42, androidx.compose.ui.d r43, nI.C17631a<XH.C16807N> r44, U0.C4889m r45, int r46, int r47) {
        /*
            r1 = r42
            r9 = r44
            r10 = r46
            java.lang.String r0 = "carouselShoppingList"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -1071629080(0xffffffffc0203ce8, float:-2.5037174)
            r2 = r45
            U0.m r15 = r2.k(r0)
            r2 = r47 & 1
            r11 = 4
            r14 = 2
            if (r2 == 0) goto L_0x0022
            r2 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0031
            boolean r2 = r15.V(r1)
            if (r2 == 0) goto L_0x002e
            r2 = r11
            goto L_0x002f
        L_0x002e:
            r2 = r14
        L_0x002f:
            r2 = r2 | r10
            goto L_0x0032
        L_0x0031:
            r2 = r10
        L_0x0032:
            r3 = r47 & 2
            if (r3 == 0) goto L_0x003b
            r2 = r2 | 48
        L_0x0038:
            r4 = r43
            goto L_0x004d
        L_0x003b:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0038
            r4 = r43
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x004a
            r5 = 32
            goto L_0x004c
        L_0x004a:
            r5 = 16
        L_0x004c:
            r2 = r2 | r5
        L_0x004d:
            r5 = r47 & 4
            if (r5 == 0) goto L_0x0055
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r12 = r2
            goto L_0x0066
        L_0x0055:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0053
            boolean r5 = r15.F(r9)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r5
            goto L_0x0053
        L_0x0066:
            r2 = r12 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r2 != r5) goto L_0x007a
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            r15.L()
            r2 = r4
            r6 = r15
            goto L_0x0476
        L_0x007a:
            if (r3 == 0) goto L_0x0080
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r8 = r2
            goto L_0x0081
        L_0x0080:
            r8 = r4
        L_0x0081:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x008d
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.shoppinglist.ui.ShoppingListCard (ShoppingListCard.kt:54)"
            U0.C4895p.S(r0, r12, r2, r3)
        L_0x008d:
            IC.e r0 = r42.e()
            int r2 = IC.C13023e.f110931a
            java.lang.String r0 = r0.a(r15, r2)
            KJ.c r2 = r42.d()
            boolean r37 = r2.isEmpty()
            r2 = 1068121457(0x3faa3d71, float:1.33)
            r7 = 0
            r6 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.C5074e.b(r8, r2, r7, r14, r6)
            tK.v r5 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r2 = r5.a(r15, r4)
            long r17 = r2.l0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r16 = 7
            r17 = 0
            r3 = 0
            r18 = 0
            r38 = r4
            r4 = r18
            r39 = r5
            r5 = r19
            r6 = r44
            r7 = r16
            r41 = r8
            r8 = r17
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r2, r3, r4, r5, r6, r7, r8)
            r3 = 1102925562(0x41bd4efa, float:23.663563)
            r15.W(r3)
            r3 = r12 & 14
            r7 = 1
            if (r3 != r11) goto L_0x00e6
            r3 = r7
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            boolean r4 = r15.V(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x00fa
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0102
        L_0x00fa:
            uB.h r4 = new uB.h
            r4.<init>(r1, r0)
            r15.u(r4)
        L_0x0102:
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            androidx.compose.ui.d r2 = L1.o.c(r2, r7, r4)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c r4 = r3.o()
            r5 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r5)
            int r6 = U0.C4883j.a(r15, r5)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r15, r2)
            G1.g$a r27 = G1.C4504g.f6515W
            nI.a r11 = r27.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x0131
            U0.C4883j.c()
        L_0x0131:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x013e
            r15.p(r11)
            goto L_0x0141
        L_0x013e:
            r15.t()
        L_0x0141:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r27.c()
            U0.F1.c(r11, r4, r12)
            nI.p r4 = r27.e()
            U0.F1.c(r11, r8, r4)
            nI.p r4 = r27.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x016b
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x0179
        L_0x016b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r11.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.w(r6, r4)
        L_0x0179:
            nI.p r4 = r27.d()
            U0.F1.c(r11, r2, r4)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r6 = 0
            r8 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.f(r4, r6, r7, r8)
            androidx.compose.foundation.layout.d r28 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r12 = r28.g()
            i1.c$b r13 = r3.k()
            E1.I r12 = androidx.compose.foundation.layout.C5080k.a(r12, r13, r15, r5)
            int r13 = U0.C4883j.a(r15, r5)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r15, r11)
            nI.a r5 = r27.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x01b1
            U0.C4883j.c()
        L_0x01b1:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x01be
            r15.p(r5)
            goto L_0x01c1
        L_0x01be:
            r15.t()
        L_0x01c1:
            U0.m r5 = U0.F1.a(r15)
            nI.p r6 = r27.c()
            U0.F1.c(r5, r12, r6)
            nI.p r6 = r27.e()
            U0.F1.c(r5, r14, r6)
            nI.p r6 = r27.b()
            boolean r12 = r5.i()
            if (r12 != 0) goto L_0x01eb
            java.lang.Object r12 = r5.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
            if (r12 != 0) goto L_0x01f9
        L_0x01eb:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r5.u(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r5.w(r12, r6)
        L_0x01f9:
            nI.p r6 = r27.d()
            U0.F1.c(r5, r11, r6)
            s0.h r17 = s0.C5862h.f28810a
            java.lang.String r5 = r42.b()
            if (r5 != 0) goto L_0x020a
            java.lang.String r5 = ""
        L_0x020a:
            r11 = r5
            LC.b$a r14 = LC.C13178b.a.f111818a
            r5 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.h(r4, r5, r7, r8)
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            androidx.compose.ui.d r5 = s0.C5861g.c(r17, r18, r19, r20, r21, r22)
            p1.i1 r6 = p1.c1.a()
            androidx.compose.ui.d r5 = m1.e.a(r5, r6)
            r6 = 1066611507(0x3f933333, float:1.15)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            if (r37 != 0) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r6 = r8
        L_0x0231:
            if (r6 == 0) goto L_0x0238
            float r6 = r6.floatValue()
            goto L_0x023a
        L_0x0238:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x023a:
            androidx.compose.ui.d r13 = m1.l.a(r5, r6)
            int r5 = LC.C13178b.a.f111819b
            int r5 = r5 << 9
            r6 = 48
            r24 = r5 | 48
            r25 = 0
            r26 = 4080(0xff0, float:5.717E-42)
            r12 = 0
            r5 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r6 = 16
            r6 = 2
            r40 = r15
            r15 = r5
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r40
            LC.h.c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = -343716082(0xffffffffeb834f0e, float:-3.174852E26)
            r14 = r40
            r14.W(r5)
            r5 = 6
            r11 = 0
            if (r37 == 0) goto L_0x028e
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.h(r4, r11, r7, r8)
            r13 = 1085485875(0x40b33333, float:5.6)
            r15 = 0
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.C5074e.b(r12, r13, r15, r6, r8)
            s0.C5844O.a(r12, r14, r5)
        L_0x028e:
            r14.P()
            r14.x()
            r12 = 434371750(0x19e3fca6, float:2.3573294E-23)
            r14.W(r12)
            if (r37 != 0) goto L_0x02b5
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.J.f(r4, r11, r7, r8)
            uB.f r11 = uB.C15108f.f131298a
            p1.l0 r16 = r11.a()
            r19 = 6
            r20 = 0
            r17 = 0
            r18 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.b.b(r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.layout.C5077h.a(r11, r14, r5)
        L_0x02b5:
            r14.P()
            r11 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r4, r11, r7, r8)
            r11 = 16
            float r15 = (float) r11
            float r11 = c2.h.B(r15)
            float r12 = c2.h.B(r15)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.j(r7, r12, r11)
            i1.c r11 = r3.b()
            androidx.compose.ui.d r2 = r2.a(r7, r11)
            i1.c$c r7 = r3.i()
            androidx.compose.foundation.layout.d$e r11 = r28.f()
            r12 = 48
            E1.I r7 = androidx.compose.foundation.layout.G.b(r11, r7, r14, r12)
            r11 = 0
            int r12 = U0.C4883j.a(r14, r11)
            U0.y r11 = r14.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            nI.a r13 = r27.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x02fc
            U0.C4883j.c()
        L_0x02fc:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x0309
            r14.p(r13)
            goto L_0x030c
        L_0x0309:
            r14.t()
        L_0x030c:
            U0.m r13 = U0.F1.a(r14)
            nI.p r6 = r27.c()
            U0.F1.c(r13, r7, r6)
            nI.p r6 = r27.e()
            U0.F1.c(r13, r11, r6)
            nI.p r6 = r27.b()
            boolean r7 = r13.i()
            if (r7 != 0) goto L_0x0336
            java.lang.Object r7 = r13.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x0344
        L_0x0336:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r13.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r13.w(r7, r6)
        L_0x0344:
            nI.p r6 = r27.d()
            U0.F1.c(r13, r2, r6)
            s0.N r16 = s0.C5843N.f28726a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r4
            androidx.compose.ui.d r2 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.d$m r6 = r28.g()
            i1.c$b r3 = r3.k()
            r7 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r6, r3, r14, r7)
            int r6 = U0.C4883j.a(r14, r7)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            nI.a r11 = r27.a()
            U0.f r12 = r14.m()
            if (r12 != 0) goto L_0x0381
            U0.C4883j.c()
        L_0x0381:
            r14.I()
            boolean r12 = r14.i()
            if (r12 == 0) goto L_0x038e
            r14.p(r11)
            goto L_0x0391
        L_0x038e:
            r14.t()
        L_0x0391:
            U0.m r11 = U0.F1.a(r14)
            nI.p r12 = r27.c()
            U0.F1.c(r11, r3, r12)
            nI.p r3 = r27.e()
            U0.F1.c(r11, r7, r3)
            nI.p r3 = r27.b()
            boolean r7 = r11.i()
            if (r7 != 0) goto L_0x03bb
            java.lang.Object r7 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r12)
            if (r7 != 0) goto L_0x03c9
        L_0x03bb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r11.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.w(r6, r3)
        L_0x03c9:
            nI.p r3 = r27.d()
            U0.F1.c(r11, r2, r3)
            if (r37 == 0) goto L_0x03e8
            r2 = 724731306(0x2b3285aa, float:6.34238E-13)
            r14.W(r2)
            r3 = r38
            r2 = r39
            tK.h r2 = r2.a(r14, r3)
            long r2 = r2.G0()
            r14.P()
            goto L_0x03fd
        L_0x03e8:
            r3 = r38
            r2 = r39
            r6 = 724806667(0x2b33ac0b, float:6.383233E-13)
            r14.W(r6)
            tK.h r2 = r2.a(r14, r3)
            long r2 = r2.F0()
            r14.P()
        L_0x03fd:
            java.lang.String r11 = r42.c()
            TC.b$b$c r12 = TC.C13679b.C2857b.c.f116685a
            Y1.t$a r6 = Y1.t.f14827a
            int r28 = r6.b()
            r35 = 199680(0x30c00, float:2.79811E-40)
            r36 = 221172(0x35ff4, float:3.09928E-40)
            r13 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 0
            r30 = 1
            r31 = 0
            r32 = 0
            r34 = 48
            r6 = r14
            r7 = r15
            r14 = r2
            r33 = r6
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            TC.b$a$c r12 = TC.C13679b.a.c.f116681a
            r35 = 0
            r36 = 262132(0x3fff4, float:3.67325E-40)
            r28 = 0
            r30 = 0
            r11 = r0
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r6.x()
            r0 = -343669322(0xffffffffeb8405b6, float:-3.1921035E26)
            r6.W(r0)
            if (r37 != 0) goto L_0x0462
            float r0 = c2.h.B(r7)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r4, r0)
            s0.C5844O.a(r0, r6, r5)
            KJ.c r0 = r42.f()
            r2 = 2
            r3 = 0
            uB.x.f(r0, r8, r6, r3, r2)
        L_0x0462:
            r6.P()
            r6.x()
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0474
            U0.C4895p.R()
        L_0x0474:
            r2 = r41
        L_0x0476:
            U0.Y0 r6 = r6.n()
            if (r6 == 0) goto L_0x048d
            uB.i r7 = new uB.i
            r0 = r7
            r1 = r42
            r3 = r44
            r4 = r46
            r5 = r47
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x048d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uB.C15112j.c(vB.a, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15128a aVar, String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        String c10 = aVar.c();
        v.d0(xVar, c10 + "\n" + str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15128a aVar, d dVar, C17631a aVar2, int i10, int i11, C4889m mVar, int i12) {
        c(aVar, dVar, aVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
