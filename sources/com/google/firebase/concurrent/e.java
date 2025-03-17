package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f68190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f68191b;

    public /* synthetic */ e(Runnable runnable, p.b bVar) {
        this.f68190a = runnable;
        this.f68191b = bVar;
    }

    public final void run() {
        o.z(this.f68190a, this.f68191b);
    }
}
