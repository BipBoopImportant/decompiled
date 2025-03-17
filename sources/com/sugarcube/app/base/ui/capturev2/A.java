package com.sugarcube.app.base.ui.capturev2;

import QE.C13439p;
import android.view.View;

public final /* synthetic */ class A implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CamPanoFragment f123297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C13439p f123298b;

    public /* synthetic */ A(CamPanoFragment camPanoFragment, C13439p pVar) {
        this.f123297a = camPanoFragment;
        this.f123298b = pVar;
    }

    public final void onClick(View view) {
        CamPanoFragment.U0(this.f123297a, this.f123298b, view);
    }
}
