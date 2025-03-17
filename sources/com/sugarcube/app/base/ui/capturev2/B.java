package com.sugarcube.app.base.ui.capturev2;

import QE.C13439p;
import ob.C10101e;

public final /* synthetic */ class B implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C10101e f123358a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CamPanoFragment f123359b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C13439p f123360c;

    public /* synthetic */ B(C10101e eVar, CamPanoFragment camPanoFragment, C13439p pVar) {
        this.f123358a = eVar;
        this.f123359b = camPanoFragment;
        this.f123360c = pVar;
    }

    public final void run() {
        CamPanoFragment.S0(this.f123358a, this.f123359b, this.f123360c);
    }
}
