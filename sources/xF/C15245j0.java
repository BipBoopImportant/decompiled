package xF;

import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.a;
import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;

/* renamed from: xF.j0  reason: case insensitive filesystem */
public final /* synthetic */ class C15245j0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f132007a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NestedScrollView f132008b;

    public /* synthetic */ C15245j0(a aVar, NestedScrollView nestedScrollView) {
        this.f132007a = aVar;
        this.f132008b = nestedScrollView;
    }

    public final void run() {
        GalleryOverflowSheet.B1(this.f132007a, this.f132008b);
    }
}
