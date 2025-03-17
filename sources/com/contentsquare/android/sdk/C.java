package com.contentsquare.android.sdk;

import D8.c;
import E8.b;
import F8.g;
import H2.a;
import H2.j;
import a9.C6783a1;
import a9.C6798c0;
import a9.C6830g0;
import a9.C6838h0;
import a9.C6876l6;
import a9.C6908p6;
import a9.C6910q0;
import a9.C6917r0;
import a9.C6925s0;
import a9.D4;
import a9.J;
import a9.R5;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.contentsquare.android.sdk.C7125g;
import com.contentsquare.android.sdk.D0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;

public final class C implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final G f46915a;

    /* renamed from: b  reason: collision with root package name */
    public final C6838h0 f46916b;

    /* renamed from: c  reason: collision with root package name */
    public final O0 f46917c;

    /* renamed from: d  reason: collision with root package name */
    public final List<j<Activity>> f46918d;

    /* renamed from: e  reason: collision with root package name */
    public final C0 f46919e;

    /* renamed from: f  reason: collision with root package name */
    public final C7133k f46920f;

    /* renamed from: g  reason: collision with root package name */
    public final C6908p6 f46921g;

    /* renamed from: h  reason: collision with root package name */
    public final J0 f46922h;

    /* renamed from: i  reason: collision with root package name */
    public final C6783a1 f46923i;

    /* renamed from: j  reason: collision with root package name */
    public final g f46924j;

    /* renamed from: k  reason: collision with root package name */
    public final C6876l6 f46925k;

    /* renamed from: l  reason: collision with root package name */
    public final c f46926l;

    /* renamed from: m  reason: collision with root package name */
    public Activity f46927m;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f46928n;

    /* renamed from: o  reason: collision with root package name */
    public Runnable f46929o;

    /* renamed from: p  reason: collision with root package name */
    public final a<Activity> f46930p;

    /* renamed from: q  reason: collision with root package name */
    public final C6830g0 f46931q;

    /* renamed from: r  reason: collision with root package name */
    public final a<Activity> f46932r;

    public C() {
        throw null;
    }

    public static void b(Activity activity, a aVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((j) it.next()).test(activity)) {
                return;
            }
        }
        aVar.accept(activity);
    }

    public static final void c(C c10, Activity activity) {
        C17542s.j(c10, "this$0");
        c10.f46927m = activity;
        J0 j02 = c10.f46922h;
        c10.f46919e.getClass();
        j02.b(C0.f46934b);
        C6908p6 p6Var = c10.f46921g;
        C17542s.i(activity, "target");
        ((D4) p6Var).a(activity);
        c10.f46925k.a(activity);
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName != null) {
            G g10 = c10.f46915a;
            g10.getClass();
            C17542s.j(canonicalName, "name");
            C7133k d10 = g10.f46981k.d();
            C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
            D0.a aVar = (D0.a) C7133k.b(d10, 30);
            aVar.f46943k = canonicalName;
            g10.f46973c.a(aVar);
        }
    }

    public static final void d(C c10, C7125g.a aVar) {
        C17542s.j(c10, "this$0");
        C17542s.j(aVar, "$builder");
        c10.f46917c.a(aVar);
        c10.f46916b.f42591a.o(b.IS_HIDE_EVENT_PENDING);
        c10.f46915a.f46975e.a();
        c10.f46922h.f47017d.f42654d = true;
        c10.f46929o = null;
    }

    public static final void e(C c10, Activity activity) {
        C17542s.j(c10, "this$0");
        if (activity != null) {
            ((D4) c10.f46921g).b(activity);
            C6876l6 l6Var = c10.f46925k;
            l6Var.getClass();
            C17542s.j(activity, "activity");
            WeakHashMap weakHashMap = l6Var.f42696c.get(activity);
            if (weakHashMap != null) {
                for (Map.Entry value : weakHashMap.entrySet()) {
                    ((R5) value.getValue()).clear();
                }
                weakHashMap.clear();
            }
        } else {
            c10.f46926l.f("[onActivityPaused]: the activity was null when trying to detach interceptors");
        }
        c10.f46927m = null;
        c10.a();
    }

    public final void a() {
        C7125g.a aVar = (C7125g.a) C7133k.b(this.f46920f, 2);
        C7125g gVar = new C7125g(aVar);
        c cVar = J.f42076a;
        C17542s.j(gVar, "event");
        String jSONObject = J.c(gVar).toString();
        C17542s.i(jSONObject, "serializedHideEvent.toString()");
        this.f46916b.f42591a.h(b.IS_HIDE_EVENT_PENDING, true);
        C6838h0 h0Var = this.f46916b;
        h0Var.getClass();
        C17542s.j(jSONObject, "serializedJson");
        h0Var.f42591a.l(b.SCHEDULED_APP_HIDE_EVENT, jSONObject);
        C6925s0 s0Var = new C6925s0(this, aVar);
        this.f46929o = s0Var;
        this.f46926l.f("scheduling hide");
        this.f46928n.postDelayed(s0Var, 700);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C17542s.j(activity, "activity");
        b(activity, this.f46930p, this.f46918d);
    }

    public final void onActivityResumed(Activity activity) {
        C17542s.j(activity, "activity");
        b(activity, this.f46931q, this.f46918d);
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

    public C(G g10, C6838h0 h0Var, O0 o02, List list, C7133k kVar, C6908p6 p6Var, J0 j02, C6783a1 a1Var, g gVar, C6876l6 l6Var) {
        C0 c02 = C0.f46933a;
        C17542s.j(g10, "legacyComponentsHolder");
        C17542s.j(h0Var, "eventsStatusPrefsHelper");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(list, "notToBeTrackedActivityFilters");
        C17542s.j(c02, "screenViewEventsHandler");
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(p6Var, "gesturesInterceptor");
        C17542s.j(j02, "screenViewHandler");
        C17542s.j(a1Var, "liveActivityProvider");
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(l6Var, "scrollWatcherController");
        this.f46915a = g10;
        this.f46916b = h0Var;
        this.f46917c = o02;
        this.f46918d = list;
        this.f46919e = c02;
        this.f46920f = kVar;
        this.f46921g = p6Var;
        this.f46922h = j02;
        this.f46923i = a1Var;
        this.f46924j = gVar;
        this.f46925k = l6Var;
        this.f46926l = new c("CsActivityCallbacks");
        this.f46928n = new Handler(Looper.getMainLooper());
        C6798c0 c0Var = new C6798c0(this);
        l6Var.getClass();
        C17542s.j(c0Var, "<set-?>");
        l6Var.f42695b = c0Var;
        this.f46930p = new C6910q0(this);
        this.f46931q = new C6830g0(this);
        this.f46932r = new C6917r0(this);
    }
}
