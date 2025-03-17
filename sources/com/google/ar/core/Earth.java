package com.google.ar.core;

import com.google.ar.core.Anchor;
import com.google.ar.core.ResolveAnchorOnRooftopFuture;
import com.google.ar.core.ResolveAnchorOnTerrainFuture;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;
import java.util.function.BiConsumer;

public class Earth extends TrackableBase {

    public enum EarthState {
        ENABLED(0),
        ERROR_INTERNAL(-1),
        ERROR_GEOSPATIAL_MODE_DISABLED(-2),
        ERROR_NOT_AUTHORIZED(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_APK_VERSION_TOO_OLD(-5);
        
        final int nativeCode;

        private EarthState(int i10) {
            this.nativeCode = i10;
        }

        static EarthState forNumber(int i10) {
            for (EarthState earthState : values()) {
                if (earthState.nativeCode == i10) {
                    return earthState;
                }
            }
            throw new FatalException(O.b((byte) 46, i10, "Unexpected value for native EarthState, value="));
        }
    }

    Earth(long j10, Session session) {
        super(j10, session);
    }

    private native long nativeCreateAnchor(long j10, long j11, double d10, double d11, double d12, float f10, float f11, float f12, float f13);

    private native long nativeGetCameraGeospatialPose(long j10, long j11);

    private native int nativeGetEarthState(long j10, long j11);

    private native long nativeGetGeospatialPose(long j10, long j11, Pose pose);

    private native Pose nativeGetPose(long j10, long j11, double d10, double d11, double d12, float f10, float f11, float f12, float f13);

    private native int nativeGetTrackingState(long j10, long j11);

    private native void nativeReleaseEarth(long j10, long j11);

    private native long[] nativeResolveAnchorOnRooftopAsync(long j10, long j11, double d10, double d11, double d12, float f10, float f11, float f12, float f13, ResolveAnchorOnRooftopFuture.CallbackWrapper callbackWrapper);

    private native long nativeResolveAnchorOnTerrain(long j10, long j11, double d10, double d11, double d12, float f10, float f11, float f12, float f13);

    private native long[] nativeResolveAnchorOnTerrainAsync(long j10, long j11, double d10, double d11, double d12, float f10, float f11, float f12, float f13, ResolveAnchorOnTerrainFuture.CallbackWrapper callbackWrapper);

    public Anchor createAnchor(double d10, double d11, double d12, float f10, float f11, float f12, float f13) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d10, d11, d12, f10, f11, f12, f13), this.session);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseEarth(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public GeospatialPose getCameraGeospatialPose() {
        return new GeospatialPose(nativeGetCameraGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public EarthState getEarthState() {
        return EarthState.forNumber(nativeGetEarthState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public GeospatialPose getGeospatialPose(Pose pose) {
        return new GeospatialPose(nativeGetGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public Pose getPose(double d10, double d11, double d12, float f10, float f11, float f12, float f13) {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle, d10, d11, d12, f10, f11, f12, f13);
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public ResolveAnchorOnRooftopFuture resolveAnchorOnRooftopAsync(double d10, double d11, double d12, float f10, float f11, float f12, float f13, BiConsumer<Anchor, Anchor.RooftopAnchorState> biConsumer) {
        BiConsumer<Anchor, Anchor.RooftopAnchorState> biConsumer2 = biConsumer;
        long[] nativeResolveAnchorOnRooftopAsync = nativeResolveAnchorOnRooftopAsync(this.session.nativeWrapperHandle, this.nativeHandle, d10, d11, d12, f10, f11, f12, f13, biConsumer2 != null ? new ResolveAnchorOnRooftopFuture.CallbackWrapper(this.session, biConsumer2) : null);
        return new ResolveAnchorOnRooftopFuture(this.session, nativeResolveAnchorOnRooftopAsync[0], nativeResolveAnchorOnRooftopAsync[1]);
    }

    @Deprecated
    public Anchor resolveAnchorOnTerrain(double d10, double d11, double d12, float f10, float f11, float f12, float f13) {
        return new Anchor(nativeResolveAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d10, d11, d12, f10, f11, f12, f13), this.session);
    }

    public ResolveAnchorOnTerrainFuture resolveAnchorOnTerrainAsync(double d10, double d11, double d12, float f10, float f11, float f12, float f13, BiConsumer<Anchor, Anchor.TerrainAnchorState> biConsumer) {
        BiConsumer<Anchor, Anchor.TerrainAnchorState> biConsumer2 = biConsumer;
        long[] nativeResolveAnchorOnTerrainAsync = nativeResolveAnchorOnTerrainAsync(this.session.nativeWrapperHandle, this.nativeHandle, d10, d11, d12, f10, f11, f12, f13, biConsumer2 != null ? new ResolveAnchorOnTerrainFuture.CallbackWrapper(this.session, biConsumer2) : null);
        return new ResolveAnchorOnTerrainFuture(this.session, nativeResolveAnchorOnTerrainAsync[0], nativeResolveAnchorOnTerrainAsync[1]);
    }

    public Anchor createAnchor(double d10, double d11, double d12, float[] fArr) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d10, d11, d12, fArr[0], fArr[1], fArr[2], fArr[3]), this.session);
    }

    @Deprecated
    public Anchor createAnchor(Pose pose) {
        throw new IllegalArgumentException("Earth does not support createAnchor using a Pose. Use createAnchor with Geospatial coordinates instead.");
    }
}
