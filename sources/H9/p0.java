package H9;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f36626a;

    public p0(int i10) {
        this.f36626a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(I i10);

    public abstract void d(C6550y yVar, boolean z10);
}
