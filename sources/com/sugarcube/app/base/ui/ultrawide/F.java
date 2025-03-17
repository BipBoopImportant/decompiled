package com.sugarcube.app.base.ui.ultrawide;

import QE.S;
import android.view.View;

public final /* synthetic */ class F implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UltrawideCamPanoFragment f125203a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ S f125204b;

    public /* synthetic */ F(UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10) {
        this.f125203a = ultrawideCamPanoFragment;
        this.f125204b = s10;
    }

    public final void onClick(View view) {
        UltrawideCamPanoFragment.X0(this.f125203a, this.f125204b, view);
    }
}
