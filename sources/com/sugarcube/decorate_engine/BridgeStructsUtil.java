package com.sugarcube.decorate_engine;

import android.view.MotionEvent;

class BridgeStructsUtil {
    static final long k21Bits = 2097151;
    static final float k2Pi = 6.2831855f;
    static final long k7dot13FractionBits = 8191;
    static final long k7dot13WholeBits = 63;
    static final int kAbsPos = 1;
    static final int kAbsYaw = 2;
    static final int kApplyPhysics = 64;
    static final long[] kInvalidPackedOP = {-1, -1};
    static final long kInvalidPackedXF = 0;
    static final int kModelMirrored = 32;
    static final int kModelRolled90 = 8;
    static final int kPanoSpace = 128;
    static final int kSetModelMirror = 16;
    static final int kSetModelRoll = 4;
    static final float kToShort = 32768.0f;
    static final float kf20Bits = 1048575.0f;

    BridgeStructsUtil() {
    }

    static long floatNormToLong20(float f10) {
        return (long) (f10 * kf20Bits);
    }

    static long floatToLong7Dot13(float f10) {
        float abs = Math.abs(f10);
        float f11 = (float) ((long) abs);
        return ((long) ((abs - f11) * 8192.0f)) | ((f10 < 0.0f ? 1 : kInvalidPackedXF) << 19) | (((long) Math.min(f11, 63.0f)) << 13);
    }

    static FlyCamOrbitParams fromPackedOrbitParams(long[] jArr) {
        long[] jArr2 = kInvalidPackedOP;
        if ((jArr[0] | Long.MIN_VALUE) == jArr2[0] && (Long.MIN_VALUE | jArr[1]) == jArr2[1]) {
            return new FlyCamOrbitParams();
        }
        FlyCamOrbitParams flyCamOrbitParams = new FlyCamOrbitParams();
        long j10 = jArr[0];
        long j11 = (j10 >> 42) & k21Bits;
        long j12 = (j10 >> 21) & k21Bits;
        long j13 = j10 & k21Bits;
        long j14 = jArr[1];
        long j15 = (j14 >> 42) & k21Bits;
        long j16 = (j14 >> 21) & k21Bits;
        long j17 = j14 & k21Bits;
        if (j11 != k21Bits) {
            flyCamOrbitParams.rotationNorm = long20ToFloatNorm(j11);
        }
        if (j12 != k21Bits) {
            flyCamOrbitParams.elevationNorm = long20ToFloatNorm(j12);
        }
        if (j13 != k21Bits) {
            flyCamOrbitParams.radiusNorm = long20ToFloatNorm(j13);
        }
        if (j17 != k21Bits) {
            flyCamOrbitParams.relativeFocusPosX = long7Dot13ToFloat(j17);
        }
        if (j16 != k21Bits) {
            flyCamOrbitParams.relativeFocusPosY = long7Dot13ToFloat(j16);
        }
        if (j15 != k21Bits) {
            flyCamOrbitParams.relativeFocusPosZ = long7Dot13ToFloat(j15);
        }
        return flyCamOrbitParams;
    }

    static PanZoomRegion fromPackedRgn(long j10) {
        PanZoomRegion panZoomRegion = new PanZoomRegion();
        panZoomRegion._pixelCenter[0] = Float.valueOf((float) ((short) ((int) (j10 >> 48))));
        panZoomRegion._pixelCenter[1] = Float.valueOf((float) ((short) ((int) (j10 >> 32))));
        panZoomRegion.zoom = Float.intBitsToFloat((int) j10);
        return panZoomRegion;
    }

    static ModelScreenTransform fromPackedXform(long j10) {
        ModelScreenTransform modelScreenTransform = new ModelScreenTransform();
        if (j10 != kInvalidPackedXF) {
            modelScreenTransform.screenX = (float) ((short) ((int) (j10 >> 48)));
            modelScreenTransform.screenY = (float) ((short) ((int) (j10 >> 32)));
            modelScreenTransform.yawRadians = (((float) ((short) ((int) (j10 >> 16)))) / kToShort) * k2Pi;
            int i10 = (int) (j10 & 65535);
            boolean z10 = false;
            modelScreenTransform.isAbsolutePosition = (i10 & 1) != 0;
            modelScreenTransform.isAbsoluteYaw = (i10 & 2) != 0;
            modelScreenTransform.applyPhysics = (i10 & kApplyPhysics) != 0;
            if ((i10 & 4) != 0) {
                modelScreenTransform.isModelRolled90 = Boolean.valueOf((i10 & 8) != 0);
            } else {
                modelScreenTransform.isModelRolled90 = null;
            }
            if ((i10 & 16) != 0) {
                modelScreenTransform.isModelMirrored = Boolean.valueOf((i10 & kModelMirrored) != 0);
            } else {
                modelScreenTransform.isModelMirrored = null;
            }
            if ((i10 & kPanoSpace) != 0) {
                z10 = true;
            }
            modelScreenTransform.isPanoSpace = z10;
        }
        return modelScreenTransform;
    }

    static float long20ToFloatNorm(long j10) {
        return ((float) j10) / kf20Bits;
    }

