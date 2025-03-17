package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/core/network/models/PosXYZ;", "", "x", "", "y", "z", "<init>", "(DDD)V", "getX", "()D", "getY", "getZ", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PosXYZ {

    /* renamed from: x  reason: collision with root package name */
    private final double f126078x;

    /* renamed from: y  reason: collision with root package name */
    private final double f126079y;

    /* renamed from: z  reason: collision with root package name */
    private final double f126080z;

    public PosXYZ() {
        this(0.0d, 0.0d, 0.0d, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PosXYZ copy$default(PosXYZ posXYZ, double d10, double d11, double d12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = posXYZ.f126078x;
        }
        double d13 = d10;
        if ((i10 & 2) != 0) {
            d11 = posXYZ.f126079y;
        }
        double d14 = d11;
        if ((i10 & 4) != 0) {
            d12 = posXYZ.f126080z;
        }
        return posXYZ.copy(d13, d14, d12);
    }

    public final double component1() {
        return this.f126078x;
    }

    public final double component2() {
        return this.f126079y;
    }

    public final double component3() {
        return this.f126080z;
    }

    public final PosXYZ copy(double d10, double d11, double d12) {
        return new PosXYZ(d10, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PosXYZ)) {
            return false;
        }
        PosXYZ posXYZ = (PosXYZ) obj;
        return Double.compare(this.f126078x, posXYZ.f126078x) == 0 && Double.compare(this.f126079y, posXYZ.f126079y) == 0 && Double.compare(this.f126080z, posXYZ.f126080z) == 0;
    }

    public final double getX() {
        return this.f126078x;
    }

    public final double getY() {
        return this.f126079y;
    }

    public final double getZ() {
        return this.f126080z;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f126078x) * 31) + Double.hashCode(this.f126079y)) * 31) + Double.hashCode(this.f126080z);
    }

    public String toString() {
        double d10 = this.f126078x;
        double d11 = this.f126079y;
        double d12 = this.f126080z;
        return "PosXYZ(x=" + d10 + ", y=" + d11 + ", z=" + d12 + ")";
    }

    public PosXYZ(double d10, double d11, double d12) {
        this.f126078x = d10;
        this.f126079y = d11;
        this.f126080z = d12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PosXYZ(double r7, double r9, double r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = r7
        L_0x0009:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x000f
            r4 = r0
            goto L_0x0010
        L_0x000f:
            r4 = r9
        L_0x0010:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0016
            r12 = r0
            goto L_0x0017
        L_0x0016:
            r12 = r11
        L_0x0017:
            r7 = r6
            r8 = r2
            r10 = r4
            r7.<init>(r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.PosXYZ.<init>(double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
