package nts;

/* renamed from: nts.ϙ  reason: contains not printable characters */
public class C3578 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4112 f301 = new C4112();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f302 = new C3753();

    public C3578() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m329(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f302;
        r02.m1334(r12.f1252, r12.f3542);
        this.f301.m3268(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m330(byte[] bArr, int i10) {
        int r32 = this.f302.m3270(bArr, i10);
        if (!this.f302.f3546) {
            return r32;
        }
        int r33 = this.f301.m3270(bArr, r32);
        return !this.f301.f3546 ? r33 : m3274(bArr, r33);
    }
}
