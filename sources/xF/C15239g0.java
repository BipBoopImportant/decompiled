package xF;

import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.a;
import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;

/* renamed from: xF.g0  reason: case insensitive filesystem */
public final /* synthetic */ class C15239g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f131997a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NestedScrollView f131998b;

    public /* synthetic */ C15239g0(a aVar, NestedScrollView nestedScrollView) {
        this.f131997a = aVar;
        this.f131998b = nestedScrollView;
    }

    public final void run() {
        GalleryOverflowSheet.I1(this.f131997a, this.f131998b);
    }
}
