package K6;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* renamed from: K6.h  reason: case insensitive filesystem */
public final class C6587h {

    /* renamed from: c  reason: collision with root package name */
    private static final C6587h f37687c = new C6587h();

    /* renamed from: a  reason: collision with root package name */
    WeakReference<Context> f37688a = null;

    /* renamed from: b  reason: collision with root package name */
    String f37689b = null;

    /* renamed from: K6.h$a */
    class a implements Runnable {
        a() {
        }

        public final void run() {
            C6587h.b(C6587h.this);
        }
    }

    /* renamed from: K6.h$b */
    class b implements Runnable {
        b() {
        }

        public final void run() {
            C6587h.this.g();
        }
    }

    public static C6587h a() {
        return f37687c;
    }

    static /* synthetic */ void b(C6587h hVar) {
        C6595p.c("SensorDataCache", "Initializing cache", new Throwable[0]);
        hVar.e();
    }

    private synchronized void e() {
        Context context = this.f37688a.get();
        if (context == null) {
            C6595p.d("SensorDataCache", "loadData: Context is null", new Throwable[0]);
        } else {
            this.f37689b = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("sensor_data", (String) null);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void g() {
        Context context = this.f37688a.get();
        if (context == null) {
            C6595p.d("SensorDataCache", "saveData: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        edit.putString("sensor_data", this.f37689b);
        edit.commit();
    }

    public final void c(Context context) {
        this.f37688a = new WeakReference<>(context);
        new Thread(new a()).start();
    }

    public final synchronized void d(String str) {
        Context context = this.f37688a.get();
        if (context == null) {
            C6595p.d("SensorDataCache", "savePoWResponse: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        edit.putString("pow_response", str);
        edit.commit();
    }
}
