package H9;

import K9.C6620s;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;

public final class l0 extends p0 {

    /* renamed from: b  reason: collision with root package name */
    protected final a f36606b;

    public l0(int i10, a aVar) {
        super(i10);
        this.f36606b = (a) C6620s.m(aVar, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f36606b.p(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f36606b.p(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void c(I i10) {
        try {
            this.f36606b.n(i10.t());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    public final void d(C6550y yVar, boolean z10) {
        yVar.c(this.f36606b, z10);
    }
}
