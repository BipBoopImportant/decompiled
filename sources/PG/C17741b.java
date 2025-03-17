package pG;

import RF.q;
import XH.x;
import YH.C16877v;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogSearchPage;
import com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R(\u0010#\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"LpG/b;", "", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "catalogRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;)V", "", "searchTerm", "LXH/N;", "d", "(Ljava/lang/String;)V", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "data", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "c", "(Lcom/sugarcube/core/network/models/CatalogSearchPage;Ljava/lang/String;)Ljava/lang/Object;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "", "Ljava/util/Map;", "nextPageTokens", "", "Z", "getCanLoadMore", "()Z", "setCanLoadMore", "(Z)V", "getCanLoadMore$annotations", "()V", "canLoadMore", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pG.b  reason: case insensitive filesystem */
public final class C17741b {

    /* renamed from: a  reason: collision with root package name */
    private final CatalogRepository f146245a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f146246b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f146247c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CatalogSearchUseCase", f = "CatalogSearchUseCase.kt", l = {51}, m = "fetchMoreItems-gIAlu-s")
    /* renamed from: pG.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146248c;

        /* renamed from: d  reason: collision with root package name */
        Object f146249d;

        /* renamed from: e  reason: collision with root package name */
        Object f146250e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146251f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17741b f146252g;

        /* renamed from: h  reason: collision with root package name */
        int f146253h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17741b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f146252g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146251f = obj;
            this.f146253h |= Integer.MIN_VALUE;
            Object a10 = this.f146252g.a((String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CatalogSearchUseCase", f = "CatalogSearchUseCase.kt", l = {35}, m = "search-gIAlu-s")
    /* renamed from: pG.b$b  reason: collision with other inner class name */
    static final class C4255b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146254c;

        /* renamed from: d  reason: collision with root package name */
        Object f146255d;

        /* renamed from: e  reason: collision with root package name */
        Object f146256e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146257f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17741b f146258g;

        /* renamed from: h  reason: collision with root package name */
        int f146259h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4255b(C17741b bVar, C17164e<? super C4255b> eVar) {
            super(eVar);
            this.f146258g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146257f = obj;
            this.f146259h |= Integer.MIN_VALUE;
            Object e10 = this.f146258g.e((String) null, this);
            return e10 == C17187b.f() ? e10 : x.a(e10);
        }
    }

    public C17741b(CatalogRepository catalogRepository) {
        C17542s.j(catalogRepository, "catalogRepository");
        this.f146245a = catalogRepository;
    }

    private final String b(String str) {
        return this.f146246b.get(str);
    }

    private final Object c(CatalogSearchPage catalogSearchPage, String str) {
        List list;
        this.f146246b.put(str, catalogSearchPage.getMoreToken());
        this.f146247c = catalogSearchPage.getMoreToken() != null;
        Iterable pageItems = catalogSearchPage.getPageItems();
        if (pageItems != null) {
            Iterable<CatalogItem> iterable = pageItems;
            list = new ArrayList(C16877v.y(iterable, 10));
            for (CatalogItem a10 : iterable) {
                list.add(q.a(a10));
            }
        } else {
            list = C16877v.n();
        }
        return x.b(list);
    }

    private final void d(String str) {
        this.f146246b.put(str, (Object) null);
        this.f146247c = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17741b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.b$a r0 = (pG.C17741b.a) r0
            int r1 = r0.f146253h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146253h = r1
            goto L_0x0018
        L_0x0013:
            pG.b$a r0 = new pG.b$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146251f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146253h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146250e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146249d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f146248c
            pG.b r7 = (pG.C17741b) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x006b
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            boolean r1 = r5.f146247c
            if (r1 != 0) goto L_0x0055
            XH.x$a r6 = XH.x.f139812b
            java.util.List r6 = YH.C16877v.n()
            java.lang.Object r6 = XH.x.b(r6)
            return r6
        L_0x0055:
            com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository r1 = r5.f146245a
            java.lang.String r3 = r5.b(r6)
            r0.f146248c = r5
            r0.f146249d = r6
            r0.f146250e = r7
            r0.f146253h = r4
            java.lang.Object r0 = r1.m81fetchCatalogItemsForSearchTerm0E7RQCE(r6, r3, r0)
            if (r0 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r7 = r5
        L_0x006b:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x0078
            com.sugarcube.core.network.models.CatalogSearchPage r0 = (com.sugarcube.core.network.models.CatalogSearchPage) r0
            java.lang.Object r6 = r7.c(r0, r6)
            goto L_0x0080
        L_0x0078:
            java.lang.Object r6 = XH.y.a(r1)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17741b.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17741b.C4255b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.b$b r0 = (pG.C17741b.C4255b) r0
            int r1 = r0.f146259h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146259h = r1
            goto L_0x0018
        L_0x0013:
            pG.b$b r0 = new pG.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146257f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146259h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146256e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146255d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f146254c
            pG.b r7 = (pG.C17741b) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x005c
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            r5.d(r6)
            com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository r1 = r5.f146245a
            r0.f146254c = r5
            r0.f146255d = r6
            r0.f146256e = r7
            r0.f146259h = r4
            r7 = 0
            java.lang.Object r0 = r1.m81fetchCatalogItemsForSearchTerm0E7RQCE(r6, r7, r0)
            if (r0 != r2) goto L_0x005b
            return r2
        L_0x005b:
            r7 = r5
        L_0x005c:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x0069
            com.sugarcube.core.network.models.CatalogSearchPage r0 = (com.sugarcube.core.network.models.CatalogSearchPage) r0
            java.lang.Object r6 = r7.c(r0, r6)
            goto L_0x0071
        L_0x0069:
            java.lang.Object r6 = XH.y.a(r1)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0071:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17741b.e(java.lang.String, dI.e):java.lang.Object");
    }
}
