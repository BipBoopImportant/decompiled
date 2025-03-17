package com.google.ar.core;

import android.util.Range;
import android.util.Size;
import com.google.ar.core.exceptions.FatalException;
import java.util.EnumSet;

public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        private DepthSensorUsage(int i10) {
            this.nativeCode = i10;
        }

        static EnumSet<DepthSensorUsage> forBitFlags(int i10) {
            EnumSet<DepthSensorUsage> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            for (DepthSensorUsage depthSensorUsage : values()) {
                if ((depthSensorUsage.nativeCode & i10) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        static DepthSensorUsage forNumber(int i10) {
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i10) {
                    return depthSensorUsage;
                }
            }
            throw new FatalException(O.b((byte) 52, i10, "Unexpected value for native DepthSensorUsage, value="));
        }
    }

    public enum FacingDirection {
        BACK(0),
        FRONT(1);
        
        final int nativeCode;

        private FacingDirection(int i10) {
            this.nativeCode = i10;
        }

        static FacingDirection forNumber(int i10) {
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i10) {
                    return facingDirection;
                }
            }
            throw new FatalException(O.b((byte) 51, i10, "Unexpected value for native FacingDirection, value="));
        }
    }

    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        private StereoCameraUsage(int i10) {
            this.nativeCode = i10;
        }

        static EnumSet<StereoCameraUsage> forBitFlags(int i10) {
            EnumSet<StereoCameraUsage> noneOf = EnumSet.noneOf(StereoCameraUsage.class);
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if ((stereoCameraUsage.nativeCode & i10) != 0) {
                    noneOf.add(stereoCameraUsage);
                }
            }
            return noneOf;
        }

        static StereoCameraUsage forNumber(int i10) {
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if (stereoCameraUsage.nativeCode == i10) {
                    return stereoCameraUsage;
                }
            }
            throw new FatalException(O.b((byte) 53, i10, "Unexpected value for native StereoCameraUsage, value="));
        }
    }

    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);
        
        final int nativeCode;

        private TargetFps(int i10) {
            this.nativeCode = i10;
        }

        static EnumSet<TargetFps> forBitFlags(int i10) {
            EnumSet<TargetFps> noneOf = EnumSet.noneOf(TargetFps.class);
            for (TargetFps targetFps : values()) {
                if ((targetFps.nativeCode & i10) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }
    }

    protected CameraConfig() {
        this.session = null;
        this.nativeHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    private static native void nativeDestroyCameraConfig(long j10, long j11);

    private native String nativeGetCameraId(long j10, long j11);

    private native int nativeGetDepthSensorUsage(long j10, long j11);

    private native int nativeGetFacingDirection(long j10, long j11);

    private native void nativeGetFpsRange(long j10, long j11, int[] iArr);

    private native void nativeGetImageDimensions(long j10, long j11, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j10, long j11);

    private native void nativeGetTextureDimensions(long j10, long j11, int[] iArr);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j10);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Range<Integer> getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public StereoCameraUsage getStereoCameraUsage() {
        return StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    CameraConfig(Session session2, long j10) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
