package H9;

import G9.C6521b;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import xa.C8972m;

public final class n0 extends Q {

    /* renamed from: b  reason: collision with root package name */
    private final C6545t f36612b;

    /* renamed from: c  reason: collision with root package name */
    private final C8972m f36613c;

    /* renamed from: d  reason: collision with root package name */
    private final r f36614d;

    public n0(int i10, C6545t tVar, C8972m mVar, r rVar) {
        super(i10);
        this.f36613c = mVar;
        this.f36612b = tVar;
        this.f36614d = rVar;
        if (i10 == 2 && tVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f36613c.d(this.f36614d.a(status));
    }

    public final void b(Exception exc) {
        this.f36613c.d(exc);
    }

    public final void c(I i10) {
        try {
            this.f36612b.b(i10.t(), this.f36613c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(p0.e(e11));
        } catch (RuntimeException e12) {
            this.f36613c.d(e12);
        }
    }

    public final void d(C6550y yVar, boolean z10) {
        yVar.d(this.f36613c, z10);
    }

    public final boolean f(I i10) {
        return this.f36612b.c();
    }

    public final C6521b[] g(I i10) {
        return this.f36612b.e();
    }
}
