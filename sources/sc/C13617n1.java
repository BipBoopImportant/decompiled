package SC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "text", "", "progress", "LSC/Y0;", "labelPosition", "", "labelTransition", "Lc2/h;", "width", "LXH/N;", "b", "(Landroidx/compose/ui/d;Ljava/lang/String;FLSC/Y0;ZFLU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.n1  reason: case insensitive filesystem */
public final class C13617n1 {
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r18, java.lang.String r19, float r20, SC.Y0 r21, boolean r22, float r23, U0.C4889m r24, int r25, int r26) {
        /*
            r7 = r25
            r0 = 18814899(0x11f17b3, float:2.922069E-38)
            r1 = r24
            U0.m r1 = r1.k(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r18
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r18
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r3 = r18
            r4 = r7
        L_0x0029:
            r5 = r26 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r19
            goto L_0x0044
        L_0x0032:
            r6 = r7 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r19
            boolean r8 = r1.V(r6)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r4 = r4 | r8
        L_0x0044:
            r8 = r26 & 4
            if (r8 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r20
            goto L_0x005f
        L_0x004d:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r20
            boolean r10 = r1.c(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r10
        L_0x005f:
            r10 = r26 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r11 = r21
            goto L_0x007a
        L_0x0068:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r21
            boolean r12 = r1.V(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r12
        L_0x007a:
            r12 = r26 & 16
            if (r12 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r13 = r22
            goto L_0x0095
        L_0x0083:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0080
            r13 = r22
            boolean r14 = r1.b(r13)
            if (r14 == 0) goto L_0x0092
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r14
        L_0x0095:
            r14 = r26 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r4 = r4 | r15
        L_0x009c:
            r15 = r23
            goto L_0x00b1
        L_0x009f:
            r15 = r15 & r7
            if (r15 != 0) goto L_0x009c
            r15 = r23
            boolean r16 = r1.c(r15)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r16
        L_0x00b1:
            r16 = 74899(0x12493, float:1.04956E-40)
            r0 = r4 & r16
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r3) goto L_0x00cc
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x00c2
            goto L_0x00cc
        L_0x00c2:
            r1.L()
            r2 = r18
            r3 = r9
            r4 = r11
            r5 = r13
            goto L_0x0129
        L_0x00cc:
            if (r2 == 0) goto L_0x00d1
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00d3
        L_0x00d1:
            r0 = r18
        L_0x00d3:
            if (r5 == 0) goto L_0x00d7
            r2 = 0
            goto L_0x00d8
        L_0x00d7:
            r2 = r6
        L_0x00d8:
            if (r8 == 0) goto L_0x00dc
            r3 = 0
            goto L_0x00dd
        L_0x00dc:
            r3 = r9
        L_0x00dd:
            if (r10 == 0) goto L_0x00e2
            SC.Y0 r5 = SC.Y0.Center
            goto L_0x00e3
        L_0x00e2:
            r5 = r11
        L_0x00e3:
            if (r12 == 0) goto L_0x00e7
            r6 = 0
            goto L_0x00e8
        L_0x00e7:
            r6 = r13
        L_0x00e8:
            if (r14 == 0) goto L_0x00f4
            r8 = 200(0xc8, float:2.8E-43)
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r17 = r8
            goto L_0x00f6
        L_0x00f4:
            r17 = r15
        L_0x00f6:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0105
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.ui.skapa.SkapaLoadingLinear (SkapaLoadingLinear.kt:37)"
            r10 = 18814899(0x11f17b3, float:2.922069E-38)
            U0.C4895p.S(r10, r4, r8, r9)
        L_0x0105:
            vK.b r11 = r5.b()
            r8 = 517118(0x7e3fe, float:7.24637E-40)
            r15 = r4 & r8
            r16 = 0
            r8 = r0
            r9 = r2
            r10 = r3
            r12 = r6
            r13 = r17
            r14 = r1
            wK.X4.A(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0123
            U0.C4895p.R()
        L_0x0123:
            r4 = r5
            r5 = r6
            r15 = r17
            r6 = r2
            r2 = r0
        L_0x0129:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x013f
            SC.m1 r10 = new SC.m1
            r0 = r10
            r1 = r2
            r2 = r6
            r6 = r15
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13617n1.b(androidx.compose.ui.d, java.lang.String, float, SC.Y0, boolean, float, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, String str, float f10, Y0 y02, boolean z10, float f11, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, str, f10, y02, z10, f11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
