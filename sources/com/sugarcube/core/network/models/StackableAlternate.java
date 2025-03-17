package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/core/network/models/StackableAlternate;", "", "polygons", "", "Lcom/sugarcube/core/network/models/Polygon;", "<init>", "(Ljava/util/List;)V", "getPolygons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class StackableAlternate {
    private final List<Polygon> polygons;

    public StackableAlternate() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StackableAlternate copy$default(StackableAlternate stackableAlternate, List<Polygon> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = stackableAlternate.polygons;
        }
        return stackableAlternate.copy(list);
    }

    public final List<Polygon> component1() {
        return this.polygons;
    }

    public final StackableAlternate copy(List<Polygon> list) {
        return new StackableAlternate(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StackableAlternate) && C17542s.e(this.polygons, ((StackableAlternate) obj).polygons);
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

    public String toString() {
        List<Polygon> list = this.polygons;
        return "StackableAlternate(polygons=" + list + ")";
    }

    public StackableAlternate(List<Polygon> list) {
        this.polygons = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackableAlternate(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list);
    }
}
