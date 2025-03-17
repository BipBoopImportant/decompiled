package nts;

/* renamed from: nts.ჱ  reason: contains not printable characters */
public class C3779 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3837 f1260 = new C3837();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3542 f1261 = new C3542();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3774 f1262 = new C3774();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean f1263 = false;

    public C3779() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1258(C3796 r42) {
        C3796 r02 = new C3796();
        this.f1261.m99(r02);
        this.f1260.m1694(r02);
        C3774 r12 = this.f1262;
        if (r12.f3537) {
            r02.m1334(r12.f1252, r12.f3542);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1259(byte[] bArr, int i10) {
        int r62 = this.f1261.m3270(bArr, i10);
        if (!this.f1261.f3546) {
            return r62;
        }
        int r63 = this.f1260.m3270(bArr, r62);
        if (!this.f1260.f3546) {
            return r63;
        }
        if (!this.f1263) {
            if (r63 >= bArr.length) {
                return r63;
            }
            this.f1262.f3537 = (bArr[r63] & 255) == 2;
            this.f1263 = true;
        }
        C3774 r02 = this.f1262;
        if (r02.f3537) {
            r63 = r02.m3270(bArr, r63);
        }
        return m3274(bArr, r63);
    }
}
