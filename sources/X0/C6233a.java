package x0;

import c2.y;
import dI.C17164e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o1.C5667g;
import p0.v;
import tI.C17978n;
import z1.C6271a;
import z1.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lx0/a;", "Lz1/a;", "Lx0/C;", "state", "Lp0/v;", "orientation", "<init>", "(Lx0/C;Lp0/v;)V", "Lo1/g;", "", "b", "(J)F", "Lc2/y;", "a", "(JLp0/v;)J", "available", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "g0", "(JJLdI/e;)Ljava/lang/Object;", "Lx0/C;", "getState", "()Lx0/C;", "Lp0/v;", "getOrientation", "()Lp0/v;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.a  reason: case insensitive filesystem */
final class C6233a implements C6271a {

    /* renamed from: a  reason: collision with root package name */
    private final C6230C f31641a;

    /* renamed from: b  reason: collision with root package name */
    private final v f31642b;

    public C6233a(C6230C c10, v vVar) {
        this.f31641a = c10;
        this.f31642b = vVar;
    }

    private final float b(long j10) {
        return this.f31642b == v.Horizontal ? C5667g.m(j10) : C5667g.n(j10);
    }

    public long C1(long j10, int i10) {
        if (!e.d(i10, e.f32374a.b()) || ((double) Math.abs(this.f31641a.w())) <= 1.0E-6d) {
            return C5667g.f26701b.c();
        }
        float w10 = this.f31641a.w() * ((float) this.f31641a.H());
        float g10 = (((float) (this.f31641a.C().g() + this.f31641a.C().j())) * (-Math.signum(this.f31641a.w()))) + w10;
        if (this.f31641a.w() > 0.0f) {
            float f10 = g10;
            g10 = w10;
            w10 = f10;
        }
        v vVar = this.f31642b;
        v vVar2 = v.Horizontal;
        float f11 = -this.f31641a.e(-C17978n.l(vVar == vVar2 ? C5667g.m(j10) : C5667g.n(j10), w10, g10));
        float m10 = this.f31642b == vVar2 ? f11 : C5667g.m(j10);
        if (this.f31642b != v.Vertical) {
            f11 = C5667g.n(j10);
        }
        return C5667g.f(j10, m10, f11);
    }

    public long N0(long j10, long j11, int i10) {
        if (!e.d(i10, e.f32374a.a()) || b(j11) == 0.0f) {
            return C5667g.f26701b.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    public final long a(long j10, v vVar) {
        return vVar == v.Vertical ? y.e(j10, 0.0f, 0.0f, 2, (Object) null) : y.e(j10, 0.0f, 0.0f, 1, (Object) null);
    }

    public Object g0(long j10, long j11, C17164e<? super y> eVar) {
        return y.b(a(j11, this.f31642b));
    }
}
