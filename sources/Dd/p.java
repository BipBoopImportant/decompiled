package Dd;

import N1.Y;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "LN1/Y;", "style", "LXH/N;", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;JLN1/Y;LU0/m;II)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r30, androidx.compose.ui.d r31, long r32, N1.Y r34, U0.C4889m r35, int r36, int r37) {
        /*
            r2 = r30
            r3 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1982508964(0x762aafa4, float:8.654813E32)
            r1 = r35
            U0.m r1 = r1.k(r0)
            r4 = r37 & 1
            if (r4 == 0) goto L_0x0019
            r4 = r3 | 6
            goto L_0x0029
        L_0x0019:
            r4 = r3 & 6
            if (r4 != 0) goto L_0x0028
            boolean r4 = r1.V(r2)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r3
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r31
            goto L_0x0044
        L_0x0032:
            r6 = r3 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r31
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r3 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r37 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r32
            boolean r9 = r1.e(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r32
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r32
        L_0x005f:
            r9 = r3 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0078
            r9 = r37 & 8
            if (r9 != 0) goto L_0x0072
            r9 = r34
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r9 = r34
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r10
            goto L_0x007a
        L_0x0078:
            r9 = r34
        L_0x007a:
            r10 = r4 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0091
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            r1.L()
            r29 = r1
            r2 = r6
            r3 = r7
            r5 = r9
            goto L_0x014a
        L_0x0091:
            r1.G()
            r10 = r3 & 1
            if (r10 == 0) goto L_0x00b5
            boolean r10 = r1.O()
            if (r10 == 0) goto L_0x009f
            goto L_0x00b5
        L_0x009f:
            r1.L()
            r5 = r37 & 4
            if (r5 == 0) goto L_0x00a8
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a8:
            r5 = r37 & 8
            if (r5 == 0) goto L_0x00ae
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ae:
            r25 = r6
            r26 = r7
        L_0x00b2:
            r28 = r9
            goto L_0x00f1
        L_0x00b5:
            if (r5 == 0) goto L_0x00ba
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x00bb
        L_0x00ba:
            r5 = r6
        L_0x00bb:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x00ce
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r1, r7)
            long r6 = r6.G0()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00cf
        L_0x00ce:
            r6 = r7
        L_0x00cf:
            r8 = r37 & 8
            if (r8 == 0) goto L_0x00ec
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.w r8 = r8.b(r1, r9)
            tK.c r8 = r8.a()
            N1.Y r8 = r8.a()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r25 = r5
            r26 = r6
            r28 = r8
            goto L_0x00f1
        L_0x00ec:
            r25 = r5
            r26 = r6
            goto L_0x00b2
        L_0x00f1:
            r1.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0100
            r5 = -1
            java.lang.String r6 = "com.ikea.kompassmap.ui.components.SkapaText (SkapaText.kt:15)"
            U0.C4895p.S(r0, r4, r5, r6)
        L_0x0100:
            tK.v r0 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.w r0 = r0.b(r1, r5)
            S1.m r8 = r0.b()
            r0 = r4 & 1022(0x3fe, float:1.432E-42)
            r22 = r0
            int r0 = r4 << 9
            r4 = 3670016(0x380000, float:5.142788E-39)
            r23 = r0 & r4
            r24 = 65464(0xffb8, float:9.1735E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r30
            r29 = r1
            r1 = r25
            r2 = r26
            r20 = r28
            r21 = r29
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0144
            U0.C4895p.R()
        L_0x0144:
            r2 = r25
            r3 = r26
            r5 = r28
        L_0x014a:
            U0.Y0 r8 = r29.n()
            if (r8 == 0) goto L_0x015f
            Dd.o r9 = new Dd.o
            r0 = r9
            r1 = r30
            r6 = r36
            r7 = r37
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.a(r9)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.p.b(java.lang.String, androidx.compose.ui.d, long, N1.Y, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, d dVar, long j10, Y y10, int i10, int i11, C4889m mVar, int i12) {
        b(str, dVar, j10, y10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
