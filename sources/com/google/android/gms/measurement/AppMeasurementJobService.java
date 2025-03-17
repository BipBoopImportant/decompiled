package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Z4;
import sa.i0;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private Z4<AppMeasurementJobService> f49510a;

    private final Z4<AppMeasurementJobService> d() {
        if (this.f49510a == null) {
            this.f49510a = new Z4<>(this);
        }
        return this.f49510a;
    }

    public final void a(Intent intent) {
    }

    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final boolean c(int i10) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        d().c();
    }

    public final void onDestroy() {
        d().i();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        d().j(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return d().h(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return d().l(intent);
    }
}
