package com.sugarcube.app.base.ui.hybrid;

import QE.I;
import ob.C10101e;

public final /* synthetic */ class N implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C10101e f124899a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HybridCamPanoFragment f124900b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I f124901c;

    public /* synthetic */ N(C10101e eVar, HybridCamPanoFragment hybridCamPanoFragment, I i10) {
        this.f124899a = eVar;
        this.f124900b = hybridCamPanoFragment;
        this.f124901c = i10;
    }

    public final void run() {
        HybridCamPanoFragment.b1(this.f124899a, this.f124900b, this.f124901c);
    }
}