    static float long7Dot13ToFloat(long j10) {
        return (((j10 >> 19) & 1) != kInvalidPackedXF ? -1.0f : 1.0f) * (((float) ((j10 >> 13) & k7dot13WholeBits)) + (((float) (j10 & k7dot13FractionBits)) / 8192.0f));
    }

    static long[] packDevInputEvent(MotionEvent motionEvent) {
        long[] jArr = {0, 0, 0};
        int min = Math.min(motionEvent.getPointerCount(), 4);
        jArr[0] = ((long) (motionEvent.getActionMasked() & 15)) | ((long) ((motionEvent.getActionIndex() & 15) << 4)) | ((long) ((min & 15) << 8));
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        for (int i10 = 0; i10 < min; i10++) {
            jArr[0] = jArr[0] | (((long) (motionEvent.getPointerId(i10) & 15)) << ((i10 + 3) * 4));
            motionEvent.getPointerCoords(i10, pointerCoords);
            int i11 = (i10 >> 1) + 1;
            jArr[i11] = (((((long) Math.round(pointerCoords.y * 2.0f)) & 65535) | ((((long) Math.round(pointerCoords.x * 2.0f)) & 65535) << 16)) << ((i10 & 1) * kModelMirrored)) | jArr[i11];
        }
        return jArr;
    }

    static long[] toPackedOrbitParams(FlyCamOrbitParams flyCamOrbitParams) {
        long j10;
        FlyCamOrbitParams flyCamOrbitParams2 = flyCamOrbitParams;
        if (!flyCamOrbitParams.isValid()) {
            return kInvalidPackedOP;
        }
        float f10 = flyCamOrbitParams2.rotationNorm;
        int i10 = (f10 > -3.4028235E38f ? 1 : (f10 == -3.4028235E38f ? 0 : -1));
        long j11 = k21Bits;
        if (i10 != 0) {
            float f11 = f10 - ((float) ((int) f10));
            if (f11 < 0.0f) {
                f11 += 1.0f;
            }
            j10 = floatNormToLong20(f11);
        } else {
            j10 = 2097151;
        }
        float f12 = flyCamOrbitParams2.elevationNorm;
        long floatNormToLong20 = f12 != -3.4028235E38f ? floatNormToLong20(Math.max(0.0f, Math.min(f12, 1.0f))) : 2097151;
        float f13 = flyCamOrbitParams2.radiusNorm;
        long floatNormToLong202 = f13 != -3.4028235E38f ? floatNormToLong20(Math.max(0.0f, Math.min(f13, 1.0f))) : 2097151;
        float f14 = flyCamOrbitParams2.relativeFocusPosX;
        long floatToLong7Dot13 = f14 != -3.4028235E38f ? floatToLong7Dot13(f14) : 2097151;
        float f15 = flyCamOrbitParams2.relativeFocusPosY;
        long floatToLong7Dot132 = f15 != -3.4028235E38f ? floatToLong7Dot13(f15) : 2097151;
        float f16 = flyCamOrbitParams2.relativeFocusPosZ;
        if (f16 != -3.4028235E38f) {
            j11 = floatToLong7Dot13(f16);
        }
        long[] jArr = {0, 0};
        jArr[0] = floatNormToLong202 | (j10 << 42) | (floatNormToLong20 << 21);
        jArr[1] = (j11 << 42) | (floatToLong7Dot132 << 21) | floatToLong7Dot13;
        return jArr;
    }

    static long toPackedRgn(PanZoomRegion panZoomRegion) {
        return ((((long) Math.round(panZoomRegion._pixelCenter[0].floatValue())) & 65535) << 48) | ((65535 & ((long) Math.round(panZoomRegion._pixelCenter[1].floatValue()))) << 32) | ((long) Float.floatToIntBits(panZoomRegion.zoom));
    }

    static long toPackedXform(ModelScreenTransform modelScreenTransform) {
        if (!modelScreenTransform.isValid()) {
            return kInvalidPackedXF;
        }
        long round = ((long) Math.round(modelScreenTransform.screenX)) & 65535;
        long round2 = ((long) Math.round(modelScreenTransform.screenY)) & 65535;
        long round3 = 65535 & ((long) Math.round(Math.signum(modelScreenTransform.yawRadians) * ((Math.abs(modelScreenTransform.yawRadians) / k2Pi) % 1.0f) * kToShort));
        char c10 = 0;
        boolean z10 = modelScreenTransform.isAbsolutePosition | (modelScreenTransform.isAbsoluteYaw ? (char) 2 : 0);
        Boolean bool = modelScreenTransform.isModelRolled90;
        boolean z11 = z10 | (bool != null ? (char) 4 : 0) | ((bool == null || !bool.booleanValue()) ? (char) 0 : 8);
        Boolean bool2 = modelScreenTransform.isModelMirrored;
        boolean z12 = z11 | (bool2 != null ? true : false) | ((bool2 == null || !bool2.booleanValue()) ? false : kModelMirrored) | (modelScreenTransform.applyPhysics ? '@' : 0);
        if (modelScreenTransform.isPanoSpace) {
            c10 = 128;
        }
        return (round << 48) | (round2 << 32) | (round3 << 16) | (z12 | c10 ? 1 : 0);
    }
}
