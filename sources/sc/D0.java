package SC;

import TC.C13679b;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "LTC/b;", "style", "", "active", "LSC/B0;", "color", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;LTC/b;ZLSC/B0;LnI/a;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D0 {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r18, androidx.compose.ui.d r19, TC.C13679b r20, boolean r21, SC.B0 r22, nI.C17631a<XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
        /*
            r10 = r18
            r11 = r23
            r12 = r25
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1994542543(0xffffffff891db231, float:-1.8981973E-33)
            r1 = r24
            U0.m r13 = r1.k(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r12 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r13.V(r10)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r12
            goto L_0x0030
        L_0x002f:
            r1 = r12
        L_0x0030:
            r2 = r26 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
        L_0x0036:
            r3 = r19
            goto L_0x004b
        L_0x0039:
            r3 = r12 & 48
            if (r3 != 0) goto L_0x0036
            r3 = r19
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r26 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r5 = r20
            goto L_0x0066
        L_0x0054:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0051
            r5 = r20
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
        L_0x0066:
            r6 = r26 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r7 = r21
            goto L_0x0081
        L_0x006f:
            r7 = r12 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006c
            r7 = r21
            boolean r8 = r13.b(r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r8
        L_0x0081:
            r8 = r26 & 16
            if (r8 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r9 = r22
            goto L_0x009c
        L_0x008a:
            r9 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0087
            r9 = r22
            boolean r14 = r13.V(r9)
            if (r14 == 0) goto L_0x0099
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r14
        L_0x009c:
            r14 = r26 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a4
            r1 = r1 | r15
            goto L_0x00b4
        L_0x00a4:
            r14 = r12 & r15
            if (r14 != 0) goto L_0x00b4
            boolean r14 = r13.F(r11)
            if (r14 == 0) goto L_0x00b1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r1 = r1 | r14
        L_0x00b4:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00cd
            boolean r14 = r13.l()
            if (r14 != 0) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            r13.L()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r9
            goto L_0x0130
        L_0x00cd:
            if (r2 == 0) goto L_0x00d3
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r14 = r2
            goto L_0x00d4
        L_0x00d3:
            r14 = r3
        L_0x00d4:
            if (r4 == 0) goto L_0x00da
            TC.b$a$b r2 = TC.C13679b.a.C2856b.f116680a
            r15 = r2
            goto L_0x00db
        L_0x00da:
            r15 = r5
        L_0x00db:
            if (r6 == 0) goto L_0x00e1
            r2 = 0
            r16 = r2
            goto L_0x00e3
        L_0x00e1:
            r16 = r7
        L_0x00e3:
            if (r8 == 0) goto L_0x00ea
            SC.B0 r2 = SC.B0.Default
            r17 = r2
            goto L_0x00ec
        L_0x00ea:
            r17 = r9
        L_0x00ec:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00f8
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.ui.skapa.SkapaHyperlink (SkapaHyperlink.kt:30)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00f8:
            int r0 = r1 >> 6
            r2 = r0 & 14
            N1.Y r3 = r15.a(r13, r2)
            wK.a3 r4 = r17.b()
            r2 = r1 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r1 = r1 << 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r8 = r0 | r1
            r9 = 32
            r5 = 0
            r0 = r18
            r1 = r16
            r2 = r14
            r6 = r23
            r7 = r13
            wK.C18297d3.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x012a
            U0.C4895p.R()
        L_0x012a:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
        L_0x0130:
            U0.Y0 r9 = r13.n()
            if (r9 == 0) goto L_0x0147
            SC.C0 r13 = new SC.C0
            r0 = r13
            r1 = r18
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r13)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.D0.b(java.lang.String, androidx.compose.ui.d, TC.b, boolean, SC.B0, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, d dVar, C13679b bVar, boolean z10, B0 b02, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(str, dVar, bVar, z10, b02, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
