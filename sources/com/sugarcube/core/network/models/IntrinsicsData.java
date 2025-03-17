package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/core/network/models/IntrinsicsData;", "", "fx", "", "fy", "cx", "cy", "<init>", "(DDDD)V", "getFx", "()D", "setFx", "(D)V", "getFy", "setFy", "getCx", "setCx", "getCy", "setCy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class IntrinsicsData {

    /* renamed from: cx  reason: collision with root package name */
    private double f126068cx;

    /* renamed from: cy  reason: collision with root package name */
    private double f126069cy;

    /* renamed from: fx  reason: collision with root package name */
    private double f126070fx;

    /* renamed from: fy  reason: collision with root package name */
    private double f126071fy;

    public IntrinsicsData() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ IntrinsicsData copy$default(IntrinsicsData intrinsicsData, double d10, double d11, double d12, double d13, int i10, Object obj) {
        IntrinsicsData intrinsicsData2 = intrinsicsData;
        return intrinsicsData.copy((i10 & 1) != 0 ? intrinsicsData2.f126070fx : d10, (i10 & 2) != 0 ? intrinsicsData2.f126071fy : d11, (i10 & 4) != 0 ? intrinsicsData2.f126068cx : d12, (i10 & 8) != 0 ? intrinsicsData2.f126069cy : d13);
    }

    public final double component1() {
        return this.f126070fx;
    }

    public final double component2() {
        return this.f126071fy;
    }

    public final double component3() {
        return this.f126068cx;
    }

    public final double component4() {
        return this.f126069cy;
    }

    public final IntrinsicsData copy(@e(name = "m11") double d10, @e(name = "m22") double d11, @e(name = "m31") double d12, @e(name = "m32") double d13) {
        return new IntrinsicsData(d10, d11, d12, d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntrinsicsData)) {
            return false;
        }
        IntrinsicsData intrinsicsData = (IntrinsicsData) obj;
        return Double.compare(this.f126070fx, intrinsicsData.f126070fx) == 0 && Double.compare(this.f126071fy, intrinsicsData.f126071fy) == 0 && Double.compare(this.f126068cx, intrinsicsData.f126068cx) == 0 && Double.compare(this.f126069cy, intrinsicsData.f126069cy) == 0;
    }

    public final double getCx() {
        return this.f126068cx;
    }

    public final double getCy() {
        return this.f126069cy;
    }

    public final double getFx() {
        return this.f126070fx;
    }

    public final double getFy() {
        return this.f126071fy;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f126070fx) * 31) + Double.hashCode(this.f126071fy)) * 31) + Double.hashCode(this.f126068cx)) * 31) + Double.hashCode(this.f126069cy);
    }

    public final void setCx(double d10) {
        this.f126068cx = d10;
    }

    public final void setCy(double d10) {
        this.f126069cy = d10;
    }

    public final void setFx(double d10) {
        this.f126070fx = d10;
    }

    public final void setFy(double d10) {
        this.f126071fy = d10;
    }

    public String toString() {
        double d10 = this.f126070fx;
        double d11 = this.f126071fy;
        double d12 = this.f126068cx;
        double d13 = this.f126069cy;
        return "IntrinsicsData(fx=" + d10 + ", fy=" + d11 + ", cx=" + d12 + ", cy=" + d13 + ")";
    }

    public IntrinsicsData(@e(name = "m11") double d10, @e(name = "m22") double d11, @e(name = "m31") double d12, @e(name = "m32") double d13) {
        this.f126070fx = d10;
        this.f126071fy = d11;
        this.f126068cx = d12;
        this.f126069cy = d13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IntrinsicsData(double r10, double r12, double r14, double r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r10
        L_0x0009:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r12
        L_0x0010:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0016
            r7 = r1
            goto L_0x0017
        L_0x0016:
            r7 = r14
        L_0x0017:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = r16
        L_0x001e:
            r10 = r9
            r11 = r3
            r13 = r5
            r15 = r7
            r17 = r1
            r10.<init>(r11, r13, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.IntrinsicsData.<init>(double, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
