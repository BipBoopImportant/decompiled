package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.l;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f68647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f68648b;

    public /* synthetic */ k(l lVar, l lVar2) {
        this.f68647a = lVar;
        this.f68648b = lVar2;
    }

    public final void run() {
        this.f68647a.f(this.f68648b);
    }
}
