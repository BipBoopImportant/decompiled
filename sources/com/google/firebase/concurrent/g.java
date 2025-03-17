package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68198b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f68199c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f68200d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f68201e;

    public /* synthetic */ g(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f68197a = oVar;
        this.f68198b = runnable;
        this.f68199c = j10;
        this.f68200d = j11;
        this.f68201e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f68197a.y(this.f68198b, this.f68199c, this.f68200d, this.f68201e, bVar);
    }
}
