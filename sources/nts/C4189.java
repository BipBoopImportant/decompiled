package nts;

/* renamed from: nts.ⷎ  reason: contains not printable characters */
public class C4189 extends C3935 {
    public C4189() {
        this.f910 = new C4124[]{new C4124(128, 128, 0)};
        this.f916 = new C4124[]{new C4124(64, 64, 0)};
        this.f912 = 64;
        this.f914 = 64;
        this.f913 = 128;
        this.f911 = 1;
        this.f909 = 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static short m3678(short s10, short s11) {
        int i10 = 1;
        short s12 = ((short) (((s10 & 65535) - 1) & 65535)) & 65535;
        short s13 = ((short) (((s11 & 65535) - 1) & 65535)) & 65535;
        int i11 = (s12 * s13) + s12 + s13 + 1;
        short s14 = ((short) (i11 & 65535)) & 65535;
        short s15 = ((short) ((i11 >>> 16) & 65535)) & 65535;
        int i12 = s14 - s15;
        if (s14 > s15) {
            i10 = 0;
        }
        return (short) ((i12 + i10) & 65535);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static void m3682(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            if (i10 < bArr.length / 2) {
                sArr[i10] = m3679(bArr, i10 * 2);
            } else {
                sArr[i10] = (short) ((((sArr[(i10 + 1) % 8 != 0 ? i10 - 7 : i10 - 15] & 65535) << 9) | ((sArr[(i10 + 2) % 8 < 2 ? i10 - 14 : i10 - 6] & 65535) >>> 7)) & 65535);
            }
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3683() {
        super.m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m3684(byte[] bArr, byte[] bArr2) {
        return new C3960(bArr, bArr2, this.f911, this.f909, this.f914);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m3676(byte[] bArr, short[] sArr) {
        int i10;
        short[] sArr2 = new short[52];
        m3682(bArr, sArr2);
        sArr[48] = m3677(sArr2[0]);
        sArr[49] = (short) ((-sArr2[1]) & 65535);
        sArr[50] = (short) ((-sArr2[2]) & 65535);
        sArr[51] = m3677(sArr2[3]);
        int i11 = 4;
        int i12 = 42;
        while (i12 >= 0) {
            sArr[i12 + 4] = sArr2[i11];
            sArr[i12 + 5] = sArr2[i11 + 1];
            int i13 = i11 + 3;
            sArr[i12] = m3677(sArr2[i11 + 2]);
            if (i12 > 0) {
                int i14 = i11 + 4;
                sArr[i12 + 2] = (short) ((-sArr2[i13]) & 65535);
                i10 = i11 + 5;
                sArr[i12 + 1] = (short) ((-sArr2[i14]) & 65535);
            } else {
                int i15 = i11 + 4;
                sArr[1] = (short) ((-sArr2[i13]) & 65535);
                i10 = i11 + 5;
                sArr[2] = (short) ((-sArr2[i15]) & 65535);
            }
            sArr[i12 + 3] = m3677(sArr2[i10]);
            i12 -= 6;
            i11 = i10 + 1;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static short m3679(byte[] bArr, int i10) {
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] << 8) & 65280));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3680(short s10, byte[] bArr, int i10) {
        bArr[i10] = (byte) (s10 >>> 8);
        bArr[i10 + 1] = (byte) s10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m3686(byte[] bArr, byte[] bArr2) {
        return new C4108(bArr, bArr2, this.f911, this.f909, this.f914);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3681(byte[] bArr, short[] sArr) {
        byte[] bArr2 = bArr;
        short r22 = m3679(bArr2, 0);
        short r42 = m3679(bArr2, 2);
        short r62 = m3679(bArr2, 4);
        short r82 = m3679(bArr2, 6);
        int i10 = 8;
        int i11 = 0;
        while (i10 > 0) {
            short r23 = m3678(r22, sArr[i11]);
            short s10 = (short) ((r42 + sArr[i11 + 1]) & 65535);
            short s11 = (short) ((r62 + sArr[i11 + 2]) & 65535);
            short r83 = m3678(r82, sArr[i11 + 3]);
            int i12 = i11 + 5;
            short r12 = m3678((short) (r23 ^ s11), sArr[i11 + 4]);
            i11 += 6;
            short r13 = m3678((short) (((s10 ^ r83) + r12) & 65535), sArr[i12]);
            short s12 = (short) (65535 & (r12 + r13));
            r22 = (short) (r23 ^ r13);
            r82 = (short) (r83 ^ s12);
            i10--;
            short s13 = (short) (s11 ^ r13);
            r62 = (short) (s10 ^ s12);
            r42 = s13;
        }
        m3680(m3678(r22, sArr[i11]), bArr2, 0);
        m3680((short) ((r62 + sArr[i11 + 1]) & 65535), bArr2, 2);
        m3680((short) ((r42 + sArr[i11 + 2]) & 65535), bArr2, 4);
        m3680(m3678(r82, sArr[i11 + 3]), bArr2, 6);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3687() {
        m905(C3990.m2428(this.f912 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3685(byte[] bArr) {
        super.m901(bArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: short} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static short m3677(short r7) {
        /*
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r7 & r0
            r2 = 1
            if (r1 > r2) goto L_0x0009
            return r7
        L_0x0009:
            r7 = 65537(0x10001, float:9.1837E-41)
            r3 = 0
            r4 = r7
        L_0x000e:
            int r5 = r4 % r1
            int r4 = r4 / r1
            if (r5 != 0) goto L_0x001a
            if (r2 >= 0) goto L_0x0016
            int r2 = r2 + r7
        L_0x0016:
            r7 = r2 & r0
            short r7 = (short) r7
            return r7
        L_0x001a:
            int r4 = r4 * r2
            int r3 = r3 - r4
            r4 = r1
            r1 = r5
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4189.m3677(short):short");
    }
}
