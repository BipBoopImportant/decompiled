package com.ingka.ikea.checkout.impl;

import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;

public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FullScreenProgressView f94394a;

    public /* synthetic */ b0(FullScreenProgressView fullScreenProgressView) {
        this.f94394a = fullScreenProgressView;
    }

    public final void run() {
        OnlineCheckoutActivity.P2(this.f94394a);
    }
}
