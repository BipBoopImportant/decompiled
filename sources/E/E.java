package E;

import H2.i;
import J.c;
import S.m;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C5048t0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.n;
import androidx.camera.core.r;
import java.util.concurrent.Executor;

public class E implements C5048t0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5048t0 f5522a;

    /* renamed from: b  reason: collision with root package name */
    private P f5523b;

    E(C5048t0 t0Var) {
        this.f5522a = t0Var;
    }

    private n j(n nVar) {
        if (nVar == null) {
            return null;
        }
        g1 b10 = this.f5523b == null ? g1.b() : g1.a(new Pair(this.f5523b.i(), this.f5523b.h().get(0)));
        this.f5523b = null;
        return new r(nVar, new Size(nVar.getWidth(), nVar.getHeight()), new c(new m(b10, nVar.F2().a())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(C5048t0.a aVar, C5048t0 t0Var) {
        aVar.a(this);
    }

    public n b() {
        return j(this.f5522a.b());
    }

    public int c() {
        return this.f5522a.c();
    }

    public void close() {
        this.f5522a.close();
    }

    public void d() {
        this.f5522a.d();
    }

    public int e() {
        return this.f5522a.e();
    }

    public void f(C5048t0.a aVar, Executor executor) {
        this.f5522a.f(new D(this, aVar), executor);
    }

    public n g() {
        return j(this.f5522a.g());
    }

    public int getHeight() {
        return this.f5522a.getHeight();
    }

    public Surface getSurface() {
        return this.f5522a.getSurface();
    }

    public int getWidth() {
        return this.f5522a.getWidth();
    }

    /* access modifiers changed from: package-private */
    public void h(P p10) {
        i.j(this.f5523b == null, "Pending request should be null");
        this.f5523b = p10;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.f5523b = null;
    }
}
