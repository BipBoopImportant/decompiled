package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: w.h  reason: case insensitive filesystem */
public final class C6173h {

    /* renamed from: a  reason: collision with root package name */
    private final a f31070a;

    /* renamed from: w.h$a */
    interface a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* renamed from: w.h$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f31071a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f31072b;

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f31072b = executor;
            this.f31071a = captureCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            C6168c.a(this.f31071a, cameraCaptureSession, captureRequest, surface, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f31071a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f31071a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f31071a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f31071a.onCaptureSequenceAborted(cameraCaptureSession, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f31071a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f31071a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            this.f31072b.execute(new C6179n(this, cameraCaptureSession, captureRequest, surface, j10));
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f31072b.execute(new C6175j(this, cameraCaptureSession, captureRequest, totalCaptureResult));
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f31072b.execute(new C6178m(this, cameraCaptureSession, captureRequest, captureFailure));
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f31072b.execute(new C6176k(this, cameraCaptureSession, captureRequest, captureResult));
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f31072b.execute(new C6180o(this, cameraCaptureSession, i10));
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f31072b.execute(new C6177l(this, cameraCaptureSession, i10, j10));
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f31072b.execute(new C6174i(this, cameraCaptureSession, captureRequest, j10, j11));
        }
    }

    /* renamed from: w.h$c */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final CameraCaptureSession.StateCallback f31073a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f31074b;

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f31074b = executor;
            this.f31073a = stateCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession) {
            this.f31073a.onActive(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession) {
            C6169d.a(this.f31073a, cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession) {
            this.f31073a.onClosed(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession) {
            this.f31073a.onConfigureFailed(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession) {
            this.f31073a.onConfigured(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession) {
            this.f31073a.onReady(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C6167b.a(this.f31073a, cameraCaptureSession, surface);
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f31074b.execute(new C6181p(this, cameraCaptureSession));
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f31074b.execute(new C6183s(this, cameraCaptureSession));
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f31074b.execute(new C6182q(this, cameraCaptureSession));
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f31074b.execute(new C6186v(this, cameraCaptureSession));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f31074b.execute(new C6184t(this, cameraCaptureSession));
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f31074b.execute(new C6185u(this, cameraCaptureSession));
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f31074b.execute(new r(this, cameraCaptureSession, surface));
        }
    }

    private C6173h(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31070a = new C6187w(cameraCaptureSession);
        } else {
            this.f31070a = x.d(cameraCaptureSession, handler);
        }
    }

    public static C6173h d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C6173h(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f31070a.b(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f31070a.c(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f31070a.a();
    }
}
