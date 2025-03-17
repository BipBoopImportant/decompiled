package P;

import C.C4391e0;
import C.v0;
import G.p;
import G.q;
import H2.i;
import I.n;
import O.N;
import O.S;
import O.a0;
import Q.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.J;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

public class r {

    /* renamed from: a  reason: collision with root package name */
    final S f11812a;

    /* renamed from: b  reason: collision with root package name */
    final J f11813b;

    /* renamed from: c  reason: collision with root package name */
    final J f11814c;

    /* renamed from: d  reason: collision with root package name */
    private c f11815d;

    /* renamed from: e  reason: collision with root package name */
    private b f11816e;

    class a implements I.c<v0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f11817a;

        a(N n10) {
            this.f11817a = n10;
        }

        public void b(Throwable th2) {
            if (this.f11817a.t() != 2 || !(th2 instanceof CancellationException)) {
                C4391e0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f11817a.t()), th2);
                return;
            }
            C4391e0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        }

        /* renamed from: c */
        public void a(v0 v0Var) {
            i.g(v0Var);
            r.this.f11812a.a(v0Var);
        }
    }

    public static abstract class b {
        public static b d(N n10, N n11, List<d> list) {
            return new b(n10, n11, list);
        }

        public abstract List<d> a();

        public abstract N b();

        public abstract N c();
    }

    public static class c extends HashMap<d, N> {
    }

    public r(J j10, J j11, S s10) {
        this.f11813b = j10;
        this.f11814c = j11;
        this.f11812a = s10;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void e(J j10, J j11, N n10, N n11, Map.Entry<d, N> entry) {
        N value = entry.getValue();
        Size e10 = n10.s().e();
        Rect a10 = entry.getKey().a().a();
        if (!n10.u()) {
            j10 = null;
        }
        v0.a f10 = v0.a.f(e10, a10, j10, entry.getKey().a().c(), entry.getKey().a().g());
        Size e11 = n11.s().e();
        Rect a11 = entry.getKey().b().a();
        if (!n11.u()) {
            j11 = null;
        }
        n.j(value.j(entry.getKey().a().b(), f10, v0.a.f(e11, a11, j11, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), H.a.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f11815d;
        if (cVar != null) {
            for (N i10 : cVar.values()) {
                i10.i();
            }
        }
    }

    private void g(J j10, J j11, N n10, N n11, Map<d, N> map) {
        for (Map.Entry next : map.entrySet()) {
            e(j10, j11, n10, n11, next);
            ((N) next.getValue()).e(new q(this, j10, j11, n10, n11, next));
        }
    }

    private void h(J j10, N n10, Map<d, N> map, boolean z10) {
        this.f11812a.c(n10.l(j10, z10));
    }

    private N j(N n10, f fVar) {
        Rect a10 = fVar.a();
        int c10 = fVar.c();
        boolean g10 = fVar.g();
        Matrix matrix = new Matrix();
        i.a(q.j(q.f(a10, c10), fVar.d()));
        Rect r10 = q.r(fVar.d());
        return new N(fVar.e(), fVar.b(), n10.s().g().e(fVar.d()).a(), matrix, false, r10, n10.q() - c10, -1, n10.w() != g10);
    }

    public void f() {
        this.f11812a.release();
        p.d(new p(this));
    }

    public c i(b bVar) {
        p.a();
        this.f11816e = bVar;
        this.f11815d = new c();
        N b10 = this.f11816e.b();
        N c10 = this.f11816e.c();
        for (d next : this.f11816e.a()) {
            this.f11815d.put(next, j(b10, next.a()));
        }
        h(this.f11813b, b10, this.f11815d, true);
        h(this.f11814c, c10, this.f11815d, false);
        g(this.f11813b, this.f11814c, b10, c10, this.f11815d);
        return this.f11815d;
    }
}
