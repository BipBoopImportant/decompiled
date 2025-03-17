package nts;

/* renamed from: nts.ㅟ  reason: contains not printable characters */
public class C4224 extends C3755 {

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f4204 = 10;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f4205;

    public C4224(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 16, 16, i10, i11, i12);
        int[] iArr = new int[64];
        this.f4205 = iArr;
        this.f4204 = C3724.m1025(bArr, 0, bArr.length, iArr, new int[64]);
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3836() {
        C3724.m1023(this.f99, this.f4205, this.f4204);
    }
}
