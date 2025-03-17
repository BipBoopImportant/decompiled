package nts;

/* renamed from: nts.ᑋ  reason: contains not printable characters */
public class C3881 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int[] f1749 = new int[19];

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f1750;

    /* renamed from: Е  reason: contains not printable characters */
    public int f1751;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f1752;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f1753;

    /* renamed from: ખ  reason: contains not printable characters */
    public C4127 f1754;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1755;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f1756 = 0;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f1757;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int f1758;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int f1759;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f1760;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f1761;

    public C3881() {
        f1749 = m1940();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int[] m1940() {
        return new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m1939(C3860 r82, byte[] bArr, C4127 r10) {
        while (this.f1751 < bArr.length) {
            if (this.f1758 == 6) {
                int r02 = r10.m3313(r82);
                this.f1759 = r02;
                if (r02 == -1) {
                    return false;
                }
                this.f1758 = 7;
            }
            int i10 = this.f1759;
            switch (i10) {
                case 16:
                    byte b10 = bArr[this.f1751 - 1];
                    int r12 = r82.m1858(2) + 3;
                    if (r12 != 2) {
                        this.f1758 = 6;
                        for (int i11 = 0; i11 < r12; i11++) {
                            int i12 = this.f1751;
                            this.f1751 = i12 + 1;
                            bArr[i12] = b10;
                        }
                        break;
                    } else {
                        return false;
                    }
                case 17:
                    int r03 = r82.m1858(3) + 3;
                    if (r03 != 2) {
                        this.f1758 = 6;
                        for (int i13 = 0; i13 < r03; i13++) {
                            int i14 = this.f1751;
                            this.f1751 = i14 + 1;
                            bArr[i14] = 0;
                        }
                        break;
                    } else {
                        return false;
                    }
                case 18:
                    int r04 = r82.m1858(7) + 11;
                    if (r04 != 10) {
                        this.f1758 = 6;
                        for (int i15 = 0; i15 < r04; i15++) {
                            int i16 = this.f1751;
                            this.f1751 = i16 + 1;
                            bArr[i16] = 0;
                        }
                        break;
                    } else {
                        return false;
                    }
                default:
                    int i17 = this.f1751;
                    this.f1751 = i17 + 1;
                    bArr[i17] = (byte) i10;
                    this.f1758 = 6;
                    break;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[Catch:{ Exception -> 0x0066 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[Catch:{ Exception -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ Exception -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[Catch:{ Exception -> 0x0066 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0083 A[Catch:{ Exception -> 0x0066 }] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1938(nts.C3860 r10) {
        /*
            r9 = this;
            r0 = 0
            int r1 = r9.f1756     // Catch:{ Exception -> 0x0066 }
            r2 = 5
            r3 = 2
            r4 = 3
            r5 = -1
            r6 = 4
            r7 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r7) goto L_0x0022
            if (r1 == r3) goto L_0x0035
            if (r1 == r4) goto L_0x0049
            if (r1 == r6) goto L_0x0078
            goto L_0x009f
        L_0x0015:
            int r1 = r10.m1854(r2)     // Catch:{ Exception -> 0x0066 }
            if (r1 != r5) goto L_0x001c
            return r0
        L_0x001c:
            int r1 = r1 + 257
            r9.f1755 = r1     // Catch:{ Exception -> 0x0066 }
            r9.f1756 = r7     // Catch:{ Exception -> 0x0066 }
        L_0x0022:
            int r1 = r10.m1854(r2)     // Catch:{ Exception -> 0x0066 }
            if (r1 != r5) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r1 + r7
            r9.f1757 = r1     // Catch:{ Exception -> 0x0066 }
            r9.f1756 = r3     // Catch:{ Exception -> 0x0066 }
            int r2 = r9.f1755     // Catch:{ Exception -> 0x0066 }
            int r2 = r2 + r1
            byte[] r1 = new byte[r2]     // Catch:{ Exception -> 0x0066 }
            r9.f1761 = r1     // Catch:{ Exception -> 0x0066 }
        L_0x0035:
            int r1 = r10.m1854(r6)     // Catch:{ Exception -> 0x0066 }
            if (r1 != r5) goto L_0x003c
            return r0
        L_0x003c:
            int r1 = r1 + r6
            r9.f1753 = r1     // Catch:{ Exception -> 0x0066 }
            r1 = 19
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0066 }
            r9.f1752 = r1     // Catch:{ Exception -> 0x0066 }
            r9.f1751 = r0     // Catch:{ Exception -> 0x0066 }
            r9.f1756 = r4     // Catch:{ Exception -> 0x0066 }
        L_0x0049:
            int r1 = r9.f1751     // Catch:{ Exception -> 0x0066 }
            int r2 = r9.f1753     // Catch:{ Exception -> 0x0066 }
            if (r1 >= r2) goto L_0x0068
            int r1 = r10.m1858(r4)     // Catch:{ Exception -> 0x0066 }
            if (r1 != r5) goto L_0x0056
            return r0
        L_0x0056:
            byte[] r2 = r9.f1752     // Catch:{ Exception -> 0x0066 }
            int[] r3 = f1749     // Catch:{ Exception -> 0x0066 }
            int r8 = r9.f1751     // Catch:{ Exception -> 0x0066 }
            r3 = r3[r8]     // Catch:{ Exception -> 0x0066 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0066 }
            r2[r3] = r1     // Catch:{ Exception -> 0x0066 }
            int r8 = r8 + 1
            r9.f1751 = r8     // Catch:{ Exception -> 0x0066 }
            goto L_0x0049
        L_0x0066:
            r10 = move-exception
            goto L_0x00a0
        L_0x0068:
            nts.Ⅼ r1 = new nts.Ⅼ     // Catch:{ Exception -> 0x0066 }
            byte[] r2 = r9.f1752     // Catch:{ Exception -> 0x0066 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0066 }
            r9.f1754 = r1     // Catch:{ Exception -> 0x0066 }
            r9.f1751 = r0     // Catch:{ Exception -> 0x0066 }
            r9.f1756 = r6     // Catch:{ Exception -> 0x0066 }
            r1 = 6
            r9.f1758 = r1     // Catch:{ Exception -> 0x0066 }
        L_0x0078:
            byte[] r1 = r9.f1761     // Catch:{ Exception -> 0x0066 }
            nts.Ⅼ r2 = r9.f1754     // Catch:{ Exception -> 0x0066 }
            boolean r10 = r9.m1939(r10, r1, r2)     // Catch:{ Exception -> 0x0066 }
            if (r10 != 0) goto L_0x0083
            return r0
        L_0x0083:
            int r10 = r9.f1755     // Catch:{ Exception -> 0x0066 }
            byte[] r1 = new byte[r10]     // Catch:{ Exception -> 0x0066 }
            r9.f1750 = r1     // Catch:{ Exception -> 0x0066 }
            int r2 = r9.f1757     // Catch:{ Exception -> 0x0066 }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0066 }
            r9.f1760 = r2     // Catch:{ Exception -> 0x0066 }
            byte[] r2 = r9.f1761     // Catch:{ Exception -> 0x0066 }
            java.lang.System.arraycopy(r2, r0, r1, r0, r10)     // Catch:{ Exception -> 0x0066 }
            byte[] r10 = r9.f1761     // Catch:{ Exception -> 0x0066 }
            byte[] r1 = r9.f1750     // Catch:{ Exception -> 0x0066 }
            int r1 = r1.length     // Catch:{ Exception -> 0x0066 }
            byte[] r2 = r9.f1760     // Catch:{ Exception -> 0x0066 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0066 }
            java.lang.System.arraycopy(r10, r1, r2, r0, r3)     // Catch:{ Exception -> 0x0066 }
        L_0x009f:
            return r7
        L_0x00a0:
            boolean r1 = r10 instanceof nts.C3625
            if (r1 == 0) goto L_0x00a7
            nts.Ԕ r10 = (nts.C3625) r10
            throw r10
        L_0x00a7:
            nts.Ԕ r10 = new nts.Ԕ
            r1 = 75
            java.lang.String r2 = "\u001a,/3)z06w0<86r95.*(>"
            r3 = 20
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r2, (int) r0, (int) r3, (int) r1)
            r1 = 0
            r2 = 101(0x65, float:1.42E-43)
            r10.<init>(r1, r2, r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3881.m1938(nts.Ꮤ):boolean");
    }
}
