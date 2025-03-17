package nts;

/* renamed from: nts.Յ  reason: contains not printable characters */
public class C3630 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4109 f611 = new C4109();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public byte[] f612 = null;

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m598(byte[] bArr, int i10) {
        if (this.f3546) {
            return i10;
        }
        int r02 = this.f611.m3270(bArr, i10);
        byte[] bArr2 = this.f612;
        if (bArr2 == null) {
            this.f612 = C3823.m1630(bArr, i10, r02 - i10);
        } else {
            int i11 = r02 - i10;
            byte[] bArr3 = new byte[(bArr2.length + i11)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, i10, bArr3, this.f612.length, i11);
            this.f612 = bArr3;
        }
        this.f3546 = this.f611.f3546;
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m599(C3796 r22) {
        byte[] bArr = this.f612;
        if (bArr != null) {
            r22.m1339(bArr);
        } else {
            this.f611.m3264(r22);
        }
    }
}
