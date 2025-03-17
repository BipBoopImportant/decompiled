package com.sugarcube.app.base.ui.capturev2;

import android.media.ImageReader;

/* renamed from: com.sugarcube.app.base.ui.capturev2.k  reason: case insensitive filesystem */
public final /* synthetic */ class C14216k implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14218l f123905a;

    public /* synthetic */ C14216k(C14218l lVar) {
        this.f123905a = lVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        C14218l.j(this.f123905a, imageReader);
    }
}
