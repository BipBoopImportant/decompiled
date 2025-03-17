package H9;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: H9.c  reason: case insensitive filesystem */
public final class C6529c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    private static final C6529c f36551e = new C6529c();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f36552a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f36553b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f36554c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f36555d = false;

    /* renamed from: H9.c$a */
    public interface a {
        void a(boolean z10);
    }

    private C6529c() {
    }

    public static C6529c b() {
        return f36551e;
    }

    public static void c(Application application) {
        C6529c cVar = f36551e;
        synchronized (cVar) {
            try {
                if (!cVar.f36555d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f36555d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f36551e) {
            try {
                Iterator it = this.f36554c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f36551e) {
            this.f36554c.add(aVar);
        }
    }

    public boolean d() {
        return this.f36552a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f36553b.get()) {
            if (o.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f36553b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f36552a.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f36553b;
        boolean compareAndSet = this.f36552a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f36553b;
        boolean compareAndSet = this.f36552a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f36552a.compareAndSet(false, true)) {
            this.f36553b.set(true);
            f(true);
        }
    }
}
