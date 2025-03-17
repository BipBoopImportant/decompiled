package xF;

import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment;

public final class r {
    public static void a(GalleryHomeContentFragment galleryHomeContentFragment, DeviceCompatibility deviceCompatibility) {
        galleryHomeContentFragment.f124188T = deviceCompatibility;
    }

    public static void b(GalleryHomeContentFragment galleryHomeContentFragment, FirebaseInteractions firebaseInteractions) {
        galleryHomeContentFragment.f124189U = firebaseInteractions;
    }

    public static void c(GalleryHomeContentFragment galleryHomeContentFragment, UserRepo userRepo) {
        galleryHomeContentFragment.f124190X = userRepo;
    }
}
