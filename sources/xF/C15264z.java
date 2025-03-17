package xF;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.sugarcube.app.base.ui.gallery.GalleryHomeFragment;

/* renamed from: xF.z  reason: case insensitive filesystem */
public final /* synthetic */ class C15264z implements Toolbar.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryHomeFragment f132045a;

    public /* synthetic */ C15264z(GalleryHomeFragment galleryHomeFragment) {
        this.f132045a = galleryHomeFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return GalleryHomeFragment.l1(this.f132045a, menuItem);
    }
}
