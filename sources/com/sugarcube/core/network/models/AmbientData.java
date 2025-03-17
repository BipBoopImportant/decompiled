package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/core/network/models/AmbientData;", "", "color", "", "", "intensity", "<init>", "(Ljava/util/List;D)V", "getColor", "()Ljava/util/List;", "setColor", "(Ljava/util/List;)V", "getIntensity", "()D", "setIntensity", "(D)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class AmbientData {
    private List<Double> color;
    private double intensity;

    public AmbientData() {
        this((List) null, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AmbientData copy$default(AmbientData ambientData, List<Double> list, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ambientData.color;
        }
        if ((i10 & 2) != 0) {
            d10 = ambientData.intensity;
        }
        return ambientData.copy(list, d10);
    }

    public final List<Double> component1() {
        return this.color;
    }

    public final double component2() {
        return this.intensity;
    }

    public final AmbientData copy(List<Double> list, double d10) {
        C17542s.j(list, "color");
        return new AmbientData(list, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmbientData)) {
            return false;
        }
        AmbientData ambientData = (AmbientData) obj;
        return C17542s.e(this.color, ambientData.color) && Double.compare(this.intensity, ambientData.intensity) == 0;
    }

    public final List<Double> getColor() {
        return this.color;
    }

    public final double getIntensity() {
        return this.intensity;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Double.hashCode(this.intensity);
    }

    public final void setColor(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.color = list;
    }

    public final void setIntensity(double d10) {
        this.intensity = d10;
    }

    public String toString() {
        List<Double> list = this.color;
        double d10 = this.intensity;
        return "AmbientData(color=" + list + ", intensity=" + d10 + ")";
    }

    public AmbientData(List<Double> list, double d10) {
        C17542s.j(list, "color");
        this.color = list;
        this.intensity = d10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AmbientData(java.util.List r5, double r6, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r4 = this;
            r9 = r8 & 1
            r0 = 0
            if (r9 == 0) goto L_0x0019
            java.util.ArrayList r5 = new java.util.ArrayList
            r9 = 3
            r5.<init>(r9)
            r2 = 0
        L_0x000d:
            if (r2 >= r9) goto L_0x0019
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            r5.add(r3)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0019:
            r8 = r8 & 2
            if (r8 == 0) goto L_0x001e
            r6 = r0
        L_0x001e:
            r4.<init>(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.AmbientData.<init>(java.util.List, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
