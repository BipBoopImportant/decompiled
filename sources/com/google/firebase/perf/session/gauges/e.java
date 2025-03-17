package com.google.firebase.perf.session.gauges;

import Gc.d;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f68637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f68638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f68639c;

    public /* synthetic */ e(GaugeManager gaugeManager, String str, d dVar) {
        this.f68637a = gaugeManager;
        this.f68638b = str;
        this.f68639c = dVar;
    }

    public final void run() {
        this.f68637a.lambda$startCollectingGauges$2(this.f68638b, this.f68639c);
    }
}
