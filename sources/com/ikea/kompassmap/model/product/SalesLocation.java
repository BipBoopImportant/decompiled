package com.ikea.kompassmap.model.product;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jk\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020,H×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, d2 = {"Lcom/ikea/kompassmap/model/product/SalesLocation;", "", "id", "", "slid", "floor", "Lcom/ikea/kompassmap/model/product/Name;", "division", "type", "aisleAndBin", "Lcom/ikea/kompassmap/model/product/AisleAndBin;", "department", "Lcom/ikea/kompassmap/model/product/Department;", "coordinate", "areaLetter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ikea/kompassmap/model/product/Name;Lcom/ikea/kompassmap/model/product/Name;Ljava/lang/String;Lcom/ikea/kompassmap/model/product/AisleAndBin;Lcom/ikea/kompassmap/model/product/Department;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSlid", "getFloor", "()Lcom/ikea/kompassmap/model/product/Name;", "getDivision", "getType", "getAisleAndBin", "()Lcom/ikea/kompassmap/model/product/AisleAndBin;", "getDepartment", "()Lcom/ikea/kompassmap/model/product/Department;", "getCoordinate", "getAreaLetter", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SalesLocation {
    public static final int $stable = 0;
    private final AisleAndBin aisleAndBin;
    private final String areaLetter;
    private final String coordinate;
    private final Department department;
    private final Name division;
    private final Name floor;

    /* renamed from: id  reason: collision with root package name */
    private final String f69449id;
    private final String slid;
    private final String type;

    public SalesLocation(String str, String str2, Name name, Name name2, String str3, AisleAndBin aisleAndBin2, Department department2, String str4, String str5) {
        C17542s.j(str, "id");
        C17542s.j(str2, "slid");
        C17542s.j(name, PlaceTypes.FLOOR);
        C17542s.j(name2, "division");
        C17542s.j(str3, "type");
        this.f69449id = str;
        this.slid = str2;
        this.floor = name;
        this.division = name2;
        this.type = str3;
        this.aisleAndBin = aisleAndBin2;
        this.department = department2;
        this.coordinate = str4;
        this.areaLetter = str5;
    }

    public static /* synthetic */ SalesLocation copy$default(SalesLocation salesLocation, String str, String str2, Name name, Name name2, String str3, AisleAndBin aisleAndBin2, Department department2, String str4, String str5, int i10, Object obj) {
        SalesLocation salesLocation2 = salesLocation;
        int i11 = i10;
        return salesLocation.copy((i11 & 1) != 0 ? salesLocation2.f69449id : str, (i11 & 2) != 0 ? salesLocation2.slid : str2, (i11 & 4) != 0 ? salesLocation2.floor : name, (i11 & 8) != 0 ? salesLocation2.division : name2, (i11 & 16) != 0 ? salesLocation2.type : str3, (i11 & 32) != 0 ? salesLocation2.aisleAndBin : aisleAndBin2, (i11 & 64) != 0 ? salesLocation2.department : department2, (i11 & 128) != 0 ? salesLocation2.coordinate : str4, (i11 & 256) != 0 ? salesLocation2.areaLetter : str5);
    }

    public final String component1() {
        return this.f69449id;
    }

    public final String component2() {
        return this.slid;
    }

    public final Name component3() {
        return this.floor;
    }

    public final Name component4() {
        return this.division;
    }

    public final String component5() {
        return this.type;
    }

    public final AisleAndBin component6() {
        return this.aisleAndBin;
    }

    public final Department component7() {
        return this.department;
    }

    public final String component8() {
        return this.coordinate;
    }

    public final String component9() {
        return this.areaLetter;
    }

    public final SalesLocation copy(String str, String str2, Name name, Name name2, String str3, AisleAndBin aisleAndBin2, Department department2, String str4, String str5) {
        C17542s.j(str, "id");
        C17542s.j(str2, "slid");
        C17542s.j(name, PlaceTypes.FLOOR);
        C17542s.j(name2, "division");
        String str6 = str3;
        C17542s.j(str6, "type");
        return new SalesLocation(str, str2, name, name2, str6, aisleAndBin2, department2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalesLocation)) {
            return false;
        }
        SalesLocation salesLocation = (SalesLocation) obj;
        return C17542s.e(this.f69449id, salesLocation.f69449id) && C17542s.e(this.slid, salesLocation.slid) && C17542s.e(this.floor, salesLocation.floor) && C17542s.e(this.division, salesLocation.division) && C17542s.e(this.type, salesLocation.type) && C17542s.e(this.aisleAndBin, salesLocation.aisleAndBin) && C17542s.e(this.department, salesLocation.department) && C17542s.e(this.coordinate, salesLocation.coordinate) && C17542s.e(this.areaLetter, salesLocation.areaLetter);
    }

    public final AisleAndBin getAisleAndBin() {
        return this.aisleAndBin;
    }

    public final String getAreaLetter() {
        return this.areaLetter;
    }

    public final String getCoordinate() {
        return this.coordinate;
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
        return this.f69449id;
    }

    public final String getSlid() {
        return this.slid;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f69449id.hashCode() * 31) + this.slid.hashCode()) * 31) + this.floor.hashCode()) * 31) + this.division.hashCode()) * 31) + this.type.hashCode()) * 31;
        AisleAndBin aisleAndBin2 = this.aisleAndBin;
        int i10 = 0;
        int hashCode2 = (hashCode + (aisleAndBin2 == null ? 0 : aisleAndBin2.hashCode())) * 31;
        Department department2 = this.department;
        int hashCode3 = (hashCode2 + (department2 == null ? 0 : department2.hashCode())) * 31;
        String str = this.coordinate;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.areaLetter;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "SalesLocation(id=" + this.f69449id + ", slid=" + this.slid + ", floor=" + this.floor + ", division=" + this.division + ", type=" + this.type + ", aisleAndBin=" + this.aisleAndBin + ", department=" + this.department + ", coordinate=" + this.coordinate + ", areaLetter=" + this.areaLetter + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SalesLocation(java.lang.String r14, java.lang.String r15, com.ikea.kompassmap.model.product.Name r16, com.ikea.kompassmap.model.product.Name r17, java.lang.String r18, com.ikea.kompassmap.model.product.AisleAndBin r19, com.ikea.kompassmap.model.product.Department r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r19
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r20
        L_0x0013:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r21
        L_0x001b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0021
            r12 = r2
            goto L_0x0023
        L_0x0021:
            r12 = r22
        L_0x0023:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ikea.kompassmap.model.product.SalesLocation.<init>(java.lang.String, java.lang.String, com.ikea.kompassmap.model.product.Name, com.ikea.kompassmap.model.product.Name, java.lang.String, com.ikea.kompassmap.model.product.AisleAndBin, com.ikea.kompassmap.model.product.Department, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
