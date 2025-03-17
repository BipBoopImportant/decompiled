package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f68220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f68221b;

    public /* synthetic */ n(Callable callable, p.b bVar) {
        this.f68220a = callable;
        this.f68221b = bVar;
    }

    public final void run() {
        o.q(this.f68220a, this.f68221b);
    }
}
