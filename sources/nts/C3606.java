package nts;

/* renamed from: nts.Ҕ  reason: contains not printable characters */
public class C3606 extends C3755 {

    /* renamed from: и  reason: contains not printable characters */
    public int[] f464 = new int[32];

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int[] f465 = new int[32];

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int[] f466;

    public C3606(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        super(bArr2, 8, 8, i10, i11, i12);
        int[] iArr = new int[32];
        this.f466 = iArr;
        C3576.m321(bArr, 0, iArr);
        C3576.m321(bArr, 8, this.f465);
        if (bArr.length == 24) {
            int[] iArr2 = new int[32];
            this.f464 = iArr2;
            C3576.m321(bArr, 16, iArr2);
        } else {
            this.f464 = this.f466;
        }
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m463() {
        C3665.m721(this.f99, this.f466, this.f465, this.f464);
    }
}
