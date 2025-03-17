package com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories;

import XH.x;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;", "", "", "categoryId", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "fetchItems-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchItems", "fetchMoreItems-gIAlu-s", "fetchMoreItems", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FetchCategoryItemsUseCase {
    /* renamed from: fetchItems-gIAlu-s  reason: not valid java name */
    Object m74fetchItemsgIAlus(String str, C17164e<? super x<? extends List<CachedCatalogItem>>> eVar);

    /* renamed from: fetchMoreItems-gIAlu-s  reason: not valid java name */
    Object m75fetchMoreItemsgIAlus(String str, C17164e<? super x<? extends List<CachedCatalogItem>>> eVar);
}
