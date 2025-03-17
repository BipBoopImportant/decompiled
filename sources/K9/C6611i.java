package K9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* renamed from: K9.i  reason: case insensitive filesystem */
public abstract class C6611i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f37868a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f37869b = 9;

    /* renamed from: c  reason: collision with root package name */
    private static v0 f37870c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f37871d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Executor f37872e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f37873f = false;

    public static int a() {
        return 4225;
    }

    public static C6611i b(Context context) {
        synchronized (f37868a) {
            try {
                if (f37870c == null) {
                    f37870c = new v0(context.getApplicationContext(), f37873f ? c().getLooper() : context.getMainLooper(), f37872e);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f37870c;
    }

    public static HandlerThread c() {
        synchronized (f37868a) {
            try {
                HandlerThread handlerThread = f37871d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f37869b);
                f37871d = handlerThread2;
                handlerThread2.start();
                HandlerThread handlerThread3 = f37871d;
                return handlerThread3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract ConnectionResult d(r0 r0Var, ServiceConnection serviceConnection, String str, Executor executor);

    /* access modifiers changed from: protected */
    public abstract void e(r0 r0Var, ServiceConnection serviceConnection, String str);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        e(new r0(str, str2, 4225, z10), serviceConnection, str3);
    }
}
