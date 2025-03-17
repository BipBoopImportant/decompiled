package com.sugarcube.core.network.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/core/network/models/VariantRepresentable;", "", "categoryKey", "", "name", "items", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategoryKey", "()Ljava/lang/String;", "getName", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VariantRepresentable {
    private final String categoryKey;
    private final List<CatalogItem> items;
    private final String name;

    public VariantRepresentable(String str, String str2, List<CatalogItem> list) {
        C17542s.j(str, "categoryKey");
        this.categoryKey = str;
        this.name = str2;
        this.items = list;
    }

    public static /* synthetic */ VariantRepresentable copy$default(VariantRepresentable variantRepresentable, String str, String str2, List<CatalogItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = variantRepresentable.categoryKey;
        }
        if ((i10 & 2) != 0) {
            str2 = variantRepresentable.name;
        }
        if ((i10 & 4) != 0) {
            list = variantRepresentable.items;
        }
        return variantRepresentable.copy(str, str2, list);
    }

    public final String component1() {
        return this.categoryKey;
    }

    public final String component2() {
        return this.name;
    }

    public final List<CatalogItem> component3() {
        return this.items;
    }

    public final VariantRepresentable copy(String str, String str2, List<CatalogItem> list) {
        C17542s.j(str, "categoryKey");
        return new VariantRepresentable(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantRepresentable)) {
            return false;
        }
        VariantRepresentable variantRepresentable = (VariantRepresentable) obj;
        return C17542s.e(this.categoryKey, variantRepresentable.categoryKey) && C17542s.e(this.name, variantRepresentable.name) && C17542s.e(this.items, variantRepresentable.items);
    }

    public final String getCategoryKey() {
        return this.categoryKey;
    }

    public final List<CatalogItem> getItems() {
        return this.items;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.categoryKey.hashCode() * 31;
        String str = this.name;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CatalogItem> list = this.items;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.categoryKey;
        String str2 = this.name;
        List<CatalogItem> list = this.items;
        return "VariantRepresentable(categoryKey=" + str + ", name=" + str2 + ", items=" + list + ")";
    }
}
