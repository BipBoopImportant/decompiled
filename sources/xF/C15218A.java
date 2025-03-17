package xF;

import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;
import com.sugarcube.app.base.ui.gallery.GalleryHomeFragment;

/* renamed from: xF.A  reason: case insensitive filesystem */
public final /* synthetic */ class C15218A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryHomeFragment f131918a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FeedbackBottomSheet.b f131919b;

    public /* synthetic */ C15218A(GalleryHomeFragment galleryHomeFragment, FeedbackBottomSheet.b bVar) {
        this.f131918a = galleryHomeFragment;
        this.f131919b = bVar;
    }

    public final void run() {
        GalleryHomeFragment.Z1(this.f131918a, this.f131919b);
    }
}
