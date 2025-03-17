package com.sugarcube.app.base.ui.ultrawide;

import QE.S;
import androidx.fragment.app.C5191t;

public final /* synthetic */ class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5191t f125196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UltrawideCamPanoFragment f125197b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ S f125198c;

    public /* synthetic */ D(C5191t tVar, UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10) {
        this.f125196a = tVar;
        this.f125197b = ultrawideCamPanoFragment;
        this.f125198c = s10;
    }

    public final void run() {
        UltrawideCamPanoFragment.U0(this.f125196a, this.f125197b, this.f125198c);
    }
}
