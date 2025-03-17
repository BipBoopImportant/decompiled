package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.E2;

/* renamed from: com.google.android.gms.measurement.internal.i4  reason: case insensitive filesystem */
public final class C7616i4 extends B1 {

    /* renamed from: c  reason: collision with root package name */
    private JobScheduler f50188c;

    public C7616i4(P2 p22) {
        super(p22);
    }

    private final int C() {
        String packageName = zza().getPackageName();
        return ("measurement-client" + packageName).hashCode();
    }

    @TargetApi(24)
    public final void A(long j10) {
        w();
        k();
        JobScheduler jobScheduler = this.f50188c;
        if (jobScheduler == null || jobScheduler.getPendingJob(C()) == null) {
            E2.a B10 = B();
            if (B10 != E2.a.CLIENT_UPLOAD_ELIGIBLE) {
                f().I().b("[sgtm] Not eligible for Scion upload", B10.name());
                return;
            }
            f().I().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
            f().I().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) C6620s.l(this.f50188c)).schedule(new JobInfo.Builder(C(), new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
            return;
        }
        f().I().a("[sgtm] There's an existing pending job, skip this schedule.");
    }

    /* access modifiers changed from: package-private */
    public final E2.a B() {
        w();
        k();
        return !a().r(K.f49715M0) ? E2.a.CLIENT_FLAG_OFF : this.f50188c == null ? E2.a.MISSING_JOB_SCHEDULER : !a().t() ? E2.a.NOT_ENABLED_IN_MANIFEST : !a().r(K.f49719O0) ? E2.a.SDK_TOO_OLD : !Q5.s0(zza(), "com.google.android.gms.measurement.AppMeasurementJobService") ? E2.a.MEASUREMENT_SERVICE_NOT_ENABLED : !s().m0() ? E2.a.NON_PLAY_MODE : E2.a.CLIENT_UPLOAD_ELIGIBLE;
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ C7555a l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C7565b2 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7579d2 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C7691t3 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ C7616i4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7644m4 r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ C7685s4 s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ C7575c5 t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return true;
    }

    /* access modifiers changed from: protected */
    @TargetApi(24)
    public final void z() {
        this.f50188c = (JobScheduler) zza().getSystemService("jobscheduler");
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
