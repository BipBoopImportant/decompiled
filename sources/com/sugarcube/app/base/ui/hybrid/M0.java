package com.sugarcube.app.base.ui.hybrid;

import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.x;
import XH.y;
import YE.C13868b;
import YE.e;
import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17170k;
import eI.C17187b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001O\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H@¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020#¢\u0006\u0004\b'\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010<R\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010?R\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010DRD\u0010N\u001a$\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020G\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020#\u0018\u00010Fj\u0004\u0018\u0001`H8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bI\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/M0;", "", "Lcom/google/ar/core/Session;", "session", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebase", "<init>", "(Lcom/google/ar/core/Session;Landroid/hardware/camera2/CameraManager;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "manager", "", "cameraId", "Lcom/google/ar/core/SharedCamera;", "sharedCamera", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "i", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Lcom/google/ar/core/SharedCamera;Landroid/os/Handler;LdI/e;)Ljava/lang/Object;", "device", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraCaptureSession;", "c", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Lcom/google/ar/core/SharedCamera;Landroid/os/Handler;LdI/e;)Ljava/lang/Object;", "", "format", "Landroid/util/Size;", "e", "(Ljava/lang/String;I)Landroid/util/Size;", "", "g", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "k", "()V", "j", "d", "a", "Lcom/google/ar/core/Session;", "getSession", "()Lcom/google/ar/core/Session;", "b", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "getFirebase", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/media/ImageReader;", "Landroid/media/ImageReader;", "cpuImageReader", "f", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraCaptureSession", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "cameraThread", "h", "Landroid/os/Handler;", "cameraHandler", "imageReaderThread", "imageReaderHandler", "Landroid/hardware/camera2/TotalCaptureResult;", "Landroid/hardware/camera2/TotalCaptureResult;", "lastCaptureResult", "Lkotlin/Function3;", "Landroid/media/Image;", "Lcom/sugarcube/app/base/ui/hybrid/OnImageReadyListener;", "l", "LnI/q;", "getListener", "()LnI/q;", "(LnI/q;)V", "listener", "com/sugarcube/app/base/ui/hybrid/M0$a", "m", "Lcom/sugarcube/app/base/ui/hybrid/M0$a;", "captureCallback", "Landroid/media/ImageReader$OnImageAvailableListener;", "n", "Landroid/media/ImageReader$OnImageAvailableListener;", "onImageAvailableListener", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class M0 {

    /* renamed from: a  reason: collision with root package name */
    private final Session f124865a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraManager f124866b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInteractions f124867c;

    /* renamed from: d  reason: collision with root package name */
    private CameraDevice f124868d;

    /* renamed from: e  reason: collision with root package name */
    private ImageReader f124869e;

    /* renamed from: f  reason: collision with root package name */
    private CameraCaptureSession f124870f;

    /* renamed from: g  reason: collision with root package name */
    private final HandlerThread f124871g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f124872h;

    /* renamed from: i  reason: collision with root package name */
    private final HandlerThread f124873i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f124874j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public TotalCaptureResult f124875k;

    /* renamed from: l  reason: collision with root package name */
    private q<? super M0, ? super Image, ? super TotalCaptureResult, C16807N> f124876l;

    /* renamed from: m  reason: collision with root package name */
    private final a f124877m = new a(this);

    /* renamed from: n  reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f124878n = new L0(this);

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"com/sugarcube/app/base/ui/hybrid/M0$a", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "LXH/N;", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "Landroid/view/Surface;", "target", "", "frameNumber", "onCaptureBufferLost", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V", "Landroid/hardware/camera2/CaptureFailure;", "failure", "onCaptureFailed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V", "", "sequenceId", "onCaptureSequenceAborted", "(Landroid/hardware/camera2/CameraCaptureSession;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M0 f124879a;

        a(M0 m02) {
            this.f124879a = m02;
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            C17542s.j(cameraCaptureSession, "session");
            C17542s.j(captureRequest, "request");
            C17542s.j(surface, "target");
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
            Log.d(AnyKt.SUGARCUBE_TAG, "onCaptureBufferLost: " + j10);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C17542s.j(cameraCaptureSession, "session");
            C17542s.j(captureRequest, "request");
            C17542s.j(totalCaptureResult, "result");
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            this.f124879a.f124875k = totalCaptureResult;
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C17542s.j(cameraCaptureSession, "session");
            C17542s.j(captureRequest, "request");
            C17542s.j(captureFailure, "failure");
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            long frameNumber = captureFailure.getFrameNumber();
            int reason = captureFailure.getReason();
            Log.d(AnyKt.SUGARCUBE_TAG, "onCaptureFailed: " + frameNumber + " " + reason);
            C13868b bVar = C13868b.f118106a;
            int reason2 = captureFailure.getReason();
            bVar.b("camera capture failure: " + reason2, e.Capture);
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            C17542s.j(cameraCaptureSession, "session");
            super.onCaptureSequenceAborted(cameraCaptureSession, i10);
            Log.d(AnyKt.SUGARCUBE_TAG, "onCaptureSequenceAborted: " + i10 + " " + cameraCaptureSession);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/sugarcube/app/base/ui/hybrid/M0$b", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "LXH/N;", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17164e<CameraCaptureSession> f124880a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CameraDevice f124881b;

        b(C17164e<? super CameraCaptureSession> eVar, CameraDevice cameraDevice) {
            this.f124880a = eVar;
            this.f124881b = cameraDevice;
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C17542s.j(cameraCaptureSession, "session");
            String id2 = this.f124881b.getId();
            RuntimeException runtimeException = new RuntimeException("Camera " + id2 + " session configuration failed");
            Log.e(AnyKt.SUGARCUBE_TAG, runtimeException.getMessage(), runtimeException);
            C17164e<CameraCaptureSession> eVar = this.f124880a;
            x.a aVar = x.f139812b;
            eVar.resumeWith(x.b(y.a(runtimeException)));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C17542s.j(cameraCaptureSession, "session");
            this.f124880a.resumeWith(x.b(cameraCaptureSession));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.hybrid.SharedCameraSession", f = "SharedCameraSession.kt", l = {112, 133}, m = "initialize")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f124882c;

        /* renamed from: d  reason: collision with root package name */
        Object f124883d;

        /* renamed from: e  reason: collision with root package name */
        Object f124884e;

        /* renamed from: f  reason: collision with root package name */
        Object f124885f;

        /* renamed from: g  reason: collision with root package name */
        Object f124886g;

        /* renamed from: h  reason: collision with root package name */
        Object f124887h;

        /* renamed from: i  reason: collision with root package name */
        Object f124888i;

        /* renamed from: j  reason: collision with root package name */
        Object f124889j;

        /* renamed from: k  reason: collision with root package name */
        Object f124890k;

        /* renamed from: l  reason: collision with root package name */
        Object f124891l;

        /* renamed from: m  reason: collision with root package name */
        int f124892m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f124893n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ M0 f124894o;

        /* renamed from: p  reason: collision with root package name */
        int f124895p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(M0 m02, C17164e<? super c> eVar) {
            super(eVar);
            this.f124894o = m02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f124893n = obj;
            this.f124895p |= Integer.MIN_VALUE;
            return this.f124894o.g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/sugarcube/app/base/ui/hybrid/M0$d", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "LXH/N;", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "cameraDevice", "onClosed", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<CameraDevice> f124896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f124897b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements C17642l<Throwable, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f124898a = new a();

            a() {
            }

            public final void a(Throwable th2) {
                C17542s.j(th2, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        d(C16320n<? super CameraDevice> nVar, String str) {
            this.f124896a = nVar;
            this.f124897b = str;
        }

        public void onClosed(CameraDevice cameraDevice) {
            C17542s.j(cameraDevice, "cameraDevice");
            String str = this.f124897b;
            Log.w(AnyKt.SUGARCUBE_TAG, "Camera " + str + " closed");
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C17542s.j(cameraDevice, "device");
            String str = this.f124897b;
            Log.w(AnyKt.SUGARCUBE_TAG, "Camera " + str + " has been disconnected");
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            C17542s.j(cameraDevice, "device");
            String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
            String str2 = this.f124897b;
            RuntimeException runtimeException = new RuntimeException("Camera " + str2 + " error: (" + i10 + ") " + str);
            Log.e(AnyKt.SUGARCUBE_TAG, runtimeException.getMessage(), runtimeException);
            if (this.f124896a.c()) {
                C16320n<CameraDevice> nVar = this.f124896a;
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(y.a(runtimeException)));
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            C17542s.j(cameraDevice, "device");
            this.f124896a.I(cameraDevice, a.f124898a);
        }
    }

    public M0(Session session, CameraManager cameraManager, FirebaseInteractions firebaseInteractions) {
        C17542s.j(session, "session");
        C17542s.j(cameraManager, "cameraManager");
        C17542s.j(firebaseInteractions, "firebase");
        this.f124865a = session;
        this.f124866b = cameraManager;
        this.f124867c = firebaseInteractions;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.f124871g = handlerThread;
        this.f124872h = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("ImageReaderThread");
        handlerThread2.start();
        this.f124873i = handlerThread2;
        this.f124874j = new Handler(handlerThread2.getLooper());
    }

    private final Object c(CameraDevice cameraDevice, List<? extends Surface> list, SharedCamera sharedCamera, Handler handler, C17164e<? super CameraCaptureSession> eVar) {
        C17170k kVar = new C17170k(C17187b.c(eVar));
        cameraDevice.createCaptureSession(list, sharedCamera.createARSessionStateCallback(new b(kVar, cameraDevice), handler), handler);
        Object a10 = kVar.a();
        if (a10 == C17187b.f()) {
            h.c(eVar);
        }
        return a10;
    }

    private final Size e(String str, int i10) {
        CameraCharacteristics cameraCharacteristics = this.f124866b.getCameraCharacteristics(str);
        C17542s.i(cameraCharacteristics, "getCameraCharacteristics(...)");
        Size size = new Size(0, 0);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Iterator a10 = C17527c.a(streamConfigurationMap.getOutputSizes(i10));
            while (a10.hasNext()) {
                Size size2 = (Size) a10.next();
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == (height * 4) / 3 && width <= 1920 && size.getWidth() * size.getHeight() < width * height) {
                    size = size2;
                }
            }
        }
        return size;
    }

    static /* synthetic */ Size f(M0 m02, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 35;
        }
        return m02.e(str, i10);
    }

    /* access modifiers changed from: private */
    public static final void h(M0 m02, ImageReader imageReader) {
        try {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                q<? super M0, ? super Image, ? super TotalCaptureResult, C16807N> qVar = m02.f124876l;
                if (qVar != null) {
                    qVar.invoke(m02, acquireLatestImage, m02.f124875k);
                }
                acquireLatestImage.close();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            C13868b.f118106a.b("failed to acquire image (hybrid)", e.Capture);
            m02.f124867c.recordException(e10);
        }
    }

    @SuppressLint({"MissingPermission"})
    private final Object i(CameraManager cameraManager, String str, SharedCamera sharedCamera, Handler handler, C17164e<? super CameraDevice> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        cameraManager.openCamera(str, sharedCamera.createARDeviceStateCallback(new d(pVar, str), handler), handler);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    public final void d() {
        Log.d(AnyKt.SUGARCUBE_TAG, "SharedCameraSession.destroy " + this);
        CameraCaptureSession cameraCaptureSession = this.f124870f;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f124870f = null;
        }
        CameraDevice cameraDevice = this.f124868d;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f124868d = null;
        }
        ImageReader imageReader = this.f124869e;
        if (imageReader != null) {
            imageReader.close();
            this.f124869e = null;
        }
        this.f124871g.quitSafely();
        this.f124873i.quitSafely();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x016c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0180 A[LOOP:0: B:24:0x017a->B:26:0x0180, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(dI.C17164e<? super java.lang.Float> r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7 instanceof com.sugarcube.app.base.ui.hybrid.M0.c
            if (r0 == 0) goto L_0x0018
            r0 = r7
            com.sugarcube.app.base.ui.hybrid.M0$c r0 = (com.sugarcube.app.base.ui.hybrid.M0.c) r0
            int r1 = r0.f124895p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f124895p = r1
        L_0x0016:
            r12 = r0
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.ui.hybrid.M0$c r0 = new com.sugarcube.app.base.ui.hybrid.M0$c
            r0.<init>(r6, r7)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r12.f124893n
            java.lang.Object r13 = eI.C17187b.f()
            int r1 = r12.f124895p
            java.lang.String r8 = "getSharedCamera(...)"
            java.lang.String r9 = "getCameraId(...)"
            r2 = 1
            r10 = 2
            if (r1 == 0) goto L_0x007d
            if (r1 == r2) goto L_0x0067
            if (r1 != r10) goto L_0x005f
            java.lang.Object r1 = r12.f124891l
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r12.f124890k
            com.google.ar.core.SharedCamera r1 = (com.google.ar.core.SharedCamera) r1
            java.lang.Object r1 = r12.f124889j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r12.f124888i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r12.f124887h
            android.media.ImageReader r2 = (android.media.ImageReader) r2
            java.lang.Object r3 = r12.f124886g
            android.util.Size r3 = (android.util.Size) r3
            java.lang.Object r3 = r12.f124885f
            android.hardware.camera2.CameraDevice r3 = (android.hardware.camera2.CameraDevice) r3
            java.lang.Object r4 = r12.f124884e
            kotlin.jvm.internal.L r4 = (kotlin.jvm.internal.L) r4
            java.lang.Object r5 = r12.f124883d
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r12.f124882c
            com.sugarcube.app.base.ui.hybrid.M0 r5 = (com.sugarcube.app.base.ui.hybrid.M0) r5
            XH.y.b(r0)
            goto L_0x016f
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            java.lang.Object r1 = r12.f124885f
            com.google.ar.core.SharedCamera r1 = (com.google.ar.core.SharedCamera) r1
            java.lang.Object r1 = r12.f124884e
            kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
            java.lang.Object r2 = r12.f124883d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r12.f124882c
            com.sugarcube.app.base.ui.hybrid.M0 r3 = (com.sugarcube.app.base.ui.hybrid.M0) r3
            XH.y.b(r0)
            r4 = r1
            r5 = r3
            goto L_0x00bd
        L_0x007d:
            XH.y.b(r0)
            kotlin.jvm.internal.L r11 = new kotlin.jvm.internal.L
            r11.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.f144345a = r0
            android.hardware.camera2.CameraManager r1 = r6.f124866b
            com.google.ar.core.Session r0 = r6.f124865a
            com.google.ar.core.CameraConfig r0 = r0.getCameraConfig()
            java.lang.String r3 = r0.getCameraId()
            kotlin.jvm.internal.C17542s.i(r3, r9)
            com.google.ar.core.Session r0 = r6.f124865a
            com.google.ar.core.SharedCamera r4 = r0.getSharedCamera()
            kotlin.jvm.internal.C17542s.i(r4, r8)
            android.os.Handler r5 = r6.f124872h
            r12.f124882c = r6
            r12.f124883d = r7
            r12.f124884e = r11
            r12.f124885f = r4
            r12.f124895p = r2
            r0 = r16
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r12
            java.lang.Object r0 = r0.i(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L_0x00ba
            return r13
        L_0x00ba:
            r5 = r6
            r2 = r7
            r4 = r11
        L_0x00bd:
            r3 = r0
            android.hardware.camera2.CameraDevice r3 = (android.hardware.camera2.CameraDevice) r3
            com.google.ar.core.Session r0 = r5.f124865a
            com.google.ar.core.CameraConfig r0 = r0.getCameraConfig()
            android.util.Size r0 = r0.getImageSize()
            java.lang.String r1 = "getImageSize(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            com.google.ar.core.Session r1 = r5.f124865a
            com.google.ar.core.CameraConfig r1 = r1.getCameraConfig()
            java.lang.String r1 = r1.getCameraId()
            kotlin.jvm.internal.C17542s.i(r1, r9)
            r7 = 0
            r9 = 0
            android.util.Size r1 = f(r5, r1, r9, r10, r7)
            int r7 = r1.getWidth()
            float r7 = (float) r7
            int r11 = r0.getWidth()
            float r11 = (float) r11
            float r7 = r7 / r11
            r4.f144345a = r7
            int r7 = r1.getWidth()
            int r1 = r1.getHeight()
            r11 = 35
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r7, r1, r11, r10)
            java.lang.String r7 = "let(...)"
            kotlin.jvm.internal.C17542s.i(r1, r7)
            android.media.ImageReader$OnImageAvailableListener r7 = r5.f124878n
            android.os.Handler r11 = r5.f124874j
            r1.setOnImageAvailableListener(r7, r11)
            com.google.ar.core.Session r7 = r5.f124865a
            com.google.ar.core.SharedCamera r7 = r7.getSharedCamera()
            com.google.ar.core.Session r11 = r5.f124865a
            com.google.ar.core.CameraConfig r11 = r11.getCameraConfig()
            java.lang.String r11 = r11.getCameraId()
            android.view.Surface r14 = r1.getSurface()
            android.view.Surface[] r14 = new android.view.Surface[]{r14}
            java.util.List r14 = java.util.Arrays.asList(r14)
            r7.setAppSurfaces(r11, r14)
            com.google.ar.core.Session r7 = r5.f124865a
            com.google.ar.core.SharedCamera r7 = r7.getSharedCamera()
            java.util.List r14 = r7.getArCoreSurfaces()
            android.view.Surface r7 = r1.getSurface()
            r14.add(r7)
            java.lang.String r7 = "also(...)"
            kotlin.jvm.internal.C17542s.i(r14, r7)
            com.google.ar.core.Session r7 = r5.f124865a
            com.google.ar.core.SharedCamera r11 = r7.getSharedCamera()
            kotlin.jvm.internal.C17542s.i(r11, r8)
            android.os.Handler r15 = r5.f124872h
            r12.f124882c = r5
            r12.f124883d = r2
            r12.f124884e = r4
            r12.f124885f = r3
            r12.f124886g = r0
            r12.f124887h = r1
            r12.f124888i = r14
            r12.f124889j = r14
            r12.f124890k = r11
            r12.f124891l = r14
            r12.f124892m = r9
            r12.f124895p = r10
            r7 = r5
            r8 = r3
            r9 = r14
            r10 = r11
            r11 = r15
            java.lang.Object r0 = r7.c(r8, r9, r10, r11, r12)
            if (r0 != r13) goto L_0x016d
            return r13
        L_0x016d:
            r2 = r1
            r1 = r14
        L_0x016f:
            android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
            r7 = 3
            android.hardware.camera2.CaptureRequest$Builder r7 = r3.createCaptureRequest(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x017a:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x018a
            java.lang.Object r8 = r1.next()
            android.view.Surface r8 = (android.view.Surface) r8
            r7.addTarget(r8)
            goto L_0x017a
        L_0x018a:
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.C17542s.i(r7, r1)
            android.hardware.camera2.CaptureRequest r1 = r7.build()
            com.sugarcube.app.base.ui.hybrid.M0$a r7 = r5.f124877m
            android.os.Handler r8 = r5.f124872h
            r0.setRepeatingRequest(r1, r7, r8)
            r5.f124869e = r2
            r5.f124870f = r0
            r5.f124868d = r3
            float r0 = r4.f144345a
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.b.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.M0.g(dI.e):java.lang.Object");
    }

    public final void j() {
    }

    public final void k() {
        this.f124865a.getSharedCamera().setCaptureCallback(this.f124877m, this.f124872h);
    }

    public final void l(q<? super M0, ? super Image, ? super TotalCaptureResult, C16807N> qVar) {
        this.f124876l = qVar;
    }
}
