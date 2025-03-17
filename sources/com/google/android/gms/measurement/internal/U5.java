package com.google.android.gms.measurement.internal;

import java.util.Objects;

public final /* synthetic */ class U5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ P2 f49971a;

    public /* synthetic */ U5(P2 p22) {
        this.f49971a = p22;
    }

    public final void run() {
        P2 p22 = this.f49971a;
        if (!p22.M().S0()) {
            p22.f().J().a("registerTrigger called but app not eligible");
            return;
        }
        p22.G().F0();
        C7691t3 G10 = p22.G();
        Objects.requireNonNull(G10);
        new Thread(new V5(G10)).start();
    }
}
