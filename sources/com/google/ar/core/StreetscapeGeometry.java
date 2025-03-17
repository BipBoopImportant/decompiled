package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

public class StreetscapeGeometry extends TrackableBase {

    public enum Quality {
        NONE(0),
        BUILDING_LOD_1(1),
        BUILDING_LOD_2(2);
        
        final int nativeCode;

        private Quality(int i10) {
            this.nativeCode = i10;
        }

        static Quality forNumber(int i10) {
            for (Quality quality : values()) {
                if (quality.nativeCode == i10) {
                    return quality;
                }
            }
            throw new FatalException(O.b((byte) 63, i10, "Unexpected value for native StreetscapeGeometry.Quality, value="));
        }
    }

    public enum Type {
        TERRAIN(0),
        BUILDING(1);
        
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
            throw new FatalException(O.b((byte) 60, i10, "Unexpected value for native StreetscapeGeometry.Type, value="));
        }
    }

    StreetscapeGeometry(long j10, Session session) {
        super(j10, session);
    }

    private native long nativeAcquireMesh(long j10, long j11);

    private native Pose nativeGetMeshPose(long j10, long j11);

    private native int nativeGetQuality(long j10, long j11);

    private native int nativeGetType(long j10, long j11);

    private native void nativeReleaseStreetscapeGeometry(long j10, long j11);

    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseStreetscapeGeometry(this.session.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Mesh getMesh() {
        long nativeAcquireMesh = nativeAcquireMesh(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireMesh != 0) {
            return new Mesh(nativeAcquireMesh, this.session);
        }
        return null;
    }

    public Pose getMeshPose() {
        return nativeGetMeshPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Quality getQuality() {
        return Quality.forNumber(nativeGetQuality(this.session.nativeWrapperHandle, this.nativeHandle));
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
}
