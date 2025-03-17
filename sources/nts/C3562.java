package nts;

import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

/* renamed from: nts.ʶ  reason: contains not printable characters */
public class C3562 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public Vector f129 = new Vector();

    /* renamed from: ࡏ  reason: contains not printable characters */
    public long f130 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public long f131 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public long f132 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public Hashtable f133 = new Hashtable();

    /* renamed from: ᐳ  reason: contains not printable characters */
    public C4131 f134 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long f135 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public long f136 = 0;

    public C3562(C4131 r42) {
        this.f134 = r42;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C3607 m199(long j10) {
        long j11;
        int i10 = (int) (j10 & 3);
        C3678 r32 = C3727.m1057((Map) this.f133);
        int i11 = 0;
        while (r32.m802()) {
            if ((((Long) r32.f808).longValue() & 3) == ((long) i10)) {
                i11++;
            }
        }
        if (i10 == 0) {
            this.f134.getClass();
            j11 = this.f130;
        } else if (i10 == 1) {
            this.f134.getClass();
            j11 = this.f135;
        } else if (i10 == 2) {
            this.f134.getClass();
            j11 = this.f131;
        } else {
            this.f134.getClass();
            j11 = this.f136;
        }
        if (((long) i11) >= j11) {
            return null;
        }
        C3607 r02 = new C3607(this.f134, j10);
        this.f133.put(Long.valueOf(j10), r02);
        return r02;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3607 m200(long j10) {
        return (C3607) this.f133.get(Long.valueOf(j10));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m203(long j10) {
        this.f133.remove(Long.valueOf(j10));
        this.f129.add(Long.valueOf(j10));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m202() {
        C3678 r02 = C3727.m1057((Map) this.f133);
        while (r02.m802()) {
            this.f129.add(r02.f808);
        }
        this.f133.clear();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3607 m201(boolean z10, boolean z11) {
        long j10 = this.f132;
        long j11 = (j10 << 2) & Long.MAX_VALUE;
        if (!z11) {
            j11++;
        }
        if (!z10) {
            j11 += 2;
        }
        this.f132 = j10 + 1;
        return m199(j11);
    }
}
