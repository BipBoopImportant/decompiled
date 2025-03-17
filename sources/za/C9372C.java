package Za;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: Za.C  reason: case insensitive filesystem */
final class C9372C implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C9373D f65016a;

    /* synthetic */ C9372C(C9373D d10, C9371B b10) {
        this.f65016a = d10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f65016a.f65019b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C9373D d10 = this.f65016a;
        d10.c().post(new z(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f65016a.f65019b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C9373D d10 = this.f65016a;
        d10.c().post(new C9370A(this));
    }
}
