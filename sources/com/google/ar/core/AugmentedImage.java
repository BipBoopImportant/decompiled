package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

public class AugmentedImage extends TrackableBase {

    public enum TrackingMethod {
        NOT_TRACKING(0),
        FULL_TRACKING(1),
        LAST_KNOWN_POSE(2);
        
        final int nativeCode;

        private TrackingMethod(int i10) {
            this.nativeCode = i10;
        }

        static TrackingMethod forNumber(int i10) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i10) {
                    return trackingMethod;
                }
            }
            throw new FatalException(O.b((byte) 50, i10, "Unexpected value for native TrackingMethod, value="));
        }
    }

    AugmentedImage(long j10, Session session) {
        super(j10, session);
    }

    private native Pose nativeGetCenterPose(long j10, long j11);

    private native float nativeGetExtentX(long j10, long j11);

    private native float nativeGetExtentZ(long j10, long j11);

    private native int nativeGetIndex(long j10, long j11);

    private native String nativeGetName(long j10, long j11);

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

    public Pose getCenterPose() {
        return nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentX() {
        return nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentZ() {
        return nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getIndex() {
        return nativeGetIndex(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public String getName() {
        return nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.forNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
