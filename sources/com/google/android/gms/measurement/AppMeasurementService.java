package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.Z4;
import i3.a;
import sa.i0;

public final class AppMeasurementService extends Service implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private Z4<AppMeasurementService> f49512a;

    private final Z4<AppMeasurementService> d() {
        if (this.f49512a == null) {
            this.f49512a = new Z4<>(this);
        }
        return this.f49512a;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final boolean c(int i10) {
        return stopSelfResult(i10);
    }

    public final IBinder onBind(Intent intent) {
        return d().b(intent);
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

    public final int onStartCommand(Intent intent, int i10, int i11) {
        return d().a(intent, i10, i11);
    }

    public final boolean onUnbind(Intent intent) {
        return d().l(intent);
    }
}
