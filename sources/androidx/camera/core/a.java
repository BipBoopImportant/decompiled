package androidx.camera.core;

import C.C4385b0;
import C.W;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.g1;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

final class a implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Image f16652a;

    /* renamed from: b  reason: collision with root package name */
    private final C0231a[] f16653b;

    /* renamed from: c  reason: collision with root package name */
    private final W f16654c;

    /* renamed from: androidx.camera.core.a$a  reason: collision with other inner class name */
    private static final class C0231a implements n.a {

        /* renamed from: a  reason: collision with root package name */
        private final Image.Plane f16655a;

        C0231a(Image.Plane plane) {
            this.f16655a = plane;
        }

        public int a() {
            return this.f16655a.getRowStride();
        }

        public int b() {
            return this.f16655a.getPixelStride();
        }

        public ByteBuffer p() {
            return this.f16655a.getBuffer();
        }
    }

    a(Image image) {
        this.f16652a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f16653b = new C0231a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f16653b[i10] = new C0231a(planes[i10]);
            }
        } else {
            this.f16653b = new C0231a[0];
        }
        this.f16654c = C4385b0.f(g1.b(), image.getTimestamp(), 0, new Matrix());
    }

    public n.a[] A1() {
        return this.f16653b;
    }

    public W F2() {
        return this.f16654c;
    }

    public void close() {
        this.f16652a.close();
    }

    public Rect getCropRect() {
        return this.f16652a.getCropRect();
    }

    public int getFormat() {
        return this.f16652a.getFormat();
    }

    public int getHeight() {
        return this.f16652a.getHeight();
    }

    public int getWidth() {
        return this.f16652a.getWidth();
    }

    public Image k() {
        return this.f16652a;
    }

    public void setCropRect(Rect rect) {
        this.f16652a.setCropRect(rect);
    }
}
