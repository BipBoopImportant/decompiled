package com.sugarcube.app.base.ui.capturev2;

import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.x;
import XH.y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001O\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H@¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020%¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020%¢\u0006\u0004\b)\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010ER\u0014\u0010I\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0014\u0010K\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010HR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/l;", "", "Landroid/content/Context;", "context", "Lcom/google/ar/core/Session;", "session", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "arControl", "<init>", "(Landroid/content/Context;Lcom/google/ar/core/Session;Landroid/hardware/camera2/CameraManager;Lcom/sugarcube/app/base/ui/capturev2/ArControl;)V", "manager", "", "cameraId", "Lcom/google/ar/core/SharedCamera;", "sharedCamera", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "k", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Lcom/google/ar/core/SharedCamera;Landroid/os/Handler;LdI/e;)Ljava/lang/Object;", "device", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraCaptureSession;", "e", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Lcom/google/ar/core/SharedCamera;Landroid/os/Handler;LdI/e;)Ljava/lang/Object;", "", "format", "Landroid/util/Size;", "h", "(Ljava/lang/String;I)Landroid/util/Size;", "", "i", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "m", "()V", "l", "f", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/google/ar/core/Session;", "getSession", "()Lcom/google/ar/core/Session;", "c", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "d", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "g", "()Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/media/ImageReader;", "Landroid/media/ImageReader;", "cpuImageReader", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraCaptureSession", "", "Z", "captureSessionChangesPossible", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "cameraThread", "j", "Landroid/os/Handler;", "cameraHandler", "imageReaderThread", "imageReaderHandler", "Landroid/hardware/camera2/TotalCaptureResult;", "Landroid/hardware/camera2/TotalCaptureResult;", "lastCaptureResult", "com/sugarcube/app/base/ui/capturev2/l$b", "n", "Lcom/sugarcube/app/base/ui/capturev2/l$b;", "captureCallback", "Landroid/media/ImageReader$OnImageAvailableListener;", "o", "Landroid/media/ImageReader$OnImageAvailableListener;", "onImageAvailableListener", "p", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.l  reason: case insensitive filesystem */
public final class C14218l {

