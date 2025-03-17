package qG;

import XH.x;
import android.net.Uri;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCase;
import com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository;
import dI.C17164e;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0013\u0010\fJ$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR(\u0010&\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"LqG/b;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "catalogRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;)V", "", "categoryId", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "c", "(Ljava/lang/String;)Landroid/net/Uri;", "LXH/N;", "d", "(Ljava/lang/String;)V", "fetchItems-gIAlu-s", "fetchItems", "fetchMoreItems-gIAlu-s", "fetchMoreItems", "a", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "", "Ljava/util/Map;", "nextPageTokens", "", "itemCounts", "", "Z", "getCanLoadMore", "()Z", "setCanLoadMore", "(Z)V", "getCanLoadMore$annotations", "()V", "canLoadMore", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qG.b  reason: case insensitive filesystem */
public final class C17773b implements FetchCategoryItemsUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final CatalogRepository f146400a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Uri> f146401b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f146402c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f146403d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCaseImpl", f = "FetchCategoryItemsUseCase.kt", l = {76}, m = "fetchCatalogItemsForCategory-gIAlu-s")
    /* renamed from: qG.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146404c;

        /* renamed from: d  reason: collision with root package name */
        Object f146405d;

        /* renamed from: e  reason: collision with root package name */
        Object f146406e;

        /* renamed from: f  reason: collision with root package name */
        Object f146407f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f146408g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17773b f146409h;

        /* renamed from: i  reason: collision with root package name */
        int f146410i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17773b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f146409h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146408g = obj;
            this.f146410i |= Integer.MIN_VALUE;
            Object a10 = this.f146409h.b((String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCaseImpl", f = "FetchCategoryItemsUseCase.kt", l = {59}, m = "fetchItems-gIAlu-s")
    /* renamed from: qG.b$b  reason: collision with other inner class name */
    static final class C4259b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146411c;

        /* renamed from: d  reason: collision with root package name */
        Object f146412d;

        /* renamed from: e  reason: collision with root package name */
        Object f146413e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146414f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17773b f146415g;

        /* renamed from: h  reason: collision with root package name */
        int f146416h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4259b(C17773b bVar, C17164e<? super C4259b> eVar) {
            super(eVar);
            this.f146415g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146414f = obj;
            this.f146416h |= Integer.MIN_VALUE;
            Object r22 = this.f146415g.m3880fetchItemsgIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCaseImpl", f = "FetchCategoryItemsUseCase.kt", l = {69}, m = "fetchMoreItems-gIAlu-s")
    /* renamed from: qG.b$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146417c;

        /* renamed from: d  reason: collision with root package name */
        Object f146418d;

        /* renamed from: e  reason: collision with root package name */
        Object f146419e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146420f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17773b f146421g;

        /* renamed from: h  reason: collision with root package name */
        int f146422h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17773b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f146421g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146420f = obj;
            this.f146422h |= Integer.MIN_VALUE;
            Object r22 = this.f146421g.m3881fetchMoreItemsgIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17773b(CatalogRepository catalogRepository) {
        C17542s.j(catalogRepository, "catalogRepository");
        this.f146400a = catalogRepository;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r13, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof qG.C17773b.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            qG.b$a r0 = (qG.C17773b.a) r0
            int r1 = r0.f146410i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146410i = r1
            goto L_0x0018
        L_0x0013:
            qG.b$a r0 = new qG.b$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f146408g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146410i
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            java.lang.Object r13 = r0.f146407f
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.Object r13 = r0.f146406e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f146405d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.f146404c
            qG.b r14 = (qG.C17773b) r14
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x0062
        L_0x003f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0047:
            XH.y.b(r1)
            android.net.Uri r1 = r12.c(r13)
            com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository r3 = r12.f146400a
            r0.f146404c = r12
            r0.f146405d = r13
            r0.f146406e = r14
            r0.f146407f = r1
            r0.f146410i = r4
            java.lang.Object r0 = r3.m80fetchCatalogItemsForCategory0E7RQCE(r13, r1, r0)
            if (r0 != r2) goto L_0x0061
            return r2
        L_0x0061:
            r14 = r12
        L_0x0062:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x00d3
            r1 = r0
            com.sugarcube.core.network.models.CatalogPage r1 = (com.sugarcube.core.network.models.CatalogPage) r1
            boolean r1 = XH.x.g(r0)
            if (r1 == 0) goto L_0x0072
            r0 = 0
        L_0x0072:
            com.sugarcube.core.network.models.CatalogPage r0 = (com.sugarcube.core.network.models.CatalogPage) r0
            if (r0 != 0) goto L_0x0083
            com.sugarcube.core.network.models.CatalogPage r0 = new com.sugarcube.core.network.models.CatalogPage
            r10 = 15
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x0083:
            java.util.Map<java.lang.String, android.net.Uri> r1 = r14.f146401b
            android.net.Uri r2 = r0.getNext()
            r1.put(r13, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r14.f146402c
            java.lang.Integer r2 = r0.getTotalCount()
            r1.put(r13, r2)
            android.net.Uri r13 = r0.getNext()
            if (r13 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r4 = 0
        L_0x009d:
            r14.f146403d = r4
            java.util.List r13 = r0.getPageItems()
            if (r13 == 0) goto L_0x00ca
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r13, r0)
            r14.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x00b6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r13.next()
            com.sugarcube.core.network.models.CatalogItem r0 = (com.sugarcube.core.network.models.CatalogItem) r0
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = RF.q.a(r0)
            r14.add(r0)
            goto L_0x00b6
        L_0x00ca:
            java.util.List r14 = YH.C16877v.n()
        L_0x00ce:
            java.lang.Object r13 = XH.x.b(r14)
            goto L_0x00db
        L_0x00d3:
            java.lang.Object r13 = XH.y.a(r1)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x00db:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qG.C17773b.b(java.lang.String, dI.e):java.lang.Object");
    }

    private final Uri c(String str) {
        return this.f146401b.get(str);
    }

    private final void d(String str) {
        this.f146401b.put(str, (Object) null);
        this.f146402c.put(str, 0);
        this.f146403d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: fetchItems-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3880fetchItemsgIAlus(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qG.C17773b.C4259b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qG.b$b r0 = (qG.C17773b.C4259b) r0
            int r1 = r0.f146416h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146416h = r1
            goto L_0x0018
        L_0x0013:
            qG.b$b r0 = new qG.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146414f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146416h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146413e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146412d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f146411c
            qG.b r6 = (qG.C17773b) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0058
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            r5.d(r6)
            r0.f146411c = r5
            r0.f146412d = r6
            r0.f146413e = r7
            r0.f146416h = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r2) goto L_0x0058
            return r2
        L_0x0058:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qG.C17773b.m3880fetchItemsgIAlus(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: fetchMoreItems-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3881fetchMoreItemsgIAlus(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qG.C17773b.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qG.b$c r0 = (qG.C17773b.c) r0
            int r1 = r0.f146422h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146422h = r1
            goto L_0x0018
        L_0x0013:
            qG.b$c r0 = new qG.b$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146420f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146422h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146419e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146418d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f146417c
            qG.b r6 = (qG.C17773b) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0059
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            boolean r1 = r5.f146403d
            if (r1 == 0) goto L_0x005a
            r0.f146417c = r5
            r0.f146418d = r6
            r0.f146419e = r7
            r0.f146422h = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r2) goto L_0x0059
            return r2
        L_0x0059:
            return r6
        L_0x005a:
            XH.x$a r6 = XH.x.f139812b
            java.util.List r6 = YH.C16877v.n()
            java.lang.Object r6 = XH.x.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qG.C17773b.m3881fetchMoreItemsgIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
