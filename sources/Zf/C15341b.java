package zF;

import DF.C12787d;
import android.view.View;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;

/* renamed from: zF.b  reason: case insensitive filesystem */
public final /* synthetic */ class C15341b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryHomeContentAdapter f132556a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f132557b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C12787d f132558c;

    public /* synthetic */ C15341b(GalleryHomeContentAdapter galleryHomeContentAdapter, int i10, C12787d dVar) {
        this.f132556a = galleryHomeContentAdapter;
        this.f132557b = i10;
        this.f132558c = dVar;
    }

    public final void onClick(View view) {
        GalleryHomeContentAdapter.e(this.f132556a, this.f132557b, this.f132558c, view);
    }
}