    /* renamed from: p  reason: collision with root package name */
    public static final a f123908p = new a((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f123909q = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f123910a;

    /* renamed from: b  reason: collision with root package name */
    private final Session f123911b;

    /* renamed from: c  reason: collision with root package name */
    private final CameraManager f123912c;

    /* renamed from: d  reason: collision with root package name */
    private final ArControl f123913d;

    /* renamed from: e  reason: collision with root package name */
    private CameraDevice f123914e;

    /* renamed from: f  reason: collision with root package name */
    private ImageReader f123915f;

    /* renamed from: g  reason: collision with root package name */
    private CameraCaptureSession f123916g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f123917h = true;

    /* renamed from: i  reason: collision with root package name */
    private final HandlerThread f123918i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f123919j;

    /* renamed from: k  reason: collision with root package name */
    private final HandlerThread f123920k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f123921l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public TotalCaptureResult f123922m;

    /* renamed from: n  reason: collision with root package name */
    private final b f123923n;

    /* renamed from: o  reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f123924o;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/l$a;", "", "<init>", "()V", "", "MAX_IMAGE_WIDTH", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"com/sugarcube/app/base/ui/capturev2/l$b", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "LXH/N;", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "Landroid/view/Surface;", "target", "", "frameNumber", "onCaptureBufferLost", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V", "Landroid/hardware/camera2/CaptureFailure;", "failure", "onCaptureFailed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V", "", "sequenceId", "onCaptureSequenceAborted", "(Landroid/hardware/camera2/CameraCaptureSession;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.l$b */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14218l f123925a;

        b(C14218l lVar) {
            this.f123925a = lVar;
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            C17542s.j(cameraCaptureSession, "session");
            C17542s.j(captureRequest, "request");
            C17542s.j(surface, "target");
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
            ArControl g10 = this.f123925a.g();
            g10.log("onCaptureBufferLost: " + j10);
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C17542s.j(cameraCaptureSession, "session");
            C17542s.j(captureRequest, "request");
            C17542s.j(totalCaptureResult, "result");
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            this.f123925a.f123922m = totalCaptureResult;
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C17542s.j(cameraCaptureSession, "session");
            C17542s.j(captureRequest, "request");
            C17542s.j(captureFailure, "failure");
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            ArControl g10 = this.f123925a.g();
            long frameNumber = captureFailure.getFrameNumber();
            int reason = captureFailure.getReason();
            g10.log("onCaptureFailed: " + frameNumber + " " + reason);
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            C17542s.j(cameraCaptureSession, "session");
            super.onCaptureSequenceAborted(cameraCaptureSession, i10);
            ArControl g10 = this.f123925a.g();
            g10.log("onCaptureSequenceAborted: " + i10 + " " + cameraCaptureSession);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/capturev2/l$c", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "LXH/N;", "onActive", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigured", "onConfigureFailed", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.l$c */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14218l f123926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17164e<CameraCaptureSession> f123927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CameraDevice f123928c;

        c(C14218l lVar, C17164e<? super CameraCaptureSession> eVar, CameraDevice cameraDevice) {
            this.f123926a = lVar;
            this.f123927b = eVar;
            this.f123928c = cameraDevice;
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C17542s.j(cameraCaptureSession, "session");
            C14218l lVar = this.f123926a;
            synchronized (lVar) {
                lVar.f123917h = true;
                ArControl g10 = lVar.g();
                boolean b10 = lVar.f123917h;
                g10.log("onActive: " + b10);
                lVar.notify();
                C16807N n10 = C16807N.f139792a;
            }
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C17542s.j(cameraCaptureSession, "session");
            String id2 = this.f123928c.getId();
            RuntimeException runtimeException = new RuntimeException("Camera " + id2 + " session configuration failed");
            this.f123926a.g().onImageError(runtimeException.getMessage(), runtimeException);
            C17164e<CameraCaptureSession> eVar = this.f123927b;
            x.a aVar = x.f139812b;
            eVar.resumeWith(x.b(y.a(runtimeException)));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C17542s.j(cameraCaptureSession, "session");
            this.f123927b.resumeWith(x.b(cameraCaptureSession));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.capturev2.ArSharedCamera", f = "ArSharedCamera.kt", l = {96, 127}, m = "initialize")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.l$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f123929c;

        /* renamed from: d  reason: collision with root package name */
        Object f123930d;

        /* renamed from: e  reason: collision with root package name */
        Object f123931e;

        /* renamed from: f  reason: collision with root package name */
        Object f123932f;

        /* renamed from: g  reason: collision with root package name */
        Object f123933g;

        /* renamed from: h  reason: collision with root package name */
        Object f123934h;

        /* renamed from: i  reason: collision with root package name */
        Object f123935i;

        /* renamed from: j  reason: collision with root package name */
        Object f123936j;

        /* renamed from: k  reason: collision with root package name */
        Object f123937k;

        /* renamed from: l  reason: collision with root package name */
        Object f123938l;

        /* renamed from: m  reason: collision with root package name */
        int f123939m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f123940n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C14218l f123941o;

        /* renamed from: p  reason: collision with root package name */
        int f123942p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14218l lVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f123941o = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123940n = obj;
            this.f123942p |= Integer.MIN_VALUE;
            return this.f123941o.i(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/sugarcube/app/base/ui/capturev2/l$e", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "LXH/N;", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "cameraDevice", "onClosed", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.l$e */
    public static final class e extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<CameraDevice> f123943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14218l f123944b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f123945c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.capturev2.l$e$a */
        static final class a implements C17642l<Throwable, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f123946a = new a();

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

        e(C16320n<? super CameraDevice> nVar, C14218l lVar, String str) {
            this.f123943a = nVar;
            this.f123944b = lVar;
            this.f123945c = str;
        }

        public void onClosed(CameraDevice cameraDevice) {
            C17542s.j(cameraDevice, "cameraDevice");
            ArControl g10 = this.f123944b.g();
            String str = this.f123945c;
            g10.log("Camera " + str + " closed");
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C17542s.j(cameraDevice, "device");
            ArControl g10 = this.f123944b.g();
            String str = this.f123945c;
            g10.log("Camera " + str + " has been disconnected");
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            C17542s.j(cameraDevice, "device");
            String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
            String str2 = this.f123945c;
            RuntimeException runtimeException = new RuntimeException("Camera " + str2 + " error: (" + i10 + ") " + str);
            this.f123944b.g().onImageError(runtimeException.getMessage(), runtimeException);
            if (this.f123943a.c()) {
                C16320n<CameraDevice> nVar = this.f123943a;
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(y.a(runtimeException)));
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            C17542s.j(cameraDevice, "device");
            this.f123943a.I(cameraDevice, a.f123946a);
        }
    }

    public C14218l(Context context, Session session, CameraManager cameraManager, ArControl arControl) {
        C17542s.j(context, "context");
        C17542s.j(session, "session");
        C17542s.j(cameraManager, "cameraManager");
        C17542s.j(arControl, "arControl");
        this.f123910a = context;
        this.f123911b = session;
        this.f123912c = cameraManager;
        this.f123913d = arControl;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.f123918i = handlerThread;
        this.f123919j = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("ImageReaderThread");
        handlerThread2.start();
        this.f123920k = handlerThread2;
        this.f123921l = new Handler(handlerThread2.getLooper());
        this.f123923n = new b(this);
        this.f123924o = new C14216k(this);
    }

    private final Object e(CameraDevice cameraDevice, List<? extends Surface> list, SharedCamera sharedCamera, Handler handler, C17164e<? super CameraCaptureSession> eVar) {
        C17170k kVar = new C17170k(C17187b.c(eVar));
        cameraDevice.createCaptureSession(list, sharedCamera.createARSessionStateCallback(new c(this, kVar, cameraDevice), handler), handler);
        Object a10 = kVar.a();
        if (a10 == C17187b.f()) {
            h.c(eVar);
        }
        return a10;
    }

    private final Size h(String str, int i10) {
        CameraCharacteristics cameraCharacteristics = this.f123912c.getCameraCharacteristics(str);
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

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        lI.C17553a.a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(com.sugarcube.app.base.ui.capturev2.C14218l r4, android.media.ImageReader r5) {
        /*
            r0 = 0
            android.media.Image r5 = r5.acquireLatestImage()     // Catch:{ all -> 0x0016 }
            if (r5 == 0) goto L_0x0025
            com.sugarcube.app.base.ui.capturev2.ArControl r1 = r4.f123913d     // Catch:{ all -> 0x0018 }
            android.content.Context r2 = r4.f123910a     // Catch:{ all -> 0x0018 }
            android.hardware.camera2.TotalCaptureResult r3 = r4.f123922m     // Catch:{ all -> 0x0018 }
            r1.onImageAvailable(r2, r5, r3)     // Catch:{ all -> 0x0018 }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0018 }
            lI.C17553a.a(r5, r0)     // Catch:{ all -> 0x0016 }
            goto L_0x0025
        L_0x0016:
            r5 = move-exception
            goto L_0x001f
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001a:
            r2 = move-exception
            lI.C17553a.a(r5, r1)     // Catch:{ all -> 0x0016 }
            throw r2     // Catch:{ all -> 0x0016 }
        L_0x001f:
            com.sugarcube.app.base.ui.capturev2.ArControl r4 = r4.f123913d
            r1 = 1
            com.sugarcube.app.base.ui.capturev2.ArControl.a.b(r4, r0, r5, r1, r0)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14218l.j(com.sugarcube.app.base.ui.capturev2.l, android.media.ImageReader):void");
    }

    @SuppressLint({"MissingPermission"})
    private final Object k(CameraManager cameraManager, String str, SharedCamera sharedCamera, Handler handler, C17164e<? super CameraDevice> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        this.f123917h = false;
        ArControl g10 = g();
        boolean b10 = this.f123917h;
        g10.log("openCamera: " + b10);
        cameraManager.openCamera(str, sharedCamera.createARDeviceStateCallback(new e(pVar, this, str), handler), handler);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    public final void f() {
        this.f123913d.log("ArSharedCamera.destroy");
        CameraCaptureSession cameraCaptureSession = this.f123916g;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f123916g = null;
        }
        CameraDevice cameraDevice = this.f123914e;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f123914e = null;
        }
        ImageReader imageReader = this.f123915f;
        if (imageReader != null) {
            imageReader.close();
            this.f123915f = null;
        }
        this.f123918i.quitSafely();
        this.f123920k.quitSafely();
    }

    public final ArControl g() {
        return this.f123913d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x017e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0192 A[LOOP:0: B:28:0x018c->B:30:0x0192, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(dI.C17164e<? super java.lang.Float> r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7 instanceof com.sugarcube.app.base.ui.capturev2.C14218l.d
            if (r0 == 0) goto L_0x0018
            r0 = r7
            com.sugarcube.app.base.ui.capturev2.l$d r0 = (com.sugarcube.app.base.ui.capturev2.C14218l.d) r0
            int r1 = r0.f123942p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.f123942p = r1
        L_0x0016:
            r12 = r0
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.ui.capturev2.l$d r0 = new com.sugarcube.app.base.ui.capturev2.l$d
            r0.<init>(r6, r7)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r12.f123940n
            java.lang.Object r13 = eI.C17187b.f()
            int r1 = r12.f123942p
            java.lang.String r8 = "getSharedCamera(...)"
            java.lang.String r9 = "getCameraId(...)"
            r2 = 1
            r10 = 2
            if (r1 == 0) goto L_0x007d
            if (r1 == r2) goto L_0x0067
            if (r1 != r10) goto L_0x005f
            java.lang.Object r1 = r12.f123938l
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r12.f123937k
            com.google.ar.core.SharedCamera r1 = (com.google.ar.core.SharedCamera) r1
            java.lang.Object r1 = r12.f123936j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r12.f123935i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r12.f123934h
            android.media.ImageReader r2 = (android.media.ImageReader) r2
            java.lang.Object r3 = r12.f123933g
            android.util.Size r3 = (android.util.Size) r3
            java.lang.Object r3 = r12.f123932f
            android.hardware.camera2.CameraDevice r3 = (android.hardware.camera2.CameraDevice) r3
            java.lang.Object r4 = r12.f123931e
            kotlin.jvm.internal.L r4 = (kotlin.jvm.internal.L) r4
            java.lang.Object r5 = r12.f123930d
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r12.f123929c
            com.sugarcube.app.base.ui.capturev2.l r5 = (com.sugarcube.app.base.ui.capturev2.C14218l) r5
            XH.y.b(r0)
            goto L_0x0181
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            java.lang.Object r1 = r12.f123932f
            com.google.ar.core.SharedCamera r1 = (com.google.ar.core.SharedCamera) r1
            java.lang.Object r1 = r12.f123931e
            kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
            java.lang.Object r2 = r12.f123930d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r12.f123929c
            com.sugarcube.app.base.ui.capturev2.l r3 = (com.sugarcube.app.base.ui.capturev2.C14218l) r3
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
            android.hardware.camera2.CameraManager r1 = r6.f123912c
            com.google.ar.core.Session r0 = r6.f123911b
            com.google.ar.core.CameraConfig r0 = r0.getCameraConfig()
            java.lang.String r3 = r0.getCameraId()
            kotlin.jvm.internal.C17542s.i(r3, r9)
            com.google.ar.core.Session r0 = r6.f123911b
            com.google.ar.core.SharedCamera r4 = r0.getSharedCamera()
            kotlin.jvm.internal.C17542s.i(r4, r8)
            android.os.Handler r5 = r6.f123919j
            r12.f123929c = r6
            r12.f123930d = r7
            r12.f123931e = r11
            r12.f123932f = r4
            r12.f123942p = r2
            r0 = r16
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r12
            java.lang.Object r0 = r0.k(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L_0x00ba
            return r13
        L_0x00ba:
            r5 = r6
            r2 = r7
            r4 = r11
        L_0x00bd:
            r3 = r0
            android.hardware.camera2.CameraDevice r3 = (android.hardware.camera2.CameraDevice) r3
            com.google.ar.core.Session r0 = r5.f123911b
            com.google.ar.core.CameraConfig r0 = r0.getCameraConfig()
            android.util.Size r0 = r0.getImageSize()
            java.lang.String r1 = "getImageSize(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            com.google.ar.core.Session r1 = r5.f123911b
            com.google.ar.core.CameraConfig r1 = r1.getCameraConfig()
            java.lang.String r1 = r1.getCameraId()
            kotlin.jvm.internal.C17542s.i(r1, r9)
            com.sugarcube.app.base.ui.capturev2.ArControl r7 = r5.f123913d
            boolean r7 = r7.getUseImageFormatJPEG()
            r9 = 35
            if (r7 == 0) goto L_0x00e9
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x00ea
        L_0x00e9:
            r7 = r9
        L_0x00ea:
            android.util.Size r1 = r5.h(r1, r7)
            int r7 = r1.getWidth()
            float r7 = (float) r7
            int r11 = r0.getWidth()
            float r11 = (float) r11
            float r7 = r7 / r11
            r4.f144345a = r7
            int r7 = r1.getWidth()
            int r1 = r1.getHeight()
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r7, r1, r9, r10)
            java.lang.String r7 = "let(...)"
            kotlin.jvm.internal.C17542s.i(r1, r7)
            android.media.ImageReader$OnImageAvailableListener r7 = r5.f123924o
            android.os.Handler r9 = r5.f123921l
            r1.setOnImageAvailableListener(r7, r9)
            com.sugarcube.app.base.ui.capturev2.ArControl r7 = r5.f123913d
            java.lang.String r9 = "initialize: setOnImageAvailableListener"
            r7.log(r9)
            com.google.ar.core.Session r7 = r5.f123911b
            com.google.ar.core.SharedCamera r7 = r7.getSharedCamera()
            com.google.ar.core.Session r9 = r5.f123911b
            com.google.ar.core.CameraConfig r9 = r9.getCameraConfig()
            java.lang.String r9 = r9.getCameraId()
            android.view.Surface r11 = r1.getSurface()
            android.view.Surface[] r11 = new android.view.Surface[]{r11}
            java.util.List r11 = java.util.Arrays.asList(r11)
            r7.setAppSurfaces(r9, r11)
            com.google.ar.core.Session r7 = r5.f123911b
            com.google.ar.core.SharedCamera r7 = r7.getSharedCamera()
            java.util.List r14 = r7.getArCoreSurfaces()
            android.view.Surface r7 = r1.getSurface()
            r14.add(r7)
            java.lang.String r7 = "also(...)"
            kotlin.jvm.internal.C17542s.i(r14, r7)
            com.google.ar.core.Session r7 = r5.f123911b
            com.google.ar.core.SharedCamera r11 = r7.getSharedCamera()
            kotlin.jvm.internal.C17542s.i(r11, r8)
            android.os.Handler r15 = r5.f123919j
            r12.f123929c = r5
            r12.f123930d = r2
            r12.f123931e = r4
            r12.f123932f = r3
            r12.f123933g = r0
            r12.f123934h = r1
            r12.f123935i = r14
            r12.f123936j = r14
            r12.f123937k = r11
            r12.f123938l = r14
            r0 = 0
            r12.f123939m = r0
            r12.f123942p = r10
            r7 = r5
            r8 = r3
            r9 = r14
            r10 = r11
            r11 = r15
            java.lang.Object r0 = r7.e(r8, r9, r10, r11, r12)
            if (r0 != r13) goto L_0x017f
            return r13
        L_0x017f:
            r2 = r1
            r1 = r14
        L_0x0181:
            android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
            r7 = 3
            android.hardware.camera2.CaptureRequest$Builder r7 = r3.createCaptureRequest(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x018c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x019c
            java.lang.Object r8 = r1.next()
            android.view.Surface r8 = (android.view.Surface) r8
            r7.addTarget(r8)
            goto L_0x018c
        L_0x019c:
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.C17542s.i(r7, r1)
            android.hardware.camera2.CaptureRequest r1 = r7.build()
            com.sugarcube.app.base.ui.capturev2.l$b r7 = r5.f123923n
            android.os.Handler r8 = r5.f123919j
            r0.setRepeatingRequest(r1, r7, r8)
            r5.f123915f = r2
            r5.f123916g = r0
            r5.f123914e = r3
            float r0 = r4.f144345a
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.b.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14218l.i(dI.e):java.lang.Object");
    }

    public final void l() {
    }

    public final void m() {
        this.f123911b.getSharedCamera().setCaptureCallback(this.f123923n, this.f123919j);
    }
}
