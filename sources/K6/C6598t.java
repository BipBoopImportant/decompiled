package K6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: K6.t  reason: case insensitive filesystem */
final class C6598t implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<Pair<String, Long>> f37708a = new ArrayList<>();

    C6598t() {
    }

    public final String a() {
        try {
            Iterator<Pair<String, Long>> it = this.f37708a.iterator();
            String str = "";
            while (it.hasNext()) {
                Pair next = it.next();
                str = str + ((String) next.first) + "," + next.second + ";";
            }
            this.f37708a.clear();
            return str;
        } catch (Exception e10) {
            y.a(e10);
            return "";
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f37708a.size() < 10) {
            this.f37708a.add(new Pair("2", Long.valueOf(System.currentTimeMillis())));
        }
        C6595p.c("BackgroundEventManager", "Activity paused: " + activity.getLocalClassName(), new Throwable[0]);
    }

    public final void onActivityResumed(Activity activity) {
        if (this.f37708a.size() < 10) {
            this.f37708a.add(new Pair("3", Long.valueOf(System.currentTimeMillis())));
        }
        C6595p.c("BackgroundEventManager", "Activity resumed: " + activity.getLocalClassName(), new Throwable[0]);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
