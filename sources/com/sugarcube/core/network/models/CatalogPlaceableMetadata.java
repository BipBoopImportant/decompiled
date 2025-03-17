package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005HÆ\u0003JV\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "", "version", "", "anchors", "", "Lcom/sugarcube/core/network/models/PlaceableAnchor;", "stackables", "combinations", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnchors", "()Ljava/util/List;", "getStackables", "getCombinations", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogPlaceableMetadata {
    private final List<PlaceableAnchor> anchors;
    private final List<List<Integer>> combinations;
    private final List<Integer> stackables;
    private final Integer version;

    public CatalogPlaceableMetadata() {
        this((Integer) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogPlaceableMetadata copy$default(CatalogPlaceableMetadata catalogPlaceableMetadata, Integer num, List<PlaceableAnchor> list, List<Integer> list2, List<List<Integer>> list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = catalogPlaceableMetadata.version;
        }
        if ((i10 & 2) != 0) {
            list = catalogPlaceableMetadata.anchors;
        }
        if ((i10 & 4) != 0) {
            list2 = catalogPlaceableMetadata.stackables;
        }
        if ((i10 & 8) != 0) {
            list3 = catalogPlaceableMetadata.combinations;
        }
        return catalogPlaceableMetadata.copy(num, list, list2, list3);
    }

    public final Integer component1() {
        return this.version;
    }

    public final List<PlaceableAnchor> component2() {
        return this.anchors;
    }

    public final List<Integer> component3() {
        return this.stackables;
    }

    public final List<List<Integer>> component4() {
        return this.combinations;
    }

    public final CatalogPlaceableMetadata copy(Integer num, List<PlaceableAnchor> list, List<Integer> list2, List<? extends List<Integer>> list3) {
        return new CatalogPlaceableMetadata(num, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPlaceableMetadata)) {
            return false;
        }
        CatalogPlaceableMetadata catalogPlaceableMetadata = (CatalogPlaceableMetadata) obj;
        return C17542s.e(this.version, catalogPlaceableMetadata.version) && C17542s.e(this.anchors, catalogPlaceableMetadata.anchors) && C17542s.e(this.stackables, catalogPlaceableMetadata.stackables) && C17542s.e(this.combinations, catalogPlaceableMetadata.combinations);
    }

    public final List<PlaceableAnchor> getAnchors() {
        return this.anchors;
    }

    public final List<List<Integer>> getCombinations() {
        return this.combinations;
    }

    public final List<Integer> getStackables() {
        return this.stackables;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PlaceableAnchor> list = this.anchors;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.stackables;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<List<Integer>> list3 = this.combinations;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Integer num = this.version;
        List<PlaceableAnchor> list = this.anchors;
        List<Integer> list2 = this.stackables;
        List<List<Integer>> list3 = this.combinations;
        return "CatalogPlaceableMetadata(version=" + num + ", anchors=" + list + ", stackables=" + list2 + ", combinations=" + list3 + ")";
    }

    public CatalogPlaceableMetadata(Integer num, List<PlaceableAnchor> list, List<Integer> list2, List<? extends List<Integer>> list3) {
        this.version = num;
        this.anchors = list;
        this.stackables = list2;
        this.combinations = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogPlaceableMetadata(Integer num, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }
}
