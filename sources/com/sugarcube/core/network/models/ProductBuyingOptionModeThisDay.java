package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/core/network/models/ProductBuyingOptionModeThisDay;", "", "messageType", "", "<init>", "(Ljava/lang/String;)V", "getMessageType", "()Ljava/lang/String;", "stockLevel", "Lcom/sugarcube/core/network/models/StockLevel;", "getStockLevel", "()Lcom/sugarcube/core/network/models/StockLevel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ProductBuyingOptionModeThisDay {
    private final String messageType;

    public ProductBuyingOptionModeThisDay() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductBuyingOptionModeThisDay copy$default(ProductBuyingOptionModeThisDay productBuyingOptionModeThisDay, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productBuyingOptionModeThisDay.messageType;
        }
        return productBuyingOptionModeThisDay.copy(str);
    }

    public final String component1() {
        return this.messageType;
    }

    public final ProductBuyingOptionModeThisDay copy(String str) {
        return new ProductBuyingOptionModeThisDay(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductBuyingOptionModeThisDay) && C17542s.e(this.messageType, ((ProductBuyingOptionModeThisDay) obj).messageType);
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final StockLevel getStockLevel() {
        String str = this.messageType;
        return C17542s.e(str, "HIGH_IN_STOCK") ? StockLevel.IN_STOCK : C17542s.e(str, "LOW_IN_STOCK") ? StockLevel.LOW_STOCK : StockLevel.OUT_OF_STOCK;
    }

    public int hashCode() {
        String str = this.messageType;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.messageType;
        return "ProductBuyingOptionModeThisDay(messageType=" + str + ")";
    }

    public ProductBuyingOptionModeThisDay(String str) {
        this.messageType = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductBuyingOptionModeThisDay(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
