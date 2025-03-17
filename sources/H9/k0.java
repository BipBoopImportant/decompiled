package H9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import xa.C8972m;

abstract class k0 extends Q {

    /* renamed from: b  reason: collision with root package name */
    protected final C8972m f36594b;

    public k0(int i10, C8972m mVar) {
        super(i10);
        this.f36594b = mVar;
    }

    public final void a(Status status) {
        this.f36594b.d(new b(status));
    }

    public final void b(Exception exc) {
        this.f36594b.d(exc);
    }

    public final void c(I i10) {
        try {
            h(i10);
        } catch (DeadObjectException e10) {
            a(p0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(p0.e(e11));
        } catch (RuntimeException e12) {
            this.f36594b.d(e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(I i10);
}
