package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/core/network/models/ProductBuyingOptionMode;", "", "availability", "Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;", "<init>", "(Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;)V", "getAvailability", "()Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ProductBuyingOptionMode {
    private final ProductBuyingOptionModeAvailability availability;

    public ProductBuyingOptionMode(ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability) {
        this.availability = productBuyingOptionModeAvailability;
    }

    public static /* synthetic */ ProductBuyingOptionMode copy$default(ProductBuyingOptionMode productBuyingOptionMode, ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            productBuyingOptionModeAvailability = productBuyingOptionMode.availability;
        }
        return productBuyingOptionMode.copy(productBuyingOptionModeAvailability);
    }

    public final ProductBuyingOptionModeAvailability component1() {
        return this.availability;
    }

    public final ProductBuyingOptionMode copy(ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability) {
        return new ProductBuyingOptionMode(productBuyingOptionModeAvailability);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductBuyingOptionMode) && C17542s.e(this.availability, ((ProductBuyingOptionMode) obj).availability);
    }

    public final ProductBuyingOptionModeAvailability getAvailability() {
        return this.availability;
    }

    public int hashCode() {
        ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability = this.availability;
        if (productBuyingOptionModeAvailability == null) {
            return 0;
        }
        return productBuyingOptionModeAvailability.hashCode();
    }

    public String toString() {
        ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability = this.availability;
        return "ProductBuyingOptionMode(availability=" + productBuyingOptionModeAvailability + ")";
    }
}
