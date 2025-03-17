package nts;

/* renamed from: nts.ⲝ  reason: contains not printable characters */
public class C4148 {

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] f3772 = C3596.f365;

    /* renamed from: ഇ  reason: contains not printable characters */
    public long f3773 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3446() {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3447() {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static C4148 m3445(C4042 r52) {
        C4148 r12;
        if (r52.f1611 < 2) {
            return null;
        }
        int i10 = r52.f1610;
        try {
            int r13 = (int) r52.m2709((int[]) null);
            int r32 = (int) r52.m2709((int[]) null);
            if (r52.m1731() < r32) {
                r52.f1610 = i10;
                return null;
            }
            if (r13 == 0) {
                r12 = new C4076();
            } else if (r13 == 1) {
                r12 = new C3539();
            } else if (r13 == 3) {
                r12 = new C4030();
            } else if (r13 == 4) {
                r12 = new C3879();
            } else if (r13 == 5) {
                r12 = new C3547();
            } else if (r13 == 7) {
                r12 = new C3770();
            } else if (r13 != 13) {
                if (r32 > 0) {
                    r52.m1732(r32);
                }
                r52.m1747(0, r52.f1610);
                r52.f1610 = 0;
                return m3445(r52);
            } else {
                r12 = new C3619();
            }
            byte[] r22 = C3823.m1636(r52.m1732(r32));
            r12.f3772 = r22;
            if (r22.length > 0) {
                r12.m3446();
            }
            r52.m1747(0, r52.f1610);
            r52.f1610 = 0;
            return r12;
        } catch (Exception unused) {
            r52.f1610 = i10;
            return null;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3448(byte[] bArr) {
        if (bArr == null) {
            this.f3772 = C3596.f365;
        }
        this.f3772 = C3823.m1636(bArr);
    }
}
