package F9;

import android.os.IBinder;
import android.os.RemoteException;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f35591a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f35592b;

    public /* synthetic */ q(x xVar, IBinder iBinder) {
        this.f35591a = xVar;
        this.f35592b = iBinder;
    }

    public final void run() {
        x xVar = this.f35591a;
        IBinder iBinder = this.f35592b;
        synchronized (xVar) {
            if (iBinder == null) {
                xVar.a(0, "Null service connection");
                return;
            }
            try {
                xVar.f35601c = new y(iBinder);
                xVar.f35599a = 2;
                xVar.c();
            } catch (RemoteException e10) {
                xVar.a(0, e10.getMessage());
            }
        }
    }
}
