package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/core/network/models/CameraPerspective;", "", "aspectRatio", "", "yfov", "znear", "zfar", "cxyNormalized", "", "<init>", "(DDDDLjava/util/List;)V", "getAspectRatio", "()D", "getYfov", "getZnear", "getZfar", "getCxyNormalized", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CameraPerspective {
    private final double aspectRatio;
    private final List<Double> cxyNormalized;
    private final double yfov;
    private final double zfar;
    private final double znear;

    public CameraPerspective() {
        this(0.0d, 0.0d, 0.0d, 0.0d, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CameraPerspective copy$default(CameraPerspective cameraPerspective, double d10, double d11, double d12, double d13, List list, int i10, Object obj) {
        CameraPerspective cameraPerspective2 = cameraPerspective;
        return cameraPerspective.copy((i10 & 1) != 0 ? cameraPerspective2.aspectRatio : d10, (i10 & 2) != 0 ? cameraPerspective2.yfov : d11, (i10 & 4) != 0 ? cameraPerspective2.znear : d12, (i10 & 8) != 0 ? cameraPerspective2.zfar : d13, (i10 & 16) != 0 ? cameraPerspective2.cxyNormalized : list);
    }

    public final double component1() {
        return this.aspectRatio;
    }

    public final double component2() {
        return this.yfov;
    }

    public final double component3() {
        return this.znear;
    }

    public final double component4() {
        return this.zfar;
    }

    public final List<Double> component5() {
        return this.cxyNormalized;
    }

    public final CameraPerspective copy(double d10, double d11, double d12, double d13, List<Double> list) {
        List<Double> list2 = list;
        C17542s.j(list2, "cxyNormalized");
        return new CameraPerspective(d10, d11, d12, d13, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPerspective)) {
            return false;
        }
        CameraPerspective cameraPerspective = (CameraPerspective) obj;
        return Double.compare(this.aspectRatio, cameraPerspective.aspectRatio) == 0 && Double.compare(this.yfov, cameraPerspective.yfov) == 0 && Double.compare(this.znear, cameraPerspective.znear) == 0 && Double.compare(this.zfar, cameraPerspective.zfar) == 0 && C17542s.e(this.cxyNormalized, cameraPerspective.cxyNormalized);
    }

    public final double getAspectRatio() {
        return this.aspectRatio;
    }

    public final List<Double> getCxyNormalized() {
        return this.cxyNormalized;
    }

    public final double getYfov() {
        return this.yfov;
    }

    public final double getZfar() {
        return this.zfar;
    }

    public final double getZnear() {
        return this.znear;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.aspectRatio) * 31) + Double.hashCode(this.yfov)) * 31) + Double.hashCode(this.znear)) * 31) + Double.hashCode(this.zfar)) * 31) + this.cxyNormalized.hashCode();
    }

    public String toString() {
        double d10 = this.aspectRatio;
        double d11 = this.yfov;
        double d12 = this.znear;
        double d13 = this.zfar;
        List<Double> list = this.cxyNormalized;
        return "CameraPerspective(aspectRatio=" + d10 + ", yfov=" + d11 + ", znear=" + d12 + ", zfar=" + d13 + ", cxyNormalized=" + list + ")";
    }

    public CameraPerspective(double d10, double d11, double d12, double d13, List<Double> list) {
        C17542s.j(list, "cxyNormalized");
        this.aspectRatio = d10;
        this.yfov = d11;
        this.znear = d12;
        this.zfar = d13;
        this.cxyNormalized = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CameraPerspective(double r11, double r13, double r15, double r17, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20 & 1
            r1 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            if (r0 == 0) goto L_0x000c
            r4 = r1
            goto L_0x000d
        L_0x000c:
            r4 = r11
        L_0x000d:
            r0 = r20 & 2
            if (r0 == 0) goto L_0x0013
            r6 = r1
            goto L_0x0014
        L_0x0013:
            r6 = r13
        L_0x0014:
            r0 = r20 & 4
            if (r0 == 0) goto L_0x001a
            r8 = r1
            goto L_0x001b
        L_0x001a:
            r8 = r15
        L_0x001b:
            r0 = r20 & 8
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = r17
        L_0x0022:
            r0 = r20 & 16
            if (r0 == 0) goto L_0x002f
            java.lang.Double[] r0 = new java.lang.Double[]{r3, r3}
            java.util.List r0 = YH.C16877v.q(r0)
            goto L_0x0031
        L_0x002f:
            r0 = r19
        L_0x0031:
            r11 = r10
            r12 = r4
            r14 = r6
            r16 = r8
            r18 = r1
            r20 = r0
            r11.<init>(r12, r14, r16, r18, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CameraPerspective.<init>(double, double, double, double, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
