package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ikea/kompassmap/model/product/BusinessStructure;", "", "productAreaNo", "", "productAreaName", "productRangeAreaNo", "productRangeAreaName", "homeFurnishingBusinessNo", "homeFurnishingBusinessName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductAreaNo", "()Ljava/lang/String;", "getProductAreaName", "getProductRangeAreaNo", "getProductRangeAreaName", "getHomeFurnishingBusinessNo", "getHomeFurnishingBusinessName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BusinessStructure {
    public static final int $stable = 0;
    private final String homeFurnishingBusinessName;
    private final String homeFurnishingBusinessNo;
    private final String productAreaName;
    private final String productAreaNo;
    private final String productRangeAreaName;
    private final String productRangeAreaNo;

    public BusinessStructure(String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(str, "productAreaNo");
        C17542s.j(str2, "productAreaName");
        C17542s.j(str3, "productRangeAreaNo");
        C17542s.j(str4, "productRangeAreaName");
        C17542s.j(str5, "homeFurnishingBusinessNo");
        C17542s.j(str6, "homeFurnishingBusinessName");
        this.productAreaNo = str;
        this.productAreaName = str2;
        this.productRangeAreaNo = str3;
        this.productRangeAreaName = str4;
        this.homeFurnishingBusinessNo = str5;
        this.homeFurnishingBusinessName = str6;
    }

    public static /* synthetic */ BusinessStructure copy$default(BusinessStructure businessStructure, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = businessStructure.productAreaNo;
        }
        if ((i10 & 2) != 0) {
            str2 = businessStructure.productAreaName;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = businessStructure.productRangeAreaNo;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = businessStructure.productRangeAreaName;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = businessStructure.homeFurnishingBusinessNo;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = businessStructure.homeFurnishingBusinessName;
        }
        return businessStructure.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.productAreaNo;
    }

    public final String component2() {
        return this.productAreaName;
    }

    public final String component3() {
        return this.productRangeAreaNo;
    }

    public final String component4() {
        return this.productRangeAreaName;
    }

    public final String component5() {
        return this.homeFurnishingBusinessNo;
    }

    public final String component6() {
        return this.homeFurnishingBusinessName;
    }

    public final BusinessStructure copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(str, "productAreaNo");
        C17542s.j(str2, "productAreaName");
        C17542s.j(str3, "productRangeAreaNo");
        C17542s.j(str4, "productRangeAreaName");
        C17542s.j(str5, "homeFurnishingBusinessNo");
        C17542s.j(str6, "homeFurnishingBusinessName");
        return new BusinessStructure(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessStructure)) {
            return false;
        }
        BusinessStructure businessStructure = (BusinessStructure) obj;
        return C17542s.e(this.productAreaNo, businessStructure.productAreaNo) && C17542s.e(this.productAreaName, businessStructure.productAreaName) && C17542s.e(this.productRangeAreaNo, businessStructure.productRangeAreaNo) && C17542s.e(this.productRangeAreaName, businessStructure.productRangeAreaName) && C17542s.e(this.homeFurnishingBusinessNo, businessStructure.homeFurnishingBusinessNo) && C17542s.e(this.homeFurnishingBusinessName, businessStructure.homeFurnishingBusinessName);
    }

    public final String getHomeFurnishingBusinessName() {
        return this.homeFurnishingBusinessName;
    }

    public final String getHomeFurnishingBusinessNo() {
        return this.homeFurnishingBusinessNo;
    }

    public final String getProductAreaName() {
        return this.productAreaName;
    }

    public final String getProductAreaNo() {
        return this.productAreaNo;
    }

    public final String getProductRangeAreaName() {
        return this.productRangeAreaName;
    }

    public final String getProductRangeAreaNo() {
        return this.productRangeAreaNo;
    }

    public int hashCode() {
        return (((((((((this.productAreaNo.hashCode() * 31) + this.productAreaName.hashCode()) * 31) + this.productRangeAreaNo.hashCode()) * 31) + this.productRangeAreaName.hashCode()) * 31) + this.homeFurnishingBusinessNo.hashCode()) * 31) + this.homeFurnishingBusinessName.hashCode();
    }

    public String toString() {
        return "BusinessStructure(productAreaNo=" + this.productAreaNo + ", productAreaName=" + this.productAreaName + ", productRangeAreaNo=" + this.productRangeAreaNo + ", productRangeAreaName=" + this.productRangeAreaName + ", homeFurnishingBusinessNo=" + this.homeFurnishingBusinessNo + ", homeFurnishingBusinessName=" + this.homeFurnishingBusinessName + ')';
    }
}
