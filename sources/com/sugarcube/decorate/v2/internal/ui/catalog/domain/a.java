package com.sugarcube.decorate.v2.internal.ui.catalog.domain;

import com.sugarcube.app.base.data.source.CatalogRepository;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rG.C17848b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH@¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/a;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase;", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "catalogRepository", "Lcom/sugarcube/app/base/external/config/a;", "config", "<init>", "(Lcom/sugarcube/app/base/data/source/CatalogRepository;Lcom/sugarcube/app/base/external/config/a;)V", "", "", "itemIds", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/CartUseCase$a;", "execute", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LrG/b;", "items", "", "addItemsToCart", "a", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "b", "Lcom/sugarcube/app/base/external/config/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements CartUseCase {

    /* renamed from: c  reason: collision with root package name */
    public static final int f142545c = (com.sugarcube.app.base.external.config.a.f123075e | CatalogRepository.$stable);

    /* renamed from: a  reason: collision with root package name */
    private final CatalogRepository f142546a;

    /* renamed from: b  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f142547b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCaseImpl", f = "CartUseCase.kt", l = {77}, m = "addItemsToCart")
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$a  reason: collision with other inner class name */
    static final class C3475a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142548c;

        /* renamed from: d  reason: collision with root package name */
        Object f142549d;

        /* renamed from: e  reason: collision with root package name */
        Object f142550e;

        /* renamed from: f  reason: collision with root package name */
        Object f142551f;

        /* renamed from: g  reason: collision with root package name */
        Object f142552g;

        /* renamed from: h  reason: collision with root package name */
        Object f142553h;

        /* renamed from: i  reason: collision with root package name */
        Object f142554i;

        /* renamed from: j  reason: collision with root package name */
        Object f142555j;

        /* renamed from: k  reason: collision with root package name */
        int f142556k;

        /* renamed from: l  reason: collision with root package name */
        int f142557l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f142558m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a f142559n;

        /* renamed from: o  reason: collision with root package name */
        int f142560o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3475a(a aVar, C17164e<? super C3475a> eVar) {
            super(eVar);
            this.f142559n = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142558m = obj;
            this.f142560o |= Integer.MIN_VALUE;
            return this.f142559n.addItemsToCart((List<C17848b>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCaseImpl", f = "CartUseCase.kt", l = {54}, m = "execute")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f142561c;

        /* renamed from: d  reason: collision with root package name */
        Object f142562d;

        /* renamed from: e  reason: collision with root package name */
        Object f142563e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f142564f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f142565g;

        /* renamed from: h  reason: collision with root package name */
        int f142566h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f142565g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f142564f = obj;
            this.f142566h |= Integer.MIN_VALUE;
            return this.f142565g.execute((List<Integer>) null, this);
        }
    }

    public a(CatalogRepository catalogRepository, com.sugarcube.app.base.external.config.a aVar) {
        C17542s.j(catalogRepository, "catalogRepository");
        C17542s.j(aVar, "config");
        this.f142546a = catalogRepository;
        this.f142547b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object addItemsToCart(java.util.List<rG.C17848b> r9, dI.C17164e<? super com.sugarcube.app.base.data.Result<java.lang.Boolean>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.sugarcube.decorate.v2.internal.ui.catalog.domain.a.C3475a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$a r0 = (com.sugarcube.decorate.v2.internal.ui.catalog.domain.a.C3475a) r0
            int r1 = r0.f142560o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f142560o = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$a r0 = new com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f142558m
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f142560o
            r4 = 1
            if (r3 == 0) goto L_0x0051
            if (r3 != r4) goto L_0x0049
            java.lang.Object r9 = r0.f142555j
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r9 = r0.f142554i
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r9 = r0.f142553h
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.f142552g
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.f142551f
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r0.f142550e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f142549d
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r0.f142548c
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.a r9 = (com.sugarcube.decorate.v2.internal.ui.catalog.domain.a) r9
            XH.y.b(r1)
            goto L_0x00a6
        L_0x0049:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0051:
            XH.y.b(r1)
            r1 = r9
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r1, r5)
            r3.<init>(r5)
            java.util.Iterator r5 = r1.iterator()
        L_0x0066:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r5.next()
            rG.b r6 = (rG.C17848b) r6
            com.sugarcube.app.base.data.database.CachedCatalogItem r7 = r6.a()
            int r6 = r6.b()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            XH.v r6 = XH.C16796C.a(r7, r6)
            r3.add(r6)
            goto L_0x0066
        L_0x0086:
            com.sugarcube.app.base.data.source.CatalogRepository r6 = r8.f142546a
            r0.f142548c = r8
            r0.f142549d = r9
            r0.f142550e = r10
            r0.f142551f = r3
            r0.f142552g = r1
            r0.f142553h = r1
            r0.f142554i = r3
            r0.f142555j = r5
            r9 = 0
            r0.f142556k = r9
            r0.f142557l = r9
            r0.f142560o = r4
            java.lang.Object r1 = r6.addItemsWithQtyToCart(r3, r0)
            if (r1 != r2) goto L_0x00a6
            return r2
        L_0x00a6:
            com.sugarcube.app.base.data.Result r1 = (com.sugarcube.app.base.data.Result) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.catalog.domain.a.addItemsToCart(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        r6 = HJ.C15854t.r(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execute(java.util.List<java.lang.Integer> r19, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase.a>> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.sugarcube.decorate.v2.internal.ui.catalog.domain.a.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$b r3 = (com.sugarcube.decorate.v2.internal.ui.catalog.domain.a.b) r3
            int r4 = r3.f142566h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f142566h = r4
            goto L_0x001e
        L_0x0019:
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$b r3 = new com.sugarcube.decorate.v2.internal.ui.catalog.domain.a$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f142564f
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f142566h
            r7 = 1
            if (r6 == 0) goto L_0x0043
            if (r6 != r7) goto L_0x003b
            java.lang.Object r1 = r3.f142563e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f142562d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f142561c
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.a r2 = (com.sugarcube.decorate.v2.internal.ui.catalog.domain.a) r2
            XH.y.b(r4)
            goto L_0x0058
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            XH.y.b(r4)
            com.sugarcube.app.base.data.source.CatalogRepository r4 = r0.f142546a
            r3.f142561c = r0
            r3.f142562d = r1
            r3.f142563e = r2
            r3.f142566h = r7
            java.lang.Object r4 = r4.fetchProductInformation(r1, r3)
            if (r4 != r5) goto L_0x0057
            return r5
        L_0x0057:
            r2 = r0
        L_0x0058:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x006c
            com.sugarcube.app.base.data.Result$Error r1 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "No items found"
            r2.<init>(r3)
            r3 = 2
            r4 = 0
            r1.<init>(r2, r4, r3, r4)
            goto L_0x0167
        L_0x006c:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r6 = YH.C16877v.y(r4, r5)
            r3.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x007d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00f0
            java.lang.Object r6 = r4.next()
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r6
            r7 = r1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            r9 = 0
            if (r8 == 0) goto L_0x009b
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x009b
            goto L_0x00bd
        L_0x009b:
            java.util.Iterator r7 = r7.iterator()
        L_0x009f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00bd
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r10 = r6.getId()
            if (r8 != r10) goto L_0x009f
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x009f
            YH.C16877v.w()
            goto L_0x009f
        L_0x00bd:
            com.sugarcube.core.network.models.CatalogItem r7 = r6.getCatalogItem()
            java.lang.String r7 = r7.getPriceNumeral()
            if (r7 != 0) goto L_0x00c9
            java.lang.String r7 = "0.0"
        L_0x00c9:
            r11 = r7
            rG.a r7 = new rG.a
            rG.b r8 = new rG.b
            r8.<init>(r6, r9)
            lF.a r6 = new lF.a
            com.sugarcube.app.base.external.config.a r9 = r2.f142547b
            java.lang.String r12 = r9.getCountry()
            com.sugarcube.app.base.external.config.a r9 = r2.f142547b
            java.lang.String r13 = r9.getLanguage()
            r16 = 24
            r17 = 0
            r14 = 0
            r15 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7.<init>(r8, r6)
            r3.add(r7)
            goto L_0x007d
        L_0x00f0:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = YH.C16877v.y(r3, r5)
            r1.<init>(r4)
            java.util.Iterator r4 = r3.iterator()
        L_0x00fd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r4.next()
            rG.a r5 = (rG.C17847a) r5
            rG.b r6 = r5.a()
            com.sugarcube.app.base.data.database.CachedCatalogItem r6 = r6.a()
            com.sugarcube.core.network.models.CatalogItem r6 = r6.getCatalogItem()
            java.lang.String r6 = r6.getPriceNumeral()
            if (r6 == 0) goto L_0x0126
            java.lang.Float r6 = HJ.C15854t.r(r6)
            if (r6 == 0) goto L_0x0126
            float r6 = r6.floatValue()
            goto L_0x0127
        L_0x0126:
            r6 = 0
        L_0x0127:
            rG.b r5 = r5.a()
            int r5 = r5.b()
            float r5 = (float) r5
            float r6 = r6 * r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r6)
            r1.add(r5)
            goto L_0x00fd
        L_0x0139:
            float r1 = YH.C16877v.j1(r1)
            com.sugarcube.app.base.data.Result$Success r4 = new com.sugarcube.app.base.data.Result$Success
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a r5 = new com.sugarcube.decorate.v2.internal.ui.catalog.domain.CartUseCase$a
            KJ.c r3 = KJ.C15985a.h(r3)
            lF.a r14 = new lF.a
            java.lang.String r7 = java.lang.String.valueOf(r1)
            com.sugarcube.app.base.external.config.a r1 = r2.f142547b
            java.lang.String r8 = r1.getRegion()
            com.sugarcube.app.base.external.config.a r1 = r2.f142547b
            java.lang.String r9 = r1.getLanguage()
            r12 = 24
            r13 = 0
            r10 = 0
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r5.<init>(r3, r14)
            r4.<init>(r5)
            r1 = r4
        L_0x0167:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.catalog.domain.a.execute(java.util.List, dI.e):java.lang.Object");
    }
}
