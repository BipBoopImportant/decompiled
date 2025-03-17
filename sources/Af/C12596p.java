package AF;

import android.view.View;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;

/* renamed from: AF.p  reason: case insensitive filesystem */
public final /* synthetic */ class C12596p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryHomeContentAdapter.OnInteractionsListener f107714a;

    public /* synthetic */ C12596p(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
        this.f107714a = onInteractionsListener;
    }

    public final void onClick(View view) {
        C12597q.d(this.f107714a, view);
    }
}
