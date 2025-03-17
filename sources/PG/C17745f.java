package pG;

import RF.q;
import XH.x;
import YH.C16877v;
import android.net.Uri;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogPage;
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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0017\u0010\u000fJ$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR(\u0010'\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"LpG/f;", "", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "catalogRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;)V", "", "itemId", "LXH/N;", "g", "(I)V", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "d", "(ILdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogPage;", "data", "f", "(Lcom/sugarcube/core/network/models/CatalogPage;I)Ljava/lang/Object;", "Landroid/net/Uri;", "e", "(I)Landroid/net/Uri;", "b", "c", "a", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "", "Ljava/util/Map;", "nextPageTokens", "itemCounts", "", "Z", "getCanLoadMore", "()Z", "setCanLoadMore", "(Z)V", "getCanLoadMore$annotations", "()V", "canLoadMore", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pG.f  reason: case insensitive filesystem */
public final class C17745f {

    /* renamed from: a  reason: collision with root package name */
    private final CatalogRepository f146273a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Uri> f146274b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, Integer> f146275c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f146276d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.SwapUseCase", f = "SwapUseCase.kt", l = {24}, m = "fetchItems-gIAlu-s")
    /* renamed from: pG.f$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146277c;

        /* renamed from: d  reason: collision with root package name */
        Object f146278d;

        /* renamed from: e  reason: collision with root package name */
        int f146279e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146280f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17745f f146281g;

        /* renamed from: h  reason: collision with root package name */
        int f146282h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17745f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f146281g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146280f = obj;
            this.f146282h |= Integer.MIN_VALUE;
            Object b10 = this.f146281g.b(0, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.SwapUseCase", f = "SwapUseCase.kt", l = {28}, m = "fetchMoreItems-gIAlu-s")
    /* renamed from: pG.f$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146283c;

        /* renamed from: d  reason: collision with root package name */
        Object f146284d;

        /* renamed from: e  reason: collision with root package name */
        int f146285e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146286f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17745f f146287g;

        /* renamed from: h  reason: collision with root package name */
        int f146288h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17745f fVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f146287g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146286f = obj;
            this.f146288h |= Integer.MIN_VALUE;
            Object c10 = this.f146287g.c(0, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.SwapUseCase", f = "SwapUseCase.kt", l = {40}, m = "fetchSwapOptions-gIAlu-s")
    /* renamed from: pG.f$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146289c;

        /* renamed from: d  reason: collision with root package name */
        Object f146290d;

        /* renamed from: e  reason: collision with root package name */
        int f146291e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146292f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17745f f146293g;

        /* renamed from: h  reason: collision with root package name */
        int f146294h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17745f fVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f146293g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146292f = obj;
            this.f146294h |= Integer.MIN_VALUE;
            Object a10 = this.f146293g.d(0, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C17745f(CatalogRepository catalogRepository) {
        C17542s.j(catalogRepository, "catalogRepository");
        this.f146273a = catalogRepository;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(int r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17745f.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.f$c r0 = (pG.C17745f.c) r0
            int r1 = r0.f146294h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146294h = r1
            goto L_0x0018
        L_0x0013:
            pG.f$c r0 = new pG.f$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146292f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146294h
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            int r6 = r0.f146291e
            java.lang.Object r7 = r0.f146290d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f146289c
            pG.f r7 = (pG.C17745f) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x005a
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository r1 = r5.f146273a
            android.net.Uri r3 = r5.e(r6)
            r0.f146289c = r5
            r0.f146290d = r7
            r0.f146291e = r6
            r0.f146294h = r4
            java.lang.Object r0 = r1.m83fetchCatalogSwapSuggestionsPage0E7RQCE(r6, r3, r0)
            if (r0 != r2) goto L_0x0059
            return r2
        L_0x0059:
            r7 = r5
        L_0x005a:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x0067
            com.sugarcube.core.network.models.CatalogPage r0 = (com.sugarcube.core.network.models.CatalogPage) r0
            java.lang.Object r6 = r7.f(r0, r6)
            goto L_0x006f
        L_0x0067:
            java.lang.Object r6 = XH.y.a(r1)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x006f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17745f.d(int, dI.e):java.lang.Object");
    }

    private final Uri e(int i10) {
        return this.f146274b.get(Integer.valueOf(i10));
    }

    private final Object f(CatalogPage catalogPage, int i10) {
        List list;
        this.f146274b.put(Integer.valueOf(i10), catalogPage.getNext());
        this.f146275c.put(Integer.valueOf(i10), catalogPage.getTotalCount());
        this.f146276d = catalogPage.getNext() != null;
        Iterable pageItems = catalogPage.getPageItems();
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

    private final void g(int i10) {
        this.f146274b.put(Integer.valueOf(i10), (Object) null);
        this.f146275c.put(Integer.valueOf(i10), 0);
        this.f146276d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17745f.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.f$a r0 = (pG.C17745f.a) r0
            int r1 = r0.f146282h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146282h = r1
            goto L_0x0018
        L_0x0013:
            pG.f$a r0 = new pG.f$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146280f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146282h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f146278d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146277c
            pG.f r6 = (pG.C17745f) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0054
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            r5.g(r6)
            r0.f146277c = r5
            r0.f146278d = r7
            r0.f146279e = r6
            r0.f146282h = r4
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r2) goto L_0x0054
            return r2
        L_0x0054:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17745f.b(int, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17745f.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.f$b r0 = (pG.C17745f.b) r0
            int r1 = r0.f146288h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146288h = r1
            goto L_0x0018
        L_0x0013:
            pG.f$b r0 = new pG.f$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146286f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146288h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f146284d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146283c
            pG.f r6 = (pG.C17745f) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0055
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            boolean r1 = r5.f146276d
            if (r1 == 0) goto L_0x0056
            r0.f146283c = r5
            r0.f146284d = r7
            r0.f146285e = r6
            r0.f146288h = r4
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r2) goto L_0x0055
            return r2
        L_0x0055:
            return r6
        L_0x0056:
            XH.x$a r6 = XH.x.f139812b
            java.util.List r6 = YH.C16877v.n()
            java.lang.Object r6 = XH.x.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17745f.c(int, dI.e):java.lang.Object");
    }
}
