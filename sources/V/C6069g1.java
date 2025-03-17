package v;

import C.C4402k;
import H2.i;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.X;
import androidx.concurrent.futures.c;
import u.C5965a;
import v.o2;
import w.B;

/* renamed from: v.g1  reason: case insensitive filesystem */
final class C6069g1 implements o2.b {

    /* renamed from: a  reason: collision with root package name */
    private final B f30563a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f30564b = null;

    /* renamed from: c  reason: collision with root package name */
    private c.a<Void> f30565c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f30566d = null;

    C6069g1(B b10) {
        this.f30563a = b10;
    }

    private static Rect f(Rect rect, float f10) {
        float width = ((float) rect.width()) / f10;
        float height = ((float) rect.height()) / f10;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    private Rect g() {
        return (Rect) i.g((Rect) this.f30563a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f30565c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f30566d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f30565c.c(null);
                this.f30565c = null;
                this.f30566d = null;
            }
        }
    }

    public void b(float f10, c.a<Void> aVar) {
        this.f30564b = f(g(), f10);
        c.a<Void> aVar2 = this.f30565c;
        if (aVar2 != null) {
            aVar2.f(new C4402k.a("There is a new zoomRatio being set"));
        }
        this.f30566d = this.f30564b;
        this.f30565c = aVar;
    }

    public void c() {
        this.f30566d = null;
        this.f30564b = null;
        c.a<Void> aVar = this.f30565c;
        if (aVar != null) {
            aVar.f(new C4402k.a("Camera is not active."));
            this.f30565c = null;
        }
    }

    public void d(C5965a.C0464a aVar) {
        Rect rect = this.f30564b;
        if (rect != null) {
            aVar.g(CaptureRequest.SCALER_CROP_REGION, rect, X.c.REQUIRED);
        }
    }

    public Rect e() {
        Rect rect = this.f30564b;
        return rect != null ? rect : g();
    }

    public float getMaxZoom() {
        Float f10 = (Float) this.f30563a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < getMinZoom() ? getMinZoom() : f10.floatValue();
    }

    public float getMinZoom() {
        return 1.0f;
    }
}
