package pG;

import RF.q;
import XH.x;
import YH.C16877v;
import android.net.Uri;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.CatalogPage;
import com.sugarcube.core.network.models.RoomType;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0017\u0010\u000fJ$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR(\u0010)\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"LpG/a;", "", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "catalogRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "LXH/N;", "g", "(Lcom/sugarcube/core/network/models/RoomType;)V", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "b", "(Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/models/CatalogPage;", "data", "f", "(Lcom/sugarcube/core/network/models/CatalogPage;Lcom/sugarcube/core/network/models/RoomType;)Ljava/lang/Object;", "Landroid/net/Uri;", "e", "(Lcom/sugarcube/core/network/models/RoomType;)Landroid/net/Uri;", "c", "d", "a", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "", "", "Ljava/util/Map;", "nextPageTokens", "", "itemCounts", "", "Z", "getCanLoadMore", "()Z", "setCanLoadMore", "(Z)V", "getCanLoadMore$annotations", "()V", "canLoadMore", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pG.a  reason: case insensitive filesystem */
public final class C17740a {

    /* renamed from: a  reason: collision with root package name */
    private final CatalogRepository f146222a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Uri> f146223b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f146224c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f146225d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CatalogBrowseUseCase", f = "CatalogBrowseUseCase.kt", l = {42}, m = "fetchCatalogItemsForRoomType-gIAlu-s")
    /* renamed from: pG.a$a  reason: collision with other inner class name */
    static final class C4254a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146226c;

        /* renamed from: d  reason: collision with root package name */
        Object f146227d;

        /* renamed from: e  reason: collision with root package name */
        Object f146228e;

        /* renamed from: f  reason: collision with root package name */
        Object f146229f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f146230g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17740a f146231h;

        /* renamed from: i  reason: collision with root package name */
        int f146232i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4254a(C17740a aVar, C17164e<? super C4254a> eVar) {
            super(eVar);
            this.f146231h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146230g = obj;
            this.f146232i |= Integer.MIN_VALUE;
            Object a10 = this.f146231h.b((RoomType) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CatalogBrowseUseCase", f = "CatalogBrowseUseCase.kt", l = {25}, m = "fetchItems-gIAlu-s")
    /* renamed from: pG.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146233c;

        /* renamed from: d  reason: collision with root package name */
        Object f146234d;

        /* renamed from: e  reason: collision with root package name */
        Object f146235e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146236f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17740a f146237g;

        /* renamed from: h  reason: collision with root package name */
        int f146238h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17740a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f146237g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146236f = obj;
            this.f146238h |= Integer.MIN_VALUE;
            Object c10 = this.f146237g.c((RoomType) null, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.domain.CatalogBrowseUseCase", f = "CatalogBrowseUseCase.kt", l = {29}, m = "fetchMoreItems-gIAlu-s")
    /* renamed from: pG.a$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146239c;

        /* renamed from: d  reason: collision with root package name */
        Object f146240d;

        /* renamed from: e  reason: collision with root package name */
        Object f146241e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146242f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17740a f146243g;

        /* renamed from: h  reason: collision with root package name */
        int f146244h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17740a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f146243g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146242f = obj;
            this.f146244h |= Integer.MIN_VALUE;
            Object d10 = this.f146243g.d((RoomType) null, this);
            return d10 == C17187b.f() ? d10 : x.a(d10);
        }
    }

    public C17740a(CatalogRepository catalogRepository) {
        C17542s.j(catalogRepository, "catalogRepository");
        this.f146222a = catalogRepository;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.sugarcube.core.network.models.RoomType r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17740a.C4254a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.a$a r0 = (pG.C17740a.C4254a) r0
            int r1 = r0.f146232i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146232i = r1
            goto L_0x0018
        L_0x0013:
            pG.a$a r0 = new pG.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146230g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146232i
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            java.lang.Object r6 = r0.f146229f
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r6 = r0.f146228e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146227d
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r7 = r0.f146226c
            pG.a r7 = (pG.C17740a) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x0062
        L_0x003f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0047:
            XH.y.b(r1)
            android.net.Uri r1 = r5.e(r6)
            com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository r3 = r5.f146222a
            r0.f146226c = r5
            r0.f146227d = r6
            r0.f146228e = r7
            r0.f146229f = r1
            r0.f146232i = r4
            java.lang.Object r0 = r3.m84getCatalogPage0E7RQCE(r6, r1, r0)
            if (r0 != r2) goto L_0x0061
            return r2
        L_0x0061:
            r7 = r5
        L_0x0062:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x006f
            com.sugarcube.core.network.models.CatalogPage r0 = (com.sugarcube.core.network.models.CatalogPage) r0
            java.lang.Object r6 = r7.f(r0, r6)
            goto L_0x0077
        L_0x006f:
            java.lang.Object r6 = XH.y.a(r1)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0077:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17740a.b(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    private final Uri e(RoomType roomType) {
        return this.f146223b.get(roomType.getApiKey());
    }

    private final Object f(CatalogPage catalogPage, RoomType roomType) {
        List list;
        this.f146223b.put(roomType.getApiKey(), catalogPage.getNext());
        this.f146224c.put(roomType.getApiKey(), catalogPage.getTotalCount());
        this.f146225d = catalogPage.getNext() != null;
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

    private final void g(RoomType roomType) {
        this.f146223b.put(roomType.getApiKey(), (Object) null);
        this.f146224c.put(roomType.getApiKey(), 0);
        this.f146225d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.sugarcube.core.network.models.RoomType r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17740a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.a$b r0 = (pG.C17740a.b) r0
            int r1 = r0.f146238h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146238h = r1
            goto L_0x0018
        L_0x0013:
            pG.a$b r0 = new pG.a$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146236f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146238h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146235e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146234d
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r6 = r0.f146233c
            pG.a r6 = (pG.C17740a) r6
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
            r5.g(r6)
            r0.f146233c = r5
            r0.f146234d = r6
            r0.f146235e = r7
            r0.f146238h = r4
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 != r2) goto L_0x0058
            return r2
        L_0x0058:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pG.C17740a.c(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(com.sugarcube.core.network.models.RoomType r6, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pG.C17740a.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pG.a$c r0 = (pG.C17740a.c) r0
            int r1 = r0.f146244h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146244h = r1
            goto L_0x0018
        L_0x0013:
            pG.a$c r0 = new pG.a$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f146242f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f146244h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f146241e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f146240d
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r6 = r0.f146239c
            pG.a r6 = (pG.C17740a) r6
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
            boolean r1 = r5.f146225d
            if (r1 == 0) goto L_0x005a
            r0.f146239c = r5
            r0.f146240d = r6
            r0.f146241e = r7
            r0.f146244h = r4
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
        throw new UnsupportedOperationException("Method not decompiled: pG.C17740a.d(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }
}
