package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

public class InstantPlacementPoint extends TrackableBase {

    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);
        
        final int nativeCode;

        private TrackingMethod(int i10) {
            this.nativeCode = i10;
        }

        static TrackingMethod fromNumber(int i10) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i10) {
                    return trackingMethod;
                }
            }
            throw new FatalException(O.b((byte) 77, i10, "Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value="));
        }
    }

    InstantPlacementPoint(long j10, Session session) {
        super(j10, session);
    }

    private native Pose nativeGetPose(long j10, long j11);

    private native int nativeGetTrackingMethod(long j10, long j11);

    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
