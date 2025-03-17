package nts;

/* renamed from: nts.Ἢ  reason: contains not printable characters */
public class C4096 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f3486;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f3487;

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] f3488 = new byte[33068];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f3489;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f3490;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f3491 = 33048;

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3241() {
        byte[] bArr = this.f3488;
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f3488 = bArr2;
        this.f3491 = length - 20;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3243() {
        if (this.f3489 == this.f3488.length) {
            m3241();
        }
        int i10 = this.f3490;
        if (i10 > 0) {
            byte[] bArr = this.f3488;
            int i11 = this.f3489;
            this.f3489 = i11 + 1;
            bArr[i11] = (byte) this.f3486;
        }
        if (i10 > 8) {
            byte[] bArr2 = this.f3488;
            int i12 = this.f3489;
            this.f3489 = i12 + 1;
            bArr2[i12] = (byte) (this.f3486 >> 8);
        }
        this.f3486 = 0;
        this.f3490 = 0;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m3245() {
        return this.f3489 == 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3244(int i10, int i11) {
        int i12 = this.f3486;
        int i13 = this.f3490;
        this.f3486 = (i10 << i13) | i12;
        int i14 = i13 + i11;
        this.f3490 = i14;
        if (i14 >= 16) {
            if (this.f3489 > this.f3491) {
                m3241();
            }
            byte[] bArr = this.f3488;
            int i15 = this.f3489;
            int i16 = i15 + 1;
            this.f3489 = i16;
            int i17 = this.f3486;
            bArr[i15] = (byte) i17;
            this.f3489 = i15 + 2;
            bArr[i16] = (byte) (i17 >> 8);
            this.f3486 = i17 >>> 16;
            this.f3490 -= 16;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3242(byte[] bArr, int i10, int i11) {
        int i12 = this.f3490;
        if (i12 >= 8) {
            byte[] bArr2 = this.f3488;
            int i13 = this.f3489;
            this.f3489 = i13 + 1;
            int i14 = this.f3486;
            bArr2[i13] = (byte) i14;
            this.f3486 = i14 >>> 8;
            this.f3490 = i12 - 8;
        }
        int min = Math.min(i11, this.f3489 - this.f3487);
        System.arraycopy(this.f3488, this.f3487, bArr, i10, min);
        int i15 = this.f3487 + min;
        this.f3487 = i15;
        if (i15 == this.f3489) {
            this.f3489 = 0;
            this.f3487 = 0;
        }
        return min;
    }
}
