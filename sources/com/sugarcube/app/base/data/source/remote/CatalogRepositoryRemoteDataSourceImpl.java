package com.sugarcube.app.base.data.source.remote;

import OE.q;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.source.CatalogRepositoryRemoteDataSource;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.network.NetworkClient;
import com.sugarcube.core.network.api.NetworkAPIs;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0012\u0010\u0016J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0018\u0010\u0016J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014H@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\u001dH@¢\u0006\u0004\b#\u0010$J\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H@¢\u0006\u0004\b&\u0010'J(\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010!H@¢\u0006\u0004\b)\u0010*J(\u0010+\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010!H@¢\u0006\u0004\b+\u0010*J(\u0010-\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!H@¢\u0006\u0004\b-\u0010*J\"\u0010.\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH@¢\u0006\u0004\b.\u0010/J(\u00105\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H@¢\u0006\u0004\b5\u00106J4\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"07\u0018\u0001072\u0006\u00104\u001a\u000203H@¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8BX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/sugarcube/app/base/data/source/remote/CatalogRepositoryRemoteDataSourceImpl;", "Lcom/sugarcube/app/base/data/source/CatalogRepositoryRemoteDataSource;", "Lcom/sugarcube/app/base/network/NetworkClient;", "networkClient", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "<init>", "(Lcom/sugarcube/app/base/network/NetworkClient;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LOE/q;Lcom/sugarcube/app/base/data/user/UserRepo;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Landroid/net/Uri;", "moreToken", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/CatalogPage;", "fetchCatalogPage", "(Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "subcategoryId", "(Ljava/lang/String;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "categoryId", "fetchCatalogPageForCategory", "searchTerm", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "fetchCatalogSearchResultsPage", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "itemId", "fetchCatalogSwapSuggestionsPage", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "fetchProductRecommendations", "(ILdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "fetchCatalogCategories", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "itemIds", "fetchCatalogItems", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "fetchProductInfo", "localIds", "fetchProductInfoLocalIds", "fetchProductVariants", "(Ljava/lang/Integer;LdI/e;)Ljava/lang/Object;", "Ljava/io/File;", "assetFile", "assetUrl", "", "allowFetch", "fetchItemAsset", "(Ljava/io/File;Landroid/net/Uri;ZLdI/e;)Ljava/lang/Object;", "", "fetchSalesDressedBedData", "(ZLdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/network/NetworkClient;", "getNetworkClient", "()Lcom/sugarcube/app/base/network/NetworkClient;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "LOE/q;", "getSugarcube", "()LOE/q;", "Lcom/sugarcube/app/base/data/user/UserRepo;", "getUserRepo", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "getNetworkAPIs", "()Lcom/sugarcube/core/network/api/NetworkAPIs;", "networkAPIs", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogRepositoryRemoteDataSourceImpl implements CatalogRepositoryRemoteDataSource {
    public static final int $stable = 8;
    private static final int COLUMN_COUNT = 3;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PAGE_SIZE = 30;
    private static final int ROW_COUNT = 10;
    public static final int SDB_VERSION = 3;
    private final ConfigRepository configRepository;
    private final NetworkClient networkClient;
    private final q sugarcube;
    private final UserRepo userRepo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/data/source/remote/CatalogRepositoryRemoteDataSourceImpl$Companion;", "", "<init>", "()V", "SDB_VERSION", "", "COLUMN_COUNT", "ROW_COUNT", "PAGE_SIZE", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CatalogRepositoryRemoteDataSourceImpl(NetworkClient networkClient2, ConfigRepository configRepository2, q qVar, UserRepo userRepo2) {
        C17542s.j(networkClient2, "networkClient");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(userRepo2, "userRepo");
        this.networkClient = networkClient2;
        this.configRepository = configRepository2;
        this.sugarcube = qVar;
        this.userRepo = userRepo2;
    }

    private final NetworkAPIs getNetworkAPIs() {
        return this.networkClient.api();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: dI.e<? super java.util.List<com.sugarcube.core.network.models.CatalogCategory>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogCategories(java.lang.String r11, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.CatalogCategory>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogCategories$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogCategories$1 r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogCategories$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogCategories$1 r0 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogCategories$1
            r0.<init>(r10, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.result
            java.lang.Object r9 = eI.C17187b.f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 == r3) goto L_0x004c
            if (r1 != r2) goto L_0x0044
            java.lang.Object r11 = r6.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r6.L$3
            com.sugarcube.core.network.api.NetworkAPIs r11 = (com.sugarcube.core.network.api.NetworkAPIs) r11
            java.lang.Object r11 = r6.L$2
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r6.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r6.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r11 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r11
            XH.y.b(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x00a0
        L_0x0042:
            r11 = move-exception
            goto L_0x00a7
        L_0x0044:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004c:
            java.lang.Object r11 = r6.L$2
            r12 = r11
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r11 = r6.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r6.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r1 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r1
            XH.y.b(r0)     // Catch:{ all -> 0x0042 }
        L_0x005c:
            r4 = r11
            goto L_0x0076
        L_0x005e:
            XH.y.b(r0)
            com.sugarcube.app.base.data.feature.ConfigRepository r0 = r10.configRepository     // Catch:{ all -> 0x0042 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r1 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0042 }
            r6.L$0 = r10     // Catch:{ all -> 0x0042 }
            r6.L$1 = r11     // Catch:{ all -> 0x0042 }
            r6.L$2 = r12     // Catch:{ all -> 0x0042 }
            r6.label = r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.get(r1, r6)     // Catch:{ all -> 0x0042 }
            if (r0 != r9) goto L_0x0074
            return r9
        L_0x0074:
            r1 = r10
            goto L_0x005c
        L_0x0076:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0042 }
            boolean r11 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            com.sugarcube.core.network.api.NetworkAPIs r0 = r1.getNetworkAPIs()     // Catch:{ all -> 0x0042 }
            OE.q r3 = r1.sugarcube     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = r3.getRegion()     // Catch:{ all -> 0x0042 }
            r6.L$0 = r1     // Catch:{ all -> 0x0042 }
            r6.L$1 = r4     // Catch:{ all -> 0x0042 }
            r6.L$2 = r12     // Catch:{ all -> 0x0042 }
            r6.L$3 = r0     // Catch:{ all -> 0x0042 }
            r6.L$4 = r5     // Catch:{ all -> 0x0042 }
            r6.Z$0 = r11     // Catch:{ all -> 0x0042 }
            r6.label = r2     // Catch:{ all -> 0x0042 }
            r3 = 0
            r7 = 2
            r8 = 0
            r1 = r0
            r2 = r11
            java.lang.Object r0 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchCatalogCategories$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0042 }
            if (r0 != r9) goto L_0x00a0
            return r9
        L_0x00a0:
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = r0.a()     // Catch:{ all -> 0x0042 }
            return r11
        L_0x00a7:
            java.lang.String r12 = "Sugarcube"
            java.lang.String r0 = "Catalog categories fetch failed"
            android.util.Log.e(r12, r0, r11)
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogCategories(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogItems(java.util.List<java.lang.Integer> r22, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.CatalogItem>> r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogItems$1
            if (r2 == 0) goto L_0x0018
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogItems$1 r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogItems$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.label = r3
        L_0x0016:
            r7 = r2
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogItems$1 r2 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogItems$1
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r7.result
            java.lang.Object r10 = eI.C17187b.f()
            int r3 = r7.label
            r11 = 0
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0067
            if (r3 == r5) goto L_0x0057
            if (r3 != r4) goto L_0x004f
            java.lang.Object r0 = r7.L$5
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r7.L$4
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r7.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r7.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r7.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r7.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r0
            XH.y.b(r2)     // Catch:{ all -> 0x004c }
            goto L_0x00c6
        L_0x004c:
            r0 = move-exception
            goto L_0x00d0
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0057:
            java.lang.Object r0 = r7.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r3 = r7.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r7.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r5 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r5
            XH.y.b(r2)     // Catch:{ all -> 0x004c }
            goto L_0x0081
        L_0x0067:
            XH.y.b(r2)
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.configRepository     // Catch:{ all -> 0x004c }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x004c }
            r7.L$0 = r1     // Catch:{ all -> 0x004c }
            r6 = r22
            r7.L$1 = r6     // Catch:{ all -> 0x004c }
            r7.L$2 = r0     // Catch:{ all -> 0x004c }
            r7.label = r5     // Catch:{ all -> 0x004c }
            java.lang.Object r2 = r2.get(r3, r7)     // Catch:{ all -> 0x004c }
            if (r2 != r10) goto L_0x007f
            return r10
        L_0x007f:
            r5 = r1
            r3 = r6
        L_0x0081:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x004c }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x00cf
            r12 = r3
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch:{ all -> 0x004c }
            r19 = 63
            r20 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r6 = YH.C16877v.G0(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x00cf
            com.sugarcube.core.network.api.NetworkAPIs r8 = r5.getNetworkAPIs()     // Catch:{ all -> 0x004c }
            r9 = 0
            r7.L$0 = r5     // Catch:{ all -> 0x004c }
            r7.L$1 = r3     // Catch:{ all -> 0x004c }
            r7.L$2 = r0     // Catch:{ all -> 0x004c }
            r7.L$3 = r6     // Catch:{ all -> 0x004c }
            r7.L$4 = r6     // Catch:{ all -> 0x004c }
            r7.L$5 = r6     // Catch:{ all -> 0x004c }
            r7.Z$0 = r2     // Catch:{ all -> 0x004c }
            r7.I$0 = r9     // Catch:{ all -> 0x004c }
            r7.label = r4     // Catch:{ all -> 0x004c }
            r0 = 0
            r9 = 4
            r12 = 0
            r3 = r8
            r4 = r6
            r5 = r2
            r6 = r0
            r8 = r9
            r9 = r12
            java.lang.Object r2 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchExactCatalogItems$default(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004c }
            if (r2 != r10) goto L_0x00c6
            return r10
        L_0x00c6:
            QL.x r2 = (QL.x) r2     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r2.a()     // Catch:{ all -> 0x004c }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x004c }
            r11 = r0
        L_0x00cf:
            return r11
        L_0x00d0:
            java.lang.String r2 = "Sugarcube"
            java.lang.String r3 = "Catalog items fetch failed"
            android.util.Log.e(r2, r3, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogItems(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012b A[Catch:{ all -> 0x0147 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0139 A[Catch:{ all -> 0x0147 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogPage(com.sugarcube.core.network.models.RoomType r21, android.net.Uri r22, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$1
            if (r2 == 0) goto L_0x0018
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$1 r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.label = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$1 r2 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$1
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.result
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.label
            r4 = 0
            r5 = 3
            r13 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0093
            if (r3 == r6) goto L_0x007f
            if (r3 == r13) goto L_0x0061
            if (r3 != r5) goto L_0x0059
            java.lang.Object r0 = r15.L$6
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.L$5
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.L$4
            com.sugarcube.core.network.api.NetworkAPIs r0 = (com.sugarcube.core.network.api.NetworkAPIs) r0
            java.lang.Object r0 = r15.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.L$2
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.L$1
            com.sugarcube.core.network.models.RoomType r0 = (com.sugarcube.core.network.models.RoomType) r0
            java.lang.Object r0 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0055 }
            r3 = r2
            r2 = r13
            goto L_0x012c
        L_0x0055:
            r0 = move-exception
            r2 = r13
            goto L_0x014d
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0061:
            boolean r0 = r15.Z$0
            java.lang.Object r3 = r15.L$5
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r3 = r15.L$4
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r3 = r15.L$3
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r15.L$2
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r6 = r15.L$1
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r7 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x00de
        L_0x007f:
            java.lang.Object r0 = r15.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r3 = r15.L$2
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r6 = r15.L$1
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r7 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x00b2
        L_0x0093:
            XH.y.b(r2)
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.configRepository     // Catch:{ all -> 0x0055 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0055 }
            r15.L$0 = r1     // Catch:{ all -> 0x0055 }
            r7 = r21
            r15.L$1 = r7     // Catch:{ all -> 0x0055 }
            r8 = r22
            r15.L$2 = r8     // Catch:{ all -> 0x0055 }
            r15.L$3 = r0     // Catch:{ all -> 0x0055 }
            r15.label = r6     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r3, r15)     // Catch:{ all -> 0x0055 }
            if (r2 != r14) goto L_0x00af
            return r14
        L_0x00af:
            r6 = r7
            r3 = r8
            r7 = r1
        L_0x00b2:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0055 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x00ec
            com.sugarcube.core.network.api.NetworkAPIs r8 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0055 }
            r15.L$0 = r7     // Catch:{ all -> 0x0055 }
            r15.L$1 = r6     // Catch:{ all -> 0x0055 }
            r15.L$2 = r3     // Catch:{ all -> 0x0055 }
            r15.L$3 = r0     // Catch:{ all -> 0x0055 }
            r15.L$4 = r3     // Catch:{ all -> 0x0055 }
            r15.L$5 = r3     // Catch:{ all -> 0x0055 }
            r15.Z$0 = r2     // Catch:{ all -> 0x0055 }
            r15.I$0 = r4     // Catch:{ all -> 0x0055 }
            r15.label = r13     // Catch:{ all -> 0x0055 }
            java.lang.Object r4 = r8.fetchCatalogPage(r3, r15)     // Catch:{ all -> 0x0055 }
            if (r4 != r14) goto L_0x00d7
            return r14
        L_0x00d7:
            r19 = r3
            r3 = r0
            r0 = r2
            r2 = r4
            r4 = r19
        L_0x00de:
            QL.x r2 = (QL.x) r2     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x00e9
            r19 = r4
            r4 = r0
            r0 = r3
            r3 = r19
            goto L_0x00ed
        L_0x00e9:
            r0 = r2
            r2 = r13
            goto L_0x012f
        L_0x00ec:
            r4 = r2
        L_0x00ed:
            com.sugarcube.core.network.api.NetworkAPIs r2 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0055 }
            OE.q r8 = r7.sugarcube     // Catch:{ all -> 0x0055 }
            java.lang.String r11 = r8.getRegion()     // Catch:{ all -> 0x0055 }
            java.lang.String r12 = r6.getApiKey()     // Catch:{ all -> 0x0055 }
            r15.L$0 = r7     // Catch:{ all -> 0x0055 }
            r15.L$1 = r6     // Catch:{ all -> 0x0055 }
            r15.L$2 = r3     // Catch:{ all -> 0x0055 }
            r15.L$3 = r0     // Catch:{ all -> 0x0055 }
            r15.L$4 = r2     // Catch:{ all -> 0x0055 }
            r15.L$5 = r11     // Catch:{ all -> 0x0055 }
            r15.L$6 = r12     // Catch:{ all -> 0x0055 }
            r15.Z$0 = r4     // Catch:{ all -> 0x0055 }
            r15.label = r5     // Catch:{ all -> 0x0055 }
            r5 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = 0
            r16 = 0
            r17 = 1660(0x67c, float:2.326E-42)
            r18 = 0
            r3 = r2
            r2 = r13
            r13 = r0
            r0 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            java.lang.Object r3 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchCatalogPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0147 }
            if (r3 != r0) goto L_0x012c
            return r0
        L_0x012c:
            r0 = r3
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x0147 }
        L_0x012f:
            com.sugarcube.app.base.data.Result$Success r3 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x0147 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0147 }
            com.sugarcube.core.network.models.CatalogPage r0 = (com.sugarcube.core.network.models.CatalogPage) r0     // Catch:{ all -> 0x0147 }
            if (r0 != 0) goto L_0x0149
            com.sugarcube.core.network.models.CatalogPage r0 = new com.sugarcube.core.network.models.CatalogPage     // Catch:{ all -> 0x0147 }
            r9 = 15
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0147 }
            goto L_0x0149
        L_0x0147:
            r0 = move-exception
            goto L_0x014d
        L_0x0149:
            r3.<init>(r0)     // Catch:{ all -> 0x0147 }
            goto L_0x015a
        L_0x014d:
            java.lang.String r3 = "Sugarcube"
            java.lang.String r4 = "Catalog page fetch failed"
            android.util.Log.e(r3, r4, r0)
            com.sugarcube.app.base.data.Result$Error r3 = new com.sugarcube.app.base.data.Result$Error
            r4 = 0
            r3.<init>(r0, r4, r2, r4)
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogPage(com.sugarcube.core.network.models.RoomType, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0127 A[Catch:{ all -> 0x0143 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135 A[Catch:{ all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogPageForCategory(java.lang.String r22, android.net.Uri r23, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>> r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r24
            boolean r2 = r0 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPageForCategory$1
            if (r2 == 0) goto L_0x0018
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPageForCategory$1 r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPageForCategory$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.label = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPageForCategory$1 r2 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPageForCategory$1
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.result
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.label
            r4 = 0
            r5 = 3
            r13 = 2
            r6 = 1
            if (r3 == 0) goto L_0x008f
            if (r3 == r6) goto L_0x007b
            if (r3 == r13) goto L_0x005d
            if (r3 != r5) goto L_0x0055
            java.lang.Object r0 = r15.L$5
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.L$4
            com.sugarcube.core.network.api.NetworkAPIs r0 = (com.sugarcube.core.network.api.NetworkAPIs) r0
            java.lang.Object r0 = r15.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.L$2
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0051 }
            r3 = r2
            r2 = r13
            goto L_0x0128
        L_0x0051:
            r0 = move-exception
            r2 = r13
            goto L_0x0149
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005d:
            boolean r0 = r15.Z$0
            java.lang.Object r3 = r15.L$5
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r3 = r15.L$4
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r3 = r15.L$3
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r15.L$2
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r6 = r15.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x00da
        L_0x007b:
            java.lang.Object r0 = r15.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r3 = r15.L$2
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r6 = r15.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x00ae
        L_0x008f:
            XH.y.b(r2)
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.configRepository     // Catch:{ all -> 0x0051 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0051 }
            r15.L$0 = r1     // Catch:{ all -> 0x0051 }
            r7 = r22
            r15.L$1 = r7     // Catch:{ all -> 0x0051 }
            r8 = r23
            r15.L$2 = r8     // Catch:{ all -> 0x0051 }
            r15.L$3 = r0     // Catch:{ all -> 0x0051 }
            r15.label = r6     // Catch:{ all -> 0x0051 }
            java.lang.Object r2 = r2.get(r3, r15)     // Catch:{ all -> 0x0051 }
            if (r2 != r14) goto L_0x00ab
            return r14
        L_0x00ab:
            r6 = r7
            r3 = r8
            r7 = r1
        L_0x00ae:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0051 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x00e9
            com.sugarcube.core.network.api.NetworkAPIs r8 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0051 }
            r15.L$0 = r7     // Catch:{ all -> 0x0051 }
            r15.L$1 = r6     // Catch:{ all -> 0x0051 }
            r15.L$2 = r3     // Catch:{ all -> 0x0051 }
            r15.L$3 = r0     // Catch:{ all -> 0x0051 }
            r15.L$4 = r3     // Catch:{ all -> 0x0051 }
            r15.L$5 = r3     // Catch:{ all -> 0x0051 }
            r15.Z$0 = r2     // Catch:{ all -> 0x0051 }
            r15.I$0 = r4     // Catch:{ all -> 0x0051 }
            r15.label = r13     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r8.fetchCatalogPage(r3, r15)     // Catch:{ all -> 0x0051 }
            if (r4 != r14) goto L_0x00d3
            return r14
        L_0x00d3:
            r20 = r3
            r3 = r0
            r0 = r2
            r2 = r4
            r4 = r20
        L_0x00da:
            QL.x r2 = (QL.x) r2     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x00e6
            r2 = r6
            r20 = r4
            r4 = r0
            r0 = r3
            r3 = r20
            goto L_0x00eb
        L_0x00e6:
            r0 = r2
            r2 = r13
            goto L_0x012b
        L_0x00e9:
            r4 = r2
            r2 = r6
        L_0x00eb:
            com.sugarcube.core.network.api.NetworkAPIs r6 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0051 }
            OE.q r8 = r7.sugarcube     // Catch:{ all -> 0x0051 }
            java.lang.String r11 = r8.getRegion()     // Catch:{ all -> 0x0051 }
            r15.L$0 = r7     // Catch:{ all -> 0x0051 }
            r15.L$1 = r2     // Catch:{ all -> 0x0051 }
            r15.L$2 = r3     // Catch:{ all -> 0x0051 }
            r15.L$3 = r0     // Catch:{ all -> 0x0051 }
            r15.L$4 = r6     // Catch:{ all -> 0x0051 }
            r15.L$5 = r11     // Catch:{ all -> 0x0051 }
            r15.Z$0 = r4     // Catch:{ all -> 0x0051 }
            r15.label = r5     // Catch:{ all -> 0x0051 }
            r5 = 30
            r0 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 1892(0x764, float:2.651E-42)
            r19 = 0
            r3 = r6
            r6 = r0
            r7 = r2
            r2 = r13
            r13 = r16
            r0 = r14
            r14 = r17
            r16 = r18
            r17 = r19
            java.lang.Object r3 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchCatalogPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0143 }
            if (r3 != r0) goto L_0x0128
            return r0
        L_0x0128:
            r0 = r3
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x0143 }
        L_0x012b:
            com.sugarcube.app.base.data.Result$Success r3 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x0143 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0143 }
            com.sugarcube.core.network.models.CatalogPage r0 = (com.sugarcube.core.network.models.CatalogPage) r0     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0145
            com.sugarcube.core.network.models.CatalogPage r0 = new com.sugarcube.core.network.models.CatalogPage     // Catch:{ all -> 0x0143 }
            r9 = 15
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0143 }
            goto L_0x0145
        L_0x0143:
            r0 = move-exception
            goto L_0x0149
        L_0x0145:
            r3.<init>(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x0156
        L_0x0149:
            java.lang.String r3 = "Sugarcube"
            java.lang.String r4 = "Catalog page fetch failed"
            android.util.Log.e(r3, r4, r0)
            com.sugarcube.app.base.data.Result$Error r3 = new com.sugarcube.app.base.data.Result$Error
            r4 = 0
            r3.<init>(r0, r4, r2, r4)
        L_0x0156:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogPageForCategory(java.lang.String, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf A[Catch:{ all -> 0x00e6, all -> 0x00e4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc A[Catch:{ all -> 0x00e6, all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9 A[Catch:{ all -> 0x00e6, all -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogSearchResultsPage(java.lang.String r22, java.lang.String r23, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogSearchPage>> r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r24
            boolean r2 = r0 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSearchResultsPage$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSearchResultsPage$1 r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSearchResultsPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSearchResultsPage$1 r2 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSearchResultsPage$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.result
            java.lang.Object r15 = eI.C17187b.f()
            int r4 = r2.label
            r14 = 2
            r5 = 1
            r13 = 0
            if (r4 == 0) goto L_0x006c
            if (r4 == r5) goto L_0x0056
            if (r4 != r14) goto L_0x004e
            java.lang.Object r0 = r2.L$5
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$4
            com.sugarcube.core.network.api.NetworkAPIs r0 = (com.sugarcube.core.network.api.NetworkAPIs) r0
            java.lang.Object r0 = r2.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r0
            XH.y.b(r3)     // Catch:{ all -> 0x004a }
            goto L_0x00d0
        L_0x004a:
            r0 = move-exception
            r4 = r13
            goto L_0x00ee
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r2.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r4 = r2.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r6 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r6
            XH.y.b(r3)     // Catch:{ all -> 0x004a }
            r10 = r4
            r4 = r5
            goto L_0x008b
        L_0x006c:
            XH.y.b(r3)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r1.configRepository     // Catch:{ all -> 0x004a }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r4 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x004a }
            r2.L$0 = r1     // Catch:{ all -> 0x004a }
            r6 = r22
            r2.L$1 = r6     // Catch:{ all -> 0x004a }
            r7 = r23
            r2.L$2 = r7     // Catch:{ all -> 0x004a }
            r2.L$3 = r0     // Catch:{ all -> 0x004a }
            r2.label = r5     // Catch:{ all -> 0x004a }
            java.lang.Object r3 = r3.get(r4, r2)     // Catch:{ all -> 0x004a }
            if (r3 != r15) goto L_0x0088
            return r15
        L_0x0088:
            r4 = r6
            r10 = r7
            r6 = r1
        L_0x008b:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x004a }
            boolean r5 = r3.booleanValue()     // Catch:{ all -> 0x004a }
            com.sugarcube.core.network.api.NetworkAPIs r3 = r6.getNetworkAPIs()     // Catch:{ all -> 0x004a }
            OE.q r7 = r6.sugarcube     // Catch:{ all -> 0x004a }
            java.lang.String r12 = r7.getRegion()     // Catch:{ all -> 0x004a }
            r2.L$0 = r6     // Catch:{ all -> 0x004a }
            r2.L$1 = r4     // Catch:{ all -> 0x004a }
            r2.L$2 = r10     // Catch:{ all -> 0x004a }
            r2.L$3 = r0     // Catch:{ all -> 0x004a }
            r2.L$4 = r3     // Catch:{ all -> 0x004a }
            r2.L$5 = r12     // Catch:{ all -> 0x004a }
            r2.Z$0 = r5     // Catch:{ all -> 0x004a }
            r2.label = r14     // Catch:{ all -> 0x004a }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 3516(0xdbc, float:4.927E-42)
            r19 = 0
            r20 = r12
            r12 = r0
            r13 = r20
            r14 = r16
            r0 = r15
            r15 = r17
            r16 = r2
            r17 = r18
            r18 = r19
            java.lang.Object r3 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchCatalogSearchPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00e6 }
            if (r3 != r0) goto L_0x00d0
            return r0
        L_0x00d0:
            QL.x r3 = (QL.x) r3     // Catch:{ all -> 0x00e6 }
            com.sugarcube.app.base.data.Result$Success r0 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x00e6 }
            java.lang.Object r2 = r3.a()     // Catch:{ all -> 0x00e6 }
            com.sugarcube.core.network.models.CatalogSearchPage r2 = (com.sugarcube.core.network.models.CatalogSearchPage) r2     // Catch:{ all -> 0x00e6 }
            if (r2 != 0) goto L_0x00e9
            com.sugarcube.core.network.models.CatalogSearchPage r2 = new com.sugarcube.core.network.models.CatalogSearchPage     // Catch:{ all -> 0x00e6 }
            r3 = 3
            r4 = 0
            r2.<init>(r4, r4, r3, r4)     // Catch:{ all -> 0x00e4 }
            goto L_0x00ea
        L_0x00e4:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e6:
            r0 = move-exception
            r4 = 0
            goto L_0x00ee
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            r0.<init>(r2)     // Catch:{ all -> 0x00e4 }
            goto L_0x00fc
        L_0x00ee:
            java.lang.String r2 = "Sugarcube"
            java.lang.String r3 = "Catalog search results fetch failed"
            android.util.Log.e(r2, r3, r0)
            com.sugarcube.app.base.data.Result$Error r2 = new com.sugarcube.app.base.data.Result$Error
            r3 = 2
            r2.<init>(r0, r4, r3, r4)
            r0 = r2
        L_0x00fc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogSearchResultsPage(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7 A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1 A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4 A[Catch:{ all -> 0x0046 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101 A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogSwapSuggestionsPage(int r16, android.net.Uri r17, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>> r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            boolean r2 = r0 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1 r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
        L_0x0015:
            r9 = r2
            goto L_0x001d
        L_0x0017:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1 r2 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogSwapSuggestionsPage$1
            r2.<init>(r15, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r2 = r9.result
            java.lang.Object r12 = eI.C17187b.f()
            int r3 = r9.label
            r4 = 0
            r5 = 3
            r13 = 2
            r6 = 1
            if (r3 == 0) goto L_0x007f
            if (r3 == r6) goto L_0x006d
            if (r3 == r13) goto L_0x0051
            if (r3 != r5) goto L_0x0049
            java.lang.Object r0 = r9.L$3
            com.sugarcube.core.network.api.NetworkAPIs r0 = (com.sugarcube.core.network.api.NetworkAPIs) r0
            java.lang.Object r0 = r9.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r9.L$1
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r9.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x00f5
        L_0x0046:
            r0 = move-exception
            goto L_0x0112
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0051:
            boolean r0 = r9.Z$0
            int r3 = r9.I$0
            java.lang.Object r4 = r9.L$4
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r4 = r9.L$3
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r4 = r9.L$2
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r6 = r9.L$1
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r7 = r9.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x00c9
        L_0x006d:
            int r0 = r9.I$0
            java.lang.Object r3 = r9.L$2
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r6 = r9.L$1
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r7 = r9.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x009f
        L_0x007f:
            XH.y.b(r2)
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.configRepository     // Catch:{ all -> 0x0046 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0046 }
            r9.L$0 = r1     // Catch:{ all -> 0x0046 }
            r7 = r17
            r9.L$1 = r7     // Catch:{ all -> 0x0046 }
            r9.L$2 = r0     // Catch:{ all -> 0x0046 }
            r8 = r16
            r9.I$0 = r8     // Catch:{ all -> 0x0046 }
            r9.label = r6     // Catch:{ all -> 0x0046 }
            java.lang.Object r2 = r2.get(r3, r9)     // Catch:{ all -> 0x0046 }
            if (r2 != r12) goto L_0x009b
            return r12
        L_0x009b:
            r3 = r0
            r6 = r7
            r0 = r8
            r7 = r1
        L_0x009f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0046 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x00d1
            com.sugarcube.core.network.api.NetworkAPIs r8 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0046 }
            r9.L$0 = r7     // Catch:{ all -> 0x0046 }
            r9.L$1 = r6     // Catch:{ all -> 0x0046 }
            r9.L$2 = r3     // Catch:{ all -> 0x0046 }
            r9.L$3 = r6     // Catch:{ all -> 0x0046 }
            r9.L$4 = r6     // Catch:{ all -> 0x0046 }
            r9.I$0 = r0     // Catch:{ all -> 0x0046 }
            r9.Z$0 = r2     // Catch:{ all -> 0x0046 }
            r9.I$1 = r4     // Catch:{ all -> 0x0046 }
            r9.label = r13     // Catch:{ all -> 0x0046 }
            java.lang.Object r4 = r8.fetchCatalogPage(r6, r9)     // Catch:{ all -> 0x0046 }
            if (r4 != r12) goto L_0x00c4
            return r12
        L_0x00c4:
            r14 = r3
            r3 = r0
            r0 = r2
            r2 = r4
            r4 = r14
        L_0x00c9:
            QL.x r2 = (QL.x) r2     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x00f7
            r14 = r4
            r4 = r3
            r3 = r14
            goto L_0x00d3
        L_0x00d1:
            r4 = r0
            r0 = r2
        L_0x00d3:
            com.sugarcube.core.network.api.NetworkAPIs r2 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0046 }
            r9.L$0 = r7     // Catch:{ all -> 0x0046 }
            r9.L$1 = r6     // Catch:{ all -> 0x0046 }
            r9.L$2 = r3     // Catch:{ all -> 0x0046 }
            r9.L$3 = r2     // Catch:{ all -> 0x0046 }
            r9.I$0 = r4     // Catch:{ all -> 0x0046 }
            r9.Z$0 = r0     // Catch:{ all -> 0x0046 }
            r9.label = r5     // Catch:{ all -> 0x0046 }
            r6 = 30
            r7 = 0
            r8 = 0
            r10 = 24
            r11 = 0
            r3 = r2
            r5 = r0
            java.lang.Object r2 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchCatalogItemSwappables$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0046 }
            if (r2 != r12) goto L_0x00f5
            return r12
        L_0x00f5:
            QL.x r2 = (QL.x) r2     // Catch:{ all -> 0x0046 }
        L_0x00f7:
            com.sugarcube.app.base.data.Result$Success r0 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x0046 }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x0046 }
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x010e
            com.sugarcube.core.network.models.CatalogPage r2 = new com.sugarcube.core.network.models.CatalogPage     // Catch:{ all -> 0x0046 }
            r8 = 15
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0046 }
        L_0x010e:
            r0.<init>(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0120
        L_0x0112:
            java.lang.String r2 = "Sugarcube"
            java.lang.String r3 = "Catalog search results fetch failed"
            android.util.Log.e(r2, r3, r0)
            com.sugarcube.app.base.data.Result$Error r2 = new com.sugarcube.app.base.data.Result$Error
            r3 = 0
            r2.<init>(r0, r3, r13, r3)
            r0 = r2
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogSwapSuggestionsPage(int, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        jI.C17416c.a(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r9 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        jI.C17416c.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchItemAsset(java.io.File r9, android.net.Uri r10, boolean r11, dI.C17164e<? super java.io.File> r12) {
        /*
            r8 = this;
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x000d
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x000a }
            r9.<init>(r12)     // Catch:{ all -> 0x000a }
            return r9
        L_0x000a:
            r9 = move-exception
            goto L_0x00a0
        L_0x000d:
            GK.z r11 = new GK.z     // Catch:{ all -> 0x000a }
            r11.<init>()     // Catch:{ all -> 0x000a }
            GK.B$a r0 = new GK.B$a     // Catch:{ all -> 0x000a }
            r0.<init>()     // Catch:{ all -> 0x000a }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x000a }
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r10, r1)     // Catch:{ all -> 0x000a }
            GK.B$a r10 = r0.n(r10)     // Catch:{ all -> 0x000a }
            GK.B r10 = r10.b()     // Catch:{ all -> 0x000a }
            GK.e r10 = r11.b(r10)     // Catch:{ all -> 0x000a }
            GK.D r10 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r10)     // Catch:{ all -> 0x000a }
            int r11 = r10.g()     // Catch:{ all -> 0x0085 }
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            if (r0 > r11) goto L_0x003f
            r0 = 300(0x12c, float:4.2E-43)
            if (r11 >= r0) goto L_0x003f
            r11 = r10
            goto L_0x0040
        L_0x003f:
            r11 = r1
        L_0x0040:
            if (r11 == 0) goto L_0x0091
            GK.E r11 = r11.c()     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x008e
            java.io.InputStream r11 = r11.c()     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x008e
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r9.getAbsolutePath()     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            r3.<init>()     // Catch:{ all -> 0x0085 }
            r3.append(r2)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = ".part"
            r3.append(r2)     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0085 }
            r0.<init>(r2)     // Catch:{ all -> 0x0085 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0085 }
            r2.<init>(r0)     // Catch:{ all -> 0x0085 }
            r3 = 0
            r4 = 2
            jI.C17415b.b(r11, r2, r3, r4, r1)     // Catch:{ all -> 0x0087 }
            jI.C17416c.a(r2, r1)     // Catch:{ all -> 0x0085 }
            r11.close()     // Catch:{ all -> 0x0085 }
            r6 = 4
            r7 = 0
            r4 = 1
            r5 = 0
            r2 = r0
            r3 = r9
            jI.C17423j.q(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0085 }
            r0.delete()     // Catch:{ SecurityException -> 0x008f }
            goto L_0x008f
        L_0x0085:
            r9 = move-exception
            goto L_0x009a
        L_0x0087:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r11 = move-exception
            jI.C17416c.a(r2, r9)     // Catch:{ all -> 0x0085 }
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x008e:
            r9 = r1
        L_0x008f:
            if (r9 != 0) goto L_0x0096
        L_0x0091:
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0085 }
            r9.<init>(r12)     // Catch:{ all -> 0x0085 }
        L_0x0096:
            jI.C17416c.a(r10, r1)     // Catch:{ all -> 0x000a }
            return r9
        L_0x009a:
            throw r9     // Catch:{ all -> 0x009b }
        L_0x009b:
            r11 = move-exception
            jI.C17416c.a(r10, r9)     // Catch:{ all -> 0x000a }
            throw r11     // Catch:{ all -> 0x000a }
        L_0x00a0:
            java.lang.String r10 = "Sugarcube"
            java.lang.String r11 = "item asset fetch failed"
            android.util.Log.e(r10, r11, r9)
            java.io.File r9 = new java.io.File
            r9.<init>(r12)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchItemAsset(java.io.File, android.net.Uri, boolean, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl} */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        r7 = r4.getPostalCode();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a A[SYNTHETIC, Splitter:B:53:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0155 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175 A[Catch:{ all -> 0x0057 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01af A[Catch:{ all -> 0x01b7 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductInfo(java.util.List<java.lang.Integer> r28, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.CatalogItem>> r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfo$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfo$1 r3 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfo$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.label = r4
        L_0x0018:
            r11 = r3
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfo$1 r3 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfo$1
            r3.<init>(r1, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r11.result
            java.lang.Object r14 = eI.C17187b.f()
            int r4 = r11.label
            r15 = 4
            r13 = 3
            r12 = 1
            r10 = 2
            if (r4 == 0) goto L_0x00da
            if (r4 == r12) goto L_0x00b8
            if (r4 == r10) goto L_0x0090
            if (r4 == r13) goto L_0x0064
            if (r4 != r15) goto L_0x005c
            java.lang.Object r0 = r11.L$5
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = r11.L$4
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = r11.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r11.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r11.L$0
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0057 }
            r0 = r3
            r3 = r10
            r15 = r12
            goto L_0x01b0
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            r3 = r10
            r15 = r12
            goto L_0x01c2
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0064:
            java.lang.Object r0 = r11.L$6
            com.sugarcube.core.network.models.LoggedInUser r0 = (com.sugarcube.core.network.models.LoggedInUser) r0
            java.lang.Object r0 = r11.L$5
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r2 = r11.L$4
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r11.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r11.L$2
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r11.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r11.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r3)     // Catch:{ all -> 0x008d }
            r8 = r0
            r0 = r5
            r5 = r4
            r25 = r7
            r7 = r2
            r2 = r25
            goto L_0x017b
        L_0x008d:
            r0 = move-exception
            r2 = r7
            goto L_0x0058
        L_0x0090:
            java.lang.Object r0 = r11.L$5
            com.sugarcube.core.network.models.LoggedInUser r0 = (com.sugarcube.core.network.models.LoggedInUser) r0
            java.lang.Object r0 = r11.L$4
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r2 = r11.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r11.L$2
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r5 = r11.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r11.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r6 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r6
            XH.y.b(r3)     // Catch:{ all -> 0x00b5 }
            r25 = r3
            r3 = r2
            r2 = r6
            r6 = r5
            r5 = r4
            r4 = r25
            goto L_0x014b
        L_0x00b5:
            r0 = move-exception
            r2 = r6
            goto L_0x0058
        L_0x00b8:
            java.lang.Object r0 = r11.L$4
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r11.L$2
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r4 = r11.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r11.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r5 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r5
            XH.y.b(r3)     // Catch:{ all -> 0x00d6 }
            r25 = r3
            r3 = r0
            r0 = r4
            r4 = r25
            goto L_0x0116
        L_0x00d6:
            r0 = move-exception
            r2 = r5
            goto L_0x0058
        L_0x00da:
            XH.y.b(r3)
            if (r0 == 0) goto L_0x00f9
            r16 = r0
            java.lang.Iterable r16 = (java.lang.Iterable) r16     // Catch:{ all -> 0x01be }
            r23 = 63
            r24 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r3 = YH.C16877v.G0(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x00fc
        L_0x00f9:
            r2 = 0
            goto L_0x02fe
        L_0x00fc:
            com.sugarcube.app.base.data.user.UserRepo r4 = r1.userRepo     // Catch:{ all -> 0x01be }
            TJ.P r4 = r4.getUser()     // Catch:{ all -> 0x01be }
            r11.L$0 = r1     // Catch:{ all -> 0x01be }
            r11.L$1 = r0     // Catch:{ all -> 0x01be }
            r11.L$2 = r2     // Catch:{ all -> 0x01be }
            r11.L$3 = r3     // Catch:{ all -> 0x01be }
            r11.L$4 = r3     // Catch:{ all -> 0x01be }
            r11.label = r12     // Catch:{ all -> 0x01be }
            java.lang.Object r4 = TJ.C16534i.D(r4, r11)     // Catch:{ all -> 0x01be }
            if (r4 != r14) goto L_0x0115
            return r14
        L_0x0115:
            r5 = r1
        L_0x0116:
            com.sugarcube.core.network.models.LoggedInUser r4 = (com.sugarcube.core.network.models.LoggedInUser) r4     // Catch:{ all -> 0x01b9 }
            if (r4 == 0) goto L_0x0125
            java.lang.String r6 = r4.getPreferredStore()     // Catch:{ all -> 0x00d6 }
            if (r6 == 0) goto L_0x0125
            java.lang.Integer r6 = HJ.C15854t.t(r6)     // Catch:{ all -> 0x00d6 }
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            com.sugarcube.app.base.data.user.UserRepo r7 = r5.userRepo     // Catch:{ all -> 0x01b9 }
            TJ.P r7 = r7.getUser()     // Catch:{ all -> 0x01b9 }
            r11.L$0 = r5     // Catch:{ all -> 0x01b9 }
            r11.L$1 = r0     // Catch:{ all -> 0x01b9 }
            r11.L$2 = r2     // Catch:{ all -> 0x01b9 }
            r11.L$3 = r3     // Catch:{ all -> 0x01b9 }
            r11.L$4 = r6     // Catch:{ all -> 0x01b9 }
            r11.L$5 = r4     // Catch:{ all -> 0x01b9 }
            r11.label = r10     // Catch:{ all -> 0x01b9 }
            java.lang.Object r4 = TJ.C16534i.D(r7, r11)     // Catch:{ all -> 0x01b9 }
            if (r4 != r14) goto L_0x0141
            return r14
        L_0x0141:
            r25 = r6
            r6 = r0
            r0 = r25
            r26 = r5
            r5 = r2
            r2 = r26
        L_0x014b:
            com.sugarcube.core.network.models.LoggedInUser r4 = (com.sugarcube.core.network.models.LoggedInUser) r4     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x015a
            java.lang.String r7 = r4.getPostalCode()     // Catch:{ all -> 0x0057 }
            if (r7 == 0) goto L_0x015a
            java.lang.Integer r7 = HJ.C15854t.t(r7)     // Catch:{ all -> 0x0057 }
            goto L_0x015b
        L_0x015a:
            r7 = 0
        L_0x015b:
            com.sugarcube.app.base.data.feature.ConfigRepository r8 = r2.configRepository     // Catch:{ all -> 0x0057 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r9 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0057 }
            r11.L$0 = r2     // Catch:{ all -> 0x0057 }
            r11.L$1 = r6     // Catch:{ all -> 0x0057 }
            r11.L$2 = r5     // Catch:{ all -> 0x0057 }
            r11.L$3 = r3     // Catch:{ all -> 0x0057 }
            r11.L$4 = r0     // Catch:{ all -> 0x0057 }
            r11.L$5 = r7     // Catch:{ all -> 0x0057 }
            r11.L$6 = r4     // Catch:{ all -> 0x0057 }
            r11.label = r13     // Catch:{ all -> 0x0057 }
            java.lang.Object r4 = r8.get(r9, r11)     // Catch:{ all -> 0x0057 }
            if (r4 != r14) goto L_0x0176
            return r14
        L_0x0176:
            r8 = r7
            r7 = r0
            r0 = r5
            r5 = r3
            r3 = r4
        L_0x017b:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0057 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0057 }
            com.sugarcube.core.network.api.NetworkAPIs r4 = r2.getNetworkAPIs()     // Catch:{ all -> 0x0057 }
            OE.q r9 = r2.sugarcube     // Catch:{ all -> 0x0057 }
            java.lang.String r9 = r9.getRegion()     // Catch:{ all -> 0x0057 }
            r11.L$0 = r2     // Catch:{ all -> 0x0057 }
            r11.L$1 = r6     // Catch:{ all -> 0x0057 }
            r11.L$2 = r0     // Catch:{ all -> 0x0057 }
            r11.L$3 = r5     // Catch:{ all -> 0x0057 }
            r11.L$4 = r7     // Catch:{ all -> 0x0057 }
            r11.L$5 = r8     // Catch:{ all -> 0x0057 }
            r11.Z$0 = r3     // Catch:{ all -> 0x0057 }
            r11.label = r15     // Catch:{ all -> 0x0057 }
            r0 = 0
            r17 = 32
            r18 = 0
            r6 = r3
            r3 = 0
            r3 = r10
            r10 = r0
            r15 = r12
            r12 = r17
            r13 = r18
            java.lang.Object r0 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchProductInformationDetails$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01b7 }
            if (r0 != r14) goto L_0x01b0
            return r14
        L_0x01b0:
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x01b7 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x01b7 }
            return r0
        L_0x01b7:
            r0 = move-exception
            goto L_0x01c2
        L_0x01b9:
            r0 = move-exception
            r3 = r10
            r15 = r12
            r2 = r5
            goto L_0x01c2
        L_0x01be:
            r0 = move-exception
            r3 = r10
            r15 = r12
            r2 = r1
        L_0x01c2:
            com.sugarcube.core.logger.Priority r4 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r0 = XH.C16816g.b(r0)
            if (r0 != 0) goto L_0x01cc
            java.lang.String r0 = ""
        L_0x01cc:
            int[] r5 = com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfo$$inlined$logError$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r5[r4]
            java.lang.String r5 = " "
            java.lang.String r6 = "Kt"
            r7 = 46
            r8 = 36
            java.lang.String r9 = "Product info fetch failed"
            if (r4 == r15) goto L_0x02c8
            if (r4 == r3) goto L_0x0292
            r10 = 3
            if (r4 == r10) goto L_0x025d
            r10 = 4
            if (r4 == r10) goto L_0x0228
            r10 = 5
            if (r4 != r10) goto L_0x0222
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r4 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r4, r3, r4)
            java.lang.String r3 = HJ.C15854t.o1(r8, r7, r4, r3, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0206
            goto L_0x020a
        L_0x0206:
            java.lang.String r2 = HJ.C15854t.P0(r3, r6)
        L_0x020a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r2, r0)
        L_0x021f:
            r2 = 0
            goto L_0x02fe
        L_0x0222:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0228:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r4 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r4, r3, r4)
            java.lang.String r3 = HJ.C15854t.o1(r8, r7, r4, r3, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0243
            goto L_0x0247
        L_0x0243:
            java.lang.String r2 = HJ.C15854t.P0(r3, r6)
        L_0x0247:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r2, r0)
            goto L_0x021f
        L_0x025d:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r4 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r4, r3, r4)
            java.lang.String r3 = HJ.C15854t.o1(r8, r7, r4, r3, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0278
            goto L_0x027c
        L_0x0278:
            java.lang.String r2 = HJ.C15854t.P0(r3, r6)
        L_0x027c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.i(r2, r0)
            goto L_0x021f
        L_0x0292:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r4 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r4, r3, r4)
            java.lang.String r3 = HJ.C15854t.o1(r8, r7, r4, r3, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x02ad
            goto L_0x02b1
        L_0x02ad:
            java.lang.String r2 = HJ.C15854t.P0(r3, r6)
        L_0x02b1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r2, r0)
            goto L_0x021f
        L_0x02c8:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r4 = 0
            java.lang.String r8 = HJ.C15854t.s1(r2, r8, r4, r3, r4)
            java.lang.String r3 = HJ.C15854t.o1(r8, r7, r4, r3, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x02e3
            goto L_0x02e7
        L_0x02e3:
            java.lang.String r2 = HJ.C15854t.P0(r3, r6)
        L_0x02e7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r2, r0)
            goto L_0x021f
        L_0x02fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchProductInfo(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da A[SYNTHETIC, Splitter:B:45:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138 A[Catch:{ all -> 0x0140 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductInfoLocalIds(java.util.List<java.lang.String> r27, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.CatalogItem>> r28) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            boolean r3 = r2 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfoLocalIds$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfoLocalIds$1 r3 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfoLocalIds$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.label = r4
        L_0x0018:
            r11 = r3
            goto L_0x0020
        L_0x001a:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfoLocalIds$1 r3 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfoLocalIds$1
            r3.<init>(r1, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r3 = r11.result
            java.lang.Object r14 = eI.C17187b.f()
            int r4 = r11.label
            r15 = 1
            r13 = 2
            r12 = 0
            if (r4 == 0) goto L_0x008d
            if (r4 == r15) goto L_0x005f
            if (r4 != r13) goto L_0x0057
            java.lang.Object r0 = r11.L$5
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = r11.L$4
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = r11.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.L$2
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r11.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r11.L$0
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0052 }
            r0 = r3
            r3 = r2
            r2 = r13
            goto L_0x0139
        L_0x0052:
            r0 = move-exception
            r3 = r2
        L_0x0054:
            r2 = r13
            goto L_0x0148
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005f:
            java.lang.Object r0 = r11.L$6
            com.sugarcube.core.network.models.LoggedInUser r0 = (com.sugarcube.core.network.models.LoggedInUser) r0
            java.lang.Object r0 = r11.L$5
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r2 = r11.L$4
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r11.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r11.L$2
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r11.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r11.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r3)     // Catch:{ all -> 0x008a }
            r8 = r0
            r0 = r6
            r6 = r4
            r25 = r7
            r7 = r2
            r2 = r5
            r5 = r3
            r3 = r25
            goto L_0x0105
        L_0x008a:
            r0 = move-exception
            r3 = r7
            goto L_0x0054
        L_0x008d:
            XH.y.b(r3)
            if (r0 == 0) goto L_0x00ac
            r16 = r0
            java.lang.Iterable r16 = (java.lang.Iterable) r16     // Catch:{ all -> 0x0145 }
            java.lang.String r17 = ","
            r23 = 62
            r24 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r3 = YH.C16877v.G0(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0145 }
            if (r3 != 0) goto L_0x00af
        L_0x00ac:
            r4 = r12
            goto L_0x0281
        L_0x00af:
            com.sugarcube.app.base.data.user.UserRepo r4 = r1.userRepo     // Catch:{ all -> 0x0145 }
            TJ.P r4 = r4.getUser()     // Catch:{ all -> 0x0145 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0145 }
            com.sugarcube.core.network.models.LoggedInUser r4 = (com.sugarcube.core.network.models.LoggedInUser) r4     // Catch:{ all -> 0x0145 }
            if (r4 == 0) goto L_0x00cb
            java.lang.String r4 = r4.getPreferredStore()     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x00cb
            java.lang.Integer r4 = HJ.C15854t.t(r4)     // Catch:{ all -> 0x00c8 }
            goto L_0x00cc
        L_0x00c8:
            r0 = move-exception
            r3 = r1
            goto L_0x0054
        L_0x00cb:
            r4 = r12
        L_0x00cc:
            com.sugarcube.app.base.data.user.UserRepo r5 = r1.userRepo     // Catch:{ all -> 0x0145 }
            TJ.P r5 = r5.getUser()     // Catch:{ all -> 0x0145 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0145 }
            com.sugarcube.core.network.models.LoggedInUser r5 = (com.sugarcube.core.network.models.LoggedInUser) r5     // Catch:{ all -> 0x0145 }
            if (r5 == 0) goto L_0x00e5
            java.lang.String r6 = r5.getPostalCode()     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00e5
            java.lang.Integer r6 = HJ.C15854t.t(r6)     // Catch:{ all -> 0x00c8 }
            goto L_0x00e6
        L_0x00e5:
            r6 = r12
        L_0x00e6:
            com.sugarcube.app.base.data.feature.ConfigRepository r7 = r1.configRepository     // Catch:{ all -> 0x0145 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r8 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0145 }
            r11.L$0 = r1     // Catch:{ all -> 0x0145 }
            r11.L$1 = r0     // Catch:{ all -> 0x0145 }
            r11.L$2 = r2     // Catch:{ all -> 0x0145 }
            r11.L$3 = r3     // Catch:{ all -> 0x0145 }
            r11.L$4 = r4     // Catch:{ all -> 0x0145 }
            r11.L$5 = r6     // Catch:{ all -> 0x0145 }
            r11.L$6 = r5     // Catch:{ all -> 0x0145 }
            r11.label = r15     // Catch:{ all -> 0x0145 }
            java.lang.Object r5 = r7.get(r8, r11)     // Catch:{ all -> 0x0145 }
            if (r5 != r14) goto L_0x0101
            return r14
        L_0x0101:
            r7 = r4
            r8 = r6
            r6 = r3
            r3 = r1
        L_0x0105:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0142 }
            boolean r9 = r5.booleanValue()     // Catch:{ all -> 0x0142 }
            com.sugarcube.core.network.api.NetworkAPIs r4 = r3.getNetworkAPIs()     // Catch:{ all -> 0x0142 }
            OE.q r5 = r3.sugarcube     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r5.getRegion()     // Catch:{ all -> 0x0142 }
            r11.L$0 = r3     // Catch:{ all -> 0x0142 }
            r11.L$1 = r0     // Catch:{ all -> 0x0142 }
            r11.L$2 = r2     // Catch:{ all -> 0x0142 }
            r11.L$3 = r6     // Catch:{ all -> 0x0142 }
            r11.L$4 = r7     // Catch:{ all -> 0x0142 }
            r11.L$5 = r8     // Catch:{ all -> 0x0142 }
            r11.Z$0 = r9     // Catch:{ all -> 0x0142 }
            r11.label = r13     // Catch:{ all -> 0x0142 }
            r0 = 0
            r2 = 32
            r16 = 0
            r5 = r6
            r6 = r9
            r9 = r10
            r10 = r0
            r12 = r2
            r2 = r13
            r13 = r16
            java.lang.Object r0 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchProductInformationDetailsLocalItem$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0140 }
            if (r0 != r14) goto L_0x0139
            return r14
        L_0x0139:
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x0140 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0140 }
            return r0
        L_0x0140:
            r0 = move-exception
            goto L_0x0148
        L_0x0142:
            r0 = move-exception
            goto L_0x0054
        L_0x0145:
            r0 = move-exception
            r2 = r13
            r3 = r1
        L_0x0148:
            com.sugarcube.core.logger.Priority r4 = com.sugarcube.core.logger.Priority.ERROR
            java.lang.String r0 = XH.C16816g.b(r0)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = ""
        L_0x0152:
            int[] r5 = com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductInfoLocalIds$$inlined$logError$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r5[r4]
            java.lang.String r5 = " "
            java.lang.String r6 = "Kt"
            r7 = 46
            r8 = 36
            java.lang.String r9 = "Product info fetch failed"
            if (r4 == r15) goto L_0x024d
            if (r4 == r2) goto L_0x0218
            r10 = 3
            if (r4 == r10) goto L_0x01e3
            r10 = 4
            if (r4 == r10) goto L_0x01ad
            r10 = 5
            if (r4 != r10) goto L_0x01a7
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 0
            java.lang.String r8 = HJ.C15854t.s1(r3, r8, r4, r2, r4)
            java.lang.String r2 = HJ.C15854t.o1(r8, r7, r4, r2, r4)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x018c
            goto L_0x0190
        L_0x018c:
            java.lang.String r3 = HJ.C15854t.P0(r2, r6)
        L_0x0190:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r3, r0)
            goto L_0x0281
        L_0x01a7:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01ad:
            r4 = 0
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            java.lang.String r8 = HJ.C15854t.s1(r3, r8, r4, r2, r4)
            java.lang.String r2 = HJ.C15854t.o1(r8, r7, r4, r2, r4)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x01c8
            goto L_0x01cc
        L_0x01c8:
            java.lang.String r3 = HJ.C15854t.P0(r2, r6)
        L_0x01cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r3, r0)
            goto L_0x0281
        L_0x01e3:
            r4 = 0
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            java.lang.String r8 = HJ.C15854t.s1(r3, r8, r4, r2, r4)
            java.lang.String r2 = HJ.C15854t.o1(r8, r7, r4, r2, r4)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x01fe
            goto L_0x0202
        L_0x01fe:
            java.lang.String r3 = HJ.C15854t.P0(r2, r6)
        L_0x0202:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.i(r3, r0)
            goto L_0x0281
        L_0x0218:
            r4 = 0
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            java.lang.String r8 = HJ.C15854t.s1(r3, r8, r4, r2, r4)
            java.lang.String r2 = HJ.C15854t.o1(r8, r7, r4, r2, r4)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            java.lang.String r3 = HJ.C15854t.P0(r2, r6)
        L_0x0237:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r3, r0)
            goto L_0x0281
        L_0x024d:
            r4 = 0
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            java.lang.String r8 = HJ.C15854t.s1(r3, r8, r4, r2, r4)
            java.lang.String r2 = HJ.C15854t.o1(r8, r7, r4, r2, r4)
            int r7 = r2.length()
            if (r7 != 0) goto L_0x0268
            goto L_0x026c
        L_0x0268:
            java.lang.String r3 = HJ.C15854t.P0(r2, r6)
        L_0x026c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r3, r0)
        L_0x0281:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchProductInfoLocalIds(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d A[Catch:{ all -> 0x0034 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductRecommendations(int r7, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.CatalogItem>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductRecommendations$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductRecommendations$1 r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductRecommendations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductRecommendations$1 r0 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductRecommendations$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004c
            if (r3 == r5) goto L_0x003e
            if (r3 != r4) goto L_0x0036
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x007e
        L_0x0034:
            r7 = move-exception
            goto L_0x0087
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r3 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r3
            XH.y.b(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0063
        L_0x004c:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r6.configRepository     // Catch:{ all -> 0x0034 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0034 }
            r0.L$0 = r6     // Catch:{ all -> 0x0034 }
            r0.L$1 = r8     // Catch:{ all -> 0x0034 }
            r0.I$0 = r7     // Catch:{ all -> 0x0034 }
            r0.label = r5     // Catch:{ all -> 0x0034 }
            java.lang.Object r1 = r1.get(r3, r0)     // Catch:{ all -> 0x0034 }
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            r3 = r6
        L_0x0063:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0034 }
            com.sugarcube.core.network.api.NetworkAPIs r5 = r3.getNetworkAPIs()     // Catch:{ all -> 0x0034 }
            r0.L$0 = r3     // Catch:{ all -> 0x0034 }
            r0.L$1 = r8     // Catch:{ all -> 0x0034 }
            r0.I$0 = r7     // Catch:{ all -> 0x0034 }
            r0.Z$0 = r1     // Catch:{ all -> 0x0034 }
            r0.label = r4     // Catch:{ all -> 0x0034 }
            java.lang.Object r1 = r5.fetchProductRecommendations(r7, r1, r0)     // Catch:{ all -> 0x0034 }
            if (r1 != r2) goto L_0x007e
            return r2
        L_0x007e:
            QL.x r1 = (QL.x) r1     // Catch:{ all -> 0x0034 }
            java.lang.Object r7 = r1.a()     // Catch:{ all -> 0x0034 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0034 }
            goto L_0x008f
        L_0x0087:
            java.lang.String r8 = "Sugarcube"
            java.lang.String r0 = "Failure while fetching product recommendations"
            android.util.Log.e(r8, r0, r7)
            r7 = 0
        L_0x008f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchProductRecommendations(int, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[Catch:{ all -> 0x0041 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6 A[Catch:{ all -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchProductVariants(java.lang.Integer r13, dI.C17164e<? super java.util.List<com.sugarcube.core.network.models.CatalogItem>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductVariants$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductVariants$1 r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductVariants$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r5 = r0
            goto L_0x001a
        L_0x0014:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductVariants$1 r0 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchProductVariants$1
            r0.<init>(r12, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.result
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r9 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0069
            if (r1 == r4) goto L_0x004c
            if (r1 != r3) goto L_0x0044
            java.lang.Object r13 = r5.L$3
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r13 = r5.L$2
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r5.L$1
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r13 = r5.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r13 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r13
            XH.y.b(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x00bc
        L_0x0041:
            r13 = move-exception
            goto L_0x00cb
        L_0x0044:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x004c:
            int r2 = r5.I$1
            int r13 = r5.I$0
            java.lang.Object r14 = r5.L$3
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r1 = r5.L$2
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r4 = r5.L$1
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r6 = r5.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r6 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r6
            XH.y.b(r0)     // Catch:{ all -> 0x0041 }
            r11 = r0
            r0 = r13
            r13 = r4
            r4 = r2
            r2 = r11
            goto L_0x0090
        L_0x0069:
            XH.y.b(r0)
            if (r13 == 0) goto L_0x00d2
            int r0 = r13.intValue()     // Catch:{ all -> 0x0041 }
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r12.configRepository     // Catch:{ all -> 0x0041 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r6 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0041 }
            r5.L$0 = r12     // Catch:{ all -> 0x0041 }
            r5.L$1 = r13     // Catch:{ all -> 0x0041 }
            r5.L$2 = r14     // Catch:{ all -> 0x0041 }
            r5.L$3 = r13     // Catch:{ all -> 0x0041 }
            r5.I$0 = r0     // Catch:{ all -> 0x0041 }
            r5.I$1 = r2     // Catch:{ all -> 0x0041 }
            r5.label = r4     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.get(r6, r5)     // Catch:{ all -> 0x0041 }
            if (r1 != r8) goto L_0x008b
            return r8
        L_0x008b:
            r6 = r12
            r4 = r2
            r2 = r1
            r1 = r14
            r14 = r13
        L_0x0090:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0041 }
            boolean r7 = r2.booleanValue()     // Catch:{ all -> 0x0041 }
            com.sugarcube.core.network.api.NetworkAPIs r2 = r6.getNetworkAPIs()     // Catch:{ all -> 0x0041 }
            int r10 = r13.intValue()     // Catch:{ all -> 0x0041 }
            r5.L$0 = r6     // Catch:{ all -> 0x0041 }
            r5.L$1 = r13     // Catch:{ all -> 0x0041 }
            r5.L$2 = r1     // Catch:{ all -> 0x0041 }
            r5.L$3 = r14     // Catch:{ all -> 0x0041 }
            r5.I$0 = r0     // Catch:{ all -> 0x0041 }
            r5.I$1 = r4     // Catch:{ all -> 0x0041 }
            r5.Z$0 = r7     // Catch:{ all -> 0x0041 }
            r5.label = r3     // Catch:{ all -> 0x0041 }
            r4 = 0
            r6 = 4
            r13 = 0
            r1 = r2
            r2 = r10
            r3 = r7
            r7 = r13
            java.lang.Object r0 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchProductVariants$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
            if (r0 != r8) goto L_0x00bc
            return r8
        L_0x00bc:
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x0041 }
            java.lang.Object r13 = r0.a()     // Catch:{ all -> 0x0041 }
            com.sugarcube.core.network.models.CatalogItemVariants r13 = (com.sugarcube.core.network.models.CatalogItemVariants) r13     // Catch:{ all -> 0x0041 }
            if (r13 == 0) goto L_0x00d2
            java.util.List r9 = r13.getFurnitures()     // Catch:{ all -> 0x0041 }
            goto L_0x00d2
        L_0x00cb:
            java.lang.String r14 = "Sugarcube"
            java.lang.String r0 = "Product variant fetch failed"
            android.util.Log.e(r14, r0, r13)
        L_0x00d2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchProductVariants(java.lang.Integer, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchSalesDressedBedData(boolean r7, dI.C17164e<? super java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.sugarcube.core.network.models.CatalogItem>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchSalesDressedBedData$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchSalesDressedBedData$1 r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchSalesDressedBedData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchSalesDressedBedData$1 r0 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchSalesDressedBedData$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x0032:
            r7 = move-exception
            goto L_0x0065
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            XH.y.b(r1)
            if (r7 != 0) goto L_0x0042
            return r5
        L_0x0042:
            com.sugarcube.core.network.api.NetworkAPIs r1 = r6.getNetworkAPIs()     // Catch:{ all -> 0x0032 }
            r0.L$0 = r6     // Catch:{ all -> 0x0032 }
            r0.L$1 = r8     // Catch:{ all -> 0x0032 }
            r0.Z$0 = r7     // Catch:{ all -> 0x0032 }
            r0.label = r4     // Catch:{ all -> 0x0032 }
            r7 = 3
            java.lang.Object r1 = r1.fetchSalesDressedBedData(r7, r0)     // Catch:{ all -> 0x0032 }
            if (r1 != r2) goto L_0x0056
            return r2
        L_0x0056:
            QL.x r1 = (QL.x) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r1.a()     // Catch:{ all -> 0x0032 }
            com.sugarcube.core.network.models.SalesDressedBedDataResponse r7 = (com.sugarcube.core.network.models.SalesDressedBedDataResponse) r7     // Catch:{ all -> 0x0032 }
            if (r7 == 0) goto L_0x006c
            java.util.Map r5 = r7.getData()     // Catch:{ all -> 0x0032 }
            goto L_0x006c
        L_0x0065:
            java.lang.String r8 = "Sugarcube"
            java.lang.String r0 = "Catalog SDB fetch failed"
            android.util.Log.e(r8, r0, r7)
        L_0x006c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchSalesDressedBedData(boolean, dI.e):java.lang.Object");
    }

    public final ConfigRepository getConfigRepository() {
        return this.configRepository;
    }

    public final NetworkClient getNetworkClient() {
        return this.networkClient;
    }

    public final q getSugarcube() {
        return this.sugarcube;
    }

    public final UserRepo getUserRepo() {
        return this.userRepo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0123 A[Catch:{ all -> 0x013f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131 A[Catch:{ all -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchCatalogPage(java.lang.String r21, android.net.Uri r22, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.CatalogPage>> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2
            if (r2 == 0) goto L_0x0018
            r2 = r0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2 r2 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.label = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2 r2 = new com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl$fetchCatalogPage$2
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.result
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.label
            r4 = 0
            r5 = 3
            r13 = 2
            r6 = 1
            if (r3 == 0) goto L_0x008f
            if (r3 == r6) goto L_0x007b
            if (r3 == r13) goto L_0x005d
            if (r3 != r5) goto L_0x0055
            java.lang.Object r0 = r15.L$5
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.L$4
            com.sugarcube.core.network.api.NetworkAPIs r0 = (com.sugarcube.core.network.api.NetworkAPIs) r0
            java.lang.Object r0 = r15.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.L$2
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r0 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0051 }
            r3 = r2
            r2 = r13
            goto L_0x0124
        L_0x0051:
            r0 = move-exception
            r2 = r13
            goto L_0x0145
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005d:
            boolean r0 = r15.Z$0
            java.lang.Object r3 = r15.L$5
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r3 = r15.L$4
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r3 = r15.L$3
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r15.L$2
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r6 = r15.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x00da
        L_0x007b:
            java.lang.Object r0 = r15.L$3
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r3 = r15.L$2
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r6 = r15.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r15.L$0
            com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl r7 = (com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl) r7
            XH.y.b(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x00ae
        L_0x008f:
            XH.y.b(r2)
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.configRepository     // Catch:{ all -> 0x0051 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0051 }
            r15.L$0 = r1     // Catch:{ all -> 0x0051 }
            r7 = r21
            r15.L$1 = r7     // Catch:{ all -> 0x0051 }
            r8 = r22
            r15.L$2 = r8     // Catch:{ all -> 0x0051 }
            r15.L$3 = r0     // Catch:{ all -> 0x0051 }
            r15.label = r6     // Catch:{ all -> 0x0051 }
            java.lang.Object r2 = r2.get(r3, r15)     // Catch:{ all -> 0x0051 }
            if (r2 != r14) goto L_0x00ab
            return r14
        L_0x00ab:
            r6 = r7
            r3 = r8
            r7 = r1
        L_0x00ae:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0051 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x00e9
            com.sugarcube.core.network.api.NetworkAPIs r8 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0051 }
            r15.L$0 = r7     // Catch:{ all -> 0x0051 }
            r15.L$1 = r6     // Catch:{ all -> 0x0051 }
            r15.L$2 = r3     // Catch:{ all -> 0x0051 }
            r15.L$3 = r0     // Catch:{ all -> 0x0051 }
            r15.L$4 = r3     // Catch:{ all -> 0x0051 }
            r15.L$5 = r3     // Catch:{ all -> 0x0051 }
            r15.Z$0 = r2     // Catch:{ all -> 0x0051 }
            r15.I$0 = r4     // Catch:{ all -> 0x0051 }
            r15.label = r13     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r8.fetchCatalogPage(r3, r15)     // Catch:{ all -> 0x0051 }
            if (r4 != r14) goto L_0x00d3
            return r14
        L_0x00d3:
            r19 = r3
            r3 = r0
            r0 = r2
            r2 = r4
            r4 = r19
        L_0x00da:
            QL.x r2 = (QL.x) r2     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x00e6
            r8 = r6
            r19 = r4
            r4 = r0
            r0 = r3
            r3 = r19
            goto L_0x00eb
        L_0x00e6:
            r0 = r2
            r2 = r13
            goto L_0x0127
        L_0x00e9:
            r4 = r2
            r8 = r6
        L_0x00eb:
            com.sugarcube.core.network.api.NetworkAPIs r2 = r7.getNetworkAPIs()     // Catch:{ all -> 0x0051 }
            OE.q r6 = r7.sugarcube     // Catch:{ all -> 0x0051 }
            java.lang.String r11 = r6.getRegion()     // Catch:{ all -> 0x0051 }
            r15.L$0 = r7     // Catch:{ all -> 0x0051 }
            r15.L$1 = r8     // Catch:{ all -> 0x0051 }
            r15.L$2 = r3     // Catch:{ all -> 0x0051 }
            r15.L$3 = r0     // Catch:{ all -> 0x0051 }
            r15.L$4 = r2     // Catch:{ all -> 0x0051 }
            r15.L$5 = r11     // Catch:{ all -> 0x0051 }
            r15.Z$0 = r4     // Catch:{ all -> 0x0051 }
            r15.label = r5     // Catch:{ all -> 0x0051 }
            r5 = 30
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r0 = 0
            r16 = 0
            r17 = 1892(0x764, float:2.651E-42)
            r18 = 0
            r3 = r2
            r2 = r13
            r13 = r0
            r0 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            java.lang.Object r3 = com.sugarcube.core.network.api.NetworkAPIs.DefaultImpls.fetchCatalogPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x013f }
            if (r3 != r0) goto L_0x0124
            return r0
        L_0x0124:
            r0 = r3
            QL.x r0 = (QL.x) r0     // Catch:{ all -> 0x013f }
        L_0x0127:
            com.sugarcube.app.base.data.Result$Success r3 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x013f }
            com.sugarcube.core.network.models.CatalogPage r0 = (com.sugarcube.core.network.models.CatalogPage) r0     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0141
            com.sugarcube.core.network.models.CatalogPage r0 = new com.sugarcube.core.network.models.CatalogPage     // Catch:{ all -> 0x013f }
            r9 = 15
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x013f }
            goto L_0x0141
        L_0x013f:
            r0 = move-exception
            goto L_0x0145
        L_0x0141:
            r3.<init>(r0)     // Catch:{ all -> 0x013f }
            goto L_0x0152
        L_0x0145:
            java.lang.String r3 = "Sugarcube"
            java.lang.String r4 = "Catalog page fetch failed"
            android.util.Log.e(r3, r4, r0)
            com.sugarcube.app.base.data.Result$Error r3 = new com.sugarcube.app.base.data.Result$Error
            r4 = 0
            r3.<init>(r0, r4, r2, r4)
        L_0x0152:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.CatalogRepositoryRemoteDataSourceImpl.fetchCatalogPage(java.lang.String, android.net.Uri, dI.e):java.lang.Object");
    }
}
