package fb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class r implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f72950a;

    /* synthetic */ r(t tVar, s sVar) {
        this.f72950a = tVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f72950a.f72953b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f72950a.c().post(new p(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f72950a.f72953b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f72950a.c().post(new q(this));
    }
}
