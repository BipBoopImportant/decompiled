package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w.C6168c;

class L0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f30259a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    a f30260b = null;

    interface a {
        void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z10);
    }

    L0() {
    }

    private List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f30259a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List list2 = this.f30259a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f30259a.put(captureRequest, arrayList);
            return;
        }
        this.f30259a.put(captureRequest, list);
    }

    public void c(a aVar) {
        this.f30260b = aVar;
    }

    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        for (CameraCaptureSession.CaptureCallback a10 : b(captureRequest)) {
            C6168c.a(a10, cameraCaptureSession, captureRequest, surface, j10);
        }
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureCompleted : b(captureRequest)) {
            onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback onCaptureFailed : b(captureRequest)) {
            onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureProgressed : b(captureRequest)) {
            onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f30259a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : it) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }
        a aVar = this.f30260b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i10, true);
        }
    }

    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f30259a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : it) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }
        a aVar = this.f30260b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i10, false);
        }
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        for (CameraCaptureSession.CaptureCallback onCaptureStarted : b(captureRequest)) {
            onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }
    }
}
