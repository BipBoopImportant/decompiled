package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f68218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f68219b;

    public /* synthetic */ m(Runnable runnable, p.b bVar) {
        this.f68218a = runnable;
        this.f68219b = bVar;
    }

    public final void run() {
        o.m(this.f68218a, this.f68219b);
    }
}
