package com.sugarcube.app.base.data.source;

import QJ.C16311i0;
import QJ.M;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u0010J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\r\u0010\u0013J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\r\u0010\u0016J(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u001c\u0010\u001aJ\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000b2\b\b\u0002\u0010!\u001a\u00020\u0017H¦@¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u0017H¦@¢\u0006\u0004\b$\u0010%J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b&\u0010\u000eJ$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\fH¦@¢\u0006\u0004\b&\u0010\u0010J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b&\u0010\u0013J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b&\u0010\u0016J$\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b(\u0010\u0013J\u0018\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH¦@¢\u0006\u0004\b*\u0010\u0010J\u001c\u0010,\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\u0002048\u0004X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R&\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0004X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020:0A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/sugarcube/app/base/data/source/CatalogRepositorySource;", "", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;", "localSource", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;", "remoteSource", "<init>", "(Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Lcom/sugarcube/app/base/data/Result;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "fetchCatalogItems", "(Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "swapItem", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "", "searchTerm", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "subcategory", "(Lcom/sugarcube/core/network/models/CatalogCategory;LdI/e;)Ljava/lang/Object;", "", "itemIds", "fetchProductInformation", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "itemId", "fetchProductInformationLocalIds", "fetchProductVariants", "(Ljava/lang/Integer;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogItem;", "items", "flags", "convertCatalogItems", "(Ljava/util/List;ILdI/e;)Ljava/lang/Object;", "fetchProductRecommendations", "(ILdI/e;)Ljava/lang/Object;", "stepCatalogItems", "categoryId", "fetchCatalogCategories", "catalogItem", "fetchAssetsForCatalogItem", "param", "getCount", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;", "getLocalSource", "()Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;", "getRemoteSource", "()Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;", "LQJ/M;", "coroutineContext", "LQJ/M;", "getCoroutineContext", "()LQJ/M;", "Landroidx/lifecycle/K;", "", "_isRefreshing", "Landroidx/lifecycle/K;", "get_isRefreshing", "()Landroidx/lifecycle/K;", "get_isRefreshing$annotations", "()V", "Landroidx/lifecycle/F;", "isRefreshing", "()Landroidx/lifecycle/F;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CatalogRepositorySource {
    public static final int $stable = 8;
    private final K<Boolean> _isRefreshing = new K<>();
    private final M coroutineContext = C16311i0.a();
    private final CatalogRepositoryLocalDataSource localSource;
    private final CatalogRepositoryRemoteDataSource remoteSource;

    public CatalogRepositorySource(CatalogRepositoryLocalDataSource catalogRepositoryLocalDataSource, CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource) {
        C17542s.j(catalogRepositoryLocalDataSource, "localSource");
        C17542s.j(catalogRepositoryRemoteDataSource, "remoteSource");
        this.localSource = catalogRepositoryLocalDataSource;
        this.remoteSource = catalogRepositoryRemoteDataSource;
    }

    public static /* synthetic */ Object convertCatalogItems$default(CatalogRepositorySource catalogRepositorySource, List list, int i10, C17164e eVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return catalogRepositorySource.convertCatalogItems(list, i10, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertCatalogItems");
    }

    public static /* synthetic */ Object fetchCatalogCategories$default(CatalogRepositorySource catalogRepositorySource, String str, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return catalogRepositorySource.fetchCatalogCategories(str, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCatalogCategories");
    }

    protected static /* synthetic */ void get_isRefreshing$annotations() {
    }

    public abstract Object convertCatalogItems(List<CatalogItem> list, int i10, C17164e<? super List<CachedCatalogItem>> eVar);

    public abstract Object fetchAssetsForCatalogItem(CachedCatalogItem cachedCatalogItem, C17164e<? super CachedCatalogItem> eVar);

    public abstract Object fetchCatalogCategories(String str, C17164e<? super List<CatalogCategory>> eVar);

    public abstract Object fetchCatalogItems(CachedCatalogItem cachedCatalogItem, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object fetchCatalogItems(CatalogCategory catalogCategory, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object fetchCatalogItems(RoomType roomType, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object fetchCatalogItems(String str, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object fetchProductInformation(List<Integer> list, C17164e<? super List<CachedCatalogItem>> eVar);

    public abstract Object fetchProductInformationLocalIds(List<String> list, C17164e<? super List<CachedCatalogItem>> eVar);

    public abstract Object fetchProductRecommendations(int i10, C17164e<? super List<CachedCatalogItem>> eVar);

    public abstract Object fetchProductVariants(Integer num, C17164e<? super List<CachedCatalogItem>> eVar);

    /* access modifiers changed from: protected */
    public final M getCoroutineContext() {
        return this.coroutineContext;
    }

    public abstract Object getCount(Object obj, C17164e<? super Integer> eVar);

    /* access modifiers changed from: protected */
    public final CatalogRepositoryLocalDataSource getLocalSource() {
        return this.localSource;
    }

    /* access modifiers changed from: protected */
    public final CatalogRepositoryRemoteDataSource getRemoteSource() {
        return this.remoteSource;
    }

    /* access modifiers changed from: protected */
    public final K<Boolean> get_isRefreshing() {
        return this._isRefreshing;
    }

    public final F<Boolean> isRefreshing() {
        return this._isRefreshing;
    }

    public abstract Object stepCatalogItems(CachedCatalogItem cachedCatalogItem, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object stepCatalogItems(CatalogCategory catalogCategory, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object stepCatalogItems(RoomType roomType, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);

    public abstract Object stepCatalogItems(String str, C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar);
}
