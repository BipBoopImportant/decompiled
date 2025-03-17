package com.sugarcube.core.network.api;

import VL.C16704f;
import VL.s;
import VL.t;
import VL.y;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogItemVariants;
import com.sugarcube.core.network.models.CatalogPage;
import com.sugarcube.core.network.models.CatalogSearchPage;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u0013\u001a\u00020\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0005\u0010\u0015J\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u000f\u001a\u00020\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001c2\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b$\u0010%J0\u0010'\u001a\u00020&2\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/sugarcube/core/network/api/CatalogApi;", "", "Landroid/net/Uri;", "url", "Lcom/sugarcube/core/network/models/CatalogPage;", "fetchCatalogPage", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "hasGoesWell", "", "pageSize", "", "subCatalogs", "categoryId", "subcategoryId", "stacks", "qaStatus", "region", "roomType", "itemOffset", "geometryType", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LdI/e;)Ljava/lang/Object;", "searchTerm", "moreToken", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "fetchCatalogSearchPage", "(Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "name", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "fetchCatalogCategories", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "furnitureId", "Lcom/sugarcube/core/network/models/CatalogItem;", "fetchProductRecommendations", "(IZLdI/e;)Ljava/lang/Object;", "fetchCatalogItemSwappables", "(IZILjava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogItemVariants;", "fetchProductVariants", "(IZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CatalogApi {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchCatalogCategories$default(CatalogApi catalogApi, boolean z10, String str, String str2, String str3, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                return catalogApi.fetchCatalogCategories(z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogCategories");
        }

        public static /* synthetic */ Object fetchCatalogItemSwappables$default(CatalogApi catalogApi, int i10, boolean z10, int i11, String str, String str2, C17164e eVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    i11 = 48;
                }
                int i13 = i11;
                if ((i12 & 8) != 0) {
                    str = null;
                }
                String str3 = str;
                if ((i12 & 16) != 0) {
                    str2 = NetworkAPIs.GeometryType.All.getQueryParamVal();
                }
                return catalogApi.fetchCatalogItemSwappables(i10, z10, i13, str3, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogItemSwappables");
        }

        public static /* synthetic */ Object fetchCatalogPage$default(CatalogApi catalogApi, boolean z10, int i10, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, int i11, String str7, C17164e eVar, int i12, Object obj) {
            int i13 = i12;
            if (obj == null) {
                return catalogApi.fetchCatalogPage(z10, (i13 & 2) != 0 ? 48 : i10, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? "GOOD" : str4, str5, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? 0 : i11, (i13 & 1024) != 0 ? NetworkAPIs.GeometryType.All.getQueryParamVal() : str7, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogPage");
        }

        public static /* synthetic */ Object fetchCatalogSearchPage$default(CatalogApi catalogApi, String str, boolean z10, int i10, String str2, String str3, String str4, String str5, boolean z11, String str6, String str7, String str8, String str9, C17164e eVar, int i11, Object obj) {
            int i12 = i11;
            if (obj == null) {
                return catalogApi.fetchCatalogSearchPage(str, z10, (i12 & 4) != 0 ? 48 : i10, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? true : z11, (i12 & 256) != 0 ? "GOOD" : str6, str7, (i12 & 1024) != 0 ? null : str8, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? NetworkAPIs.GeometryType.All.getQueryParamVal() : str9, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogSearchPage");
        }

        public static /* synthetic */ Object fetchProductVariants$default(CatalogApi catalogApi, int i10, boolean z10, String str, C17164e eVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    str = NetworkAPIs.GeometryType.All.getQueryParamVal();
                }
                return catalogApi.fetchProductVariants(i10, z10, str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProductVariants");
        }
    }

    @C16704f("furniture/categories")
    Object fetchCatalogCategories(@t("has_goes_well") boolean z10, @t("name") String str, @t("category_id") String str2, @t("region") String str3, C17164e<? super List<CatalogCategory>> eVar);

    @C16704f("furniture/{id}/swappables/")
    Object fetchCatalogItemSwappables(@s("id") int i10, @t("has_goes_well") boolean z10, @t("limit") int i11, @t("room_type") String str, @t("geometry_type") String str2, C17164e<? super CatalogPage> eVar);

    @C16704f
    Object fetchCatalogPage(@y Uri uri, C17164e<? super CatalogPage> eVar);

    @C16704f("furniture/")
    Object fetchCatalogPage(@t("has_goes_well") boolean z10, @t("limit") int i10, @t("sub_catalogs") String str, @t("category_id") String str2, @t("sub_category_id") String str3, @t("stacks") Boolean bool, @t("qa_status") String str4, @t("region") String str5, @t("room_type") String str6, @t("offset") int i11, @t("geometry_type") String str7, C17164e<? super CatalogPage> eVar);

    @C16704f("furniture/search?needMore=true")
    Object fetchCatalogSearchPage(@t("q") String str, @t("has_goes_well") boolean z10, @t("size") int i10, @t("sub_catalogs") String str2, @t("category_id") String str3, @t("sub_category_id") String str4, @t("moreToken") String str5, @t("stacks") boolean z11, @t("qa_status") String str6, @t("region") String str7, @t("room_type") String str8, @t("geometry_type") String str9, C17164e<? super CatalogSearchPage> eVar);

    @C16704f("furniture/{itemId}/recommendations/")
    Object fetchProductRecommendations(@s("itemId") int i10, @t("has_goes_well") boolean z10, C17164e<? super List<CatalogItem>> eVar);

    @C16704f("furniture/{id}/variants/")
    Object fetchProductVariants(@s("id") int i10, @t("has_goes_well") boolean z10, @t("geometry_type") String str, C17164e<? super CatalogItemVariants> eVar);
}
