package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R&\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/PlaneData;", "", "orientation", "", "", "distance", "category", "", "<init>", "(Ljava/util/List;DLjava/lang/String;)V", "getOrientation", "()Ljava/util/List;", "setOrientation", "(Ljava/util/List;)V", "getDistance", "()D", "setDistance", "(D)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PlaneData {
    private String category;
    private double distance;
    private List<? extends List<Double>> orientation;

    public PlaneData() {
        this((List) null, 0.0d, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PlaneData copy$default(PlaneData planeData, List<? extends List<Double>> list, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = planeData.orientation;
        }
        if ((i10 & 2) != 0) {
            d10 = planeData.distance;
        }
        if ((i10 & 4) != 0) {
            str = planeData.category;
        }
        return planeData.copy(list, d10, str);
    }

    public final List<List<Double>> component1() {
        return this.orientation;
    }

    public final double component2() {
        return this.distance;
    }

    public final String component3() {
        return this.category;
    }

    public final PlaneData copy(@e(name = "rot") List<? extends List<Double>> list, @e(name = "d") double d10, @e(name = "class") String str) {
        C17542s.j(list, "orientation");
        C17542s.j(str, "category");
        return new PlaneData(list, d10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaneData)) {
            return false;
        }
        PlaneData planeData = (PlaneData) obj;
        return C17542s.e(this.orientation, planeData.orientation) && Double.compare(this.distance, planeData.distance) == 0 && C17542s.e(this.category, planeData.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final List<List<Double>> getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        return (((this.orientation.hashCode() * 31) + Double.hashCode(this.distance)) * 31) + this.category.hashCode();
    }

    public final void setCategory(String str) {
        C17542s.j(str, "<set-?>");
        this.category = str;
    }

    public final void setDistance(double d10) {
        this.distance = d10;
    }

    public final void setOrientation(List<? extends List<Double>> list) {
        C17542s.j(list, "<set-?>");
        this.orientation = list;
    }

    public String toString() {
        List<? extends List<Double>> list = this.orientation;
        double d10 = this.distance;
        String str = this.category;
        return "PlaneData(orientation=" + list + ", distance=" + d10 + ", category=" + str + ")";
    }

    public PlaneData(@e(name = "rot") List<? extends List<Double>> list, @e(name = "d") double d10, @e(name = "class") String str) {
        C17542s.j(list, "orientation");
        C17542s.j(str, "category");
        this.orientation = list;
        this.distance = d10;
        this.category = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PlaneData(java.util.List r8, double r9, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r7 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0028
            java.util.ArrayList r8 = new java.util.ArrayList
            r13 = 3
            r8.<init>(r13)
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r13) goto L_0x0028
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r13)
            r5 = r2
        L_0x0016:
            if (r5 >= r13) goto L_0x0022
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x0016
        L_0x0022:
            r8.add(r4)
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0028:
            r13 = r12 & 2
            if (r13 == 0) goto L_0x002d
            r9 = r0
        L_0x002d:
            r12 = r12 & 4
            if (r12 == 0) goto L_0x0033
            java.lang.String r11 = ""
        L_0x0033:
            r7.<init>(r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.PlaneData.<init>(java.util.List, double, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
