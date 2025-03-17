package nts;

/* renamed from: nts.ݿ  reason: contains not printable characters */
public class C3663 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3965 f774 = new C3965();

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3717 f775 = new C3717();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3774 f776 = new C3774();

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3774 f777 = new C3774();

    public C3663() {
        C3717 r02 = this.f775;
        r02.f3582.f1400 = C4089.f3468;
        r02.f3581.m3271(false);
        this.f776.f1252 = 20;
        this.f777.f1252 = 1;
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m716(C3796 r52) {
        C3717 r12;
        C3796 r02 = new C3796();
        C3717 r13 = this.f775;
        if (r13 != null && !r13.f3582.f1400.equals(C4089.f3468)) {
            C3796 r14 = new C3796();
            this.f775.m3311(r14);
            r14.f1337 = 160;
            r02.m1336(r14.m1349());
        }
        C3965 r15 = this.f774;
        if (!(r15 == null || (r12 = r15.f2366) == null || r12.f3582.f1400.equals(C4089.f3468))) {
            C3796 r16 = new C3796();
            this.f774.m3311(r16);
            r16.f1337 = 161;
            r02.m1336(r16.m1349());
        }
        C3796 r17 = new C3796();
        C3774 r22 = this.f776;
        r17.m1334(r22.f1252, r22.f3542);
        r17.f1337 = 162;
        r02.m1336(r17.m1349());
        C3796 r18 = new C3796();
        C3774 r23 = this.f777;
        r18.m1334(r23.f1252, r23.f3542);
        r18.f1337 = 163;
        r02.m1336(r18.m1349());
        r02.f1337 = this.f3542;
        r52.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m717(byte[] bArr, int i10) {
        if ((bArr[i10] & 255) == 160) {
            C4114 r02 = new C4114();
            r02.f3542 = 160;
            i10 = r02.m3270(bArr, i10);
            this.f775.m3279(r02.f3541);
        }
        if (m3280(bArr, i10) == 161) {
            C4114 r03 = new C4114();
            r03.f3542 = 161;
            i10 = r03.m3270(bArr, i10);
            this.f774.m3279(r03.f3541);
        }
        if (m3280(bArr, i10) == 162) {
            C4114 r04 = new C4114();
            r04.f3542 = 162;
            i10 = r04.m3270(bArr, i10);
            this.f776.m3279(r04.f3541);
        }
        if (m3280(bArr, i10) == 163) {
            C4114 r05 = new C4114();
            r05.f3542 = 163;
            i10 = r05.m3270(bArr, i10);
            this.f777.m3279(r05.f3541);
        }
        this.f3546 = true;
        return i10;
    }
}
