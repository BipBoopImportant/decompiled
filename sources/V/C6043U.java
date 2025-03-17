package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w.C6168c;

/* renamed from: v.U  reason: case insensitive filesystem */
public final class C6043U {

    /* renamed from: v.U$a */
    private static final class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        private final List<CameraCaptureSession.CaptureCallback> f30398a = new ArrayList();

        a(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback next : list) {
                if (!(next instanceof b)) {
                    this.f30398a.add(next);
                }
            }
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            for (CameraCaptureSession.CaptureCallback a10 : this.f30398a) {
                C6168c.a(a10, cameraCaptureSession, captureRequest, surface, j10);
            }
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            for (CameraCaptureSession.CaptureCallback onCaptureCompleted : this.f30398a) {
                onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            for (CameraCaptureSession.CaptureCallback onCaptureFailed : this.f30398a) {
                onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            for (CameraCaptureSession.CaptureCallback onCaptureProgressed : this.f30398a) {
                onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : this.f30398a) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : this.f30398a) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            for (CameraCaptureSession.CaptureCallback onCaptureStarted : this.f30398a) {
                onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
            }
        }
    }

    /* renamed from: v.U$b */
    static final class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        }
    }

    static CameraCaptureSession.CaptureCallback a(List<CameraCaptureSession.CaptureCallback> list) {
        return new a(list);
    }

    public static CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return a(Arrays.asList(captureCallbackArr));
    }

    public static CameraCaptureSession.CaptureCallback c() {
        return new b();
    }
}
