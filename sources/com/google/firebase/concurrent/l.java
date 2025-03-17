package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68216b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f68217c;

    public /* synthetic */ l(o oVar, Runnable runnable, p.b bVar) {
        this.f68215a = oVar;
        this.f68216b = runnable;
        this.f68217c = bVar;
    }

    public final void run() {
        this.f68215a.x(this.f68216b, this.f68217c);
    }
}
