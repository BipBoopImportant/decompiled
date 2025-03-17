package nts;

import java.util.Vector;

/* renamed from: nts.ਸ  reason: contains not printable characters */
public class C3699 {

    /* renamed from: ગ  reason: contains not printable characters */
    public C4105 f905 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4105 f906 = null;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Vector m892(long[] jArr) {
        C4105 r52;
        long[] jArr2 = jArr;
        Vector vector = new Vector();
        C4105 r32 = this.f906;
        int i10 = 0;
        while (r32 != null && i10 < jArr2.length) {
            long j10 = jArr2[i10];
            long j11 = jArr2[i10 + 1];
            long j12 = r32.f3525;
            int i11 = (j10 > j12 ? 1 : (j10 == j12 ? 0 : -1));
            if (i11 >= 0) {
                long j13 = r32.f3524;
                if (j10 > j13) {
                    r32 = r32.f3523;
                } else if (j11 < j13) {
                    if (i11 == 0) {
                        vector.add(Long.valueOf(j12));
                        vector.add(Long.valueOf(j11));
                        r32.f3525 = j11 + 1;
                    } else {
                        vector.add(Long.valueOf(j10));
                        vector.add(Long.valueOf(j11));
                        C4105 r92 = new C4105(r32.f3525, j10 - 1);
                        r32.f3525 = j11 + 1;
                        if (this.f906 == r32) {
                            this.f906 = r92;
                        }
                        r92.f3526 = r32.f3526;
                        r92.f3523 = r32;
                        C4105 r53 = r32.f3526;
                        if (r53 != null) {
                            r53.f3523 = r92;
                        }
                        r32.f3526 = r92;
                    }
                } else if (i11 == 0) {
                    vector.add(Long.valueOf(j12));
                    vector.add(Long.valueOf(r32.f3524));
                    r52 = r32.f3523;
                    m893(r32);
                    r32 = r52;
                } else {
                    vector.add(Long.valueOf(j12));
                    vector.add(Long.valueOf(j10));
                    r32.f3524 = j10 - 1;
                    r32 = r32.f3523;
                }
            } else if (j11 >= j12) {
                if (j11 < r32.f3524) {
                    vector.add(Long.valueOf(j12));
                    vector.add(Long.valueOf(j11));
                    r32.f3525 = j11 + 1;
                } else {
                    vector.add(Long.valueOf(j12));
                    vector.add(Long.valueOf(r32.f3524));
                    r52 = r32.f3523;
                    m893(r32);
                    r32 = r52;
                }
            }
            i10 += 2;
        }
        return vector;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m893(C4105 r32) {
        if (this.f906 == r32) {
            this.f906 = r32.f3523;
        }
        if (this.f905 == r32) {
            this.f905 = r32.f3526;
        }
        C4105 r02 = r32.f3526;
        if (r02 != null) {
            r02.f3523 = r32.f3523;
        }
        C4105 r12 = r32.f3523;
        if (r12 != null) {
            r12.f3526 = r02;
        }
        r32.f3526 = null;
        r32.f3523 = null;
    }
}
