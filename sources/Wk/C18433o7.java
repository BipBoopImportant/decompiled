package wK;

import L1.x;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "value", "Landroidx/compose/ui/d;", "modifier", "label", "LwK/r7;", "variant", "LXH/N;", "d", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/String;LwK/r7;LU0/m;II)V", "LwK/q7;", "style", "g", "(Ljava/lang/String;LwK/q7;Landroidx/compose/ui/d;LU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.o7  reason: case insensitive filesystem */
public final class C18433o7 {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r34, androidx.compose.ui.d r35, java.lang.String r36, wK.C18469r7 r37, U0.C4889m r38, int r39, int r40) {
        /*
            r6 = r34
            r7 = r39
            r0 = 2
            r1 = 4
            java.lang.String r2 = "value"
            kotlin.jvm.internal.C17542s.j(r6, r2)
            r2 = 543795057(0x2069a771, float:1.979127E-19)
            r3 = r38
            U0.m r5 = r3.k(r2)
            r3 = 1
            r4 = r40 & 1
            if (r4 == 0) goto L_0x001c
            r4 = r7 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x002b
            boolean r4 = r5.V(r6)
            if (r4 == 0) goto L_0x0028
            r4 = r1
            goto L_0x0029
        L_0x0028:
            r4 = r0
        L_0x0029:
            r4 = r4 | r7
            goto L_0x002c
        L_0x002b:
            r4 = r7
        L_0x002c:
            r0 = r40 & 2
            if (r0 == 0) goto L_0x0035
            r4 = r4 | 48
        L_0x0032:
            r8 = r35
            goto L_0x0047
        L_0x0035:
            r8 = r7 & 48
            if (r8 != 0) goto L_0x0032
            r8 = r35
            boolean r9 = r5.V(r8)
            if (r9 == 0) goto L_0x0044
            r9 = 32
            goto L_0x0046
        L_0x0044:
            r9 = 16
        L_0x0046:
            r4 = r4 | r9
        L_0x0047:
            r1 = r40 & 4
            if (r1 == 0) goto L_0x0050
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r9 = r36
            goto L_0x0062
        L_0x0050:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r36
            boolean r10 = r5.V(r9)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r10
        L_0x0062:
            r10 = r40 & 8
            if (r10 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r11 = r37
            goto L_0x007d
        L_0x006b:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0068
            r11 = r37
            boolean r12 = r5.V(r11)
            if (r12 == 0) goto L_0x007a
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r12
        L_0x007d:
            r12 = r4 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r12 != r13) goto L_0x0093
            boolean r12 = r5.l()
            if (r12 != 0) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            r5.L()
            r10 = r5
            r2 = r8
            r3 = r9
            r4 = r11
            goto L_0x01f5
        L_0x0093:
            if (r0 == 0) goto L_0x0098
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0099
        L_0x0098:
            r0 = r8
        L_0x0099:
            if (r1 == 0) goto L_0x009f
            r1 = 0
            r33 = r1
            goto L_0x00a1
        L_0x009f:
            r33 = r9
        L_0x00a1:
            if (r10 == 0) goto L_0x00a6
            wK.r7 r1 = wK.C18469r7.Emphasised
            goto L_0x00a7
        L_0x00a6:
            r1 = r11
        L_0x00a7:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00b3
            r8 = -1
            java.lang.String r9 = "net.ikea.skapa.ui.components.ProductIdentifier (ProductIdentifier.kt:44)"
            U0.C4895p.S(r2, r4, r8, r9)
        L_0x00b3:
            wK.p7 r2 = wK.C18445p7.f151399a
            int r8 = r4 >> 9
            r8 = r8 & 14
            r8 = r8 | 48
            wK.q7 r2 = r2.a(r1, r5, r8)
            if (r33 == 0) goto L_0x00c7
            int r8 = r33.length()
            if (r8 != 0) goto L_0x00cc
        L_0x00c7:
            r9 = r0
            r11 = r1
            r10 = r5
            goto L_0x01ce
        L_0x00cc:
            r8 = -1355976854(0xffffffffaf2d6f6a, float:-1.577384E-10)
            r5.W(r8)
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r9 = 926092489(0x37330cc9, float:1.0672208E-5)
            r5.W(r9)
            java.lang.Object r9 = r5.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r9 != r10) goto L_0x00ee
            wK.l7 r9 = new wK.l7
            r9.<init>()
            r5.u(r9)
        L_0x00ee:
            nI.l r9 = (nI.C17642l) r9
            r5.P()
            androidx.compose.ui.d r3 = L1.o.c(r8, r3, r9)
            androidx.compose.ui.d r3 = r3.s(r0)
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r9 = r9.g()
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$b r10 = r10.k()
            r15 = 0
            E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r10, r5, r15)
            int r10 = U0.C4883j.a(r5, r15)
            U0.y r11 = r5.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r5, r3)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r14 = r5.m()
            if (r14 != 0) goto L_0x0127
            U0.C4883j.c()
        L_0x0127:
            r5.I()
            boolean r14 = r5.i()
            if (r14 == 0) goto L_0x0134
            r5.p(r13)
            goto L_0x0137
        L_0x0134:
            r5.t()
        L_0x0137:
            U0.m r13 = U0.F1.a(r5)
            nI.p r14 = r12.c()
            U0.F1.c(r13, r9, r14)
            nI.p r9 = r12.e()
            U0.F1.c(r13, r11, r9)
            nI.p r9 = r12.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x0161
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x016f
        L_0x0161:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.w(r10, r9)
        L_0x016f:
            nI.p r9 = r12.d()
            U0.F1.c(r13, r3, r9)
            s0.h r3 = s0.C5862h.f28810a
            N1.Y r28 = r2.c()
            int r3 = r4 >> 6
            r30 = r3 & 14
            r31 = 0
            r32 = 65534(0xfffe, float:9.1833E-41)
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r3 = 0
            r15 = r3
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r3 = r8
            r8 = r33
            r29 = r5
            O0.d1.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            tK.u r8 = tK.C18029u.f147649a
            float r8 = r8.j()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r8)
            r8 = 0
            s0.C5844O.a(r3, r5, r8)
            r4 = r4 & 14
            r8 = 4
            r3 = 0
            r9 = r0
            r0 = r34
            r11 = r1
            r1 = r2
            r2 = r3
            r3 = r5
            r10 = r5
            r5 = r8
            g(r0, r1, r2, r3, r4, r5)
            r10.x()
            r10.P()
            goto L_0x01e8
        L_0x01ce:
            r0 = -1356050882(0xffffffffaf2c4e3e, float:-1.5671106E-10)
            r10.W(r0)
            r0 = r4 & 14
            int r1 = r4 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r4 = r0 | r1
            r5 = 0
            r0 = r34
            r1 = r2
            r2 = r9
            r3 = r10
            g(r0, r1, r2, r3, r4, r5)
            r10.P()
        L_0x01e8:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f1
            U0.C4895p.R()
        L_0x01f1:
            r2 = r9
            r4 = r11
            r3 = r33
        L_0x01f5:
            U0.Y0 r8 = r10.n()
            if (r8 == 0) goto L_0x020a
            wK.m7 r9 = new wK.m7
            r0 = r9
            r1 = r34
            r5 = r39
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.a(r9)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18433o7.d(java.lang.String, androidx.compose.ui.d, java.lang.String, wK.r7, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, d dVar, String str2, C18469r7 r7Var, int i10, int i11, C4889m mVar, int i12) {
        d(str, dVar, str2, r7Var, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(java.lang.String r30, wK.C18457q7 r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r4 = r34
            r0 = 1606794798(0x5fc5be2e, float:2.8497754E19)
            r1 = r33
            U0.m r1 = r1.k(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r30
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r30
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r30
            r3 = r4
        L_0x0029:
            r5 = r35 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r31
            goto L_0x0044
        L_0x0032:
            r5 = r4 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r31
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r35 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r32
            goto L_0x005f
        L_0x004d:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r32
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r8
        L_0x005f:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0072
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r1.L()
            r3 = r7
            goto L_0x00ec
        L_0x0072:
            if (r6 == 0) goto L_0x0078
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x0079
        L_0x0078:
            r14 = r7
        L_0x0079:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0085
            r6 = -1
            java.lang.String r7 = "net.ikea.skapa.ui.components.ProductIdentifierImpl (ProductIdentifier.kt:86)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x0085:
            N1.Y r0 = r31.b()
            long r6 = r0.l()
            float r0 = c2.v.h(r6)
            float r0 = c2.h.B(r0)
            r6 = 3
            float r6 = (float) r6
            float r6 = r0 / r6
            float r6 = c2.h.B(r6)
            s0.E r0 = androidx.compose.foundation.layout.D.b(r0, r6)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r7 = r6.s(r14)
            long r8 = r31.a()
            r11 = 2
            r12 = 0
            r10 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.h(r6, r0)
            N1.Y r25 = r31.b()
            r27 = r3 & 14
            r28 = 0
            r29 = 65532(0xfffc, float:9.183E-41)
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r0 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r5 = r30
            r26 = r1
            O0.d1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00eb
            U0.C4895p.R()
        L_0x00eb:
            r3 = r0
        L_0x00ec:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x0103
            wK.n7 r7 = new wK.n7
            r0 = r7
            r1 = r30
            r2 = r31
            r4 = r34
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18433o7.g(java.lang.String, wK.q7, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, C18457q7 q7Var, d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(str, q7Var, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
