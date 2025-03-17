package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/network/models/PlanePolygonSet;", "", "polygons", "", "Lcom/sugarcube/core/network/models/Polygon;", "<init>", "(Ljava/util/List;)V", "getPolygons", "()Ljava/util/List;", "setPolygons", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PlanePolygonSet {
    private List<Polygon> polygons;

    public PlanePolygonSet() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PlanePolygonSet copy$default(PlanePolygonSet planePolygonSet, List<Polygon> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = planePolygonSet.polygons;
        }
        return planePolygonSet.copy(list);
    }

    public final List<Polygon> component1() {
        return this.polygons;
    }

    public final PlanePolygonSet copy(@e(name = "plane_polygons") List<Polygon> list) {
        return new PlanePolygonSet(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlanePolygonSet) && C17542s.e(this.polygons, ((PlanePolygonSet) obj).polygons);
    }

    public final List<Polygon> getPolygons() {
        return this.polygons;
    }

    public int hashCode() {
        List<Polygon> list = this.polygons;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setPolygons(List<Polygon> list) {
        this.polygons = list;
    }

    public String toString() {
        List<Polygon> list = this.polygons;
        return "PlanePolygonSet(polygons=" + list + ")";
    }

    public PlanePolygonSet(@e(name = "plane_polygons") List<Polygon> list) {
        this.polygons = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlanePolygonSet(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list);
    }
}
