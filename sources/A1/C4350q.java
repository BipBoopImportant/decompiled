package A1;

import XH.C16814e;
import c2.r;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5673m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a$\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LA1/B;", "", "a", "(LA1/B;)Z", "b", "c", "d", "j", "k", "Lo1/g;", "g", "(LA1/B;)J", "h", "ignoreConsumed", "i", "(LA1/B;Z)J", "Lc2/r;", "size", "e", "(LA1/B;J)Z", "Lo1/m;", "extendedTouchPadding", "f", "(LA1/B;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.q  reason: case insensitive filesystem */
public final class C4350q {
    public static final boolean a(B b10) {
        return !b10.p() && !b10.l() && b10.i();
    }

    public static final boolean b(B b10) {
        return !b10.l() && b10.i();
    }

    public static final boolean c(B b10) {
        return !b10.p() && b10.l() && !b10.i();
    }

    public static final boolean d(B b10) {
        return b10.l() && !b10.i();
    }

    @C16814e
    public static final boolean e(B b10, long j10) {
        long h10 = b10.h();
        float m10 = C5667g.m(h10);
        float n10 = C5667g.n(h10);
        return m10 < 0.0f || m10 > ((float) r.h(j10)) || n10 < 0.0f || n10 > ((float) r.g(j10));
    }

    public static final boolean f(B b10, long j10, long j11) {
        if (!P.g(b10.n(), P.f4356a.d())) {
            return e(b10, j10);
        }
        long h10 = b10.h();
        float m10 = C5667g.m(h10);
        float n10 = C5667g.n(h10);
        return m10 < (-C5673m.l(j11)) || m10 > ((float) r.h(j10)) + C5673m.l(j11) || n10 < (-C5673m.i(j11)) || n10 > ((float) r.g(j10)) + C5673m.i(j11);
    }

    public static final long g(B b10) {
        return i(b10, false);
    }

    public static final long h(B b10) {
        return i(b10, true);
    }

    private static final long i(B b10, boolean z10) {
        long q10 = C5667g.q(b10.h(), b10.k());
        return (z10 || !b10.p()) ? q10 : C5667g.f26701b.c();
    }

    public static final boolean j(B b10) {
        return !C5667g.j(i(b10, false), C5667g.f26701b.c());
    }

    public static final boolean k(B b10) {
        return !C5667g.j(i(b10, true), C5667g.f26701b.c());
    }
}
