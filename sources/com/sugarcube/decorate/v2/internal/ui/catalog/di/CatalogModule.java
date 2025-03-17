package com.sugarcube.decorate.v2.internal.ui.catalog.di;

import YG.m;
import aH.C17026a;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.GoesWellWithRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.RecentSearchRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.SearchSuggestionsRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoriesUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoriesUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoryItemsUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModel;
import com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantsViewModel;
import com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository;
import kotlin.Metadata;
import oG.C17687a;
import oG.C17688b;
import oG.C17689c;
import oG.C17690d;
import qG.C17772a;
import qG.C17773b;
import qG.C17774c;
import qG.C17775d;
import uG.C18049m;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020-H'¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/di/CatalogModule;", "", "LoG/c;", "configRepository", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;", "bindRecentSearchRepository", "(LoG/c;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;", "LoG/d;", "autocompleteClient", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/SearchSuggestionsRepository;", "bindSearchSuggestionsRepository", "(LoG/d;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/SearchSuggestionsRepository;", "LoG/a;", "impl", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "bindCategoriesRepository", "(LoG/a;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "LqG/a;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoriesUseCase;", "bindFetchCategoriesUseCase", "(LqG/a;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoriesUseCase;", "LqG/c;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoriesUseCase;", "bindFetchSubCategoriesUseCase", "(LqG/c;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoriesUseCase;", "LqG/b;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;", "bindFetchCategoryItemsUseCase", "(LqG/b;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;", "LqG/d;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoryItemsUseCase;", "bindFetchSubCategoryItemsUseCase", "(LqG/d;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoryItemsUseCase;", "LoG/b;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/GoesWellWithRepository;", "bindGoesWellWithRepository", "(LoG/b;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/GoesWellWithRepository;", "LaH/a;", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "bindCatalogRepository", "(LaH/a;)Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "LuG/m;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/catalog/browse/BrowseViewModel;", "bindBrowseViewModel", "(LuG/m;)Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/catalog/browse/BrowseViewModel;", "LYG/m;", "Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;", "bindVariantsViewModel", "(LYG/m;)Lcom/sugarcube/decorate/v2/internal/ui/toolbars/variants/VariantsViewModel;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CatalogModule {
    BrowseViewModel bindBrowseViewModel(C18049m mVar);

    CatalogRepository bindCatalogRepository(C17026a aVar);

    CategoriesRepository bindCategoriesRepository(C17687a aVar);

    FetchCategoriesUseCase bindFetchCategoriesUseCase(C17772a aVar);

    FetchCategoryItemsUseCase bindFetchCategoryItemsUseCase(C17773b bVar);

    FetchSubCategoriesUseCase bindFetchSubCategoriesUseCase(C17774c cVar);

    FetchSubCategoryItemsUseCase bindFetchSubCategoryItemsUseCase(C17775d dVar);

    GoesWellWithRepository bindGoesWellWithRepository(C17688b bVar);

    RecentSearchRepository bindRecentSearchRepository(C17689c cVar);

    SearchSuggestionsRepository bindSearchSuggestionsRepository(C17690d dVar);

    VariantsViewModel bindVariantsViewModel(m mVar);
}
