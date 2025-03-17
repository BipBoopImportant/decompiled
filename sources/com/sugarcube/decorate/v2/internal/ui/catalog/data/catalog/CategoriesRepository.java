package com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog;

import XH.x;
import com.sugarcube.core.network.models.CatalogCategory;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "", "LXH/x;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "fetchCatalogCategories-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "fetchCatalogCategories", "", "categoryId", "fetchSubcategoriesByCategory-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchSubcategoriesByCategory", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CategoriesRepository {
    /* renamed from: fetchCatalogCategories-IoAF18A  reason: not valid java name */
    Object m70fetchCatalogCategoriesIoAF18A(C17164e<? super x<? extends List<CatalogCategory>>> eVar);

    /* renamed from: fetchSubcategoriesByCategory-gIAlu-s  reason: not valid java name */
    Object m71fetchSubcategoriesByCategorygIAlus(String str, C17164e<? super x<? extends List<CatalogCategory>>> eVar);
}
