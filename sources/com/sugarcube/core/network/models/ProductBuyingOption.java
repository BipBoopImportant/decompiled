package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/core/network/models/ProductBuyingOption;", "", "homeDelivery", "Lcom/sugarcube/core/network/models/ProductBuyingOptionMode;", "cashCarry", "<init>", "(Lcom/sugarcube/core/network/models/ProductBuyingOptionMode;Lcom/sugarcube/core/network/models/ProductBuyingOptionMode;)V", "getHomeDelivery", "()Lcom/sugarcube/core/network/models/ProductBuyingOptionMode;", "getCashCarry", "homeDeliveryStockLevel", "Lcom/sugarcube/core/network/models/StockLevel;", "getHomeDeliveryStockLevel", "()Lcom/sugarcube/core/network/models/StockLevel;", "cashCarryStockLevel", "getCashCarryStockLevel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ProductBuyingOption {
    private final ProductBuyingOptionMode cashCarry;
    private final StockLevel cashCarryStockLevel;
    private final ProductBuyingOptionMode homeDelivery;
    private final StockLevel homeDeliveryStockLevel;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r2 = (r2 = (r2 = r2.getAvailability()).getProbability()).getThisDay();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductBuyingOption(com.sugarcube.core.network.models.ProductBuyingOptionMode r2, com.sugarcube.core.network.models.ProductBuyingOptionMode r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.homeDelivery = r2
            r1.cashCarry = r3
            r0 = 0
            if (r2 == 0) goto L_0x0021
            com.sugarcube.core.network.models.ProductBuyingOptionModeAvailability r2 = r2.getAvailability()
            if (r2 == 0) goto L_0x0021
            com.sugarcube.core.network.models.ProductBuyingOptionModeProbability r2 = r2.getProbability()
            if (r2 == 0) goto L_0x0021
            com.sugarcube.core.network.models.ProductBuyingOptionModeThisDay r2 = r2.getThisDay()
            if (r2 == 0) goto L_0x0021
            com.sugarcube.core.network.models.StockLevel r2 = r2.getStockLevel()
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            r1.homeDeliveryStockLevel = r2
            if (r3 == 0) goto L_0x003c
            com.sugarcube.core.network.models.ProductBuyingOptionModeAvailability r2 = r3.getAvailability()
            if (r2 == 0) goto L_0x003c
            com.sugarcube.core.network.models.ProductBuyingOptionModeProbability r2 = r2.getProbability()
            if (r2 == 0) goto L_0x003c
            com.sugarcube.core.network.models.ProductBuyingOptionModeThisDay r2 = r2.getThisDay()
            if (r2 == 0) goto L_0x003c
            com.sugarcube.core.network.models.StockLevel r0 = r2.getStockLevel()
        L_0x003c:
            r1.cashCarryStockLevel = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.ProductBuyingOption.<init>(com.sugarcube.core.network.models.ProductBuyingOptionMode, com.sugarcube.core.network.models.ProductBuyingOptionMode):void");
    }

    public static /* synthetic */ ProductBuyingOption copy$default(ProductBuyingOption productBuyingOption, ProductBuyingOptionMode productBuyingOptionMode, ProductBuyingOptionMode productBuyingOptionMode2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            productBuyingOptionMode = productBuyingOption.homeDelivery;
        }
        if ((i10 & 2) != 0) {
            productBuyingOptionMode2 = productBuyingOption.cashCarry;
        }
        return productBuyingOption.copy(productBuyingOptionMode, productBuyingOptionMode2);
    }

    public final ProductBuyingOptionMode component1() {
        return this.homeDelivery;
    }

    public final ProductBuyingOptionMode component2() {
        return this.cashCarry;
    }

    public final ProductBuyingOption copy(ProductBuyingOptionMode productBuyingOptionMode, ProductBuyingOptionMode productBuyingOptionMode2) {
        return new ProductBuyingOption(productBuyingOptionMode, productBuyingOptionMode2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBuyingOption)) {
            return false;
        }
        ProductBuyingOption productBuyingOption = (ProductBuyingOption) obj;
        return C17542s.e(this.homeDelivery, productBuyingOption.homeDelivery) && C17542s.e(this.cashCarry, productBuyingOption.cashCarry);
    }

    public final ProductBuyingOptionMode getCashCarry() {
        return this.cashCarry;
    }

    public final StockLevel getCashCarryStockLevel() {
        return this.cashCarryStockLevel;
    }

    public final ProductBuyingOptionMode getHomeDelivery() {
        return this.homeDelivery;
    }

    public final StockLevel getHomeDeliveryStockLevel() {
        return this.homeDeliveryStockLevel;
    }

    public int hashCode() {
        ProductBuyingOptionMode productBuyingOptionMode = this.homeDelivery;
        int i10 = 0;
        int hashCode = (productBuyingOptionMode == null ? 0 : productBuyingOptionMode.hashCode()) * 31;
        ProductBuyingOptionMode productBuyingOptionMode2 = this.cashCarry;
        if (productBuyingOptionMode2 != null) {
            i10 = productBuyingOptionMode2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        ProductBuyingOptionMode productBuyingOptionMode = this.homeDelivery;
        ProductBuyingOptionMode productBuyingOptionMode2 = this.cashCarry;
        return "ProductBuyingOption(homeDelivery=" + productBuyingOptionMode + ", cashCarry=" + productBuyingOptionMode2 + ")";
    }
}
