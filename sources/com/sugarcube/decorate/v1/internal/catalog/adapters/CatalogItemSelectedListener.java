package com.sugarcube.decorate.v1.internal.catalog.adapters;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/adapters/CatalogItemSelectedListener;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LXH/N;", "onItemSelected", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "isLiked", "onItemLiked", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Z)V", "onItemDisclaimerClicked", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CatalogItemSelectedListener {
    void onItemDisclaimerClicked(CachedCatalogItem cachedCatalogItem);

    void onItemLiked(CachedCatalogItem cachedCatalogItem, boolean z10);

    void onItemSelected(CachedCatalogItem cachedCatalogItem);
}
