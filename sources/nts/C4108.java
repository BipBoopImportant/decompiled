package nts;

/* renamed from: nts.ᾔ  reason: contains not printable characters */
public class C4108 extends C3793 {

    /* renamed from: ᘺ  reason: contains not printable characters */
    public short[] f3530;

    public C4108(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        short[] sArr = new short[52];
        this.f3530 = sArr;
        int i13 = this.f109;
        if (i13 == 4 || i13 == 3) {
            C4189.m3682(bArr, sArr);
        } else {
            C4189.m3676(bArr, sArr);
        }
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3263() {
        C4189.m3681(this.f99, this.f3530);
    }
}
