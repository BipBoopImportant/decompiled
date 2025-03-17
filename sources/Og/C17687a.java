package oG;

import OE.q;
import XH.x;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.network.api.CatalogApi;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepository;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LoG/a;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LOE/q;", "sugarcube", "Lcom/sugarcube/core/network/api/CatalogApi;", "cachedApiService", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;LOE/q;Lcom/sugarcube/core/network/api/CatalogApi;)V", "LXH/x;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "fetchCatalogCategories-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "fetchCatalogCategories", "", "categoryId", "fetchSubcategoriesByCategory-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchSubcategoriesByCategory", "a", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "b", "LOE/q;", "c", "Lcom/sugarcube/core/network/api/CatalogApi;", "", "d", "Ljava/util/List;", "cachedCategories", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oG.a  reason: case insensitive filesystem */
public final class C17687a implements CategoriesRepository {

    /* renamed from: a  reason: collision with root package name */
    private final ConfigRepository f145197a;

    /* renamed from: b  reason: collision with root package name */
    private final q f145198b;

    /* renamed from: c  reason: collision with root package name */
    private final CatalogApi f145199c;

    /* renamed from: d  reason: collision with root package name */
    private final List<CatalogCategory> f145200d = new ArrayList();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepositoryImpl", f = "CategoriesRepository.kt", l = {44, 47}, m = "fetchCatalogCategories-IoAF18A")
    /* renamed from: oG.a$a  reason: collision with other inner class name */
    static final class C4232a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145201c;

        /* renamed from: d  reason: collision with root package name */
        Object f145202d;

        /* renamed from: e  reason: collision with root package name */
        Object f145203e;

        /* renamed from: f  reason: collision with root package name */
        Object f145204f;

        /* renamed from: g  reason: collision with root package name */
        boolean f145205g;

        /* renamed from: h  reason: collision with root package name */
        int f145206h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f145207i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17687a f145208j;

