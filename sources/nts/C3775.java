package nts;

/* renamed from: nts.Ⴘ  reason: contains not printable characters */
public class C3775 extends C3793 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f1253 = 10;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f1254;

    public C3775(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 16, 16, i10, i11, i12);
        int[] iArr = new int[64];
        this.f1254 = iArr;
        int i13 = this.f109;
        if (i13 == 4 || i13 == 3 || i13 == 6) {
            this.f1253 = C3724.m1025(bArr, 0, bArr.length, iArr, new int[64]);
        } else {
            this.f1253 = C3724.m1025(bArr, 0, bArr.length, new int[64], iArr);
        }
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1254() {
        int i10 = this.f109;
        if (i10 == 4 || i10 == 3 || i10 == 6) {
            C3724.m1023(this.f99, this.f1254, this.f1253);
        } else {
            C3724.m1026(this.f99, this.f1254, this.f1253);
        }
    }
}
