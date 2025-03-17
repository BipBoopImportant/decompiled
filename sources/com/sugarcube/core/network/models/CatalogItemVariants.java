package com.sugarcube.core.network.models;

import YH.C16877v;
import YH.X;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogItemVariants;", "", "furnitures", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "variants", "", "", "Lcom/sugarcube/core/network/models/VariantType;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getFurnitures", "()Ljava/util/List;", "getVariants", "()Ljava/util/Map;", "categories", "Lcom/sugarcube/core/network/models/VariantCategory;", "getCategories", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogItemVariants {
    private final List<VariantCategory> categories;
    private final List<CatalogItem> furnitures;
    private final Map<String, VariantType> variants;

    public CatalogItemVariants() {
        this((List) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogItemVariants copy$default(CatalogItemVariants catalogItemVariants, List<CatalogItem> list, Map<String, VariantType> map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = catalogItemVariants.furnitures;
        }
        if ((i10 & 2) != 0) {
            map = catalogItemVariants.variants;
        }
        return catalogItemVariants.copy(list, map);
    }

    public final List<CatalogItem> component1() {
        return this.furnitures;
    }

    public final Map<String, VariantType> component2() {
        return this.variants;
    }

    public final CatalogItemVariants copy(@e(name = "furnitures") List<CatalogItem> list, @e(name = "variants") Map<String, VariantType> map) {
        return new CatalogItemVariants(list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogItemVariants)) {
            return false;
        }
        CatalogItemVariants catalogItemVariants = (CatalogItemVariants) obj;
        return C17542s.e(this.furnitures, catalogItemVariants.furnitures) && C17542s.e(this.variants, catalogItemVariants.variants);
    }

    public final List<VariantCategory> getCategories() {
        return this.categories;
    }

    public final List<CatalogItem> getFurnitures() {
        return this.furnitures;
    }

    public final Map<String, VariantType> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        List<CatalogItem> list = this.furnitures;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, VariantType> map = this.variants;
        if (map != null) {
            i10 = map.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<CatalogItem> list = this.furnitures;
        Map<String, VariantType> map = this.variants;
        return "CatalogItemVariants(furnitures=" + list + ", variants=" + map + ")";
    }

    public CatalogItemVariants(@e(name = "furnitures") List<CatalogItem> list, @e(name = "variants") Map<String, VariantType> map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.furnitures = list;
        this.variants = map;
        ArrayList arrayList3 = null;
        if (map != null) {
            ArrayList arrayList4 = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                VariantType variantType = (VariantType) next.getValue();
                String typeName = variantType.getTypeName();
                List<VariantValue> values = variantType.getValues();
                if (values != null) {
                    Iterable<VariantValue> iterable = values;
                    arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (VariantValue variantValue : iterable) {
                        String value = variantValue.getValue();
                        List<Integer> items = variantValue.getItems();
                        if (items != null) {
                            arrayList2 = new ArrayList();
                            for (Number intValue : items) {
                                int intValue2 = intValue.intValue();
                                List<CatalogItem> list2 = this.furnitures;
                                if (list2 != null) {
                                    for (CatalogItem catalogItem : list2) {
                                        Integer id2 = catalogItem.getId();
                                        if (id2 != null && id2.intValue() == intValue2) {
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                catalogItem = null;
                                if (catalogItem != null) {
                                    arrayList2.add(catalogItem);
                                }
                            }
                            continue;
                        } else {
                            arrayList2 = null;
                        }
                        arrayList.add(new VariantRepresentable(str, value, arrayList2));
                    }
                    continue;
                } else {
                    arrayList = null;
                }
                arrayList4.add(new VariantCategory(str, typeName, arrayList));
            }
            arrayList3 = arrayList4;
        }
        this.categories = arrayList3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogItemVariants(List list, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? X.j() : map);
    }
}
