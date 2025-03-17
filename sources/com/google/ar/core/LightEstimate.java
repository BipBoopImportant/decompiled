package com.google.ar.core;

import android.media.Image;
import com.google.ar.core.exceptions.FatalException;

public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public enum State {
        NOT_VALID(0),
        VALID(1);
        
        final int nativeCode;

        private State(int i10) {
            this.nativeCode = i10;
        }

        static State forNumber(int i10) {
            for (State state : values()) {
                if (state.nativeCode == i10) {
                    return state;
                }
            }
            throw new FatalException(O.b((byte) 55, i10, "Unexpected value for native LightEstimate.State, value="));
        }
    }

    protected LightEstimate() {
        this.nativeHandle = 0;
        this.session = null;
        this.nativeSymbolTableHandle = 0;
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j10, long j11);

    private static native long nativeCreateLightEstimate(long j10);

    private static native void nativeDestroyLightEstimate(long j10, long j11);

    private native void nativeGetColorCorrection(long j10, long j11, float[] fArr, int i10);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j10, long j11, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j10, long j11, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j10, long j11, float[] fArr);

    private native float nativeGetPixelIntensity(long j10, long j11);

    private native int nativeGetState(long j10, long j11);

    private native long nativeGetTimestamp(long j10, long j11);

    public Image[] acquireEnvironmentalHdrCubeMap() {
        long[] nativeAcquireEnvironmentalHdrCubeMap = nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle);
        ArImage[] arImageArr = new ArImage[nativeAcquireEnvironmentalHdrCubeMap.length];
        for (int i10 = 0; i10 < nativeAcquireEnvironmentalHdrCubeMap.length; i10++) {
            arImageArr[i10] = new ArImage(this.session, nativeAcquireEnvironmentalHdrCubeMap[i10]);
        }
        return arImageArr;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public void getColorCorrection(float[] fArr, int i10) {
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float getPixelIntensity() {
        return nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public State getState() {
        return State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    LightEstimate(Session session2) {
        this.nativeHandle = 0;
        this.session = session2;
        this.nativeHandle = nativeCreateLightEstimate(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
