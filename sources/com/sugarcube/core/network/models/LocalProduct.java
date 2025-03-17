package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/network/models/LocalProduct;", "", "localItemNumber", "", "thumbUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalItemNumber", "()Ljava/lang/String;", "getThumbUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class LocalProduct {
    private final String localItemNumber;
    private final String thumbUrl;

    public LocalProduct() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LocalProduct copy$default(LocalProduct localProduct, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localProduct.localItemNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = localProduct.thumbUrl;
        }
        return localProduct.copy(str, str2);
    }

    public final String component1() {
        return this.localItemNumber;
    }

    public final String component2() {
        return this.thumbUrl;
    }

    public final LocalProduct copy(String str, String str2) {
        return new LocalProduct(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalProduct)) {
            return false;
        }
        LocalProduct localProduct = (LocalProduct) obj;
        return C17542s.e(this.localItemNumber, localProduct.localItemNumber) && C17542s.e(this.thumbUrl, localProduct.thumbUrl);
    }

    public final String getLocalItemNumber() {
        return this.localItemNumber;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public int hashCode() {
        String str = this.localItemNumber;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thumbUrl;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.localItemNumber;
        String str2 = this.thumbUrl;
        return "LocalProduct(localItemNumber=" + str + ", thumbUrl=" + str2 + ")";
    }

    public LocalProduct(String str, String str2) {
        this.localItemNumber = str;
        this.thumbUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalProduct(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
