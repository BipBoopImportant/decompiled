package nts;

/* renamed from: nts.д  reason: contains not printable characters */
public class C3591 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C3669 f339;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3662 f340;

    public C3591(C3662 r22) {
        this.f339 = null;
        this.f340 = r22;
        C3669 r23 = new C3669();
        this.f339 = r23;
        C4016.m2553(r23, this.f340.f771.f462.f4060);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m349() {
        C3662 r02 = this.f340;
        return r02 == null ? C3596.f365 : r02.m714();
    }

    public C3591(byte[] bArr) {
        this.f340 = null;
        this.f339 = null;
        this.f340 = new C3662();
        this.f339 = new C3669();
        this.f340.m3279(bArr);
        C4016.m2553(this.f339, this.f340.f771.f462.f4060);
    }
}
