package nts;

/* renamed from: nts.ー  reason: contains not printable characters */
public class C4218 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f4143 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f4144;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f4145;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f4146 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f4147 = 0;

    public C4218(int i10) {
        this.f4145 = i10;
        this.f4144 = i10 - 1;
        this.f4146 = new byte[i10];
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3814(C3860 r42, int i10) {
        int i11;
        int i12 = this.f4145 - this.f4143;
        if (i12 < i10) {
            i10 = i12;
        }
        if (r42.m1855() < i10) {
            i10 = r42.m1855();
        }
        int i13 = this.f4145;
        int i14 = this.f4147;
        int i15 = i13 - i14;
        if (i10 > i15) {
            i11 = r42.m1856(this.f4146, i14, i15);
            if (i11 == i15) {
                i11 += r42.m1856(this.f4146, 0, i10 - i15);
            }
        } else {
            i11 = r42.m1856(this.f4146, i14, i10);
        }
        this.f4147 = (this.f4147 + i11) & this.f4144;
        this.f4143 += i11;
        return i11;
    }
}
