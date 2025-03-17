package xF;

import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;

/* renamed from: xF.b0  reason: case insensitive filesystem */
public final /* synthetic */ class C15229b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryOverflowSheet f131987a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f131988b;

    public /* synthetic */ C15229b0(GalleryOverflowSheet galleryOverflowSheet, String str) {
        this.f131987a = galleryOverflowSheet;
        this.f131988b = str;
    }

    public final void run() {
        GalleryOverflowSheet.R1(this.f131987a, this.f131988b);
    }
}
