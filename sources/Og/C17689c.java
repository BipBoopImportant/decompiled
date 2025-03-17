package oG;

import NE.C13286b;
import com.squareup.moshi.f;
import com.squareup.moshi.t;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.RecentSearchRepository;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014RH\u0010\u0019\u001a6\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0006 \u0012*\u001a\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0006\u0018\u00010\u00160\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LoG/c;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "", "", "fetchRecentSearchTerms", "(LdI/e;)Ljava/lang/Object;", "searchTerm", "LXH/N;", "saveSearchTerm", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "clearAll", "a", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "Lcom/squareup/moshi/t;", "kotlin.jvm.PlatformType", "b", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/f;", "c", "Lcom/squareup/moshi/f;", "adapter", "", "d", "Ljava/util/List;", "recentSearch", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oG.c  reason: case insensitive filesystem */
public final class C17689c implements RecentSearchRepository {

    /* renamed from: a  reason: collision with root package name */
    private final ConfigRepository f145229a;

    /* renamed from: b  reason: collision with root package name */
    private final t f145230b;

    /* renamed from: c  reason: collision with root package name */
    private final f<List<?>> f145231c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f145232d = new ArrayList();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.RecentSearchRepositoryImpl", f = "RecentSearchRepository.kt", l = {98}, m = "clearAll")
    /* renamed from: oG.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145233c;

        /* renamed from: d  reason: collision with root package name */
        Object f145234d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f145235e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17689c f145236f;

