package nts;

/* renamed from: nts.ࠍ  reason: contains not printable characters */
public class C3667 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3605 f782 = new C3605();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f783 = new C3753();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4195 f784 = new C4195();

    public C3667() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m725(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f783;
        r02.m1334(r12.f1252, r12.f3542);
        this.f782.m461(r02);
        C4195 r13 = this.f784;
        r02.m1346(r13.f3541, r13.f3542);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m726(byte[] bArr, int i10) {
        int r32 = this.f783.m3270(bArr, i10);
        if (!this.f783.f3546) {
            return r32;
        }
        int r33 = this.f782.m3270(bArr, r32);
        if (!this.f782.f3546) {
            return r33;
        }
        int r34 = this.f784.m3270(bArr, r33);
        return !this.f784.f3546 ? r34 : m3274(bArr, r34);
    }
}
