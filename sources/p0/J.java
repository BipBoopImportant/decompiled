package p0;

import A1.B;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\bø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00020\u0006*\u00020\bø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u0018\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lp0/J;", "", "Lp0/v;", "orientation", "<init>", "(Lp0/v;)V", "", "touchSlop", "Lo1/g;", "b", "(F)J", "d", "(J)F", "c", "LA1/B;", "dragEvent", "a", "(LA1/B;F)Lo1/g;", "LXH/N;", "e", "()V", "Lp0/v;", "getOrientation", "()Lp0/v;", "J", "totalPositionChange", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class J {

    /* renamed from: a  reason: collision with root package name */
    private final v f26921a;

    /* renamed from: b  reason: collision with root package name */
    private long f26922b;

    public J() {
        this((v) null, 1, (DefaultConstructorMarker) null);
    }

    private final long b(float f10) {
        if (this.f26921a == null) {
            long j10 = this.f26922b;
            return C5667g.q(this.f26922b, C5667g.s(C5667g.h(j10, C5667g.k(j10)), f10));
        }
        float d10 = d(this.f26922b) - (Math.signum(d(this.f26922b)) * f10);
        float c10 = c(this.f26922b);
        return this.f26921a == v.Horizontal ? C5668h.a(d10, c10) : C5668h.a(c10, d10);
    }

    public final C5667g a(B b10, float f10) {
        long r10 = C5667g.r(this.f26922b, C5667g.q(b10.h(), b10.k()));
        this.f26922b = r10;
        if ((this.f26921a == null ? C5667g.k(r10) : Math.abs(d(r10))) >= f10) {
            return C5667g.d(b(f10));
        }
        return null;
    }

    public final float c(long j10) {
        return this.f26921a == v.Horizontal ? C5667g.n(j10) : C5667g.m(j10);
    }

    public final float d(long j10) {
        return this.f26921a == v.Horizontal ? C5667g.m(j10) : C5667g.n(j10);
    }

    public final void e() {
        this.f26922b = C5667g.f26701b.c();
    }

    public J(v vVar) {
        this.f26921a = vVar;
        this.f26922b = C5667g.f26701b.c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : vVar);
    }
}
