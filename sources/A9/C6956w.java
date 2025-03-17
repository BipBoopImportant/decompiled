package a9;

import G8.t;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.w  reason: case insensitive filesystem */
public final class C6956w implements O6, Runnable, S1, Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Application f42905a;

    /* renamed from: b  reason: collision with root package name */
    public final t f42906b;

    /* renamed from: c  reason: collision with root package name */
    public final I6 f42907c;

    /* renamed from: d  reason: collision with root package name */
    public final C6946u5 f42908d;

    /* renamed from: e  reason: collision with root package name */
    public final G f42909e;

    /* renamed from: f  reason: collision with root package name */
    public final C6806d0 f42910f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f42911g;

    public C6956w(Application application, t tVar, I6 i62, C6946u5 u5Var, G g10, C6806d0 d0Var) {
        C17542s.j(application, "application");
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(i62, "throttleOperator");
        C17542s.j(u5Var, "captureTouchEvent");
        C17542s.j(g10, "touchProcessor");
        C17542s.j(d0Var, "eventsProvidersManager");
        this.f42905a = application;
        this.f42906b = tVar;
        this.f42907c = i62;
        this.f42908d = u5Var;
        this.f42909e = g10;
        this.f42910f = d0Var;
        application.registerActivityLifecycleCallbacks(this);
        u5Var.getClass();
        C17542s.j(this, "onTouchListener");
        u5Var.f42889c.add(new WeakReference(this));
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            C17542s.j(motionEvent, "event");
            long a10 = this.f42906b.a();
            G g10 = this.f42909e;
            g10.getClass();
            C17542s.j(motionEvent, "motionEvent");
            if (motionEvent.getPointerCount() > 1) {
                motionEvent.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                int pointerCount = motionEvent.getPointerCount();
                for (int i10 = 0; i10 < pointerCount; i10++) {
                    g10.a(motionEvent.getPointerId(i10), a10, (int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                }
            } else {
                g10.a(motionEvent.getPointerId(0), a10, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            ArrayList arrayList = new ArrayList();
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                int size = g10.f42007b.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(g10.f42007b.valueAt(i11));
                }
                g10.f42007b = new SparseArray<>();
            }
            if (motionEvent.getActionMasked() != 1) {
                if (motionEvent.getActionMasked() != 3) {
                    this.f42911g = arrayList;
                    I6 i62 = this.f42907c;
                    i62.getClass();
                    C17542s.j(this, "runnable");
                    i62.a(this, i62.f42074c);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f42910f.b((C6921r4) it.next());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
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
        this.f42908d.a(this);
    }

    public final void onActivityResumed(Activity activity) {
        C17542s.j(activity, "activity");
        C6946u5 u5Var = this.f42908d;
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

    public final synchronized void run() {
        ArrayList arrayList = this.f42911g;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f42910f.b((C6921r4) it.next());
            }
        }
    }

    public final void a() {
        this.f42905a.unregisterActivityLifecycleCallbacks(this);
        this.f42908d.a(this);
    }
}
