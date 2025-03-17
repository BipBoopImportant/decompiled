package com.sugarcube.app.base.ui.hybrid;

import QE.I;
import androidx.fragment.app.C5191t;

public final /* synthetic */ class J implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5191t f124852a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HybridCamPanoFragment f124853b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I f124854c;

    public /* synthetic */ J(C5191t tVar, HybridCamPanoFragment hybridCamPanoFragment, I i10) {
        this.f124852a = tVar;
        this.f124853b = hybridCamPanoFragment;
        this.f124854c = i10;
    }

    public final void run() {
        HybridCamPanoFragment.a1(this.f124852a, this.f124853b, this.f124854c);
    }
}
