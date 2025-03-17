package a9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.contentsquare.android.api.bridge.flutter.FlutterInterface;
import com.contentsquare.android.api.bridge.flutter.f;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

public final class K implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Application f42091a;

    /* renamed from: b  reason: collision with root package name */
    public final C6916q6 f42092b;

    public K(Application application, C6916q6 q6Var) {
        C17542s.j(application, "application");
        C17542s.j(q6Var, "onDrawObserver");
        this.f42091a = application;
        this.f42092b = q6Var;
    }

    public final void a() {
        this.f42091a.registerActivityLifecycleCallbacks(this);
    }

    public final void b() {
        this.f42091a.unregisterActivityLifecycleCallbacks(this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C17542s.j(activity, "activity");
        C6916q6 q6Var = this.f42092b;
        ViewTreeObserver b10 = q6Var.b();
        if (b10 != null) {
            b10.removeOnPreDrawListener(q6Var);
            q6Var.f42818a.f("Listener to onDraw removed.");
        }
        FlutterInterface.setOnFlutterEventListener((f) null);
    }

    public final void onActivityResumed(Activity activity) {
        C17542s.j(activity, "activity");
        C6916q6 q6Var = this.f42092b;
        q6Var.getClass();
        C17542s.j(activity, "activity");
        ViewTreeObserver b10 = q6Var.b();
        if (b10 != null) {
            b10.removeOnPreDrawListener(q6Var);
            q6Var.f42818a.f("Listener to onDraw removed.");
        }
        FlutterInterface.setOnFlutterEventListener((f) null);
        q6Var.f42822e = new WeakReference<>(activity.getWindow());
        ViewTreeObserver b11 = q6Var.b();
        if (b11 != null) {
            b11.addOnPreDrawListener(q6Var);
            q6Var.f42818a.f("Listen to draws.");
        }
        FlutterInterface.setOnFlutterEventListener(q6Var);
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
