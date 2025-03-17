package yG;

import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import OE.q;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import YH.C16877v;
import androidx.lifecycle.f0;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoriesUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoriesUseCase;
import com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoryItemsUseCase;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000eH@¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u001cH@¢\u0006\u0004\b\u001d\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u0010H@¢\u0006\u0004\b\u001f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101¨\u00063"}, d2 = {"LyG/D;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoriesUseCase;", "fetchCategoriesUseCase", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoriesUseCase;", "fetchSubCategoriesUseCase", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;", "fetchCategoryItemsUseCase", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoryItemsUseCase;", "fetchSubCategoryItemsUseCase", "LOE/q;", "sugarcube", "<init>", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoriesUseCase;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoriesUseCase;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoryItemsUseCase;LOE/q;)V", "Lcom/sugarcube/core/network/models/CatalogCategory;", "subCategory", "LXH/N;", "Q", "(Lcom/sugarcube/core/network/models/CatalogCategory;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "LyG/r;", "update", "b0", "(LnI/l;)V", "K", "(LdI/e;)Ljava/lang/Object;", "category", "N", "", "X", "Z", "T", "m", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoriesUseCase;", "n", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoriesUseCase;", "o", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchCategoryItemsUseCase;", "p", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/domain/categories/FetchSubCategoryItemsUseCase;", "q", "LOE/q;", "LTJ/B;", "r", "LTJ/B;", "_uiState", "LTJ/P;", "s", "LTJ/P;", "()LTJ/P;", "uiState", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yG.D  reason: case insensitive filesystem */
public final class C18685D extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final FetchCategoriesUseCase f152537m;

    /* renamed from: n  reason: collision with root package name */
    private final FetchSubCategoriesUseCase f152538n;

    /* renamed from: o  reason: collision with root package name */
    private final FetchCategoryItemsUseCase f152539o;

    /* renamed from: p  reason: collision with root package name */
    private final FetchSubCategoryItemsUseCase f152540p;

    /* renamed from: q  reason: collision with root package name */
    private final q f152541q;

    /* renamed from: r  reason: collision with root package name */
    private final C16505B<r> f152542r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<r> f152543s;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoriesViewModel", f = "CategoriesViewModel.kt", l = {47, 52}, m = "fetchCategories")
    /* renamed from: yG.D$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152544c;

        /* renamed from: d  reason: collision with root package name */
        Object f152545d;

        /* renamed from: e  reason: collision with root package name */
        Object f152546e;

        /* renamed from: f  reason: collision with root package name */
        Object f152547f;

        /* renamed from: g  reason: collision with root package name */
        Object f152548g;

        /* renamed from: h  reason: collision with root package name */
        int f152549h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f152550i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18685D f152551j;

        /* renamed from: k  reason: collision with root package name */
        int f152552k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C18685D d10, C17164e<? super a> eVar) {
            super(eVar);
            this.f152551j = d10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152550i = obj;
            this.f152552k |= Integer.MIN_VALUE;
            return this.f152551j.K(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoriesViewModel", f = "CategoriesViewModel.kt", l = {61, 67, 68}, m = "fetchCategory")
    /* renamed from: yG.D$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152553c;

        /* renamed from: d  reason: collision with root package name */
        Object f152554d;

        /* renamed from: e  reason: collision with root package name */
        Object f152555e;

        /* renamed from: f  reason: collision with root package name */
        Object f152556f;

        /* renamed from: g  reason: collision with root package name */
        Object f152557g;

        /* renamed from: h  reason: collision with root package name */
        Object f152558h;

        /* renamed from: i  reason: collision with root package name */
        int f152559i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f152560j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C18685D f152561k;

        /* renamed from: l  reason: collision with root package name */
        int f152562l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18685D d10, C17164e<? super b> eVar) {
            super(eVar);
            this.f152561k = d10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152560j = obj;
            this.f152562l |= Integer.MIN_VALUE;
            return this.f152561k.N((CatalogCategory) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoriesViewModel", f = "CategoriesViewModel.kt", l = {128}, m = "fetchSubcategoryItems")
    /* renamed from: yG.D$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152563c;

        /* renamed from: d  reason: collision with root package name */
        Object f152564d;

        /* renamed from: e  reason: collision with root package name */
        Object f152565e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f152566f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18685D f152567g;

        /* renamed from: h  reason: collision with root package name */
        int f152568h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18685D d10, C17164e<? super c> eVar) {
            super(eVar);
            this.f152567g = d10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152566f = obj;
            this.f152568h |= Integer.MIN_VALUE;
            return this.f152567g.Q((CatalogCategory) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoriesViewModel", f = "CategoriesViewModel.kt", l = {140}, m = "loadMore")
    /* renamed from: yG.D$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152569c;

        /* renamed from: d  reason: collision with root package name */
        Object f152570d;

        /* renamed from: e  reason: collision with root package name */
        Object f152571e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f152572f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18685D f152573g;

        /* renamed from: h  reason: collision with root package name */
        int f152574h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18685D d10, C17164e<? super d> eVar) {
            super(eVar);
            this.f152573g = d10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152572f = obj;
            this.f152574h |= Integer.MIN_VALUE;
            return this.f152573g.T(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoriesViewModel", f = "CategoriesViewModel.kt", l = {100}, m = "onBack")
    /* renamed from: yG.D$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152575c;

        /* renamed from: d  reason: collision with root package name */
        Object f152576d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152577e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18685D f152578f;

        /* renamed from: g  reason: collision with root package name */
        int f152579g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C18685D d10, C17164e<? super e> eVar) {
            super(eVar);
            this.f152578f = d10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152577e = obj;
            this.f152579g |= Integer.MIN_VALUE;
            return this.f152578f.X(this);
        }
    }

    public C18685D(FetchCategoriesUseCase fetchCategoriesUseCase, FetchSubCategoriesUseCase fetchSubCategoriesUseCase, FetchCategoryItemsUseCase fetchCategoryItemsUseCase, FetchSubCategoryItemsUseCase fetchSubCategoryItemsUseCase, q qVar) {
        FetchCategoriesUseCase fetchCategoriesUseCase2 = fetchCategoriesUseCase;
        FetchSubCategoriesUseCase fetchSubCategoriesUseCase2 = fetchSubCategoriesUseCase;
        FetchCategoryItemsUseCase fetchCategoryItemsUseCase2 = fetchCategoryItemsUseCase;
        FetchSubCategoryItemsUseCase fetchSubCategoryItemsUseCase2 = fetchSubCategoryItemsUseCase;
        q qVar2 = qVar;
        C17542s.j(fetchCategoriesUseCase2, "fetchCategoriesUseCase");
        C17542s.j(fetchSubCategoriesUseCase2, "fetchSubCategoriesUseCase");
        C17542s.j(fetchCategoryItemsUseCase2, "fetchCategoryItemsUseCase");
        C17542s.j(fetchSubCategoryItemsUseCase2, "fetchSubCategoryItemsUseCase");
        C17542s.j(qVar2, "sugarcube");
        this.f152537m = fetchCategoriesUseCase2;
        this.f152538n = fetchSubCategoriesUseCase2;
        this.f152539o = fetchCategoryItemsUseCase2;
        this.f152540p = fetchSubCategoryItemsUseCase2;
        this.f152541q = qVar2;
        C16505B<r> a10 = C16521S.a(new r(0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, true, false, (String) null, (String) null, 959, (DefaultConstructorMarker) null));
        this.f152542r = a10;
        this.f152543s = a10;
    }

    /* access modifiers changed from: private */
    public static final r L(C18685D d10, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, true, false, (String) null, (String) null, 959, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r M(C18685D d10, List list, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, list, (C15987c) null, (List) null, false, false, (String) null, (String) null, 951, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r O(C18685D d10, CatalogCategory catalogCategory, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, catalogCategory, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, true, false, (String) null, (String) null, 957, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r P(C18685D d10, CatalogCategory catalogCategory, C15990f fVar, List list, r rVar) {
        C18685D d11 = d10;
        C17542s.j(rVar, "it");
        return r.b(d11.f152542r.getValue(), 0, catalogCategory, (CatalogCategory) null, (List) null, fVar, list, false, false, d11.f152541q.getCountry(), d11.f152541q.getLanguage(), 141, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(com.sugarcube.core.network.models.CatalogCategory r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof yG.C18685D.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yG.D$c r0 = (yG.C18685D.c) r0
            int r1 = r0.f152568h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152568h = r1
            goto L_0x0018
        L_0x0013:
            yG.D$c r0 = new yG.D$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f152566f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152568h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f152565e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f152564d
            com.sugarcube.core.network.models.CatalogCategory r6 = (com.sugarcube.core.network.models.CatalogCategory) r6
            java.lang.Object r6 = r0.f152563c
            yG.D r6 = (yG.C18685D) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            goto L_0x0068
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            yG.s r1 = new yG.s
            r1.<init>(r5)
            r5.b0(r1)
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoryItemsUseCase r1 = r5.f152540p
            java.lang.String r3 = r6.getCategoryId()
            if (r3 != 0) goto L_0x0058
            java.lang.String r3 = ""
        L_0x0058:
            r0.f152563c = r5
            r0.f152564d = r6
            r0.f152565e = r7
            r0.f152568h = r4
            java.lang.Object r7 = r1.m77invokegIAlus(r3, r0)
            if (r7 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r6 = r5
        L_0x0068:
            java.lang.Throwable r0 = XH.x.e(r7)
            if (r0 != 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            java.util.List r7 = YH.C16877v.n()
        L_0x0073:
            java.util.List r7 = (java.util.List) r7
            yG.u r0 = new yG.u
            r0.<init>(r6, r7)
            r6.b0(r0)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18685D.Q(com.sugarcube.core.network.models.CatalogCategory, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final r R(C18685D d10, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, true, false, (String) null, (String) null, 959, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r S(C18685D d10, List list, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, list, false, false, (String) null, (String) null, 927, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r U(C18685D d10, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, false, true, (String) null, (String) null, 895, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r V(C18685D d10, List list, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, list, false, false, (String) null, (String) null, 863, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r W(C18685D d10, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, false, false, (String) null, (String) null, 895, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r Y(C18685D d10, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, (CatalogCategory) null, (List) null, C15985a.a(), C16877v.n(), false, false, (String) null, (String) null, 969, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final r a0(C18685D d10, CatalogCategory catalogCategory, r rVar) {
        C17542s.j(rVar, "it");
        return r.b(d10.f152542r.getValue(), 0, (CatalogCategory) null, catalogCategory, (List) null, (C15987c) null, (List) null, false, false, (String) null, (String) null, 1019, (Object) null);
    }

    private final void b0(C17642l<? super r, r> lVar) {
        C16505B<r> b10 = this.f152542r;
        b10.setValue(lVar.invoke(b10.getValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yG.C18685D.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yG.D$a r0 = (yG.C18685D.a) r0
            int r1 = r0.f152552k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152552k = r1
            goto L_0x0018
        L_0x0013:
            yG.D$a r0 = new yG.D$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f152550i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152552k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x005e
            if (r3 == r5) goto L_0x0046
            if (r3 != r4) goto L_0x003e
            java.lang.Object r7 = r0.f152546e
            com.sugarcube.core.network.models.CatalogCategory r7 = (com.sugarcube.core.network.models.CatalogCategory) r7
            java.lang.Object r7 = r0.f152545d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f152544c
            yG.D r7 = (yG.C18685D) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x00a2
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0046:
            java.lang.Object r7 = r0.f152548g
            com.sugarcube.core.network.models.CatalogCategory r7 = (com.sugarcube.core.network.models.CatalogCategory) r7
            java.lang.Object r7 = r0.f152547f
            com.sugarcube.core.network.models.CatalogCategory r7 = (com.sugarcube.core.network.models.CatalogCategory) r7
            java.lang.Object r7 = r0.f152546e
            com.sugarcube.core.network.models.CatalogCategory r7 = (com.sugarcube.core.network.models.CatalogCategory) r7
            java.lang.Object r7 = r0.f152545d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f152544c
            yG.D r7 = (yG.C18685D) r7
            XH.y.b(r1)
            goto L_0x0085
        L_0x005e:
            XH.y.b(r1)
            TJ.B<yG.r> r1 = r6.f152542r
            java.lang.Object r1 = r1.getValue()
            yG.r r1 = (yG.r) r1
            com.sugarcube.core.network.models.CatalogCategory r1 = r1.g()
            if (r1 == 0) goto L_0x0088
            r0.f152544c = r6
            r0.f152545d = r7
            r0.f152546e = r1
            r0.f152547f = r1
            r0.f152548g = r1
            r7 = 0
            r0.f152549h = r7
            r0.f152552k = r5
            java.lang.Object r7 = r6.N(r1, r0)
            if (r7 != r2) goto L_0x0085
            return r2
        L_0x0085:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0088:
            yG.v r3 = new yG.v
            r3.<init>(r6)
            r6.b0(r3)
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoriesUseCase r3 = r6.f152537m
            r0.f152544c = r6
            r0.f152545d = r7
            r0.f152546e = r1
            r0.f152552k = r4
            java.lang.Object r0 = r3.m73invokeIoAF18A(r0)
            if (r0 != r2) goto L_0x00a1
            return r2
        L_0x00a1:
            r7 = r6
        L_0x00a2:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a9:
            java.util.List r0 = YH.C16877v.n()
        L_0x00ad:
            java.util.List r0 = (java.util.List) r0
            yG.w r1 = new yG.w
            r1.<init>(r7, r0)
            r7.b0(r1)
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18685D.K(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Iterable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0104 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(com.sugarcube.core.network.models.CatalogCategory r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof yG.C18685D.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            yG.D$b r0 = (yG.C18685D.b) r0
            int r1 = r0.f152562l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152562l = r1
            goto L_0x0018
        L_0x0013:
            yG.D$b r0 = new yG.D$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f152560j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152562l
            java.lang.String r4 = ""
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0087
            if (r3 == r7) goto L_0x006b
            if (r3 == r6) goto L_0x0050
            if (r3 != r5) goto L_0x0048
            java.lang.Object r10 = r0.f152556f
            KJ.f r10 = (KJ.C15990f) r10
            java.lang.Object r11 = r0.f152555e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f152554d
            com.sugarcube.core.network.models.CatalogCategory r11 = (com.sugarcube.core.network.models.CatalogCategory) r11
            java.lang.Object r0 = r0.f152553c
            yG.D r0 = (yG.C18685D) r0
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x0108
        L_0x0048:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0050:
            java.lang.Object r10 = r0.f152556f
            com.sugarcube.core.network.models.CatalogCategory r10 = (com.sugarcube.core.network.models.CatalogCategory) r10
            java.lang.Object r10 = r0.f152555e
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.f152554d
            com.sugarcube.core.network.models.CatalogCategory r10 = (com.sugarcube.core.network.models.CatalogCategory) r10
            java.lang.Object r3 = r0.f152553c
            yG.D r3 = (yG.C18685D) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x00d6
        L_0x006b:
            java.lang.Object r10 = r0.f152558h
            com.sugarcube.core.network.models.CatalogCategory r10 = (com.sugarcube.core.network.models.CatalogCategory) r10
            java.lang.Object r10 = r0.f152557g
            com.sugarcube.core.network.models.CatalogCategory r10 = (com.sugarcube.core.network.models.CatalogCategory) r10
            java.lang.Object r10 = r0.f152556f
            com.sugarcube.core.network.models.CatalogCategory r10 = (com.sugarcube.core.network.models.CatalogCategory) r10
            java.lang.Object r10 = r0.f152555e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f152554d
            com.sugarcube.core.network.models.CatalogCategory r10 = (com.sugarcube.core.network.models.CatalogCategory) r10
            java.lang.Object r10 = r0.f152553c
            yG.D r10 = (yG.C18685D) r10
            XH.y.b(r1)
            goto L_0x00b0
        L_0x0087:
            XH.y.b(r1)
            TJ.B<yG.r> r1 = r9.f152542r
            java.lang.Object r1 = r1.getValue()
            yG.r r1 = (yG.r) r1
            com.sugarcube.core.network.models.CatalogCategory r1 = r1.h()
            if (r1 == 0) goto L_0x00b3
            r0.f152553c = r9
            r0.f152554d = r10
            r0.f152555e = r11
            r0.f152556f = r1
            r0.f152557g = r1
            r0.f152558h = r1
            r10 = 0
            r0.f152559i = r10
            r0.f152562l = r7
            java.lang.Object r10 = r9.Q(r1, r0)
            if (r10 != r2) goto L_0x00b0
            return r2
        L_0x00b0:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00b3:
            yG.z r3 = new yG.z
            r3.<init>(r9, r10)
            r9.b0(r3)
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchSubCategoriesUseCase r3 = r9.f152538n
            java.lang.String r7 = r10.getCategoryId()
            if (r7 != 0) goto L_0x00c4
            r7 = r4
        L_0x00c4:
            r0.f152553c = r9
            r0.f152554d = r10
            r0.f152555e = r11
            r0.f152556f = r1
            r0.f152562l = r6
            java.lang.Object r1 = r3.m76invokegIAlus(r7, r0)
            if (r1 != r2) goto L_0x00d5
            return r2
        L_0x00d5:
            r3 = r9
        L_0x00d6:
            java.lang.Throwable r6 = XH.x.e(r1)
            if (r6 != 0) goto L_0x00de
            r6 = r1
            goto L_0x00e2
        L_0x00de:
            java.util.List r6 = YH.C16877v.n()
        L_0x00e2:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            KJ.f r6 = KJ.C15985a.l(r6)
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCase r7 = r3.f152539o
            java.lang.String r8 = r10.getCategoryId()
            if (r8 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r4 = r8
        L_0x00f2:
            r0.f152553c = r3
            r0.f152554d = r10
            r0.f152555e = r11
            r0.f152556f = r6
            r0.f152557g = r1
            r0.f152562l = r5
            java.lang.Object r1 = r7.m74fetchItemsgIAlus(r4, r0)
            if (r1 != r2) goto L_0x0105
            return r2
        L_0x0105:
            r11 = r10
            r0 = r3
            r10 = r6
        L_0x0108:
            java.lang.Throwable r2 = XH.x.e(r1)
            if (r2 != 0) goto L_0x010f
            goto L_0x0113
        L_0x010f:
            java.util.List r1 = YH.C16877v.n()
        L_0x0113:
            java.util.List r1 = (java.util.List) r1
            yG.A r2 = new yG.A
            r2.<init>(r0, r11, r10, r1)
            r0.b0(r2)
            XH.N r10 = XH.C16807N.f139792a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18685D.N(com.sugarcube.core.network.models.CatalogCategory, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yG.C18685D.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yG.D$d r0 = (yG.C18685D.d) r0
            int r1 = r0.f152574h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152574h = r1
            goto L_0x0018
        L_0x0013:
            yG.D$d r0 = new yG.D$d
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f152572f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152574h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r7 = r0.f152571e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f152570d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f152569c
            yG.D r7 = (yG.C18685D) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x008b
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0043:
            XH.y.b(r1)
            TJ.B<yG.r> r1 = r6.f152542r
            java.lang.Object r1 = r1.getValue()
            yG.r r1 = (yG.r) r1
            com.sugarcube.core.network.models.CatalogCategory r1 = r1.h()
            if (r1 == 0) goto L_0x0057
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0057:
            yG.B r1 = new yG.B
            r1.<init>(r6)
            r6.b0(r1)
            com.sugarcube.decorate.v2.internal.ui.catalog.domain.categories.FetchCategoryItemsUseCase r1 = r6.f152539o
            TJ.B<yG.r> r3 = r6.f152542r
            java.lang.Object r3 = r3.getValue()
            yG.r r3 = (yG.r) r3
            com.sugarcube.core.network.models.CatalogCategory r3 = r3.g()
            if (r3 == 0) goto L_0x0074
            java.lang.String r3 = r3.getCategoryId()
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            if (r3 != 0) goto L_0x007a
            java.lang.String r5 = ""
            goto L_0x007b
        L_0x007a:
            r5 = r3
        L_0x007b:
            r0.f152569c = r6
            r0.f152570d = r7
            r0.f152571e = r3
            r0.f152574h = r4
            java.lang.Object r0 = r1.m75fetchMoreItemsgIAlus(r5, r0)
            if (r0 != r2) goto L_0x008a
            return r2
        L_0x008a:
            r7 = r6
        L_0x008b:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x00b0
            java.util.List r0 = (java.util.List) r0
            TJ.B<yG.r> r1 = r7.f152542r
            java.lang.Object r1 = r1.getValue()
            yG.r r1 = (yG.r) r1
            java.util.List r1 = r1.c()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = YH.C16877v.V0(r1, r0)
            yG.C r1 = new yG.C
            r1.<init>(r7, r0)
            r7.b0(r1)
            goto L_0x00b8
        L_0x00b0:
            yG.t r0 = new yG.t
            r0.<init>(r7)
            r7.b0(r0)
        L_0x00b8:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18685D.T(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof yG.C18685D.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            yG.D$e r0 = (yG.C18685D.e) r0
            int r1 = r0.f152579g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152579g = r1
            goto L_0x0018
        L_0x0013:
            yG.D$e r0 = new yG.D$e
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f152577e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152579g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f152576d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f152575c
            yG.D r6 = (yG.C18685D) r6
            XH.y.b(r1)
            goto L_0x005f
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            TJ.B<yG.r> r1 = r5.f152542r
            java.lang.Object r1 = r1.getValue()
            yG.r r1 = (yG.r) r1
            com.sugarcube.core.network.models.CatalogCategory r1 = r1.g()
            if (r1 == 0) goto L_0x0064
            yG.y r1 = new yG.y
            r1.<init>(r5)
            r5.b0(r1)
            r0.f152575c = r5
            r0.f152576d = r6
            r0.f152579g = r4
            java.lang.Object r6 = r5.K(r0)
            if (r6 != r2) goto L_0x005f
            return r2
        L_0x005f:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L_0x0064:
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18685D.X(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r2 = N(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(com.sugarcube.core.network.models.CatalogCategory r2, dI.C17164e<? super XH.C16807N> r3) {
        /*
            r1 = this;
            TJ.B<yG.r> r0 = r1.f152542r
            java.lang.Object r0 = r0.getValue()
            yG.r r0 = (yG.r) r0
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0011
            XH.N r2 = XH.C16807N.f139792a
            return r2
        L_0x0011:
            TJ.B<yG.r> r0 = r1.f152542r
            java.lang.Object r0 = r0.getValue()
            yG.r r0 = (yG.r) r0
            com.sugarcube.core.network.models.CatalogCategory r0 = r0.h()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r0 == 0) goto L_0x0024
            r2 = 0
        L_0x0024:
            yG.x r0 = new yG.x
            r0.<init>(r1, r2)
            r1.b0(r0)
            if (r2 != 0) goto L_0x004a
            TJ.B<yG.r> r2 = r1.f152542r
            java.lang.Object r2 = r2.getValue()
            yG.r r2 = (yG.r) r2
            com.sugarcube.core.network.models.CatalogCategory r2 = r2.g()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.N(r2, r3)
            java.lang.Object r3 = eI.C17187b.f()
            if (r2 != r3) goto L_0x0047
            return r2
        L_0x0047:
            XH.N r2 = XH.C16807N.f139792a
            return r2
        L_0x004a:
            java.lang.Object r2 = r1.Q(r2, r3)
            java.lang.Object r3 = eI.C17187b.f()
            if (r2 != r3) goto L_0x0055
            return r2
        L_0x0055:
            XH.N r2 = XH.C16807N.f139792a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.C18685D.Z(com.sugarcube.core.network.models.CatalogCategory, dI.e):java.lang.Object");
    }

    public final C16519P<r> m() {
        return this.f152543s;
    }
}
