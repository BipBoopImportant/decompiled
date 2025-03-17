package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68184a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68185b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f68186c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f68187d;

    public /* synthetic */ c(o oVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f68184a = oVar;
        this.f68185b = runnable;
        this.f68186c = j10;
        this.f68187d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f68184a.p(this.f68185b, this.f68186c, this.f68187d, bVar);
    }
}
