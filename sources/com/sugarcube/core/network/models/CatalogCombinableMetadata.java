package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCombinableMetadata;", "", "selfMeta", "Lcom/sugarcube/core/network/models/CatalogCombinableSelfMeta;", "nodesMeta", "", "Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "<init>", "(Lcom/sugarcube/core/network/models/CatalogCombinableSelfMeta;Ljava/util/List;)V", "getSelfMeta", "()Lcom/sugarcube/core/network/models/CatalogCombinableSelfMeta;", "getNodesMeta", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogCombinableMetadata {
    private final List<CatalogCombinableNodeMeta> nodesMeta;
    private final CatalogCombinableSelfMeta selfMeta;

    public CatalogCombinableMetadata() {
        this((CatalogCombinableSelfMeta) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogCombinableMetadata copy$default(CatalogCombinableMetadata catalogCombinableMetadata, CatalogCombinableSelfMeta catalogCombinableSelfMeta, List<CatalogCombinableNodeMeta> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            catalogCombinableSelfMeta = catalogCombinableMetadata.selfMeta;
        }
        if ((i10 & 2) != 0) {
            list = catalogCombinableMetadata.nodesMeta;
        }
        return catalogCombinableMetadata.copy(catalogCombinableSelfMeta, list);
    }

    public final CatalogCombinableSelfMeta component1() {
        return this.selfMeta;
    }

    public final List<CatalogCombinableNodeMeta> component2() {
        return this.nodesMeta;
    }

    public final CatalogCombinableMetadata copy(CatalogCombinableSelfMeta catalogCombinableSelfMeta, List<CatalogCombinableNodeMeta> list) {
        return new CatalogCombinableMetadata(catalogCombinableSelfMeta, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCombinableMetadata)) {
            return false;
        }
        CatalogCombinableMetadata catalogCombinableMetadata = (CatalogCombinableMetadata) obj;
        return C17542s.e(this.selfMeta, catalogCombinableMetadata.selfMeta) && C17542s.e(this.nodesMeta, catalogCombinableMetadata.nodesMeta);
    }

    public final List<CatalogCombinableNodeMeta> getNodesMeta() {
        return this.nodesMeta;
    }

    public final CatalogCombinableSelfMeta getSelfMeta() {
        return this.selfMeta;
    }

    public int hashCode() {
        CatalogCombinableSelfMeta catalogCombinableSelfMeta = this.selfMeta;
        int i10 = 0;
        int hashCode = (catalogCombinableSelfMeta == null ? 0 : catalogCombinableSelfMeta.hashCode()) * 31;
        List<CatalogCombinableNodeMeta> list = this.nodesMeta;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        CatalogCombinableSelfMeta catalogCombinableSelfMeta = this.selfMeta;
        List<CatalogCombinableNodeMeta> list = this.nodesMeta;
        return "CatalogCombinableMetadata(selfMeta=" + catalogCombinableSelfMeta + ", nodesMeta=" + list + ")";
    }

    public CatalogCombinableMetadata(CatalogCombinableSelfMeta catalogCombinableSelfMeta, List<CatalogCombinableNodeMeta> list) {
        this.selfMeta = catalogCombinableSelfMeta;
        this.nodesMeta = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogCombinableMetadata(CatalogCombinableSelfMeta catalogCombinableSelfMeta, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : catalogCombinableSelfMeta, (i10 & 2) != 0 ? null : list);
    }
}
