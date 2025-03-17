package SC;

import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\u000e\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKJ/c;", "LSC/P2;", "tabs", "Lkotlin/Function1;", "", "LXH/N;", "onItemSelected", "Landroidx/compose/ui/d;", "modifier", "", "fluid", "initialSelectedTabIndex", "LSC/Q2;", "variant", "c", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;ZILSC/Q2;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class T2 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: wK.ia$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: wK.ia$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: wK.ia$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<SC.P2> r28, nI.C17642l<? super java.lang.Integer, XH.C16807N> r29, androidx.compose.ui.d r30, boolean r31, int r32, SC.Q2 r33, U0.C4889m r34, int r35, int r36) {
        /*
            r1 = r28
            r2 = r29
            r7 = r35
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 439403770(0x1a30c4fa, float:3.6555063E-23)
            r3 = r34
            U0.m r3 = r3.k(r0)
            r4 = r36 & 1
            if (r4 == 0) goto L_0x0020
            r4 = r7 | 6
            goto L_0x0030
        L_0x0020:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x002f
            boolean r4 = r3.V(r1)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r7
            goto L_0x0030
        L_0x002f:
            r4 = r7
        L_0x0030:
            r6 = r36 & 2
            if (r6 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x0047
        L_0x0037:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x0047
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x0044
            r6 = 32
            goto L_0x0046
        L_0x0044:
            r6 = 16
        L_0x0046:
            r4 = r4 | r6
        L_0x0047:
            r6 = r36 & 4
            if (r6 == 0) goto L_0x0050
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r9 = r30
            goto L_0x0062
        L_0x0050:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r30
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r10
        L_0x0062:
            r10 = r36 & 8
            if (r10 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r11 = r31
            goto L_0x007d
        L_0x006b:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0068
            r11 = r31
            boolean r12 = r3.b(r11)
            if (r12 == 0) goto L_0x007a
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r12
        L_0x007d:
            r12 = r36 & 16
            if (r12 == 0) goto L_0x0086
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r13 = r32
            goto L_0x0098
        L_0x0086:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0083
            r13 = r32
            boolean r14 = r3.d(r13)
            if (r14 == 0) goto L_0x0095
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r4 = r4 | r14
        L_0x0098:
            r14 = r36 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a2
            r4 = r4 | r15
        L_0x009f:
            r15 = r33
            goto L_0x00b4
        L_0x00a2:
            r15 = r15 & r7
            if (r15 != 0) goto L_0x009f
            r15 = r33
            boolean r16 = r3.V(r15)
            if (r16 == 0) goto L_0x00b0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r4 = r4 | r16
        L_0x00b4:
            r16 = 74899(0x12493, float:1.04956E-40)
            r8 = r4 & r16
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r5) goto L_0x00cd
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r3.L()
            r4 = r11
            r5 = r13
            r6 = r15
            goto L_0x0198
        L_0x00cd:
            if (r6 == 0) goto L_0x00d2
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x00d3
        L_0x00d2:
            r5 = r9
        L_0x00d3:
            r6 = 0
            if (r10 == 0) goto L_0x00d9
            r19 = r6
            goto L_0x00db
        L_0x00d9:
            r19 = r11
        L_0x00db:
            if (r12 == 0) goto L_0x00e0
            r20 = r6
            goto L_0x00e2
        L_0x00e0:
            r20 = r13
        L_0x00e2:
            if (r14 == 0) goto L_0x00e9
            SC.Q2 r8 = SC.Q2.Emphasised
            r21 = r8
            goto L_0x00eb
        L_0x00e9:
            r21 = r15
        L_0x00eb:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00f7
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.ui.skapa.SkapaTabs (SkapaTabs.kt:30)"
            U0.C4895p.S(r0, r4, r8, r9)
        L_0x00f7:
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r1, r0)
            r8.<init>(r0)
            java.util.Iterator r0 = r28.iterator()
        L_0x0106:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0142
            java.lang.Object r9 = r0.next()
            SC.P2 r9 = (SC.P2) r9
            java.lang.Integer r10 = r9.a()
            if (r10 == 0) goto L_0x0133
            wK.ia$a r10 = new wK.ia$a
            java.lang.String r23 = r9.b()
            java.lang.Integer r9 = r9.a()
            int r24 = r9.intValue()
            r26 = 4
            r27 = 0
            r25 = 0
            r22 = r10
            r22.<init>(r23, r24, r25, r26, r27)
            r12 = 2
            goto L_0x013e
        L_0x0133:
            wK.ia$b r10 = new wK.ia$b
            java.lang.String r9 = r9.b()
            r11 = 0
            r12 = 2
            r10.<init>(r9, r6, r12, r11)
        L_0x013e:
            r8.add(r10)
            goto L_0x0106
        L_0x0142:
            wK.ka r14 = r21.b()
            r0 = -508064763(0xffffffffe1b78c05, float:-4.2323045E20)
            r3.W(r0)
            r0 = r4 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r0 != r9) goto L_0x0153
            r6 = 1
        L_0x0153:
            java.lang.Object r0 = r3.D()
            if (r6 != 0) goto L_0x0161
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L_0x0169
        L_0x0161:
            SC.R2 r0 = new SC.R2
            r0.<init>(r2)
            r3.u(r0)
        L_0x0169:
            r15 = r0
            nI.l r15 = (nI.C17642l) r15
            r3.P()
            int r0 = r4 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r17 = r0 | r4
            r18 = 16
            r12 = 0
            r9 = r20
            r10 = r5
            r11 = r19
            r16 = r3
            wK.C18496ta.z(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0191
            U0.C4895p.R()
        L_0x0191:
            r9 = r5
            r4 = r19
            r5 = r20
            r6 = r21
        L_0x0198:
            U0.Y0 r10 = r3.n()
            if (r10 == 0) goto L_0x01b0
            SC.S2 r11 = new SC.S2
            r0 = r11
            r1 = r28
            r2 = r29
            r3 = r9
            r7 = r35
            r8 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.T2.c(KJ.c, nI.l, androidx.compose.ui.d, boolean, int, SC.Q2, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, int i10) {
        lVar.invoke(Integer.valueOf(i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, C17642l lVar, d dVar, boolean z10, int i10, Q2 q22, int i11, int i12, C4889m mVar, int i13) {
        c(cVar, lVar, dVar, z10, i10, q22, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
