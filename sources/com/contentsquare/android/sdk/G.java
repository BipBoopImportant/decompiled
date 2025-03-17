package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import QJ.F0;
import QJ.T;
import XH.C16807N;
import a9.C6838h0;
import a9.C6876l6;
import a9.D4;
import a9.H1;
import a9.J4;
import a9.R5;
import android.app.Activity;
import android.app.Application;
import com.contentsquare.android.sdk.t1;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import dI.C17168i;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;

public final class G implements t1.a {

    /* renamed from: a  reason: collision with root package name */
    public final Application f46971a;

    /* renamed from: b  reason: collision with root package name */
    public final C6838h0 f46972b;

    /* renamed from: c  reason: collision with root package name */
    public final O0 f46973c;

    /* renamed from: d  reason: collision with root package name */
    public final b f46974d;

    /* renamed from: e  reason: collision with root package name */
    public final C7151t f46975e;

    /* renamed from: f  reason: collision with root package name */
    public final F f46976f;

    /* renamed from: g  reason: collision with root package name */
    public final c f46977g;

    /* renamed from: h  reason: collision with root package name */
    public final D8.c f46978h = new D8.c("LegacyComponentsHolder");

    /* renamed from: i  reason: collision with root package name */
    public boolean f46979i;

    /* renamed from: j  reason: collision with root package name */
    public C f46980j;

    /* renamed from: k  reason: collision with root package name */
    public final X8.b f46981k;

    /* renamed from: l  reason: collision with root package name */
    public final N f46982l;

    public G(Application application, C6838h0 h0Var, O0 o02, b bVar, C7151t tVar, F f10, c cVar) {
        C17542s.j(application, "application");
        C17542s.j(h0Var, "eventsStatusPrefsHelper");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(bVar, "configuration");
        C17542s.j(tVar, "eventsProcessor");
        C17542s.j(f10, "componentListener");
        C17542s.j(cVar, "preferenceStore");
        this.f46971a = application;
        this.f46972b = h0Var;
        this.f46973c = o02;
        this.f46974d = bVar;
        this.f46975e = tVar;
        this.f46976f = f10;
        this.f46977g = cVar;
        X8.b j10 = X8.b.j(application);
        C17542s.i(j10, "getInstance(application)");
        this.f46981k = j10;
        this.f46982l = new N(j10, o02, bVar);
    }

    public final void a() {
        this.f46978h.f("SDK started tracking...");
        if (!this.f46979i) {
            if (this.f46972b.f42591a.b(E8.b.IS_HIDE_EVENT_PENDING, false)) {
                String f10 = this.f46972b.f42591a.f(E8.b.SCHEDULED_APP_HIDE_EVENT, (String) null);
                if (f10 != null) {
                    try {
                        this.f46978h.f("sending hide event");
                        JSONObject jSONObject = new JSONObject(f10);
                        O0 o02 = this.f46973c;
                        o02.getClass();
                        C17542s.j(jSONObject, FeatureVariable.JSON_TYPE);
                        F0 unused = C16314k.d(o02.f47074c, (C17168i) null, (T) null, new J4(o02, jSONObject, (C17164e<? super J4>) null), 3, (Object) null);
                        this.f46978h.f("hide event pending flag removed");
                    } catch (JSONException e10) {
                        D8.c cVar = this.f46978h;
                        H1.a(cVar, "The serialized hide event: [" + f10 + "] failed to be parsed into JSON with parsing error message: [" + e10.getMessage() + ']', e10);
                        C16807N n10 = C16807N.f139792a;
                    }
                }
                this.f46972b.f42591a.o(E8.b.IS_HIDE_EVENT_PENDING);
                this.f46972b.f42591a.o(E8.b.SCHEDULED_APP_HIDE_EVENT);
            }
            this.f46978h.f("sending start event");
            O0 o03 = this.f46973c;
            C7133k d10 = this.f46981k.d();
            C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
            o03.a(C7133k.b(d10, 0));
            if (this.f46980j == null) {
                this.f46980j = X8.c.d(this.f46971a).b();
            }
            this.f46978h.f("the session was validated, attaching listeners");
            C c10 = this.f46980j;
            if (c10 != null) {
                Application application = this.f46971a;
                C17542s.j(application, "application");
                application.registerActivityLifecycleCallbacks(c10);
                Activity activity = c10.f46923i.f42433a.get();
                if (activity != null) {
                    C17542s.j(activity, "activity");
                    C.b(activity, c10.f46931q, c10.f46918d);
                }
                ((D4) c10.f46921g).f41965i = true;
            }
            this.f46971a.registerComponentCallbacks(this.f46976f);
        } else {
            this.f46978h.f("SDK was already tracking, moving along...");
        }
        this.f46979i = true;
    }

    public final void b() {
        if (this.f46979i) {
            C c10 = this.f46980j;
            if (c10 != null) {
                Application application = this.f46971a;
                C17542s.j(application, "application");
                application.unregisterActivityLifecycleCallbacks(c10);
                D4 d42 = (D4) c10.f46921g;
                d42.f41965i = false;
                Activity activity = c10.f46927m;
                if (activity != null) {
                    d42.b(activity);
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
                }
                c10.f46927m = null;
            }
            this.f46971a.unregisterComponentCallbacks(this.f46976f);
            this.f46980j = null;
        } else {
            this.f46978h.f("SDK was already stopped, moving along...");
        }
        this.f46979i = false;
    }
}
