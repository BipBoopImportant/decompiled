package com.sugarcube.app.base.data.source;

import QJ.S;
import QJ.Y;
import android.net.Uri;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.database.SalesDressedBedDataKey;
import com.sugarcube.app.base.external.interactions.CartInteractions;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000 v2\u00020\u0001:\u0001vB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b\r\u0010\u0011J\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b\u001a\u0010\u0018J*\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b!\u0010\"J2\u0010'\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010%2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u001e*\u00020 H\u0002¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020-2\u0006\u0010$\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020-2\u0006\u0010$\u001a\u00020+2\b\u00102\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020+H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010&2\u0006\u0010$\u001a\u00020&H\u0002¢\u0006\u0004\b7\u00108J*\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0<2\u0006\u0010:\u001a\u0002092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001cH@¢\u0006\u0004\b=\u0010>J*\u0010@\u001a\b\u0012\u0004\u0012\u00020\f0<2\u0006\u0010?\u001a\u00020\u00142\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001cH@¢\u0006\u0004\b@\u0010AJ*\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100<2\u0006\u0010B\u001a\u00020&2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010&H@¢\u0006\u0004\bC\u0010DJ*\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0<2\u0006\u0010E\u001a\u00020&2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001cH@¢\u0006\u0004\bF\u0010GJ$\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010:\u001a\u000209H@¢\u0006\u0004\bI\u0010JJ$\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010K\u001a\u00020\u0016H@¢\u0006\u0004\bI\u0010LJ$\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010B\u001a\u00020&H@¢\u0006\u0004\bI\u0010MJ$\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010O\u001a\u00020NH@¢\u0006\u0004\bI\u0010PJ(\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010H2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010HH@¢\u0006\u0004\bR\u0010SJ(\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010H2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010HH@¢\u0006\u0004\bU\u0010SJ\"\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010H2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H@¢\u0006\u0004\bV\u0010WJ \u0010X\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010H2\u0006\u0010\u001b\u001a\u00020\u0014H@¢\u0006\u0004\bX\u0010YJ0\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010H2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010H2\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b[\u0010\\J$\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010:\u001a\u000209H@¢\u0006\u0004\b]\u0010JJ$\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010K\u001a\u00020\u0016H@¢\u0006\u0004\b]\u0010LJ$\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010B\u001a\u00020&H@¢\u0006\u0004\b]\u0010MJ$\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160H0<2\u0006\u0010O\u001a\u00020NH@¢\u0006\u0004\b]\u0010PJ\"\u0010^\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010H2\b\u0010E\u001a\u0004\u0018\u00010&H@¢\u0006\u0004\b^\u0010MJ\u0018\u0010`\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u0016H@¢\u0006\u0004\b`\u0010LJ\u001c\u0010b\u001a\u0004\u0018\u00010\u00142\b\u0010a\u001a\u0004\u0018\u00010+H@¢\u0006\u0004\bb\u0010cJ\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001e0<2\u0006\u0010\u0013\u001a\u00020\u0016H@¢\u0006\u0004\bd\u0010LJ$\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001e0<2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00160HH@¢\u0006\u0004\be\u0010SJ0\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001e0<2\u0018\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140f0HH@¢\u0006\u0004\bg\u0010SJ$\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001e0<2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00140HH@¢\u0006\u0004\bi\u0010SR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010j\u001a\u0004\bk\u0010lR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010mR\u0018\u0010B\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010nR\u0018\u0010K\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010oR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010pR$\u0010r\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010\u001c0q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010sR$\u0010t\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010&0q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010sR$\u0010u\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010\u00140q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010s¨\u0006w"}, d2 = {"Lcom/sugarcube/app/base/data/source/CatalogRepository;", "Lcom/sugarcube/app/base/data/source/CatalogRepositorySource;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;", "local", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;", "remote", "Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "cartInteractions", "<init>", "(Lcom/sugarcube/app/base/data/source/CatalogRepositoryLocalDataSource;Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;Lcom/sugarcube/app/base/external/interactions/CartInteractions;)V", "Lcom/sugarcube/core/network/models/CatalogPage;", "page", "Lcom/sugarcube/app/base/data/database/CachedCatalogPage;", "cacheCatalogPage", "(Lcom/sugarcube/core/network/models/CatalogPage;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPage;", "(Lcom/sugarcube/core/network/models/CatalogSearchPage;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogItem;", "item", "", "flags", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cacheCatalogItem", "(Lcom/sugarcube/core/network/models/CatalogItem;ILdI/e;)Ljava/lang/Object;", "LQJ/Y;", "cacheCatalogItemDeferred", "itemId", "Landroid/net/Uri;", "assetUrl", "", "allowFetch", "Ljava/io/File;", "getAsset", "(ILandroid/net/Uri;ZLdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/database/SalesDressedBedDataKey;", "key", "", "", "getSDBAssets", "(Lcom/sugarcube/app/base/data/database/SalesDressedBedDataKey;ZLdI/e;)Ljava/lang/Object;", "isValid", "(Ljava/io/File;)Z", "", "nextPageToken", "LXH/N;", "putNextPageToken", "(Ljava/lang/Object;Landroid/net/Uri;)V", "putNextSearchPageToken", "(Ljava/lang/String;Ljava/lang/String;)V", "count", "putCount", "(Ljava/lang/Object;Ljava/lang/Integer;)V", "getNextPageToken", "(Ljava/lang/Object;)Landroid/net/Uri;", "getNextSearchPageToken", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "moreToken", "Lcom/sugarcube/app/base/data/Result;", "fetchCatalogItemsForRoomType", "(Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "swapItemId", "fetchCatalogItemsForSwap", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "searchTerm", "fetchCatalogItemsForSearchTerm", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "categoryId", "fetchCatalogItemsForCategory", "(Ljava/lang/String;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "fetchCatalogItems", "(Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "swapItem", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LdI/e;)Ljava/lang/Object;", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "subcategory", "(Lcom/sugarcube/core/network/models/CatalogCategory;LdI/e;)Ljava/lang/Object;", "itemIds", "fetchProductInformation", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "localItemIds", "fetchProductInformationLocalIds", "fetchProductVariants", "(Ljava/lang/Integer;LdI/e;)Ljava/lang/Object;", "fetchProductRecommendations", "(ILdI/e;)Ljava/lang/Object;", "items", "convertCatalogItems", "(Ljava/util/List;ILdI/e;)Ljava/lang/Object;", "stepCatalogItems", "fetchCatalogCategories", "catalogItem", "fetchAssetsForCatalogItem", "param", "getCount", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "addItemToCart", "addItemsToCart", "LXH/v;", "addItemsWithQtyToCart", "ids", "addItemsToCartByIds", "Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "getCartInteractions", "()Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "Lcom/sugarcube/core/network/models/RoomType;", "Ljava/lang/String;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "", "nextPageMap", "Ljava/util/Map;", "nextSearchPageMap", "countMap", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogRepository extends CatalogRepositorySource {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FEATURE_DRACO = "draco";
    public static final int FETCH_FLAG_ALL = 1073741823;
    public static final int FETCH_FLAG_MODEL = 2;
    public static final int FETCH_FLAG_NONE = 0;
    public static final int FETCH_FLAG_SDB = 1073741824;
    public static final int FETCH_FLAG_THUMBNAIL = 1;
    private final CartInteractions cartInteractions;
    private Map<Object, Integer> countMap = new LinkedHashMap();
    private Map<Object, Uri> nextPageMap = new LinkedHashMap();
    private Map<String, String> nextSearchPageMap = new LinkedHashMap();
    private RoomType roomType;
    private String searchTerm;
    private CatalogCategory subcategory;
    private CachedCatalogItem swapItem;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/source/CatalogRepository$Companion;", "", "<init>", "()V", "FETCH_FLAG_NONE", "", "FETCH_FLAG_THUMBNAIL", "FETCH_FLAG_MODEL", "FETCH_FLAG_SDB", "FETCH_FLAG_ALL", "FEATURE_DRACO", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogRepository(CatalogRepositoryLocalDataSource catalogRepositoryLocalDataSource, CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, CartInteractions cartInteractions2) {
        super(catalogRepositoryLocalDataSource, catalogRepositoryRemoteDataSource);
        C17542s.j(catalogRepositoryLocalDataSource, "local");
        C17542s.j(catalogRepositoryRemoteDataSource, "remote");
        C17542s.j(cartInteractions2, "cartInteractions");
        this.cartInteractions = cartInteractions2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object cacheCatalogItem(com.sugarcube.core.network.models.CatalogItem r23, int r24, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogItem> r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$1 r3 = (com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$1 r3 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.label
            java.lang.String r7 = ""
            r8 = 3
            r9 = 2
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x0087
            if (r6 == r11) goto L_0x0074
            if (r6 == r9) goto L_0x0059
            if (r6 != r8) goto L_0x0051
            java.lang.Object r1 = r3.L$5
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r1 = r3.L$4
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r2 = r3.L$3
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r5 = r3.L$2
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r3.L$1
            com.sugarcube.core.network.models.CatalogItem r5 = (com.sugarcube.core.network.models.CatalogItem) r5
            java.lang.Object r3 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r4)
            goto L_0x0129
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0059:
            int r1 = r3.I$0
            java.lang.Object r2 = r3.L$4
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r2 = r3.L$3
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r6 = r3.L$2
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r9 = r3.L$1
            com.sugarcube.core.network.models.CatalogItem r9 = (com.sugarcube.core.network.models.CatalogItem) r9
            java.lang.Object r12 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r12 = (com.sugarcube.app.base.data.source.CatalogRepository) r12
            XH.y.b(r4)
            r13 = r9
            goto L_0x00dd
        L_0x0074:
            int r1 = r3.I$0
            java.lang.Object r2 = r3.L$2
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.L$1
            com.sugarcube.core.network.models.CatalogItem r6 = (com.sugarcube.core.network.models.CatalogItem) r6
            java.lang.Object r12 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r12 = (com.sugarcube.app.base.data.source.CatalogRepository) r12
            XH.y.b(r4)
            r13 = r6
            goto L_0x00ab
        L_0x0087:
            XH.y.b(r4)
            java.lang.Integer r4 = r23.getId()
            android.net.Uri r6 = r23.getThumbUrl()
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$2 r12 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$2
            r12.<init>(r1, r0, r10)
            r3.L$0 = r0
            r13 = r23
            r3.L$1 = r13
            r3.L$2 = r2
            r3.I$0 = r1
            r3.label = r11
            java.lang.Object r4 = NF.C13291e.d(r4, r6, r12, r3)
            if (r4 != r5) goto L_0x00aa
            return r5
        L_0x00aa:
            r12 = r0
        L_0x00ab:
            java.io.File r4 = (java.io.File) r4
            if (r4 != 0) goto L_0x00b5
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            goto L_0x00b6
        L_0x00b5:
            r6 = r4
        L_0x00b6:
            java.lang.Integer r14 = r13.getId()
            android.net.Uri r15 = r13.getAssetUrl()
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$3 r8 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$3
            r8.<init>(r1, r12, r10)
            r3.L$0 = r12
            r3.L$1 = r13
            r3.L$2 = r2
            r3.L$3 = r6
            r3.L$4 = r4
            r3.I$0 = r1
            r3.label = r9
            java.lang.Object r4 = NF.C13291e.d(r14, r15, r8, r3)
            if (r4 != r5) goto L_0x00d8
            return r5
        L_0x00d8:
            r21 = r6
            r6 = r2
            r2 = r21
        L_0x00dd:
            java.io.File r4 = (java.io.File) r4
            if (r4 != 0) goto L_0x00e7
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            goto L_0x00e8
        L_0x00e7:
            r8 = r4
        L_0x00e8:
            java.lang.Boolean r7 = r13.getHidden()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r11)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x0133
            boolean r7 = r13.isCombinable()
            if (r7 == 0) goto L_0x0133
            boolean r7 = r13.isCombinableParent()
            if (r7 == 0) goto L_0x0133
            java.lang.String r7 = r13.getCombinableSize()
            java.lang.String r9 = r13.getCombinableVariant()
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$4 r14 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogItem$4
            r14.<init>(r12, r10)
            r3.L$0 = r12
            r3.L$1 = r13
            r3.L$2 = r6
            r3.L$3 = r2
            r3.L$4 = r8
            r3.L$5 = r4
            r3.I$0 = r1
            r1 = 3
            r3.label = r1
            java.lang.Object r4 = NF.C13291e.d(r7, r9, r14, r3)
            if (r4 != r5) goto L_0x0127
            return r5
        L_0x0127:
            r1 = r8
            r5 = r13
        L_0x0129:
            r10 = r4
            java.util.Map r10 = (java.util.Map) r10
            r13 = r1
            r14 = r2
            r18 = r5
            r17 = r10
            goto L_0x0139
        L_0x0133:
            r14 = r2
            r17 = r10
            r18 = r13
            r13 = r8
        L_0x0139:
            java.util.List r1 = r18.getFeatures()
            r2 = 0
            if (r1 == 0) goto L_0x014a
            java.lang.String r3 = "draco"
            boolean r1 = r1.contains(r3)
            if (r1 != r11) goto L_0x014a
            r15 = r11
            goto L_0x014b
        L_0x014a:
            r15 = r2
        L_0x014b:
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = new com.sugarcube.app.base.data.database.CachedCatalogItem
            r19 = 8
            r20 = 0
            r16 = 0
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.cacheCatalogItem(com.sugarcube.core.network.models.CatalogItem, int, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object cacheCatalogItem$default(CatalogRepository catalogRepository, CatalogItem catalogItem, int i10, C17164e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return catalogRepository.cacheCatalogItem(catalogItem, i10, eVar);
    }

    /* access modifiers changed from: private */
    public final Object cacheCatalogItemDeferred(CatalogItem catalogItem, int i10, C17164e<? super Y<CachedCatalogItem>> eVar) {
        return S.f(new CatalogRepository$cacheCatalogItemDeferred$2(catalogItem, i10, this, (C17164e<? super CatalogRepository$cacheCatalogItemDeferred$2>) null), eVar);
    }

    static /* synthetic */ Object cacheCatalogItemDeferred$default(CatalogRepository catalogRepository, CatalogItem catalogItem, int i10, C17164e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return catalogRepository.cacheCatalogItemDeferred(catalogItem, i10, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object cacheCatalogPage(com.sugarcube.core.network.models.CatalogPage r19, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage> r20) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$1
            if (r2 == 0) goto L_0x001a
            r2 = r1
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$1 r2 = (com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.label = r3
        L_0x0018:
            r3 = r2
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$1 r2 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$1
            r2.<init>(r6, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r3.result
            java.lang.Object r7 = eI.C17187b.f()
            int r4 = r3.label
            r5 = 1
            if (r4 == 0) goto L_0x005a
            if (r4 != r5) goto L_0x0052
            java.lang.Object r0 = r3.L$7
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = r3.L$6
            com.sugarcube.app.base.data.database.CachedCatalogPage r0 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r0
            java.lang.Object r1 = r3.L$5
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            java.lang.Object r4 = r3.L$4
            com.sugarcube.core.network.models.CatalogPage r4 = (com.sugarcube.core.network.models.CatalogPage) r4
            java.lang.Object r4 = r3.L$3
            com.sugarcube.core.network.models.CatalogPage r4 = (com.sugarcube.core.network.models.CatalogPage) r4
            java.lang.Object r4 = r3.L$2
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r3.L$1
            com.sugarcube.core.network.models.CatalogPage r4 = (com.sugarcube.core.network.models.CatalogPage) r4
            java.lang.Object r3 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r2)
            goto L_0x00c1
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005a:
            XH.y.b(r2)
            if (r0 == 0) goto L_0x00c9
            androidx.lifecycle.K r2 = r18.get_isRefreshing()
            r4 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            r2.postValue(r8)
            com.sugarcube.app.base.data.database.CachedCatalogPage r8 = new com.sugarcube.app.base.data.database.CachedCatalogPage
            r16 = 63
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r2 = r19.getTotalCount()
            if (r2 == 0) goto L_0x0086
            int r9 = r2.intValue()
            goto L_0x0087
        L_0x0086:
            r9 = r4
        L_0x0087:
            r8.setTotalCount(r9)
            android.net.Uri r9 = r19.getNext()
            r8.setNextUrl(r9)
            android.net.Uri r9 = r19.getPrevious()
            r8.setPrevUrl(r9)
            java.util.List r9 = r19.getPageItems()
            r3.L$0 = r6
            r3.L$1 = r0
            r3.L$2 = r1
            r3.L$3 = r0
            r3.L$4 = r0
            r3.L$5 = r8
            r3.L$6 = r8
            r3.L$7 = r2
            r3.I$0 = r4
            r3.I$1 = r4
            r3.label = r5
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r18
            r1 = r9
            java.lang.Object r2 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r0, r1, r2, r3, r4, r5)
            if (r2 != r7) goto L_0x00bf
            return r7
        L_0x00bf:
            r0 = r8
            r1 = r0
        L_0x00c1:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00ca
            r0.setPageItems(r2)
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.cacheCatalogPage(com.sugarcube.core.network.models.CatalogPage, dI.e):java.lang.Object");
    }

    public static /* synthetic */ Object fetchCatalogItemsForCategory$default(CatalogRepository catalogRepository, String str, Uri uri, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uri = null;
        }
        return catalogRepository.fetchCatalogItemsForCategory(str, uri, eVar);
    }

    public static /* synthetic */ Object fetchCatalogItemsForRoomType$default(CatalogRepository catalogRepository, RoomType roomType2, Uri uri, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uri = null;
        }
        return catalogRepository.fetchCatalogItemsForRoomType(roomType2, uri, eVar);
    }

    public static /* synthetic */ Object fetchCatalogItemsForSearchTerm$default(CatalogRepository catalogRepository, String str, String str2, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return catalogRepository.fetchCatalogItemsForSearchTerm(str, str2, eVar);
    }

    public static /* synthetic */ Object fetchCatalogItemsForSwap$default(CatalogRepository catalogRepository, int i10, Uri uri, C17164e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            uri = null;
        }
        return catalogRepository.fetchCatalogItemsForSwap(i10, uri, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getAsset(int r18, android.net.Uri r19, boolean r20, dI.C17164e<? super java.io.File> r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r21
            boolean r4 = r3 instanceof com.sugarcube.app.base.data.source.CatalogRepository$getAsset$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.sugarcube.app.base.data.source.CatalogRepository$getAsset$1 r4 = (com.sugarcube.app.base.data.source.CatalogRepository$getAsset$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.sugarcube.app.base.data.source.CatalogRepository$getAsset$1 r4 = new com.sugarcube.app.base.data.source.CatalogRepository$getAsset$1
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r5 = r4.result
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.label
            java.lang.String r8 = ": "
            java.lang.String r9 = ""
            r10 = 3
            r11 = 2
            r12 = 1
            if (r7 == 0) goto L_0x009e
            if (r7 == r12) goto L_0x0089
            if (r7 == r11) goto L_0x0062
            if (r7 != r10) goto L_0x005a
            int r2 = r4.I$0
            java.lang.Object r0 = r4.L$5
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r0 = r4.L$4
            r3 = r0
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r4.L$3
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r0 = r4.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r4.L$1
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r0 = (com.sugarcube.app.base.data.source.CatalogRepository) r0
            XH.y.b(r5)     // Catch:{ IOException -> 0x0057 }
            goto L_0x0179
        L_0x0057:
            r0 = move-exception
            goto L_0x012d
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0062:
            int r0 = r4.I$1
            boolean r2 = r4.Z$0
            int r3 = r4.I$0
            java.lang.Object r7 = r4.L$5
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r11 = r4.L$3
            java.io.File r11 = (java.io.File) r11
            java.lang.Object r12 = r4.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r4.L$1
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r14 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r14 = (com.sugarcube.app.base.data.source.CatalogRepository) r14
            XH.y.b(r5)     // Catch:{ IOException -> 0x0086 }
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x0108
        L_0x0086:
            r0 = move-exception
            goto L_0x0152
        L_0x0089:
            boolean r0 = r4.Z$0
            int r2 = r4.I$0
            java.lang.Object r3 = r4.L$2
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r7 = r4.L$1
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r12 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r12 = (com.sugarcube.app.base.data.source.CatalogRepository) r12
            XH.y.b(r5)
            r14 = r12
            goto L_0x00cf
        L_0x009e:
            XH.y.b(r5)
            android.net.Uri r5 = android.net.Uri.EMPTY
            boolean r5 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r5 == 0) goto L_0x00af
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            return r0
        L_0x00af:
            com.sugarcube.app.base.data.source.CatalogRepositoryLocalDataSource r5 = r17.getLocalSource()
            r4.L$0 = r1
            r4.L$1 = r2
            r4.L$2 = r3
            r4.I$0 = r0
            r7 = r20
            r4.Z$0 = r7
            r4.label = r12
            java.lang.Object r5 = r5.getItemAsset(r0, r2, r4)
            if (r5 != r6) goto L_0x00c8
            return r6
        L_0x00c8:
            r14 = r1
            r16 = r2
            r2 = r0
            r0 = r7
            r7 = r16
        L_0x00cf:
            r12 = r5
            java.io.File r12 = (java.io.File) r12
            boolean r13 = r14.isValid(r12)
            if (r13 == 0) goto L_0x00d9
            return r12
        L_0x00d9:
            boolean r13 = r12.exists()
            if (r13 == 0) goto L_0x00e2
            r12.delete()
        L_0x00e2:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r13 = r14.getRemoteSource()     // Catch:{ IOException -> 0x0150 }
            r15 = 0
            r4.L$0 = r14     // Catch:{ IOException -> 0x0150 }
            r4.L$1 = r7     // Catch:{ IOException -> 0x0150 }
            r4.L$2 = r3     // Catch:{ IOException -> 0x0150 }
            r4.L$3 = r12     // Catch:{ IOException -> 0x0150 }
            r4.L$4 = r5     // Catch:{ IOException -> 0x0150 }
            r4.L$5 = r12     // Catch:{ IOException -> 0x0150 }
            r4.I$0 = r2     // Catch:{ IOException -> 0x0150 }
            r4.Z$0 = r0     // Catch:{ IOException -> 0x0150 }
            r4.I$1 = r15     // Catch:{ IOException -> 0x0150 }
            r4.label = r11     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r5 = r13.fetchItemAsset(r12, r7, r0, r4)     // Catch:{ IOException -> 0x0150 }
            if (r5 != r6) goto L_0x0102
            return r6
        L_0x0102:
            r13 = r7
            r7 = r12
            r11 = r7
            r12 = r3
            r3 = r0
            r0 = r15
        L_0x0108:
            java.io.File r5 = (java.io.File) r5     // Catch:{ IOException -> 0x0150 }
            com.sugarcube.app.base.data.source.CatalogRepositoryLocalDataSource r15 = r14.getLocalSource()     // Catch:{ IOException -> 0x012b }
            r4.L$0 = r14     // Catch:{ IOException -> 0x012b }
            r4.L$1 = r13     // Catch:{ IOException -> 0x012b }
            r4.L$2 = r12     // Catch:{ IOException -> 0x012b }
            r4.L$3 = r11     // Catch:{ IOException -> 0x012b }
            r4.L$4 = r5     // Catch:{ IOException -> 0x012b }
            r4.L$5 = r7     // Catch:{ IOException -> 0x012b }
            r4.I$0 = r2     // Catch:{ IOException -> 0x012b }
            r4.Z$0 = r3     // Catch:{ IOException -> 0x012b }
            r4.I$1 = r0     // Catch:{ IOException -> 0x012b }
            r4.label = r10     // Catch:{ IOException -> 0x012b }
            java.lang.Object r0 = r15.cacheItemAsset(r5, r11, r4)     // Catch:{ IOException -> 0x012b }
            if (r0 != r6) goto L_0x0129
            return r6
        L_0x0129:
            r3 = r5
            goto L_0x0179
        L_0x012b:
            r0 = move-exception
            r3 = r5
        L_0x012d:
            YE.b r4 = YE.C13868b.f118106a     // Catch:{ IOException -> 0x0150 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x0150 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0150 }
            r5.<init>()     // Catch:{ IOException -> 0x0150 }
            java.lang.String r6 = "Failed to cache asset the asset file for item "
            r5.append(r6)     // Catch:{ IOException -> 0x0150 }
            r5.append(r2)     // Catch:{ IOException -> 0x0150 }
            r5.append(r8)     // Catch:{ IOException -> 0x0150 }
            r5.append(r0)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x0150 }
            YE.e r5 = YE.e.Asset     // Catch:{ IOException -> 0x0150 }
            r4.b(r0, r5)     // Catch:{ IOException -> 0x0150 }
            goto L_0x0179
        L_0x0150:
            r0 = move-exception
            r3 = r2
        L_0x0152:
            YE.b r2 = YE.C13868b.f118106a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to fetch the asset file for item "
            r4.append(r5)
            r4.append(r3)
            r4.append(r8)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            YE.e r3 = YE.e.Asset
            r2.b(r0, r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r9)
        L_0x0179:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.getAsset(int, android.net.Uri, boolean, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object getAsset$default(CatalogRepository catalogRepository, int i10, Uri uri, boolean z10, C17164e eVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return catalogRepository.getAsset(i10, uri, z10, eVar);
    }

    private final Uri getNextPageToken(Object obj) {
        return this.nextPageMap.get(obj);
    }

    private final String getNextSearchPageToken(String str) {
        return this.nextSearchPageMap.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: dI.e<? super java.util.Map<java.lang.String, com.sugarcube.app.base.data.database.CachedCatalogItem>>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getSDBAssets(com.sugarcube.app.base.data.database.SalesDressedBedDataKey r12, boolean r13, dI.C17164e<? super java.util.Map<java.lang.String, com.sugarcube.app.base.data.database.CachedCatalogItem>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x00a5
            if (r3 == r8) goto L_0x0092
            if (r3 == r7) goto L_0x007c
            if (r3 == r6) goto L_0x0059
            if (r3 != r5) goto L_0x0051
            java.lang.Object r12 = r0.L$6
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r0.L$5
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r0.L$4
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r0.L$3
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r0.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.L$1
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r12 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r12
            java.lang.Object r12 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r12 = (com.sugarcube.app.base.data.source.CatalogRepository) r12
            XH.y.b(r1)
            goto L_0x014f
        L_0x0051:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0059:
            boolean r12 = r0.Z$0
            java.lang.Object r13 = r0.L$6
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r13 = r0.L$5
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r0.L$4
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r0.L$3
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r0.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r3 = r0.L$1
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r3 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r3
            java.lang.Object r6 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r6 = (com.sugarcube.app.base.data.source.CatalogRepository) r6
            XH.y.b(r1)
            goto L_0x0104
        L_0x007c:
            boolean r12 = r0.Z$0
            java.lang.Object r13 = r0.L$3
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r0.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r3 = r0.L$1
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r3 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r3
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r7 = (com.sugarcube.app.base.data.source.CatalogRepository) r7
            XH.y.b(r1)
            goto L_0x00df
        L_0x0092:
            boolean r13 = r0.Z$0
            java.lang.Object r12 = r0.L$2
            r14 = r12
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r12 = r0.L$1
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r12 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r12
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            goto L_0x00be
        L_0x00a5:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CatalogRepositoryLocalDataSource r1 = r11.getLocalSource()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r14
            r0.Z$0 = r13
            r0.label = r8
            java.lang.Object r1 = r1.getSalesDressedBedData(r0)
            if (r1 != r2) goto L_0x00bd
            return r2
        L_0x00bd:
            r3 = r11
        L_0x00be:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x010d
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r8 = r3.getRemoteSource()
            r0.L$0 = r3
            r0.L$1 = r12
            r0.L$2 = r14
            r0.L$3 = r1
            r0.Z$0 = r13
            r0.label = r7
            java.lang.Object r7 = r8.fetchSalesDressedBedData(r13, r0)
            if (r7 != r2) goto L_0x00d9
            return r2
        L_0x00d9:
            r10 = r3
            r3 = r12
            r12 = r13
            r13 = r1
            r1 = r7
            r7 = r10
        L_0x00df:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0109
            com.sugarcube.app.base.data.source.CatalogRepositoryLocalDataSource r8 = r7.getLocalSource()
            r0.L$0 = r7
            r0.L$1 = r3
            r0.L$2 = r14
            r0.L$3 = r13
            r0.L$4 = r1
            r0.L$5 = r1
            r0.L$6 = r1
            r0.Z$0 = r12
            r0.I$0 = r4
            r0.label = r6
            java.lang.Object r13 = r8.cacheSalesDressedBedData(r1, r0)
            if (r13 != r2) goto L_0x0102
            return r2
        L_0x0102:
            r13 = r1
            r6 = r7
        L_0x0104:
            r1 = r13
            r13 = r12
            r12 = r3
            r3 = r6
            goto L_0x010d
        L_0x0109:
            r13 = r12
            r12 = r3
            r3 = r7
            r1 = r9
        L_0x010d:
            if (r1 == 0) goto L_0x0152
            java.lang.String r6 = r12.toString()
            java.lang.Object r6 = r1.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x0129
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r6 = r12.getFallbackVariantKey()
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.util.Map r6 = (java.util.Map) r6
        L_0x0129:
            if (r6 == 0) goto L_0x0152
            QJ.M r7 = QJ.C16311i0.b()
            com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$4$1 r8 = new com.sugarcube.app.base.data.source.CatalogRepository$getSDBAssets$4$1
            r8.<init>(r6, r3, r9)
            r0.L$0 = r3
            r0.L$1 = r12
            r0.L$2 = r14
            r0.L$3 = r1
            r0.L$4 = r6
            r0.L$5 = r6
            r0.L$6 = r6
            r0.Z$0 = r13
            r0.I$0 = r4
            r0.label = r5
            java.lang.Object r1 = QJ.C16310i.g(r7, r8, r0)
            if (r1 != r2) goto L_0x014f
            return r2
        L_0x014f:
            r9 = r1
            java.util.Map r9 = (java.util.Map) r9
        L_0x0152:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.getSDBAssets(com.sugarcube.app.base.data.database.SalesDressedBedDataKey, boolean, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object getSDBAssets$default(CatalogRepository catalogRepository, SalesDressedBedDataKey salesDressedBedDataKey, boolean z10, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return catalogRepository.getSDBAssets(salesDressedBedDataKey, z10, eVar);
    }

    private final boolean isValid(File file) {
        return file.exists() && file.length() > 0;
    }

    private final void putCount(Object obj, Integer num) {
        this.countMap.put(obj, num);
    }

    private final void putNextPageToken(Object obj, Uri uri) {
        this.nextPageMap.put(obj, uri);
    }

    private final void putNextSearchPageToken(String str, String str2) {
        this.nextSearchPageMap.put(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addItemToCart(com.sugarcube.app.base.data.database.CachedCatalogItem r12, dI.C17164e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.source.CatalogRepository$addItemToCart$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            com.sugarcube.app.base.data.source.CatalogRepository$addItemToCart$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$addItemToCart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$addItemToCart$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$addItemToCart$1
            r0.<init>(r11, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r8 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 != r9) goto L_0x0043
            java.lang.Object r12 = r4.L$4
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r4.L$3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r4.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r4.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r12 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r12
            java.lang.Object r12 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r12 = (com.sugarcube.app.base.data.source.CatalogRepository) r12
            XH.y.b(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x007d
        L_0x0041:
            r12 = move-exception
            goto L_0x0087
        L_0x0043:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x004b:
            XH.y.b(r0)
            com.sugarcube.core.network.models.CatalogItem r0 = r12.getCatalogItem()
            java.lang.String r2 = r0.getLocalItemNumber()
            if (r2 != 0) goto L_0x0065
            com.sugarcube.app.base.data.Result$Error r12 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r13 = new java.lang.Exception
            java.lang.String r0 = "Missing localItemNumber"
            r13.<init>(r0)
            r12.<init>(r13, r10, r8, r10)
            return r12
        L_0x0065:
            com.sugarcube.app.base.external.interactions.CartInteractions r1 = r11.cartInteractions     // Catch:{ all -> 0x0041 }
            r4.L$0 = r11     // Catch:{ all -> 0x0041 }
            r4.L$1 = r12     // Catch:{ all -> 0x0041 }
            r4.L$2 = r13     // Catch:{ all -> 0x0041 }
            r4.L$3 = r2     // Catch:{ all -> 0x0041 }
            r4.L$4 = r2     // Catch:{ all -> 0x0041 }
            r4.label = r9     // Catch:{ all -> 0x0041 }
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r12 = com.sugarcube.app.base.external.interactions.CartInteractions.a.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0041 }
            if (r12 != r7) goto L_0x007d
            return r7
        L_0x007d:
            com.sugarcube.app.base.data.Result$Success r12 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x0041 }
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r9)     // Catch:{ all -> 0x0041 }
            r12.<init>(r13)     // Catch:{ all -> 0x0041 }
            goto L_0x008d
        L_0x0087:
            com.sugarcube.app.base.data.Result$Error r13 = new com.sugarcube.app.base.data.Result$Error
            r13.<init>(r12, r10, r8, r10)
            r12 = r13
        L_0x008d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.addItemToCart(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addItemsToCart(java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r10, dI.C17164e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCart$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCart$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCart$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCart$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x005a
            if (r3 != r5) goto L_0x0052
            java.lang.Object r10 = r0.L$8
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r0.L$7
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r0.L$6
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r10 = r0.L$5
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r0.L$4
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r0.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.L$2
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r10 = (com.sugarcube.app.base.data.source.CatalogRepository) r10
            XH.y.b(r1)     // Catch:{ all -> 0x004f }
            goto L_0x00f1
        L_0x004f:
            r10 = move-exception
            goto L_0x00fb
        L_0x0052:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x005a:
            XH.y.b(r1)
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x004f }
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x004f }
            r3.<init>()     // Catch:{ all -> 0x004f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004f }
        L_0x0069:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x0092
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x004f }
            r7 = r6
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7     // Catch:{ all -> 0x004f }
            com.sugarcube.core.network.models.CatalogItem r7 = r7.getCatalogItem()     // Catch:{ all -> 0x004f }
            java.lang.String r7 = r7.getLocalItemNumber()     // Catch:{ all -> 0x004f }
            java.lang.Object r8 = r3.get(r7)     // Catch:{ all -> 0x004f }
            if (r8 != 0) goto L_0x008c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x004f }
            r8.<init>()     // Catch:{ all -> 0x004f }
            r3.put(r7, r8)     // Catch:{ all -> 0x004f }
        L_0x008c:
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x004f }
            r8.add(r6)     // Catch:{ all -> 0x004f }
            goto L_0x0069
        L_0x0092:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            java.util.Set r6 = r3.entrySet()     // Catch:{ all -> 0x004f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004f }
        L_0x009f:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x004f }
            if (r7 == 0) goto L_0x00cd
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x004f }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x004f }
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x004f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x004f }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x004f }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x004f }
            if (r8 == 0) goto L_0x00c6
            int r7 = r7.size()     // Catch:{ all -> 0x004f }
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.e(r7)     // Catch:{ all -> 0x004f }
            XH.v r7 = XH.C16796C.a(r8, r7)     // Catch:{ all -> 0x004f }
            goto L_0x00c7
        L_0x00c6:
            r7 = r4
        L_0x00c7:
            if (r7 == 0) goto L_0x009f
            r1.add(r7)     // Catch:{ all -> 0x004f }
            goto L_0x009f
        L_0x00cd:
            com.sugarcube.app.base.external.interactions.CartInteractions r7 = r9.cartInteractions     // Catch:{ all -> 0x004f }
            r0.L$0 = r9     // Catch:{ all -> 0x004f }
            r0.L$1 = r10     // Catch:{ all -> 0x004f }
            r0.L$2 = r11     // Catch:{ all -> 0x004f }
            r0.L$3 = r1     // Catch:{ all -> 0x004f }
            r0.L$4 = r3     // Catch:{ all -> 0x004f }
            r0.L$5 = r3     // Catch:{ all -> 0x004f }
            r0.L$6 = r1     // Catch:{ all -> 0x004f }
            r0.L$7 = r3     // Catch:{ all -> 0x004f }
            r0.L$8 = r6     // Catch:{ all -> 0x004f }
            r10 = 0
            r0.I$0 = r10     // Catch:{ all -> 0x004f }
            r0.I$1 = r10     // Catch:{ all -> 0x004f }
            r0.I$2 = r10     // Catch:{ all -> 0x004f }
            r0.label = r5     // Catch:{ all -> 0x004f }
            java.lang.Object r10 = r7.addItems(r1, r0)     // Catch:{ all -> 0x004f }
            if (r10 != r2) goto L_0x00f1
            return r2
        L_0x00f1:
            com.sugarcube.app.base.data.Result$Success r10 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x004f }
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch:{ all -> 0x004f }
            r10.<init>(r11)     // Catch:{ all -> 0x004f }
            goto L_0x0102
        L_0x00fb:
            com.sugarcube.app.base.data.Result$Error r11 = new com.sugarcube.app.base.data.Result$Error
            r0 = 2
            r11.<init>(r10, r4, r0, r4)
            r10 = r11
        L_0x0102:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.addItemsToCart(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addItemsToCartByIds(java.util.List<java.lang.Integer> r14, dI.C17164e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCartByIds$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCartByIds$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCartByIds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCartByIds$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$addItemsToCartByIds$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x0062
            if (r3 == r4) goto L_0x0051
            if (r3 != r5) goto L_0x0049
            java.lang.Object r14 = r0.L$6
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r14 = r0.L$5
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r14 = r0.L$4
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r0.L$3
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r0.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.L$1
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r14 = (com.sugarcube.app.base.data.source.CatalogRepository) r14
            XH.y.b(r1)
            goto L_0x00ef
        L_0x0049:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0051:
            java.lang.Object r14 = r0.L$2
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.L$1
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            goto L_0x0075
        L_0x0062:
            XH.y.b(r1)
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r15
            r0.label = r4
            java.lang.Object r1 = r13.fetchProductInformation(r14, r0)
            if (r1 != r2) goto L_0x0074
            return r2
        L_0x0074:
            r3 = r13
        L_0x0075:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0087
            com.sugarcube.app.base.data.Result$Error r14 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r0 = "fetchProductInformation failed"
            r15.<init>(r0)
            r0 = 0
            r14.<init>(r15, r0, r5, r0)
            return r14
        L_0x0087:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r14
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r7 = r6.iterator()
        L_0x0093:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d5
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9 = r1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00af:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00d1
            java.lang.Object r11 = r9.next()
            r12 = r11
            com.sugarcube.app.base.data.database.CachedCatalogItem r12 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r12
            com.sugarcube.core.network.models.CatalogItem r12 = r12.getCatalogItem()
            java.lang.Integer r12 = r12.getId()
            if (r12 != 0) goto L_0x00c7
            goto L_0x00af
        L_0x00c7:
            int r12 = r12.intValue()
            if (r12 != r8) goto L_0x00af
            r10.add(r11)
            goto L_0x00af
        L_0x00d1:
            r4.addAll(r10)
            goto L_0x0093
        L_0x00d5:
            r0.L$0 = r3
            r0.L$1 = r14
            r0.L$2 = r15
            r0.L$3 = r1
            r0.L$4 = r4
            r0.L$5 = r6
            r0.L$6 = r7
            r14 = 0
            r0.I$0 = r14
            r0.label = r5
            java.lang.Object r1 = r3.addItemsToCart(r4, r0)
            if (r1 != r2) goto L_0x00ef
            return r2
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.addItemsToCartByIds(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addItemsWithQtyToCart(java.util.List<XH.v<com.sugarcube.app.base.data.database.CachedCatalogItem, java.lang.Integer>> r17, dI.C17164e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.CatalogRepository$addItemsWithQtyToCart$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.app.base.data.source.CatalogRepository$addItemsWithQtyToCart$1 r3 = (com.sugarcube.app.base.data.source.CatalogRepository$addItemsWithQtyToCart$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.app.base.data.source.CatalogRepository$addItemsWithQtyToCart$1 r3 = new com.sugarcube.app.base.data.source.CatalogRepository$addItemsWithQtyToCart$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.label
            r7 = 2
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x0080
            if (r6 == r8) goto L_0x005f
            if (r6 != r7) goto L_0x0057
            java.lang.Object r0 = r3.L$7
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r3.L$6
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r3.L$5
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = r3.L$4
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r3.L$3
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r3.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r0 = (com.sugarcube.app.base.data.source.CatalogRepository) r0
        L_0x004f:
            XH.y.b(r4)     // Catch:{ all -> 0x0054 }
            goto L_0x0189
        L_0x0054:
            r0 = move-exception
            goto L_0x0193
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005f:
            java.lang.Object r0 = r3.L$7
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r3.L$6
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r3.L$5
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.L$4
            XH.v r0 = (XH.v) r0
            java.lang.Object r0 = r3.L$3
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r3.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r0 = (com.sugarcube.app.base.data.source.CatalogRepository) r0
            goto L_0x004f
        L_0x0080:
            XH.y.b(r4)
            boolean r4 = r17.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0096
            com.sugarcube.app.base.data.Result$Error r0 = new com.sugarcube.app.base.data.Result$Error     // Catch:{ all -> 0x0054 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "No items provided"
            r2.<init>(r3)     // Catch:{ all -> 0x0054 }
            r0.<init>(r2, r9, r7, r9)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0096:
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x0054 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0054 }
            r6.<init>()     // Catch:{ all -> 0x0054 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0054 }
        L_0x00a2:
            boolean r10 = r4.hasNext()     // Catch:{ all -> 0x0054 }
            if (r10 == 0) goto L_0x00d1
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x0054 }
            r11 = r10
            XH.v r11 = (XH.v) r11     // Catch:{ all -> 0x0054 }
            java.lang.Object r11 = r11.c()     // Catch:{ all -> 0x0054 }
            com.sugarcube.app.base.data.database.CachedCatalogItem r11 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r11     // Catch:{ all -> 0x0054 }
            com.sugarcube.core.network.models.CatalogItem r11 = r11.getCatalogItem()     // Catch:{ all -> 0x0054 }
            java.lang.String r11 = r11.getLocalItemNumber()     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x0054 }
            if (r12 != 0) goto L_0x00cb
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0054 }
            r12.<init>()     // Catch:{ all -> 0x0054 }
            r6.put(r11, r12)     // Catch:{ all -> 0x0054 }
        L_0x00cb:
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0054 }
            r12.add(r10)     // Catch:{ all -> 0x0054 }
            goto L_0x00a2
        L_0x00d1:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0054 }
            r4.<init>()     // Catch:{ all -> 0x0054 }
            java.util.Set r10 = r6.entrySet()     // Catch:{ all -> 0x0054 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0054 }
        L_0x00de:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0054 }
            r12 = 0
            if (r11 == 0) goto L_0x0127
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0054 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0054 }
            java.lang.Object r13 = r11.getKey()     // Catch:{ all -> 0x0054 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0054 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x0054 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0054 }
            if (r13 == 0) goto L_0x0120
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch:{ all -> 0x0054 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0054 }
        L_0x00ff:
            boolean r14 = r11.hasNext()     // Catch:{ all -> 0x0054 }
            if (r14 == 0) goto L_0x0117
            java.lang.Object r14 = r11.next()     // Catch:{ all -> 0x0054 }
            XH.v r14 = (XH.v) r14     // Catch:{ all -> 0x0054 }
            java.lang.Object r14 = r14.d()     // Catch:{ all -> 0x0054 }
            java.lang.Number r14 = (java.lang.Number) r14     // Catch:{ all -> 0x0054 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0054 }
            int r12 = r12 + r14
            goto L_0x00ff
        L_0x0117:
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.b.e(r12)     // Catch:{ all -> 0x0054 }
            XH.v r11 = XH.C16796C.a(r13, r11)     // Catch:{ all -> 0x0054 }
            goto L_0x0121
        L_0x0120:
            r11 = r9
        L_0x0121:
            if (r11 == 0) goto L_0x00de
            r4.add(r11)     // Catch:{ all -> 0x0054 }
            goto L_0x00de
        L_0x0127:
            int r11 = r4.size()     // Catch:{ all -> 0x0054 }
            if (r11 != r8) goto L_0x0166
            java.lang.Object r13 = YH.C16877v.w0(r4)     // Catch:{ all -> 0x0054 }
            XH.v r13 = (XH.v) r13     // Catch:{ all -> 0x0054 }
            java.lang.Object r14 = r13.a()     // Catch:{ all -> 0x0054 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0054 }
            java.lang.Object r15 = r13.b()     // Catch:{ all -> 0x0054 }
            java.lang.Number r15 = (java.lang.Number) r15     // Catch:{ all -> 0x0054 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x0054 }
            com.sugarcube.app.base.external.interactions.CartInteractions r9 = r1.cartInteractions     // Catch:{ all -> 0x0054 }
            r3.L$0 = r1     // Catch:{ all -> 0x0054 }
            r3.L$1 = r0     // Catch:{ all -> 0x0054 }
            r3.L$2 = r2     // Catch:{ all -> 0x0054 }
            r3.L$3 = r4     // Catch:{ all -> 0x0054 }
            r3.L$4 = r13     // Catch:{ all -> 0x0054 }
            r3.L$5 = r14     // Catch:{ all -> 0x0054 }
            r3.L$6 = r6     // Catch:{ all -> 0x0054 }
            r3.L$7 = r10     // Catch:{ all -> 0x0054 }
            r3.I$0 = r11     // Catch:{ all -> 0x0054 }
            r3.I$1 = r15     // Catch:{ all -> 0x0054 }
            r3.I$2 = r12     // Catch:{ all -> 0x0054 }
            r3.I$3 = r12     // Catch:{ all -> 0x0054 }
            r3.label = r8     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r9.addItem(r14, r15, r3)     // Catch:{ all -> 0x0054 }
            if (r0 != r5) goto L_0x0189
            return r5
        L_0x0166:
            com.sugarcube.app.base.external.interactions.CartInteractions r9 = r1.cartInteractions     // Catch:{ all -> 0x0054 }
            r3.L$0 = r1     // Catch:{ all -> 0x0054 }
            r3.L$1 = r0     // Catch:{ all -> 0x0054 }
            r3.L$2 = r2     // Catch:{ all -> 0x0054 }
            r3.L$3 = r4     // Catch:{ all -> 0x0054 }
            r3.L$4 = r6     // Catch:{ all -> 0x0054 }
            r3.L$5 = r4     // Catch:{ all -> 0x0054 }
            r3.L$6 = r6     // Catch:{ all -> 0x0054 }
            r3.L$7 = r10     // Catch:{ all -> 0x0054 }
            r3.I$0 = r11     // Catch:{ all -> 0x0054 }
            r3.I$1 = r12     // Catch:{ all -> 0x0054 }
            r3.I$2 = r12     // Catch:{ all -> 0x0054 }
            r3.I$3 = r12     // Catch:{ all -> 0x0054 }
            r3.label = r7     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r9.addItems(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r0 != r5) goto L_0x0189
            return r5
        L_0x0189:
            com.sugarcube.app.base.data.Result$Success r0 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r8)     // Catch:{ all -> 0x0054 }
            r0.<init>(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x019a
        L_0x0193:
            com.sugarcube.app.base.data.Result$Error r2 = new com.sugarcube.app.base.data.Result$Error
            r3 = 0
            r2.<init>(r0, r3, r7, r3)
            r0 = r2
        L_0x019a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.addItemsWithQtyToCart(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object convertCatalogItems(java.util.List<com.sugarcube.core.network.models.CatalogItem> r19, int r20, dI.C17164e<? super java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>> r21) {
        /*
            r18 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.sugarcube.app.base.data.source.CatalogRepository$convertCatalogItems$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.sugarcube.app.base.data.source.CatalogRepository$convertCatalogItems$1 r1 = (com.sugarcube.app.base.data.source.CatalogRepository$convertCatalogItems$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            com.sugarcube.app.base.data.source.CatalogRepository$convertCatalogItems$1 r1 = new com.sugarcube.app.base.data.source.CatalogRepository$convertCatalogItems$1
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x00a8
            if (r5 == r7) goto L_0x0060
            if (r5 != r6) goto L_0x0058
            int r0 = r1.I$1
            int r5 = r1.I$0
            java.lang.Object r7 = r1.L$8
            QJ.Y r7 = (QJ.Y) r7
            java.lang.Object r7 = r1.L$6
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r9 = r1.L$5
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r10 = r1.L$4
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.L$3
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r1.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r13 = r1.L$1
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r1.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r14 = (com.sugarcube.app.base.data.source.CatalogRepository) r14
            XH.y.b(r3)
            r2 = 0
            goto L_0x01d4
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            int r0 = r1.I$2
            int r5 = r1.I$1
            int r9 = r1.I$0
            java.lang.Object r10 = r1.L$11
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r1.L$10
            com.sugarcube.core.network.models.CatalogItem r11 = (com.sugarcube.core.network.models.CatalogItem) r11
            java.lang.Object r11 = r1.L$8
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.L$7
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r13 = r1.L$6
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r1.L$5
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r1.L$4
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r8 = r1.L$2
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r1.L$1
            java.util.List r7 = (java.util.List) r7
            r19 = r0
            java.lang.Object r0 = r1.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r0 = (com.sugarcube.app.base.data.source.CatalogRepository) r0
            XH.y.b(r3)
            r2 = r5
            r16 = r15
            r5 = r0
            r0 = r7
            r15 = r14
            r7 = r1
            r1 = r9
            r14 = r13
            r9 = r6
            r13 = r11
            r11 = r12
            r12 = 1
            r6 = r19
            goto L_0x016e
        L_0x00a8:
            XH.y.b(r3)
            r3 = 0
            if (r19 == 0) goto L_0x00b6
            boolean r5 = r19.isEmpty()
            r6 = 1
            if (r5 != r6) goto L_0x00b6
            return r3
        L_0x00b6:
            r5 = 10
            if (r20 != 0) goto L_0x00fe
            if (r19 == 0) goto L_0x00fd
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = YH.C16877v.y(r0, r5)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r1 = r0.next()
            r10 = r1
            com.sugarcube.core.network.models.CatalogItem r10 = (com.sugarcube.core.network.models.CatalogItem) r10
            java.util.List r1 = r10.getFeatures()
            if (r1 == 0) goto L_0x00eb
            java.lang.String r4 = "draco"
            boolean r1 = r1.contains(r4)
            r4 = 1
            if (r1 != r4) goto L_0x00eb
            r7 = 1
            goto L_0x00ec
        L_0x00eb:
            r7 = 0
        L_0x00ec:
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = new com.sugarcube.app.base.data.database.CachedCatalogItem
            r11 = 27
            r12 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.add(r1)
            goto L_0x00cd
        L_0x00fd:
            return r3
        L_0x00fe:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r19 == 0) goto L_0x018a
            r7 = r19
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r5 = YH.C16877v.y(r7, r5)
            r8.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
            r9 = r3
            r11 = r5
            r15 = r6
            r13 = r7
            r14 = r13
            r10 = r8
            r6 = 0
            r8 = 0
            r3 = r0
            r7 = r1
            r5 = r2
            r0 = r19
            r1 = r20
        L_0x012a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0186
            java.lang.Object r12 = r11.next()
            r2 = r12
            com.sugarcube.core.network.models.CatalogItem r2 = (com.sugarcube.core.network.models.CatalogItem) r2
            r7.L$0 = r5
            r7.L$1 = r0
            r7.L$2 = r3
            r7.L$3 = r9
            r7.L$4 = r15
            r7.L$5 = r14
            r7.L$6 = r13
            r7.L$7 = r10
            r7.L$8 = r11
            r7.L$9 = r12
            r7.L$10 = r2
            r7.L$11 = r10
            r7.I$0 = r1
            r7.I$1 = r8
            r7.I$2 = r6
            r12 = 0
            r7.I$3 = r12
            r12 = 1
            r7.label = r12
            java.lang.Object r2 = r5.cacheCatalogItemDeferred(r2, r1, r7)
            if (r2 != r4) goto L_0x0162
            return r4
        L_0x0162:
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r11
            r11 = r10
            r17 = r3
            r3 = r2
            r2 = r8
            r8 = r17
        L_0x016e:
            QJ.Y r3 = (QJ.Y) r3
            boolean r3 = r9.add(r3)
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r3)
            r10.add(r3)
            r3 = r8
            r10 = r11
            r11 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r8 = r2
            r2 = r18
            goto L_0x012a
        L_0x0186:
            java.util.List r10 = (java.util.List) r10
            r6 = r15
            goto L_0x0193
        L_0x018a:
            r5 = r18
            r7 = r1
            r9 = r3
            r1 = r20
            r3 = r0
            r0 = r19
        L_0x0193:
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r13 = r0
            r12 = r3
            r14 = r5
            r10 = r6
            r11 = r9
            r0 = 0
            r5 = r1
            r9 = r2
            r1 = r7
            r7 = r8
        L_0x01a4:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01da
            java.lang.Object r2 = r7.next()
            r3 = r2
            QJ.Y r3 = (QJ.Y) r3
            r1.L$0 = r14
            r1.L$1 = r13
            r1.L$2 = r12
            r1.L$3 = r11
            r1.L$4 = r10
            r1.L$5 = r9
            r1.L$6 = r7
            r1.L$7 = r2
            r1.L$8 = r3
            r1.I$0 = r5
            r1.I$1 = r0
            r2 = 0
            r1.I$2 = r2
            r6 = 2
            r1.label = r6
            java.lang.Object r3 = r3.f(r1)
            if (r3 != r4) goto L_0x01d4
            return r4
        L_0x01d4:
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r3
            r10.add(r3)
            goto L_0x01a4
        L_0x01da:
            java.util.List r0 = HK.C15864d.W(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.convertCatalogItems(java.util.List, int, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        if (r0 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchAssetsForCatalogItem(com.sugarcube.app.base.data.database.CachedCatalogItem r25, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogItem> r26) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchAssetsForCatalogItem$1
            if (r0 == 0) goto L_0x001a
            r0 = r9
            com.sugarcube.app.base.data.source.CatalogRepository$fetchAssetsForCatalogItem$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchAssetsForCatalogItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x001a
            int r1 = r1 - r2
            r0.label = r1
        L_0x0018:
            r10 = r0
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchAssetsForCatalogItem$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchAssetsForCatalogItem$1
            r0.<init>(r7, r9)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r10.result
            java.lang.Object r11 = eI.C17187b.f()
            int r1 = r10.label
            r12 = 2
            r13 = 0
            r14 = 1
            if (r1 == 0) goto L_0x0080
            if (r1 == r14) goto L_0x0060
            if (r1 != r12) goto L_0x0058
            int r13 = r10.I$1
            java.lang.Object r1 = r10.L$7
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r2 = r10.L$6
            com.sugarcube.app.base.data.database.CachedCatalogItem r2 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r2
            java.lang.Object r3 = r10.L$5
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r3 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r3
            java.lang.Object r3 = r10.L$4
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r3 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r3
            java.lang.Object r3 = r10.L$3
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r3 = (com.sugarcube.app.base.data.database.SalesDressedBedDataKey) r3
            java.lang.Object r3 = r10.L$2
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r10.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r3
            java.lang.Object r3 = r10.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r0)
            goto L_0x00ef
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            java.lang.Object r1 = r10.L$6
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r2 = r10.L$5
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r2 = r10.L$4
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r2 = r10.L$3
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r2 = r10.L$2
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r10.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r3
            java.lang.Object r4 = r10.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r4 = (com.sugarcube.app.base.data.source.CatalogRepository) r4
            XH.y.b(r0)
            goto L_0x00b4
        L_0x0080:
            XH.y.b(r0)
            com.sugarcube.core.network.models.CatalogItem r0 = r25.getCatalogItem()
            android.net.Uri r2 = r0.getAssetUrl()
            if (r2 == 0) goto L_0x00c0
            int r1 = r25.getId()
            r10.L$0 = r7
            r10.L$1 = r8
            r10.L$2 = r9
            r10.L$3 = r2
            r10.L$4 = r2
            r10.L$5 = r2
            r10.L$6 = r8
            r10.I$0 = r13
            r10.label = r14
            r3 = 0
            r5 = 4
            r6 = 0
            r0 = r24
            r4 = r10
            java.lang.Object r0 = getAsset$default(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r11) goto L_0x00b0
            return r11
        L_0x00b0:
            r4 = r7
            r1 = r8
            r3 = r1
            r2 = r9
        L_0x00b4:
            java.io.File r0 = (java.io.File) r0
            if (r0 != 0) goto L_0x00b9
            goto L_0x00c4
        L_0x00b9:
            r23 = r1
            r1 = r0
            r0 = r2
            r2 = r23
            goto L_0x00cc
        L_0x00c0:
            r4 = r7
            r1 = r8
            r3 = r1
            r2 = r9
        L_0x00c4:
            java.io.File r0 = new java.io.File
            java.lang.String r5 = ""
            r0.<init>(r5)
            goto L_0x00b9
        L_0x00cc:
            com.sugarcube.app.base.data.database.SalesDressedBedDataKey r5 = r3.getSdbKey()
            if (r5 == 0) goto L_0x00f8
            r10.L$0 = r4
            r10.L$1 = r3
            r10.L$2 = r0
            r10.L$3 = r5
            r10.L$4 = r5
            r10.L$5 = r5
            r10.L$6 = r2
            r10.L$7 = r1
            r10.I$0 = r13
            r10.I$1 = r13
            r10.label = r12
            java.lang.Object r0 = r4.getSDBAssets(r5, r14, r10)
            if (r0 != r11) goto L_0x00ef
            return r11
        L_0x00ef:
            java.util.Map r0 = (java.util.Map) r0
        L_0x00f1:
            r19 = r0
            r15 = r1
            r14 = r2
            r17 = r13
            goto L_0x00fa
        L_0x00f8:
            r0 = 0
            goto L_0x00f1
        L_0x00fa:
            r21 = 46
            r22 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = com.sugarcube.app.base.data.database.CachedCatalogItem.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchAssetsForCatalogItem(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    public Object fetchCatalogCategories(String str, C17164e<? super List<CatalogCategory>> eVar) {
        return getRemoteSource().fetchCatalogCategories(str, eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogItems(com.sugarcube.core.network.models.RoomType r12, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r7 = eI.C17187b.f()
            int r2 = r0.label
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r3) goto L_0x0046
            if (r2 != r9) goto L_0x003e
            java.lang.Object r12 = r0.L$3
            com.sugarcube.app.base.data.Result r12 = (com.sugarcube.app.base.data.Result) r12
            java.lang.Object r12 = r0.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.L$1
            com.sugarcube.core.network.models.RoomType r12 = (com.sugarcube.core.network.models.RoomType) r12
            java.lang.Object r13 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r1)
            goto L_0x00b6
        L_0x003e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0046:
            java.lang.Object r12 = r0.L$2
            r13 = r12
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r12 = r0.L$1
            com.sugarcube.core.network.models.RoomType r12 = (com.sugarcube.core.network.models.RoomType) r12
            java.lang.Object r2 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r2 = (com.sugarcube.app.base.data.source.CatalogRepository) r2
            XH.y.b(r1)
            r10 = r1
            r1 = r13
            r13 = r2
            r2 = r10
            goto L_0x0086
        L_0x005b:
            XH.y.b(r1)
            androidx.lifecycle.K r1 = r11.get_isRefreshing()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.postValue(r2)
            r11.roomType = r12
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r11.getRemoteSource()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r12
            r4 = r0
            java.lang.Object r1 = com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource.DefaultImpls.fetchCatalogPage$default((com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource) r1, (com.sugarcube.core.network.models.RoomType) r2, (android.net.Uri) r3, (dI.C17164e) r4, (int) r5, (java.lang.Object) r6)
            if (r1 != r7) goto L_0x0083
            return r7
        L_0x0083:
            r2 = r1
            r1 = r13
            r13 = r11
        L_0x0086:
            com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Error
            if (r3 == 0) goto L_0x0098
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            return r2
        L_0x0098:
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Success
            if (r3 == 0) goto L_0x00ee
            r3 = r2
            com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3
            java.lang.Object r3 = r3.getData()
            com.sugarcube.core.network.models.CatalogPage r3 = (com.sugarcube.core.network.models.CatalogPage) r3
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r1
            r0.L$3 = r2
            r0.label = r9
            java.lang.Object r1 = r13.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r3, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r0)
            if (r1 != r7) goto L_0x00b6
            return r7
        L_0x00b6:
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            r0 = 0
            if (r1 == 0) goto L_0x00c0
            android.net.Uri r2 = r1.getNextUrl()
            goto L_0x00c1
        L_0x00c0:
            r2 = r0
        L_0x00c1:
            r13.putNextPageToken(r12, r2)
            if (r1 == 0) goto L_0x00ce
            int r0 = r1.getTotalCount()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
        L_0x00ce:
            r13.putCount(r12, r0)
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            com.sugarcube.app.base.data.Result$Success r12 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x00e6
            java.util.List r13 = r1.getPageItems()
            if (r13 != 0) goto L_0x00ea
        L_0x00e6:
            java.util.List r13 = YH.C16877v.n()
        L_0x00ea:
            r12.<init>(r13)
            return r12
        L_0x00ee:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItems(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogPage>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.net.Uri} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchCatalogItemsForCategory(java.lang.String r7, android.net.Uri r8, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForCategory$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForCategory$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForCategory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForCategory$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForCategory$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x005e
            if (r3 == r4) goto L_0x0048
            if (r3 != r5) goto L_0x0040
            java.lang.Object r7 = r0.L$4
            com.sugarcube.app.base.data.Result r7 = (com.sugarcube.app.base.data.Result) r7
            java.lang.Object r7 = r0.L$3
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$2
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r7 = (com.sugarcube.app.base.data.source.CatalogRepository) r7
            XH.y.b(r1)
            goto L_0x009e
        L_0x0040:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0048:
            java.lang.Object r7 = r0.L$3
            r9 = r7
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r7 = r0.L$2
            r8 = r7
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            goto L_0x0077
        L_0x005e:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r6.getRemoteSource()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r1 = r1.fetchCatalogPageForCategory(r7, r8, r0)
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r3 = r6
        L_0x0077:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r4 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r4 == 0) goto L_0x007e
            goto L_0x00b6
        L_0x007e:
            boolean r4 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r4 == 0) goto L_0x00b7
            r4 = r1
            com.sugarcube.app.base.data.Result$Success r4 = (com.sugarcube.app.base.data.Result.Success) r4
            java.lang.Object r4 = r4.getData()
            com.sugarcube.core.network.models.CatalogPage r4 = (com.sugarcube.core.network.models.CatalogPage) r4
            r0.L$0 = r3
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.L$4 = r1
            r0.label = r5
            java.lang.Object r1 = r3.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r4, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r0)
            if (r1 != r2) goto L_0x009e
            return r2
        L_0x009e:
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            if (r1 == 0) goto L_0x00a9
            com.sugarcube.app.base.data.Result$Success r7 = new com.sugarcube.app.base.data.Result$Success
            r7.<init>(r1)
            r1 = r7
            goto L_0x00b6
        L_0x00a9:
            com.sugarcube.app.base.data.Result$Error r1 = new com.sugarcube.app.base.data.Result$Error
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Response body is null"
            r7.<init>(r8)
            r8 = 0
            r1.<init>(r7, r8, r5, r8)
        L_0x00b6:
            return r1
        L_0x00b7:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItemsForCategory(java.lang.String, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogPage>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.net.Uri} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchCatalogItemsForRoomType(com.sugarcube.core.network.models.RoomType r7, android.net.Uri r8, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForRoomType$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForRoomType$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForRoomType$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForRoomType$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForRoomType$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005e
            if (r3 == r5) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r7 = r0.L$4
            com.sugarcube.app.base.data.Result r7 = (com.sugarcube.app.base.data.Result) r7
            java.lang.Object r7 = r0.L$3
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$2
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r7 = r0.L$1
            com.sugarcube.core.network.models.RoomType r7 = (com.sugarcube.core.network.models.RoomType) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r7 = (com.sugarcube.app.base.data.source.CatalogRepository) r7
            XH.y.b(r1)
            goto L_0x009e
        L_0x0040:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0048:
            java.lang.Object r7 = r0.L$3
            r9 = r7
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r7 = r0.L$2
            r8 = r7
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r7 = r0.L$1
            com.sugarcube.core.network.models.RoomType r7 = (com.sugarcube.core.network.models.RoomType) r7
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            goto L_0x0077
        L_0x005e:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r6.getRemoteSource()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r5
            java.lang.Object r1 = r1.fetchCatalogPage((com.sugarcube.core.network.models.RoomType) r7, (android.net.Uri) r8, (dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>>) r0)
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r3 = r6
        L_0x0077:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r5 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r5 == 0) goto L_0x007e
            return r1
        L_0x007e:
            boolean r5 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r5 == 0) goto L_0x00b0
            r5 = r1
            com.sugarcube.app.base.data.Result$Success r5 = (com.sugarcube.app.base.data.Result.Success) r5
            java.lang.Object r5 = r5.getData()
            com.sugarcube.core.network.models.CatalogPage r5 = (com.sugarcube.core.network.models.CatalogPage) r5
            r0.L$0 = r3
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.L$4 = r1
            r0.label = r4
            java.lang.Object r1 = r3.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r5, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r0)
            if (r1 != r2) goto L_0x009e
            return r2
        L_0x009e:
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            com.sugarcube.app.base.data.Result$Success r7 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x00a8
            r7.<init>(r1)
            return r7
        L_0x00a8:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Response body is null"
            r7.<init>(r8)
            throw r7
        L_0x00b0:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItemsForRoomType(com.sugarcube.core.network.models.RoomType, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogSearchPage>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchCatalogItemsForSearchTerm(java.lang.String r7, java.lang.String r8, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogSearchPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSearchTerm$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSearchTerm$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSearchTerm$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSearchTerm$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSearchTerm$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005e
            if (r3 == r5) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            java.lang.Object r7 = r0.L$4
            com.sugarcube.app.base.data.Result r7 = (com.sugarcube.app.base.data.Result) r7
            java.lang.Object r7 = r0.L$3
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r7 = (com.sugarcube.app.base.data.source.CatalogRepository) r7
            XH.y.b(r1)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0048:
            java.lang.Object r7 = r0.L$3
            r9 = r7
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r7 = r0.L$2
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            goto L_0x0079
        L_0x005e:
            XH.y.b(r1)
            r6.searchTerm = r7
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r6.getRemoteSource()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r5
            java.lang.Object r1 = r1.fetchCatalogSearchResultsPage(r7, r8, r0)
            if (r1 != r2) goto L_0x0078
            return r2
        L_0x0078:
            r3 = r6
        L_0x0079:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r5 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r5 == 0) goto L_0x0080
            return r1
        L_0x0080:
            boolean r5 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r5 == 0) goto L_0x00b2
            r5 = r1
            com.sugarcube.app.base.data.Result$Success r5 = (com.sugarcube.app.base.data.Result.Success) r5
            java.lang.Object r5 = r5.getData()
            com.sugarcube.core.network.models.CatalogSearchPage r5 = (com.sugarcube.core.network.models.CatalogSearchPage) r5
            r0.L$0 = r3
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.L$4 = r1
            r0.label = r4
            java.lang.Object r1 = r3.cacheCatalogPage((com.sugarcube.core.network.models.CatalogSearchPage) r5, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogSearchPage>) r0)
            if (r1 != r2) goto L_0x00a0
            return r2
        L_0x00a0:
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogSearchPage) r1
            com.sugarcube.app.base.data.Result$Success r7 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x00aa
            r7.<init>(r1)
            return r7
        L_0x00aa:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Response body is null"
            r7.<init>(r8)
            throw r7
        L_0x00b2:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItemsForSearchTerm(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogPage>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchCatalogItemsForSwap(int r7, android.net.Uri r8, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.app.base.data.database.CachedCatalogPage>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSwap$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSwap$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSwap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSwap$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItemsForSwap$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r7 = r0.L$3
            com.sugarcube.app.base.data.Result r7 = (com.sugarcube.app.base.data.Result) r7
            java.lang.Object r7 = r0.L$2
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$1
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r7 = (com.sugarcube.app.base.data.source.CatalogRepository) r7
            XH.y.b(r1)
            goto L_0x0097
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$2
            r9 = r8
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r8 = r0.L$1
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            goto L_0x0070
        L_0x0057:
            XH.y.b(r1)
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r6.getRemoteSource()
            r0.L$0 = r6
            r0.L$1 = r8
            r0.L$2 = r9
            r0.I$0 = r7
            r0.label = r5
            java.lang.Object r1 = r1.fetchCatalogSwapSuggestionsPage(r7, r8, r0)
            if (r1 != r2) goto L_0x006f
            return r2
        L_0x006f:
            r3 = r6
        L_0x0070:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r5 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r5 == 0) goto L_0x0077
            return r1
        L_0x0077:
            boolean r5 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r5 == 0) goto L_0x00a9
            r5 = r1
            com.sugarcube.app.base.data.Result$Success r5 = (com.sugarcube.app.base.data.Result.Success) r5
            java.lang.Object r5 = r5.getData()
            com.sugarcube.core.network.models.CatalogPage r5 = (com.sugarcube.core.network.models.CatalogPage) r5
            r0.L$0 = r3
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r1
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r1 = r3.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r5, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r0)
            if (r1 != r2) goto L_0x0097
            return r2
        L_0x0097:
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            com.sugarcube.app.base.data.Result$Success r7 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x00a1
            r7.<init>(r1)
            return r7
        L_0x00a1:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Response body is null"
            r7.<init>(r8)
            throw r7
        L_0x00a9:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItemsForSwap(int, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0 A[LOOP:0: B:30:0x00aa->B:32:0x00b0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0222 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductInformation(java.util.List<java.lang.Integer> r18, dI.C17164e<? super java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformation$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformation$1 r3 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformation$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.label = r4
        L_0x0018:
            r7 = r3
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformation$1 r3 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformation$1
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r7.result
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r7.label
            r5 = 1
            r6 = 2
            r11 = 0
            if (r4 == 0) goto L_0x0063
            if (r4 == r5) goto L_0x004e
            if (r4 != r6) goto L_0x0046
            java.lang.Object r1 = r7.L$3
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r7.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r7.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r7.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r1 = (com.sugarcube.app.base.data.source.CatalogRepository) r1
            XH.y.b(r3)
            goto L_0x0223
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004e:
            java.lang.Object r1 = r7.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r7.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r7.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r4 = (com.sugarcube.app.base.data.source.CatalogRepository) r4
            XH.y.b(r3)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x0083
        L_0x0063:
            XH.y.b(r3)
            if (r1 == 0) goto L_0x006f
            boolean r3 = r18.isEmpty()
            if (r3 != r5) goto L_0x006f
            return r11
        L_0x006f:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r3 = r17.getRemoteSource()
            r7.L$0 = r0
            r7.L$1 = r1
            r7.L$2 = r2
            r7.label = r5
            java.lang.Object r3 = r3.fetchProductInfo(r1, r7)
            if (r3 != r10) goto L_0x0082
            return r10
        L_0x0082:
            r4 = r0
        L_0x0083:
            java.util.List r3 = (java.util.List) r3
            if (r1 == 0) goto L_0x020e
            if (r3 == 0) goto L_0x020e
            int r8 = r1.size()
            int r9 = r3.size()
            if (r8 == r9) goto L_0x020e
            com.sugarcube.core.logger.Priority r8 = com.sugarcube.core.logger.Priority.WARN
            r9 = r1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r12 = r3
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = YH.C16877v.y(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x00aa:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00be
            java.lang.Object r14 = r12.next()
            com.sugarcube.core.network.models.CatalogItem r14 = (com.sugarcube.core.network.models.CatalogItem) r14
            java.lang.Integer r14 = r14.getId()
            r13.add(r14)
            goto L_0x00aa
        L_0x00be:
            java.util.Set r12 = YH.C16877v.y1(r13)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Set r9 = YH.C16877v.h1(r9, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "No catalog items found for : "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            java.lang.String r12 = ""
            if (r9 != 0) goto L_0x00de
            r9 = r12
        L_0x00de:
            int[] r13 = com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformation$$inlined$logWarn$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r13[r8]
            java.lang.String r13 = " "
            java.lang.String r14 = "Kt"
            r15 = 36
            if (r8 == r5) goto L_0x01d9
            if (r8 == r6) goto L_0x01a3
            r5 = 3
            if (r8 == r5) goto L_0x016d
            r5 = 4
            if (r8 == r5) goto L_0x0136
            r5 = 5
            if (r8 != r5) goto L_0x0130
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x0119:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r5, r8)
            goto L_0x020e
        L_0x0130:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x0136:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x0152
            goto L_0x0156
        L_0x0152:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x0156:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r5, r8)
            goto L_0x020e
        L_0x016d:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x0189
            goto L_0x018d
        L_0x0189:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x018d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r5, r8)
            goto L_0x020e
        L_0x01a3:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x01bf
            goto L_0x01c3
        L_0x01bf:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x01c3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
            goto L_0x020e
        L_0x01d9:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x01f5
            goto L_0x01f9
        L_0x01f5:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x01f9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r5, r8)
        L_0x020e:
            r7.L$0 = r4
            r7.L$1 = r1
            r7.L$2 = r2
            r7.L$3 = r3
            r7.label = r6
            r6 = 0
            r8 = 2
            r9 = 0
            r5 = r3
            java.lang.Object r3 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r4, r5, r6, r7, r8, r9)
            if (r3 != r10) goto L_0x0223
            return r10
        L_0x0223:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x022b
            java.util.List r11 = HK.C15864d.W(r3)
        L_0x022b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchProductInformation(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7 A[LOOP:0: B:25:0x00a1->B:27:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0219 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductInformationLocalIds(java.util.List<java.lang.String> r18, dI.C17164e<? super java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformationLocalIds$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformationLocalIds$1 r3 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformationLocalIds$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.label = r4
        L_0x0018:
            r7 = r3
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformationLocalIds$1 r3 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformationLocalIds$1
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r7.result
            java.lang.Object r10 = eI.C17187b.f()
            int r4 = r7.label
            r5 = 1
            r6 = 2
            r11 = 0
            if (r4 == 0) goto L_0x0063
            if (r4 == r5) goto L_0x004e
            if (r4 != r6) goto L_0x0046
            java.lang.Object r1 = r7.L$3
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r7.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r7.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r7.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r1 = (com.sugarcube.app.base.data.source.CatalogRepository) r1
            XH.y.b(r3)
            goto L_0x021a
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004e:
            java.lang.Object r1 = r7.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r7.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r7.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r4 = (com.sugarcube.app.base.data.source.CatalogRepository) r4
            XH.y.b(r3)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x007a
        L_0x0063:
            XH.y.b(r3)
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r3 = r17.getRemoteSource()
            r7.L$0 = r0
            r7.L$1 = r1
            r7.L$2 = r2
            r7.label = r5
            java.lang.Object r3 = r3.fetchProductInfoLocalIds(r1, r7)
            if (r3 != r10) goto L_0x0079
            return r10
        L_0x0079:
            r4 = r0
        L_0x007a:
            java.util.List r3 = (java.util.List) r3
            if (r1 == 0) goto L_0x0205
            if (r3 == 0) goto L_0x0205
            int r8 = r1.size()
            int r9 = r3.size()
            if (r8 == r9) goto L_0x0205
            com.sugarcube.core.logger.Priority r8 = com.sugarcube.core.logger.Priority.WARN
            r9 = r1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r12 = r3
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = YH.C16877v.y(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x00a1:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00b5
            java.lang.Object r14 = r12.next()
            com.sugarcube.core.network.models.CatalogItem r14 = (com.sugarcube.core.network.models.CatalogItem) r14
            java.lang.Integer r14 = r14.getId()
            r13.add(r14)
            goto L_0x00a1
        L_0x00b5:
            java.util.Set r12 = YH.C16877v.y1(r13)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Set r9 = YH.C16877v.h1(r9, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "No catalog items found for localIds: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            java.lang.String r12 = ""
            if (r9 != 0) goto L_0x00d5
            r9 = r12
        L_0x00d5:
            int[] r13 = com.sugarcube.app.base.data.source.CatalogRepository$fetchProductInformationLocalIds$$inlined$logWarn$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r13[r8]
            java.lang.String r13 = " "
            java.lang.String r14 = "Kt"
            r15 = 36
            if (r8 == r5) goto L_0x01d0
            if (r8 == r6) goto L_0x019a
            r5 = 3
            if (r8 == r5) goto L_0x0164
            r5 = 4
            if (r8 == r5) goto L_0x012d
            r5 = 5
            if (r8 != r5) goto L_0x0127
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x010c
            goto L_0x0110
        L_0x010c:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x0110:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r5, r8)
            goto L_0x0205
        L_0x0127:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x012d:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x0149
            goto L_0x014d
        L_0x0149:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x014d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r5, r8)
            goto L_0x0205
        L_0x0164:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x0184:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r5, r8)
            goto L_0x0205
        L_0x019a:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x01b6
            goto L_0x01ba
        L_0x01b6:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x01ba:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
            goto L_0x0205
        L_0x01d0:
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            java.lang.String r8 = HJ.C15854t.s1(r5, r15, r11, r6, r11)
            r15 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r15, r11, r6, r11)
            int r15 = r8.length()
            if (r15 != 0) goto L_0x01ec
            goto L_0x01f0
        L_0x01ec:
            java.lang.String r5 = HJ.C15854t.P0(r8, r14)
        L_0x01f0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r13)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r5, r8)
        L_0x0205:
            r7.L$0 = r4
            r7.L$1 = r1
            r7.L$2 = r2
            r7.L$3 = r3
            r7.label = r6
            r6 = 0
            r8 = 2
            r9 = 0
            r5 = r3
            java.lang.Object r3 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r4, r5, r6, r7, r8, r9)
            if (r3 != r10) goto L_0x021a
            return r10
        L_0x021a:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0222
            java.util.List r11 = HK.C15864d.W(r3)
        L_0x0222:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchProductInformationLocalIds(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b4 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductRecommendations(int r10, dI.C17164e<? super java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchProductRecommendations$1
            if (r0 == 0) goto L_0x0014
            r0 = r11
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductRecommendations$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchProductRecommendations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductRecommendations$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchProductRecommendations$1
            r0.<init>(r9, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0064
            if (r1 == r3) goto L_0x0047
            if (r1 != r2) goto L_0x003f
            java.lang.Object r10 = r4.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r4.L$2
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r10 = r4.L$1
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r10 = (com.sugarcube.app.base.data.source.CatalogRepository) r10
            XH.y.b(r0)
            goto L_0x00ab
        L_0x003f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0047:
            int r10 = r4.I$2
            int r11 = r4.I$1
            int r1 = r4.I$0
            java.lang.Object r3 = r4.L$2
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r5 = r4.L$1
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r6 = (com.sugarcube.app.base.data.source.CatalogRepository) r6
            XH.y.b(r0)
            r8 = r6
            r6 = r10
            r10 = r1
            r1 = r11
            r11 = r5
            r5 = r3
            r3 = r8
            goto L_0x008c
        L_0x0064:
            XH.y.b(r0)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r10)
            int r1 = r0.intValue()
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r5 = r9.getRemoteSource()
            r4.L$0 = r9
            r4.L$1 = r11
            r4.L$2 = r0
            r4.I$0 = r10
            r4.I$1 = r1
            r6 = 0
            r4.I$2 = r6
            r4.label = r3
            java.lang.Object r3 = r5.fetchProductRecommendations(r10, r4)
            if (r3 != r7) goto L_0x0089
            return r7
        L_0x0089:
            r5 = r0
            r0 = r3
            r3 = r9
        L_0x008c:
            java.util.List r0 = (java.util.List) r0
            r4.L$0 = r3
            r4.L$1 = r11
            r4.L$2 = r5
            r4.L$3 = r0
            r4.I$0 = r10
            r4.I$1 = r1
            r4.I$2 = r6
            r4.label = r2
            r10 = 0
            r5 = 2
            r6 = 0
            r1 = r3
            r2 = r0
            r3 = r10
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x00ab
            return r7
        L_0x00ab:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00b4
            java.util.List r10 = HK.C15864d.W(r0)
            goto L_0x00b5
        L_0x00b4:
            r10 = 0
        L_0x00b5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchProductRecommendations(int, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductVariants(java.lang.Integer r12, dI.C17164e<? super java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchProductVariants$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductVariants$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchProductVariants$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchProductVariants$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchProductVariants$1
            r0.<init>(r11, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r8 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x006b
            if (r1 == r3) goto L_0x004c
            if (r1 != r2) goto L_0x0044
            java.lang.Object r12 = r4.L$4
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r4.L$3
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r12 = r4.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r4.L$1
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r12 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r12 = (com.sugarcube.app.base.data.source.CatalogRepository) r12
            XH.y.b(r0)
            goto L_0x00b1
        L_0x0044:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x004c:
            int r12 = r4.I$1
            int r13 = r4.I$0
            java.lang.Object r1 = r4.L$3
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r3 = r4.L$2
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r5 = r4.L$1
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r6 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r6 = (com.sugarcube.app.base.data.source.CatalogRepository) r6
            XH.y.b(r0)
            r9 = r5
            r5 = r12
            r12 = r9
            r10 = r0
            r0 = r13
            r13 = r3
            r3 = r10
            goto L_0x0091
        L_0x006b:
            XH.y.b(r0)
            if (r12 == 0) goto L_0x00b9
            int r0 = r12.intValue()
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r11.getRemoteSource()
            r4.L$0 = r11
            r4.L$1 = r12
            r4.L$2 = r13
            r4.L$3 = r12
            r4.I$0 = r0
            r5 = 0
            r4.I$1 = r5
            r4.label = r3
            java.lang.Object r1 = r1.fetchProductVariants(r12, r4)
            if (r1 != r7) goto L_0x008e
            return r7
        L_0x008e:
            r6 = r11
            r3 = r1
            r1 = r12
        L_0x0091:
            java.util.List r3 = (java.util.List) r3
            r4.L$0 = r6
            r4.L$1 = r12
            r4.L$2 = r13
            r4.L$3 = r1
            r4.L$4 = r3
            r4.I$0 = r0
            r4.I$1 = r5
            r4.label = r2
            r12 = 0
            r5 = 2
            r13 = 0
            r1 = r6
            r2 = r3
            r3 = r12
            r6 = r13
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x00b1
            return r7
        L_0x00b1:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00b9
            java.util.List r8 = HK.C15864d.W(r0)
        L_0x00b9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchProductVariants(java.lang.Integer, dI.e):java.lang.Object");
    }

    public final CartInteractions getCartInteractions() {
        return this.cartInteractions;
    }

    public Object getCount(Object obj, C17164e<? super Integer> eVar) {
        return this.countMap.get(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object stepCatalogItems(com.sugarcube.core.network.models.RoomType r13, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$1 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$1 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$1
            r0.<init>(r12, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r8 = 0
            r2 = 3
            r3 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0091
            if (r1 == r5) goto L_0x0075
            if (r1 == r3) goto L_0x0057
            if (r1 != r2) goto L_0x004f
            java.lang.Object r13 = r4.L$6
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r4.L$5
            com.sugarcube.app.base.data.database.CachedCatalogPage r13 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r13
            java.lang.Object r13 = r4.L$4
            com.sugarcube.app.base.data.Result r13 = (com.sugarcube.app.base.data.Result) r13
            java.lang.Object r13 = r4.L$3
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r4.L$2
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r4.L$1
            com.sugarcube.core.network.models.RoomType r13 = (com.sugarcube.core.network.models.RoomType) r13
            java.lang.Object r13 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r0)
            goto L_0x014c
        L_0x004f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0057:
            java.lang.Object r13 = r4.L$4
            com.sugarcube.app.base.data.Result r13 = (com.sugarcube.app.base.data.Result) r13
            java.lang.Object r14 = r4.L$3
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.Object r1 = r4.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r4.L$1
            com.sugarcube.core.network.models.RoomType r3 = (com.sugarcube.core.network.models.RoomType) r3
            java.lang.Object r5 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r5 = (com.sugarcube.app.base.data.source.CatalogRepository) r5
            XH.y.b(r0)
            r10 = r1
            r1 = r13
            r13 = r5
            r5 = r3
            r3 = r10
            goto L_0x010e
        L_0x0075:
            java.lang.Object r13 = r4.L$4
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r4.L$3
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r14 = r4.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r1 = r4.L$1
            com.sugarcube.core.network.models.RoomType r1 = (com.sugarcube.core.network.models.RoomType) r1
            java.lang.Object r5 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r5 = (com.sugarcube.app.base.data.source.CatalogRepository) r5
            XH.y.b(r0)
            r10 = r0
            r0 = r13
            r13 = r1
            r1 = r10
            goto L_0x00d5
        L_0x0091:
            XH.y.b(r0)
            com.sugarcube.core.network.models.RoomType r0 = r12.roomType
            if (r0 == r13) goto L_0x00a2
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r14 = YH.C16877v.n()
            r13.<init>(r14)
            return r13
        L_0x00a2:
            androidx.lifecycle.K r0 = r12.get_isRefreshing()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.postValue(r1)
            android.net.Uri r0 = r12.getNextPageToken(r13)
            if (r0 != 0) goto L_0x00bd
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r14 = YH.C16877v.n()
            r13.<init>(r14)
            return r13
        L_0x00bd:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r12.getRemoteSource()
            r4.L$0 = r12
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r5
            java.lang.Object r1 = r1.fetchCatalogPage((com.sugarcube.core.network.models.RoomType) r13, (android.net.Uri) r0, (dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>>) r4)
            if (r1 != r7) goto L_0x00d4
            return r7
        L_0x00d4:
            r5 = r12
        L_0x00d5:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r6 == 0) goto L_0x00e7
            androidx.lifecycle.K r13 = r5.get_isRefreshing()
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            r13.postValue(r14)
            return r1
        L_0x00e7:
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r6 == 0) goto L_0x0165
            r6 = r1
            com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6
            java.lang.Object r6 = r6.getData()
            com.sugarcube.core.network.models.CatalogPage r6 = (com.sugarcube.core.network.models.CatalogPage) r6
            r4.L$0 = r5
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r1
            r4.label = r3
            java.lang.Object r3 = r5.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r6, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r4)
            if (r3 != r7) goto L_0x0107
            return r7
        L_0x0107:
            r10 = r5
            r5 = r13
            r13 = r10
            r11 = r3
            r3 = r14
            r14 = r0
            r0 = r11
        L_0x010e:
            com.sugarcube.app.base.data.database.CachedCatalogPage r0 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r0
            if (r0 == 0) goto L_0x0117
            android.net.Uri r6 = r0.getNextUrl()
            goto L_0x0118
        L_0x0117:
            r6 = 0
        L_0x0118:
            r13.putNextPageToken(r5, r6)
            r6 = r1
            com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6
            java.lang.Object r6 = r6.getData()
            com.sugarcube.core.network.models.CatalogPage r6 = (com.sugarcube.core.network.models.CatalogPage) r6
            java.util.List r6 = r6.getPageItems()
            if (r6 != 0) goto L_0x012f
            java.util.List r9 = YH.C16877v.n()
            goto L_0x0130
        L_0x012f:
            r9 = r6
        L_0x0130:
            r4.L$0 = r13
            r4.L$1 = r5
            r4.L$2 = r3
            r4.L$3 = r14
            r4.L$4 = r1
            r4.L$5 = r0
            r4.L$6 = r6
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r13
            r2 = r9
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x014c
            return r7
        L_0x014c:
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.K r13 = r13.get_isRefreshing()
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            r13.postValue(r14)
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            if (r0 != 0) goto L_0x0161
            java.util.List r0 = YH.C16877v.n()
        L_0x0161:
            r13.<init>(r0)
            return r13
        L_0x0165:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.stepCatalogItems(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object cacheCatalogPage(com.sugarcube.core.network.models.CatalogSearchPage r19, dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogSearchPage> r20) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$3
            if (r2 == 0) goto L_0x001a
            r2 = r1
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$3 r2 = (com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$3) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.label = r3
        L_0x0018:
            r3 = r2
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$3 r2 = new com.sugarcube.app.base.data.source.CatalogRepository$cacheCatalogPage$3
            r2.<init>(r6, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r3.result
            java.lang.Object r7 = eI.C17187b.f()
            int r4 = r3.label
            r5 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 != r5) goto L_0x004d
            java.lang.Object r0 = r3.L$6
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r0 = (com.sugarcube.app.base.data.database.CachedCatalogSearchPage) r0
            java.lang.Object r1 = r3.L$5
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogSearchPage) r1
            java.lang.Object r4 = r3.L$4
            com.sugarcube.core.network.models.CatalogSearchPage r4 = (com.sugarcube.core.network.models.CatalogSearchPage) r4
            java.lang.Object r4 = r3.L$3
            com.sugarcube.core.network.models.CatalogSearchPage r4 = (com.sugarcube.core.network.models.CatalogSearchPage) r4
            java.lang.Object r4 = r3.L$2
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r4 = r3.L$1
            com.sugarcube.core.network.models.CatalogSearchPage r4 = (com.sugarcube.core.network.models.CatalogSearchPage) r4
            java.lang.Object r3 = r3.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r2)
            goto L_0x00a6
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            XH.y.b(r2)
            if (r0 == 0) goto L_0x00ae
            androidx.lifecycle.K r2 = r18.get_isRefreshing()
            r4 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            r2.postValue(r8)
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r8 = new com.sugarcube.app.base.data.database.CachedCatalogSearchPage
            r16 = 63
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = r19.getMoreToken()
            r8.setNextPageToken(r2)
            java.util.List r2 = r19.getPageItems()
            r3.L$0 = r6
            r3.L$1 = r0
            r3.L$2 = r1
            r3.L$3 = r0
            r3.L$4 = r0
            r3.L$5 = r8
            r3.L$6 = r8
            r3.I$0 = r4
            r3.I$1 = r4
            r3.label = r5
            r5 = 2
            r9 = 0
            r0 = r18
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r9
            java.lang.Object r2 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r0, r1, r2, r3, r4, r5)
            if (r2 != r7) goto L_0x00a4
            return r7
        L_0x00a4:
            r0 = r8
            r1 = r0
        L_0x00a6:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00af
            r0.setPageItems(r2)
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.cacheCatalogPage(com.sugarcube.core.network.models.CatalogSearchPage, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogItems(com.sugarcube.app.base.data.database.CachedCatalogItem r12, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$2
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$2 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$2 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$2
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r7 = eI.C17187b.f()
            int r2 = r0.label
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r3) goto L_0x0046
            if (r2 != r9) goto L_0x003e
            java.lang.Object r12 = r0.L$3
            com.sugarcube.app.base.data.Result r12 = (com.sugarcube.app.base.data.Result) r12
            java.lang.Object r12 = r0.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r12 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r12
            java.lang.Object r13 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r1)
            goto L_0x00b9
        L_0x003e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0046:
            java.lang.Object r12 = r0.L$2
            r13 = r12
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r12 = r0.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r12 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r12
            java.lang.Object r2 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r2 = (com.sugarcube.app.base.data.source.CatalogRepository) r2
            XH.y.b(r1)
            r10 = r1
            r1 = r13
            r13 = r2
            r2 = r10
            goto L_0x0089
        L_0x005b:
            XH.y.b(r1)
            androidx.lifecycle.K r1 = r11.get_isRefreshing()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.postValue(r2)
            r11.swapItem = r12
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r11.getRemoteSource()
            int r2 = r12.getId()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r4 = r0
            java.lang.Object r1 = com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource.DefaultImpls.fetchCatalogSwapSuggestionsPage$default(r1, r2, r3, r4, r5, r6)
            if (r1 != r7) goto L_0x0086
            return r7
        L_0x0086:
            r2 = r1
            r1 = r13
            r13 = r11
        L_0x0089:
            com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Error
            if (r3 == 0) goto L_0x009b
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            return r2
        L_0x009b:
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Success
            if (r3 == 0) goto L_0x00f1
            r3 = r2
            com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3
            java.lang.Object r3 = r3.getData()
            com.sugarcube.core.network.models.CatalogPage r3 = (com.sugarcube.core.network.models.CatalogPage) r3
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r1
            r0.L$3 = r2
            r0.label = r9
            java.lang.Object r1 = r13.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r3, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r0)
            if (r1 != r7) goto L_0x00b9
            return r7
        L_0x00b9:
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            r0 = 0
            if (r1 == 0) goto L_0x00c3
            android.net.Uri r2 = r1.getNextUrl()
            goto L_0x00c4
        L_0x00c3:
            r2 = r0
        L_0x00c4:
            r13.putNextPageToken(r12, r2)
            if (r1 == 0) goto L_0x00d1
            int r0 = r1.getTotalCount()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
        L_0x00d1:
            r13.putCount(r12, r0)
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            com.sugarcube.app.base.data.Result$Success r12 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x00e9
            java.util.List r13 = r1.getPageItems()
            if (r13 != 0) goto L_0x00ed
        L_0x00e9:
            java.util.List r13 = YH.C16877v.n()
        L_0x00ed:
            r12.<init>(r13)
            return r12
        L_0x00f1:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItems(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object stepCatalogItems(com.sugarcube.app.base.data.database.CachedCatalogItem r13, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$2
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$2 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$2 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$2
            r0.<init>(r12, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r8 = 0
            r2 = 3
            r3 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0091
            if (r1 == r5) goto L_0x0075
            if (r1 == r3) goto L_0x0057
            if (r1 != r2) goto L_0x004f
            java.lang.Object r13 = r4.L$6
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r4.L$5
            com.sugarcube.app.base.data.database.CachedCatalogPage r13 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r13
            java.lang.Object r13 = r4.L$4
            com.sugarcube.app.base.data.Result r13 = (com.sugarcube.app.base.data.Result) r13
            java.lang.Object r13 = r4.L$3
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r4.L$2
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r4.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r13 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r13
            java.lang.Object r13 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r0)
            goto L_0x0154
        L_0x004f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0057:
            java.lang.Object r13 = r4.L$4
            com.sugarcube.app.base.data.Result r13 = (com.sugarcube.app.base.data.Result) r13
            java.lang.Object r14 = r4.L$3
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.Object r1 = r4.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r4.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r3 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r3
            java.lang.Object r5 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r5 = (com.sugarcube.app.base.data.source.CatalogRepository) r5
            XH.y.b(r0)
            r10 = r1
            r1 = r13
            r13 = r5
            r5 = r3
            r3 = r10
            goto L_0x0116
        L_0x0075:
            java.lang.Object r13 = r4.L$4
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r4.L$3
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r14 = r4.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r1 = r4.L$1
            com.sugarcube.app.base.data.database.CachedCatalogItem r1 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r1
            java.lang.Object r5 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r5 = (com.sugarcube.app.base.data.source.CatalogRepository) r5
            XH.y.b(r0)
            r10 = r0
            r0 = r13
            r13 = r1
            r1 = r10
            goto L_0x00dd
        L_0x0091:
            XH.y.b(r0)
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = r12.swapItem
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r13)
            if (r0 != 0) goto L_0x00a6
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r14 = YH.C16877v.n()
            r13.<init>(r14)
            return r13
        L_0x00a6:
            androidx.lifecycle.K r0 = r12.get_isRefreshing()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.postValue(r1)
            android.net.Uri r0 = r12.getNextPageToken(r13)
            if (r0 != 0) goto L_0x00c1
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r14 = YH.C16877v.n()
            r13.<init>(r14)
            return r13
        L_0x00c1:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r12.getRemoteSource()
            int r6 = r13.getId()
            r4.L$0 = r12
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r5
            java.lang.Object r1 = r1.fetchCatalogSwapSuggestionsPage(r6, r0, r4)
            if (r1 != r7) goto L_0x00dc
            return r7
        L_0x00dc:
            r5 = r12
        L_0x00dd:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r6 == 0) goto L_0x00ef
            androidx.lifecycle.K r13 = r5.get_isRefreshing()
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            r13.postValue(r14)
            return r1
        L_0x00ef:
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r6 == 0) goto L_0x016d
            r6 = r1
            com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6
            java.lang.Object r6 = r6.getData()
            com.sugarcube.core.network.models.CatalogPage r6 = (com.sugarcube.core.network.models.CatalogPage) r6
            r4.L$0 = r5
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r1
            r4.label = r3
            java.lang.Object r3 = r5.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r6, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r4)
            if (r3 != r7) goto L_0x010f
            return r7
        L_0x010f:
            r10 = r5
            r5 = r13
            r13 = r10
            r11 = r3
            r3 = r14
            r14 = r0
            r0 = r11
        L_0x0116:
            com.sugarcube.app.base.data.database.CachedCatalogPage r0 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r0
            if (r0 == 0) goto L_0x011f
            android.net.Uri r6 = r0.getNextUrl()
            goto L_0x0120
        L_0x011f:
            r6 = 0
        L_0x0120:
            r13.putNextPageToken(r5, r6)
            r6 = r1
            com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6
            java.lang.Object r6 = r6.getData()
            com.sugarcube.core.network.models.CatalogPage r6 = (com.sugarcube.core.network.models.CatalogPage) r6
            java.util.List r6 = r6.getPageItems()
            if (r6 != 0) goto L_0x0137
            java.util.List r9 = YH.C16877v.n()
            goto L_0x0138
        L_0x0137:
            r9 = r6
        L_0x0138:
            r4.L$0 = r13
            r4.L$1 = r5
            r4.L$2 = r3
            r4.L$3 = r14
            r4.L$4 = r1
            r4.L$5 = r0
            r4.L$6 = r6
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r13
            r2 = r9
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0154
            return r7
        L_0x0154:
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.K r13 = r13.get_isRefreshing()
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            r13.postValue(r14)
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            if (r0 != 0) goto L_0x0169
            java.util.List r0 = YH.C16877v.n()
        L_0x0169:
            r13.<init>(r0)
            return r13
        L_0x016d:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.stepCatalogItems(com.sugarcube.app.base.data.database.CachedCatalogItem, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogItems(java.lang.String r12, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$3
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$3 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$3 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$3
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r7 = eI.C17187b.f()
            int r2 = r0.label
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r3) goto L_0x0046
            if (r2 != r9) goto L_0x003e
            java.lang.Object r12 = r0.L$3
            com.sugarcube.app.base.data.Result r12 = (com.sugarcube.app.base.data.Result) r12
            java.lang.Object r12 = r0.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r1)
            goto L_0x00b6
        L_0x003e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0046:
            java.lang.Object r12 = r0.L$2
            r13 = r12
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r12 = r0.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r2 = (com.sugarcube.app.base.data.source.CatalogRepository) r2
            XH.y.b(r1)
            r10 = r1
            r1 = r13
            r13 = r2
            r2 = r10
            goto L_0x0086
        L_0x005b:
            XH.y.b(r1)
            androidx.lifecycle.K r1 = r11.get_isRefreshing()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.postValue(r2)
            r11.searchTerm = r12
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r11.getRemoteSource()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r12
            r4 = r0
            java.lang.Object r1 = com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource.DefaultImpls.fetchCatalogSearchResultsPage$default(r1, r2, r3, r4, r5, r6)
            if (r1 != r7) goto L_0x0083
            return r7
        L_0x0083:
            r2 = r1
            r1 = r13
            r13 = r11
        L_0x0086:
            com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Error
            if (r3 == 0) goto L_0x0098
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            return r2
        L_0x0098:
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Success
            if (r3 == 0) goto L_0x00f4
            r3 = r2
            com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3
            java.lang.Object r3 = r3.getData()
            com.sugarcube.core.network.models.CatalogSearchPage r3 = (com.sugarcube.core.network.models.CatalogSearchPage) r3
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r1
            r0.L$3 = r2
            r0.label = r9
            java.lang.Object r1 = r13.cacheCatalogPage((com.sugarcube.core.network.models.CatalogSearchPage) r3, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogSearchPage>) r0)
            if (r1 != r7) goto L_0x00b6
            return r7
        L_0x00b6:
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogSearchPage) r1
            r0 = 0
            if (r1 == 0) goto L_0x00c0
            java.lang.String r2 = r1.getNextPageToken()
            goto L_0x00c1
        L_0x00c0:
            r2 = r0
        L_0x00c1:
            r13.putNextSearchPageToken(r12, r2)
            if (r1 == 0) goto L_0x00d4
            java.util.List r2 = r1.getPageItems()
            if (r2 == 0) goto L_0x00d4
            int r0 = r2.size()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
        L_0x00d4:
            r13.putCount(r12, r0)
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            com.sugarcube.app.base.data.Result$Success r12 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x00ec
            java.util.List r13 = r1.getPageItems()
            if (r13 != 0) goto L_0x00f0
        L_0x00ec:
            java.util.List r13 = YH.C16877v.n()
        L_0x00f0:
            r12.<init>(r13)
            return r12
        L_0x00f4:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItems(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object stepCatalogItems(java.lang.String r13, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$3
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$3 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$3 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$3
            r0.<init>(r12, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r8 = 0
            r2 = 3
            r3 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0091
            if (r1 == r5) goto L_0x0075
            if (r1 == r3) goto L_0x0057
            if (r1 != r2) goto L_0x004f
            java.lang.Object r13 = r4.L$6
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r4.L$5
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r13 = (com.sugarcube.app.base.data.database.CachedCatalogSearchPage) r13
            java.lang.Object r13 = r4.L$4
            com.sugarcube.app.base.data.Result r13 = (com.sugarcube.app.base.data.Result) r13
            java.lang.Object r13 = r4.L$3
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r4.L$2
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r4.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r0)
            goto L_0x0150
        L_0x004f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0057:
            java.lang.Object r13 = r4.L$4
            com.sugarcube.app.base.data.Result r13 = (com.sugarcube.app.base.data.Result) r13
            java.lang.Object r14 = r4.L$3
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = r4.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r3 = r4.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r5 = (com.sugarcube.app.base.data.source.CatalogRepository) r5
            XH.y.b(r0)
            r10 = r1
            r1 = r13
            r13 = r5
            r5 = r3
            r3 = r10
            goto L_0x0112
        L_0x0075:
            java.lang.Object r13 = r4.L$4
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r4.L$3
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r1 = r4.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r5 = (com.sugarcube.app.base.data.source.CatalogRepository) r5
            XH.y.b(r0)
            r10 = r0
            r0 = r13
            r13 = r1
            r1 = r10
            goto L_0x00d9
        L_0x0091:
            XH.y.b(r0)
            java.lang.String r0 = r12.searchTerm
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r13)
            if (r0 != 0) goto L_0x00a6
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r14 = YH.C16877v.n()
            r13.<init>(r14)
            return r13
        L_0x00a6:
            androidx.lifecycle.K r0 = r12.get_isRefreshing()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)
            r0.postValue(r1)
            java.lang.String r0 = r12.getNextSearchPageToken(r13)
            if (r0 != 0) goto L_0x00c1
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r14 = YH.C16877v.n()
            r13.<init>(r14)
            return r13
        L_0x00c1:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r12.getRemoteSource()
            r4.L$0 = r12
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r5
            java.lang.Object r1 = r1.fetchCatalogSearchResultsPage(r13, r0, r4)
            if (r1 != r7) goto L_0x00d8
            return r7
        L_0x00d8:
            r5 = r12
        L_0x00d9:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Error
            if (r6 == 0) goto L_0x00eb
            androidx.lifecycle.K r13 = r5.get_isRefreshing()
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            r13.postValue(r14)
            return r1
        L_0x00eb:
            boolean r6 = r1 instanceof com.sugarcube.app.base.data.Result.Success
            if (r6 == 0) goto L_0x0169
            r6 = r1
            com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6
            java.lang.Object r6 = r6.getData()
            com.sugarcube.core.network.models.CatalogSearchPage r6 = (com.sugarcube.core.network.models.CatalogSearchPage) r6
            r4.L$0 = r5
            r4.L$1 = r13
            r4.L$2 = r14
            r4.L$3 = r0
            r4.L$4 = r1
            r4.label = r3
            java.lang.Object r3 = r5.cacheCatalogPage((com.sugarcube.core.network.models.CatalogSearchPage) r6, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogSearchPage>) r4)
            if (r3 != r7) goto L_0x010b
            return r7
        L_0x010b:
            r10 = r5
            r5 = r13
            r13 = r10
            r11 = r3
            r3 = r14
            r14 = r0
            r0 = r11
        L_0x0112:
            com.sugarcube.app.base.data.database.CachedCatalogSearchPage r0 = (com.sugarcube.app.base.data.database.CachedCatalogSearchPage) r0
            if (r0 == 0) goto L_0x011b
            java.lang.String r6 = r0.getNextPageToken()
            goto L_0x011c
        L_0x011b:
            r6 = 0
        L_0x011c:
            r13.putNextSearchPageToken(r5, r6)
            r6 = r1
            com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6
            java.lang.Object r6 = r6.getData()
            com.sugarcube.core.network.models.CatalogSearchPage r6 = (com.sugarcube.core.network.models.CatalogSearchPage) r6
            java.util.List r6 = r6.getPageItems()
            if (r6 != 0) goto L_0x0133
            java.util.List r9 = YH.C16877v.n()
            goto L_0x0134
        L_0x0133:
            r9 = r6
        L_0x0134:
            r4.L$0 = r13
            r4.L$1 = r5
            r4.L$2 = r3
            r4.L$3 = r14
            r4.L$4 = r1
            r4.L$5 = r0
            r4.L$6 = r6
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r13
            r2 = r9
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0150
            return r7
        L_0x0150:
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.K r13 = r13.get_isRefreshing()
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r8)
            r13.postValue(r14)
            com.sugarcube.app.base.data.Result$Success r13 = new com.sugarcube.app.base.data.Result$Success
            if (r0 != 0) goto L_0x0165
            java.util.List r0 = YH.C16877v.n()
        L_0x0165:
            r13.<init>(r0)
            return r13
        L_0x0169:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.stepCatalogItems(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogItems(com.sugarcube.core.network.models.CatalogCategory r12, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$4
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$4 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$4 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$fetchCatalogItems$4
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r7 = eI.C17187b.f()
            int r2 = r0.label
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r3) goto L_0x004a
            if (r2 != r9) goto L_0x0042
            java.lang.Object r12 = r0.L$4
            com.sugarcube.app.base.data.Result r12 = (com.sugarcube.app.base.data.Result) r12
            java.lang.Object r12 = r0.L$3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.L$2
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.L$1
            com.sugarcube.core.network.models.CatalogCategory r12 = (com.sugarcube.core.network.models.CatalogCategory) r12
            java.lang.Object r13 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r13 = (com.sugarcube.app.base.data.source.CatalogRepository) r13
            XH.y.b(r1)
            goto L_0x00d8
        L_0x0042:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x004a:
            java.lang.Object r12 = r0.L$4
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.L$3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.L$2
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r2 = r0.L$1
            com.sugarcube.core.network.models.CatalogCategory r2 = (com.sugarcube.core.network.models.CatalogCategory) r2
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r3 = (com.sugarcube.app.base.data.source.CatalogRepository) r3
            XH.y.b(r1)
            r10 = r12
            r12 = r2
            r2 = r1
            r1 = r13
            r13 = r3
            goto L_0x00a6
        L_0x0067:
            XH.y.b(r1)
            androidx.lifecycle.K r1 = r11.get_isRefreshing()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r3)
            r1.postValue(r2)
            r11.subcategory = r12
            java.lang.String r10 = r12.getCategoryId()
            if (r10 != 0) goto L_0x0087
            com.sugarcube.app.base.data.Result$Success r12 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r13 = YH.C16877v.n()
            r12.<init>(r13)
            return r12
        L_0x0087:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r1 = r11.getRemoteSource()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r10
            r0.L$4 = r10
            r0.label = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r10
            r4 = r0
            java.lang.Object r1 = com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource.DefaultImpls.fetchCatalogPage$default((com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource) r1, (java.lang.String) r2, (android.net.Uri) r3, (dI.C17164e) r4, (int) r5, (java.lang.Object) r6)
            if (r1 != r7) goto L_0x00a3
            return r7
        L_0x00a3:
            r2 = r1
            r1 = r13
            r13 = r11
        L_0x00a6:
            com.sugarcube.app.base.data.Result r2 = (com.sugarcube.app.base.data.Result) r2
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Error
            if (r3 == 0) goto L_0x00b8
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            return r2
        L_0x00b8:
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.Result.Success
            if (r3 == 0) goto L_0x0110
            r3 = r2
            com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3
            java.lang.Object r3 = r3.getData()
            com.sugarcube.core.network.models.CatalogPage r3 = (com.sugarcube.core.network.models.CatalogPage) r3
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r1
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r9
            java.lang.Object r1 = r13.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r3, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r0)
            if (r1 != r7) goto L_0x00d8
            return r7
        L_0x00d8:
            com.sugarcube.app.base.data.database.CachedCatalogPage r1 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r1
            r0 = 0
            if (r1 == 0) goto L_0x00e2
            android.net.Uri r2 = r1.getNextUrl()
            goto L_0x00e3
        L_0x00e2:
            r2 = r0
        L_0x00e3:
            r13.putNextPageToken(r12, r2)
            if (r1 == 0) goto L_0x00f0
            int r0 = r1.getTotalCount()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
        L_0x00f0:
            r13.putCount(r12, r0)
            androidx.lifecycle.K r12 = r13.get_isRefreshing()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r8)
            r12.postValue(r13)
            com.sugarcube.app.base.data.Result$Success r12 = new com.sugarcube.app.base.data.Result$Success
            if (r1 == 0) goto L_0x0108
            java.util.List r13 = r1.getPageItems()
            if (r13 != 0) goto L_0x010c
        L_0x0108:
            java.util.List r13 = YH.C16877v.n()
        L_0x010c:
            r12.<init>(r13)
            return r12
        L_0x0110:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.fetchCatalogItems(com.sugarcube.core.network.models.CatalogCategory, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0172 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object stepCatalogItems(com.sugarcube.core.network.models.CatalogCategory r14, dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$4
            if (r0 == 0) goto L_0x0014
            r0 = r15
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$4 r0 = (com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$4 r0 = new com.sugarcube.app.base.data.source.CatalogRepository$stepCatalogItems$4
            r0.<init>(r13, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r4.result
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r4.label
            r8 = 0
            r2 = 3
            r3 = 2
            r5 = 1
            if (r1 == 0) goto L_0x009f
            if (r1 == r5) goto L_0x007e
            if (r1 == r3) goto L_0x005b
            if (r1 != r2) goto L_0x0053
            java.lang.Object r14 = r4.L$7
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r4.L$6
            com.sugarcube.app.base.data.database.CachedCatalogPage r14 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r14
            java.lang.Object r14 = r4.L$5
            com.sugarcube.app.base.data.Result r14 = (com.sugarcube.app.base.data.Result) r14
            java.lang.Object r14 = r4.L$4
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.Object r14 = r4.L$3
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r4.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r4.L$1
            com.sugarcube.core.network.models.CatalogCategory r14 = (com.sugarcube.core.network.models.CatalogCategory) r14
            java.lang.Object r14 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r14 = (com.sugarcube.app.base.data.source.CatalogRepository) r14
            XH.y.b(r0)
            goto L_0x0173
        L_0x0053:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x005b:
            java.lang.Object r14 = r4.L$5
            com.sugarcube.app.base.data.Result r14 = (com.sugarcube.app.base.data.Result) r14
            java.lang.Object r15 = r4.L$4
            android.net.Uri r15 = (android.net.Uri) r15
            java.lang.Object r1 = r4.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r4.L$2
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r5 = r4.L$1
            com.sugarcube.core.network.models.CatalogCategory r5 = (com.sugarcube.core.network.models.CatalogCategory) r5
            java.lang.Object r6 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r6 = (com.sugarcube.app.base.data.source.CatalogRepository) r6
            XH.y.b(r0)
            r11 = r0
            r0 = r14
            r14 = r6
            r6 = r5
            r5 = r3
            r3 = r11
            goto L_0x0133
        L_0x007e:
            java.lang.Object r14 = r4.L$5
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.Object r14 = r4.L$4
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.Object r15 = r4.L$3
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r1 = r4.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r4.L$1
            com.sugarcube.core.network.models.CatalogCategory r5 = (com.sugarcube.core.network.models.CatalogCategory) r5
            java.lang.Object r6 = r4.L$0
            com.sugarcube.app.base.data.source.CatalogRepository r6 = (com.sugarcube.app.base.data.source.CatalogRepository) r6
            XH.y.b(r0)
            r11 = r1
            r1 = r14
            r14 = r5
            r5 = r15
            r15 = r11
            goto L_0x00f8
        L_0x009f:
            XH.y.b(r0)
            com.sugarcube.core.network.models.CatalogCategory r0 = r13.subcategory
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r14)
            if (r0 != 0) goto L_0x00b4
            com.sugarcube.app.base.data.Result$Success r14 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r15 = YH.C16877v.n()
            r14.<init>(r15)
            return r14
        L_0x00b4:
            com.sugarcube.core.network.models.CatalogCategory r0 = r13.subcategory
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = r0.getCategoryId()
            if (r0 != 0) goto L_0x00c0
            goto L_0x0192
        L_0x00c0:
            androidx.lifecycle.K r1 = r13.get_isRefreshing()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r5)
            r1.postValue(r6)
            android.net.Uri r1 = r13.getNextPageToken(r14)
            if (r1 != 0) goto L_0x00db
            com.sugarcube.app.base.data.Result$Success r14 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r15 = YH.C16877v.n()
            r14.<init>(r15)
            return r14
        L_0x00db:
            com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource r6 = r13.getRemoteSource()
            r4.L$0 = r13
            r4.L$1 = r14
            r4.L$2 = r15
            r4.L$3 = r0
            r4.L$4 = r1
            r4.L$5 = r1
            r4.label = r5
            java.lang.Object r5 = r6.fetchCatalogPage((java.lang.String) r0, (android.net.Uri) r1, (dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>>) r4)
            if (r5 != r7) goto L_0x00f4
            return r7
        L_0x00f4:
            r6 = r13
            r11 = r5
            r5 = r0
            r0 = r11
        L_0x00f8:
            com.sugarcube.app.base.data.Result r0 = (com.sugarcube.app.base.data.Result) r0
            boolean r9 = r0 instanceof com.sugarcube.app.base.data.Result.Error
            if (r9 == 0) goto L_0x010a
            androidx.lifecycle.K r14 = r6.get_isRefreshing()
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r8)
            r14.postValue(r15)
            return r0
        L_0x010a:
            boolean r9 = r0 instanceof com.sugarcube.app.base.data.Result.Success
            if (r9 == 0) goto L_0x018c
            r9 = r0
            com.sugarcube.app.base.data.Result$Success r9 = (com.sugarcube.app.base.data.Result.Success) r9
            java.lang.Object r9 = r9.getData()
            com.sugarcube.core.network.models.CatalogPage r9 = (com.sugarcube.core.network.models.CatalogPage) r9
            r4.L$0 = r6
            r4.L$1 = r14
            r4.L$2 = r15
            r4.L$3 = r5
            r4.L$4 = r1
            r4.L$5 = r0
            r4.label = r3
            java.lang.Object r3 = r6.cacheCatalogPage((com.sugarcube.core.network.models.CatalogPage) r9, (dI.C17164e<? super com.sugarcube.app.base.data.database.CachedCatalogPage>) r4)
            if (r3 != r7) goto L_0x012c
            return r7
        L_0x012c:
            r11 = r6
            r6 = r14
            r14 = r11
            r12 = r5
            r5 = r15
            r15 = r1
            r1 = r12
        L_0x0133:
            com.sugarcube.app.base.data.database.CachedCatalogPage r3 = (com.sugarcube.app.base.data.database.CachedCatalogPage) r3
            if (r3 == 0) goto L_0x013c
            android.net.Uri r9 = r3.getNextUrl()
            goto L_0x013d
        L_0x013c:
            r9 = 0
        L_0x013d:
            r14.putNextPageToken(r6, r9)
            r9 = r0
            com.sugarcube.app.base.data.Result$Success r9 = (com.sugarcube.app.base.data.Result.Success) r9
            java.lang.Object r9 = r9.getData()
            com.sugarcube.core.network.models.CatalogPage r9 = (com.sugarcube.core.network.models.CatalogPage) r9
            java.util.List r9 = r9.getPageItems()
            if (r9 != 0) goto L_0x0154
            java.util.List r10 = YH.C16877v.n()
            goto L_0x0155
        L_0x0154:
            r10 = r9
        L_0x0155:
            r4.L$0 = r14
            r4.L$1 = r6
            r4.L$2 = r5
            r4.L$3 = r1
            r4.L$4 = r15
            r4.L$5 = r0
            r4.L$6 = r3
            r4.L$7 = r9
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r14
            r2 = r10
            java.lang.Object r0 = com.sugarcube.app.base.data.source.CatalogRepositorySource.convertCatalogItems$default(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0173
            return r7
        L_0x0173:
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.K r14 = r14.get_isRefreshing()
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.b.a(r8)
            r14.postValue(r15)
            com.sugarcube.app.base.data.Result$Success r14 = new com.sugarcube.app.base.data.Result$Success
            if (r0 != 0) goto L_0x0188
            java.util.List r0 = YH.C16877v.n()
        L_0x0188:
            r14.<init>(r0)
            return r14
        L_0x018c:
            XH.t r14 = new XH.t
            r14.<init>()
            throw r14
        L_0x0192:
            com.sugarcube.app.base.data.Result$Success r14 = new com.sugarcube.app.base.data.Result$Success
            java.util.List r15 = YH.C16877v.n()
            r14.<init>(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.CatalogRepository.stepCatalogItems(com.sugarcube.core.network.models.CatalogCategory, dI.e):java.lang.Object");
    }
}
