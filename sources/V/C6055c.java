package v;

import C.C4402k;
import H2.i;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.impl.X;
import androidx.concurrent.futures.c;
import u.C5965a;
import v.o2;
import w.B;
import x.C6222b;

/* renamed from: v.c  reason: case insensitive filesystem */
final class C6055c implements o2.b {

    /* renamed from: a  reason: collision with root package name */
    private final B f30515a;

    /* renamed from: b  reason: collision with root package name */
    private final Range<Float> f30516b;

    /* renamed from: c  reason: collision with root package name */
    private float f30517c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private c.a<Void> f30518d;

    /* renamed from: e  reason: collision with root package name */
    private float f30519e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30520f = false;

    C6055c(B b10) {
        this.f30515a = b10;
        this.f30516b = (Range) b10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f30520f = b10.d();
    }

    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f30518d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 != null) {
                if (this.f30519e == f10.floatValue()) {
                    this.f30518d.c(null);
                    this.f30518d = null;
                }
            }
        }
    }

    public void b(float f10, c.a<Void> aVar) {
        this.f30517c = f10;
        c.a<Void> aVar2 = this.f30518d;
        if (aVar2 != null) {
            aVar2.f(new C4402k.a("There is a new zoomRatio being set"));
        }
        this.f30519e = this.f30517c;
        this.f30518d = aVar;
    }

    public void c() {
        this.f30517c = 1.0f;
        c.a<Void> aVar = this.f30518d;
        if (aVar != null) {
            aVar.f(new C4402k.a("Camera is not active."));
            this.f30518d = null;
        }
    }

    public void d(C5965a.C0464a aVar) {
        CaptureRequest.Key a10 = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.f30517c);
        X.c cVar = X.c.REQUIRED;
        aVar.g(a10, valueOf, cVar);
        if (this.f30520f) {
            C6222b.a(aVar, cVar);
        }
    }

    public Rect e() {
        return (Rect) i.g((Rect) this.f30515a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public float getMaxZoom() {
        return this.f30516b.getUpper().floatValue();
    }

    public float getMinZoom() {
        return this.f30516b.getLower().floatValue();
    }
}
