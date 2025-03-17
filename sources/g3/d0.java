package G3;

import android.net.Uri;
import q3.J;
import q3.w;
import t3.C5950a;

public final class d0 extends J {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f35844r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static final w f35845s = new w.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* renamed from: e  reason: collision with root package name */
    private final long f35846e;

    /* renamed from: f  reason: collision with root package name */
    private final long f35847f;

    /* renamed from: g  reason: collision with root package name */
    private final long f35848g;

    /* renamed from: h  reason: collision with root package name */
    private final long f35849h;

    /* renamed from: i  reason: collision with root package name */
    private final long f35850i;

    /* renamed from: j  reason: collision with root package name */
    private final long f35851j;

    /* renamed from: k  reason: collision with root package name */
    private final long f35852k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f35853l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f35854m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f35855n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f35856o;

    /* renamed from: p  reason: collision with root package name */
    private final w f35857p;

    /* renamed from: q  reason: collision with root package name */
    private final w.g f35858q;

    public d0(long j10, boolean z10, boolean z11, boolean z12, Object obj, w wVar) {
        this(j10, j10, 0, 0, z10, z11, z12, obj, wVar);
    }

    public int b(Object obj) {
        return f35844r.equals(obj) ? 0 : -1;
    }

    public J.b g(int i10, J.b bVar, boolean z10) {
        C5950a.c(i10, 0, 1);
        return bVar.s((Object) null, z10 ? f35844r : null, 0, this.f35849h, -this.f35851j);
    }

    public int i() {
        return 1;
    }

    public Object m(int i10) {
        C5950a.c(i10, 0, 1);
        return f35844r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r3) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q3.J.c o(int r25, q3.J.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            t3.C5950a.c(r3, r1, r2)
            long r1 = r0.f35852k
            boolean r14 = r0.f35854m
            if (r14 == 0) goto L_0x002e
            boolean r3 = r0.f35855n
            if (r3 != 0) goto L_0x002e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002e
            long r3 = r0.f35850i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
        L_0x0024:
            r16 = r5
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r16 = r1
        L_0x0030:
            java.lang.Object r4 = q3.J.c.f27915q
            q3.w r5 = r0.f35857p
            java.lang.Object r6 = r0.f35856o
            long r7 = r0.f35846e
            long r9 = r0.f35847f
            long r11 = r0.f35848g
            boolean r13 = r0.f35853l
            q3.w$g r15 = r0.f35858q
            long r1 = r0.f35850i
            r18 = r1
            r21 = 0
            long r1 = r0.f35851j
            r22 = r1
            r20 = 0
            r3 = r26
            q3.J$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.d0.o(int, q3.J$c, long):q3.J$c");
    }

    public int p() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, w wVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, wVar, z12 ? wVar.f28321d : null);
    }

    public d0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, w wVar, w.g gVar) {
        this.f35846e = j10;
        this.f35847f = j11;
        this.f35848g = j12;
        this.f35849h = j13;
        this.f35850i = j14;
        this.f35851j = j15;
        this.f35852k = j16;
        this.f35853l = z10;
        this.f35854m = z11;
        this.f35855n = z12;
        this.f35856o = obj;
        this.f35857p = (w) C5950a.e(wVar);
        this.f35858q = gVar;
    }
}
