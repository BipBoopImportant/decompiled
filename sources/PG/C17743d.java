package pG;

import XH.x;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.GoesWellWithRepository;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LpG/d;", "", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/GoesWellWithRepository;", "goesWellWithRepository", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/GoesWellWithRepository;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "", "itemId", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "a", "(ILdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/GoesWellWithRepository;", "b", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pG.d  reason: case insensitive filesystem */
public final class C17743d {

    /* renamed from: a  reason: collision with root package name */
    private final GoesWellWithRepository f146263a;

    /* renamed from: b  reason: collision with root package name */
    private final ConfigRepository f146264b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.GoesWellWithUseCase", f = "GoesWellWithUseCase.kt", l = {20, 24}, m = "invoke-gIAlu-s")
    /* renamed from: pG.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146265c;

        /* renamed from: d  reason: collision with root package name */
        Object f146266d;

        /* renamed from: e  reason: collision with root package name */
        int f146267e;

        /* renamed from: f  reason: collision with root package name */
        boolean f146268f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f146269g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17743d f146270h;

        /* renamed from: i  reason: collision with root package name */
        int f146271i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17743d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f146270h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146269g = obj;
            this.f146271i |= Integer.MIN_VALUE;
            Object a10 = this.f146270h.a(0, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C17743d(GoesWellWithRepository goesWellWithRepository, ConfigRepository configRepository) {
        C17542s.j(goesWellWithRepository, "goesWellWithRepository");
        C17542s.j(configRepository, "configRepository");
        this.f146263a = goesWellWithRepository;
        this.f146264b = configRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r7, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pG.C17743d.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            pG.d$a r0 = (pG.C17743d.a) r0
            int r1 = r0.f146271i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146271i = r1
            goto L_0x0018
        L_0x0013:
            pG.d$a r0 = new pG.d$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f146269g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146271i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 == r5) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f146266d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f146265c
            pG.d r7 = (pG.C17743d) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            goto L_0x008d
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            int r7 = r0.f146267e
            java.lang.Object r8 = r0.f146266d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r3 = r0.f146265c
            pG.d r3 = (pG.C17743d) r3
            XH.y.b(r1)
            goto L_0x0067
        L_0x0050:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r6.f146264b
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE
            r0.f146265c = r6
            r0.f146266d = r8
            r0.f146267e = r7
            r0.f146271i = r5
            java.lang.Object r1 = r1.get(r3, r0)
            if (r1 != r2) goto L_0x0066
            return r2
        L_0x0066:
            r3 = r6
        L_0x0067:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x007a
            XH.x$a r7 = XH.x.f139812b
            java.util.List r7 = YH.C16877v.n()
            java.lang.Object r7 = XH.x.b(r7)
            return r7
        L_0x007a:
            com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.GoesWellWithRepository r5 = r3.f146263a
            r0.f146265c = r3
            r0.f146266d = r8
            r0.f146267e = r7
            r0.f146268f = r1
            r0.f146271i = r4
            java.lang.Object r7 = r5.m72fetchProductRecommendationsgIAlus(r7, r0)
            if (r7 != r2) goto L_0x008d
            return r2
        L_0x008d:
            boolean r8 = XH.x.h(r7)
            if (r8 == 0) goto L_0x00bf
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r7, r0)
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x00a6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r7.next()
            com.sugarcube.core.network.models.CatalogItem r0 = (com.sugarcube.core.network.models.CatalogItem) r0
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = RF.q.a(r0)
            r8.add(r0)
            goto L_0x00a6
        L_0x00ba:
            java.lang.Object r7 = XH.x.b(r8)
            goto L_0x00c3
        L_0x00bf:
            java.lang.Object r7 = XH.x.b(r7)
        L_0x00c3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17743d.a(int, dI.e):java.lang.Object");
    }
}
