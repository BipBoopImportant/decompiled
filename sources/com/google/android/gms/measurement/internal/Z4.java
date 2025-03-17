package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C7282e1;
import com.google.android.gms.internal.measurement.C7327j1;
import java.util.Objects;
import sa.f0;
import sa.g0;
import sa.h0;
import sa.i0;

public final class Z4<T extends Context & i0> {

    /* renamed from: a  reason: collision with root package name */
    private final T f50027a;

    public Z4(T t10) {
        C6620s.l(t10);
        this.f50027a = t10;
    }

    public static /* synthetic */ void d(Z4 z42, int i10, C7607h2 h2Var, Intent intent) {
        if (((i0) z42.f50027a).c(i10)) {
            h2Var.I().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            z42.k().I().a("Completed wakeful intent.");
            ((i0) z42.f50027a).a(intent);
        }
    }

    public static /* synthetic */ void e(Z4 z42, JobParameters jobParameters) {
        Log.v("FA", "AppMeasurementJobService processed last Scion upload request.");
        ((i0) z42.f50027a).b(jobParameters, false);
    }

    public static /* synthetic */ void f(Z4 z42, C7607h2 h2Var, JobParameters jobParameters) {
        h2Var.I().a("AppMeasurementJobService processed last upload request.");
        ((i0) z42.f50027a).b(jobParameters, false);
    }

    private final void g(C7728y5 y5Var, Runnable runnable) {
        y5Var.q().B(new C7561a5(this, y5Var, runnable));
    }

    private final C7607h2 k() {
        return P2.a(this.f50027a, (C7282e1) null, (Long) null).f();
    }

    public final int a(Intent intent, int i10, int i11) {
        C7607h2 f10 = P2.a(this.f50027a, (C7282e1) null, (Long) null).f();
        if (intent == null) {
            f10.J().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        f10.I().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            g(C7728y5.k(this.f50027a), new h0(this, i11, f10, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new S2(C7728y5.k(this.f50027a));
        }
        k().J().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        P2.a(this.f50027a, (C7282e1) null, (Long) null).f().I().a("Local AppMeasurementService is starting up");
    }

    @TargetApi(24)
    public final boolean h(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            C7728y5 k10 = C7728y5.k(this.f50027a);
            C7607h2 f10 = k10.f();
            f10.I().b("Local AppMeasurementJobService called. action", (String) C6620s.l(string));
            g(k10, new g0(this, f10, jobParameters));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        String str = (String) C6620s.l(string);
        C7327j1 e10 = C7327j1.e(this.f50027a);
        if (!K.f49719O0.a(null).booleanValue()) {
            return true;
        }
        e10.r(new f0(this, jobParameters));
        return true;
    }

    public final void i() {
        P2.a(this.f50027a, (C7282e1) null, (Long) null).f().I().a("Local AppMeasurementService is shutting down");
    }

    public final void j(Intent intent) {
        if (intent == null) {
            k().E().a("onRebind called with null intent");
            return;
        }
        k().I().b("onRebind called. action", intent.getAction());
    }

    public final boolean l(Intent intent) {
        if (intent == null) {
            k().E().a("onUnbind called with null intent");
            return true;
        }
        k().I().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
