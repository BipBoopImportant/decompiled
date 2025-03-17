package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f68188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f68189b;

    public /* synthetic */ d(Runnable runnable, p.b bVar) {
        this.f68188a = runnable;
        this.f68189b = bVar;
    }

    public final void run() {
        o.t(this.f68188a, this.f68189b);
    }
}
