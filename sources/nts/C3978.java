package nts;

/* renamed from: nts.ᡣ  reason: contains not printable characters */
public class C3978 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4114 f2542;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3801 f2543 = new C3801();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3837 f2544;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean f2545;

    public C3978() {
        C4114 r02 = new C4114();
        this.f2542 = r02;
        this.f2544 = new C3837();
        this.f2545 = false;
        this.f3542 = 48;
        r02.m3276(1);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2349(C3796 r42) {
        C3796 r02 = new C3796();
        this.f2543.m1413(r02);
        C4114 r12 = this.f2542;
        if (r12.f3537) {
            r12.m3277(r02);
        }
        this.f2544.m1694(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2350(byte[] bArr, int i10) {
        int r52 = this.f2543.m3270(bArr, i10);
        if (!this.f2543.f3546) {
            return r52;
        }
        if (!this.f2545) {
            if (r52 >= bArr.length) {
                return r52;
            }
            if ((bArr[r52] & 255) == 1) {
                this.f2542.f3537 = true;
            } else {
                this.f2542.f3537 = false;
            }
            this.f2545 = true;
        }
        C4114 r02 = this.f2542;
        if (r02.f3537) {
            r52 = r02.m3270(bArr, r52);
        }
        int r53 = this.f2544.m3270(bArr, r52);
        return !this.f2544.f3546 ? r53 : m3274(bArr, r53);
    }
}
