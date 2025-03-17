package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.l5  reason: case insensitive filesystem */
final class C7638l5 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C7575c5 f50227a;

    C7638l5(C7575c5 c5Var) {
        this.f50227a = c5Var;
    }

    private final void c(long j10, boolean z10) {
        this.f50227a.k();
        if (this.f50227a.f50228a.o()) {
            this.f50227a.e().f50373r.b(j10);
            this.f50227a.f().I().b("Session started, time", Long.valueOf(this.f50227a.zzb().c()));
            long j11 = j10 / 1000;
            long j12 = j10;
            this.f50227a.o().l0("auto", "_sid", Long.valueOf(j11), j12);
            this.f50227a.e().f50374s.b(j11);
            this.f50227a.e().f50369n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            this.f50227a.o().f0("auto", "_s", j12, bundle);
            String a10 = this.f50227a.e().f50379x.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                this.f50227a.o().f0("auto", "_ssr", j10, bundle2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f50227a.k();
        if (this.f50227a.e().w(this.f50227a.zzb().a())) {
            this.f50227a.e().f50369n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f50227a.f().I().a("Detected application was in foreground");
                c(this.f50227a.zzb().a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f50227a.k();
        this.f50227a.F();
        if (this.f50227a.e().w(j10)) {
            this.f50227a.e().f50369n.a(true);
            this.f50227a.m().I();
        }
        this.f50227a.e().f50373r.b(j10);
        if (this.f50227a.e().f50369n.b()) {
            c(j10, z10);
        }
    }
}
