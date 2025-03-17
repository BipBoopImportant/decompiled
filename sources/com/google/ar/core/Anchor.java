package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

public class Anchor {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10);
        
        final int nativeCode;

        private CloudAnchorState(int i10) {
            this.nativeCode = i10;
        }

        public static CloudAnchorState forNumber(int i10) {
            for (CloudAnchorState cloudAnchorState : values()) {
                if (cloudAnchorState.nativeCode == i10) {
                    return cloudAnchorState;
                }
            }
            throw new FatalException(O.b((byte) 52, i10, "Unexpected value for native CloudAnchorState, value="));
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    public enum RooftopAnchorState {
        NONE(0),
        SUCCESS(1),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_UNSUPPORTED_LOCATION(-3);
        
        final int nativeCode;

        private RooftopAnchorState(int i10) {
            this.nativeCode = i10;
        }

        public static RooftopAnchorState forNumber(int i10) {
            for (RooftopAnchorState rooftopAnchorState : values()) {
                if (rooftopAnchorState.nativeCode == i10) {
                    return rooftopAnchorState;
                }
            }
            throw new FatalException(O.b((byte) 54, i10, "Unexpected value for native RooftopAnchorState, value="));
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    public enum TerrainAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_UNSUPPORTED_LOCATION(-3);
        
        final int nativeCode;

        private TerrainAnchorState(int i10) {
            this.nativeCode = i10;
        }

        public static TerrainAnchorState forNumber(int i10) {
            for (TerrainAnchorState terrainAnchorState : values()) {
                if (terrainAnchorState.nativeCode == i10) {
                    return terrainAnchorState;
                }
            }
            throw new FatalException(O.b((byte) 54, i10, "Unexpected value for native TerrainAnchorState, value="));
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    protected Anchor() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    private native void nativeDetach(long j10, long j11);

    private native String nativeGetCloudAnchorId(long j10, long j11);

    private native int nativeGetCloudAnchorState(long j10, long j11);

    private native Pose nativeGetPose(long j10, long j11);

    private native int nativeGetTerrainAnchorState(long j10, long j11);

    private native int nativeGetTrackingState(long j10, long j11);

    static native void nativeReleaseAnchor(long j10, long j11);

    public void detach() {
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Anchor) && ((Anchor) obj).nativeHandle == this.nativeHandle;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseAnchor(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    @Deprecated
    public String getCloudAnchorId() {
        return nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public CloudAnchorState getCloudAnchorState() {
        return CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Deprecated
    public TerrainAnchorState getTerrainAnchorState() {
        return TerrainAnchorState.forNumber(nativeGetTerrainAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    Anchor(long j10, Session session2) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
