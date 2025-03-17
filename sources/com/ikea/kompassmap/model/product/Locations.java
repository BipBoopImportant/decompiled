package com.ikea.kompassmap.model.product;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ikea/kompassmap/model/product/Locations;", "", "salesLocations", "", "Lcom/ikea/kompassmap/model/product/SalesLocation;", "displayLocations", "Lcom/ikea/kompassmap/model/product/DisplayLocation;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSalesLocations", "()Ljava/util/List;", "getDisplayLocations", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Locations {
    public static final int $stable = 8;
    private final List<DisplayLocation> displayLocations;
    private final List<SalesLocation> salesLocations;

    public Locations(List<SalesLocation> list, List<DisplayLocation> list2) {
        C17542s.j(list, "salesLocations");
        C17542s.j(list2, "displayLocations");
        this.salesLocations = list;
        this.displayLocations = list2;
    }

    public static /* synthetic */ Locations copy$default(Locations locations, List<SalesLocation> list, List<DisplayLocation> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = locations.salesLocations;
        }
        if ((i10 & 2) != 0) {
            list2 = locations.displayLocations;
        }
        return locations.copy(list, list2);
    }

    public final List<SalesLocation> component1() {
        return this.salesLocations;
    }

    public final List<DisplayLocation> component2() {
        return this.displayLocations;
    }

    public final Locations copy(List<SalesLocation> list, List<DisplayLocation> list2) {
        C17542s.j(list, "salesLocations");
        C17542s.j(list2, "displayLocations");
        return new Locations(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Locations)) {
            return false;
        }
        Locations locations = (Locations) obj;
        return C17542s.e(this.salesLocations, locations.salesLocations) && C17542s.e(this.displayLocations, locations.displayLocations);
    }

    public final List<DisplayLocation> getDisplayLocations() {
        return this.displayLocations;
    }

    public final List<SalesLocation> getSalesLocations() {
        return this.salesLocations;
    }

    public int hashCode() {
        return (this.salesLocations.hashCode() * 31) + this.displayLocations.hashCode();
    }

    public String toString() {
        return "Locations(salesLocations=" + this.salesLocations + ", displayLocations=" + this.displayLocations + ')';
    }
}
