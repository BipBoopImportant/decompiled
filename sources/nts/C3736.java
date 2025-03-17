package nts;

/* renamed from: nts.ൎ  reason: contains not printable characters */
public class C3736 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3918 f1070 = new C3918();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3753 f1071 = new C3753();

    /* renamed from: ഗ  reason: contains not printable characters */
    public boolean f1072;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3686 f1073 = new C3686();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3546 f1074;

    /* renamed from: ᢼ  reason: contains not printable characters */
    public byte[] f1075;

    public C3736() {
        C3546 r02 = new C3546();
        this.f1074 = r02;
        this.f1075 = null;
        this.f1072 = false;
        this.f3542 = 48;
        r02.m3271(false);
        this.f1074.f3542 = 160;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1126(C3796 r42) {
        C3796 r02 = new C3796();
        C3753 r12 = this.f1071;
        r02.m1334(r12.f1252, r12.f3542);
        this.f1070.m3311(r02);
        C3686 r13 = this.f1073;
        r02.m1346(r13.f3541, r13.f3542);
        C3546 r14 = this.f1074;
        if (r14.f3537) {
            r14.f3542 = 160;
            r14.m104(r02);
        }
        byte[] bArr = this.f1075;
        if (bArr != null) {
            r02.m1339(bArr);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1127(byte[] bArr, int i10) {
        int i11 = this.f3539 + i10;
        int r62 = this.f1071.m3270(bArr, i10);
        if (!this.f1071.f3546) {
            return r62;
        }
        int r63 = this.f1070.m3270(bArr, r62);
        if (!this.f1070.f3546) {
            return r63;
        }
        int r64 = this.f1073.m3270(bArr, r63);
        if (!this.f1073.f3546) {
            return r64;
        }
        if (r64 == i11) {
            return m3274(bArr, r64);
        }
        if (!this.f1072) {
            if (r64 >= bArr.length) {
                return r64;
            }
            if ((bArr[r64] & 255) == 160) {
                this.f1074.f3537 = true;
            }
            this.f1072 = true;
        }
        C3546 r12 = this.f1074;
        if (r12.f3537) {
            r64 = r12.m103(bArr, r64);
        }
        if (r64 >= i11 || i11 > bArr.length) {
            i11 = r64;
        } else {
            this.f1075 = C3823.m1630(bArr, r64, i11 - r64);
        }
        return m3274(bArr, i11);
    }
}
