package androidx.compose.ui.focus;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "direction", "Lkotlin/Function1;", "LE1/h$a;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILnI/l;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        r1 = r2.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T a(androidx.compose.ui.focus.FocusTargetNode r11, int r12, nI.C17642l<? super E1.C4475h.a, ? extends T> r13) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r11.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x012e
            androidx.compose.ui.d$c r1 = r11.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r2 = G1.C4508k.m(r11)
        L_0x001c:
            r3 = 0
            if (r2 == 0) goto L_0x009f
            G1.a0 r4 = r2.m0()
            androidx.compose.ui.d$c r4 = r4.k()
            int r4 = r4.Z1()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x008b
        L_0x002e:
            if (r1 == 0) goto L_0x008b
            int r4 = r1.e2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0086
            r4 = r1
            r5 = r3
        L_0x0039:
            if (r4 == 0) goto L_0x0086
            boolean r6 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L_0x0041
            goto L_0x00a0
        L_0x0041:
            int r6 = r4.e2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x0081
            boolean r6 = r4 instanceof G1.C4510m
            if (r6 == 0) goto L_0x0081
            r6 = r4
            G1.m r6 = (G1.C4510m) r6
            androidx.compose.ui.d$c r6 = r6.D2()
            r7 = 0
            r8 = r7
        L_0x0055:
            r9 = 1
            if (r6 == 0) goto L_0x007e
            int r10 = r6.e2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0079
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x0065
            r4 = r6
            goto L_0x0079
        L_0x0065:
            if (r5 != 0) goto L_0x0070
            W0.b r5 = new W0.b
            r9 = 16
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r9]
            r5.<init>(r9, r7)
        L_0x0070:
            if (r4 == 0) goto L_0x0076
            r5.b(r4)
            r4 = r3
        L_0x0076:
            r5.b(r6)
        L_0x0079:
            androidx.compose.ui.d$c r6 = r6.a2()
            goto L_0x0055
        L_0x007e:
            if (r8 != r9) goto L_0x0081
            goto L_0x0039
        L_0x0081:
            androidx.compose.ui.d$c r4 = G1.C4508k.g(r5)
            goto L_0x0039
        L_0x0086:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x002e
        L_0x008b:
            G1.G r2 = r2.q0()
            if (r2 == 0) goto L_0x009c
            G1.a0 r1 = r2.m0()
            if (r1 == 0) goto L_0x009c
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x001c
        L_0x009c:
            r1 = r3
            goto L_0x001c
        L_0x009f:
            r4 = r3
        L_0x00a0:
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            if (r4 == 0) goto L_0x00b3
            E1.h r0 = r4.I2()
            E1.h r1 = r11.I2()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x00b3
            return r3
        L_0x00b3:
            E1.h r11 = r11.I2()
            if (r11 == 0) goto L_0x012d
            androidx.compose.ui.focus.d$a r0 = androidx.compose.ui.focus.d.f18832b
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.d.l(r12, r1)
            if (r1 == 0) goto L_0x00cc
            E1.h$b$a r12 = E1.C4475h.b.f5899a
            int r12 = r12.a()
            goto L_0x0120
        L_0x00cc:
            int r1 = r0.a()
            boolean r1 = androidx.compose.ui.focus.d.l(r12, r1)
            if (r1 == 0) goto L_0x00dd
            E1.h$b$a r12 = E1.C4475h.b.f5899a
            int r12 = r12.d()
            goto L_0x0120
        L_0x00dd:
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.d.l(r12, r1)
            if (r1 == 0) goto L_0x00ee
            E1.h$b$a r12 = E1.C4475h.b.f5899a
            int r12 = r12.e()
            goto L_0x0120
        L_0x00ee:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.d.l(r12, r1)
            if (r1 == 0) goto L_0x00ff
            E1.h$b$a r12 = E1.C4475h.b.f5899a
            int r12 = r12.f()
            goto L_0x0120
        L_0x00ff:
            int r1 = r0.e()
            boolean r1 = androidx.compose.ui.focus.d.l(r12, r1)
            if (r1 == 0) goto L_0x0110
            E1.h$b$a r12 = E1.C4475h.b.f5899a
            int r12 = r12.b()
            goto L_0x0120
        L_0x0110:
            int r0 = r0.f()
            boolean r12 = androidx.compose.ui.focus.d.l(r12, r0)
            if (r12 == 0) goto L_0x0125
            E1.h$b$a r12 = E1.C4475h.b.f5899a
            int r12 = r12.c()
        L_0x0120:
            java.lang.Object r3 = r11.a(r12, r13)
            goto L_0x012d
        L_0x0125:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unsupported direction for beyond bounds layout"
            r11.<init>(r12)
            throw r11
        L_0x012d:
            return r3
        L_0x012e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "visitAncestors called on an unattached node"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.FocusTargetNode, int, nI.l):java.lang.Object");
    }
}
