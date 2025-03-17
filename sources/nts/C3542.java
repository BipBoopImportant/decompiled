package nts;

/* renamed from: nts.ȇ  reason: contains not printable characters */
public class C3542 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3899 f32 = new C3899();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3717 f33 = new C3717();

    public C3542() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m99(C3796 r42) {
        C3796 r02 = new C3796();
        this.f33.m3311(r02);
        C3899 r12 = this.f32;
        r02.m1346(r12.f3541, r12.f3542);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m100(byte[] bArr, int i10) {
        int r32 = this.f33.m3270(bArr, i10);
        if (!this.f33.f3546) {
            return r32;
        }
        int r33 = this.f32.m3270(bArr, r32);
        return !this.f32.f3546 ? r33 : m3274(bArr, r33);
    }
}
