package nts;

/* renamed from: nts.ḭ  reason: contains not printable characters */
public class C4075 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3788 f3358 = new C3788();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3788 f3359 = new C3788();

    public C4075() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3200(C3796 r52) {
        C3796 r02 = new C3796();
        C3788 r12 = this.f3359;
        String str = r12.f1316;
        String str2 = C3823.f1540;
        r02.m1346(str.getBytes(), r12.f3542);
        C3788 r13 = this.f3358;
        r02.m1346(r13.f1316.getBytes(), r13.f3542);
        r02.f1337 = this.f3542;
        r52.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3201(byte[] bArr, int i10) {
        int r32 = this.f3359.m3270(bArr, i10);
        if (!this.f3359.f3546) {
            return r32;
        }
        int r33 = this.f3358.m3270(bArr, r32);
        return !this.f3358.f3546 ? r33 : m3274(bArr, r33);
    }
}
