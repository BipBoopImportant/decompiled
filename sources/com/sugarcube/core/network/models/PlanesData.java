package com.sugarcube.core.network.models;

import YH.C16877v;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/network/models/PlanesData;", "", "planes", "", "Lcom/sugarcube/core/network/models/PlaneData;", "<init>", "(Ljava/util/List;)V", "getPlanes", "()Ljava/util/List;", "setPlanes", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PlanesData {
    private List<PlaneData> planes;

    public PlanesData() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PlanesData copy$default(PlanesData planesData, List<PlaneData> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = planesData.planes;
        }
        return planesData.copy(list);
    }

    public final List<PlaneData> component1() {
        return this.planes;
    }

    public final PlanesData copy(@e(name = "planeData") List<PlaneData> list) {
        C17542s.j(list, "planes");
        return new PlanesData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlanesData) && C17542s.e(this.planes, ((PlanesData) obj).planes);
    }

    public final List<PlaneData> getPlanes() {
        return this.planes;
    }

    public int hashCode() {
        return this.planes.hashCode();
    }

    public final void setPlanes(List<PlaneData> list) {
        C17542s.j(list, "<set-?>");
        this.planes = list;
    }

    public String toString() {
        List<PlaneData> list = this.planes;
        return "PlanesData(planes=" + list + ")";
    }

    public PlanesData(@e(name = "planeData") List<PlaneData> list) {
        C17542s.j(list, "planes");
        this.planes = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlanesData(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list);
    }
}
