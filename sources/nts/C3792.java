package nts;

/* renamed from: nts.ᆄ  reason: contains not printable characters */
public class C3792 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3949 f1322 = new C3949();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f1323 = new C3753();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3778 f1324 = new C3778();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3996 f1325 = new C3996();

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C4134 f1326 = new C4134();

    public C3792() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1294(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1323;
        r02.m1334(r12.f1252, r12.f3542);
        int i10 = this.f1323.f1252;
        if (i10 == 0) {
            this.f1322.m2176(r02);
        } else if (i10 == 2) {
            C3778 r13 = this.f1324;
            r02.m1346(r13.f3541, r13.f3542);
        }
        this.f1325.m3311(r02);
        C4134 r14 = this.f1326;
        r02.m1346(r14.f3541, r14.f3542);
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1295(byte[] bArr, int i10) {
        int r42 = this.f1323.m3270(bArr, i10);
        C3753 r02 = this.f1323;
        if (!r02.f3546) {
            return r42;
        }
        int i11 = r02.f1252;
        if (i11 == 0) {
            r42 = this.f1322.m3270(bArr, r42);
            if (!this.f1322.f3546) {
                return r42;
            }
        } else if (i11 == 2) {
            r42 = this.f1324.m3270(bArr, r42);
            if (!this.f1324.f3546) {
                return r42;
            }
        }
        int r43 = this.f1325.m3270(bArr, r42);
        if (!this.f1325.f3546) {
            return r43;
        }
        int r44 = this.f1326.m3270(bArr, r43);
        return !this.f1326.f3546 ? r44 : m3274(bArr, r44);
    }
}
