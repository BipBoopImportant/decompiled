package com.google.ar.core;

public class HitResult {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected HitResult() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    private native long nativeCreateAnchor(long j10, long j11);

    private static native void nativeDestroyHitResult(long j10, long j11);

    private native float nativeGetDistance(long j10, long j11);

    private native Pose nativeGetPose(long j10, long j11);

    public Anchor createAnchor() {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public boolean equals(Object obj) {
        return (obj instanceof HitResult) && ((HitResult) obj).nativeHandle == this.nativeHandle;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyHitResult(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public float getDistance() {
        return nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getHitPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Trackable getTrackable() {
        return this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* access modifiers changed from: package-private */
    public native long nativeAcquireTrackable(long j10, long j11);

    HitResult(long j10, Session session2) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
