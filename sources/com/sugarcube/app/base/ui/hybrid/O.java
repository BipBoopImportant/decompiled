package com.sugarcube.app.base.ui.hybrid;

import android.graphics.Bitmap;
import com.sugarcube.app.base.ui.hybrid.HybridCamPanoFragment;

public final /* synthetic */ class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HybridCamPanoFragment f124902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f124903b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f124904c;

    public /* synthetic */ O(HybridCamPanoFragment hybridCamPanoFragment, Bitmap bitmap, int i10) {
        this.f124902a = hybridCamPanoFragment;
        this.f124903b = bitmap;
        this.f124904c = i10;
    }

    public final void run() {
        HybridCamPanoFragment.c.g(this.f124902a, this.f124903b, this.f124904c);
    }
}
