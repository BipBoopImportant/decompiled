package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

/* renamed from: nts.ⶎ  reason: contains not printable characters */
public class C4175 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] f3858;

    /* renamed from: ϴ  reason: contains not printable characters */
    public short[] f3859;

    /* renamed from: ગ  reason: contains not printable characters */
    public byte f3860;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public short[] f3861;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f3862;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C4096 f3863 = null;

    static {
        byte[] bArr = new byte[16];
        f3858 = bArr;
        bArr[0] = 0;
        bArr[1] = 8;
        bArr[2] = 4;
        bArr[3] = 12;
        for (int i10 = 0; i10 < 4; i10++) {
            byte[] bArr2 = f3858;
            bArr2[i10 + 4] = (byte) ((bArr2[i10] + 2) & 15);
            bArr2[i10 + 8] = (byte) ((bArr2[i10] + 1) & 15);
            bArr2[i10 + 12] = (byte) ((bArr2[i10] + 3) & 15);
        }
    }

    public C4175(int i10, int i11) {
        this.f3860 = (byte) i11;
        this.f3861 = new short[i10];
        this.f3859 = new short[i10];
        this.f3862 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            this.f3861[i12] = 0;
            this.f3859[i12] = 0;
            this.f3862[i12] = 0;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static short m3507(int i10) {
        byte[] bArr = f3858;
        return (short) ((bArr[i10 >> 12] & 15) | (bArr[i10 & 15] << 12) | (bArr[(i10 >> 4) & 15] << 8) | (bArr[(i10 >> 8) & 15] << 4));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3509(int i10) {
        this.f3863.m3244(this.f3859[i10], this.f3862[i10]);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m3508() {
        int length = this.f3862.length;
        while (true) {
            length--;
            if (this.f3862[length] != 0 || length <= 0) {
            }
        }
        return length + 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3511() {
        short[] sArr;
        try {
            m3510(this.f3861).m1979(this.f3862, 0);
            m3512(this.f3862, m3513(this.f3862));
        } catch (C3625 e10) {
            if (e10.f605 == 132) {
                int i10 = 0;
                while (true) {
                    sArr = this.f3861;
                    if (i10 < sArr.length && sArr[i10] == 0) {
                        i10++;
                    }
                }
                if (i10 != sArr.length) {
                    this.f3862[i10] = 1;
                } else {
                    this.f3862[0] = 1;
                }
            } else {
                throw e10;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final C3893 m3510(short[] sArr) {
        C3909 r02 = new C3909(sArr, sArr.length);
        while (r02.f1846 > 1) {
            C3893 r22 = new C3893(r02.m2021(), r02.m2021());
            int i10 = r02.f1846;
            if (i10 != r02.f1847.length) {
                r02.f1846 = i10 + 1;
                while (i10 > 0) {
                    C3893[] r12 = r02.f1847;
                    int i11 = (i10 - 1) / 2;
                    C3893 r42 = r12[i11];
                    if (r42.f1792 <= r22.f1792) {
                        break;
                    }
                    r12[i10] = r42;
                    i10 = i11;
                }
                r02.f1847[i10] = r22;
            } else {
                throw new C3625((Throwable) null, 199, C3727.m1052("\u00125-3+\",a&*-=j.0*3' <==~\f\u0010\u001f\u0018\f\u000f\u001bN\u0000\u0014\u0017\u0007\b\u0014\u0013\u0003\u001dX\u0014\u001c]\u0019\u0012\u000e\u0005\tS\u001a\u0010\u0015\u0007\u001d\u0011\u0016\u0006Q\u0004\u001c\u001d]\u0010\u001e\f\u001e\u001d1\u000b\u0003\u001f\u0010\u0004\u0001\u0017\t\tN\u001b\u001a\u0000\u001c\u0002\u0015\u0019V\u001f\u0015\u0010\u0002]Tnft`j'imylacx Zwn<{q1~|f5usr)}{", 54, 14, 77));
            }
        }
        return r02.m2021();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0097 A[EDGE_INSN: B:58:0x0097->B:31:0x0097 ?: BREAK  , SYNTHETIC] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final short[] m3513(byte[] r13) {
        /*
            r12 = this;
            byte r0 = r12.f3860
            int r0 = r0 + 100
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = r1
        L_0x0008:
            byte r3 = r12.f3860
            int r4 = r3 + 100
            if (r2 >= r4) goto L_0x0013
            r0[r2] = r1
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0013:
            r2 = 1
            int r3 = r3 + r2
            short[] r3 = new short[r3]
            r4 = r1
        L_0x0018:
            byte r5 = r12.f3860
            if (r4 > r5) goto L_0x0021
            r3[r4] = r1
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0021:
            r4 = r1
            r5 = r4
        L_0x0023:
            int r6 = r13.length
            if (r4 >= r6) goto L_0x0040
            byte r6 = r13[r4]
            byte r7 = r12.f3860
            if (r6 <= r7) goto L_0x0035
            byte r5 = r0[r6]
            int r5 = r5 + r2
            byte r5 = (byte) r5
            r0[r6] = r5
            r13[r4] = r7
            r5 = r2
        L_0x0035:
            byte r6 = r13[r4]
            short r7 = r3[r6]
            int r7 = r7 + r2
            short r7 = (short) r7
            r3[r6] = r7
            int r4 = r4 + 1
            goto L_0x0023
        L_0x0040:
            if (r5 == 0) goto L_0x00e4
            byte r4 = r12.f3860
            int r4 = r4 + 99
            r5 = r1
            r6 = r5
        L_0x0048:
            byte r7 = r12.f3860
            int r8 = r7 + 1
            r9 = 199(0xc7, float:2.79E-43)
            r10 = 0
            java.lang.String r11 = "\u00125-3+\",a&*-=j.0*3' <==~\f\u0010\u001f\u0018\f\u000f\u001bN\u0000\u0014\u0017\u0007\b\u0014\u0013\u0003\u001dX\u0014\u001c]\u0019\u0012\u000e\u0005\tS\u001a\u0010\u0015\u0007\u001d\u0011\u0016\u0006Q\u0004\u001c\u001d]\u0010\u001e\f\u001e\u001d1\u000b\u0003\u001f\u0010\u0004\u0001\u0017\t\tN\u001b\u001a\u0000\u001c\u0002\u0015\u0019V\u001f\u0015\u0010\u0002]Tnft`j'imylacx Zwn<{q1~|f5usr)}{"
            if (r4 < r8) goto L_0x0072
            int r7 = r5 % 2
            if (r7 != 0) goto L_0x0062
            int r5 = r5 / 2
            byte r7 = r0[r4]
            int r8 = r7 + r5
            int r6 = r6 + r8
            int r5 = r5 + r7
            int r4 = r4 + -1
            goto L_0x0048
        L_0x0062:
            nts.Ԕ r13 = new nts.Ԕ
            r0 = 16
            r1 = 77
            r2 = 92
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r11, (int) r2, (int) r0, (int) r1)
            r13.<init>(r10, r9, r0)
            throw r13
        L_0x0072:
            int r7 = r7 + -1
            short r0 = r3[r7]
            if (r0 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            short r0 = r3[r7]
            int r0 = r0 - r2
            short r0 = (short) r0
            r3[r7] = r0
            int r0 = r7 + 1
            short r4 = r3[r0]
            int r4 = r4 + r2
            short r4 = (short) r4
            r3[r0] = r4
            byte r4 = r12.f3860
            int r5 = r4 - r7
            int r5 = r2 << r5
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x0095
            if (r0 < r4) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r7 = r0
            goto L_0x0079
        L_0x0095:
            if (r6 > 0) goto L_0x00e2
            if (r6 >= 0) goto L_0x00a9
            short r0 = r3[r4]
            int r6 = r6 / 2
            short r5 = (short) r6
            int r0 = r0 + r5
            short r0 = (short) r0
            r3[r4] = r0
            int r4 = r4 - r2
            short r0 = r3[r4]
            int r0 = r0 - r5
            short r0 = (short) r0
            r3[r4] = r0
        L_0x00a9:
            nts.ᕝ r0 = new nts.ᕝ     // Catch:{ Ԕ -> 0x00c6 }
            short[] r4 = r12.f3861     // Catch:{ Ԕ -> 0x00c6 }
            int r5 = r4.length     // Catch:{ Ԕ -> 0x00c6 }
            r0.<init>(r4, r5)     // Catch:{ Ԕ -> 0x00c6 }
            byte r4 = r12.f3860     // Catch:{ Ԕ -> 0x00c6 }
        L_0x00b3:
            if (r4 < r2) goto L_0x00e4
            r5 = r1
        L_0x00b6:
            short r6 = r3[r4]     // Catch:{ Ԕ -> 0x00c6 }
            if (r5 >= r6) goto L_0x00c8
            nts.ᓋ r6 = r0.m2021()     // Catch:{ Ԕ -> 0x00c6 }
            int r6 = r6.f1791     // Catch:{ Ԕ -> 0x00c6 }
            byte r7 = (byte) r4     // Catch:{ Ԕ -> 0x00c6 }
            r13[r6] = r7     // Catch:{ Ԕ -> 0x00c6 }
            int r5 = r5 + 1
            goto L_0x00b6
        L_0x00c6:
            r13 = move-exception
            goto L_0x00cb
        L_0x00c8:
            int r4 = r4 + -1
            goto L_0x00b3
        L_0x00cb:
            int r0 = r13.f605
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto L_0x00e1
            nts.Ԕ r13 = new nts.Ԕ
            r0 = 24
            r1 = 56
            r2 = 68
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r11, (int) r2, (int) r0, (int) r1)
            r13.<init>(r10, r9, r0)
            throw r13
        L_0x00e1:
            throw r13
        L_0x00e2:
            r7 = r0
            goto L_0x0072
        L_0x00e4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4175.m3513(byte[]):short[]");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3512(byte[] bArr, short[] sArr) {
        sArr[0] = 0;
        int[] iArr = new int[(this.f3860 + 1)];
        int i10 = 0;
        for (int i11 = 1; i11 <= this.f3860; i11++) {
            iArr[i11] = i10;
            i10 += sArr[i11] << (16 - i11);
        }
        if (i10 == 65536) {
            for (int i12 = 0; i12 < bArr.length; i12++) {
                byte b10 = bArr[i12];
                if (b10 != 0) {
                    this.f3859[i12] = m3507(iArr[b10]);
                    byte b11 = bArr[i12];
                    iArr[b11] = iArr[b11] + (1 << (16 - b11));
                }
            }
            return;
        }
        throw new C3625((Throwable) null, 199, C3727.m1052("\u00125-3+\",a&*-=j.0*3' <==~\f\u0010\u001f\u0018\f\u000f\u001bN\u0000\u0014\u0017\u0007\b\u0014\u0013\u0003\u001dX\u0014\u001c]\u0019\u0012\u000e\u0005\tS\u001a\u0010\u0015\u0007\u001d\u0011\u0016\u0006Q\u0004\u001c\u001d]\u0010\u001e\f\u001e\u001d1\u000b\u0003\u001f\u0010\u0004\u0001\u0017\t\tN\u001b\u001a\u0000\u001c\u0002\u0015\u0019V\u001f\u0015\u0010\u0002]Tnft`j'imylacx Zwn<{q1~|f5usr)}{", 108, 19, (int) CheckoutActivity.RESULT_ERROR));
    }
}
