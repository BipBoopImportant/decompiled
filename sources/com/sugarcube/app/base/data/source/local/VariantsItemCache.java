package com.sugarcube.app.base.data.source.local;

import com.sugarcube.core.network.models.CatalogItemVariants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/app/base/data/source/local/VariantsItemCache;", "", "<init>", "()V", "", "itemId", "Lcom/sugarcube/core/network/models/CatalogItemVariants;", "getItems", "(I)Lcom/sugarcube/core/network/models/CatalogItemVariants;", "items", "LXH/N;", "putItems", "(ILcom/sugarcube/core/network/models/CatalogItemVariants;)V", "clearCache", "", "cache", "Ljava/util/Map;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VariantsItemCache {
    public static final int $stable = 8;
    private final Map<Integer, CatalogItemVariants> cache = new LinkedHashMap();

    public final void clearCache() {
        this.cache.clear();
    }

    public final CatalogItemVariants getItems(int i10) {
        return this.cache.get(Integer.valueOf(i10));
    }

    public final void putItems(int i10, CatalogItemVariants catalogItemVariants) {
        C17542s.j(catalogItemVariants, "items");
        this.cache.put(Integer.valueOf(i10), catalogItemVariants);
    }
}
