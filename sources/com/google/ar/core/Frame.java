package com.google.ar.core;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.os.Build;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Frame {
    static final ArrayList<Anchor> ANCHORS_EMPTY_LIST = new ArrayList<>();
    static final ArrayList<Plane> PLANES_EMPTY_LIST = new ArrayList<>();
    private static final String TAG = "ARCore-Frame";
    private LightEstimate lightEstimate;
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    protected Frame() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeSymbolTableHandle = 0;
    }

    private List<HitResult> convertNativeHitResultsToList(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long hitResult : jArr) {
            HitResult hitResult2 = new HitResult(hitResult, this.session);
            if (hitResult2.getTrackable() != null) {
                arrayList.add(hitResult2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private native long nativeAcquireCameraImage(long j10, long j11);

    private native long nativeAcquireDepthImage(long j10, long j11);

    private native long nativeAcquireDepthImage16Bits(long j10, long j11);

    private native long nativeAcquireImageMetadata(long j10, long j11);

    private native long nativeAcquireRawDepthConfidenceImage(long j10, long j11);

    private native long nativeAcquireRawDepthImage(long j10, long j11);

    private native long nativeAcquireRawDepthImage16Bits(long j10, long j11);

    private native long nativeAcquireSemanticConfidenceImage(long j10, long j11);

    private native long nativeAcquireSemanticImage(long j10, long j11);

    private native long[] nativeAcquireTrackData(long j10, long j11, byte[] bArr);

    private native long[] nativeAcquireUpdatedAnchors(long j10, long j11);

    private static native long nativeCreateFrame(long j10);

    private static native void nativeDestroyFrame(long j10, long j11);

    private native long nativeGetAndroidCameraTimestamp(long j10, long j11);

    private native Pose nativeGetAndroidSensorPose(long j10, long j11);

    private native int nativeGetCameraTextureName(long j10, long j11);

    private native HardwareBuffer nativeGetHardwareBuffer(long j10, long j11);

    private native void nativeGetLightEstimate(long j10, long j11, long j12);

    private native float nativeGetSemanticLabelFraction(long j10, long j11, int i10);

    private native long nativeGetTimestamp(long j10, long j11);

    private native boolean nativeHasDisplayGeometryChanged(long j10, long j11);

    private native void nativeRecordTrackData(long j10, long j11, byte[] bArr, byte[] bArr2);

    private native void nativeTransformCoordinates2dFloatArrayOrBuffer(long j10, long j11, int i10, Object obj, int i11, Object obj2);

    private native void nativeTransformCoordinates3dFloatArrayOrBuffer(long j10, long j11, int i10, Object obj, int i11, Object obj2);

    private native void nativeTransformDisplayUvCoords(long j10, long j11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    public Image acquireCameraImage() {
        return new ArImage(this.session, nativeAcquireCameraImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Deprecated(forRemoval = true)
    public Image acquireDepthImage() {
        return new ArImage(this.session, nativeAcquireDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireDepthImage16Bits() {
        return new ArImage(this.session, nativeAcquireDepthImage16Bits(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PointCloud acquirePointCloud() {
        return new PointCloud(this.session, nativeAcquirePointCloud(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireRawDepthConfidenceImage() {
        return new ArImage(this.session, nativeAcquireRawDepthConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Deprecated(forRemoval = true)
    public Image acquireRawDepthImage() {
        return new ArImage(this.session, nativeAcquireRawDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireRawDepthImage16Bits() {
        return new ArImage(this.session, nativeAcquireRawDepthImage16Bits(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireSemanticConfidenceImage() {
        return new ArImage(this.session, nativeAcquireSemanticConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireSemanticImage() {
        return new ArImage(this.session, nativeAcquireSemanticImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyFrame(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public long getAndroidCameraTimestamp() {
        return nativeGetAndroidCameraTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getAndroidSensorPose() {
        return nativeGetAndroidSensorPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Camera getCamera() {
        return new Camera(this.session, this);
    }

    public int getCameraTextureName() {
        return nativeGetCameraTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public HardwareBuffer getHardwareBuffer() {
        if (Build.VERSION.SDK_INT >= 27) {
            return nativeGetHardwareBuffer(this.session.nativeWrapperHandle, this.nativeHandle);
        }
        throw new IllegalStateException("Hardware Buffer isn't supported is current Android version");
    }

    public ImageMetadata getImageMetadata() {
        return new ImageMetadata(nativeAcquireImageMetadata(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public LightEstimate getLightEstimate() {
        if (this.lightEstimate == null) {
            this.lightEstimate = new LightEstimate(this.session);
        }
        nativeGetLightEstimate(this.session.nativeWrapperHandle, this.nativeHandle, this.lightEstimate.nativeHandle);
        return this.lightEstimate;
    }

    public float getSemanticLabelFraction(SemanticLabel semanticLabel) {
        return nativeGetSemanticLabelFraction(this.session.nativeWrapperHandle, this.nativeHandle, semanticLabel.nativeCode);
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Collection<Anchor> getUpdatedAnchors() {
        return this.session.convertNativeAnchorsToCollection(nativeAcquireUpdatedAnchors(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Collection<TrackData> getUpdatedTrackData(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return this.session.convertNativeTrackDataToCollection(nativeAcquireTrackData(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array()));
    }

    public <T extends Trackable> Collection<T> getUpdatedTrackables(Class<T> cls) {
        C9503k a10 = C9503k.a(cls);
        if (a10 == C9503k.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return this.session.convertNativeTrackablesToCollection(cls, nativeAcquireUpdatedTrackables(this.session.nativeWrapperHandle, this.nativeHandle, a10.f67811k));
    }

    public boolean hasDisplayGeometryChanged() {
        return nativeHasDisplayGeometryChanged(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public List<HitResult> hitTest(float f10, float f11) {
        return convertNativeHitResultsToList(nativeHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f10, f11));
    }

    public List<HitResult> hitTestInstantPlacement(float f10, float f11, float f12) {
        return convertNativeHitResultsToList(nativeHitTestInstantPlacement(this.session.nativeWrapperHandle, this.nativeHandle, f10, f11, f12));
    }

    /* access modifiers changed from: package-private */
    public native long nativeAcquirePointCloud(long j10, long j11);

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireUpdatedTrackables(long j10, long j11, int i10);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTest(long j10, long j11, float f10, float f11);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTestInstantPlacement(long j10, long j11, float f10, float f11, float f12);

    /* access modifiers changed from: package-private */
    public native long[] nativeHitTestRay(long j10, long j11, float[] fArr, int i10, float[] fArr2, int i11);

    public void recordTrackData(UUID uuid, ByteBuffer byteBuffer) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            nativeRecordTrackData(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array(), bArr);
            return;
        }
        nativeRecordTrackData(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array(), byteBuffer.array());
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates2d coordinates2d2, FloatBuffer floatBuffer2) {
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates2d2.nativeCode, floatBuffer2);
    }

    public void transformCoordinates3d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates3d coordinates3d, FloatBuffer floatBuffer2) {
        nativeTransformCoordinates3dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates3d.nativeCode, floatBuffer2);
    }

    @Deprecated
    public void transformDisplayUvCoords(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!floatBuffer.isDirect() || !floatBuffer2.isDirect()) {
            throw new IllegalArgumentException("transformDisplayUvCoords currently requires direct buffers.");
        }
        nativeTransformDisplayUvCoords(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer, floatBuffer2);
    }

    Frame(Session session2) {
        this(session2, nativeCreateFrame(session2.nativeWrapperHandle));
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, float[] fArr, Coordinates2d coordinates2d2, float[] fArr2) {
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates2d2.nativeCode, fArr2);
    }

    public void transformCoordinates3d(Coordinates2d coordinates2d, float[] fArr, Coordinates3d coordinates3d, float[] fArr2) {
        nativeTransformCoordinates3dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates3d.nativeCode, fArr2);
    }

    Frame(Session session2, long j10) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public List<HitResult> hitTest(MotionEvent motionEvent) {
        return hitTest(motionEvent.getX(), motionEvent.getY());
    }

    public List<HitResult> hitTest(float[] fArr, int i10, float[] fArr2, int i11) {
        return convertNativeHitResultsToList(nativeHitTestRay(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10, fArr2, i11));
    }
}
