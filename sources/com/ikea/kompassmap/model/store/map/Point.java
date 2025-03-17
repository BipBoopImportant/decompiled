package com.ikea.kompassmap.model.store.map;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ikea/kompassmap/model/store/map/Point;", "", "type", "", "coordinates", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getCoordinates", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Point {
    public static final int $stable = 8;
    private final List<Double> coordinates;
    private final String type;

    public Point(String str, List<Double> list) {
        C17542s.j(str, "type");
        C17542s.j(list, "coordinates");
        this.type = str;
        this.coordinates = list;
    }

    public static /* synthetic */ Point copy$default(Point point, String str, List<Double> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = point.type;
        }
        if ((i10 & 2) != 0) {
            list = point.coordinates;
        }
        return point.copy(str, list);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Double> component2() {
        return this.coordinates;
    }

    public final Point copy(String str, List<Double> list) {
        C17542s.j(str, "type");
        C17542s.j(list, "coordinates");
        return new Point(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return C17542s.e(this.type, point.type) && C17542s.e(this.coordinates, point.coordinates);
    }

    public final List<Double> getCoordinates() {
        return this.coordinates;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.coordinates.hashCode();
    }

    public String toString() {
        return "Point(type=" + this.type + ", coordinates=" + this.coordinates + ')';
    }
}
