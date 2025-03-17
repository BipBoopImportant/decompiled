package com.ikea.kompassmap.model.store.map;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0007H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ikea/kompassmap/model/store/map/ExposedFloor;", "", "floorId", "", "name", "shortName", "ordinal", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFloorId", "()Ljava/lang/String;", "getName", "getShortName", "getOrdinal", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExposedFloor {
    public static final int $stable = 0;
    private final String floorId;
    private final String name;
    private final int ordinal;
    private final String shortName;

    public ExposedFloor(String str, String str2, String str3, int i10) {
        C17542s.j(str, "floorId");
        C17542s.j(str2, "name");
        C17542s.j(str3, "shortName");
        this.floorId = str;
        this.name = str2;
        this.shortName = str3;
        this.ordinal = i10;
    }

    public static /* synthetic */ ExposedFloor copy$default(ExposedFloor exposedFloor, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = exposedFloor.floorId;
        }
        if ((i11 & 2) != 0) {
            str2 = exposedFloor.name;
        }
        if ((i11 & 4) != 0) {
            str3 = exposedFloor.shortName;
        }
        if ((i11 & 8) != 0) {
            i10 = exposedFloor.ordinal;
        }
        return exposedFloor.copy(str, str2, str3, i10);
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

    public final ExposedFloor copy(String str, String str2, String str3, int i10) {
        C17542s.j(str, "floorId");
        C17542s.j(str2, "name");
        C17542s.j(str3, "shortName");
        return new ExposedFloor(str, str2, str3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposedFloor)) {
            return false;
        }
        ExposedFloor exposedFloor = (ExposedFloor) obj;
        return C17542s.e(this.floorId, exposedFloor.floorId) && C17542s.e(this.name, exposedFloor.name) && C17542s.e(this.shortName, exposedFloor.shortName) && this.ordinal == exposedFloor.ordinal;
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
        return (((((this.floorId.hashCode() * 31) + this.name.hashCode()) * 31) + this.shortName.hashCode()) * 31) + Integer.hashCode(this.ordinal);
    }

    public String toString() {
        return "ExposedFloor(floorId=" + this.floorId + ", name=" + this.name + ", shortName=" + this.shortName + ", ordinal=" + this.ordinal + ')';
    }
}
