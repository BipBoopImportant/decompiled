package com.google.ar.core;

import android.media.ImageReader;

/* renamed from: com.google.ar.core.y  reason: case insensitive filesystem */
final /* synthetic */ class C9517y implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ C9517y f67842a = new C9517y();

    private /* synthetic */ C9517y() {
    }

    public final /* synthetic */ void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0(imageReader);
    }
}
