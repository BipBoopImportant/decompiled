package com.sugarcube.decorate_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\r\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0012\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "", "relativeFocusPosX", "", "relativeFocusPosY", "relativeFocusPosZ", "rotationNorm", "elevationNorm", "radiusNorm", "(FFFFFF)V", "isValid", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toPacked", "", "toPacked$decorate_engine_release", "toString", "", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlyCamOrbitParams {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final float kInvalidMemberValue = -3.4028235E38f;
    public float elevationNorm;
    public float radiusNorm;
    public float relativeFocusPosX;
    public float relativeFocusPosY;
    public float relativeFocusPosZ;
    public float rotationNorm;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate_engine/FlyCamOrbitParams$Companion;", "", "()V", "kInvalidMemberValue", "", "fromPacked", "Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "packed", "", "fromPacked$decorate_engine_release", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FlyCamOrbitParams fromPacked$decorate_engine_release(long[] jArr) {
            C17542s.j(jArr, "packed");
            FlyCamOrbitParams fromPackedOrbitParams = BridgeStructsUtil.fromPackedOrbitParams(jArr);
            C17542s.i(fromPackedOrbitParams, "fromPackedOrbitParams(...)");
            return fromPackedOrbitParams;
        }

        private Companion() {
        }
    }

    public FlyCamOrbitParams() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FlyCamOrbitParams copy$default(FlyCamOrbitParams flyCamOrbitParams, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = flyCamOrbitParams.relativeFocusPosX;
        }
        if ((i10 & 2) != 0) {
            f11 = flyCamOrbitParams.relativeFocusPosY;
        }
        float f16 = f11;
        if ((i10 & 4) != 0) {
            f12 = flyCamOrbitParams.relativeFocusPosZ;
        }
        float f17 = f12;
        if ((i10 & 8) != 0) {
            f13 = flyCamOrbitParams.rotationNorm;
        }
        float f18 = f13;
        if ((i10 & 16) != 0) {
            f14 = flyCamOrbitParams.elevationNorm;
        }
        float f19 = f14;
        if ((i10 & 32) != 0) {
            f15 = flyCamOrbitParams.radiusNorm;
        }
        return flyCamOrbitParams.copy(f10, f16, f17, f18, f19, f15);
    }

    public final float component1() {
        return this.relativeFocusPosX;
    }

    public final float component2() {
        return this.relativeFocusPosY;
    }

    public final float component3() {
        return this.relativeFocusPosZ;
    }

    public final float component4() {
        return this.rotationNorm;
    }

    public final float component5() {
        return this.elevationNorm;
    }

    public final float component6() {
        return this.radiusNorm;
    }

    public final FlyCamOrbitParams copy(float f10, float f11, float f12, float f13, float f14, float f15) {
        return new FlyCamOrbitParams(f10, f11, f12, f13, f14, f15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlyCamOrbitParams)) {
            return false;
        }
        FlyCamOrbitParams flyCamOrbitParams = (FlyCamOrbitParams) obj;
        return Float.compare(this.relativeFocusPosX, flyCamOrbitParams.relativeFocusPosX) == 0 && Float.compare(this.relativeFocusPosY, flyCamOrbitParams.relativeFocusPosY) == 0 && Float.compare(this.relativeFocusPosZ, flyCamOrbitParams.relativeFocusPosZ) == 0 && Float.compare(this.rotationNorm, flyCamOrbitParams.rotationNorm) == 0 && Float.compare(this.elevationNorm, flyCamOrbitParams.elevationNorm) == 0 && Float.compare(this.radiusNorm, flyCamOrbitParams.radiusNorm) == 0;
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.relativeFocusPosX) * 31) + Float.hashCode(this.relativeFocusPosY)) * 31) + Float.hashCode(this.relativeFocusPosZ)) * 31) + Float.hashCode(this.rotationNorm)) * 31) + Float.hashCode(this.elevationNorm)) * 31) + Float.hashCode(this.radiusNorm);
    }

    public final boolean isValid() {
        return (this.rotationNorm == -3.4028235E38f && this.elevationNorm == -3.4028235E38f && this.radiusNorm == -3.4028235E38f && this.relativeFocusPosX == -3.4028235E38f && this.relativeFocusPosY == -3.4028235E38f && this.relativeFocusPosZ == -3.4028235E38f) ? false : true;
    }

    public final long[] toPacked$decorate_engine_release() {
        long[] packedOrbitParams = BridgeStructsUtil.toPackedOrbitParams(this);
        C17542s.i(packedOrbitParams, "toPackedOrbitParams(...)");
        return packedOrbitParams;
    }

    public String toString() {
        float f10 = this.relativeFocusPosX;
        float f11 = this.relativeFocusPosY;
        float f12 = this.relativeFocusPosZ;
        float f13 = this.rotationNorm;
        float f14 = this.elevationNorm;
        float f15 = this.radiusNorm;
        return "FlyCamOrbitParams(relativeFocusPosX=" + f10 + ", relativeFocusPosY=" + f11 + ", relativeFocusPosZ=" + f12 + ", rotationNorm=" + f13 + ", elevationNorm=" + f14 + ", radiusNorm=" + f15 + ")";
    }

    public FlyCamOrbitParams(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.relativeFocusPosX = f10;
        this.relativeFocusPosY = f11;
        this.relativeFocusPosZ = f12;
        this.rotationNorm = f13;
        this.elevationNorm = f14;
        this.radiusNorm = f15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FlyCamOrbitParams(float r6, float r7, float r8, float r9, float r10, float r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r13 == 0) goto L_0x0009
            r13 = r0
            goto L_0x000a
        L_0x0009:
            r13 = r6
        L_0x000a:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0010
            r1 = r0
            goto L_0x0011
        L_0x0010:
            r1 = r7
        L_0x0011:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0017
            r2 = r0
            goto L_0x0018
        L_0x0017:
            r2 = r8
        L_0x0018:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001e
            r3 = r0
            goto L_0x001f
        L_0x001e:
            r3 = r9
        L_0x001f:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0025
            r4 = r0
            goto L_0x0026
        L_0x0025:
            r4 = r10
        L_0x0026:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002c
            r12 = r0
            goto L_0x002d
        L_0x002c:
            r12 = r11
        L_0x002d:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.FlyCamOrbitParams.<init>(float, float, float, float, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
