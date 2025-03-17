package nts;

/* renamed from: nts.ກ  reason: contains not printable characters */
public class C3756 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3837 f1150 = new C3837();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3774 f1151 = new C3774();

    public C3756() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1183(C3796 r42) {
        C3796 r02 = new C3796();
        C3774 r12 = this.f1151;
        r02.m1334(r12.f1252, r12.f3542);
        this.f1150.m1694(r02);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1184(byte[] bArr, int i10) {
        int r32 = this.f1151.m3270(bArr, i10);
        if (!this.f1151.f3546) {
            return r32;
        }
        int r33 = this.f1150.m3270(bArr, r32);
        return !this.f1150.f3546 ? r33 : m3274(bArr, r33);
    }
}
