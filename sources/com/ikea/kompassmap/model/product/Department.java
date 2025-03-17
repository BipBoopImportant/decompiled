package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ikea/kompassmap/model/product/Department;", "", "id", "", "name", "homeFurnishingBusinessNo", "grid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getHomeFurnishingBusinessNo", "getGrid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Department {
    public static final int $stable = 0;
    private final String grid;
    private final String homeFurnishingBusinessNo;

    /* renamed from: id  reason: collision with root package name */
    private final String f69441id;
    private final String name;

    public Department(String str, String str2, String str3, String str4) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(str3, "homeFurnishingBusinessNo");
        this.f69441id = str;
        this.name = str2;
        this.homeFurnishingBusinessNo = str3;
        this.grid = str4;
    }

    public static /* synthetic */ Department copy$default(Department department, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = department.f69441id;
        }
        if ((i10 & 2) != 0) {
            str2 = department.name;
        }
        if ((i10 & 4) != 0) {
            str3 = department.homeFurnishingBusinessNo;
        }
        if ((i10 & 8) != 0) {
            str4 = department.grid;
        }
        return department.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f69441id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.homeFurnishingBusinessNo;
    }

    public final String component4() {
        return this.grid;
    }

    public final Department copy(String str, String str2, String str3, String str4) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(str3, "homeFurnishingBusinessNo");
        return new Department(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Department)) {
            return false;
        }
        Department department = (Department) obj;
        return C17542s.e(this.f69441id, department.f69441id) && C17542s.e(this.name, department.name) && C17542s.e(this.homeFurnishingBusinessNo, department.homeFurnishingBusinessNo) && C17542s.e(this.grid, department.grid);
    }

    public final String getGrid() {
        return this.grid;
    }

    public final String getHomeFurnishingBusinessNo() {
        return this.homeFurnishingBusinessNo;
    }

    public final String getId() {
        return this.f69441id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = ((((this.f69441id.hashCode() * 31) + this.name.hashCode()) * 31) + this.homeFurnishingBusinessNo.hashCode()) * 31;
        String str = this.grid;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Department(id=" + this.f69441id + ", name=" + this.name + ", homeFurnishingBusinessNo=" + this.homeFurnishingBusinessNo + ", grid=" + this.grid + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Department(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
