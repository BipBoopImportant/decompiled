package com.sugarcube.app.base.data.source;

import android.net.Uri;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogPage;
import com.sugarcube.core.network.models.CatalogSearchPage;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017H¦@¢\u0006\u0004\b\u001f\u0010\u001eJ(\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017H¦@¢\u0006\u0004\b!\u0010\u001eJ\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H¦@¢\u0006\u0004\b\"\u0010#J*\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020'H¦@¢\u0006\u0004\b)\u0010*J \u0010+\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b+\u0010,J4\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0-\u0018\u00010-2\u0006\u0010(\u001a\u00020'H¦@¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryDataSource;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Landroid/net/Uri;", "moreToken", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/CatalogPage;", "fetchCatalogPage", "(Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "categoryId", "fetchCatalogPageForCategory", "(Ljava/lang/String;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "subcategoryId", "searchTerm", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "fetchCatalogSearchResultsPage", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "itemId", "fetchCatalogSwapSuggestionsPage", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "fetchCatalogCategories", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "itemIds", "Lcom/sugarcube/core/network/models/CatalogItem;", "fetchCatalogItems", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "fetchProductInfo", "localIds", "fetchProductInfoLocalIds", "fetchProductVariants", "(Ljava/lang/Integer;LdI/e;)Ljava/lang/Object;", "Ljava/io/File;", "assetFile", "assetUrl", "", "allowFetch", "fetchItemAsset", "(Ljava/io/File;Landroid/net/Uri;ZLdI/e;)Ljava/lang/Object;", "fetchProductRecommendations", "(ILdI/e;)Ljava/lang/Object;", "", "fetchSalesDressedBedData", "(ZLdI/e;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CatalogRepositoryRemoteDataSource extends CatalogRepositoryDataSource {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchCatalogPage$default(CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, RoomType roomType, Uri uri, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    uri = null;
                }
                return catalogRepositoryRemoteDataSource.fetchCatalogPage(roomType, uri, (C17164e<? super Result<CatalogPage>>) eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogPage");
        }

        public static /* synthetic */ Object fetchCatalogPageForCategory$default(CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, String str, Uri uri, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    uri = null;
                }
                return catalogRepositoryRemoteDataSource.fetchCatalogPageForCategory(str, uri, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogPageForCategory");
        }

        public static /* synthetic */ Object fetchCatalogSearchResultsPage$default(CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, String str, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                return catalogRepositoryRemoteDataSource.fetchCatalogSearchResultsPage(str, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogSearchResultsPage");
        }

        public static /* synthetic */ Object fetchCatalogSwapSuggestionsPage$default(CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, int i10, Uri uri, C17164e eVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    uri = null;
                }
                return catalogRepositoryRemoteDataSource.fetchCatalogSwapSuggestionsPage(i10, uri, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogSwapSuggestionsPage");
        }

        public static /* synthetic */ Object fetchItemAsset$default(CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, File file, Uri uri, boolean z10, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    z10 = true;
                }
                return catalogRepositoryRemoteDataSource.fetchItemAsset(file, uri, z10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchItemAsset");
        }

        public static /* synthetic */ Object fetchCatalogPage$default(CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, String str, Uri uri, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    uri = null;
                }
                return catalogRepositoryRemoteDataSource.fetchCatalogPage(str, uri, (C17164e<? super Result<CatalogPage>>) eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogPage");
        }
    }

    Object fetchCatalogCategories(String str, C17164e<? super List<CatalogCategory>> eVar);

    Object fetchCatalogItems(List<Integer> list, C17164e<? super List<CatalogItem>> eVar);

    Object fetchCatalogPage(RoomType roomType, Uri uri, C17164e<? super Result<CatalogPage>> eVar);

    Object fetchCatalogPage(String str, Uri uri, C17164e<? super Result<CatalogPage>> eVar);

    Object fetchCatalogPageForCategory(String str, Uri uri, C17164e<? super Result<CatalogPage>> eVar);

    Object fetchCatalogSearchResultsPage(String str, String str2, C17164e<? super Result<CatalogSearchPage>> eVar);

    Object fetchCatalogSwapSuggestionsPage(int i10, Uri uri, C17164e<? super Result<CatalogPage>> eVar);

    Object fetchItemAsset(File file, Uri uri, boolean z10, C17164e<? super File> eVar);

    Object fetchProductInfo(List<Integer> list, C17164e<? super List<CatalogItem>> eVar);

    Object fetchProductInfoLocalIds(List<String> list, C17164e<? super List<CatalogItem>> eVar);

    Object fetchProductRecommendations(int i10, C17164e<? super List<CatalogItem>> eVar);

    Object fetchProductVariants(Integer num, C17164e<? super List<CatalogItem>> eVar);

    Object fetchSalesDressedBedData(boolean z10, C17164e<? super Map<String, ? extends Map<String, CatalogItem>>> eVar);
}