        /* renamed from: k  reason: collision with root package name */
        int f145209k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4232a(C17687a aVar, C17164e<? super C4232a> eVar) {
            super(eVar);
            this.f145208j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145207i = obj;
            this.f145209k |= Integer.MIN_VALUE;
            Object r22 = this.f145208j.m3876fetchCatalogCategoriesIoAF18A(this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepositoryImpl", f = "CategoriesRepository.kt", l = {60}, m = "fetchSubcategoriesByCategory-gIAlu-s")
    /* renamed from: oG.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145210c;

        /* renamed from: d  reason: collision with root package name */
        Object f145211d;

        /* renamed from: e  reason: collision with root package name */
        Object f145212e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f145213f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17687a f145214g;

        /* renamed from: h  reason: collision with root package name */
        int f145215h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17687a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f145214g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145213f = obj;
            this.f145215h |= Integer.MIN_VALUE;
            Object r22 = this.f145214g.m3877fetchSubcategoriesByCategorygIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17687a(ConfigRepository configRepository, q qVar, CatalogApi catalogApi) {
        C17542s.j(configRepository, "configRepository");
        C17542s.j(qVar, "sugarcube");
        C17542s.j(catalogApi, "cachedApiService");
        this.f145197a = configRepository;
        this.f145198b = qVar;
        this.f145199c = catalogApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3 A[Catch:{ all -> 0x003f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: fetchCatalogCategories-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3876fetchCatalogCategoriesIoAF18A(dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.core.network.models.CatalogCategory>>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof oG.C17687a.C4232a
            if (r0 == 0) goto L_0x0014
            r0 = r13
            oG.a$a r0 = (oG.C17687a.C4232a) r0
            int r1 = r0.f145209k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f145209k = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            oG.a$a r0 = new oG.a$a
            r0.<init>(r12, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f145207i
            java.lang.Object r9 = eI.C17187b.f()
            int r1 = r6.f145209k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x005a
            if (r1 == r3) goto L_0x004a
            if (r1 != r2) goto L_0x0042
            java.lang.Object r13 = r6.f145204f
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r6.f145203e
            com.sugarcube.core.network.api.CatalogApi r13 = (com.sugarcube.core.network.api.CatalogApi) r13
            java.lang.Object r13 = r6.f145202d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r6.f145201c
            oG.a r13 = (oG.C17687a) r13
            XH.y.b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x00b4
        L_0x003f:
            r13 = move-exception
            goto L_0x00c3
        L_0x0042:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x004a:
            java.lang.Object r13 = r6.f145202d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r1 = r6.f145201c
            oG.a r1 = (oG.C17687a) r1
            XH.y.b(r0)
            r11 = r0
            r0 = r13
            r13 = r1
            r1 = r11
            goto L_0x0084
        L_0x005a:
            XH.y.b(r0)
            java.util.List<com.sugarcube.core.network.models.CatalogCategory> r0 = r12.f145200d
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0070
            XH.x$a r13 = XH.x.f139812b
            java.util.List<com.sugarcube.core.network.models.CatalogCategory> r13 = r12.f145200d
            java.lang.Object r13 = XH.x.b(r13)
            return r13
        L_0x0070:
            com.sugarcube.app.base.data.feature.ConfigRepository r0 = r12.f145197a
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r1 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE
            r6.f145201c = r12
            r6.f145202d = r13
            r6.f145209k = r3
            java.lang.Object r0 = r0.get(r1, r6)
            if (r0 != r9) goto L_0x0081
            return r9
        L_0x0081:
            r1 = r0
            r0 = r13
            r13 = r12
        L_0x0084:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            XH.x$a r1 = XH.x.f139812b     // Catch:{ all -> 0x003f }
            com.sugarcube.core.network.api.CatalogApi r1 = r13.f145199c     // Catch:{ all -> 0x003f }
            OE.q r4 = r13.f145198b     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r4.getRegion()     // Catch:{ all -> 0x003f }
            r4 = 0
            java.lang.String r7 = ""
            r6.f145201c = r13     // Catch:{ all -> 0x003f }
            r6.f145202d = r0     // Catch:{ all -> 0x003f }
            r6.f145203e = r1     // Catch:{ all -> 0x003f }
            r6.f145204f = r5     // Catch:{ all -> 0x003f }
            r6.f145205g = r3     // Catch:{ all -> 0x003f }
            r6.f145206h = r4     // Catch:{ all -> 0x003f }
            r6.f145209k = r2     // Catch:{ all -> 0x003f }
            r0 = 0
            r8 = 2
            r10 = 0
            r2 = r3
            r3 = r0
            r4 = r7
            r7 = r8
            r8 = r10
            java.lang.Object r0 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchCatalogCategories$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003f }
            if (r0 != r9) goto L_0x00b4
            return r9
        L_0x00b4:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x003f }
            java.util.List<com.sugarcube.core.network.models.CatalogCategory> r13 = r13.f145200d     // Catch:{ all -> 0x003f }
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x003f }
            r13.addAll(r1)     // Catch:{ all -> 0x003f }
            java.lang.Object r13 = XH.x.b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x00cd
        L_0x00c3:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r13 = XH.y.a(r13)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x00cd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: oG.C17687a.m3876fetchCatalogCategoriesIoAF18A(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: fetchSubcategoriesByCategory-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3877fetchSubcategoriesByCategorygIAlus(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.core.network.models.CatalogCategory>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oG.C17687a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            oG.a$b r0 = (oG.C17687a.b) r0
            int r1 = r0.f145215h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145215h = r1
            goto L_0x0018
        L_0x0013:
            oG.a$b r0 = new oG.a$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f145213f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f145215h
            r4 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r6 = r0.f145212e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f145211d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f145210c
            oG.a r7 = (oG.C17687a) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            r1.j()
            goto L_0x005d
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0042:
            XH.y.b(r1)
            java.util.List<com.sugarcube.core.network.models.CatalogCategory> r1 = r5.f145200d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x005c
            r0.f145210c = r5
            r0.f145211d = r6
            r0.f145212e = r7
            r0.f145215h = r4
            java.lang.Object r7 = r5.m3876fetchCatalogCategoriesIoAF18A(r0)
            if (r7 != r2) goto L_0x005c
            return r2
        L_0x005c:
            r7 = r5
        L_0x005d:
            java.util.List<com.sugarcube.core.network.models.CatalogCategory> r7 = r7.f145200d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0065:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r7.next()
            r2 = r0
            com.sugarcube.core.network.models.CatalogCategory r2 = (com.sugarcube.core.network.models.CatalogCategory) r2
            java.lang.String r2 = r2.getCategoryId()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r2 == 0) goto L_0x0065
            goto L_0x007f
        L_0x007e:
            r0 = r1
        L_0x007f:
            com.sugarcube.core.network.models.CatalogCategory r0 = (com.sugarcube.core.network.models.CatalogCategory) r0
            if (r0 == 0) goto L_0x0087
            java.util.List r1 = r0.getSubcategories()
        L_0x0087:
            if (r1 != 0) goto L_0x008d
            java.util.List r1 = YH.C16877v.n()
        L_0x008d:
            java.lang.Object r6 = XH.x.b(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oG.C17687a.m3877fetchSubcategoriesByCategorygIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
