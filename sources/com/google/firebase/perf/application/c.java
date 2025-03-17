package com.google.firebase.perf.application;

import Ac.a;
import Bc.f;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.j;
import androidx.fragment.app.C5187o;
import com.google.firebase.perf.util.g;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final a f68521e = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Activity f68522a;

    /* renamed from: b  reason: collision with root package name */
    private final j f68523b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<C5187o, f.a> f68524c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f68525d;

    public c(Activity activity) {
        this(activity, new j(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    private g<f.a> b() {
        if (!this.f68525d) {
            f68521e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] b10 = this.f68523b.b();
        if (b10 == null) {
            f68521e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        } else if (b10[0] != null) {
            return g.e(f.a(b10));
        } else {
            f68521e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return g.a();
        }
    }

    public void c() {
        if (this.f68525d) {
            f68521e.b("FrameMetricsAggregator is already recording %s", this.f68522a.getClass().getSimpleName());
            return;
        }
        this.f68523b.a(this.f68522a);
        this.f68525d = true;
    }

    public void d(C5187o oVar) {
        if (!this.f68525d) {
            f68521e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f68524c.containsKey(oVar)) {
            f68521e.b("Cannot start sub-recording because one is already ongoing with the key %s", oVar.getClass().getSimpleName());
        } else {
            g<f.a> b10 = b();
            if (!b10.d()) {
                f68521e.b("startFragment(%s): snapshot() failed", oVar.getClass().getSimpleName());
            } else {
                this.f68524c.put(oVar, b10.c());
            }
        }
    }

    public g<f.a> e() {
        if (!this.f68525d) {
            f68521e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f68524c.isEmpty()) {
            f68521e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f68524c.clear();
        }
        g<f.a> b10 = b();
        try {
            this.f68523b.c(this.f68522a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if (!(e10 instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                f68521e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                b10 = g.a();
            } else {
                throw e10;
            }
        }
        this.f68523b.d();
        this.f68525d = false;
        return b10;
    }

    public g<f.a> f(C5187o oVar) {
        if (!this.f68525d) {
            f68521e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        } else if (!this.f68524c.containsKey(oVar)) {
            f68521e.b("Sub-recording associated with key %s was not started or does not exist", oVar.getClass().getSimpleName());
            return g.a();
        } else {
            f.a remove = this.f68524c.remove(oVar);
            g<f.a> b10 = b();
            if (b10.d()) {
                return g.e(b10.c().a(remove));
            }
            f68521e.b("stopFragment(%s): snapshot() failed", oVar.getClass().getSimpleName());
            return g.a();
        }
    }

    c(Activity activity, j jVar, Map<C5187o, f.a> map) {
        this.f68525d = false;
        this.f68522a = activity;
        this.f68523b = jVar;
        this.f68524c = map;
    }
}
