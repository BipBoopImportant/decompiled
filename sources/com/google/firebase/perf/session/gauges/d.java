package com.google.firebase.perf.session.gauges;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f68634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f68635b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Gc.d f68636c;

    public /* synthetic */ d(GaugeManager gaugeManager, String str, Gc.d dVar) {
        this.f68634a = gaugeManager;
        this.f68635b = str;
        this.f68636c = dVar;
    }

    public final void run() {
        this.f68634a.lambda$stopCollectingGauges$3(this.f68635b, this.f68636c);
    }
}
