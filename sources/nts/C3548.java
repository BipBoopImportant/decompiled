package nts;

/* renamed from: nts.Ȼ  reason: contains not printable characters */
public class C3548 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C4175 f41 = new C4175(19, 7);

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f42 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public C4037 f43 = new C4037(286, 15);

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f44;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C4037 f45 = new C4037(30, 15);

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f46 = new byte[16384];

    /* renamed from: ⶏ  reason: contains not printable characters */
    public short[] f47 = new short[16384];

    public C3548() {
        byte[] bArr = new byte[19];
        this.f44 = bArr;
        bArr[0] = 16;
        bArr[1] = 17;
        bArr[2] = 18;
        bArr[3] = 0;
        bArr[4] = 8;
        bArr[5] = 7;
        bArr[6] = 9;
        bArr[7] = 6;
        bArr[8] = 10;
        bArr[9] = 5;
        bArr[10] = 11;
        bArr[11] = 4;
        bArr[12] = 12;
        bArr[13] = 3;
        bArr[14] = 13;
        bArr[15] = 2;
        bArr[16] = 14;
        bArr[17] = 1;
        bArr[18] = 15;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public final int m109(int i10) {
        if (i10 == 255) {
            return 285;
        }
        int i11 = 257;
        while (i10 >= 8) {
            i11 += 4;
            i10 >>= 1;
        }
        return i11 + i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m110(int i10) {
        int i11;
        int i12 = i10 - 1;
        if (i12 > 511) {
            i12 >>= 8;
            i11 = 16;
        } else {
            i11 = 0;
        }
        if (i12 > 31) {
            i11 += 8;
            i12 >>= 4;
        }
        if (i12 > 7) {
            i11 += 4;
            i12 >>= 2;
        }
        if (i12 > 3) {
            i11 += 2;
            i12 >>= 1;
        }
        return i11 + i12;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m114(int i10) {
        byte[] bArr = this.f46;
        int i11 = this.f42;
        bArr[i11] = (byte) i10;
        this.f47[i11] = 0;
        int i12 = i11 + 1;
        this.f42 = i12;
        short[] sArr = this.f43.f3861;
        sArr[i10] = (short) (sArr[i10] + 1);
        return i12 == 16384;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m111() {
        this.f43 = new C4037(286, 15);
        this.f45 = new C4037(30, 15);
        this.f41 = new C4175(19, 7);
        for (int i10 = 0; i10 < 16384; i10++) {
            this.f46[i10] = 0;
            this.f47[i10] = 0;
        }
        this.f42 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m113(int i10, int i11) {
        byte[] bArr = this.f46;
        int i12 = this.f42;
        int i13 = i10 - 3;
        bArr[i12] = (byte) i13;
        this.f47[i12] = (short) i11;
        this.f42 = i12 + 1;
        short[] sArr = this.f43.f3861;
        int r42 = m109(i13);
        sArr[r42] = (short) (sArr[r42] + 1);
        short[] sArr2 = this.f45.f3861;
        int r52 = m110(i11);
        sArr2[r52] = (short) (sArr2[r52] + 1);
        if (this.f42 == 16384) {
            return true;
        }
        return false;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m112(C4096 r10, boolean z10) {
        C4037 r02 = this.f43;
        short[] sArr = r02.f3861;
        sArr[256] = (short) (sArr[256] + 1);
        r02.m3511();
        this.f45.m3511();
        this.f43.m2684();
        this.f45.m2684();
        this.f43.m2683(this.f41);
        this.f45.m2683(this.f41);
        this.f41.m3511();
        int i10 = 4;
        for (int i11 = 18; i11 > i10; i11--) {
            if (this.f41.f3862[this.f44[i11]] != 0) {
                i10 = i11 + 1;
            }
        }
        r10.m3244(z10 ? 1 : 0, 1);
        r10.m3244(2, 2);
        r10.m3244(this.f43.m3508() - 257, 5);
        r10.m3244(this.f45.m3508() - 1, 5);
        r10.m3244(i10 - 4, 4);
        for (int i12 = 0; i12 < i10; i12++) {
            r10.m3244(this.f41.f3862[this.f44[i12]], 3);
        }
        this.f43.m2682(r10, this.f41);
        this.f45.m2682(r10, this.f41);
        this.f43.f3863 = r10;
        this.f45.f3863 = r10;
        for (int i13 = 0; i13 < this.f42; i13++) {
            short s10 = this.f47[i13];
            if (s10 == 0) {
                this.f43.m3509(this.f46[i13] & 255);
            } else {
                byte b10 = this.f46[i13] & 255;
                short s11 = s10 & 65535;
                int r62 = m109(b10);
                int r72 = m110(s11);
                this.f43.m3509(r62);
                if (r62 >= 261 && r62 <= 284) {
                    int i14 = (r62 - 261) / 4;
                    r10.m3244(b10 & ((1 << i14) - 1), i14);
                }
                this.f45.m3509(r72);
                if (r72 >= 4) {
                    int i15 = (r72 - 2) / 2;
                    r10.m3244((s11 - 1) & ((1 << i15) - 1), i15);
                }
            }
        }
        this.f43.m3509(256);
    }
}
