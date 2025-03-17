package z;

import I.n;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import ob.C10101e;
import v.C6043U;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32335a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C10101e<Void>> f32336b = Collections.synchronizedList(new ArrayList());

    static class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        final C10101e<Void> f32337a = c.a(new r(this));

        /* renamed from: b  reason: collision with root package name */
        c.a<Void> f32338b;

        a() {
        }

        private void b() {
            c.a<Void> aVar = this.f32338b;
            if (aVar != null) {
                aVar.c(null);
                this.f32338b = null;
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object c(c.a aVar) {
            this.f32338b = aVar;
            return "RequestCompleteListener[" + this + "]";
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b();
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            b();
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b();
        }
    }

    public s(boolean z10) {
        this.f32335a = z10;
    }

    private CameraCaptureSession.CaptureCallback c() {
        a aVar = new a();
        C10101e<Void> eVar = aVar.f32337a;
        this.f32336b.add(eVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        eVar.a(new p(this, aVar, eVar), H.a.a());
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(a aVar, C10101e eVar) {
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + this);
        this.f32336b.remove(eVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void g(List list) {
        return null;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return h() ? C6043U.b(c(), captureCallback) : captureCallback;
    }

    public C10101e<Void> e() {
        return this.f32336b.isEmpty() ? n.p(null) : n.B(n.G(n.F(new ArrayList(this.f32336b)), new q(), H.a.a()));
    }

    public boolean h() {
        return this.f32335a;
    }

    public void i() {
        LinkedList linkedList = new LinkedList(this.f32336b);
        while (!linkedList.isEmpty()) {
            C10101e eVar = (C10101e) linkedList.poll();
            Objects.requireNonNull(eVar);
            eVar.cancel(true);
        }
    }
}
