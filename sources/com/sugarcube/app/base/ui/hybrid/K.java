package com.sugarcube.app.base.ui.hybrid;

import QE.I;
import android.view.View;

public final /* synthetic */ class K implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HybridCamPanoFragment f124856a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I f124857b;

    public /* synthetic */ K(HybridCamPanoFragment hybridCamPanoFragment, I i10) {
        this.f124856a = hybridCamPanoFragment;
        this.f124857b = i10;
    }

    public final void onClick(View view) {
        HybridCamPanoFragment.c1(this.f124856a, this.f124857b, view);
    }
}
