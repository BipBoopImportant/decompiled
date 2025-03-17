package a9;

import D8.c;
import a9.C6864k2;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

public final class O2 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final C6864k2.b f42172a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42173b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Window> f42174c = new WeakReference<>((Object) null);

    public O2(C6864k2.b bVar) {
        c cVar = new c("DecorViewTreeObserver");
        C17542s.j(bVar, "windowCallbackWrapper");
        C17542s.j(cVar, "logger");
        this.f42172a = bVar;
        this.f42173b = cVar;
    }

    public final void a(Activity activity) {
        C17542s.j(activity, "activity");
        Window window = activity.getWindow();
        View view = null;
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView instanceof ViewGroup) {
            view = decorView;
        } else {
            this.f42173b.f("Cannot get decor view from activity.");
        }
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                this.f42173b.f("Listener to DecorView global layout removed.");
            }
        }
    }

    public final void onGlobalLayout() {
        Window window = this.f42174c.get();
        if (window != null) {
            C6864k2.b bVar = this.f42172a;
            C6864k2.c cVar = C6864k2.f42643d;
            bVar.getClass();
            C6864k2.b.a(window);
        }
    }
}
