package nts;

/* renamed from: nts.ᇉ  reason: contains not printable characters */
public class C3802 extends C3801 {

    /* renamed from: и  reason: contains not printable characters */
    public C4126 f1401 = new C4126();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3965 f1402 = new C3965();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C4126 f1403 = new C4126();

    public C3802() {
        this.f3542 = 48;
        this.f1401.f3582.f1400 = C4089.f3468;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1414() {
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1416(byte[] bArr, int i10) {
        if ((bArr[i10] & 255) == 160) {
            C4114 r02 = new C4114();
            r02.f3542 = 160;
            i10 = r02.m3270(bArr, i10);
            C4126 r12 = new C4126();
            this.f1401 = r12;
            r12.m3279(r02.f3541);
        }
        if (m3280(bArr, i10) == 161) {
            C4114 r03 = new C4114();
            r03.f3542 = 161;
            i10 = r03.m3270(bArr, i10);
            C3965 r13 = new C3965();
            this.f1402 = r13;
            r13.m3279(r03.f3541);
        }
        if (m3280(bArr, i10) == 162) {
            C4114 r04 = new C4114();
            r04.f3542 = 162;
            i10 = r04.m3270(bArr, i10);
            C4126 r32 = new C4126();
            this.f1403 = r32;
            r32.m3279(r04.f3541);
        }
        this.f3546 = true;
        return i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1415(C3796 r52) {
        C3796 r02 = new C3796();
        String str = this.f1401.f3582.f1400;
        String str2 = C4089.f3468;
        if (!str.equals(str2)) {
            C3796 r12 = new C3796();
            this.f1401.m3311(r12);
            r12.f1337 = 160;
            r02.m1336(r12.m1349());
        }
        if (!this.f1402.f2366.f3582.f1400.equals(str2)) {
            C3796 r13 = new C3796();
            this.f1402.m3311(r13);
            r13.f1337 = 161;
            r02.m1336(r13.m1349());
        }
        C3796 r14 = new C3796();
        this.f1403.m3311(r14);
        r14.f1337 = 162;
        r02.m1336(r14.m1349());
        r02.f1337 = this.f3542;
        r52.m1336(r02.m1349());
    }
}
