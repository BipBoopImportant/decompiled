package wK;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LwK/H9;", "aspectRatio", "Landroidx/compose/ui/d;", "modifier", "", "propagateMinConstraints", "Lp1/v0;", "background", "Lkotlin/Function1;", "Ls0/c;", "LXH/N;", "content", "b", "(LwK/H9;Landroidx/compose/ui/d;ZJLnI/q;LU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.t  reason: case insensitive filesystem */
public final class C18485t {
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c1, code lost:
        if ((r29 & 8) != 0) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(wK.H9 r21, androidx.compose.ui.d r22, boolean r23, long r24, nI.q<? super s0.C5857c, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r21
            r6 = r26
            r7 = r28
            java.lang.String r0 = "aspectRatio"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = -951528254(0xffffffffc748d4c2, float:-51412.758)
            r2 = r27
            U0.m r2 = r2.k(r0)
            r3 = r29 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0021
            r3 = r7 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r3 = r3 | r7
            goto L_0x0031
        L_0x0030:
            r3 = r7
        L_0x0031:
            r5 = r29 & 2
            if (r5 == 0) goto L_0x003a
            r3 = r3 | 48
        L_0x0037:
            r8 = r22
            goto L_0x004c
        L_0x003a:
            r8 = r7 & 48
            if (r8 != 0) goto L_0x0037
            r8 = r22
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0049
            r9 = 32
            goto L_0x004b
        L_0x0049:
            r9 = 16
        L_0x004b:
            r3 = r3 | r9
        L_0x004c:
            r9 = r29 & 4
            if (r9 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r10 = r23
            goto L_0x0067
        L_0x0055:
            r10 = r7 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0052
            r10 = r23
            boolean r11 = r2.b(r10)
            if (r11 == 0) goto L_0x0064
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r11
        L_0x0067:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0080
            r11 = r29 & 8
            if (r11 != 0) goto L_0x007a
            r11 = r24
            boolean r13 = r2.e(r11)
            if (r13 == 0) goto L_0x007c
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r11 = r24
        L_0x007c:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r13
            goto L_0x0082
        L_0x0080:
            r11 = r24
        L_0x0082:
            r13 = r29 & 16
            if (r13 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0089:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0099
            boolean r13 = r2.F(r6)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00ad
            boolean r13 = r2.l()
            if (r13 != 0) goto L_0x00a6
            goto L_0x00ad
        L_0x00a6:
            r2.L()
        L_0x00a9:
            r3 = r10
            r4 = r11
            goto L_0x019c
        L_0x00ad:
            r2.G()
            r13 = r7 & 1
            r14 = 0
            if (r13 == 0) goto L_0x00c6
            boolean r13 = r2.O()
            if (r13 == 0) goto L_0x00bc
            goto L_0x00c6
        L_0x00bc:
            r2.L()
            r5 = r29 & 8
            if (r5 == 0) goto L_0x00df
        L_0x00c3:
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x00df
        L_0x00c6:
            if (r5 == 0) goto L_0x00cb
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r8 = r5
        L_0x00cb:
            if (r9 == 0) goto L_0x00ce
            r10 = r14
        L_0x00ce:
            r5 = r29 & 8
            if (r5 == 0) goto L_0x00df
            tK.v r5 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r2, r9)
            long r11 = r5.l0()
            goto L_0x00c3
        L_0x00df:
            r2.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00ee
            r5 = -1
            java.lang.String r9 = "net.ikea.skapa.ui.components.AspectRatioBox (AspectRatioBox.kt:76)"
            U0.C4895p.S(r0, r3, r5, r9)
        L_0x00ee:
            r19 = 2
            r20 = 0
            r18 = 0
            r15 = r8
            r16 = r11
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r15, r16, r18, r19, r20)
            float r5 = r21.b()
            r9 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.C5074e.b(r0, r5, r14, r4, r9)
            r4 = r3 & 896(0x380, float:1.256E-42)
            int r3 = r3 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.o()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r10)
            int r5 = U0.C4883j.a(r2, r14)
            U0.y r9 = r2.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r2, r0)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r2.m()
            if (r15 != 0) goto L_0x0130
            U0.C4883j.c()
        L_0x0130:
            r2.I()
            boolean r15 = r2.i()
            if (r15 == 0) goto L_0x013d
            r2.p(r14)
            goto L_0x0140
        L_0x013d:
            r2.t()
        L_0x0140:
            U0.m r14 = U0.F1.a(r2)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r4, r15)
            nI.p r4 = r13.e()
            U0.F1.c(r14, r9, r4)
            nI.p r4 = r13.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x016a
            java.lang.Object r9 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x0178
        L_0x016a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r14.u(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14.w(r5, r4)
        L_0x0178:
            nI.p r4 = r13.d()
            U0.F1.c(r14, r0, r4)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            int r3 = r3 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r0, r2, r3)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00a9
            U0.C4895p.R()
            goto L_0x00a9
        L_0x019c:
            U0.Y0 r9 = r2.n()
            if (r9 == 0) goto L_0x01b4
            wK.s r10 = new wK.s
            r0 = r10
            r1 = r21
            r2 = r8
            r6 = r26
            r7 = r28
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            r9.a(r10)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18485t.b(wK.H9, androidx.compose.ui.d, boolean, long, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(H9 h92, d dVar, boolean z10, long j10, q qVar, int i10, int i11, C4889m mVar, int i12) {
        b(h92, dVar, z10, j10, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
