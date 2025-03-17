package a9;

import G8.t;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.MotionEvent;
import com.contentsquare.android.sdk.C7154u0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.g3  reason: case insensitive filesystem */
public final class C6833g3 implements S1, C6979y6, Application.ActivityLifecycleCallbacks, O6 {

    /* renamed from: a  reason: collision with root package name */
    public final Application f42574a;

    /* renamed from: b  reason: collision with root package name */
    public final C6946u5 f42575b;

    /* renamed from: c  reason: collision with root package name */
    public final C6806d0 f42576c;

    /* renamed from: d  reason: collision with root package name */
    public final C7154u0 f42577d;

    public C6833g3(Application application, C6946u5 u5Var, C6806d0 d0Var) {
        t tVar = new t();
        C7154u0 u0Var = new C7154u0(application, tVar);
        C17542s.j(application, "application");
        C17542s.j(u5Var, "captureTouchEvent");
        C17542s.j(d0Var, "eventsProvidersManager");
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(u0Var, "gestureProcessor");
        this.f42574a = application;
        this.f42575b = u5Var;
        this.f42576c = d0Var;
        this.f42577d = u0Var;
        application.registerActivityLifecycleCallbacks(this);
        u5Var.getClass();
        C17542s.j(this, "onTouchListener");
        u5Var.f42889c.add(new WeakReference(this));
        u0Var.f47655d = this;
    }

    public final synchronized void a(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        this.f42577d.b(motionEvent);
    }

    public final void b(Z2 z22) {
        C17542s.j(z22, "event");
        C6806d0 d0Var = this.f42576c;
        synchronized (d0Var) {
            C17542s.j(z22, "event");
            d0Var.f42497a.add(z22);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C17542s.j(activity, "activity");
        this.f42575b.a(this);
    }

    public final void onActivityResumed(Activity activity) {
        C17542s.j(activity, "activity");
        C6946u5 u5Var = this.f42575b;
        u5Var.getClass();
        C17542s.j(this, "onTouchListener");
        u5Var.f42889c.add(new WeakReference(this));
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

    public final synchronized void a() {
        this.f42574a.unregisterActivityLifecycleCallbacks(this);
        this.f42575b.a(this);
        this.f42577d.f47655d = null;
    }
}
