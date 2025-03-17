package PE;

import KF.C13147a;
import KF.C13164r;
import LF.C13187c;
import OE.C13309a;
import OE.C13313e;
import OE.q;
import VE.C13760b;
import YE.C13867a;
import com.sugarcube.app.base.capture.UploadWorker;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.network.NetworkClient;

/* renamed from: PE.e  reason: case insensitive filesystem */
public final class C13343e {
    public static void a(UploadWorker uploadWorker, AnalyticsManager analyticsManager) {
        uploadWorker.f122786g = analyticsManager;
    }

    public static void b(UploadWorker uploadWorker, C13309a aVar) {
        uploadWorker.f122788i = aVar;
    }

    public static void c(UploadWorker uploadWorker, C13147a aVar) {
        uploadWorker.f122793n = aVar;
    }

    public static void d(UploadWorker uploadWorker, ConfigRepository configRepository) {
        uploadWorker.f122790k = configRepository;
    }

    public static void e(UploadWorker uploadWorker, C13867a aVar) {
        uploadWorker.f122789j = aVar;
    }

    public static void f(UploadWorker uploadWorker, FirebaseInteractions firebaseInteractions) {
        uploadWorker.f122783d = firebaseInteractions;
    }

    public static void g(UploadWorker uploadWorker, C13313e eVar) {
        uploadWorker.f122787h = eVar;
    }

    public static void h(UploadWorker uploadWorker, NetworkClient networkClient) {
        uploadWorker.f122785f = networkClient;
    }

    public static void i(UploadWorker uploadWorker, C13760b bVar) {
        uploadWorker.f122791l = bVar;
    }

    public static void j(UploadWorker uploadWorker, SceneRepository sceneRepository) {
        uploadWorker.f122784e = sceneRepository;
    }

    public static void k(UploadWorker uploadWorker, q qVar) {
        uploadWorker.f122782c = qVar;
    }

    public static void l(UploadWorker uploadWorker, C13187c cVar) {
        uploadWorker.f122794o = cVar;
    }

    public static void m(UploadWorker uploadWorker, C13164r rVar) {
        uploadWorker.f122792m = rVar;
    }
}
