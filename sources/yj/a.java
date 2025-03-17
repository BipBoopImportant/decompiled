package Yj;

import com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay;
import java.util.List;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraPreviewOverlay f89293a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f89294b;

    public /* synthetic */ a(CameraPreviewOverlay cameraPreviewOverlay, List list) {
        this.f89293a = cameraPreviewOverlay;
        this.f89294b = list;
    }

    public final void run() {
        CameraPreviewOverlay.g(this.f89293a, this.f89294b);
    }
}
