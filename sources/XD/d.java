package xd;

final class d {
    static int a(C10385b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(C10385b bVar, boolean z10) {
        int d10 = z10 ? bVar.d() : bVar.e();
        int e10 = z10 ? bVar.e() : bVar.d();
        byte[][] c10 = bVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            byte b10 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < e10; i13++) {
                byte b11 = z10 ? c10[i11][i13] : c10[i13][i11];
                if (b11 == b10) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += i12 - 2;
                    }
                    i12 = 1;
                    b10 = b11;
                }
            }
            if (i12 >= 5) {
                i10 += i12 - 2;
            }
        }
        return i10;
    }

    static int c(C10385b bVar) {
        byte[][] c10 = bVar.c();
        int e10 = bVar.e();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10 - 1; i11++) {
            byte[] bArr = c10[i11];
            int i12 = 0;
            while (i12 < e10 - 1) {
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = c10[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    static int d(C10385b bVar) {
        byte[][] c10 = bVar.c();
        int e10 = bVar.e();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            for (int i12 = 0; i12 < e10; i12++) {
                byte[] bArr = c10[i11];
                int i13 = i12 + 6;
                if (i13 < e10 && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (g(bArr, i12 - 4, i12) || g(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < d10 && c10[i11][i12] == 1 && c10[i11 + 1][i12] == 0 && c10[i11 + 2][i12] == 1 && c10[i11 + 3][i12] == 1 && c10[i11 + 4][i12] == 1 && c10[i11 + 5][i12] == 0 && c10[i14][i12] == 1 && (h(c10, i12, i11 - 4, i11) || h(c10, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    static int e(C10385b bVar) {
        byte[][] c10 = bVar.c();
        int e10 = bVar.e();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            byte[] bArr = c10[i11];
            for (int i12 = 0; i12 < e10; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int d11 = bVar.d() * bVar.e();
        return ((Math.abs((i10 * 2) - d11) * 10) / d11) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 != 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r1 = r1 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r3 = r3 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x0037;
                case 1: goto L_0x0038;
                case 2: goto L_0x003f;
                case 3: goto L_0x003b;
                case 4: goto L_0x0033;
                case 5: goto L_0x002c;
                case 6: goto L_0x0025;
                case 7: goto L_0x001b;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Invalid mask pattern: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x001b:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L_0x0023:
            r1 = r1 & r0
            goto L_0x0041
        L_0x0025:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x0023
        L_0x002c:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x0041
        L_0x0033:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L_0x0037:
            int r3 = r3 + r2
        L_0x0038:
            r1 = r3 & 1
            goto L_0x0041
        L_0x003b:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x0041
        L_0x003f:
            int r1 = r2 % 3
        L_0x0041:
            if (r1 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.d.f(int, int, int):boolean");
    }

    private static boolean g(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || bArr.length < i11) {
            return false;
        }
        while (i10 < i11) {
            if (bArr[i10] == 1) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i10, int i11, int i12) {
        if (i11 < 0 || bArr.length < i12) {
            return false;
        }
        while (i11 < i12) {
            if (bArr[i11][i10] == 1) {
                return false;
            }
            i11++;
        }
        return true;
    }
}
