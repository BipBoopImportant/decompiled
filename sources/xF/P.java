package xF;

import UE.C13733a;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.ui.gallery.GalleryHomeFragment;

public final class P {
    public static void a(GalleryHomeFragment galleryHomeFragment, AccountInteractions accountInteractions) {
        galleryHomeFragment.f124221y0 = accountInteractions;
    }

    public static void b(GalleryHomeFragment galleryHomeFragment, Analytics analytics) {
        galleryHomeFragment.f124220Z = analytics;
    }

    public static void c(GalleryHomeFragment galleryHomeFragment, ConfigRepository configRepository) {
        galleryHomeFragment.f124222z0 = configRepository;
    }

    public static void d(GalleryHomeFragment galleryHomeFragment, C13733a aVar) {
        galleryHomeFragment.f124208A0 = aVar;
    }

    public static void e(GalleryHomeFragment galleryHomeFragment, FirebaseInteractions firebaseInteractions) {
        galleryHomeFragment.f124209B0 = firebaseInteractions;
    }
}
