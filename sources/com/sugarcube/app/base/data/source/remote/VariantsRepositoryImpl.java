package com.sugarcube.app.base.data.source.remote;

import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.source.VariantsRepository;
import com.sugarcube.app.base.data.source.local.VariantsItemCache;
import com.sugarcube.core.network.api.CatalogApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/data/source/remote/VariantsRepositoryImpl;", "Lcom/sugarcube/app/base/data/source/VariantsRepository;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/source/local/VariantsItemCache;", "variantsCache", "Lcom/sugarcube/core/network/api/CatalogApi;", "cachedApiService", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/source/local/VariantsItemCache;Lcom/sugarcube/core/network/api/CatalogApi;)V", "", "itemId", "LXH/x;", "Lcom/sugarcube/core/network/models/CatalogItemVariants;", "fetchVariantsForItem-gIAlu-s", "(ILdI/e;)Ljava/lang/Object;", "fetchVariantsForItem", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "Lcom/sugarcube/app/base/data/source/local/VariantsItemCache;", "Lcom/sugarcube/core/network/api/CatalogApi;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VariantsRepositoryImpl implements VariantsRepository {
    public static final int $stable = 8;
    private final CatalogApi cachedApiService;
    private final ConfigRepository configRepository;
    private final VariantsItemCache variantsCache;

    public VariantsRepositoryImpl(ConfigRepository configRepository2, VariantsItemCache variantsItemCache, CatalogApi catalogApi) {
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(variantsItemCache, "variantsCache");
        C17542s.j(catalogApi, "cachedApiService");
        this.configRepository = configRepository2;
        this.variantsCache = variantsItemCache;
        this.cachedApiService = catalogApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf A[Catch:{ all -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: fetchVariantsForItem-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m29fetchVariantsForItemgIAlus(int r11, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogItemVariants>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl$fetchVariantsForItem$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl$fetchVariantsForItem$1 r0 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl$fetchVariantsForItem$1) r0
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
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl$fetchVariantsForItem$1 r0 = new com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl$fetchVariantsForItem$1
            r0.<init>(r10, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r5.result
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0069
            if (r1 == r4) goto L_0x004d
            if (r1 != r3) goto L_0x0045
            int r11 = r5.I$0
            java.lang.Object r12 = r5.L$3
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl r12 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl) r12
            java.lang.Object r1 = r5.L$2
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl r1 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl) r1
            java.lang.Object r1 = r5.L$1
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.L$0
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl r1 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl) r1
            XH.y.b(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x00c0
        L_0x0042:
            r11 = move-exception
            goto L_0x00cc
        L_0x0045:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004d:
            int r2 = r5.I$1
            int r11 = r5.I$0
            java.lang.Object r12 = r5.L$4
            com.sugarcube.core.network.models.CatalogItemVariants r12 = (com.sugarcube.core.network.models.CatalogItemVariants) r12
            java.lang.Object r12 = r5.L$3
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl r12 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl) r12
            java.lang.Object r1 = r5.L$2
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl r1 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl) r1
            java.lang.Object r4 = r5.L$1
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r6 = r5.L$0
            com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl r6 = (com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl) r6
            XH.y.b(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x009a
        L_0x0069:
            XH.y.b(r0)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0042 }
            com.sugarcube.app.base.data.source.local.VariantsItemCache r0 = r10.variantsCache     // Catch:{ all -> 0x0042 }
            com.sugarcube.core.network.models.CatalogItemVariants r0 = r0.getItems(r11)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x007b
            java.lang.Object r11 = XH.x.b(r0)     // Catch:{ all -> 0x0042 }
            return r11
        L_0x007b:
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r10.configRepository     // Catch:{ all -> 0x0042 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r6 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0042 }
            r5.L$0 = r10     // Catch:{ all -> 0x0042 }
            r5.L$1 = r12     // Catch:{ all -> 0x0042 }
            r5.L$2 = r10     // Catch:{ all -> 0x0042 }
            r5.L$3 = r10     // Catch:{ all -> 0x0042 }
            r5.L$4 = r0     // Catch:{ all -> 0x0042 }
            r5.I$0 = r11     // Catch:{ all -> 0x0042 }
            r5.I$1 = r2     // Catch:{ all -> 0x0042 }
            r5.label = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r1.get(r6, r5)     // Catch:{ all -> 0x0042 }
            if (r0 != r8) goto L_0x0096
            return r8
        L_0x0096:
            r1 = r10
            r6 = r1
            r4 = r12
            r12 = r6
        L_0x009a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            com.sugarcube.core.network.api.CatalogApi r7 = r12.cachedApiService     // Catch:{ all -> 0x0042 }
            r5.L$0 = r6     // Catch:{ all -> 0x0042 }
            r5.L$1 = r4     // Catch:{ all -> 0x0042 }
            r5.L$2 = r1     // Catch:{ all -> 0x0042 }
            r5.L$3 = r12     // Catch:{ all -> 0x0042 }
            r5.I$0 = r11     // Catch:{ all -> 0x0042 }
            r5.I$1 = r2     // Catch:{ all -> 0x0042 }
            r5.Z$0 = r0     // Catch:{ all -> 0x0042 }
            r5.label = r3     // Catch:{ all -> 0x0042 }
            r4 = 0
            r6 = 4
            r9 = 0
            r1 = r7
            r2 = r11
            r3 = r0
            r7 = r9
            java.lang.Object r0 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchProductVariants$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0042 }
            if (r0 != r8) goto L_0x00c0
            return r8
        L_0x00c0:
            com.sugarcube.core.network.models.CatalogItemVariants r0 = (com.sugarcube.core.network.models.CatalogItemVariants) r0     // Catch:{ all -> 0x0042 }
            com.sugarcube.app.base.data.source.local.VariantsItemCache r12 = r12.variantsCache     // Catch:{ all -> 0x0042 }
            r12.putItems(r11, r0)     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = XH.x.b(r0)     // Catch:{ all -> 0x0042 }
            return r11
        L_0x00cc:
            XH.x$a r12 = XH.x.f139812b
            java.lang.Object r11 = XH.y.a(r11)
            java.lang.Object r11 = XH.x.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.VariantsRepositoryImpl.m29fetchVariantsForItemgIAlus(int, dI.e):java.lang.Object");
    }
}
