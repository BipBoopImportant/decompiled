package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.B0;
import com.google.android.gms.internal.measurement.C0;

/* renamed from: com.google.android.gms.measurement.internal.o5  reason: case insensitive filesystem */
public final class C7659o5 extends C7721x5 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f50259d = ((AlarmManager) zza().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private A f50260e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f50261f;

    protected C7659o5(C7728y5 y5Var) {
        super(y5Var);
    }

    private final A A() {
        if (this.f50260e == null) {
            this.f50260e = new C7679r5(this, this.f50303b.D0());
        }
        return this.f50260e;
    }

    @TargetApi(24)
    private final void B() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(y());
        }
    }

    private final int y() {
        if (this.f50261f == null) {
            String packageName = zza().getPackageName();
            this.f50261f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f50261f.intValue();
    }

    private final PendingIntent z() {
        Context zza = zza();
        return C0.a(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C0.f48565a);
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

    public final /* bridge */ /* synthetic */ N5 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Y5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7660p n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C2 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Y4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7714w5 r() {
        return super.r();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        AlarmManager alarmManager = this.f50259d;
        if (alarmManager != null) {
            alarmManager.cancel(z());
        }
        B();
        return false;
    }

    public final void w(long j10) {
        s();
        Context zza = zza();
        if (!Q5.b0(zza)) {
            f().D().a("Receiver not registered/enabled");
        }
        if (!Q5.c0(zza, false)) {
            f().D().a("Service not registered/enabled");
        }
        x();
        f().I().b("Scheduling upload, millis", Long.valueOf(j10));
        zzb().c();
        if (j10 < Math.max(0, K.f49704H.a(null).longValue()) && !A().e()) {
            A().b(j10);
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int y10 = y();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        B0.c(zza2, new JobInfo.Builder(y10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void x() {
        s();
        f().I().a("Unscheduling upload");
        AlarmManager alarmManager = this.f50259d;
        if (alarmManager != null) {
            alarmManager.cancel(z());
        }
        A().a();
        B();
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
