package oG;

import XH.x;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.network.api.CatalogApi;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.GoesWellWithRepository;
import dI.C17164e;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LoG/b;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/GoesWellWithRepository;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/core/network/api/CatalogApi;", "cachedApiService", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/core/network/api/CatalogApi;)V", "", "itemId", "LXH/x;", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "fetchProductRecommendations-gIAlu-s", "(ILdI/e;)Ljava/lang/Object;", "fetchProductRecommendations", "a", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "b", "Lcom/sugarcube/core/network/api/CatalogApi;", "", "c", "Ljava/util/Map;", "cache", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oG.b  reason: case insensitive filesystem */
public final class C17688b implements GoesWellWithRepository {

    /* renamed from: a  reason: collision with root package name */
    private final ConfigRepository f145216a;

    /* renamed from: b  reason: collision with root package name */
    private final CatalogApi f145217b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, List<CatalogItem>> f145218c = new LinkedHashMap();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.GoesWellWithRepositoryImpl", f = "GoesWellWithRepository.kt", l = {54, 55}, m = "fetchProductRecommendations-gIAlu-s")
    /* renamed from: oG.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145219c;

        /* renamed from: d  reason: collision with root package name */
        Object f145220d;

        /* renamed from: e  reason: collision with root package name */
        Object f145221e;

        /* renamed from: f  reason: collision with root package name */
        Object f145222f;

        /* renamed from: g  reason: collision with root package name */
        int f145223g;

        /* renamed from: h  reason: collision with root package name */
        int f145224h;

        /* renamed from: i  reason: collision with root package name */
        boolean f145225i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f145226j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17688b f145227k;

        /* renamed from: l  reason: collision with root package name */
        int f145228l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17688b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f145227k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145226j = obj;
            this.f145228l |= Integer.MIN_VALUE;
            Object r22 = this.f145227k.m3878fetchProductRecommendationsgIAlus(0, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17688b(ConfigRepository configRepository, CatalogApi catalogApi) {
        C17542s.j(configRepository, "configRepository");
        C17542s.j(catalogApi, "cachedApiService");
        this.f145216a = configRepository;
        this.f145217b = catalogApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6 A[Catch:{ all -> 0x0040 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: fetchProductRecommendations-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3878fetchProductRecommendationsgIAlus(int r10, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.core.network.models.CatalogItem>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof oG.C17688b.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            oG.b$a r0 = (oG.C17688b.a) r0
            int r1 = r0.f145228l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145228l = r1
            goto L_0x0018
        L_0x0013:
            oG.b$a r0 = new oG.b$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f145226j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f145228l
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0063
            if (r3 == r6) goto L_0x004b
            if (r3 != r5) goto L_0x0043
            int r10 = r0.f145223g
            java.lang.Object r11 = r0.f145222f
            oG.b r11 = (oG.C17688b) r11
            java.lang.Object r2 = r0.f145221e
            oG.b r2 = (oG.C17688b) r2
            java.lang.Object r2 = r0.f145220d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f145219c
            oG.b r0 = (oG.C17688b) r0
            XH.y.b(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x00b7
        L_0x0040:
            r10 = move-exception
            goto L_0x00c7
        L_0x0043:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004b:
            int r4 = r0.f145224h
            int r10 = r0.f145223g
            java.lang.Object r11 = r0.f145222f
            oG.b r11 = (oG.C17688b) r11
            java.lang.Object r3 = r0.f145221e
            oG.b r3 = (oG.C17688b) r3
            java.lang.Object r6 = r0.f145220d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.f145219c
            oG.b r7 = (oG.C17688b) r7
            XH.y.b(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0098
        L_0x0063:
            XH.y.b(r1)
            java.util.Map<java.lang.Integer, java.util.List<com.sugarcube.core.network.models.CatalogItem>> r1 = r9.f145218c
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.b.e(r10)
            java.lang.Object r1 = r1.get(r3)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0079
            java.lang.Object r10 = XH.x.b(r1)
            return r10
        L_0x0079:
            XH.x$a r1 = XH.x.f139812b     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r9.f145216a     // Catch:{ all -> 0x0040 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0040 }
            r0.f145219c = r9     // Catch:{ all -> 0x0040 }
            r0.f145220d = r11     // Catch:{ all -> 0x0040 }
            r0.f145221e = r9     // Catch:{ all -> 0x0040 }
            r0.f145222f = r9     // Catch:{ all -> 0x0040 }
            r0.f145223g = r10     // Catch:{ all -> 0x0040 }
            r0.f145224h = r4     // Catch:{ all -> 0x0040 }
            r0.f145228l = r6     // Catch:{ all -> 0x0040 }
            java.lang.Object r1 = r1.get(r3, r0)     // Catch:{ all -> 0x0040 }
            if (r1 != r2) goto L_0x0094
            return r2
        L_0x0094:
            r3 = r9
            r7 = r3
            r6 = r11
            r11 = r7
        L_0x0098:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0040 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0040 }
            com.sugarcube.core.network.api.CatalogApi r8 = r11.f145217b     // Catch:{ all -> 0x0040 }
            r0.f145219c = r7     // Catch:{ all -> 0x0040 }
            r0.f145220d = r6     // Catch:{ all -> 0x0040 }
            r0.f145221e = r3     // Catch:{ all -> 0x0040 }
            r0.f145222f = r11     // Catch:{ all -> 0x0040 }
            r0.f145223g = r10     // Catch:{ all -> 0x0040 }
            r0.f145224h = r4     // Catch:{ all -> 0x0040 }
            r0.f145225i = r1     // Catch:{ all -> 0x0040 }
            r0.f145228l = r5     // Catch:{ all -> 0x0040 }
            java.lang.Object r1 = r8.fetchProductRecommendations(r10, r1, r0)     // Catch:{ all -> 0x0040 }
            if (r1 != r2) goto L_0x00b7
            return r2
        L_0x00b7:
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0040 }
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.b.e(r10)     // Catch:{ all -> 0x0040 }
            java.util.Map<java.lang.Integer, java.util.List<com.sugarcube.core.network.models.CatalogItem>> r11 = r11.f145218c     // Catch:{ all -> 0x0040 }
            r11.put(r10, r1)     // Catch:{ all -> 0x0040 }
            java.lang.Object r10 = XH.x.b(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x00d1
        L_0x00c7:
            XH.x$a r11 = XH.x.f139812b
            java.lang.Object r10 = XH.y.a(r10)
            java.lang.Object r10 = XH.x.b(r10)
        L_0x00d1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oG.C17688b.m3878fetchProductRecommendationsgIAlus(int, dI.e):java.lang.Object");
    }
}
