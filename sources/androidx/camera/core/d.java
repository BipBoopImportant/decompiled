package androidx.camera.core;

import G.l;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.C5048t0;
import java.util.concurrent.Executor;

class d implements C5048t0 {

    /* renamed from: a  reason: collision with root package name */
    private final ImageReader f16661a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16662b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f16663c = true;

    d(ImageReader imageReader) {
        this.f16661a = imageReader;
    }

    private boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(C5048t0.a aVar) {
        aVar.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(Executor executor, C5048t0.a aVar, ImageReader imageReader) {
        synchronized (this.f16662b) {
            try {
                if (!this.f16663c) {
                    executor.execute(new c(this, aVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n b() {
        Image image;
        synchronized (this.f16662b) {
            try {
                image = this.f16661a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (i(e10)) {
                    image = null;
                } else {
                    throw e10;
                }
            }
            if (image == null) {
                return null;
            }
            a aVar = new a(image);
            return aVar;
        }
    }

    public int c() {
        int imageFormat;
        synchronized (this.f16662b) {
            imageFormat = this.f16661a.getImageFormat();
        }
        return imageFormat;
    }

    public void close() {
        synchronized (this.f16662b) {
            this.f16661a.close();
        }
    }

    public void d() {
        synchronized (this.f16662b) {
            this.f16663c = true;
            this.f16661a.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public int e() {
        int maxImages;
        synchronized (this.f16662b) {
            maxImages = this.f16661a.getMaxImages();
        }
        return maxImages;
    }

    public void f(C5048t0.a aVar, Executor executor) {
        synchronized (this.f16662b) {
            this.f16663c = false;
            this.f16661a.setOnImageAvailableListener(new b(this, executor, aVar), l.a());
        }
    }

    public n g() {
        Image image;
        synchronized (this.f16662b) {
            try {
                image = this.f16661a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (i(e10)) {
                    image = null;
                } else {
                    throw e10;
                }
            }
            if (image == null) {
                return null;
            }
            a aVar = new a(image);
            return aVar;
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.f16662b) {
            height = this.f16661a.getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.f16662b) {
            surface = this.f16661a.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.f16662b) {
            width = this.f16661a.getWidth();
        }
        return width;
    }
}
