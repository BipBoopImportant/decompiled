package qG;

import XH.x;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoriesUseCase;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LqG/c;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoriesUseCase;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "categoriesRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;)V", "", "categoryId", "LXH/x;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "a", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qG.c  reason: case insensitive filesystem */
public final class C17774c implements FetchSubCategoriesUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepository f146423a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoriesUseCaseImpl", f = "FetchSubCategoriesUseCase.kt", l = {37}, m = "invoke-gIAlu-s")
    /* renamed from: qG.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146424c;

        /* renamed from: d  reason: collision with root package name */
        Object f146425d;

        /* renamed from: e  reason: collision with root package name */
        Object f146426e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146427f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17774c f146428g;

        /* renamed from: h  reason: collision with root package name */
        int f146429h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17774c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f146428g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146427f = obj;
            this.f146429h |= Integer.MIN_VALUE;
            Object r22 = this.f146428g.m3882invokegIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17774c(CategoriesRepository categoriesRepository) {
        C17542s.j(categoriesRepository, "categoriesRepository");
        this.f146423a = categoriesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3882invokegIAlus(java.lang.String r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.core.network.models.CatalogCategory>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qG.C17774c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qG.c$a r0 = (qG.C17774c.a) r0
            int r1 = r0.f146429h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146429h = r1
            goto L_0x0018
        L_0x0013:
            qG.c$a r0 = new qG.c$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146427f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146429h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146426e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146425d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f146424c
            qG.c r6 = (qG.C17774c) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0057
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepository r1 = r5.f146423a
            r0.f146424c = r5
            r0.f146425d = r6
            r0.f146426e = r7
            r0.f146429h = r4
            java.lang.Object r6 = r1.m71fetchSubcategoriesByCategorygIAlus(r6, r0)
            if (r6 != r2) goto L_0x0057
            return r2
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qG.C17774c.m3882invokegIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
