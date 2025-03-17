package nts;

/* renamed from: nts.ዦ  reason: contains not printable characters */
public class C3841 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3947 f1599 = new C3947();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f1600 = new C3753();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3779 f1601 = new C3779();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean f1602 = false;

    public C3841() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1697(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1600;
        r02.m1334(r12.f1252, r12.f3542);
        this.f1599.m2131(r02);
        C3779 r13 = this.f1601;
        if (r13.f3537) {
            r13.m1258(r02);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1698(byte[] bArr, int i10) {
        int r52 = this.f1600.m3270(bArr, i10);
        if (!this.f1600.f3546) {
            return r52;
        }
        int r53 = this.f1599.m3270(bArr, r52);
        if (!this.f1599.f3546) {
            return r53;
        }
        if (!this.f1602) {
            if (r53 >= bArr.length) {
                this.f1601.f3537 = false;
            } else {
                if ((bArr[r53] & 255) == 48) {
                    this.f1601.f3537 = true;
                }
                this.f1602 = true;
            }
        }
        C3779 r02 = this.f1601;
        if (r02.f3537) {
            r53 = r02.m3270(bArr, r53);
        }
        return m3274(bArr, r53);
    }
}
