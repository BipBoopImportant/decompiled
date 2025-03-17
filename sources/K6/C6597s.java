package K6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.cyberfend.cyfsecurity.a;

/* renamed from: K6.s  reason: case insensitive filesystem */
public final class C6597s implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private int f37706a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f37707b = 0;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6595p.c("LifecycleCallbacks", "Activity Created: " + activity.getLocalClassName(), new Throwable[0]);
    }

    public final void onActivityDestroyed(Activity activity) {
        C6595p.c("LifecycleCallbacks", "Activity Destroyed: " + activity.getLocalClassName(), new Throwable[0]);
    }

    public final void onActivityPaused(Activity activity) {
        C6595p.c("LifecycleCallbacks", "Activity Paused: " + activity.getLocalClassName(), new Throwable[0]);
        int i10 = this.f37706a + -1;
        this.f37706a = i10;
        if (i10 == 0) {
            a.a();
            a.e(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        C6595p.c("LifecycleCallbacks", "Activity Resumed:" + activity.getLocalClassName(), new Throwable[0]);
        if (this.f37706a == 0) {
            a.b(activity);
            a.e(true);
        }
        this.f37706a++;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f37707b == 0) {
            a.c(activity.getApplication());
        }
        this.f37707b++;
    }

    public final void onActivityStopped(Activity activity) {
        this.f37707b--;
    }
}
