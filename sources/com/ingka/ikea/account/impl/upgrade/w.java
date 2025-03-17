package com.ingka.ikea.account.impl.upgrade;

import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FullScreenProgressView f69916a;

    public /* synthetic */ w(FullScreenProgressView fullScreenProgressView) {
        this.f69916a = fullScreenProgressView;
    }

    public final void run() {
        UpgradeFragment.y1(this.f69916a);
    }
}
