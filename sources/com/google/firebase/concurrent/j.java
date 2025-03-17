package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68210b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f68211c;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.f68209a = oVar;
        this.f68210b = runnable;
        this.f68211c = bVar;
    }

    public final void run() {
        this.f68209a.o(this.f68210b, this.f68211c);
    }
}
