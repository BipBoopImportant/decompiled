package F1;

import G1.C4507j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LF1/h;", "LF1/k;", "LG1/j;", "LF1/g;", "s0", "()LF1/g;", "providedValues", "T", "LF1/c;", "c", "(LF1/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h extends k, C4507j {
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r1 = r2.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    <T> T c(F1.c<T> r12) {
        /*
            r11 = this;
            androidx.compose.ui.d$c r0 = r11.E0()
            boolean r0 = r0.j2()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "ModifierLocal accessed from an unattached node"
            D1.a.a(r0)
        L_0x000f:
            r0 = 32
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r11.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x00cb
            androidx.compose.ui.d$c r1 = r11.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r2 = G1.C4508k.m(r11)
        L_0x002b:
            if (r2 == 0) goto L_0x00c2
            G1.a0 r3 = r2.m0()
            androidx.compose.ui.d$c r3 = r3.k()
            int r3 = r3.Z1()
            r3 = r3 & r0
            r4 = 0
            if (r3 == 0) goto L_0x00ad
        L_0x003d:
            if (r1 == 0) goto L_0x00ad
            int r3 = r1.e2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00a8
            r3 = r1
            r5 = r4
        L_0x0048:
            if (r3 == 0) goto L_0x00a8
            boolean r6 = r3 instanceof F1.h
            if (r6 == 0) goto L_0x0063
            F1.h r3 = (F1.h) r3
            F1.g r6 = r3.s0()
            boolean r6 = r6.a(r12)
            if (r6 == 0) goto L_0x00a3
            F1.g r0 = r3.s0()
            java.lang.Object r12 = r0.b(r12)
            return r12
        L_0x0063:
            int r6 = r3.e2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a3
            boolean r6 = r3 instanceof G1.C4510m
            if (r6 == 0) goto L_0x00a3
            r6 = r3
            G1.m r6 = (G1.C4510m) r6
            androidx.compose.ui.d$c r6 = r6.D2()
            r7 = 0
            r8 = r7
        L_0x0077:
            r9 = 1
            if (r6 == 0) goto L_0x00a0
            int r10 = r6.e2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x009b
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x0087
            r3 = r6
            goto L_0x009b
        L_0x0087:
            if (r5 != 0) goto L_0x0092
            W0.b r5 = new W0.b
            r9 = 16
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r9]
            r5.<init>(r9, r7)
        L_0x0092:
            if (r3 == 0) goto L_0x0098
            r5.b(r3)
            r3 = r4
        L_0x0098:
            r5.b(r6)
        L_0x009b:
            androidx.compose.ui.d$c r6 = r6.a2()
            goto L_0x0077
        L_0x00a0:
            if (r8 != r9) goto L_0x00a3
            goto L_0x0048
        L_0x00a3:
            androidx.compose.ui.d$c r3 = G1.C4508k.g(r5)
            goto L_0x0048
        L_0x00a8:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x003d
        L_0x00ad:
            G1.G r2 = r2.q0()
            if (r2 == 0) goto L_0x00bf
            G1.a0 r1 = r2.m0()
            if (r1 == 0) goto L_0x00bf
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x002b
        L_0x00bf:
            r1 = r4
            goto L_0x002b
        L_0x00c2:
            nI.a r12 = r12.a()
            java.lang.Object r12 = r12.invoke()
            return r12
        L_0x00cb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.h.c(F1.c):java.lang.Object");
    }

    g s0() {
        return b.f6010a;
    }
}
