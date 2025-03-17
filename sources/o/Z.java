package O;

import C.C4404l;
import C.G0;
import C.v0;
import C.w0;
import H2.a;
import I.n;
import java.util.Objects;
import java.util.concurrent.Executor;
import ob.C10101e;

public class Z implements S {

    /* renamed from: a  reason: collision with root package name */
    private final w0 f9593a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f9594b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Throwable> f9595c;

    public Z(C4404l lVar) {
        w0 f10 = lVar.f();
        Objects.requireNonNull(f10);
        this.f9593a = f10;
        this.f9594b = lVar.c();
        this.f9595c = lVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(G0 g02) {
        this.f9593a.c(g02);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(v0 v0Var) {
        this.f9593a.a(v0Var);
    }

    public void a(v0 v0Var) {
        this.f9594b.execute(new Y(this, v0Var));
    }

    public C10101e<Void> b(int i10, int i11) {
        return n.n(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public void c(G0 g02) {
        this.f9594b.execute(new X(this, g02));
    }

    public void release() {
    }
}
