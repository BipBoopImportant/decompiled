package p2;

import h2.C5414d;
import java.util.ArrayList;

/* renamed from: p2.b  reason: case insensitive filesystem */
public class C5757b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: p2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: h2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: h2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: p2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: h2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: p2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: h2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: p2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: p2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: h2.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [h2.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == 2) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r7 == 2) goto L_0x0033;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x03a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:328:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(p2.f r37, h2.C5414d r38, int r39, int r40, p2.C5758c r41) {
        /*
            r0 = r37
            r9 = r38
            r10 = r39
            r1 = r41
            p2.e r11 = r1.f27372a
            p2.e r12 = r1.f27374c
            p2.e r13 = r1.f27373b
            p2.e r14 = r1.f27375d
            p2.e r2 = r1.f27376e
            float r3 = r1.f27382k
            p2.e$b[] r4 = r0.f27439Z
            r4 = r4[r10]
            p2.e$b r5 = p2.e.b.WRAP_CONTENT
            r15 = 1
            if (r4 != r5) goto L_0x001f
            r4 = r15
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x003d
            int r7 = r2.f27491z0
            if (r7 != 0) goto L_0x0029
            r8 = r15
            goto L_0x002a
        L_0x0029:
            r8 = 0
        L_0x002a:
            if (r7 != r15) goto L_0x002f
            r16 = r15
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r7 != r5) goto L_0x0035
        L_0x0033:
            r5 = r15
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            r17 = r16
            r7 = 0
            r16 = r8
            r8 = r11
            goto L_0x004e
        L_0x003d:
            int r7 = r2.f27405A0
            if (r7 != 0) goto L_0x0043
            r8 = r15
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            if (r7 != r15) goto L_0x0049
            r16 = r15
            goto L_0x004b
        L_0x0049:
            r16 = 0
        L_0x004b:
            if (r7 != r5) goto L_0x0035
            goto L_0x0033
        L_0x004e:
            r21 = 0
            if (r7 != 0) goto L_0x0130
            p2.d[] r6 = r8.f27436W
            r6 = r6[r40]
            if (r5 == 0) goto L_0x005b
            r19 = 1
            goto L_0x005d
        L_0x005b:
            r19 = 4
        L_0x005d:
            int r23 = r6.f()
            p2.e$b[] r15 = r8.f27439Z
            r15 = r15[r10]
            r25 = r3
            p2.e$b r3 = p2.e.b.MATCH_CONSTRAINT
            if (r15 != r3) goto L_0x0075
            int[] r15 = r8.f27488y
            r15 = r15[r10]
            if (r15 != 0) goto L_0x0075
            r26 = r7
            r15 = 1
            goto L_0x0078
        L_0x0075:
            r26 = r7
            r15 = 0
        L_0x0078:
            p2.d r7 = r6.f27399f
            if (r7 == 0) goto L_0x0084
            if (r8 == r11) goto L_0x0084
            int r7 = r7.f()
            int r23 = r23 + r7
        L_0x0084:
            r7 = r23
            if (r5 == 0) goto L_0x0091
            if (r8 == r11) goto L_0x0091
            if (r8 == r13) goto L_0x0091
            r23 = r2
            r19 = 8
            goto L_0x0093
        L_0x0091:
            r23 = r2
        L_0x0093:
            p2.d r2 = r6.f27399f
            if (r2 == 0) goto L_0x00cd
            if (r8 != r13) goto L_0x00a4
            r27 = r11
            h2.i r11 = r6.f27402i
            h2.i r2 = r2.f27402i
            r1 = 6
            r9.h(r11, r2, r7, r1)
            goto L_0x00af
        L_0x00a4:
            r27 = r11
            h2.i r1 = r6.f27402i
            h2.i r2 = r2.f27402i
            r11 = 8
            r9.h(r1, r2, r7, r11)
        L_0x00af:
            if (r15 == 0) goto L_0x00b5
            if (r5 != 0) goto L_0x00b5
            r19 = 5
        L_0x00b5:
            if (r8 != r13) goto L_0x00c1
            if (r5 == 0) goto L_0x00c1
            boolean r1 = r8.j0(r10)
            if (r1 == 0) goto L_0x00c1
            r1 = 5
            goto L_0x00c3
        L_0x00c1:
            r1 = r19
        L_0x00c3:
            h2.i r2 = r6.f27402i
            p2.d r6 = r6.f27399f
            h2.i r6 = r6.f27402i
            r9.e(r2, r6, r7, r1)
            goto L_0x00cf
        L_0x00cd:
            r27 = r11
        L_0x00cf:
            if (r4 == 0) goto L_0x0103
            int r1 = r8.X()
            r2 = 8
            if (r1 == r2) goto L_0x00f1
            p2.e$b[] r1 = r8.f27439Z
            r1 = r1[r10]
            if (r1 != r3) goto L_0x00f1
            p2.d[] r1 = r8.f27436W
            int r2 = r40 + 1
            r2 = r1[r2]
            h2.i r2 = r2.f27402i
            r1 = r1[r40]
            h2.i r1 = r1.f27402i
            r3 = 0
            r6 = 5
            r9.h(r2, r1, r3, r6)
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            p2.d[] r1 = r8.f27436W
            r1 = r1[r40]
            h2.i r1 = r1.f27402i
            p2.d[] r2 = r0.f27436W
            r2 = r2[r40]
            h2.i r2 = r2.f27402i
            r6 = 8
            r9.h(r1, r2, r3, r6)
        L_0x0103:
            p2.d[] r1 = r8.f27436W
            int r2 = r40 + 1
            r1 = r1[r2]
            p2.d r1 = r1.f27399f
            if (r1 == 0) goto L_0x011e
            p2.e r1 = r1.f27397d
            p2.d[] r2 = r1.f27436W
            r2 = r2[r40]
            p2.d r2 = r2.f27399f
            if (r2 == 0) goto L_0x011e
            p2.e r2 = r2.f27397d
            if (r2 == r8) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r21 = r1
        L_0x011e:
            if (r21 == 0) goto L_0x0125
            r8 = r21
            r7 = r26
            goto L_0x0126
        L_0x0125:
            r7 = 1
        L_0x0126:
            r1 = r41
            r2 = r23
            r3 = r25
            r11 = r27
            goto L_0x004e
        L_0x0130:
            r23 = r2
            r25 = r3
            r27 = r11
            if (r14 == 0) goto L_0x0194
            p2.d[] r1 = r12.f27436W
            int r2 = r40 + 1
            r1 = r1[r2]
            p2.d r1 = r1.f27399f
            if (r1 == 0) goto L_0x0194
            p2.d[] r1 = r14.f27436W
            r1 = r1[r2]
            p2.e$b[] r3 = r14.f27439Z
            r3 = r3[r10]
            p2.e$b r6 = p2.e.b.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x016a
            int[] r3 = r14.f27488y
            r3 = r3[r10]
            if (r3 != 0) goto L_0x016a
            if (r5 != 0) goto L_0x016a
            p2.d r3 = r1.f27399f
            p2.e r6 = r3.f27397d
            if (r6 != r0) goto L_0x016a
            h2.i r6 = r1.f27402i
            h2.i r3 = r3.f27402i
            int r7 = r1.f()
            int r7 = -r7
            r8 = 5
            r9.e(r6, r3, r7, r8)
            goto L_0x0180
        L_0x016a:
            r8 = 5
            if (r5 == 0) goto L_0x0180
            p2.d r3 = r1.f27399f
            p2.e r6 = r3.f27397d
            if (r6 != r0) goto L_0x0180
            h2.i r6 = r1.f27402i
            h2.i r3 = r3.f27402i
            int r7 = r1.f()
            int r7 = -r7
            r11 = 4
            r9.e(r6, r3, r7, r11)
        L_0x0180:
            h2.i r3 = r1.f27402i
            p2.d[] r6 = r12.f27436W
            r2 = r6[r2]
            p2.d r2 = r2.f27399f
            h2.i r2 = r2.f27402i
            int r1 = r1.f()
            int r1 = -r1
            r6 = 6
            r9.j(r3, r2, r1, r6)
            goto L_0x0195
        L_0x0194:
            r8 = 5
        L_0x0195:
            if (r4 == 0) goto L_0x01ae
            p2.d[] r0 = r0.f27436W
            int r1 = r40 + 1
            r0 = r0[r1]
            h2.i r0 = r0.f27402i
            p2.d[] r2 = r12.f27436W
            r1 = r2[r1]
            h2.i r2 = r1.f27402i
            int r1 = r1.f()
            r3 = 8
            r9.h(r0, r2, r1, r3)
        L_0x01ae:
            r0 = r41
            java.util.ArrayList<p2.e> r1 = r0.f27379h
            if (r1 == 0) goto L_0x025f
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x025f
            boolean r3 = r0.f27389r
            if (r3 == 0) goto L_0x01c7
            boolean r3 = r0.f27391t
            if (r3 != 0) goto L_0x01c7
            int r3 = r0.f27381j
            float r3 = (float) r3
            goto L_0x01c9
        L_0x01c7:
            r3 = r25
        L_0x01c9:
            r4 = 0
            r29 = r4
            r7 = r21
            r6 = 0
        L_0x01cf:
            if (r6 >= r2) goto L_0x025f
            java.lang.Object r11 = r1.get(r6)
            p2.e r11 = (p2.e) r11
            float[] r15 = r11.f27411D0
            r15 = r15[r10]
            int r20 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r20 >= 0) goto L_0x01fb
            boolean r15 = r0.f27391t
            if (r15 == 0) goto L_0x01f6
            p2.d[] r11 = r11.f27436W
            int r15 = r40 + 1
            r15 = r11[r15]
            h2.i r15 = r15.f27402i
            r11 = r11[r40]
            h2.i r11 = r11.f27402i
            r4 = 4
            r8 = 0
            r9.e(r15, r11, r8, r4)
            r4 = r8
            goto L_0x0213
        L_0x01f6:
            r4 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x01f9:
            r8 = 0
            goto L_0x01fd
        L_0x01fb:
            r4 = 4
            goto L_0x01f9
        L_0x01fd:
            int r19 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r19 != 0) goto L_0x0218
            p2.d[] r11 = r11.f27436W
            int r15 = r40 + 1
            r15 = r11[r15]
            h2.i r15 = r15.f27402i
            r11 = r11[r40]
            h2.i r11 = r11.f27402i
            r4 = 0
            r8 = 8
            r9.e(r15, r11, r4, r8)
        L_0x0213:
            r25 = r1
            r18 = r2
            goto L_0x0255
        L_0x0218:
            r4 = 0
            if (r7 == 0) goto L_0x024e
            p2.d[] r7 = r7.f27436W
            r8 = r7[r40]
            h2.i r8 = r8.f27402i
            int r18 = r40 + 1
            r7 = r7[r18]
            h2.i r7 = r7.f27402i
            p2.d[] r4 = r11.f27436W
            r25 = r1
            r1 = r4[r40]
            h2.i r1 = r1.f27402i
            r4 = r4[r18]
            h2.i r4 = r4.f27402i
            r18 = r2
            h2.b r2 = r38.r()
            r28 = r2
            r30 = r3
            r31 = r15
            r32 = r8
            r33 = r7
            r34 = r1
            r35 = r4
            r28.l(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r2)
            goto L_0x0252
        L_0x024e:
            r25 = r1
            r18 = r2
        L_0x0252:
            r7 = r11
            r29 = r15
        L_0x0255:
            int r6 = r6 + 1
            r2 = r18
            r1 = r25
            r4 = 0
            r8 = 5
            goto L_0x01cf
        L_0x025f:
            if (r13 == 0) goto L_0x0268
            if (r13 == r14) goto L_0x0265
            if (r5 == 0) goto L_0x0268
        L_0x0265:
            r11 = r27
            goto L_0x026b
        L_0x0268:
            r11 = r27
            goto L_0x02bd
        L_0x026b:
            p2.d[] r0 = r11.f27436W
            r0 = r0[r40]
            p2.d[] r1 = r12.f27436W
            int r2 = r40 + 1
            r1 = r1[r2]
            p2.d r0 = r0.f27399f
            if (r0 == 0) goto L_0x027d
            h2.i r0 = r0.f27402i
            r3 = r0
            goto L_0x027f
        L_0x027d:
            r3 = r21
        L_0x027f:
            p2.d r0 = r1.f27399f
            if (r0 == 0) goto L_0x0287
            h2.i r0 = r0.f27402i
            r5 = r0
            goto L_0x0289
        L_0x0287:
            r5 = r21
        L_0x0289:
            p2.d[] r0 = r13.f27436W
            r0 = r0[r40]
            if (r14 == 0) goto L_0x0293
            p2.d[] r1 = r14.f27436W
            r1 = r1[r2]
        L_0x0293:
            if (r3 == 0) goto L_0x04da
            if (r5 == 0) goto L_0x04da
            if (r10 != 0) goto L_0x029f
            r2 = r23
            float r2 = r2.f27469o0
        L_0x029d:
            r4 = r2
            goto L_0x02a4
        L_0x029f:
            r2 = r23
            float r2 = r2.f27471p0
            goto L_0x029d
        L_0x02a4:
            int r6 = r0.f()
            int r7 = r1.f()
            h2.i r2 = r0.f27402i
            h2.i r8 = r1.f27402i
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04da
        L_0x02bd:
            if (r16 == 0) goto L_0x03ae
            if (r13 == 0) goto L_0x03ae
            int r1 = r0.f27381j
            if (r1 <= 0) goto L_0x02cc
            int r0 = r0.f27380i
            if (r0 != r1) goto L_0x02cc
            r24 = 1
            goto L_0x02ce
        L_0x02cc:
            r24 = 0
        L_0x02ce:
            r8 = r13
            r15 = r8
        L_0x02d0:
            if (r15 == 0) goto L_0x04da
            p2.e[] r0 = r15.f27415F0
            r0 = r0[r10]
            r7 = r0
        L_0x02d7:
            if (r7 == 0) goto L_0x02e6
            int r0 = r7.X()
            r6 = 8
            if (r0 != r6) goto L_0x02e8
            p2.e[] r0 = r7.f27415F0
            r7 = r0[r10]
            goto L_0x02d7
        L_0x02e6:
            r6 = 8
        L_0x02e8:
            if (r7 != 0) goto L_0x02f5
            if (r15 != r14) goto L_0x02ed
            goto L_0x02f5
        L_0x02ed:
            r22 = r7
        L_0x02ef:
            r18 = r8
            r20 = 5
            goto L_0x039e
        L_0x02f5:
            p2.d[] r0 = r15.f27436W
            r0 = r0[r40]
            h2.i r1 = r0.f27402i
            p2.d r2 = r0.f27399f
            if (r2 == 0) goto L_0x0302
            h2.i r2 = r2.f27402i
            goto L_0x0304
        L_0x0302:
            r2 = r21
        L_0x0304:
            if (r8 == r15) goto L_0x030f
            p2.d[] r2 = r8.f27436W
            int r3 = r40 + 1
            r2 = r2[r3]
            h2.i r2 = r2.f27402i
            goto L_0x031e
        L_0x030f:
            if (r15 != r13) goto L_0x031e
            p2.d[] r2 = r11.f27436W
            r2 = r2[r40]
            p2.d r2 = r2.f27399f
            if (r2 == 0) goto L_0x031c
            h2.i r2 = r2.f27402i
            goto L_0x031e
        L_0x031c:
            r2 = r21
        L_0x031e:
            int r0 = r0.f()
            p2.d[] r3 = r15.f27436W
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.f()
            if (r7 == 0) goto L_0x0337
            p2.d[] r5 = r7.f27436W
            r5 = r5[r40]
            h2.i r6 = r5.f27402i
        L_0x0334:
            r37 = r7
            goto L_0x0346
        L_0x0337:
            p2.d[] r5 = r12.f27436W
            r5 = r5[r4]
            p2.d r5 = r5.f27399f
            if (r5 == 0) goto L_0x0342
            h2.i r6 = r5.f27402i
            goto L_0x0334
        L_0x0342:
            r37 = r7
            r6 = r21
        L_0x0346:
            p2.d[] r7 = r15.f27436W
            r7 = r7[r4]
            h2.i r7 = r7.f27402i
            if (r5 == 0) goto L_0x0353
            int r5 = r5.f()
            int r3 = r3 + r5
        L_0x0353:
            p2.d[] r5 = r8.f27436W
            r5 = r5[r4]
            int r5 = r5.f()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x039a
            if (r2 == 0) goto L_0x039a
            if (r6 == 0) goto L_0x039a
            if (r7 == 0) goto L_0x039a
            if (r15 != r13) goto L_0x036e
            p2.d[] r0 = r13.f27436W
            r0 = r0[r40]
            int r0 = r0.f()
        L_0x036e:
            r5 = r0
            if (r15 != r14) goto L_0x037c
            p2.d[] r0 = r14.f27436W
            r0 = r0[r4]
            int r0 = r0.f()
            r18 = r0
            goto L_0x037e
        L_0x037c:
            r18 = r3
        L_0x037e:
            if (r24 == 0) goto L_0x0383
            r19 = 8
            goto L_0x0385
        L_0x0383:
            r19 = 5
        L_0x0385:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r20 = 5
            r6 = r7
            r22 = r37
            r7 = r18
            r18 = r8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x039e
        L_0x039a:
            r22 = r37
            goto L_0x02ef
        L_0x039e:
            int r0 = r15.X()
            r8 = 8
            if (r0 == r8) goto L_0x03a7
            goto L_0x03a9
        L_0x03a7:
            r15 = r18
        L_0x03a9:
            r8 = r15
            r15 = r22
            goto L_0x02d0
        L_0x03ae:
            r8 = 8
            if (r17 == 0) goto L_0x04da
            if (r13 == 0) goto L_0x04da
            int r1 = r0.f27381j
            if (r1 <= 0) goto L_0x03bf
            int r0 = r0.f27380i
            if (r0 != r1) goto L_0x03bf
            r24 = 1
            goto L_0x03c1
        L_0x03bf:
            r24 = 0
        L_0x03c1:
            r7 = r13
            r15 = r7
        L_0x03c3:
            if (r15 == 0) goto L_0x0485
            p2.e[] r0 = r15.f27415F0
            r0 = r0[r10]
        L_0x03c9:
            if (r0 == 0) goto L_0x03d6
            int r1 = r0.X()
            if (r1 != r8) goto L_0x03d6
            p2.e[] r0 = r0.f27415F0
            r0 = r0[r10]
            goto L_0x03c9
        L_0x03d6:
            if (r15 == r13) goto L_0x0470
            if (r15 == r14) goto L_0x0470
            if (r0 == 0) goto L_0x0470
            if (r0 != r14) goto L_0x03e1
            r6 = r21
            goto L_0x03e2
        L_0x03e1:
            r6 = r0
        L_0x03e2:
            p2.d[] r0 = r15.f27436W
            r0 = r0[r40]
            h2.i r1 = r0.f27402i
            p2.d r2 = r0.f27399f
            if (r2 == 0) goto L_0x03ee
            h2.i r2 = r2.f27402i
        L_0x03ee:
            p2.d[] r2 = r7.f27436W
            int r3 = r40 + 1
            r2 = r2[r3]
            h2.i r2 = r2.f27402i
            int r0 = r0.f()
            p2.d[] r4 = r15.f27436W
            r4 = r4[r3]
            int r4 = r4.f()
            if (r6 == 0) goto L_0x041b
            p2.d[] r5 = r6.f27436W
            r5 = r5[r40]
            h2.i r8 = r5.f27402i
            r37 = r6
            p2.d r6 = r5.f27399f
            if (r6 == 0) goto L_0x0413
            h2.i r6 = r6.f27402i
            goto L_0x0415
        L_0x0413:
            r6 = r21
        L_0x0415:
            r36 = r8
            r8 = r6
            r6 = r36
            goto L_0x042e
        L_0x041b:
            r37 = r6
            p2.d[] r5 = r14.f27436W
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0426
            h2.i r6 = r5.f27402i
            goto L_0x0428
        L_0x0426:
            r6 = r21
        L_0x0428:
            p2.d[] r8 = r15.f27436W
            r8 = r8[r3]
            h2.i r8 = r8.f27402i
        L_0x042e:
            if (r5 == 0) goto L_0x0435
            int r5 = r5.f()
            int r4 = r4 + r5
        L_0x0435:
            r18 = r4
            p2.d[] r4 = r7.f27436W
            r3 = r4[r3]
            int r3 = r3.f()
            int r3 = r3 + r0
            if (r24 == 0) goto L_0x0445
            r20 = 8
            goto L_0x0447
        L_0x0445:
            r20 = 4
        L_0x0447:
            if (r1 == 0) goto L_0x0465
            if (r2 == 0) goto L_0x0465
            if (r6 == 0) goto L_0x0465
            if (r8 == 0) goto L_0x0465
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r19 = 4
            r5 = r6
            r22 = r37
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r20
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x046d
        L_0x0465:
            r22 = r37
            r23 = r7
            r10 = 8
            r19 = 4
        L_0x046d:
            r0 = r22
            goto L_0x0475
        L_0x0470:
            r23 = r7
            r10 = r8
            r19 = 4
        L_0x0475:
            int r1 = r15.X()
            if (r1 == r10) goto L_0x047d
            r7 = r15
            goto L_0x047f
        L_0x047d:
            r7 = r23
        L_0x047f:
            r15 = r0
            r8 = r10
            r10 = r39
            goto L_0x03c3
        L_0x0485:
            p2.d[] r0 = r13.f27436W
            r0 = r0[r40]
            p2.d[] r1 = r11.f27436W
            r1 = r1[r40]
            p2.d r1 = r1.f27399f
            p2.d[] r2 = r14.f27436W
            int r3 = r40 + 1
            r10 = r2[r3]
            p2.d[] r2 = r12.f27436W
            r2 = r2[r3]
            p2.d r11 = r2.f27399f
            r15 = 5
            if (r1 == 0) goto L_0x04ca
            if (r13 == r14) goto L_0x04ac
            h2.i r2 = r0.f27402i
            h2.i r1 = r1.f27402i
            int r0 = r0.f()
            r9.e(r2, r1, r0, r15)
            goto L_0x04ca
        L_0x04ac:
            if (r11 == 0) goto L_0x04ca
            h2.i r2 = r0.f27402i
            h2.i r3 = r1.f27402i
            int r4 = r0.f()
            h2.i r5 = r10.f27402i
            h2.i r6 = r11.f27402i
            int r7 = r10.f()
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r8
            r8 = r15
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04ca:
            if (r11 == 0) goto L_0x04da
            if (r13 == r14) goto L_0x04da
            h2.i r0 = r10.f27402i
            h2.i r1 = r11.f27402i
            int r2 = r10.f()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04da:
            if (r16 != 0) goto L_0x04de
            if (r17 == 0) goto L_0x0537
        L_0x04de:
            if (r13 == 0) goto L_0x0537
            if (r13 == r14) goto L_0x0537
            p2.d[] r0 = r13.f27436W
            r1 = r0[r40]
            if (r14 != 0) goto L_0x04e9
            r14 = r13
        L_0x04e9:
            p2.d[] r2 = r14.f27436W
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            p2.d r4 = r1.f27399f
            if (r4 == 0) goto L_0x04f7
            h2.i r4 = r4.f27402i
            goto L_0x04f9
        L_0x04f7:
            r4 = r21
        L_0x04f9:
            p2.d r5 = r2.f27399f
            if (r5 == 0) goto L_0x0500
            h2.i r5 = r5.f27402i
            goto L_0x0502
        L_0x0500:
            r5 = r21
        L_0x0502:
            if (r12 == r14) goto L_0x0512
            p2.d[] r5 = r12.f27436W
            r5 = r5[r3]
            p2.d r5 = r5.f27399f
            if (r5 == 0) goto L_0x0510
            h2.i r5 = r5.f27402i
            r21 = r5
        L_0x0510:
            r5 = r21
        L_0x0512:
            if (r13 != r14) goto L_0x0516
            r2 = r0[r3]
        L_0x0516:
            if (r4 == 0) goto L_0x0537
            if (r5 == 0) goto L_0x0537
            int r6 = r1.f()
            p2.d[] r0 = r14.f27436W
            r0 = r0[r3]
            int r7 = r0.f()
            h2.i r1 = r1.f27402i
            h2.i r8 = r2.f27402i
            r10 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r2 = r4
            r3 = r6
            r4 = r11
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0537:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C5757b.a(p2.f, h2.d, int, int, p2.c):void");
    }

    public static void b(f fVar, C5414d dVar, ArrayList<e> arrayList, int i10) {
        int i11;
        C5758c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i12 = fVar.f27503W0;
            cVarArr = fVar.f27506Z0;
            i11 = 0;
        } else {
            i12 = fVar.f27504X0;
            cVarArr = fVar.f27505Y0;
            i11 = 2;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            C5758c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f27372a)) {
                a(fVar, dVar, i10, i11, cVar);
            }
        }
    }
}
