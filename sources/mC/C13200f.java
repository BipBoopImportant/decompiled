package MC;

import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "title", "LKJ/c;", "Lmp/a;", "inspirationFeedItems", "Lkotlin/Function1;", "LXH/N;", "onImageClicked", "Landroidx/compose/ui/d;", "modifier", "c", "(Ljava/lang/String;LKJ/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "inspiration_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: MC.f  reason: case insensitive filesystem */
public final class C13200f {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r33, KJ.C15987c<mp.C11588a> r34, nI.C17642l<? super mp.C11588a, XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r15 = r33
            r14 = r34
            r13 = r35
            r12 = r38
            r10 = 8
            r1 = 4
            r11 = 6
            java.lang.String r2 = "inspirationFeedItems"
            kotlin.jvm.internal.C17542s.j(r14, r2)
            java.lang.String r2 = "onImageClicked"
            kotlin.jvm.internal.C17542s.j(r13, r2)
            r2 = -601352445(0xffffffffdc281703, float:-1.89252391E17)
            r3 = r37
            U0.m r9 = r3.k(r2)
            r8 = 1
            r3 = r39 & 1
            r7 = 2
            if (r3 == 0) goto L_0x0028
            r3 = r12 | 6
            goto L_0x0038
        L_0x0028:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0037
            boolean r3 = r9.V(r15)
            if (r3 == 0) goto L_0x0034
            r3 = r1
            goto L_0x0035
        L_0x0034:
            r3 = r7
        L_0x0035:
            r3 = r3 | r12
            goto L_0x0038
        L_0x0037:
            r3 = r12
        L_0x0038:
            r4 = r39 & 2
            r5 = 16
            if (r4 == 0) goto L_0x0041
            r3 = r3 | 48
            goto L_0x0050
        L_0x0041:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0050
            boolean r4 = r9.F(r14)
            if (r4 == 0) goto L_0x004e
            r4 = 32
            goto L_0x004f
        L_0x004e:
            r4 = r5
        L_0x004f:
            r3 = r3 | r4
        L_0x0050:
            r1 = r39 & 4
            if (r1 == 0) goto L_0x0057
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0067
            boolean r1 = r9.F(r13)
            if (r1 == 0) goto L_0x0064
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r1
        L_0x0067:
            r1 = r39 & 8
            if (r1 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r4 = r36
        L_0x006f:
            r6 = r3
            goto L_0x0084
        L_0x0071:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x006d
            r4 = r36
            boolean r6 = r9.V(r4)
            if (r6 == 0) goto L_0x0080
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r6
            goto L_0x006f
        L_0x0084:
            r3 = r6 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r3 != r0) goto L_0x0098
            boolean r0 = r9.l()
            if (r0 != 0) goto L_0x0091
            goto L_0x0098
        L_0x0091:
            r9.L()
            r8 = r9
            r13 = r14
            goto L_0x033d
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r4 = r0
        L_0x009d:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00a9
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.ui.inspiration.MiniInspirationFeed (InspirationImagesComposables.kt:37)"
            U0.C4895p.S(r2, r6, r0, r1)
        L_0x00a9:
            boolean r0 = r34.isEmpty()
            if (r0 == 0) goto L_0x00d2
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b8
            U0.C4895p.R()
        L_0x00b8:
            U0.Y0 r7 = r9.n()
            if (r7 == 0) goto L_0x00d1
            MC.d r8 = new MC.d
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00d1:
            return
        L_0x00d2:
            int r0 = r34.size()
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r3.g()
            i1.c$a r26 = i1.C5437c.f24302a
            i1.c$b r2 = r26.k()
            r14 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r9, r14)
            int r2 = U0.C4883j.a(r9, r14)
            U0.y r7 = r9.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r9, r4)
            G1.g$a r27 = G1.C4504g.f6515W
            nI.a r11 = r27.a()
            U0.f r18 = r9.m()
            if (r18 != 0) goto L_0x0102
            U0.C4883j.c()
        L_0x0102:
            r9.I()
            boolean r18 = r9.i()
            if (r18 == 0) goto L_0x010f
            r9.p(r11)
            goto L_0x0112
        L_0x010f:
            r9.t()
        L_0x0112:
            U0.m r11 = U0.F1.a(r9)
            nI.p r14 = r27.c()
            U0.F1.c(r11, r1, r14)
            nI.p r1 = r27.e()
            U0.F1.c(r11, r7, r1)
            nI.p r1 = r27.b()
            boolean r7 = r11.i()
            if (r7 != 0) goto L_0x013c
            java.lang.Object r7 = r11.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x014a
        L_0x013c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r11.u(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.w(r2, r1)
        L_0x014a:
            nI.p r1 = r27.d()
            U0.F1.c(r11, r10, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = -1837938353(0xffffffff9273494f, float:-7.676764E-28)
            r9.W(r1)
            r14 = 0
            r10 = 0
            if (r15 == 0) goto L_0x01b3
            TC.b$b$f r1 = TC.C13679b.C2857b.f.f116688a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r2 = TC.e.i(r2)
            float r7 = (float) r5
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r10, r7, r8, r14)
            r7 = r6 & 14
            r23 = r7 | 48
            r24 = 0
            r25 = 262136(0x3fff8, float:3.67331E-40)
            r18 = 0
            r11 = r3
            r28 = r4
            r3 = r18
            r7 = r5
            r29 = r6
            r5 = r18
            r18 = 0
            r7 = r18
            r8 = r18
            r37 = r9
            r9 = r18
            r18 = 0
            r30 = r11
            r10 = r18
            r16 = 0
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r31 = r0
            r0 = r33
            r22 = r37
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01bd
        L_0x01b3:
            r31 = r0
            r30 = r3
            r28 = r4
            r29 = r6
            r37 = r9
        L_0x01bd:
            r37.P()
            r0 = -1837928809(0xffffffff92736e97, float:-7.6813592E-28)
            r8 = r37
            r8.W(r0)
            r10 = r31
            r9 = 1
            if (r10 <= r9) goto L_0x02d6
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r12 = 16
            float r0 = (float) r12
            float r0 = c2.h.B(r0)
            r13 = 2
            r14 = 0
            r15 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r11, r0, r15, r13, r14)
            r7 = 8
            float r1 = (float) r7
            float r1 = c2.h.B(r1)
            r2 = r30
            androidx.compose.foundation.layout.d$f r1 = r2.n(r1)
            i1.c$c r2 = r26.l()
            r3 = 6
            E1.I r1 = androidx.compose.foundation.layout.G.b(r1, r2, r8, r3)
            r6 = 0
            int r2 = U0.C4883j.a(r8, r6)
            U0.y r3 = r8.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r8, r0)
            nI.a r4 = r27.a()
            U0.f r5 = r8.m()
            if (r5 != 0) goto L_0x020d
            U0.C4883j.c()
        L_0x020d:
            r8.I()
            boolean r5 = r8.i()
            if (r5 == 0) goto L_0x021a
            r8.p(r4)
            goto L_0x021d
        L_0x021a:
            r8.t()
        L_0x021d:
            U0.m r4 = U0.F1.a(r8)
            nI.p r5 = r27.c()
            U0.F1.c(r4, r1, r5)
            nI.p r1 = r27.e()
            U0.F1.c(r4, r3, r1)
            nI.p r1 = r27.b()
            boolean r3 = r4.i()
            if (r3 != 0) goto L_0x0247
            java.lang.Object r3 = r4.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 != 0) goto L_0x0255
        L_0x0247:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.w(r2, r1)
        L_0x0255:
            nI.p r1 = r27.d()
            U0.F1.c(r4, r0, r1)
            s0.N r16 = s0.C5843N.f28726a
            r5 = r34
            java.lang.Object r0 = r5.get(r6)
            r17 = r0
            mp.a r17 = (mp.C11588a) r17
            LC.b$a r18 = LC.C13178b.a.f111818a
            r4 = 2
            r19 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0 = r16
            r1 = r11
            r13 = r5
            r5 = r19
            androidx.compose.ui.d r0 = s0.C5842M.e(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "ROW_LEFT_IMAGE"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            int r19 = LC.C13178b.a.f111819b
            r5 = 3
            int r0 = r19 << 3
            r4 = r29
            r2 = r4 & 896(0x380, float:1.256E-42)
            r20 = r0 | r2
            r21 = 16
            r22 = 0
            r0 = r17
            r1 = r18
            r17 = r2
            r2 = r35
            r32 = r4
            r4 = r22
            r14 = r5
            r5 = r8
            r22 = r6
            r6 = r20
            r15 = r7
            r7 = r21
            MC.C13203i.c(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r13.get(r9)
            r6 = r0
            mp.a r6 = (mp.C11588a) r6
            r4 = 2
            r5 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0 = r16
            r1 = r11
            androidx.compose.ui.d r0 = s0.C5842M.e(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "ROW_RIGHT_IMAGE"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            int r0 = r19 << 3
            r7 = r0 | r17
            r11 = 16
            r4 = 0
            r0 = r6
            r1 = r18
            r2 = r35
            r5 = r8
            r6 = r7
            r7 = r11
            MC.C13203i.c(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.x()
            goto L_0x02e1
        L_0x02d6:
            r13 = r34
            r32 = r29
            r12 = 16
            r14 = 3
            r15 = 8
            r22 = 0
        L_0x02e1:
            r8.P()
            r0 = -1837903357(0xffffffff9273d203, float:-7.693614E-28)
            r8.W(r0)
            if (r10 == r9) goto L_0x02ee
            if (r10 < r14) goto L_0x032c
        L_0x02ee:
            if (r10 != r9) goto L_0x02f3
            r7 = r22
            goto L_0x02f4
        L_0x02f3:
            r7 = 2
        L_0x02f4:
            java.lang.Object r0 = r13.get(r7)
            mp.a r0 = (mp.C11588a) r0
            LC.b$a r1 = LC.C13178b.a.f111818a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            float r3 = (float) r12
            float r3 = c2.h.B(r3)
            float r4 = (float) r15
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.j(r2, r3, r4)
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r4, r9, r3)
            java.lang.String r3 = "BIG_IMAGE"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
            int r2 = LC.C13178b.a.f111819b
            int r2 = r2 << r14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r4 = r32
            r4 = r4 & 896(0x380, float:1.256E-42)
            r6 = r2 | r4
            r7 = 16
            r4 = 0
            r2 = r35
            r5 = r8
            MC.C13203i.c(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x032c:
            r8.P()
            r8.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x033b
            U0.C4895p.R()
        L_0x033b:
            r4 = r28
        L_0x033d:
            U0.Y0 r7 = r8.n()
            if (r7 == 0) goto L_0x0356
            MC.e r8 = new MC.e
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0356:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: MC.C13200f.c(java.lang.String, KJ.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str, C15987c cVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, C15987c cVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
