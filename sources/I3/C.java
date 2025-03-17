package I3;

import G3.C6479C;
import G3.k0;
import J3.C6571d;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import q3.C5792c;
import q3.J;
import q3.M;
import t3.C5950a;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    private a f36663a;

    /* renamed from: b  reason: collision with root package name */
    private C6571d f36664b;

    public interface a {
        void a(u0 u0Var) {
        }

        void b();
    }

    /* access modifiers changed from: protected */
    public final C6571d b() {
        return (C6571d) C5950a.i(this.f36664b);
    }

    public M c() {
        return M.f27952C;
    }

    public v0.a d() {
        return null;
    }

    public void e(a aVar, C6571d dVar) {
        this.f36663a = aVar;
        this.f36664b = dVar;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        a aVar = this.f36663a;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void g(u0 u0Var) {
        a aVar = this.f36663a;
        if (aVar != null) {
            aVar.a(u0Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.f36663a = null;
        this.f36664b = null;
    }

    public abstract D k(v0[] v0VarArr, k0 k0Var, C6479C.b bVar, J j10);

    public void l(C5792c cVar) {
    }

    public void m(M m10) {
    }
}
