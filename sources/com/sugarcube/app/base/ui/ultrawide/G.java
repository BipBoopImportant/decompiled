package com.sugarcube.app.base.ui.ultrawide;

import QE.S;
import ob.C10101e;

public final /* synthetic */ class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C10101e f125206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UltrawideCamPanoFragment f125207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ S f125208c;

    public /* synthetic */ G(C10101e eVar, UltrawideCamPanoFragment ultrawideCamPanoFragment, S s10) {
        this.f125206a = eVar;
        this.f125207b = ultrawideCamPanoFragment;
        this.f125208c = s10;
    }

    public final void run() {
        UltrawideCamPanoFragment.V0(this.f125206a, this.f125207b, this.f125208c);
    }
}
