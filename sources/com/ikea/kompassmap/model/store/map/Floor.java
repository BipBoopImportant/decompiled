package com.ikea.kompassmap.model.store.map;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.geojson.Feature;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\"\u001a\u00020\u0007H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ikea/kompassmap/model/store/map/Floor;", "", "floorId", "", "name", "shortName", "ordinal", "", "data", "", "Lorg/maplibre/geojson/Feature;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getFloorId", "()Ljava/lang/String;", "getName", "getShortName", "getOrdinal", "()I", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "toExposedFloor", "Lcom/ikea/kompassmap/model/store/map/ExposedFloor;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Floor {
    public static final int $stable = 8;
    private List<Feature> data;
    private final String floorId;
    private final String name;
    private final int ordinal;
    private final String shortName;

    public Floor(String str, String str2, String str3, int i10, List<Feature> list) {
        C17542s.j(str, "floorId");
        C17542s.j(str2, "name");
        C17542s.j(str3, "shortName");
        C17542s.j(list, "data");
        this.floorId = str;
        this.name = str2;
        this.shortName = str3;
        this.ordinal = i10;
        this.data = list;
    }

    public static /* synthetic */ Floor copy$default(Floor floor, String str, String str2, String str3, int i10, List<Feature> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = floor.floorId;
        }
        if ((i11 & 2) != 0) {
            str2 = floor.name;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = floor.shortName;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            i10 = floor.ordinal;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            list = floor.data;
        }
        return floor.copy(str, str4, str5, i12, list);
    }

    public final String component1() {
        return this.floorId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.shortName;
    }

    public final int component4() {
        return this.ordinal;
    }

    public final List<Feature> component5() {
        return this.data;
    }

    public final Floor copy(String str, String str2, String str3, int i10, List<Feature> list) {
        C17542s.j(str, "floorId");
        C17542s.j(str2, "name");
        C17542s.j(str3, "shortName");
        C17542s.j(list, "data");
        return new Floor(str, str2, str3, i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Floor)) {
            return false;
        }
        Floor floor = (Floor) obj;
        return C17542s.e(this.floorId, floor.floorId) && C17542s.e(this.name, floor.name) && C17542s.e(this.shortName, floor.shortName) && this.ordinal == floor.ordinal && C17542s.e(this.data, floor.data);
    }

    public final List<Feature> getData() {
        return this.data;
    }

    public final String getFloorId() {
        return this.floorId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        return (((((((this.floorId.hashCode() * 31) + this.name.hashCode()) * 31) + this.shortName.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + this.data.hashCode();
    }

    public final void setData(List<Feature> list) {
        C17542s.j(list, "<set-?>");
        this.data = list;
    }

    public final ExposedFloor toExposedFloor() {
        return new ExposedFloor(this.floorId, this.name, this.shortName, this.ordinal);
    }

    public String toString() {
        return "Floor(floorId=" + this.floorId + ", name=" + this.name + ", shortName=" + this.shortName + ", ordinal=" + this.ordinal + ", data=" + this.data + ')';
    }
}
