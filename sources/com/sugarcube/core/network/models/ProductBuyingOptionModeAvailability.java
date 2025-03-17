package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/core/network/models/ProductBuyingOptionModeAvailability;", "", "probability", "Lcom/sugarcube/core/network/models/ProductBuyingOptionModeProbability;", "updateDateTime", "", "<init>", "(Lcom/sugarcube/core/network/models/ProductBuyingOptionModeProbability;Ljava/lang/String;)V", "getProbability", "()Lcom/sugarcube/core/network/models/ProductBuyingOptionModeProbability;", "getUpdateDateTime", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ProductBuyingOptionModeAvailability {
    private final ProductBuyingOptionModeProbability probability;
    private final String updateDateTime;

    public ProductBuyingOptionModeAvailability() {
        this((ProductBuyingOptionModeProbability) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductBuyingOptionModeAvailability copy$default(ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability, ProductBuyingOptionModeProbability productBuyingOptionModeProbability, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            productBuyingOptionModeProbability = productBuyingOptionModeAvailability.probability;
        }
        if ((i10 & 2) != 0) {
            str = productBuyingOptionModeAvailability.updateDateTime;
        }
        return productBuyingOptionModeAvailability.copy(productBuyingOptionModeProbability, str);
    }

    public final ProductBuyingOptionModeProbability component1() {
        return this.probability;
    }

    public final String component2() {
        return this.updateDateTime;
    }

    public final ProductBuyingOptionModeAvailability copy(ProductBuyingOptionModeProbability productBuyingOptionModeProbability, String str) {
        return new ProductBuyingOptionModeAvailability(productBuyingOptionModeProbability, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBuyingOptionModeAvailability)) {
            return false;
        }
        ProductBuyingOptionModeAvailability productBuyingOptionModeAvailability = (ProductBuyingOptionModeAvailability) obj;
        return C17542s.e(this.probability, productBuyingOptionModeAvailability.probability) && C17542s.e(this.updateDateTime, productBuyingOptionModeAvailability.updateDateTime);
    }

    public final ProductBuyingOptionModeProbability getProbability() {
        return this.probability;
    }

    public final String getUpdateDateTime() {
        return this.updateDateTime;
    }

    public int hashCode() {
        ProductBuyingOptionModeProbability productBuyingOptionModeProbability = this.probability;
        int i10 = 0;
        int hashCode = (productBuyingOptionModeProbability == null ? 0 : productBuyingOptionModeProbability.hashCode()) * 31;
        String str = this.updateDateTime;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        ProductBuyingOptionModeProbability productBuyingOptionModeProbability = this.probability;
        String str = this.updateDateTime;
        return "ProductBuyingOptionModeAvailability(probability=" + productBuyingOptionModeProbability + ", updateDateTime=" + str + ")";
    }

    public ProductBuyingOptionModeAvailability(ProductBuyingOptionModeProbability productBuyingOptionModeProbability, String str) {
        this.probability = productBuyingOptionModeProbability;
        this.updateDateTime = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductBuyingOptionModeAvailability(ProductBuyingOptionModeProbability productBuyingOptionModeProbability, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : productBuyingOptionModeProbability, (i10 & 2) != 0 ? null : str);
    }
}
