package SC;

import J1.j;
import Oo.a;
import Oo.b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ac\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "value", "Landroidx/compose/ui/d;", "modifier", "", "customContentDescription", "ratingLabel", "", "numberOfUsersRated", "LSC/l2;", "size", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(FLandroidx/compose/ui/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LSC/l2;LnI/a;LU0/m;II)V", "averageOverallRating", "d", "(Ljava/lang/String;Ljava/lang/Integer;LU0/m;II)Ljava/lang/String;", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.k2  reason: case insensitive filesystem */
public final class C13606k2 {
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(float r20, androidx.compose.ui.d r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, SC.C13610l2 r25, nI.C17631a<XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r8 = r28
            r0 = -452430453(0xffffffffe508758b, float:-4.0275633E22)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.c(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r8
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r8
        L_0x0029:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r21
            goto L_0x0044
        L_0x0032:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r21
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r22
            goto L_0x005f
        L_0x004d:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r22
            boolean r9 = r1.V(r7)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r29 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r23
            goto L_0x007a
        L_0x0068:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r23
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r29 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r24
            goto L_0x0095
        L_0x0083:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r24
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r29 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
        L_0x009c:
            r14 = r25
            goto L_0x00b0
        L_0x009f:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009c
            r14 = r25
            boolean r15 = r1.V(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
        L_0x00b0:
            r15 = r29 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bb
            r3 = r3 | r16
            r0 = r26
            goto L_0x00ce
        L_0x00bb:
            r16 = r8 & r16
            r0 = r26
            if (r16 != 0) goto L_0x00ce
            boolean r17 = r1.F(r0)
            if (r17 == 0) goto L_0x00ca
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r17
        L_0x00ce:
            r17 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00eb
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x00df
            goto L_0x00eb
        L_0x00df:
            r1.L()
            r2 = r5
            r3 = r7
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r26
            goto L_0x016a
        L_0x00eb:
            if (r4 == 0) goto L_0x00f0
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00f1
        L_0x00f0:
            r0 = r5
        L_0x00f1:
            r2 = 0
            if (r6 == 0) goto L_0x00f5
            r7 = r2
        L_0x00f5:
            if (r9 == 0) goto L_0x00f9
            r4 = r2
            goto L_0x00fa
        L_0x00f9:
            r4 = r10
        L_0x00fa:
            if (r11 == 0) goto L_0x00fe
            r5 = r2
            goto L_0x00ff
        L_0x00fe:
            r5 = r12
        L_0x00ff:
            if (r13 == 0) goto L_0x0104
            SC.l2 r6 = SC.C13610l2.Regular
            goto L_0x0105
        L_0x0104:
            r6 = r14
        L_0x0105:
            if (r15 == 0) goto L_0x010a
            r19 = r2
            goto L_0x010c
        L_0x010a:
            r19 = r26
        L_0x010c:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x011b
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.ui.skapa.SkapaRating (SkapaRating.kt:33)"
            r11 = -452430453(0xffffffffe508758b, float:-4.0275633E22)
            U0.C4895p.S(r11, r3, r9, r10)
        L_0x011b:
            r9 = -1641000202(0xffffffff9e3052f6, float:-9.334518E-21)
            r1.W(r9)
            if (r7 != 0) goto L_0x0132
            java.lang.String r9 = java.lang.String.valueOf(r20)
            int r10 = r3 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            r11 = 0
            java.lang.String r9 = d(r9, r5, r1, r10, r11)
            r10 = r9
            goto L_0x0133
        L_0x0132:
            r10 = r7
        L_0x0133:
            r1.P()
            if (r5 == 0) goto L_0x013c
            java.lang.String r2 = r5.toString()
        L_0x013c:
            r13 = r2
            wK.t8 r14 = r6.b()
            r2 = r3 & 14
            int r9 = r3 << 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r2 = r2 | r9
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r9
            r17 = r2 | r3
            r18 = 0
            r9 = r20
            r11 = r0
            r12 = r4
            r15 = r19
            r16 = r1
            wK.C18470r8.h(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0166
            U0.C4895p.R()
        L_0x0166:
            r2 = r0
            r3 = r7
            r7 = r19
        L_0x016a:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x017f
            SC.j2 r11 = new SC.j2
            r0 = r11
            r1 = r20
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13606k2.b(float, androidx.compose.ui.d, java.lang.String, java.lang.String, java.lang.Integer, SC.l2, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(float f10, d dVar, String str, String str2, Integer num, C13610l2 l2Var, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(f10, dVar, str, str2, num, l2Var, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final String d(String str, Integer num, C4889m mVar, int i10, int i11) {
        String str2;
        mVar.W(-1866637531);
        if ((i11 & 2) != 0) {
            num = null;
        }
        if (C4895p.J()) {
            C4895p.S(-1866637531, i10, -1, "com.ingka.ikea.ui.skapa.getContentDescriptionRating (SkapaRating.kt:53)");
        }
        if (num == null) {
            mVar.W(-411022971);
            str2 = j.c(b.f84357E, new Object[]{str, 5}, mVar, 0);
            mVar.P();
        } else {
            mVar.W(-410848596);
            str2 = j.a(a.f84306a, num.intValue(), new Object[]{str, 5, num}, mVar, i10 & 112);
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return str2;
    }
}
