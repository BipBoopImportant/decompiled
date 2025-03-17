package G9;

import K9.C6620s;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: G9.a  reason: case insensitive filesystem */
public class C6520a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    boolean f36309a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f36310b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) {
        C6620s.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f36309a) {
            this.f36309a = true;
            IBinder iBinder = (IBinder) this.f36310b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f36310b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
