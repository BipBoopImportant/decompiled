package com.ikea.kompassmap.model.product;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ikea/kompassmap/model/product/SalesPrices;", "", "currencyRank", "", "", "prices", "Lcom/ikea/kompassmap/model/product/Price;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCurrencyRank", "()Ljava/util/List;", "getPrices", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SalesPrices {
    public static final int $stable = 8;
    private final List<String> currencyRank;
    private final List<Price> prices;

    public SalesPrices(List<String> list, List<Price> list2) {
        C17542s.j(list, "currencyRank");
        C17542s.j(list2, "prices");
        this.currencyRank = list;
        this.prices = list2;
    }

    public static /* synthetic */ SalesPrices copy$default(SalesPrices salesPrices, List<String> list, List<Price> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = salesPrices.currencyRank;
        }
        if ((i10 & 2) != 0) {
            list2 = salesPrices.prices;
        }
        return salesPrices.copy(list, list2);
    }

    public final List<String> component1() {
        return this.currencyRank;
    }

    public final List<Price> component2() {
        return this.prices;
    }

    public final SalesPrices copy(List<String> list, List<Price> list2) {
        C17542s.j(list, "currencyRank");
        C17542s.j(list2, "prices");
        return new SalesPrices(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalesPrices)) {
            return false;
        }
        SalesPrices salesPrices = (SalesPrices) obj;
        return C17542s.e(this.currencyRank, salesPrices.currencyRank) && C17542s.e(this.prices, salesPrices.prices);
    }

    public final List<String> getCurrencyRank() {
        return this.currencyRank;
    }

    public final List<Price> getPrices() {
        return this.prices;
    }

    public int hashCode() {
        return (this.currencyRank.hashCode() * 31) + this.prices.hashCode();
    }

    public String toString() {
        return "SalesPrices(currencyRank=" + this.currencyRank + ", prices=" + this.prices + ')';
    }
}
