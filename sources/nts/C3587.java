package nts;

/* renamed from: nts.Б  reason: contains not printable characters */
public class C3587 extends C3793 {

    /* renamed from: ᘺ  reason: contains not printable characters */
    public C3683 f328;

    public C3587(byte[] bArr, byte[] bArr2, int i10, int i11, long j10) {
        super(bArr2, 64, 64, i10, i11, 64);
        C3683 r10 = new C3683();
        this.f328 = r10;
        r10.m811(bArr, bArr2, j10);
        this.f102 = true;
        this.f104 = true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m344() {
        C3683 r02 = this.f328;
        byte[] bArr = this.f99;
        C3683.m808(bArr, r02.f823, r02.f824, r02.f822, r02.f825);
        r02.f825 = (r02.f825 + bArr.length) % 64;
    }
}
