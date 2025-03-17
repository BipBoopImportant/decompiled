package wK;

import U0.A1;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import g1.C5355x;
import kotlin.Metadata;
import r0.l;
import r0.m;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0016"}, d2 = {"LwK/s7;", "T", "", "<init>", "()V", "key", "LU0/A1;", "", "b", "(Ljava/lang/Object;)LU0/A1;", "visible", "LXH/N;", "c", "(Ljava/lang/Object;Z)V", "Lr0/m;", "a", "(Ljava/lang/Object;)Lr0/m;", "Lg1/x;", "LU0/r0;", "Lg1/x;", "visibleStates", "interactionSources", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.s7  reason: case insensitive filesystem */
final class C18481s7<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C5355x<T, C4899r0<Boolean>> f151576a = p1.h();

    /* renamed from: b  reason: collision with root package name */
    private final C5355x<T, m> f151577b = p1.h();

    public final m a(T t10) {
        C5355x<T, m> xVar = this.f151577b;
        m mVar = xVar.get(t10);
        if (mVar == null) {
            mVar = l.a();
            xVar.put(t10, mVar);
        }
        return mVar;
    }

    public final A1<Boolean> b(T t10) {
        C5355x<T, C4899r0<Boolean>> xVar = this.f151576a;
        C4899r0<Boolean> r0Var = xVar.get(t10);
        if (r0Var == null) {
            r0Var = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            xVar.put(t10, r0Var);
        }
        return r0Var;
    }

    public final void c(T t10, boolean z10) {
        C5355x<T, C4899r0<Boolean>> xVar = this.f151576a;
        C4899r0<Boolean> r0Var = xVar.get(t10);
        if (r0Var == null) {
            r0Var = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            xVar.put(t10, r0Var);
        }
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
