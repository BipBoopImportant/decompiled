package com.ingka.ikea.app.base;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/base/ProductKey;", "Ljava/io/Serializable;", "productNo", "", "productType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getProductNo", "()Ljava/lang/String;", "getProductType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class ProductKey implements Serializable {
    private final String productNo;
    private final String productType;

    public ProductKey(String str, String str2) {
        C17542s.j(str, "productNo");
        C17542s.j(str2, "productType");
        this.productNo = str;
        this.productType = str2;
    }

    public static /* synthetic */ ProductKey copy$default(ProductKey productKey, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productKey.productNo;
        }
        if ((i10 & 2) != 0) {
            str2 = productKey.productType;
        }
        return productKey.copy(str, str2);
    }

    public final String component1() {
        return this.productNo;
    }

    public final String component2() {
        return this.productType;
    }

    public final ProductKey copy(String str, String str2) {
        C17542s.j(str, "productNo");
        C17542s.j(str2, "productType");
        return new ProductKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductKey)) {
            return false;
        }
        ProductKey productKey = (ProductKey) obj;
        return C17542s.e(this.productNo, productKey.productNo) && C17542s.e(this.productType, productKey.productType);
    }

    public final String getProductNo() {
        return this.productNo;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return (this.productNo.hashCode() * 31) + this.productType.hashCode();
    }

    public String toString() {
        String str = this.productNo;
        String str2 = this.productType;
        return "ProductKey(productNo=" + str + ", productType=" + str2 + ")";
    }
}
