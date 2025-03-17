package com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog;

import XH.x;
import android.net.Uri;
import com.sugarcube.core.network.models.CatalogPage;
import com.sugarcube.core.network.models.CatalogSearchPage;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Landroid/net/Uri;", "moreToken", "LXH/x;", "Lcom/sugarcube/core/network/models/CatalogPage;", "getCatalogPage-0E7RQCE", "(Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "getCatalogPage", "", "searchTerm", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "fetchCatalogItemsForSearchTerm-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchCatalogItemsForSearchTerm", "", "itemId", "fetchCatalogSwapSuggestionsPage-0E7RQCE", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "fetchCatalogSwapSuggestionsPage", "categoryId", "fetchCatalogItemsForCategory-0E7RQCE", "(Ljava/lang/String;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "fetchCatalogItemsForCategory", "subCategory", "fetchCatalogItemsForSubCategory-0E7RQCE", "fetchCatalogItemsForSubCategory", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CatalogRepository {
    /* renamed from: fetchCatalogItemsForCategory-0E7RQCE  reason: not valid java name */
    Object m80fetchCatalogItemsForCategory0E7RQCE(String str, Uri uri, C17164e<? super x<CatalogPage>> eVar);

    /* renamed from: fetchCatalogItemsForSearchTerm-0E7RQCE  reason: not valid java name */
    Object m81fetchCatalogItemsForSearchTerm0E7RQCE(String str, String str2, C17164e<? super x<CatalogSearchPage>> eVar);

    /* renamed from: fetchCatalogItemsForSubCategory-0E7RQCE  reason: not valid java name */
    Object m82fetchCatalogItemsForSubCategory0E7RQCE(String str, Uri uri, C17164e<? super x<CatalogPage>> eVar);

    /* renamed from: fetchCatalogSwapSuggestionsPage-0E7RQCE  reason: not valid java name */
    Object m83fetchCatalogSwapSuggestionsPage0E7RQCE(int i10, Uri uri, C17164e<? super x<CatalogPage>> eVar);

    /* renamed from: getCatalogPage-0E7RQCE  reason: not valid java name */
    Object m84getCatalogPage0E7RQCE(RoomType roomType, Uri uri, C17164e<? super x<CatalogPage>> eVar);
}
