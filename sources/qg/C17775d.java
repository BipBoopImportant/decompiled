package qG;

import XH.x;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoryItemsUseCase;
import com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LqG/d;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoryItemsUseCase;", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "catalogRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;)V", "", "subCategoryId", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "a", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qG.d  reason: case insensitive filesystem */
public final class C17775d implements FetchSubCategoryItemsUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final CatalogRepository f146430a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoryItemsUseCaseImpl", f = "FetchSubCategoryItemsUseCase.kt", l = {39}, m = "invoke-gIAlu-s")
    /* renamed from: qG.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146431c;

        /* renamed from: d  reason: collision with root package name */
        Object f146432d;

        /* renamed from: e  reason: collision with root package name */
        Object f146433e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146434f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17775d f146435g;

        /* renamed from: h  reason: collision with root package name */
        int f146436h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17775d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f146435g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146434f = obj;
            this.f146436h |= Integer.MIN_VALUE;
            Object r22 = this.f146435g.m3883invokegIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17775d(CatalogRepository catalogRepository) {
        C17542s.j(catalogRepository, "catalogRepository");
        this.f146430a = catalogRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3883invokegIAlus(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qG.C17775d.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qG.d$a r0 = (qG.C17775d.a) r0
            int r1 = r0.f146436h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146436h = r1
            goto L_0x0018
        L_0x0013:
            qG.d$a r0 = new qG.d$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146434f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146436h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146433e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146432d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f146431c
            qG.d r6 = (qG.C17775d) r6
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
            com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository r1 = r5.f146430a
            r0.f146431c = r5
            r0.f146432d = r6
            r0.f146433e = r7
            r0.f146436h = r4
            r7 = 0
            java.lang.Object r6 = r1.m82fetchCatalogItemsForSubCategory0E7RQCE(r6, r7, r0)
            if (r6 != r2) goto L_0x0058
            return r2
        L_0x0058:
            java.lang.Throwable r7 = XH.x.e(r6)
            if (r7 != 0) goto L_0x0094
            com.sugarcube.core.network.models.CatalogPage r6 = (com.sugarcube.core.network.models.CatalogPage) r6
            java.util.List r6 = r6.getPageItems()
            if (r6 == 0) goto L_0x008b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x0077:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r6.next()
            com.sugarcube.core.network.models.CatalogItem r0 = (com.sugarcube.core.network.models.CatalogItem) r0
            com.sugarcube.app.base.data.database.CachedCatalogItem r0 = RF.q.a(r0)
            r7.add(r0)
            goto L_0x0077
        L_0x008b:
            java.util.List r7 = YH.C16877v.n()
        L_0x008f:
            java.lang.Object r6 = XH.x.b(r7)
            goto L_0x009c
        L_0x0094:
            java.lang.Object r6 = XH.y.a(r7)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x009c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qG.C17775d.m3883invokegIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
