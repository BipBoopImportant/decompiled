package nts;

/* renamed from: nts.ሠ  reason: contains not printable characters */
public class C3815 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4114 f1523;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4036 f1524 = new C4036();

    public C3815() {
        C4114 r02 = new C4114();
        this.f1523 = r02;
        this.f3542 = 48;
        r02.m3278(false);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1569(C3796 r42) {
        C3796 r02 = new C3796();
        r02.m1341(C3796.m1318(this.f1524.f1400), 6);
        this.f1523.m3277(r02);
        r02.f1337 = 48;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1570(byte[] bArr, int i10) {
        int r42 = this.f1524.m3270(bArr, i10);
        if (!this.f1524.f3546) {
            return r42;
        }
        int r43 = this.f1523.m3270(bArr, r42);
        C4114 r02 = this.f1523;
        if (!r02.f3546) {
            return r43;
        }
        r02.f3542 = r02.f3548;
        return m3274(bArr, r43);
    }
}
