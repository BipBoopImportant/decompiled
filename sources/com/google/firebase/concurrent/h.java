package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class h implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f68203b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f68204c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f68205d;

    public /* synthetic */ h(o oVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f68202a = oVar;
        this.f68203b = callable;
        this.f68204c = j10;
        this.f68205d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f68202a.s(this.f68203b, this.f68204c, this.f68205d, bVar);
    }
}
