package com.google.ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

public class SharedCamera {
    private static final String TAG = "ArSdk-SharedCamera";
    private boolean cameraSharedWithAr = false;
    private final Session session;
    private Handler sharedCameraHandler;
    private final C9516x sharedCameraInfo = new C9516x((byte[]) null);

    SharedCamera(Session session2) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session2;
    }

    /* access modifiers changed from: private */
    /* renamed from: close */
    public void b() {
        Handler handler = this.sharedCameraHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.sharedCameraHandler.getLooper().quit();
            this.sharedCameraHandler = null;
        }
    }

    private ImageReader getCpuImageReader() {
        return nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        return nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    /* access modifiers changed from: private */
    /* renamed from: getGpuSurface */
    public Surface m() {
        return nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    /* access modifiers changed from: private */
    /* renamed from: getGpuSurfaceTexture */
    public SurfaceTexture l() {
        return nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDummyOnImageAvailableListener$0(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j10, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j10, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j10, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j10, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j10, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j10, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j10, String str, List<Surface> list);

    private native void nativeSharedCameraSetCaptureCallback(long j10, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* access modifiers changed from: private */
    /* renamed from: onCaptureSessionActive */
    public void g(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCaptureSessionClosed */
    public void h(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCaptureSessionConfigureFailed */
    public void i(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCaptureSessionConfigured */
    public void j(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCaptureSessionReady */
    public void k(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    /* renamed from: onDeviceClosed */
    public void e(CameraDevice cameraDevice) {
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: onDeviceDisconnected */
    public void f(CameraDevice cameraDevice) {
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.b((CameraDevice) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: onDeviceOpened */
    public void d(CameraDevice cameraDevice) {
        this.sharedCameraInfo.b(cameraDevice);
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
    }

    /* access modifiers changed from: private */
    /* renamed from: setDummyListenerToAvoidImageBufferStarvation */
    public void c() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(C9517y.f67842a, this.sharedCameraHandler);
        }
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new C9505m(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new C9510r(this, handler, stateCallback);
    }

    public List<Surface> getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.f());
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.d();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C9516x n() {
        return this.sharedCameraInfo;
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        if (this.sharedCameraInfo.a() != null) {
            c();
        }
    }

    public void setAppSurfaces(String str, List<Surface> list) {
        this.sharedCameraInfo.c(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
    }
}
