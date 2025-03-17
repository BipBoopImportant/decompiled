package a9;

import D8.c;
import H2.j;
import YH.C16877v;
import a9.C6864k2;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.contentsquare.android.sdk.C7164z0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;

public final class D4 implements C6908p6 {

    /* renamed from: a  reason: collision with root package name */
    public final j<Activity> f41957a;

    /* renamed from: b  reason: collision with root package name */
    public final C7164z0 f41958b;

    /* renamed from: c  reason: collision with root package name */
    public final C6946u5 f41959c;

    /* renamed from: d  reason: collision with root package name */
    public String f41960d;

    /* renamed from: e  reason: collision with root package name */
    public String f41961e;

    /* renamed from: f  reason: collision with root package name */
    public C8537a[] f41962f = new C8537a[0];

    /* renamed from: g  reason: collision with root package name */
    public final c f41963g = new c("GesturesInterceptor");

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<ViewGroup> f41964h = new WeakReference<>((Object) null);

    /* renamed from: i  reason: collision with root package name */
    public boolean f41965i;

    public D4(C7164z0 z0Var, C6946u5 u5Var) {
        j<Activity> jVar = G1.f42017d;
        C17542s.j(jVar, "activitiesFilter");
        C17542s.j(z0Var, "gestureProcessor");
        C17542s.j(u5Var, "captureTouchEvent");
        this.f41957a = jVar;
        this.f41958b = z0Var;
        this.f41959c = u5Var;
    }

    public final void a(Activity activity) {
        C17542s.j(activity, "liveActivity");
        this.f41963g.l("attaching Glass");
        Window window = activity.getWindow();
        View view = null;
        if ((window != null ? window.getDecorView() : null) instanceof ViewGroup) {
            View decorView = window.getDecorView();
            C17542s.h(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f41964h = new WeakReference<>((ViewGroup) decorView);
            if (!this.f41957a.test(activity)) {
                C6946u5 u5Var = this.f41959c;
                u5Var.getClass();
                C17542s.j(activity, "activity");
                O2 o22 = u5Var.f42888b;
                List<WeakReference<O6>> list = u5Var.f42889c;
                o22.getClass();
                C17542s.j(list, "listeners");
                o22.f42172a.getClass();
                C17542s.j(list, "listeners");
                C6864k2.f42646g = list;
                O2 o23 = u5Var.f42888b;
                o23.getClass();
                C17542s.j(activity, "activity");
                Window window2 = activity.getWindow();
                View decorView2 = window2 != null ? window2.getDecorView() : null;
                if (decorView2 instanceof ViewGroup) {
                    view = decorView2;
                } else {
                    o23.f42173b.f("Cannot get decor view from activity.");
                }
                if (view != null && view.getViewTreeObserver().isAlive()) {
                    o23.f42174c = new WeakReference<>(activity.getWindow());
                    view.getViewTreeObserver().addOnGlobalLayoutListener(o23);
                    o23.f42173b.f("Listen to DecorView global layout.");
                }
                Window window3 = activity.getWindow();
                if (window3 != null) {
                    u5Var.f42887a.getClass();
                    C6864k2.b.a(window3);
                }
            }
        }
    }

    public final void b(Activity activity) {
        C17542s.j(activity, "liveActivity");
        this.f41963g.l("detaching Glass");
        C6946u5 u5Var = this.f41959c;
        u5Var.getClass();
        C17542s.j(activity, "activity");
        O2 o22 = u5Var.f42888b;
        List<? extends WeakReference<O6>> n10 = C16877v.n();
        o22.getClass();
        C17542s.j(n10, "listeners");
        o22.f42172a.getClass();
        C17542s.j(n10, "listeners");
        C6864k2.f42646g = n10;
        u5Var.f42888b.a(activity);
        Window window = activity.getWindow();
        if (window != null) {
            u5Var.f42887a.getClass();
            C17542s.j(window, "window");
            C17542s.j(window, "window");
            Window.Callback callback = window.getCallback();
            if (callback instanceof C6864k2) {
                window.setCallback(((C6864k2) callback).f42648b);
            }
        }
        this.f41964h = new WeakReference<>((Object) null);
    }
}
