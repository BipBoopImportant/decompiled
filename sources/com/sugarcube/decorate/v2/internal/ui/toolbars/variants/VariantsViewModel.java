package com.sugarcube.decorate.v2.internal.ui.toolbars.variants;

import XH.C16807N;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import kotlin.Metadata;
import lF.C14768a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "LXH/N;", "fetchVariants", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "", "price", "LlF/a;", "getFormattedPrice", "(F)LlF/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VariantsViewModel {
    Object fetchVariants(CachedCatalogItem cachedCatalogItem, C17164e<? super C16807N> eVar);

    C14768a getFormattedPrice(float f10);
}
