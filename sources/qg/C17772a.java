package qG;

import XH.x;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoriesUseCase;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LqG/a;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoriesUseCase;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "categoriesRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;)V", "LXH/x;", "", "Lcom/sugarcube/core/network/models/CatalogCategory;", "invoke-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "invoke", "a", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/CategoriesRepository;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qG.a  reason: case insensitive filesystem */
public final class C17772a implements FetchCategoriesUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepository f146394a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoriesUseCaseImpl", f = "FetchCategoriesUseCase.kt", l = {36}, m = "invoke-IoAF18A")
    /* renamed from: qG.a$a  reason: collision with other inner class name */
    static final class C4258a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146395c;

        /* renamed from: d  reason: collision with root package name */
        Object f146396d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f146397e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17772a f146398f;

        /* renamed from: g  reason: collision with root package name */
        int f146399g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4258a(C17772a aVar, C17164e<? super C4258a> eVar) {
            super(eVar);
            this.f146398f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146397e = obj;
            this.f146399g |= Integer.MIN_VALUE;
            Object r22 = this.f146398f.m3879invokeIoAF18A(this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17772a(CategoriesRepository categoriesRepository) {
        C17542s.j(categoriesRepository, "categoriesRepository");
        this.f146394a = categoriesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m3879invokeIoAF18A(dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.core.network.models.CatalogCategory>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof qG.C17772a.C4258a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            qG.a$a r0 = (qG.C17772a.C4258a) r0
            int r1 = r0.f146399g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146399g = r1
            goto L_0x0018
        L_0x0013:
            qG.a$a r0 = new qG.a$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f146397e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146399g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f146396d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146395c
            qG.a r6 = (qG.C17772a) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.CategoriesRepository r1 = r5.f146394a
            r0.f146395c = r5
            r0.f146396d = r6
            r0.f146399g = r4
            java.lang.Object r6 = r1.m70fetchCatalogCategoriesIoAF18A(r0)
            if (r6 != r2) goto L_0x0051
            return r2
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qG.C17772a.m3879invokeIoAF18A(dI.e):java.lang.Object");
    }
}
