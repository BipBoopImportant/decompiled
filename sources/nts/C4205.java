package nts;

import java.util.Vector;
import nts.C4100;

/* renamed from: nts.ギ  reason: contains not printable characters */
public class C4205 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4100 f4065 = new C4100();

    /* renamed from: ગ  reason: contains not printable characters */
    public Vector m3761() {
        C4100 r02 = this.f4065;
        r02.getClass();
        Vector vector = new Vector();
        for (C4100.C4101 r03 = r02.f3502; r03 != null; r03 = r03.f3504) {
            vector.add(r03.f3506);
        }
        return vector;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m3763() {
        return this.f4065.f3502 == null;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4100.C4101 m3762(long j10, Object obj) {
        C4100.C4101 r12;
        C4100.C4101 r02 = this.f4065.f3501;
        while (r02 != null && ((Long) r02.f3503).longValue() >= j10) {
            r02 = r02.f3505;
        }
        if (r02 == null) {
            C4100 r03 = this.f4065;
            C4100.C4101 r13 = r03.f3502;
            if (r13 == null) {
                C4100.C4101 r14 = r03.f3501;
                if (r14 == null) {
                    r12 = new C4100.C4101(r03, obj);
                    r03.f3502 = r12;
                    r03.f3501 = r12;
                } else {
                    r12 = r03.m3251(r14, obj);
                }
            } else {
                C4100.C4101 r22 = new C4100.C4101(r03, obj);
                C4100.C4101 r62 = r03.f3501;
                if (r13 == r62) {
                    r03.f3502 = r22;
                    r22.f3504 = r62;
                    r62.f3505 = r22;
                } else {
                    r13.f3505 = r22;
                    r22.f3504 = r13;
                    r03.f3502 = r22;
                }
                r12 = r22;
            }
        } else {
            r12 = this.f4065.m3251(r02, obj);
        }
        r12.f3503 = Long.valueOf(j10);
        return r12;
    }
}
