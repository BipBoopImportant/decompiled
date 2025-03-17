package com.sugarcube.app.base.data.model;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/model/FloorDetection;", "", "timeOutLimit", "", "timeToDetectFloor", "", "floorAnchorCreated", "", "poseAnchorCreated", "<init>", "(IFZZ)V", "getTimeOutLimit", "()I", "getTimeToDetectFloor", "()F", "getFloorAnchorCreated", "()Z", "getPoseAnchorCreated", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class FloorDetection {
    public static final int $stable = 0;
    private final boolean floorAnchorCreated;
    private final boolean poseAnchorCreated;
    private final int timeOutLimit;
    private final float timeToDetectFloor;

    public FloorDetection() {
        this(0, 0.0f, false, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FloorDetection copy$default(FloorDetection floorDetection, int i10, float f10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = floorDetection.timeOutLimit;
        }
        if ((i11 & 2) != 0) {
            f10 = floorDetection.timeToDetectFloor;
        }
        if ((i11 & 4) != 0) {
            z10 = floorDetection.floorAnchorCreated;
        }
        if ((i11 & 8) != 0) {
            z11 = floorDetection.poseAnchorCreated;
        }
        return floorDetection.copy(i10, f10, z10, z11);
    }

    public final int component1() {
        return this.timeOutLimit;
    }

    public final float component2() {
        return this.timeToDetectFloor;
    }

    public final boolean component3() {
        return this.floorAnchorCreated;
    }

    public final boolean component4() {
        return this.poseAnchorCreated;
    }

    public final FloorDetection copy(int i10, float f10, boolean z10, boolean z11) {
        return new FloorDetection(i10, f10, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloorDetection)) {
            return false;
        }
        FloorDetection floorDetection = (FloorDetection) obj;
        return this.timeOutLimit == floorDetection.timeOutLimit && Float.compare(this.timeToDetectFloor, floorDetection.timeToDetectFloor) == 0 && this.floorAnchorCreated == floorDetection.floorAnchorCreated && this.poseAnchorCreated == floorDetection.poseAnchorCreated;
    }

    public final boolean getFloorAnchorCreated() {
        return this.floorAnchorCreated;
    }

    public final boolean getPoseAnchorCreated() {
        return this.poseAnchorCreated;
    }

    public final int getTimeOutLimit() {
        return this.timeOutLimit;
    }

    public final float getTimeToDetectFloor() {
        return this.timeToDetectFloor;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.timeOutLimit) * 31) + Float.hashCode(this.timeToDetectFloor)) * 31) + Boolean.hashCode(this.floorAnchorCreated)) * 31) + Boolean.hashCode(this.poseAnchorCreated);
    }

    public String toString() {
        int i10 = this.timeOutLimit;
        float f10 = this.timeToDetectFloor;
        boolean z10 = this.floorAnchorCreated;
        boolean z11 = this.poseAnchorCreated;
        return "FloorDetection(timeOutLimit=" + i10 + ", timeToDetectFloor=" + f10 + ", floorAnchorCreated=" + z10 + ", poseAnchorCreated=" + z11 + ")";
    }

    public FloorDetection(int i10, float f10, boolean z10, boolean z11) {
        this.timeOutLimit = i10;
        this.timeToDetectFloor = f10;
        this.floorAnchorCreated = z10;
        this.poseAnchorCreated = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloorDetection(int i10, float f10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11);
    }
}
