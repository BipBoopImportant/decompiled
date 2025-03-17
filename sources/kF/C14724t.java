package kF;

import N1.C4669d;
import N1.G;
import N1.Y;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "fullText", "LkF/q;", "clickableTextData", "LN1/Y;", "textStyle", "LN1/G;", "defaultTextSpanStyle", "clickableTextSpanStyle", "LXH/N;", "c", "(Landroidx/compose/ui/d;Ljava/lang/String;LkF/q;LN1/Y;LN1/G;LN1/G;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.t  reason: case insensitive filesystem */
public final class C14724t {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0221 A[Catch:{ all -> 0x021c, all -> 0x0219 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d9 A[SYNTHETIC, Splitter:B:99:0x01d9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.d r41, java.lang.String r42, kF.C14721q r43, N1.Y r44, N1.G r45, N1.G r46, U0.C4889m r47, int r48, int r49) {
        /*
            r0 = r42
            r7 = r43
            r8 = r48
            r1 = 2
            r2 = 4
            r3 = 16
            r4 = 32
            java.lang.String r9 = "substring(...)"
            java.lang.String r5 = "fullText"
            kotlin.jvm.internal.C17542s.j(r0, r5)
            java.lang.String r5 = "clickableTextData"
            kotlin.jvm.internal.C17542s.j(r7, r5)
            r5 = -1012241538(0xffffffffc3aa6b7e, float:-340.83978)
            r6 = r47
            U0.m r15 = r6.k(r5)
            r10 = 1
            r6 = r49 & 1
            if (r6 == 0) goto L_0x002c
            r11 = r8 | 6
            r12 = r11
            r11 = r41
            goto L_0x0040
        L_0x002c:
            r11 = r8 & 6
            if (r11 != 0) goto L_0x003d
            r11 = r41
            boolean r12 = r15.V(r11)
            if (r12 == 0) goto L_0x003a
            r12 = r2
            goto L_0x003b
        L_0x003a:
            r12 = r1
        L_0x003b:
            r12 = r12 | r8
            goto L_0x0040
        L_0x003d:
            r11 = r41
            r12 = r8
        L_0x0040:
            r1 = r49 & 2
            if (r1 == 0) goto L_0x0047
            r12 = r12 | 48
            goto L_0x0055
        L_0x0047:
            r1 = r8 & 48
            if (r1 != 0) goto L_0x0055
            boolean r1 = r15.V(r0)
            if (r1 == 0) goto L_0x0053
            r1 = r4
            goto L_0x0054
        L_0x0053:
            r1 = r3
        L_0x0054:
            r12 = r12 | r1
        L_0x0055:
            r1 = r49 & 4
            if (r1 == 0) goto L_0x005c
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r1 = r8 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x006c
            boolean r1 = r15.V(r7)
            if (r1 == 0) goto L_0x0069
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r1 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r12 = r12 | r1
        L_0x006c:
            r1 = r8 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0085
            r1 = r49 & 8
            if (r1 != 0) goto L_0x007f
            r1 = r44
            boolean r2 = r15.V(r1)
            if (r2 == 0) goto L_0x0081
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x007f:
            r1 = r44
        L_0x0081:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r12 = r12 | r2
            goto L_0x0087
        L_0x0085:
            r1 = r44
        L_0x0087:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a0
            r2 = r49 & 16
            if (r2 != 0) goto L_0x009a
            r2 = r45
            boolean r14 = r15.V(r2)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r2 = r45
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r12 = r12 | r14
            goto L_0x00a2
        L_0x00a0:
            r2 = r45
        L_0x00a2:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00bd
            r14 = r49 & 32
            if (r14 != 0) goto L_0x00b6
            r14 = r46
            boolean r16 = r15.V(r14)
            if (r16 == 0) goto L_0x00b8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r14 = r46
        L_0x00b8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r12 = r12 | r16
            goto L_0x00bf
        L_0x00bd:
            r14 = r46
        L_0x00bf:
            r16 = 74899(0x12493, float:1.04956E-40)
            r13 = r12 & r16
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r5) goto L_0x00d9
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x00d0
            goto L_0x00d9
        L_0x00d0:
            r15.L()
            r5 = r1
            r6 = r2
            r2 = r11
            r3 = r15
            goto L_0x028c
        L_0x00d9:
            r15.G()
            r5 = r8 & 1
            r13 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x0109
            boolean r5 = r15.O()
            if (r5 == 0) goto L_0x00ed
            goto L_0x0109
        L_0x00ed:
            r15.L()
            r5 = r49 & 8
            if (r5 == 0) goto L_0x00f6
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f6:
            r3 = r49 & 16
            if (r3 == 0) goto L_0x00fc
            r12 = r12 & r17
        L_0x00fc:
            r3 = r49 & 32
            if (r3 == 0) goto L_0x0101
            r12 = r12 & r13
        L_0x0101:
            r22 = r1
            r21 = r11
            r13 = r14
            r14 = r2
            goto L_0x01a6
        L_0x0109:
            if (r6 == 0) goto L_0x010e
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r11 = r5
        L_0x010e:
            r5 = r49 & 8
            if (r5 == 0) goto L_0x0124
            tK.v r1 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.w r1 = r1.b(r15, r5)
            tK.c r1 = r1.a()
            N1.Y r1 = r1.b()
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0124:
            r3 = r49 & 16
            if (r3 == 0) goto L_0x0161
            N1.G r2 = new N1.G
            r18 = r2
            tK.v r3 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r5)
            long r19 = r3.G0()
            r39 = 65534(0xfffe, float:9.1833E-41)
            r40 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40)
            r3 = r12 & r17
            r12 = r3
        L_0x0161:
            r3 = r49 & 32
            if (r3 == 0) goto L_0x0101
            Y1.k$a r3 = Y1.k.f14792b
            Y1.k r34 = r3.d()
            tK.v r3 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r4)
            long r18 = r3.H0()
            N1.G r3 = new N1.G
            r17 = r3
            r38 = 61438(0xeffe, float:8.6093E-41)
            r39 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39)
            r12 = r12 & r13
            r22 = r1
            r14 = r2
            r13 = r3
            r21 = r11
        L_0x01a6:
            r15.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01b8
            r1 = -1
            java.lang.String r2 = "com.sugarcube.app.base.ui.compose.common.ClickableText (ClickableTextData.kt:50)"
            r3 = -1012241538(0xffffffffc3aa6b7e, float:-340.83978)
            U0.C4895p.S(r3, r12, r1, r2)
        L_0x01b8:
            N1.d$a r11 = new N1.d$a
            r1 = 0
            r6 = 0
            r11.<init>(r6, r10, r1)
            java.lang.String r2 = r43.d()
            r5 = 2
            r16 = 0
            r3 = 0
            r4 = 1
            r1 = r42
            r10 = r6
            r6 = r16
            int r1 = HJ.C15854t.s0(r1, r2, r3, r4, r5, r6)
            int r2 = r11.p(r14)
            java.lang.String r3 = "hyperlink_tag"
            if (r1 < 0) goto L_0x0221
            java.lang.String r4 = r0.substring(r10, r1)     // Catch:{ all -> 0x0219 }
            kotlin.jvm.internal.C17542s.i(r4, r9)     // Catch:{ all -> 0x0219 }
            r11.j(r4)     // Catch:{ all -> 0x0219 }
            r11.n(r3, r3)     // Catch:{ all -> 0x0219 }
            int r4 = r11.p(r13)     // Catch:{ all -> 0x0219 }
            java.lang.String r5 = r43.d()     // Catch:{ all -> 0x021c }
            int r5 = r5.length()     // Catch:{ all -> 0x021c }
            int r5 = r5 + r1
            java.lang.String r5 = r0.substring(r1, r5)     // Catch:{ all -> 0x021c }
            kotlin.jvm.internal.C17542s.i(r5, r9)     // Catch:{ all -> 0x021c }
            r11.j(r5)     // Catch:{ all -> 0x021c }
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ all -> 0x021c }
            r11.m(r4)     // Catch:{ all -> 0x0219 }
            r11.l()     // Catch:{ all -> 0x0219 }
            java.lang.String r4 = r43.d()     // Catch:{ all -> 0x0219 }
            int r4 = r4.length()     // Catch:{ all -> 0x0219 }
            int r1 = r1 + r4
            java.lang.String r1 = r0.substring(r1)     // Catch:{ all -> 0x0219 }
            kotlin.jvm.internal.C17542s.i(r1, r9)     // Catch:{ all -> 0x0219 }
            r11.j(r1)     // Catch:{ all -> 0x0219 }
            goto L_0x0224
        L_0x0219:
            r0 = move-exception
            goto L_0x02a5
        L_0x021c:
            r0 = move-exception
            r11.m(r4)     // Catch:{ all -> 0x0219 }
            throw r0     // Catch:{ all -> 0x0219 }
        L_0x0221:
            r11.j(r0)     // Catch:{ all -> 0x0219 }
        L_0x0224:
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0219 }
            r11.m(r2)
            N1.d r1 = r11.q()
            r2 = 248578528(0xed101e0, float:5.1524283E-30)
            r15.W(r2)
            boolean r2 = r15.V(r1)
            r4 = r12 & 896(0x380, float:1.256E-42)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L_0x023e
            r10 = 1
        L_0x023e:
            r2 = r2 | r10
            java.lang.Object r4 = r15.D()
            if (r2 != 0) goto L_0x024d
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0255
        L_0x024d:
            kF.r r4 = new kF.r
            r4.<init>(r1, r3, r7)
            r15.u(r4)
        L_0x0255:
            r17 = r4
            nI.l r17 = (nI.C17642l) r17
            r15.P()
            int r2 = r12 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r3 = r12 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r19 = r2 | r3
            r20 = 120(0x78, float:1.68E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r16 = 0
            r10 = r1
            r11 = r21
            r12 = r22
            r1 = r13
            r13 = r2
            r2 = r14
            r14 = r3
            r3 = r15
            r15 = r4
            r18 = r3
            B0.C4361e.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0286
            U0.C4895p.R()
        L_0x0286:
            r14 = r1
            r6 = r2
            r2 = r21
            r5 = r22
        L_0x028c:
            U0.Y0 r10 = r3.n()
            if (r10 == 0) goto L_0x02a4
            kF.s r11 = new kF.s
            r1 = r11
            r3 = r42
            r4 = r43
            r7 = r14
            r8 = r48
            r9 = r49
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x02a4:
            return
        L_0x02a5:
            r11.m(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kF.C14724t.c(androidx.compose.ui.d, java.lang.String, kF.q, N1.Y, N1.G, N1.G, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C4669d dVar, String str, C14721q qVar, int i10) {
        if (((C4669d.c) C16877v.y0(dVar.i(str, i10, i10))) != null) {
            qVar.c().invoke(qVar.d());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(d dVar, String str, C14721q qVar, Y y10, G g10, G g11, int i10, int i11, C4889m mVar, int i12) {
        c(dVar, str, qVar, y10, g10, g11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
