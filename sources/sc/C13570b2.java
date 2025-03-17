package SC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "value", "", "increaseButtonContentDescription", "decreaseButtonContentDescription", "Landroidx/compose/ui/d;", "modifier", "minValue", "maxValue", "LSC/c2;", "size", "", "enabled", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "b", "(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;IILSC/c2;ZLnI/l;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.b2  reason: case insensitive filesystem */
public final class C13570b2 {
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r23, java.lang.String r24, java.lang.String r25, androidx.compose.ui.d r26, int r27, int r28, SC.C13574c2 r29, boolean r30, nI.C17642l<? super java.lang.Integer, XH.C16807N> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r13 = r31
            r14 = r33
            r15 = r34
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = -1808010727(0xffffffff943bf219, float:-9.488833E-27)
            r1 = r32
            U0.m r12 = r1.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r14 | 6
            r11 = r23
            goto L_0x002f
        L_0x001d:
            r1 = r14 & 6
            r11 = r23
            if (r1 != 0) goto L_0x002e
            boolean r1 = r12.d(r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0038
            r1 = r1 | 48
            r10 = r24
            goto L_0x004a
        L_0x0038:
            r2 = r14 & 48
            r10 = r24
            if (r2 != 0) goto L_0x004a
            boolean r2 = r12.V(r10)
            if (r2 == 0) goto L_0x0047
            r2 = 32
            goto L_0x0049
        L_0x0047:
            r2 = 16
        L_0x0049:
            r1 = r1 | r2
        L_0x004a:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            r9 = r25
            goto L_0x0065
        L_0x0053:
            r2 = r14 & 384(0x180, float:5.38E-43)
            r9 = r25
            if (r2 != 0) goto L_0x0065
            boolean r2 = r12.V(r9)
            if (r2 == 0) goto L_0x0062
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r2
        L_0x0065:
            r2 = r15 & 8
            if (r2 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r3 = r26
            goto L_0x0080
        L_0x006e:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006b
            r3 = r26
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x007d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r4
        L_0x0080:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r5 = r27
            goto L_0x009b
        L_0x0089:
            r5 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r27
            boolean r6 = r12.d(r5)
            if (r6 == 0) goto L_0x0098
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r6
        L_0x009b:
            r6 = r15 & 32
            r7 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00a5
            r1 = r1 | r7
        L_0x00a2:
            r7 = r28
            goto L_0x00b6
        L_0x00a5:
            r7 = r7 & r14
            if (r7 != 0) goto L_0x00a2
            r7 = r28
            boolean r8 = r12.d(r7)
            if (r8 == 0) goto L_0x00b3
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r1 = r1 | r8
        L_0x00b6:
            r8 = r15 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r8 == 0) goto L_0x00c1
            r1 = r1 | r16
            r0 = r29
            goto L_0x00d4
        L_0x00c1:
            r16 = r14 & r16
            r0 = r29
            if (r16 != 0) goto L_0x00d4
            boolean r17 = r12.V(r0)
            if (r17 == 0) goto L_0x00d0
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r1 = r1 | r17
        L_0x00d4:
            r0 = r15 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00df
            r1 = r1 | r17
            r3 = r30
            goto L_0x00f2
        L_0x00df:
            r17 = r14 & r17
            r3 = r30
            if (r17 != 0) goto L_0x00f2
            boolean r17 = r12.b(r3)
            if (r17 == 0) goto L_0x00ee
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r1 = r1 | r17
        L_0x00f2:
            r3 = r15 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00fb
            r1 = r1 | r17
            goto L_0x010b
        L_0x00fb:
            r3 = r14 & r17
            if (r3 != 0) goto L_0x010b
            boolean r3 = r12.F(r13)
            if (r3 == 0) goto L_0x0108
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x0108:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010a:
            r1 = r1 | r3
        L_0x010b:
            r3 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r3 & r1
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x012b
            boolean r3 = r12.l()
            if (r3 != 0) goto L_0x011b
            goto L_0x012b
        L_0x011b:
            r12.L()
            r4 = r26
            r5 = r27
            r8 = r30
            r6 = r7
            r16 = r12
            r7 = r29
            goto L_0x01bb
        L_0x012b:
            if (r2 == 0) goto L_0x0132
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r17 = r2
            goto L_0x0134
        L_0x0132:
            r17 = r26
        L_0x0134:
            if (r4 == 0) goto L_0x013a
            r2 = 0
            r18 = r2
            goto L_0x013c
        L_0x013a:
            r18 = r27
        L_0x013c:
            if (r6 == 0) goto L_0x0143
            r2 = 999(0x3e7, float:1.4E-42)
            r19 = r2
            goto L_0x0145
        L_0x0143:
            r19 = r7
        L_0x0145:
            if (r8 == 0) goto L_0x014c
            SC.c2 r2 = SC.C13574c2.Medium
            r20 = r2
            goto L_0x014e
        L_0x014c:
            r20 = r29
        L_0x014e:
            if (r0 == 0) goto L_0x0154
            r0 = 1
            r21 = r0
            goto L_0x0156
        L_0x0154:
            r21 = r30
        L_0x0156:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0165
            r0 = -1
            java.lang.String r2 = "com.ingka.ikea.ui.skapa.SkapaQuantityStepper (SkapaQuantityStepper.kt:29)"
            r3 = -1808010727(0xffffffff943bf219, float:-9.488833E-27)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x0165:
            wK.R7 r4 = r20.b()
            r0 = r1 & 14
            int r2 = r1 >> 6
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r1 << 18
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r0 = r0 | r2
            int r1 = r1 << 3
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r16 = r0 | r1
            r22 = 64
            r6 = 0
            r0 = r23
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r24
            r8 = r25
            r9 = r31
            r10 = r12
            r11 = r16
            r16 = r12
            r12 = r22
            wK.P7.m(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01b1
            U0.C4895p.R()
        L_0x01b1:
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
        L_0x01bb:
            U0.Y0 r12 = r16.n()
            if (r12 == 0) goto L_0x01d7
            SC.a2 r11 = new SC.a2
            r0 = r11
            r1 = r23
            r2 = r24
            r3 = r25
            r9 = r31
            r10 = r33
            r13 = r11
            r11 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13570b2.b(int, java.lang.String, java.lang.String, androidx.compose.ui.d, int, int, SC.c2, boolean, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, String str, String str2, d dVar, int i11, int i12, C13574c2 c2Var, boolean z10, C17642l lVar, int i13, int i14, C4889m mVar, int i15) {
        b(i10, str, str2, dVar, i11, i12, c2Var, z10, lVar, mVar, M0.a(i13 | 1), i14);
        return C16807N.f139792a;
    }
}
