package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ikea/kompassmap/model/product/Price;", "", "currencyCode", "", "type", "priceInclTax", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "getCurrencyCode", "()Ljava/lang/String;", "getType", "getPriceInclTax", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Price {
    public static final int $stable = 0;
    private final String currencyCode;
    private final double priceInclTax;
    private final String type;

    public Price(String str, String str2, double d10) {
        C17542s.j(str, "currencyCode");
        C17542s.j(str2, "type");
        this.currencyCode = str;
        this.type = str2;
        this.priceInclTax = d10;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, String str2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = price.currencyCode;
        }
        if ((i10 & 2) != 0) {
            str2 = price.type;
        }
        if ((i10 & 4) != 0) {
            d10 = price.priceInclTax;
        }
        return price.copy(str, str2, d10);
    }

    public final String component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.type;
    }

    public final double component3() {
        return this.priceInclTax;
    }

    public final Price copy(String str, String str2, double d10) {
        C17542s.j(str, "currencyCode");
        C17542s.j(str2, "type");
        return new Price(str, str2, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return C17542s.e(this.currencyCode, price.currencyCode) && C17542s.e(this.type, price.type) && Double.compare(this.priceInclTax, price.priceInclTax) == 0;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final double getPriceInclTax() {
        return this.priceInclTax;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + this.type.hashCode()) * 31) + Double.hashCode(this.priceInclTax);
    }

    public String toString() {
        return "Price(currencyCode=" + this.currencyCode + ", type=" + this.type + ", priceInclTax=" + this.priceInclTax + ')';
    }
}
