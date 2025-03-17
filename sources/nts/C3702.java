package nts;

/* renamed from: nts.ઈ  reason: contains not printable characters */
public class C3702 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public C3638 f917;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C3638 f918;

    public C3702() {
        this.f625 = 288;
        m909();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m909() {
        this.f918 = new C4107();
        this.f917 = new C3610();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m910(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            this.f918.m621(bArr, i10, i11, bArr, i10);
            this.f917.m621(bArr, i10, i11, bArr, i10);
            return;
        }
        throw new C3641(C3727.m1052("VRDP", 0, 4, 54));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m911() {
        byte[] bArr = new byte[0];
        this.f918.m623(bArr, 0, 0);
        this.f917.m623(bArr, 0, 0);
        C3638 r12 = this.f918;
        C4094 r22 = C3990.f2631;
        byte[] bArr2 = r12.f624;
        byte[] bArr3 = this.f917.f624;
        byte[] bArr4 = new byte[(this.f625 / 8)];
        this.f624 = bArr4;
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        System.arraycopy(bArr3, 0, this.f624, bArr2.length, bArr3.length);
        return this.f624;
    }
}
