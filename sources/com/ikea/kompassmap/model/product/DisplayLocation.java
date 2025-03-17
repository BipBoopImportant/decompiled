package com.ikea.kompassmap.model.product;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ikea/kompassmap/model/product/DisplayLocation;", "", "id", "", "floor", "Lcom/ikea/kompassmap/model/product/Name;", "division", "type", "department", "Lcom/ikea/kompassmap/model/product/Department;", "<init>", "(Ljava/lang/String;Lcom/ikea/kompassmap/model/product/Name;Lcom/ikea/kompassmap/model/product/Name;Ljava/lang/String;Lcom/ikea/kompassmap/model/product/Department;)V", "getId", "()Ljava/lang/String;", "getFloor", "()Lcom/ikea/kompassmap/model/product/Name;", "getDivision", "getType", "getDepartment", "()Lcom/ikea/kompassmap/model/product/Department;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisplayLocation {
    public static final int $stable = 0;
    private final Department department;
    private final Name division;
    private final Name floor;

    /* renamed from: id  reason: collision with root package name */
    private final String f69442id;
    private final String type;

    public DisplayLocation(String str, Name name, Name name2, String str2, Department department2) {
        C17542s.j(str, "id");
        C17542s.j(name, PlaceTypes.FLOOR);
        C17542s.j(name2, "division");
        C17542s.j(str2, "type");
        C17542s.j(department2, "department");
        this.f69442id = str;
        this.floor = name;
        this.division = name2;
        this.type = str2;
        this.department = department2;
    }

    public static /* synthetic */ DisplayLocation copy$default(DisplayLocation displayLocation, String str, Name name, Name name2, String str2, Department department2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = displayLocation.f69442id;
        }
        if ((i10 & 2) != 0) {
            name = displayLocation.floor;
        }
        Name name3 = name;
        if ((i10 & 4) != 0) {
            name2 = displayLocation.division;
        }
        Name name4 = name2;
        if ((i10 & 8) != 0) {
            str2 = displayLocation.type;
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            department2 = displayLocation.department;
        }
        return displayLocation.copy(str, name3, name4, str3, department2);
    }

    public final String component1() {
        return this.f69442id;
    }

    public final Name component2() {
        return this.floor;
    }

    public final Name component3() {
        return this.division;
    }

    public final String component4() {
        return this.type;
    }

    public final Department component5() {
        return this.department;
    }

    public final DisplayLocation copy(String str, Name name, Name name2, String str2, Department department2) {
        C17542s.j(str, "id");
        C17542s.j(name, PlaceTypes.FLOOR);
        C17542s.j(name2, "division");
        C17542s.j(str2, "type");
        C17542s.j(department2, "department");
        return new DisplayLocation(str, name, name2, str2, department2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayLocation)) {
            return false;
        }
        DisplayLocation displayLocation = (DisplayLocation) obj;
        return C17542s.e(this.f69442id, displayLocation.f69442id) && C17542s.e(this.floor, displayLocation.floor) && C17542s.e(this.division, displayLocation.division) && C17542s.e(this.type, displayLocation.type) && C17542s.e(this.department, displayLocation.department);
    }

    public final Department getDepartment() {
        return this.department;
    }

    public final Name getDivision() {
        return this.division;
    }

    public final Name getFloor() {
        return this.floor;
    }

    public final String getId() {
        return this.f69442id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.f69442id.hashCode() * 31) + this.floor.hashCode()) * 31) + this.division.hashCode()) * 31) + this.type.hashCode()) * 31) + this.department.hashCode();
    }

    public String toString() {
        return "DisplayLocation(id=" + this.f69442id + ", floor=" + this.floor + ", division=" + this.division + ", type=" + this.type + ", department=" + this.department + ')';
    }
}
