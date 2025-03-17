package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/core/network/models/ProductBuyingOptionModeProbability;", "", "thisDay", "Lcom/sugarcube/core/network/models/ProductBuyingOptionModeThisDay;", "<init>", "(Lcom/sugarcube/core/network/models/ProductBuyingOptionModeThisDay;)V", "getThisDay", "()Lcom/sugarcube/core/network/models/ProductBuyingOptionModeThisDay;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ProductBuyingOptionModeProbability {
    private final ProductBuyingOptionModeThisDay thisDay;

    public ProductBuyingOptionModeProbability() {
        this((ProductBuyingOptionModeThisDay) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductBuyingOptionModeProbability copy$default(ProductBuyingOptionModeProbability productBuyingOptionModeProbability, ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            productBuyingOptionModeThisDay = productBuyingOptionModeProbability.thisDay;
        }
        return productBuyingOptionModeProbability.copy(productBuyingOptionModeThisDay);
    }

    public final ProductBuyingOptionModeThisDay component1() {
        return this.thisDay;
    }

    public final ProductBuyingOptionModeProbability copy(ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay) {
        return new ProductBuyingOptionModeProbability(productBuyingOptionModeThisDay);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductBuyingOptionModeProbability) && C17542s.e(this.thisDay, ((ProductBuyingOptionModeProbability) obj).thisDay);
    }

    public final ProductBuyingOptionModeThisDay getThisDay() {
        return this.thisDay;
    }

    public int hashCode() {
        ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay = this.thisDay;
        if (productBuyingOptionModeThisDay == null) {
            return 0;
        }
        return productBuyingOptionModeThisDay.hashCode();
    }

    public String toString() {
        ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay = this.thisDay;
        return "ProductBuyingOptionModeProbability(thisDay=" + productBuyingOptionModeThisDay + ")";
    }

    public ProductBuyingOptionModeProbability(ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay) {
        this.thisDay = productBuyingOptionModeThisDay;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductBuyingOptionModeProbability(ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : productBuyingOptionModeThisDay);
    }
}
