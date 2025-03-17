package com.ikea.kompassmap.model.store.map;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.geojson.Point;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ikea/kompassmap/model/store/map/StoreMap;", "", "defaultFloor", "", "displayPoint", "Lorg/maplibre/geojson/Point;", "displayBearing", "", "floors", "", "Lcom/ikea/kompassmap/model/store/map/Floor;", "<init>", "(Ljava/lang/String;Lorg/maplibre/geojson/Point;DLjava/util/List;)V", "getDefaultFloor", "()Ljava/lang/String;", "getDisplayPoint", "()Lorg/maplibre/geojson/Point;", "getDisplayBearing", "()D", "getFloors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StoreMap {
    public static final int $stable = 8;
    private final String defaultFloor;
    private final double displayBearing;
    private final Point displayPoint;
    private final List<Floor> floors;

    public StoreMap(String str, Point point, double d10, List<Floor> list) {
        C17542s.j(str, "defaultFloor");
        C17542s.j(point, "displayPoint");
        C17542s.j(list, "floors");
        this.defaultFloor = str;
        this.displayPoint = point;
        this.displayBearing = d10;
        this.floors = list;
    }

    public static /* synthetic */ StoreMap copy$default(StoreMap storeMap, String str, Point point, double d10, List<Floor> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storeMap.defaultFloor;
        }
        if ((i10 & 2) != 0) {
            point = storeMap.displayPoint;
        }
        Point point2 = point;
        if ((i10 & 4) != 0) {
            d10 = storeMap.displayBearing;
        }
        double d11 = d10;
        if ((i10 & 8) != 0) {
            list = storeMap.floors;
        }
        return storeMap.copy(str, point2, d11, list);
    }

    public final String component1() {
        return this.defaultFloor;
    }

    public final Point component2() {
        return this.displayPoint;
    }

    public final double component3() {
        return this.displayBearing;
    }

    public final List<Floor> component4() {
        return this.floors;
    }

    public final StoreMap copy(String str, Point point, double d10, List<Floor> list) {
        C17542s.j(str, "defaultFloor");
        C17542s.j(point, "displayPoint");
        C17542s.j(list, "floors");
        return new StoreMap(str, point, d10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreMap)) {
            return false;
        }
        StoreMap storeMap = (StoreMap) obj;
        return C17542s.e(this.defaultFloor, storeMap.defaultFloor) && C17542s.e(this.displayPoint, storeMap.displayPoint) && Double.compare(this.displayBearing, storeMap.displayBearing) == 0 && C17542s.e(this.floors, storeMap.floors);
    }

    public final String getDefaultFloor() {
        return this.defaultFloor;
    }

    public final double getDisplayBearing() {
        return this.displayBearing;
    }

    public final Point getDisplayPoint() {
        return this.displayPoint;
    }

    public final List<Floor> getFloors() {
        return this.floors;
    }

    public int hashCode() {
        return (((((this.defaultFloor.hashCode() * 31) + this.displayPoint.hashCode()) * 31) + Double.hashCode(this.displayBearing)) * 31) + this.floors.hashCode();
    }

    public String toString() {
        return "StoreMap(defaultFloor=" + this.defaultFloor + ", displayPoint=" + this.displayPoint + ", displayBearing=" + this.displayBearing + ", floors=" + this.floors + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreMap(String str, Point point, double d10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, point, (i10 & 4) != 0 ? 0.0d : d10, list);
    }
}
