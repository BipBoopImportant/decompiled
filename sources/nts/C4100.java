package nts;

/* renamed from: nts.ὒ  reason: contains not printable characters */
public class C4100 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C4101 f3501 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4101 f3502 = null;

    /* renamed from: nts.ὒ$ഇ  reason: contains not printable characters */
    public class C4101 {

        /* renamed from: ϴ  reason: contains not printable characters */
        public Object f3503 = null;

        /* renamed from: ગ  reason: contains not printable characters */
        public C4101 f3504 = null;

        /* renamed from: ഇ  reason: contains not printable characters */
        public C4101 f3505 = null;

        /* renamed from: ᐳ  reason: contains not printable characters */
        public Object f3506;

        public C4101(C4100 r12, Object obj) {
            this.f3506 = obj;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4101 m3251(C4101 r22, Object obj) {
        C4101 r02 = new C4101(this, obj);
        C4101 r32 = this.f3501;
        if (r22 == r32) {
            C4101 r23 = this.f3502;
            if (r23 == r32) {
                this.f3501 = r02;
                r23.f3504 = r02;
                r02.f3505 = r23;
            } else {
                r32.f3504 = r02;
                r02.f3505 = r32;
                this.f3501 = r02;
            }
        } else {
            C4101 r33 = r22.f3504;
            r22.f3504 = r02;
            r02.f3505 = r22;
            r02.f3504 = r33;
            r33.f3505 = r02;
        }
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public Object m3250(C4101 r42) {
        C4101 r02 = this.f3502;
        if (r42 == r02) {
            C4101 r03 = r02.f3504;
            this.f3502 = r03;
            if (r03 == null) {
                this.f3501 = null;
            } else {
                r03.f3505 = null;
            }
        } else if (r42 == this.f3501) {
            C4101 r04 = r42.f3505;
            this.f3501 = r04;
            if (r04 == null) {
                this.f3502 = null;
            } else {
                r04.f3504 = null;
            }
        } else {
            C4101 r05 = r42.f3505;
            C4101 r22 = r42.f3504;
            r05.f3504 = r22;
            r22.f3505 = r05;
        }
        r42.f3504 = null;
        r42.f3505 = null;
        return r42.f3506;
    }
}
