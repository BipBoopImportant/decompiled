package a9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.a1  reason: case insensitive filesystem */
public final class C6783a1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    public static C6783a1 f42432b;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f42433a = new WeakReference<>((Object) null);

    public C6783a1(Application application) {
        C17542s.j(application, "application");
        application.registerActivityLifecycleCallbacks(this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C17542s.j(activity, "activity");
        this.f42433a = new WeakReference<>((Object) null);
    }

    public final void onActivityResumed(Activity activity) {
        C17542s.j(activity, "activity");
        this.f42433a = new WeakReference<>(activity);
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
