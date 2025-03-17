package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Collection;

@UsedByNative("trackable_base_jni.cc")
class TrackableBase implements Trackable {
    long nativeHandle;
    protected final long nativeSymbolTableHandle;
    protected final Session session;

    TrackableBase(long j10, Session session2) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2 == null ? 0 : session2.nativeSymbolTableHandle;
    }

    static int internalGetType(long j10, long j11) {
        return nativeGetType(j10, j11);
    }

    static void internalReleaseNativeHandle(long j10, long j11) {
        nativeReleaseTrackable(j10, j11);
    }

    private native long nativeCreateAnchor(long j10, long j11, Pose pose);

    private native long[] nativeGetAnchors(long j10, long j11);

    private native int nativeGetTrackingState(long j10, long j11);

    private static native int nativeGetType(long j10, long j11);

    private static native void nativeReleaseTrackable(long j10, long j11);

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TrackableBase) && ((TrackableBase) obj).nativeHandle == this.nativeHandle;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseTrackable(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public Collection<Anchor> getAnchors() {
        return this.session.convertNativeAnchorsToCollection(nativeGetAnchors(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
