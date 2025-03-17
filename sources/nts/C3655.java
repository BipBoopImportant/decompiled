package nts;

/* renamed from: nts.ۉ  reason: contains not printable characters */
public class C3655 extends C4194 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f750 = 0;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f751 = 100;

    public C3655() {
        m3727(3);
        this.f751 = 100;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m694(byte[] bArr, int i10, int i11) {
        int i12 = this.f751;
        if (i12 == 100) {
            this.f751 = 110;
            this.f4036 = 1;
        } else if (i12 == 110) {
            this.f750 = bArr[i10];
            this.f751 = 120;
            this.f4036 = 6;
        } else if (i12 == 120) {
            int i13 = this.f750;
            if ((i13 & 4) != 0) {
                this.f751 = 130;
                this.f4036 = 2;
            } else if ((i13 & 8) != 0) {
                this.f751 = 140;
                this.f4036 = 1;
            } else if ((i13 & 16) != 0) {
                this.f751 = 150;
                this.f4036 = 1;
            } else if ((i13 & 2) != 0) {
                this.f751 = 160;
                this.f4036 = 2;
            } else {
                this.f4036 = 0;
            }
        } else if (i12 != 140) {
            if (i12 != 150) {
                if (i12 == 160) {
                    this.f4036 = 0;
                } else if (i12 == 130) {
                    int i14 = (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8);
                    if (i14 > 0) {
                        this.f751 = 131;
                        this.f4036 = i14;
                        return;
                    }
                    int i15 = this.f750;
                    if ((i15 & 8) != 0) {
                        this.f751 = 140;
                        this.f4036 = 1;
                    } else if ((i15 & 16) != 0) {
                        this.f751 = 150;
                        this.f4036 = 1;
                    } else if ((i15 & 2) != 0) {
                        this.f751 = 160;
                        this.f4036 = 2;
                    } else {
                        this.f4036 = 0;
                    }
                } else if (i12 == 131) {
                    this.f4036 = 0;
                    int i16 = this.f750;
                    if ((i16 & 8) != 0) {
                        this.f751 = 140;
                        this.f4036 = 1;
                    } else if ((i16 & 16) != 0) {
                        this.f751 = 150;
                        this.f4036 = 1;
                    } else if ((i16 & 2) != 0) {
                        this.f751 = 160;
                        this.f4036 = 2;
                    } else {
                        this.f4036 = 0;
                    }
                }
            } else if (((byte) (bArr[i10] & 255)) != 0) {
            } else {
                if ((this.f750 & 2) != 0) {
                    this.f751 = 160;
                    this.f4036 = 2;
                    return;
                }
                this.f4036 = 0;
            }
        } else if (((byte) (bArr[i10] & 255)) == 0) {
            int i17 = this.f750;
            if ((i17 & 16) != 0) {
                this.f751 = 150;
                this.f4036 = 1;
            } else if ((i17 & 2) != 0) {
                this.f751 = 160;
                this.f4036 = 2;
            } else {
                this.f4036 = 0;
            }
        }
    }
}
