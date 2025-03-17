package androidx.camera.view;

import C.C4391e0;
import C.G0;
import H2.i;
import I.n;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.q;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import ob.C10101e;
import u2.C6012a;

final class z extends q {

    /* renamed from: e  reason: collision with root package name */
    SurfaceView f17239e;

    /* renamed from: f  reason: collision with root package name */
    final b f17240f = new b();

    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class b implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Size f17241a;

        /* renamed from: b  reason: collision with root package name */
        private G0 f17242b;

        /* renamed from: c  reason: collision with root package name */
        private G0 f17243c;

        /* renamed from: d  reason: collision with root package name */
        private q.a f17244d;

        /* renamed from: e  reason: collision with root package name */
        private Size f17245e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f17246f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f17247g = false;

        b() {
        }

        private boolean b() {
            return !this.f17246f && this.f17242b != null && Objects.equals(this.f17241a, this.f17245e);
        }

        private void c() {
            if (this.f17242b != null) {
                C4391e0.a("SurfaceViewImpl", "Request canceled: " + this.f17242b);
                this.f17242b.G();
            }
        }

        private void d() {
            if (this.f17242b != null) {
                C4391e0.a("SurfaceViewImpl", "Surface closed " + this.f17242b);
                this.f17242b.m().d();
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(q.a aVar, G0.g gVar) {
            C4391e0.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean g() {
            Surface surface = z.this.f17239e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            C4391e0.a("SurfaceViewImpl", "Surface set on Preview.");
            q.a aVar = this.f17244d;
            G0 g02 = this.f17242b;
            Objects.requireNonNull(g02);
            g02.D(surface, C6012a.h(z.this.f17239e.getContext()), new A(aVar));
            this.f17246f = true;
            z.this.f();
            return true;
        }

        /* access modifiers changed from: package-private */
        public void f(G0 g02, q.a aVar) {
            c();
            if (this.f17247g) {
                this.f17247g = false;
                g02.r();
                return;
            }
            this.f17242b = g02;
            this.f17244d = aVar;
            Size p10 = g02.p();
            this.f17241a = p10;
            this.f17246f = false;
            if (!g()) {
                C4391e0.a("SurfaceViewImpl", "Wait for new Surface creation.");
                z.this.f17239e.getHolder().setFixedSize(p10.getWidth(), p10.getHeight());
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C4391e0.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f17245e = new Size(i11, i12);
            g();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            G0 g02;
            C4391e0.a("SurfaceViewImpl", "Surface created.");
            if (this.f17247g && (g02 = this.f17243c) != null) {
                g02.r();
                this.f17243c = null;
                this.f17247g = false;
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C4391e0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f17246f) {
                d();
            } else {
                c();
            }
            this.f17247g = true;
            G0 g02 = this.f17242b;
            if (g02 != null) {
                this.f17243c = g02;
            }
            this.f17246f = false;
            this.f17242b = null;
            this.f17244d = null;
            this.f17245e = null;
            this.f17241a = null;
        }
    }

    z(FrameLayout frameLayout, m mVar) {
        super(frameLayout, mVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void m(Semaphore semaphore, int i10) {
        if (i10 == 0) {
            C4391e0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            C4391e0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
        }
        semaphore.release();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(G0 g02, q.a aVar) {
        this.f17240f.f(g02, aVar);
    }

    private static boolean o(SurfaceView surfaceView, Size size, G0 g02) {
        return surfaceView != null && Objects.equals(size, g02.p());
    }

    /* access modifiers changed from: package-private */
    public View b() {
        return this.f17239e;
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        SurfaceView surfaceView = this.f17239e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f17239e.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.f17239e.getWidth(), this.f17239e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f17239e, createBitmap, new y(semaphore), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100, TimeUnit.MILLISECONDS)) {
                C4391e0.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
        } catch (InterruptedException e10) {
            C4391e0.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
        } catch (Throwable th2) {
            handlerThread.quitSafely();
            throw th2;
        }
        handlerThread.quitSafely();
        return createBitmap;
    }

    /* access modifiers changed from: package-private */
    public void d() {
    }

    /* access modifiers changed from: package-private */
    public void e() {
    }

    /* access modifiers changed from: package-private */
    public void g(G0 g02, q.a aVar) {
        if (!o(this.f17239e, this.f17214a, g02)) {
            this.f17214a = g02.p();
            l();
        }
        if (aVar != null) {
            g02.j(C6012a.h(this.f17239e.getContext()), new w(aVar));
        }
        this.f17239e.post(new x(this, g02, aVar));
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> i() {
        return n.p(null);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        i.g(this.f17215b);
        i.g(this.f17214a);
        SurfaceView surfaceView = new SurfaceView(this.f17215b.getContext());
        this.f17239e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f17214a.getWidth(), this.f17214a.getHeight()));
        this.f17215b.removeAllViews();
        this.f17215b.addView(this.f17239e);
        this.f17239e.getHolder().addCallback(this.f17240f);
    }
}
