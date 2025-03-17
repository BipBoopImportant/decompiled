package androidx.camera.view;

import C.C4399i0;
import G.p;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;

class r extends C4399i0 {

    /* renamed from: e  reason: collision with root package name */
    static final PointF f17218e = new PointF(2.0f, 2.0f);

    /* renamed from: b  reason: collision with root package name */
    private final m f17219b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f17220c = null;

    /* renamed from: d  reason: collision with root package name */
    private Matrix f17221d;

    r(m mVar) {
        this.f17219b = mVar;
    }

    /* access modifiers changed from: protected */
    public PointF a(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f17221d;
                if (matrix == null) {
                    PointF pointF = f17218e;
                    return pointF;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Size size, int i10) {
        p.a();
        synchronized (this) {
            try {
                if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                    Rect rect = this.f17220c;
                    if (rect != null) {
                        this.f17221d = this.f17219b.c(size, i10, rect);
                        return;
                    }
                }
                this.f17221d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(Rect rect) {
        c(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f17220c = rect;
        }
    }
}
