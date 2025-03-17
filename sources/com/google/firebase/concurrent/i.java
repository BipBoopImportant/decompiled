package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f68208c;

    public /* synthetic */ i(o oVar, Runnable runnable, p.b bVar) {
        this.f68206a = oVar;
        this.f68207b = runnable;
        this.f68208c = bVar;
    }

    public final void run() {
        this.f68206a.u(this.f68207b, this.f68208c);
    }
}
