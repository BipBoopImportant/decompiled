package R7;

import L7.s;
import Y7.l;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    final Set<Activity> f39697a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f39698b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f39699a;

        /* renamed from: R7.h$a$a  reason: collision with other inner class name */
        class C0636a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f39701a;

            C0636a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f39701a = onDrawListener;
            }

            public void run() {
                s.b().h();
                h.this.f39698b = true;
                h.b(a.this.f39699a, this.f39701a);
                h.this.f39697a.clear();
            }
        }

        a(View view) {
            this.f39699a = view;
        }

        public void onDraw() {
            l.v(new C0636a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    public void a(Activity activity) {
        if (!this.f39698b && this.f39697a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
