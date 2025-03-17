package a9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.w4  reason: case insensitive filesystem */
public class C6961w4 implements Application.ActivityLifecycleCallbacks {
    public final void onActivityDestroyed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityResumed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
        C17542s.j(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        C17542s.j(activity, "activity");
    }
}
