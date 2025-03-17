package nts;

/* renamed from: nts.ፌ  reason: contains not printable characters */
public class C3853 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3774 f1639 = new C3774();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3774 f1640 = new C3774();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3774 f1641 = new C3774();

    public C3853() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1788(C3796 r42) {
        C3796 r02 = new C3796();
        C3774 r12 = this.f1640;
        r02.m1334(r12.f1252, r12.f3542);
        C3774 r13 = this.f1639;
        r02.m1334(r13.f1252, r13.f3542);
        C3774 r14 = this.f1641;
        r02.m1334(r14.f1252, r14.f3542);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1789(byte[] bArr, int i10) {
        int r32 = this.f1640.m3270(bArr, i10);
        if (!this.f1640.f3546) {
            return r32;
        }
        int r33 = this.f1639.m3270(bArr, r32);
        if (!this.f1639.f3546) {
            return r33;
        }
        int r34 = this.f1641.m3270(bArr, r33);
        return !this.f1641.f3546 ? r34 : m3274(bArr, r34);
    }
}
