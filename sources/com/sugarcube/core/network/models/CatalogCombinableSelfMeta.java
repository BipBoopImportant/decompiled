package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCombinableSelfMeta;", "", "size", "", "variant", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSize", "()Ljava/lang/String;", "getVariant", "getCategory", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogCombinableSelfMeta {
    private final String category;
    private final String size;
    private final String variant;

    public CatalogCombinableSelfMeta() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogCombinableSelfMeta copy$default(CatalogCombinableSelfMeta catalogCombinableSelfMeta, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogCombinableSelfMeta.size;
        }
        if ((i10 & 2) != 0) {
            str2 = catalogCombinableSelfMeta.variant;
        }
        if ((i10 & 4) != 0) {
            str3 = catalogCombinableSelfMeta.category;
        }
        return catalogCombinableSelfMeta.copy(str, str2, str3);
    }

    public final String component1() {
        return this.size;
    }

    public final String component2() {
        return this.variant;
    }

    public final String component3() {
        return this.category;
    }

    public final CatalogCombinableSelfMeta copy(String str, String str2, String str3) {
        return new CatalogCombinableSelfMeta(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCombinableSelfMeta)) {
            return false;
        }
        CatalogCombinableSelfMeta catalogCombinableSelfMeta = (CatalogCombinableSelfMeta) obj;
        return C17542s.e(this.size, catalogCombinableSelfMeta.size) && C17542s.e(this.variant, catalogCombinableSelfMeta.variant) && C17542s.e(this.category, catalogCombinableSelfMeta.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        String str = this.size;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variant;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.size;
        String str2 = this.variant;
        String str3 = this.category;
        return "CatalogCombinableSelfMeta(size=" + str + ", variant=" + str2 + ", category=" + str3 + ")";
    }

    public CatalogCombinableSelfMeta(String str, String str2, String str3) {
        this.size = str;
        this.variant = str2;
        this.category = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogCombinableSelfMeta(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
