package nts;

/* renamed from: nts.ᣛ  reason: contains not printable characters */
public class C3989 extends C3559 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public byte[] f2630 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2409(C3796 r32) {
        byte[] bArr = this.f2630;
        if (bArr != null) {
            r32.m1346(bArr, this.f3542);
        } else {
            r32.m1340(this.f3541, this.f3542);
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2410(byte[] bArr, int i10) {
        int i11 = this.f3539;
        if (i11 > 0) {
            this.f2630 = C3823.m1630(bArr, i10, i11);
        }
        return super.m3281(bArr, i10);
    }
}
