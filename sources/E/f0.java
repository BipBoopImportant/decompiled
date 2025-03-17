package E;

import C.U;
import C.V;
import G.p;
import H2.i;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.n;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    private int f5629a = new M.a().a();

    interface a {
        void b(f0 f0Var);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(int i10) {
        if (l() != null) {
            l().a(i10);
        } else if (j() != null) {
            j().a(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(V v10) {
        boolean z10 = false;
        boolean z11 = j() != null;
        if (l() != null) {
            z10 = true;
        }
        if (z11 && !z10) {
            U.e j10 = j();
            Objects.requireNonNull(j10);
            j10.d(v10);
        } else if (!z10 || z11) {
            throw new IllegalStateException("One and only one callback is allowed.");
        } else {
            U.f l10 = l();
            Objects.requireNonNull(l10);
            l10.e(v10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(Bitmap bitmap) {
        if (l() != null) {
            l().b(bitmap);
        } else if (j() != null) {
            j().e(bitmap);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(U.h hVar) {
        U.f l10 = l();
        Objects.requireNonNull(l10);
        Objects.requireNonNull(hVar);
        l10.d(hVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(n nVar) {
        U.e j10 = j();
        Objects.requireNonNull(j10);
        Objects.requireNonNull(nVar);
        j10.c(nVar);
    }

    public static f0 v(Executor executor, U.e eVar, U.f fVar, U.g gVar, Rect rect, Matrix matrix, int i10, int i11, int i12, List<C5040p> list) {
        boolean z10 = false;
        i.b((fVar == null) == (gVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        boolean z11 = fVar == null;
        if (eVar == null) {
            z10 = true;
        }
        i.b(z10 ^ z11, "One and only one on-disk or in-memory callback should be present.");
        return new C4425h(executor, eVar, fVar, gVar, rect, matrix, i10, i11, i12, list);
    }

    /* access modifiers changed from: package-private */
    public void A(n nVar) {
        g().execute(new b0(this, nVar));
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        p.a();
        int i10 = this.f5629a;
        if (i10 <= 0) {
            return false;
        }
        this.f5629a = i10 - 1;
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract Executor g();

    /* access modifiers changed from: package-private */
    public abstract int h();

    /* access modifiers changed from: package-private */
    public abstract Rect i();

    public abstract U.e j();

    /* access modifiers changed from: package-private */
    public abstract int k();

    public abstract U.f l();

    /* access modifiers changed from: package-private */
    public abstract U.g m();

    /* access modifiers changed from: package-private */
    public abstract int n();

    /* access modifiers changed from: package-private */
    public abstract Matrix o();

    /* access modifiers changed from: package-private */
    public abstract List<C5040p> p();

    /* access modifiers changed from: package-private */
    public void w(int i10) {
        g().execute(new e0(this, i10));
    }

    /* access modifiers changed from: package-private */
    public void x(V v10) {
        g().execute(new a0(this, v10));
    }

    /* access modifiers changed from: package-private */
    public void y(Bitmap bitmap) {
        g().execute(new c0(this, bitmap));
    }

    /* access modifiers changed from: package-private */
    public void z(U.h hVar) {
        g().execute(new d0(this, hVar));
    }
}
