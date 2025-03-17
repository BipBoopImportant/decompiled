package K6;

import android.util.Pair;

/* renamed from: K6.l  reason: case insensitive filesystem */
public final class C6591l {
    private static float a(float f10) {
        return ((float) Math.round(f10 * 100.0f)) / 100.0f;
    }

    private static Pair<Float, Float> b(float[] fArr) {
        float f10 = fArr[0];
        float f11 = f10;
        for (float f12 : fArr) {
            if (f12 < f10) {
                f10 = f12;
            } else if (f12 > f11) {
                f11 = f12;
            }
        }
        return new Pair<>(Float.valueOf(f10), Float.valueOf(f11));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.String, java.lang.Long> c(float[] r18, float r19) {
        /*
            r0 = r18
            java.lang.String r1 = "DctEncoding"
            java.lang.String r2 = ""
            java.lang.String r3 = "Incorrect sensor data"
            r4 = 0
            int r7 = r0.length     // Catch:{ Exception -> 0x012c }
            float[] r8 = new float[r7]     // Catch:{ Exception -> 0x012c }
            int r9 = r0.length     // Catch:{ Exception -> 0x012c }
            java.lang.System.arraycopy(r0, r4, r8, r4, r9)     // Catch:{ Exception -> 0x012c }
            android.util.Pair r9 = b(r18)     // Catch:{ Exception -> 0x012c }
            java.lang.Object r10 = r9.first     // Catch:{ Exception -> 0x012c }
            java.lang.Float r10 = (java.lang.Float) r10     // Catch:{ Exception -> 0x012c }
            float r10 = r10.floatValue()     // Catch:{ Exception -> 0x012c }
            java.lang.Object r9 = r9.second     // Catch:{ Exception -> 0x012c }
            java.lang.Float r9 = (java.lang.Float) r9     // Catch:{ Exception -> 0x012c }
            float r9 = r9.floatValue()     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = K6.C6594o.d(r0, r10, r9)     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = K6.C6593n.a(r0)     // Catch:{ Exception -> 0x012c }
            int r11 = r0.length()     // Catch:{ Exception -> 0x012c }
            long r12 = K6.C6590k.a(r0)     // Catch:{ Exception -> 0x012c }
            float r10 = a(r10)     // Catch:{ Exception -> 0x012c }
            float r9 = a(r9)     // Catch:{ Exception -> 0x012c }
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ Exception -> 0x012c }
            java.lang.String r15 = "2;%.2f;%.2f;%d;%s"
            java.lang.Float r5 = java.lang.Float.valueOf(r10)     // Catch:{ Exception -> 0x012c }
            java.lang.Float r6 = java.lang.Float.valueOf(r9)     // Catch:{ Exception -> 0x012c }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x012c }
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r4, r0}     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = java.lang.String.format(r14, r15, r0)     // Catch:{ Exception -> 0x012c }
            r4 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r4
            float r9 = r9 * r4
            float r10 = r10 + r9
            int r5 = java.lang.Math.round(r10)     // Catch:{ Exception -> 0x012c }
            long r5 = (long) r5     // Catch:{ Exception -> 0x012c }
            long r5 = r5 + r12
            K6.q r9 = new K6.q     // Catch:{ Exception -> 0x012c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x012c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x012c }
            r9.<init>(r0, r10, r5)     // Catch:{ Exception -> 0x012c }
            B r0 = r9.f37703b     // Catch:{ Exception -> 0x012c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x012c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x012c }
            int r5 = java.lang.Integer.bitCount(r7)     // Catch:{ Exception -> 0x012c }
            r6 = 1
            if (r5 != r6) goto L_0x0132
            float[] r5 = new float[r7]     // Catch:{ Exception -> 0x012c }
            r10 = 0
            K6.C6592m.a(r8, r10, r7, r5)     // Catch:{ Exception -> 0x012c }
            r5 = r19
            K6.C6594o.b(r8, r5)     // Catch:{ Exception -> 0x012c }
            r5 = r8[r10]     // Catch:{ Exception -> 0x012c }
            int r7 = r7 - r6
            float[] r11 = new float[r7]     // Catch:{ Exception -> 0x012c }
            java.lang.System.arraycopy(r8, r6, r11, r10, r7)     // Catch:{ Exception -> 0x012c }
            android.util.Pair r6 = b(r11)     // Catch:{ Exception -> 0x012c }
            java.lang.Object r7 = r6.first     // Catch:{ Exception -> 0x012c }
            java.lang.Float r7 = (java.lang.Float) r7     // Catch:{ Exception -> 0x012c }
            float r7 = r7.floatValue()     // Catch:{ Exception -> 0x012c }
            java.lang.Object r6 = r6.second     // Catch:{ Exception -> 0x012c }
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ Exception -> 0x012c }
            float r6 = r6.floatValue()     // Catch:{ Exception -> 0x012c }
            java.lang.String r8 = K6.C6594o.d(r11, r7, r6)     // Catch:{ Exception -> 0x012c }
            java.lang.String r8 = K6.C6593n.a(r8)     // Catch:{ Exception -> 0x012c }
            int r10 = r8.length()     // Catch:{ Exception -> 0x012c }
            long r11 = K6.C6590k.a(r8)     // Catch:{ Exception -> 0x012c }
            float r7 = a(r7)     // Catch:{ Exception -> 0x012c }
            float r6 = a(r6)     // Catch:{ Exception -> 0x012c }
            float r5 = a(r5)     // Catch:{ Exception -> 0x012c }
            java.lang.String r13 = "1;%.2f;%.2f;%.2f;%d;%s"
            java.lang.Float r15 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x012c }
            java.lang.Float r4 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x012c }
            r16 = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0128 }
            r17 = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0116 }
            java.lang.Object[] r2 = new java.lang.Object[]{r15, r4, r2, r3, r8}     // Catch:{ Exception -> 0x0116 }
            java.lang.String r2 = java.lang.String.format(r14, r13, r2)     // Catch:{ Exception -> 0x0116 }
            r3 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r3
            float r6 = r6 * r3
            float r7 = r7 + r6
            float r5 = r5 * r3
            float r7 = r7 + r5
            int r3 = java.lang.Math.round(r7)     // Catch:{ Exception -> 0x0116 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x0116 }
            long r3 = r3 + r11
            K6.q r5 = new K6.q     // Catch:{ Exception -> 0x0116 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0116 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0116 }
            r5.<init>(r2, r6, r3)     // Catch:{ Exception -> 0x0116 }
            B r2 = r5.f37703b     // Catch:{ Exception -> 0x0116 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0116 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0116 }
            int r0 = r0 - r2
            r2 = 20
            if (r0 >= r2) goto L_0x011a
            A r0 = r9.f37702a     // Catch:{ Exception -> 0x0116 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0116 }
            C r0 = r9.f37704c     // Catch:{ Exception -> 0x0114 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0114 }
            long r3 = r0.longValue()     // Catch:{ Exception -> 0x0114 }
        L_0x0110:
            r4 = r3
            r3 = r17
            goto L_0x016a
        L_0x0114:
            r0 = move-exception
            goto L_0x013e
        L_0x0116:
            r0 = move-exception
        L_0x0117:
            r2 = r16
            goto L_0x013e
        L_0x011a:
            A r0 = r5.f37702a     // Catch:{ Exception -> 0x0116 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0116 }
            C r0 = r5.f37704c     // Catch:{ Exception -> 0x0114 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0114 }
            long r3 = r0.longValue()     // Catch:{ Exception -> 0x0114 }
            goto L_0x0110
        L_0x0128:
            r0 = move-exception
            r17 = r3
            goto L_0x0117
        L_0x012c:
            r0 = move-exception
            r16 = r2
            r17 = r3
            goto L_0x013e
        L_0x0132:
            r16 = r2
            r17 = r3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0116 }
            java.lang.String r2 = "Length must be power of 2"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0116 }
            throw r0     // Catch:{ Exception -> 0x0116 }
        L_0x013e:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "Failed in DCT processing: "
            java.lang.String r3 = r4.concat(r3)
            r4 = 0
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            K6.C6595p.e(r1, r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r17
            r3.append(r4)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 0
        L_0x016a:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0183
            r6 = 0
            java.lang.Throwable[] r0 = new java.lang.Throwable[r6]
            K6.C6595p.e(r1, r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "0;"
            java.lang.String r2 = r1.concat(r0)
            r5 = 0
            goto L_0x0184
        L_0x0183:
            r5 = r4
        L_0x0184:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C6591l.c(float[], float):android.util.Pair");
    }
}
