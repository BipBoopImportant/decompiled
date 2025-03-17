package ci;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "rating", "", "numberReviewers", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClicked", "c", "(FILandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(float r33, int r34, androidx.compose.ui.d r35, nI.C17631a<XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r4 = r36
            r5 = r38
            java.lang.String r0 = "onClicked"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 1842878490(0x6dd8181a, float:8.3597374E27)
            r1 = r37
            U0.m r1 = r1.k(r0)
            r2 = r39 & 1
            if (r2 == 0) goto L_0x001c
            r2 = r5 | 6
            r3 = r2
            r2 = r33
            goto L_0x0030
        L_0x001c:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x002d
            r2 = r33
            boolean r3 = r1.c(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r5
            goto L_0x0030
        L_0x002d:
            r2 = r33
            r3 = r5
        L_0x0030:
            r6 = r39 & 2
            if (r6 == 0) goto L_0x0039
            r3 = r3 | 48
            r15 = r34
            goto L_0x004b
        L_0x0039:
            r6 = r5 & 48
            r15 = r34
            if (r6 != 0) goto L_0x004b
            boolean r6 = r1.d(r15)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r7 = r35
            goto L_0x0066
        L_0x0054:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0051
            r7 = r35
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r8
        L_0x0066:
            r8 = r39 & 8
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006f:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007e
            boolean r8 = r1.F(r4)
            if (r8 == 0) goto L_0x007b
            r8 = r9
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r8
        L_0x007e:
            r8 = r3 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r8 != r10) goto L_0x0091
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            r1.L()
            r3 = r7
            goto L_0x01eb
        L_0x0091:
            if (r6 == 0) goto L_0x0097
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x0098
        L_0x0097:
            r14 = r7
        L_0x0098:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a4
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.productinformationpage.v2.compose.ReviewsComposable (ReviewsComposable.kt:31)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x00a4:
            r0 = 96
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r6 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.b(r14, r7, r0, r8, r6)
            r0 = -79991727(0xfffffffffb3b6c51, float:-9.731564E35)
            r1.W(r0)
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = 0
            if (r0 != r9) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r8 = r6
        L_0x00bf:
            java.lang.Object r0 = r1.D()
            if (r8 != 0) goto L_0x00cd
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r0 != r7) goto L_0x00d5
        L_0x00cd:
            ci.N r0 = new ci.N
            r0.<init>(r4)
            r1.u(r0)
        L_0x00d5:
            r20 = r0
            nI.a r20 = (nI.C17631a) r20
            r1.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.d r0 = TC.e.i(r0)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            r8 = 8
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.foundation.layout.d$f r7 = r7.n(r8)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$c r8 = r8.i()
            r9 = 54
            E1.I r7 = androidx.compose.foundation.layout.G.b(r7, r8, r1, r9)
            int r8 = U0.C4883j.a(r1, r6)
            U0.y r9 = r1.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r1, r0)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r1.m()
            if (r12 != 0) goto L_0x0122
            U0.C4883j.c()
        L_0x0122:
            r1.I()
            boolean r12 = r1.i()
            if (r12 == 0) goto L_0x012f
            r1.p(r11)
            goto L_0x0132
        L_0x012f:
            r1.t()
        L_0x0132:
            U0.m r11 = U0.F1.a(r1)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r7, r12)
            nI.p r7 = r10.e()
            U0.F1.c(r11, r9, r7)
            nI.p r7 = r10.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x015c
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x016a
        L_0x015c:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r7)
        L_0x016a:
            nI.p r7 = r10.d()
            U0.F1.c(r11, r0, r7)
            s0.N r16 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r0
            androidx.compose.ui.d r8 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            int r7 = Oo.b.f84761q7
            java.lang.String r6 = J1.j.b(r7, r1, r6)
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r32 = r14
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 48
            r28 = r1
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            SC.l2 r11 = SC.C13610l2.Small
            java.lang.String r6 = "OverallRatingStars"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r0, r6)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r34)
            r0 = r3 & 14
            r6 = 196656(0x30030, float:2.75574E-40)
            r0 = r0 | r6
            int r3 = r3 << 9
            r6 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r6
            r14 = r0 | r3
            r15 = 76
            r8 = 0
            r9 = 0
            r12 = 0
            r6 = r33
            r13 = r1
            SC.C13606k2.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e9
            U0.C4895p.R()
        L_0x01e9:
            r3 = r32
        L_0x01eb:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0204
            ci.O r8 = new ci.O
            r0 = r8
            r1 = r33
            r2 = r34
            r4 = r36
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.P.c(float, int, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(float f10, int i10, d dVar, C17631a aVar, int i11, int i12, C4889m mVar, int i13) {
        c(f10, i10, dVar, aVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
