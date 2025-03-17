package com.sugarcube.app.base.ui.capturev2;

import QE.C13439p;
import androidx.fragment.app.C5191t;

/* renamed from: com.sugarcube.app.base.ui.capturev2.y  reason: case insensitive filesystem */
public final /* synthetic */ class C14243y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5191t f124085a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CamPanoFragment f124086b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C13439p f124087c;

    public /* synthetic */ C14243y(C5191t tVar, CamPanoFragment camPanoFragment, C13439p pVar) {
        this.f124085a = tVar;
        this.f124086b = camPanoFragment;
        this.f124087c = pVar;
    }

    public final void run() {
        CamPanoFragment.R0(this.f124085a, this.f124086b, this.f124087c);
    }
}
