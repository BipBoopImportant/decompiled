package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.nio.FloatBuffer;
import java.util.Collection;

public class Plane extends TrackableBase {

    public enum Type {
        HORIZONTAL_UPWARD_FACING(0),
        HORIZONTAL_DOWNWARD_FACING(1),
        VERTICAL(2);
        
        final int nativeCode;

        private Type(int i10) {
            this.nativeCode = i10;
        }

        static Type forNumber(int i10) {
            for (Type type : values()) {
                if (type.nativeCode == i10) {
                    return type;
                }
            }
            throw new FatalException(O.b((byte) 46, i10, "Unexpected value for native Plane.Type, value="));
        }
    }

    protected Plane() {
        super(0, (Session) null);
    }

    private native long nativeAcquireSubsumedBy(long j10, long j11);

    private native Pose nativeGetCenterPose(long j10, long j11);

    private native float nativeGetExtentX(long j10, long j11);

    private native float nativeGetExtentZ(long j10, long j11);

    private native float[] nativeGetPolygon(long j10, long j11);

    private native int nativeGetType(long j10, long j11);

    private native boolean nativeIsPoseInExtents(long j10, long j11, Pose pose);

    private native boolean nativeIsPoseInPolygon(long j10, long j11, Pose pose);

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

    public FloatBuffer getPolygon() {
        return FloatBuffer.wrap(nativeGetPolygon(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Plane getSubsumedBy() {
        long nativeAcquireSubsumedBy = nativeAcquireSubsumedBy(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireSubsumedBy == 0) {
            return null;
        }
        return new Plane(nativeAcquireSubsumedBy, this.session);
    }

    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public Type getType() {
        return Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isPoseInExtents(Pose pose) {
        return nativeIsPoseInExtents(this.session.nativeWrapperHandle, this.nativeHandle, pose);
    }

    public boolean isPoseInPolygon(Pose pose) {
        return nativeIsPoseInPolygon(this.session.nativeWrapperHandle, this.nativeHandle, pose);
    }

    Plane(long j10, Session session) {
        super(j10, session);
    }
}
