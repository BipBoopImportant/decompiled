package com.sugarcube.app.base.ui.hybrid;

import android.graphics.Bitmap;
import com.sugarcube.app.base.ui.hybrid.HybridARPanoFragment;

/* renamed from: com.sugarcube.app.base.ui.hybrid.j  reason: case insensitive filesystem */
public final /* synthetic */ class C14265j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HybridARPanoFragment f125042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f125043b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f125044c;

    public /* synthetic */ C14265j(HybridARPanoFragment hybridARPanoFragment, Bitmap bitmap, int i10) {
        this.f125042a = hybridARPanoFragment;
        this.f125043b = bitmap;
        this.f125044c = i10;
    }

    public final void run() {
        HybridARPanoFragment.d.j(this.f125042a, this.f125043b, this.f125044c);
    }
}