        /* renamed from: g  reason: collision with root package name */
        int f145237g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17689c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f145236f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145235e = obj;
            this.f145237g |= Integer.MIN_VALUE;
            return this.f145236f.clearAll(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.RecentSearchRepositoryImpl", f = "RecentSearchRepository.kt", l = {64}, m = "fetchRecentSearchTerms")
    /* renamed from: oG.c$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145238c;

        /* renamed from: d  reason: collision with root package name */
        Object f145239d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f145240e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17689c f145241f;

        /* renamed from: g  reason: collision with root package name */
        int f145242g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17689c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f145241f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145240e = obj;
            this.f145242g |= Integer.MIN_VALUE;
            return this.f145241f.fetchRecentSearchTerms(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.RecentSearchRepositoryImpl", f = "RecentSearchRepository.kt", l = {85}, m = "saveSearchTerm")
    /* renamed from: oG.c$c  reason: collision with other inner class name */
    static final class C4233c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f145243c;

        /* renamed from: d  reason: collision with root package name */
        Object f145244d;

        /* renamed from: e  reason: collision with root package name */
        Object f145245e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f145246f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17689c f145247g;

        /* renamed from: h  reason: collision with root package name */
        int f145248h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4233c(C17689c cVar, C17164e<? super C4233c> eVar) {
            super(eVar);
            this.f145247g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145246f = obj;
            this.f145248h |= Integer.MIN_VALUE;
            return this.f145247g.saveSearchTerm((String) null, this);
        }
    }

    public C17689c(ConfigRepository configRepository) {
        C17542s.j(configRepository, "configRepository");
        this.f145229a = configRepository;
        t d10 = new t.b().a(new C13286b()).d();
        this.f145230b = d10;
        this.f145231c = d10.c(List.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object clearAll(dI.C17164e<? super XH.C16807N> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof oG.C17689c.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            oG.c$a r0 = (oG.C17689c.a) r0
            int r1 = r0.f145237g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145237g = r1
            goto L_0x0018
        L_0x0013:
            oG.c$a r0 = new oG.c$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f145235e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f145237g
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r8 = r0.f145234d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f145233c
            oG.c r8 = (oG.C17689c) r8
            XH.y.b(r1)     // Catch:{ IOException -> 0x0031 }
            goto L_0x0078
        L_0x0031:
            r8 = move-exception
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            XH.y.b(r1)
            java.util.List<java.lang.String> r1 = r7.f145232d     // Catch:{ IOException -> 0x0031 }
            r1.clear()     // Catch:{ IOException -> 0x0031 }
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r7.f145229a     // Catch:{ IOException -> 0x0031 }
            com.sugarcube.app.base.data.feature.ConfigItems$CatalogRecentSearchTerms r3 = com.sugarcube.app.base.data.feature.ConfigItems.CatalogRecentSearchTerms.INSTANCE     // Catch:{ IOException -> 0x0031 }
            com.squareup.moshi.f<java.util.List<?>> r5 = r7.f145231c     // Catch:{ IOException -> 0x0031 }
            java.util.List<java.lang.String> r6 = r7.f145232d     // Catch:{ IOException -> 0x0031 }
            java.lang.String r5 = r5.toJson(r6)     // Catch:{ IOException -> 0x0031 }
            r0.f145233c = r7     // Catch:{ IOException -> 0x0031 }
            r0.f145234d = r8     // Catch:{ IOException -> 0x0031 }
            r0.f145237g = r4     // Catch:{ IOException -> 0x0031 }
            java.lang.Object r8 = r1.override(r3, r5, r0)     // Catch:{ IOException -> 0x0031 }
            if (r8 != r2) goto L_0x0078
            return r2
        L_0x005c:
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to save recent search terms: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            YE.e r1 = YE.e.Converter
            r0.b(r8, r1)
        L_0x0078:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oG.C17689c.clearAll(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ Exception -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086 A[Catch:{ Exception -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchRecentSearchTerms(dI.C17164e<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof oG.C17689c.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            oG.c$b r0 = (oG.C17689c.b) r0
            int r1 = r0.f145242g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145242g = r1
            goto L_0x0018
        L_0x0013:
            oG.c$b r0 = new oG.c$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f145240e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f145242g
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r6 = r0.f145239d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f145238c
            oG.c r6 = (oG.C17689c) r6
            XH.y.b(r1)     // Catch:{ Exception -> 0x0031 }
            goto L_0x005d
        L_0x0031:
            r6 = move-exception
            goto L_0x0099
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            XH.y.b(r1)
            java.util.List<java.lang.String> r1 = r5.f145232d     // Catch:{ Exception -> 0x0031 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0031 }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x004b
            java.util.List<java.lang.String> r6 = r5.f145232d     // Catch:{ Exception -> 0x0031 }
            return r6
        L_0x004b:
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r5.f145229a     // Catch:{ Exception -> 0x0031 }
            com.sugarcube.app.base.data.feature.ConfigItems$CatalogRecentSearchTerms r3 = com.sugarcube.app.base.data.feature.ConfigItems.CatalogRecentSearchTerms.INSTANCE     // Catch:{ Exception -> 0x0031 }
            r0.f145238c = r5     // Catch:{ Exception -> 0x0031 }
            r0.f145239d = r6     // Catch:{ Exception -> 0x0031 }
            r0.f145242g = r4     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r1 = r1.get(r3, r0)     // Catch:{ Exception -> 0x0031 }
            if (r1 != r2) goto L_0x005c
            return r2
        L_0x005c:
            r6 = r5
        L_0x005d:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0031 }
            com.squareup.moshi.f<java.util.List<?>> r0 = r6.f145231c     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1)     // Catch:{ Exception -> 0x0031 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0086
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x0031 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0031 }
            r1.<init>()     // Catch:{ Exception -> 0x0031 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0031 }
        L_0x0074:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0031 }
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x0031 }
            if (r3 == 0) goto L_0x0074
            r1.add(r2)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0074
        L_0x0086:
            java.util.List r1 = YH.C16877v.n()     // Catch:{ Exception -> 0x0031 }
        L_0x008a:
            java.util.List<java.lang.String> r0 = r6.f145232d     // Catch:{ Exception -> 0x0031 }
            r0.clear()     // Catch:{ Exception -> 0x0031 }
            java.util.List<java.lang.String> r0 = r6.f145232d     // Catch:{ Exception -> 0x0031 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0031 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0031 }
            java.util.List<java.lang.String> r6 = r6.f145232d     // Catch:{ Exception -> 0x0031 }
            goto L_0x00b9
        L_0x0099:
            YE.b r0 = YE.C13868b.f118106a
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to fetch recent search terms: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            YE.e r1 = YE.e.Converter
            r0.b(r6, r1)
            java.util.List r6 = YH.C16877v.n()
        L_0x00b9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oG.C17689c.fetchRecentSearchTerms(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object saveSearchTerm(java.lang.String r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof oG.C17689c.C4233c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            oG.c$c r0 = (oG.C17689c.C4233c) r0
            int r1 = r0.f145248h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145248h = r1
            goto L_0x0018
        L_0x0013:
            oG.c$c r0 = new oG.c$c
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f145246f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f145248h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r8 = r0.f145245e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f145244d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f145243c
            oG.c r8 = (oG.C17689c) r8
            XH.y.b(r1)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0086
        L_0x0035:
            r8 = move-exception
            goto L_0x006a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            XH.y.b(r1)
            java.util.List<java.lang.String> r1 = r7.f145232d     // Catch:{ IOException -> 0x0035 }
            boolean r1 = r1.contains(r8)     // Catch:{ IOException -> 0x0035 }
            if (r1 != 0) goto L_0x0086
            java.util.List<java.lang.String> r1 = r7.f145232d     // Catch:{ IOException -> 0x0035 }
            r1.add(r8)     // Catch:{ IOException -> 0x0035 }
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r7.f145229a     // Catch:{ IOException -> 0x0035 }
            com.sugarcube.app.base.data.feature.ConfigItems$CatalogRecentSearchTerms r3 = com.sugarcube.app.base.data.feature.ConfigItems.CatalogRecentSearchTerms.INSTANCE     // Catch:{ IOException -> 0x0035 }
            com.squareup.moshi.f<java.util.List<?>> r5 = r7.f145231c     // Catch:{ IOException -> 0x0035 }
            java.util.List<java.lang.String> r6 = r7.f145232d     // Catch:{ IOException -> 0x0035 }
            java.lang.String r5 = r5.toJson(r6)     // Catch:{ IOException -> 0x0035 }
            r0.f145243c = r7     // Catch:{ IOException -> 0x0035 }
            r0.f145244d = r8     // Catch:{ IOException -> 0x0035 }
            r0.f145245e = r9     // Catch:{ IOException -> 0x0035 }
            r0.f145248h = r4     // Catch:{ IOException -> 0x0035 }
            java.lang.Object r8 = r1.override(r3, r5, r0)     // Catch:{ IOException -> 0x0035 }
            if (r8 != r2) goto L_0x0086
            return r2
        L_0x006a:
            YE.b r9 = YE.C13868b.f118106a
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to save recent search terms: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            YE.e r0 = YE.e.Converter
            r9.b(r8, r0)
        L_0x0086:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oG.C17689c.saveSearchTerm(java.lang.String, dI.e):java.lang.Object");
    }
}
