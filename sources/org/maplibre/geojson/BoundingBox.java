package org.maplibre.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import java.io.Serializable;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

@Keep
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    BoundingBox(Point point, Point point2) {
        if (point != null) {
            this.southwest = point;
            if (point2 != null) {
                this.northeast = point2;
                return;
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d10, double d11, double d12, double d13) {
        return fromLngLats(d10, d11, d12, d13);
    }

    public static BoundingBox fromJson(String str) {
        Class cls = BoundingBox.class;
        return (BoundingBox) new f().d(cls, new BoundingBoxTypeAdapter()).b().n(str, cls);
    }

    public static BoundingBox fromLngLats(double d10, double d11, double d12, double d13) {
        return new BoundingBox(Point.fromLngLat(d10, d11), Point.fromLngLat(d12, d13));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new BoundingBox(point, point2);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        return this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast());
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public final double north() {
        return northeast().latitude();
    }

    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        Class<BoundingBox> cls = BoundingBox.class;
        return new f().d(cls, new BoundingBoxTypeAdapter()).b().x(this, cls);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d10, double d11, double d12, double d13, double d14, double d15) {
        return fromLngLats(d10, d11, d12, d13, d14, d15);
    }

    public static BoundingBox fromLngLats(double d10, double d11, double d12, double d13, double d14, double d15) {
        return new BoundingBox(Point.fromLngLat(d10, d11, d12), Point.fromLngLat(d13, d14, d15));
    }
}
