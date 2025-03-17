package nts;

import java.util.Vector;

/* renamed from: nts.ᨭ  reason: contains not printable characters */
public class C4014 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public Vector<C4113> f2709 = new Vector<>();

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m2500(C4113 r72, C4113 r82) {
        long j10 = r72.f3536;
        long j11 = r82.f3536;
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0 || j10 > r82.f3535) {
            long j12 = r72.f3535;
            if ((j12 < j11 || j12 > r82.f3535) && (i10 > 0 || j12 < r82.f3535)) {
                return false;
            }
        }
        return true;
    }
}
