package P3;

import t3.B;
import t3.N;
import t3.q;

final class d implements C6684a {

    /* renamed from: a  reason: collision with root package name */
    public final int f39343a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39344b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39345c;

    /* renamed from: d  reason: collision with root package name */
    public final int f39346d;

    /* renamed from: e  reason: collision with root package name */
    public final int f39347e;

    /* renamed from: f  reason: collision with root package name */
    public final int f39348f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f39343a = i10;
        this.f39344b = i11;
        this.f39345c = i12;
        this.f39346d = i13;
        this.f39347e = i14;
        this.f39348f = i15;
    }

    public static d c(B b10) {
        int u10 = b10.u();
        b10.X(12);
        int u11 = b10.u();
        int u12 = b10.u();
        int u13 = b10.u();
        b10.X(4);
        int u14 = b10.u();
        int u15 = b10.u();
        b10.X(8);
        return new d(u10, u11, u12, u13, u14, u15);
    }

    public long a() {
        return N.Z0((long) this.f39347e, ((long) this.f39345c) * 1000000, (long) this.f39346d);
    }

    public int b() {
        int i10 = this.f39343a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        q.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f39343a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
