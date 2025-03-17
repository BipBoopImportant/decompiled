package iF;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "icon", "", "contentDescription", "title", "description", "", "isVisible", "LXH/N;", "b", "(Landroidx/compose/ui/d;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: iF.t  reason: case insensitive filesystem */
public final class C14579t {
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r77, int r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, boolean r82, U0.C4889m r83, int r84, int r85) {
        /*
            r2 = r78
            r13 = r79
            r1 = r80
            r0 = r81
            r14 = r84
            java.lang.String r3 = "contentDescription"
            kotlin.jvm.internal.C17542s.j(r13, r3)
            java.lang.String r3 = "title"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "description"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = -1801725403(0xffffffff949bda25, float:-1.5737043E-26)
            r4 = r83
            U0.m r15 = r4.k(r3)
            r4 = r85 & 1
            if (r4 == 0) goto L_0x002c
            r5 = r14 | 6
            r6 = r5
            r5 = r77
            goto L_0x0040
        L_0x002c:
            r5 = r14 & 6
            if (r5 != 0) goto L_0x003d
            r5 = r77
            boolean r6 = r15.V(r5)
            if (r6 == 0) goto L_0x003a
            r6 = 4
            goto L_0x003b
        L_0x003a:
            r6 = 2
        L_0x003b:
            r6 = r6 | r14
            goto L_0x0040
        L_0x003d:
            r5 = r77
            r6 = r14
        L_0x0040:
            r7 = r85 & 2
            if (r7 == 0) goto L_0x0047
            r6 = r6 | 48
            goto L_0x0057
        L_0x0047:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0057
            boolean r7 = r15.d(r2)
            if (r7 == 0) goto L_0x0054
            r7 = 32
            goto L_0x0056
        L_0x0054:
            r7 = 16
        L_0x0056:
            r6 = r6 | r7
        L_0x0057:
            r7 = r85 & 4
            if (r7 == 0) goto L_0x005e
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r7 = r14 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x006e
            boolean r7 = r15.V(r13)
            if (r7 == 0) goto L_0x006b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r6 = r6 | r7
        L_0x006e:
            r7 = r85 & 8
            if (r7 == 0) goto L_0x0075
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0085
            boolean r7 = r15.V(r1)
            if (r7 == 0) goto L_0x0082
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r6 = r6 | r7
        L_0x0085:
            r7 = r85 & 16
            if (r7 == 0) goto L_0x008c
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008c:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x009c
            boolean r7 = r15.V(r0)
            if (r7 == 0) goto L_0x0099
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r6 = r6 | r7
        L_0x009c:
            r7 = r85 & 32
            r8 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x00a7
            r6 = r6 | r8
        L_0x00a3:
            r8 = r82
        L_0x00a5:
            r12 = r6
            goto L_0x00b9
        L_0x00a7:
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00a3
            r8 = r82
            boolean r9 = r15.b(r8)
            if (r9 == 0) goto L_0x00b5
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r6 = r6 | r9
            goto L_0x00a5
        L_0x00b9:
            r6 = 74899(0x12493, float:1.04956E-40)
            r6 = r6 & r12
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r6 != r9) goto L_0x00d2
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x00c9
            goto L_0x00d2
        L_0x00c9:
            r15.L()
            r43 = r5
            r6 = r8
            r7 = r15
            goto L_0x02c4
        L_0x00d2:
            if (r4 == 0) goto L_0x00d8
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r11 = r4
            goto L_0x00d9
        L_0x00d8:
            r11 = r5
        L_0x00d9:
            r10 = 0
            if (r7 == 0) goto L_0x00df
            r39 = r10
            goto L_0x00e1
        L_0x00df:
            r39 = r8
        L_0x00e1:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00ed
            r4 = -1
            java.lang.String r5 = "com.sugarcube.app.base.ui.compose.KreativMessageScreen (KreativMessageScreen.kt:47)"
            U0.C4895p.S(r3, r12, r4, r5)
        L_0x00ed:
            boolean r3 = HJ.C15854t.v0(r79)
            if (r3 != 0) goto L_0x02ea
            boolean r3 = HJ.C15854t.v0(r80)
            if (r3 != 0) goto L_0x02e2
            if (r39 == 0) goto L_0x02b6
            r3 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.d(r11, r3, r5, r4)
            tK.v r9 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r3 = r9.a(r15, r8)
            I0.l r3 = r3.q0()
            long r17 = r3.c()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r22 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r3 = 28
            float r3 = (float) r3
            float r23 = c2.h.B(r3)
            float r25 = c2.h.B(r3)
            r27 = 10
            r28 = 0
            r24 = 0
            r26 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r22, r23, r24, r25, r26, r27, r28)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r5 = r4.g()
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            r7 = 30
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            i1.c$c r4 = r4.i()
            androidx.compose.foundation.layout.d$m r4 = r6.p(r7, r4)
            r6 = 54
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r6)
            int r5 = U0.C4883j.a(r15, r10)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r10 = r7.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x016b
            U0.C4883j.c()
        L_0x016b:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0178
            r15.p(r10)
            goto L_0x017b
        L_0x0178:
            r15.t()
        L_0x017b:
            U0.m r10 = U0.F1.a(r15)
            nI.p r0 = r7.c()
            U0.F1.c(r10, r4, r0)
            nI.p r0 = r7.e()
            U0.F1.c(r10, r6, r0)
            nI.p r0 = r7.b()
            boolean r4 = r10.i()
            if (r4 != 0) goto L_0x01a5
            java.lang.Object r4 = r10.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x01b3
        L_0x01a5:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r10.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r10.w(r4, r0)
        L_0x01b3:
            nI.p r0 = r7.d()
            U0.F1.c(r10, r3, r0)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r40 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            r17 = r40
            androidx.compose.ui.d r3 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            r10 = 0
            s0.C5844O.a(r3, r15, r10)
            int r3 = r12 >> 3
            r4 = r3 & 14
            t1.c r4 = J1.e.c(r2, r15, r4)
            E1.k$a r5 = E1.C4478k.f5915a
            E1.n r7 = r5.g()
            r3 = r3 & 112(0x70, float:1.57E-43)
            r6 = r3 | 24576(0x6000, float:3.4438E-41)
            r16 = 108(0x6c, float:1.51E-43)
            r5 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r3 = r4
            r4 = r79
            r20 = r6
            r6 = r17
            r41 = r8
            r8 = r18
            r42 = r9
            r9 = r19
            r10 = r15
            r43 = r11
            r11 = r20
            r44 = r12
            r12 = r16
            n0.C5583F.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = r41
            r3 = r42
            tK.w r5 = r3.b(r15, r4)
            tK.r r5 = r5.c()
            N1.Y r45 = r5.a()
            Y1.j$a r5 = Y1.j.f14783b
            int r65 = r5.a()
            r75 = 16744447(0xff7fff, float:2.3463968E-38)
            r76 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r66 = 0
            r67 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            N1.Y r34 = N1.Y.c(r45, r46, r48, r50, r51, r52, r53, r54, r55, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r76)
            int r6 = r44 >> 9
            r36 = r6 & 14
            r37 = 0
            r38 = 65534(0xfffe, float:9.1833E-41)
            r6 = 0
            r7 = r15
            r15 = r6
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r14 = r80
            r35 = r7
            I0.b1.b(r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            tK.w r3 = r3.b(r7, r4)
            tK.c r3 = r3.a()
            N1.Y r45 = r3.a()
            int r65 = r5.a()
            N1.Y r34 = N1.Y.c(r45, r46, r48, r50, r51, r52, r53, r54, r55, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r76)
            int r3 = r44 >> 12
            r36 = r3 & 14
            r15 = 0
            r14 = r81
            I0.b1.b(r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r20 = 2
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            r17 = r40
            androidx.compose.ui.d r0 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            r3 = 0
            s0.C5844O.a(r0, r7, r3)
            r7.x()
            goto L_0x02b9
        L_0x02b6:
            r43 = r11
            r7 = r15
        L_0x02b9:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02c2
            U0.C4895p.R()
        L_0x02c2:
            r6 = r39
        L_0x02c4:
            U0.Y0 r9 = r7.n()
            if (r9 == 0) goto L_0x02e1
            iF.s r10 = new iF.s
            r0 = r10
            r1 = r43
            r2 = r78
            r3 = r79
            r4 = r80
            r5 = r81
            r7 = r84
            r8 = r85
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x02e1:
            return
        L_0x02e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Title must not be empty or blank."
            r0.<init>(r1)
            throw r0
        L_0x02ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Content description must not be empty or blank."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iF.C14579t.b(androidx.compose.ui.d, int, java.lang.String, java.lang.String, java.lang.String, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, int i10, String str, String str2, String str3, boolean z10, int i11, int i12, C4889m mVar, int i13) {
        b(dVar, i10, str, str2, str3, z10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
