package K9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class k0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f37881a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C6604c f37882b;

    public k0(C6604c cVar, int i10) {
        this.f37882b = cVar;
        this.f37881a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6604c cVar = this.f37882b;
        if (iBinder == null) {
            C6604c.d0(cVar, 16);
            return;
        }
        synchronized (cVar.f37806n) {
            try {
                C6604c cVar2 = this.f37882b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar2.f37807o = (queryLocalInterface == null || !(queryLocalInterface instanceof C6616n)) ? new Z(iBinder) : (C6616n) queryLocalInterface;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f37882b.e0(0, (Bundle) null, this.f37881a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f37882b.f37806n) {
            this.f37882b.f37807o = null;
        }
        C6604c cVar = this.f37882b;
        int i10 = this.f37881a;
        Handler handler = cVar.f37804l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
