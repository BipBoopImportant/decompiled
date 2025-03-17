package nts;

/* renamed from: nts.Ự  reason: contains not printable characters */
public class C4092 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f3474;

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f3475;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4126 f3476 = new C4126();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f3477;

    public C4092() {
        byte[] bArr = C3596.f365;
        this.f3475 = bArr;
        this.f3477 = bArr;
        this.f3474 = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4092)) {
            return false;
        }
        C4092 r52 = (C4092) obj;
        return this.f3476.f3582.f1400.equals(r52.f3476.f3582.f1400) && C3823.m1615(this.f3475, r52.f3475) && C3823.m1615(this.f3477, r52.f3477) && C3823.m1615(this.f3474, r52.f3474);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public C4092(C4126 r22, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z10 = C3596.f366;
        this.f3476 = r22;
        this.f3475 = bArr;
        this.f3477 = bArr2;
        this.f3474 = bArr3;
    }
}
