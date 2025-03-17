package com.sugarcube.app.base.data.database;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/data/database/SalesDressedBedDataKey;", "", "size", "", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSize", "()Ljava/lang/String;", "setSize", "(Ljava/lang/String;)V", "getVariant", "setVariant", "fallbackVariantKey", "getFallbackVariantKey", "()Lcom/sugarcube/app/base/data/database/SalesDressedBedDataKey;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SalesDressedBedDataKey {
    public static final int $stable = 8;
    private String size;
    private String variant;

    public SalesDressedBedDataKey(String str, String str2) {
        C17542s.j(str, "size");
        C17542s.j(str2, "variant");
        this.size = str;
        this.variant = str2;
    }

    public static /* synthetic */ SalesDressedBedDataKey copy$default(SalesDressedBedDataKey salesDressedBedDataKey, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = salesDressedBedDataKey.size;
        }
        if ((i10 & 2) != 0) {
            str2 = salesDressedBedDataKey.variant;
        }
        return salesDressedBedDataKey.copy(str, str2);
    }

    public final String component1() {
        return this.size;
    }

    public final String component2() {
        return this.variant;
    }

    public final SalesDressedBedDataKey copy(String str, String str2) {
        C17542s.j(str, "size");
        C17542s.j(str2, "variant");
        return new SalesDressedBedDataKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalesDressedBedDataKey)) {
            return false;
        }
        SalesDressedBedDataKey salesDressedBedDataKey = (SalesDressedBedDataKey) obj;
        return C17542s.e(this.size, salesDressedBedDataKey.size) && C17542s.e(this.variant, salesDressedBedDataKey.variant);
    }

    public final SalesDressedBedDataKey getFallbackVariantKey() {
        return new SalesDressedBedDataKey(this.size, "other");
    }

    public final String getSize() {
        return this.size;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (this.size.hashCode() * 31) + this.variant.hashCode();
    }

    public final void setSize(String str) {
        C17542s.j(str, "<set-?>");
        this.size = str;
    }

    public final void setVariant(String str) {
        C17542s.j(str, "<set-?>");
        this.variant = str;
    }

    public String toString() {
        String str = this.size;
        String str2 = this.variant;
        return C15854t.P(str + "-" + str2, '_', '-', false, 4, (Object) null);
    }
}
