package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.l;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f68645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f68646b;

    public /* synthetic */ j(l lVar, l lVar2) {
        this.f68645a = lVar;
        this.f68646b = lVar2;
    }

    public final void run() {
        this.f68645a.g(this.f68646b);
    }
}
