package MC;

import LC.C13178b;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import mp.C11588a;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aI\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmp/a;", "inspirationFeedItem", "LLC/b;", "imageSizeParam", "Lkotlin/Function1;", "LXH/N;", "onImageClicked", "Landroidx/compose/ui/d;", "modifier", "", "overrideAspectRatio", "c", "(Lmp/a;LLC/b;LnI/l;Landroidx/compose/ui/d;Ljava/lang/Float;LU0/m;II)V", "inspiration_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: MC.i  reason: case insensitive filesystem */
public final class C13203i {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(mp.C11588a r27, LC.C13178b r28, nI.C17642l<? super mp.C11588a, XH.C16807N> r29, androidx.compose.ui.d r30, java.lang.Float r31, U0.C4889m r32, int r33, int r34) {
        /*
            r1 = r27
            r0 = r28
            r15 = r29
            r14 = r33
            r13 = 16
            r2 = 4
            java.lang.String r3 = "inspirationFeedItem"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "imageSizeParam"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onImageClicked"
            kotlin.jvm.internal.C17542s.j(r15, r3)
            r3 = 360686469(0x157fa385, float:5.1625834E-26)
            r4 = r32
            U0.m r12 = r4.k(r3)
            r4 = 1
            r5 = r34 & 1
            r6 = 2
            if (r5 == 0) goto L_0x002c
            r5 = r14 | 6
            goto L_0x003c
        L_0x002c:
            r5 = r14 & 6
            if (r5 != 0) goto L_0x003b
            boolean r5 = r12.F(r1)
            if (r5 == 0) goto L_0x0038
            r5 = r2
            goto L_0x0039
        L_0x0038:
            r5 = r6
        L_0x0039:
            r5 = r5 | r14
            goto L_0x003c
        L_0x003b:
            r5 = r14
        L_0x003c:
            r7 = r34 & 2
            if (r7 == 0) goto L_0x0043
            r5 = r5 | 48
            goto L_0x0052
        L_0x0043:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0052
            boolean r7 = r12.F(r0)
            if (r7 == 0) goto L_0x0050
            r7 = 32
            goto L_0x0051
        L_0x0050:
            r7 = r13
        L_0x0051:
            r5 = r5 | r7
        L_0x0052:
            r2 = r34 & 4
            r7 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x005b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005b:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x006a
            boolean r2 = r12.F(r15)
            if (r2 == 0) goto L_0x0067
            r2 = r7
            goto L_0x0069
        L_0x0067:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r5 = r5 | r2
        L_0x006a:
            r2 = r34 & 8
            if (r2 == 0) goto L_0x0073
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r8 = r30
            goto L_0x0085
        L_0x0073:
            r8 = r14 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0070
            r8 = r30
            boolean r9 = r12.V(r8)
            if (r9 == 0) goto L_0x0082
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r5 = r5 | r9
        L_0x0085:
            r9 = r34 & 16
            if (r9 == 0) goto L_0x008e
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008b:
            r10 = r31
            goto L_0x00a0
        L_0x008e:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x008b
            r10 = r31
            boolean r11 = r12.V(r10)
            if (r11 == 0) goto L_0x009d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r5 = r5 | r11
        L_0x00a0:
            r11 = r5 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r13) goto L_0x00b5
            boolean r11 = r12.l()
            if (r11 != 0) goto L_0x00ad
            goto L_0x00b5
        L_0x00ad:
            r12.L()
            r4 = r8
            r5 = r10
            r3 = r12
            goto L_0x021c
        L_0x00b5:
            if (r2 == 0) goto L_0x00bb
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r13 = r2
            goto L_0x00bc
        L_0x00bb:
            r13 = r8
        L_0x00bc:
            r2 = 0
            if (r9 == 0) goto L_0x00c2
            r18 = r2
            goto L_0x00c4
        L_0x00c2:
            r18 = r10
        L_0x00c4:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d0
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.ui.inspiration.InspireImage (InspireImage.kt:28)"
            U0.C4895p.S(r3, r5, r8, r9)
        L_0x00d0:
            if (r18 == 0) goto L_0x00d7
            float r3 = r18.floatValue()
            goto L_0x00db
        L_0x00d7:
            float r3 = r27.c()
        L_0x00db:
            r8 = 0
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.C5074e.b(r13, r3, r8, r6, r2)
            r3 = -1018023396(0xffffffffc352321c, float:-210.19574)
            r12.W(r3)
            r3 = r5 & 896(0x380, float:1.256E-42)
            if (r3 != r7) goto L_0x00ec
            r3 = r4
            goto L_0x00ed
        L_0x00ec:
            r3 = r8
        L_0x00ed:
            boolean r6 = r12.F(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r12.D()
            if (r3 != 0) goto L_0x0100
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0108
        L_0x0100:
            MC.g r6 = new MC.g
            r6.<init>(r15, r1)
            r12.u(r6)
        L_0x0108:
            r23 = r6
            nI.a r23 = (nI.C17631a) r23
            r12.P()
            r24 = 7
            r25 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.d.d(r19, r20, r21, r22, r23, r24, r25)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r8)
            int r7 = U0.C4883j.a(r12, r8)
            U0.y r8 = r12.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r12, r3)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r12.m()
            if (r11 != 0) goto L_0x0142
            U0.C4883j.c()
        L_0x0142:
            r12.I()
            boolean r11 = r12.i()
            if (r11 == 0) goto L_0x014f
            r12.p(r10)
            goto L_0x0152
        L_0x014f:
            r12.t()
        L_0x0152:
            U0.m r10 = U0.F1.a(r12)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x017c
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x018a
        L_0x017c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x018a:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r3, r6)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            com.ingka.ikea.core.model.Image r3 = r27.e()
            java.lang.String r3 = r3.getUrl()
            com.ingka.ikea.core.model.Image r6 = r27.e()
            java.lang.String r6 = r6.A0()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r7 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r11, r7, r4, r2)
            int r2 = r5 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r10 = r2 | 384(0x180, float:5.38E-43)
            r17 = 0
            r19 = 4080(0xff0, float:5.717E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r2 = r3
            r3 = r6
            r5 = r28
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r20
            r20 = r10
            r10 = r21
            r26 = r11
            r11 = r22
            r30 = r12
            r12 = r23
            r21 = r13
            r13 = r24
            r14 = r30
            r15 = r20
            r16 = r17
            r17 = r19
            LC.h.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            mp.c r4 = r27.g()
            r2 = 338537189(0x142daae5, float:8.767971E-27)
            r3 = r30
            r3.W(r2)
            if (r4 != 0) goto L_0x01f4
            goto L_0x0209
        L_0x01f4:
            r2 = 16
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            r5 = r26
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.i(r5, r2)
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 0
            r6 = 1
            r7 = r3
            MC.C13197c.c(r4, r5, r6, r7, r8, r9)
        L_0x0209:
            r3.P()
            r3.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0218
            U0.C4895p.R()
        L_0x0218:
            r5 = r18
            r4 = r21
        L_0x021c:
            U0.Y0 r8 = r3.n()
            if (r8 == 0) goto L_0x0235
            MC.h r9 = new MC.h
            r0 = r9
            r1 = r27
            r2 = r28
            r3 = r29
            r6 = r33
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: MC.C13203i.c(mp.a, LC.b, nI.l, androidx.compose.ui.d, java.lang.Float, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, C11588a aVar) {
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C11588a aVar, C13178b bVar, C17642l lVar, d dVar, Float f10, int i10, int i11, C4889m mVar, int i12) {
        c(aVar, bVar, lVar, dVar, f10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
