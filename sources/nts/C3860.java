package nts;

/* renamed from: nts.Ꮤ  reason: contains not printable characters */
public class C3860 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f1668 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f1669 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f1670;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f1671 = 0;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f1672 = 0;

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m1853(int i10) {
        int i11 = this.f1672;
        if (i11 < i10) {
            int i12 = this.f1669;
            int i13 = this.f1671;
            if (i12 == i13) {
                return -1;
            }
            if (i12 == i13 - 1) {
                int i14 = i11 + 8;
                if (i14 < i10) {
                    return -1;
                }
                int i15 = this.f1668;
                byte[] bArr = this.f1670;
                this.f1669 = i12 + 1;
                this.f1668 = ((bArr[i12] & 255) << i11) | i15;
                this.f1672 = i14;
            } else {
                int i16 = this.f1668;
                byte[] bArr2 = this.f1670;
                int i17 = i12 + 1;
                this.f1669 = i17;
                this.f1669 = i12 + 2;
                this.f1668 = ((((bArr2[i17] & 255) << 8) | (bArr2[i12] & 255)) << i11) | i16;
                this.f1672 = i11 + 16;
            }
        }
        return ((1 << i10) - 1) & this.f1668;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m1854(int i10) {
        int r02 = m1853(i10);
        if (r02 != -1) {
            this.f1668 >>= i10;
            this.f1672 -= i10;
        }
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1857(int i10) {
        this.f1668 >>= i10;
        this.f1672 -= i10;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int m1858(int i10) {
        int r02 = m1853(i10);
        if (r02 != -1) {
            this.f1668 >>= i10;
            this.f1672 -= i10;
        }
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1855() {
        return (this.f1671 - this.f1669) + (this.f1672 >> 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m1856(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.f1672
            r2 = 8
            if (r1 <= 0) goto L_0x001e
            if (r9 <= 0) goto L_0x001e
            int r3 = r8 + 1
            int r4 = r6.f1668
            byte r5 = (byte) r4
            r7[r8] = r5
            int r8 = r4 >> 8
            r6.f1668 = r8
            int r1 = r1 + -8
            r6.f1672 = r1
            int r9 = r9 + -1
            int r0 = r0 + 1
            r8 = r3
            goto L_0x0001
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r0
        L_0x0021:
            int r1 = r6.f1671
            int r3 = r6.f1669
            int r1 = r1 - r3
            if (r9 <= r1) goto L_0x0029
            r9 = r1
        L_0x0029:
            byte[] r1 = r6.f1670
            java.lang.System.arraycopy(r1, r3, r7, r8, r9)
            int r7 = r6.f1669
            int r7 = r7 + r9
            r6.f1669 = r7
            int r8 = r6.f1671
            int r8 = r7 - r8
            r8 = r8 & 1
            if (r8 == 0) goto L_0x0049
            byte[] r8 = r6.f1670
            int r1 = r7 + 1
            r6.f1669 = r1
            byte r7 = r8[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6.f1668 = r7
            r6.f1672 = r2
        L_0x0049:
            int r0 = r0 + r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3860.m1856(byte[], int, int):int");
    }
}
