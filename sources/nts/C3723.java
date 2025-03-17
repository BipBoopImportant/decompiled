package nts;

import java.math.BigInteger;

/* renamed from: nts.ನ  reason: contains not printable characters */
public class C3723 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f990;

    /* renamed from: ગ  reason: contains not printable characters */
    public BigInteger f991;

    /* renamed from: ഇ  reason: contains not printable characters */
    public BigInteger f992;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public BigInteger f993;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int[] f994 = new int[3511];

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean[] f995;

    public C3723(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f992 = bigInteger;
        this.f991 = bigInteger2;
        this.f993 = bigInteger3;
        this.f990 = 0;
        m1020();
        m1021();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1020() {
        this.f994[0] = 1;
        int i10 = 3;
        int i11 = 1;
        int i12 = 1;
        while (i10 <= 32719) {
            int i13 = 1;
            while (i13 < i11 && i10 % this.f994[i13] != 0) {
                i13++;
            }
            if (i13 == i11) {
                this.f994[i12] = i10;
                i11 = 54;
                if (54 >= i12) {
                    i11 = i12;
                }
                i12++;
            }
            i10 += 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
        if (r4.add(r5.multiply(java.math.BigInteger.valueOf((long) r6))).intValue() == r3) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1021() {
        /*
            r10 = this;
            java.math.BigInteger r0 = r10.f993
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x008d
            java.math.BigInteger r0 = r10.f991
            java.math.BigInteger r2 = r10.f992
            java.math.BigInteger r0 = r0.subtract(r2)
            java.math.BigInteger r2 = r10.f993
            java.math.BigInteger r0 = r0.divide(r2)
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r0.add(r2)
            int r0 = r0.intValue()
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r0 >= r2) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            boolean[] r0 = new boolean[r0]
            r10.f995 = r0
        L_0x002e:
            r0 = 3511(0xdb7, float:4.92E-42)
            if (r1 >= r0) goto L_0x008c
            java.math.BigInteger r0 = r10.f993
            int[] r2 = r10.f994
            r2 = r2[r1]
            long r2 = (long) r2
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            java.math.BigInteger r0 = r0.modInverse(r2)
            boolean[] r2 = r10.f995
            int[] r3 = r10.f994
            r3 = r3[r1]
            java.math.BigInteger r4 = r10.f992
            java.math.BigInteger r5 = r10.f993
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0089
            long r6 = (long) r3
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
            java.math.BigInteger r6 = r4.mod(r6)
            int r6 = r6.intValue()
            int r6 = r3 - r6
            int r6 = r6 * r0
            int r6 = r6 % r3
            int r0 = r4.bitLength()
            int r0 = r0 + 31
            int r0 = r0 / 32
            r7 = 1
            if (r0 > r7) goto L_0x0081
            long r8 = (long) r6
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r0 = r5.multiply(r0)
            java.math.BigInteger r0 = r4.add(r0)
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x0081
        L_0x0080:
            int r6 = r6 + r3
        L_0x0081:
            boolean[] r0 = r10.f995
            int r0 = r0.length
            if (r6 >= r0) goto L_0x0089
            r2[r6] = r7
            goto L_0x0080
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x008c:
            return
        L_0x008d:
            nts.ඍ r0 = new nts.ඍ
            r2 = 124(0x7c, float:1.74E-43)
            java.lang.String r3 = "\u000b87\u0011\u0007\u0013@\u0012\u0006\u0000\u0019\u0001\u000eK\u0006\u0006\u0002W\u0016\u0010R)5#1Q"
            r4 = 26
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r3, (int) r1, (int) r4, (int) r2)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3723.m1021():void");
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public BigInteger m1022() {
        boolean[] zArr;
        int i10 = this.f990;
        while (true) {
            zArr = this.f995;
            if (i10 >= zArr.length) {
                break;
            } else if (!zArr[i10]) {
                this.f990 = i10;
                break;
            } else {
                i10++;
            }
        }
        int i11 = this.f990;
        if (i11 == zArr.length) {
            BigInteger add = this.f992.add(this.f993.multiply(BigInteger.valueOf((long) zArr.length)));
            this.f992 = add;
            if (add.compareTo(this.f991) > 0) {
                return null;
            }
            this.f990 = 0;
            m1021();
            return m1022();
        }
        this.f990 = i11 + 1;
        return this.f992.add(this.f993.multiply(BigInteger.valueOf((long) i11)));
    }
}
