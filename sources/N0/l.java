package N0;

import QJ.Q;
import U0.A1;
import XH.C16814e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n0.C5585H;
import nI.C17631a;
import r0.j;
import r0.o;
import r1.f;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u001a\u001a\u00020\r*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LN0/l;", "Ln0/H;", "", "bounded", "LU0/A1;", "LN0/g;", "rippleAlpha", "<init>", "(ZLU0/A1;)V", "Lr0/o$b;", "interaction", "LQJ/Q;", "scope", "LXH/N;", "b", "(Lr0/o$b;LQJ/Q;)V", "d", "(Lr0/o$b;)V", "Lr0/j;", "e", "(Lr0/j;LQJ/Q;)V", "Lr1/f;", "Lc2/h;", "radius", "Lp1/v0;", "color", "c", "(Lr1/f;FJ)V", "a", "Z", "LN0/r;", "LN0/r;", "stateLayer", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public abstract class l implements C5585H {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9229a;

    /* renamed from: b  reason: collision with root package name */
    private final r f9230b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN0/g;", "b", "()LN0/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<g> f9231c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A1<g> a12) {
            super(0);
            this.f9231c = a12;
        }

        /* renamed from: b */
        public final g invoke() {
            return this.f9231c.getValue();
        }
    }

    public l(boolean z10, A1<g> a12) {
        this.f9229a = z10;
        this.f9230b = new r(z10, new a(a12));
    }

    public abstract void b(o.b bVar, Q q10);

    public final void c(f fVar, float f10, long j10) {
        this.f9230b.b(fVar, Float.isNaN(f10) ? i.a(fVar, this.f9229a, fVar.b()) : fVar.H1(f10), j10);
    }

    public abstract void d(o.b bVar);

    public final void e(j jVar, Q q10) {
        this.f9230b.c(jVar, q10);
    }
}
