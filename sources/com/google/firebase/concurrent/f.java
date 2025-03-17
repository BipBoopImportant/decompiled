package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class f implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68193b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f68194c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f68195d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f68196e;

    public /* synthetic */ f(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f68192a = oVar;
        this.f68193b = runnable;
        this.f68194c = j10;
        this.f68195d = j11;
        this.f68196e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f68192a.w(this.f68193b, this.f68194c, this.f68195d, this.f68196e, bVar);
    }
}
