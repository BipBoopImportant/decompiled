package com.sugarcube.app.base.ui.hybrid;

import android.media.ImageReader;

public final /* synthetic */ class L0 implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M0 f124863a;

    public /* synthetic */ L0(M0 m02) {
        this.f124863a = m02;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        M0.h(this.f124863a, imageReader);
    }
}
