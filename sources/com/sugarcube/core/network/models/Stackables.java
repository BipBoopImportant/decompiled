package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/core/network/models/Stackables;", "", "polygons", "", "Lcom/sugarcube/core/network/models/Polygon;", "alternates", "Lcom/sugarcube/core/network/models/StackableAlternate;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPolygons", "()Ljava/util/List;", "getAlternates", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class Stackables {
    private final List<StackableAlternate> alternates;
    private final List<Polygon> polygons;

    public Stackables() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Stackables copy$default(Stackables stackables, List<Polygon> list, List<StackableAlternate> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = stackables.polygons;
        }
        if ((i10 & 2) != 0) {
            list2 = stackables.alternates;
        }
        return stackables.copy(list, list2);
    }

    public final List<Polygon> component1() {
        return this.polygons;
    }

    public final List<StackableAlternate> component2() {
        return this.alternates;
    }

    public final Stackables copy(List<Polygon> list, List<StackableAlternate> list2) {
        return new Stackables(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stackables)) {
            return false;
        }
        Stackables stackables = (Stackables) obj;
        return C17542s.e(this.polygons, stackables.polygons) && C17542s.e(this.alternates, stackables.alternates);
    }

    public final List<StackableAlternate> getAlternates() {
        return this.alternates;
    }

    public final List<Polygon> getPolygons() {
        return this.polygons;
    }

    public int hashCode() {
        List<Polygon> list = this.polygons;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StackableAlternate> list2 = this.alternates;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<Polygon> list = this.polygons;
        List<StackableAlternate> list2 = this.alternates;
        return "Stackables(polygons=" + list + ", alternates=" + list2 + ")";
    }

    public Stackables(List<Polygon> list, List<StackableAlternate> list2) {
        this.polygons = list;
        this.alternates = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Stackables(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
