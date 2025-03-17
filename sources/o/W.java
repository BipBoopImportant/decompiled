package O;

import C.C4391e0;
import C.G0;
import C.v0;
import G.p;
import G.q;
import H2.i;
import I.n;
import Q.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.impl.J;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

public class W {

    /* renamed from: a  reason: collision with root package name */
    final S f9583a;

    /* renamed from: b  reason: collision with root package name */
    final J f9584b;

    /* renamed from: c  reason: collision with root package name */
    private c f9585c;

    /* renamed from: d  reason: collision with root package name */
    private b f9586d;

    class a implements I.c<v0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f9587a;

        a(N n10) {
            this.f9587a = n10;
        }

        public void b(Throwable th2) {
            if (this.f9587a.t() != 2 || !(th2 instanceof CancellationException)) {
                C4391e0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f9587a.t()), th2);
                return;
            }
            C4391e0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        }

        /* renamed from: c */
        public void a(v0 v0Var) {
            i.g(v0Var);
            W.this.f9583a.a(v0Var);
        }
    }

    public static abstract class b {
        public static b c(N n10, List<f> list) {
            return new C4693c(n10, list);
        }

        public abstract List<f> a();

        public abstract N b();
    }

    public static class c extends HashMap<f, N> {
    }

    public W(J j10, S s10) {
        this.f9584b = j10;
        this.f9583a = s10;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void g(N n10, Map.Entry<f, N> entry) {
        N value = entry.getValue();
        n.j(value.j(entry.getKey().b(), v0.a.f(n10.s().e(), entry.getKey().a(), n10.u() ? this.f9584b : null, entry.getKey().c(), entry.getKey().g()), (v0.a) null), new a(value), H.a.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        c cVar = this.f9585c;
        if (cVar != null) {
            for (N i10 : cVar.values()) {
                i10.i();
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(Map map, G0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int b10 = hVar.b() - ((f) entry.getKey()).c();
            if (((f) entry.getKey()).g()) {
                b10 = -b10;
            }
            ((N) entry.getValue()).D(q.w(b10), -1);
        }
    }

    private void j(N n10, Map<f, N> map) {
        for (Map.Entry next : map.entrySet()) {
            g(n10, next);
            ((N) next.getValue()).e(new T(this, n10, next));
        }
    }

    private void k(N n10) {
        this.f9583a.c(n10.k(this.f9584b));
    }

    private N n(N n10, f fVar) {
        Rect r10;
        Rect a10 = fVar.a();
        int c10 = fVar.c();
        boolean g10 = fVar.g();
        Matrix matrix = new Matrix(n10.r());
        Matrix e10 = q.e(new RectF(a10), q.t(fVar.d()), c10, g10);
        matrix.postConcat(e10);
        i.a(q.j(q.f(a10, c10), fVar.d()));
        if (fVar.k()) {
            i.b(fVar.a().contains(n10.n()), String.format("Output crop rect %s must contain input crop rect %s", new Object[]{fVar.a(), n10.n()}));
            r10 = new Rect();
            RectF rectF = new RectF(n10.n());
            e10.mapRect(rectF);
            rectF.round(r10);
        } else {
            r10 = q.r(fVar.d());
        }
        Rect rect = r10;
        return new N(fVar.e(), fVar.b(), n10.s().g().e(fVar.d()).a(), matrix, false, rect, n10.q() - c10, -1, n10.w() != g10);
    }

    public S e() {
        return this.f9583a;
    }

    public void i() {
        this.f9583a.release();
        p.d(new V(this));
    }

    /* access modifiers changed from: package-private */
    public void l(N n10, Map<f, N> map) {
        n10.f(new U(map));
    }

    public c m(b bVar) {
        p.a();
        this.f9586d = bVar;
        this.f9585c = new c();
        N b10 = bVar.b();
        for (f next : bVar.a()) {
            this.f9585c.put(next, n(b10, next));
        }
        k(b10);
        j(b10, this.f9585c);
        l(b10, this.f9585c);
        return this.f9585c;
    }
}
