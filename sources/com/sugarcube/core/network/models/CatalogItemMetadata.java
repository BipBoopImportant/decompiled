package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogItemMetadata;", "", "combinables", "Lcom/sugarcube/core/network/models/CatalogCombinableMetadata;", "placeables", "Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "<init>", "(Lcom/sugarcube/core/network/models/CatalogCombinableMetadata;Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;)V", "getCombinables", "()Lcom/sugarcube/core/network/models/CatalogCombinableMetadata;", "getPlaceables", "()Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogItemMetadata {
    private final CatalogCombinableMetadata combinables;
    private final CatalogPlaceableMetadata placeables;

    public CatalogItemMetadata() {
        this((CatalogCombinableMetadata) null, (CatalogPlaceableMetadata) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogItemMetadata copy$default(CatalogItemMetadata catalogItemMetadata, CatalogCombinableMetadata catalogCombinableMetadata, CatalogPlaceableMetadata catalogPlaceableMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            catalogCombinableMetadata = catalogItemMetadata.combinables;
        }
        if ((i10 & 2) != 0) {
            catalogPlaceableMetadata = catalogItemMetadata.placeables;
        }
        return catalogItemMetadata.copy(catalogCombinableMetadata, catalogPlaceableMetadata);
    }

    public final CatalogCombinableMetadata component1() {
        return this.combinables;
    }

    public final CatalogPlaceableMetadata component2() {
        return this.placeables;
    }

    public final CatalogItemMetadata copy(CatalogCombinableMetadata catalogCombinableMetadata, CatalogPlaceableMetadata catalogPlaceableMetadata) {
        return new CatalogItemMetadata(catalogCombinableMetadata, catalogPlaceableMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogItemMetadata)) {
            return false;
        }
        CatalogItemMetadata catalogItemMetadata = (CatalogItemMetadata) obj;
        return C17542s.e(this.combinables, catalogItemMetadata.combinables) && C17542s.e(this.placeables, catalogItemMetadata.placeables);
    }

    public final CatalogCombinableMetadata getCombinables() {
        return this.combinables;
    }

    public final CatalogPlaceableMetadata getPlaceables() {
        return this.placeables;
    }

    public int hashCode() {
        CatalogCombinableMetadata catalogCombinableMetadata = this.combinables;
        int i10 = 0;
        int hashCode = (catalogCombinableMetadata == null ? 0 : catalogCombinableMetadata.hashCode()) * 31;
        CatalogPlaceableMetadata catalogPlaceableMetadata = this.placeables;
        if (catalogPlaceableMetadata != null) {
            i10 = catalogPlaceableMetadata.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        CatalogCombinableMetadata catalogCombinableMetadata = this.combinables;
        CatalogPlaceableMetadata catalogPlaceableMetadata = this.placeables;
        return "CatalogItemMetadata(combinables=" + catalogCombinableMetadata + ", placeables=" + catalogPlaceableMetadata + ")";
    }

    public CatalogItemMetadata(CatalogCombinableMetadata catalogCombinableMetadata, CatalogPlaceableMetadata catalogPlaceableMetadata) {
        this.combinables = catalogCombinableMetadata;
        this.placeables = catalogPlaceableMetadata;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogItemMetadata(CatalogCombinableMetadata catalogCombinableMetadata, CatalogPlaceableMetadata catalogPlaceableMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : catalogCombinableMetadata, (i10 & 2) != 0 ? null : catalogPlaceableMetadata);
    }
}
