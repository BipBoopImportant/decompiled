package aH;

import OE.q;
import XH.x;
import android.net.Uri;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.network.api.CatalogApi;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepository;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\u001f\u0010 J(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\"\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b#\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"LaH/a;", "Lcom/sugarcube/decorate/v2/internal/v2/ui/catalog/data/catalog/CatalogRepository;", "Lcom/sugarcube/core/network/api/CatalogApi;", "cachedApiService", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LOE/q;", "sugarcube", "<init>", "(Lcom/sugarcube/core/network/api/CatalogApi;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LOE/q;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Landroid/net/Uri;", "moreToken", "LXH/x;", "Lcom/sugarcube/core/network/models/CatalogPage;", "getCatalogPage-0E7RQCE", "(Lcom/sugarcube/core/network/models/RoomType;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "getCatalogPage", "", "searchTerm", "Lcom/sugarcube/core/network/models/CatalogSearchPage;", "fetchCatalogItemsForSearchTerm-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "fetchCatalogItemsForSearchTerm", "", "itemId", "fetchCatalogSwapSuggestionsPage-0E7RQCE", "(ILandroid/net/Uri;LdI/e;)Ljava/lang/Object;", "fetchCatalogSwapSuggestionsPage", "categoryId", "fetchCatalogItemsForCategory-0E7RQCE", "(Ljava/lang/String;Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "fetchCatalogItemsForCategory", "subCategory", "fetchCatalogItemsForSubCategory-0E7RQCE", "fetchCatalogItemsForSubCategory", "a", "Lcom/sugarcube/core/network/api/CatalogApi;", "b", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "c", "LOE/q;", "getSugarcube", "()LOE/q;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aH.a  reason: case insensitive filesystem */
public final class C17026a implements CatalogRepository {

    /* renamed from: a  reason: collision with root package name */
    private final CatalogApi f140919a;

    /* renamed from: b  reason: collision with root package name */
    private final ConfigRepository f140920b;

    /* renamed from: c  reason: collision with root package name */
    private final q f140921c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepositoryImpl", f = "CatalogRepository.kt", l = {171, 174, 176}, m = "fetchCatalogItemsForCategory-0E7RQCE")
    /* renamed from: aH.a$a  reason: collision with other inner class name */
    static final class C3448a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f140922c;

        /* renamed from: d  reason: collision with root package name */
        Object f140923d;

        /* renamed from: e  reason: collision with root package name */
        Object f140924e;

        /* renamed from: f  reason: collision with root package name */
        Object f140925f;

        /* renamed from: g  reason: collision with root package name */
        Object f140926g;

        /* renamed from: h  reason: collision with root package name */
        Object f140927h;

        /* renamed from: i  reason: collision with root package name */
        Object f140928i;

        /* renamed from: j  reason: collision with root package name */
        Object f140929j;

        /* renamed from: k  reason: collision with root package name */
        int f140930k;

        /* renamed from: l  reason: collision with root package name */
        boolean f140931l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f140932m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17026a f140933n;

        /* renamed from: o  reason: collision with root package name */
        int f140934o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3448a(C17026a aVar, C17164e<? super C3448a> eVar) {
            super(eVar);
            this.f140933n = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140932m = obj;
            this.f140934o |= Integer.MIN_VALUE;
            Object r22 = this.f140933n.m48fetchCatalogItemsForCategory0E7RQCE((String) null, (Uri) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepositoryImpl", f = "CatalogRepository.kt", l = {124, 127}, m = "fetchCatalogItemsForSearchTerm-0E7RQCE")
    /* renamed from: aH.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f140935c;

        /* renamed from: d  reason: collision with root package name */
        Object f140936d;

        /* renamed from: e  reason: collision with root package name */
        Object f140937e;

        /* renamed from: f  reason: collision with root package name */
        Object f140938f;

        /* renamed from: g  reason: collision with root package name */
        Object f140939g;

        /* renamed from: h  reason: collision with root package name */
        Object f140940h;

        /* renamed from: i  reason: collision with root package name */
        Object f140941i;

        /* renamed from: j  reason: collision with root package name */
        Object f140942j;

        /* renamed from: k  reason: collision with root package name */
        boolean f140943k;

        /* renamed from: l  reason: collision with root package name */
        int f140944l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f140945m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17026a f140946n;

        /* renamed from: o  reason: collision with root package name */
        int f140947o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17026a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f140946n = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140945m = obj;
            this.f140947o |= Integer.MIN_VALUE;
            Object r22 = this.f140946n.m49fetchCatalogItemsForSearchTerm0E7RQCE((String) null, (String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepositoryImpl", f = "CatalogRepository.kt", l = {196, 199, 201}, m = "fetchCatalogItemsForSubCategory-0E7RQCE")
    /* renamed from: aH.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f140948c;

        /* renamed from: d  reason: collision with root package name */
        Object f140949d;

        /* renamed from: e  reason: collision with root package name */
        Object f140950e;

        /* renamed from: f  reason: collision with root package name */
        Object f140951f;

        /* renamed from: g  reason: collision with root package name */
        Object f140952g;

        /* renamed from: h  reason: collision with root package name */
        Object f140953h;

        /* renamed from: i  reason: collision with root package name */
        Object f140954i;

        /* renamed from: j  reason: collision with root package name */
        Object f140955j;

        /* renamed from: k  reason: collision with root package name */
        int f140956k;

        /* renamed from: l  reason: collision with root package name */
        boolean f140957l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f140958m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17026a f140959n;

        /* renamed from: o  reason: collision with root package name */
        int f140960o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17026a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f140959n = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140958m = obj;
            this.f140960o |= Integer.MIN_VALUE;
            Object r22 = this.f140959n.m50fetchCatalogItemsForSubCategory0E7RQCE((String) null, (Uri) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepositoryImpl", f = "CatalogRepository.kt", l = {148, 151, 153}, m = "fetchCatalogSwapSuggestionsPage-0E7RQCE")
    /* renamed from: aH.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f140961c;

        /* renamed from: d  reason: collision with root package name */
        Object f140962d;

        /* renamed from: e  reason: collision with root package name */
        Object f140963e;

        /* renamed from: f  reason: collision with root package name */
        Object f140964f;

        /* renamed from: g  reason: collision with root package name */
        Object f140965g;

        /* renamed from: h  reason: collision with root package name */
        Object f140966h;

        /* renamed from: i  reason: collision with root package name */
        int f140967i;

        /* renamed from: j  reason: collision with root package name */
        int f140968j;

        /* renamed from: k  reason: collision with root package name */
        boolean f140969k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f140970l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17026a f140971m;

        /* renamed from: n  reason: collision with root package name */
        int f140972n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17026a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f140971m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140970l = obj;
            this.f140972n |= Integer.MIN_VALUE;
            Object r32 = this.f140971m.m51fetchCatalogSwapSuggestionsPage0E7RQCE(0, (Uri) null, this);
            return r32 == C17187b.f() ? r32 : x.a(r32);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.v2.ui.catalog.data.catalog.CatalogRepositoryImpl", f = "CatalogRepository.kt", l = {95, 100, 102}, m = "getCatalogPage-0E7RQCE")
    /* renamed from: aH.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f140973c;

        /* renamed from: d  reason: collision with root package name */
        Object f140974d;

        /* renamed from: e  reason: collision with root package name */
        Object f140975e;

        /* renamed from: f  reason: collision with root package name */
        Object f140976f;

        /* renamed from: g  reason: collision with root package name */
        Object f140977g;

        /* renamed from: h  reason: collision with root package name */
        Object f140978h;

        /* renamed from: i  reason: collision with root package name */
        Object f140979i;

        /* renamed from: j  reason: collision with root package name */
        Object f140980j;

        /* renamed from: k  reason: collision with root package name */
        Object f140981k;

        /* renamed from: l  reason: collision with root package name */
        boolean f140982l;

        /* renamed from: m  reason: collision with root package name */
        int f140983m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f140984n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C17026a f140985o;

        /* renamed from: p  reason: collision with root package name */
        int f140986p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17026a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f140985o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140984n = obj;
            this.f140986p |= Integer.MIN_VALUE;
            Object r22 = this.f140985o.m52getCatalogPage0E7RQCE((RoomType) null, (Uri) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C17026a(CatalogApi catalogApi, ConfigRepository configRepository, q qVar) {
        C17542s.j(catalogApi, "cachedApiService");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(qVar, "sugarcube");
        this.f140919a = catalogApi;
        this.f140920b = configRepository;
        this.f140921c = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: fetchCatalogItemsForCategory-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m48fetchCatalogItemsForCategory0E7RQCE(java.lang.String r21, android.net.Uri r22, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogPage>> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof aH.C17026a.C3448a
            if (r2 == 0) goto L_0x0018
            r2 = r0
            aH.a$a r2 = (aH.C17026a.C3448a) r2
            int r3 = r2.f140934o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f140934o = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            aH.a$a r2 = new aH.a$a
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.f140932m
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.f140934o
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x00a5
            if (r3 == r7) goto L_0x007f
            if (r3 == r6) goto L_0x0062
            if (r3 != r5) goto L_0x005a
            java.lang.Object r0 = r15.f140929j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140928i
            com.sugarcube.core.network.api.CatalogApi r0 = (com.sugarcube.core.network.api.CatalogApi) r0
            java.lang.Object r0 = r15.f140927h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140926g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140925f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.f140924e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.f140923d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140922c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x0138
        L_0x0057:
            r0 = move-exception
            goto L_0x013f
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0062:
            java.lang.Object r0 = r15.f140927h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140926g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140925f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.f140924e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.f140923d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140922c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x00f6
        L_0x007f:
            int r4 = r15.f140930k
            java.lang.Object r0 = r15.f140927h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r3 = r15.f140926g
            aH.a r3 = (aH.C17026a) r3
            java.lang.Object r7 = r15.f140925f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r15.f140924e
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r9 = r15.f140923d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r15.f140922c
            aH.a r10 = (aH.C17026a) r10
            XH.y.b(r2)     // Catch:{ all -> 0x0057 }
            r19 = r2
            r2 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r19
            goto L_0x00d3
        L_0x00a5:
            XH.y.b(r2)
            XH.x$a r2 = XH.x.f139812b     // Catch:{ all -> 0x0057 }
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f140920b     // Catch:{ all -> 0x0057 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0057 }
            r15.f140922c = r1     // Catch:{ all -> 0x0057 }
            r8 = r21
            r15.f140923d = r8     // Catch:{ all -> 0x0057 }
            r9 = r22
            r15.f140924e = r9     // Catch:{ all -> 0x0057 }
            r15.f140925f = r0     // Catch:{ all -> 0x0057 }
            r15.f140926g = r1     // Catch:{ all -> 0x0057 }
            r15.f140927h = r1     // Catch:{ all -> 0x0057 }
            r15.f140930k = r4     // Catch:{ all -> 0x0057 }
            r15.f140934o = r7     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r2.get(r3, r15)     // Catch:{ all -> 0x0057 }
            if (r2 != r14) goto L_0x00c9
            return r14
        L_0x00c9:
            r10 = r1
            r3 = r2
            r7 = r4
            r2 = r10
            r4 = r2
            r19 = r9
            r9 = r8
            r8 = r19
        L_0x00d3:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0057 }
            boolean r11 = r3.booleanValue()     // Catch:{ all -> 0x0057 }
            if (r8 == 0) goto L_0x00f9
            com.sugarcube.core.network.api.CatalogApi r3 = r2.f140919a     // Catch:{ all -> 0x0057 }
            r15.f140922c = r10     // Catch:{ all -> 0x0057 }
            r15.f140923d = r9     // Catch:{ all -> 0x0057 }
            r15.f140924e = r8     // Catch:{ all -> 0x0057 }
            r15.f140925f = r0     // Catch:{ all -> 0x0057 }
            r15.f140926g = r4     // Catch:{ all -> 0x0057 }
            r15.f140927h = r2     // Catch:{ all -> 0x0057 }
            r15.f140930k = r7     // Catch:{ all -> 0x0057 }
            r15.f140931l = r11     // Catch:{ all -> 0x0057 }
            r15.f140934o = r6     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r3.fetchCatalogPage(r8, r15)     // Catch:{ all -> 0x0057 }
            if (r2 != r14) goto L_0x00f6
            return r14
        L_0x00f6:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x0057 }
            goto L_0x013a
        L_0x00f9:
            com.sugarcube.core.network.api.CatalogApi r3 = r2.f140919a     // Catch:{ all -> 0x0057 }
            OE.q r6 = r2.f140921c     // Catch:{ all -> 0x0057 }
            java.lang.String r12 = r6.getRegion()     // Catch:{ all -> 0x0057 }
            r15.f140922c = r10     // Catch:{ all -> 0x0057 }
            r15.f140923d = r9     // Catch:{ all -> 0x0057 }
            r15.f140924e = r8     // Catch:{ all -> 0x0057 }
            r15.f140925f = r0     // Catch:{ all -> 0x0057 }
            r15.f140926g = r4     // Catch:{ all -> 0x0057 }
            r15.f140927h = r2     // Catch:{ all -> 0x0057 }
            r15.f140928i = r3     // Catch:{ all -> 0x0057 }
            r15.f140929j = r12     // Catch:{ all -> 0x0057 }
            r15.f140930k = r7     // Catch:{ all -> 0x0057 }
            r15.f140931l = r11     // Catch:{ all -> 0x0057 }
            r15.f140934o = r5     // Catch:{ all -> 0x0057 }
            r5 = 30
            r6 = 0
            r8 = 0
            r0 = 0
            r10 = 0
            r2 = 0
            r13 = 0
            r16 = 0
            r17 = 1892(0x764, float:2.651E-42)
            r18 = 0
            r4 = r11
            r7 = r9
            r9 = r0
            r11 = r12
            r12 = r2
            r0 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            java.lang.Object r2 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchCatalogPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0057 }
            if (r2 != r0) goto L_0x0138
            return r0
        L_0x0138:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x0057 }
        L_0x013a:
            java.lang.Object r0 = XH.x.b(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x0149
        L_0x013f:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0149:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aH.C17026a.m48fetchCatalogItemsForCategory0E7RQCE(java.lang.String, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2 A[Catch:{ all -> 0x0051 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: fetchCatalogItemsForSearchTerm-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m49fetchCatalogItemsForSearchTerm0E7RQCE(java.lang.String r20, java.lang.String r21, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogSearchPage>> r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r22
            boolean r2 = r0 instanceof aH.C17026a.b
            if (r2 == 0) goto L_0x0017
            r2 = r0
            aH.a$b r2 = (aH.C17026a.b) r2
            int r3 = r2.f140947o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f140947o = r3
            goto L_0x001c
        L_0x0017:
            aH.a$b r2 = new aH.a$b
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f140945m
            java.lang.Object r15 = eI.C17187b.f()
            int r4 = r2.f140947o
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0072
            if (r4 == r6) goto L_0x005c
            if (r4 != r5) goto L_0x0054
            java.lang.Object r0 = r2.f140942j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f140941i
            com.sugarcube.core.network.api.CatalogApi r0 = (com.sugarcube.core.network.api.CatalogApi) r0
            java.lang.Object r0 = r2.f140940h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r2.f140939g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r2.f140938f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f140937e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f140936d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f140935c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r3)     // Catch:{ all -> 0x0051 }
            goto L_0x00d3
        L_0x0051:
            r0 = move-exception
            goto L_0x00da
        L_0x0054:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005c:
            java.lang.Object r0 = r2.f140938f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r4 = r2.f140937e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.f140936d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.f140935c
            aH.a r7 = (aH.C17026a) r7
            XH.y.b(r3)
            r10 = r4
            r4 = r6
            goto L_0x0091
        L_0x0072:
            XH.y.b(r3)
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r1.f140920b
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r4 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE
            r2.f140935c = r1
            r7 = r20
            r2.f140936d = r7
            r8 = r21
            r2.f140937e = r8
            r2.f140938f = r0
            r2.f140947o = r6
            java.lang.Object r3 = r3.get(r4, r2)
            if (r3 != r15) goto L_0x008e
            return r15
        L_0x008e:
            r4 = r7
            r10 = r8
            r7 = r1
        L_0x0091:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r6 = r3.booleanValue()
            XH.x$a r3 = XH.x.f139812b     // Catch:{ all -> 0x0051 }
            com.sugarcube.core.network.api.CatalogApi r3 = r7.f140919a     // Catch:{ all -> 0x0051 }
            OE.q r8 = r7.f140921c     // Catch:{ all -> 0x0051 }
            java.lang.String r13 = r8.getRegion()     // Catch:{ all -> 0x0051 }
            r8 = 0
            r2.f140935c = r7     // Catch:{ all -> 0x0051 }
            r2.f140936d = r4     // Catch:{ all -> 0x0051 }
            r2.f140937e = r10     // Catch:{ all -> 0x0051 }
            r2.f140938f = r0     // Catch:{ all -> 0x0051 }
            r2.f140939g = r7     // Catch:{ all -> 0x0051 }
            r2.f140940h = r7     // Catch:{ all -> 0x0051 }
            r2.f140941i = r3     // Catch:{ all -> 0x0051 }
            r2.f140942j = r13     // Catch:{ all -> 0x0051 }
            r2.f140943k = r6     // Catch:{ all -> 0x0051 }
            r2.f140944l = r8     // Catch:{ all -> 0x0051 }
            r2.f140947o = r5     // Catch:{ all -> 0x0051 }
            r0 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 3516(0xdbc, float:4.927E-42)
            r18 = 0
            r5 = r6
            r6 = r0
            r0 = r15
            r15 = r16
            r16 = r2
            java.lang.Object r3 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchCatalogSearchPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0051 }
            if (r3 != r0) goto L_0x00d3
            return r0
        L_0x00d3:
            com.sugarcube.core.network.models.CatalogSearchPage r3 = (com.sugarcube.core.network.models.CatalogSearchPage) r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = XH.x.b(r3)     // Catch:{ all -> 0x0051 }
            goto L_0x00e4
        L_0x00da:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x00e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aH.C17026a.m49fetchCatalogItemsForSearchTerm0E7RQCE(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: fetchCatalogItemsForSubCategory-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m50fetchCatalogItemsForSubCategory0E7RQCE(java.lang.String r21, android.net.Uri r22, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogPage>> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof aH.C17026a.c
            if (r2 == 0) goto L_0x0018
            r2 = r0
            aH.a$c r2 = (aH.C17026a.c) r2
            int r3 = r2.f140960o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f140960o = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            aH.a$c r2 = new aH.a$c
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.f140958m
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.f140960o
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x00a5
            if (r3 == r7) goto L_0x007f
            if (r3 == r6) goto L_0x0062
            if (r3 != r5) goto L_0x005a
            java.lang.Object r0 = r15.f140955j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140954i
            com.sugarcube.core.network.api.CatalogApi r0 = (com.sugarcube.core.network.api.CatalogApi) r0
            java.lang.Object r0 = r15.f140953h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140952g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140951f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.f140950e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.f140949d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140948c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x0138
        L_0x0057:
            r0 = move-exception
            goto L_0x013f
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0062:
            java.lang.Object r0 = r15.f140953h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140952g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140951f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.f140950e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.f140949d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140948c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x00f6
        L_0x007f:
            int r4 = r15.f140956k
            java.lang.Object r0 = r15.f140953h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r3 = r15.f140952g
            aH.a r3 = (aH.C17026a) r3
            java.lang.Object r7 = r15.f140951f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r15.f140950e
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r9 = r15.f140949d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r15.f140948c
            aH.a r10 = (aH.C17026a) r10
            XH.y.b(r2)     // Catch:{ all -> 0x0057 }
            r19 = r2
            r2 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r19
            goto L_0x00d3
        L_0x00a5:
            XH.y.b(r2)
            XH.x$a r2 = XH.x.f139812b     // Catch:{ all -> 0x0057 }
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f140920b     // Catch:{ all -> 0x0057 }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x0057 }
            r15.f140948c = r1     // Catch:{ all -> 0x0057 }
            r8 = r21
            r15.f140949d = r8     // Catch:{ all -> 0x0057 }
            r9 = r22
            r15.f140950e = r9     // Catch:{ all -> 0x0057 }
            r15.f140951f = r0     // Catch:{ all -> 0x0057 }
            r15.f140952g = r1     // Catch:{ all -> 0x0057 }
            r15.f140953h = r1     // Catch:{ all -> 0x0057 }
            r15.f140956k = r4     // Catch:{ all -> 0x0057 }
            r15.f140960o = r7     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r2.get(r3, r15)     // Catch:{ all -> 0x0057 }
            if (r2 != r14) goto L_0x00c9
            return r14
        L_0x00c9:
            r10 = r1
            r3 = r2
            r7 = r4
            r2 = r10
            r4 = r2
            r19 = r9
            r9 = r8
            r8 = r19
        L_0x00d3:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0057 }
            boolean r11 = r3.booleanValue()     // Catch:{ all -> 0x0057 }
            if (r8 == 0) goto L_0x00f9
            com.sugarcube.core.network.api.CatalogApi r3 = r2.f140919a     // Catch:{ all -> 0x0057 }
            r15.f140948c = r10     // Catch:{ all -> 0x0057 }
            r15.f140949d = r9     // Catch:{ all -> 0x0057 }
            r15.f140950e = r8     // Catch:{ all -> 0x0057 }
            r15.f140951f = r0     // Catch:{ all -> 0x0057 }
            r15.f140952g = r4     // Catch:{ all -> 0x0057 }
            r15.f140953h = r2     // Catch:{ all -> 0x0057 }
            r15.f140956k = r7     // Catch:{ all -> 0x0057 }
            r15.f140957l = r11     // Catch:{ all -> 0x0057 }
            r15.f140960o = r6     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r3.fetchCatalogPage(r8, r15)     // Catch:{ all -> 0x0057 }
            if (r2 != r14) goto L_0x00f6
            return r14
        L_0x00f6:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x0057 }
            goto L_0x013a
        L_0x00f9:
            com.sugarcube.core.network.api.CatalogApi r3 = r2.f140919a     // Catch:{ all -> 0x0057 }
            OE.q r6 = r2.f140921c     // Catch:{ all -> 0x0057 }
            java.lang.String r12 = r6.getRegion()     // Catch:{ all -> 0x0057 }
            r15.f140948c = r10     // Catch:{ all -> 0x0057 }
            r15.f140949d = r9     // Catch:{ all -> 0x0057 }
            r15.f140950e = r8     // Catch:{ all -> 0x0057 }
            r15.f140951f = r0     // Catch:{ all -> 0x0057 }
            r15.f140952g = r4     // Catch:{ all -> 0x0057 }
            r15.f140953h = r2     // Catch:{ all -> 0x0057 }
            r15.f140954i = r3     // Catch:{ all -> 0x0057 }
            r15.f140955j = r12     // Catch:{ all -> 0x0057 }
            r15.f140956k = r7     // Catch:{ all -> 0x0057 }
            r15.f140957l = r11     // Catch:{ all -> 0x0057 }
            r15.f140960o = r5     // Catch:{ all -> 0x0057 }
            r5 = 30
            r6 = 0
            r7 = 0
            r0 = 0
            r10 = 0
            r2 = 0
            r13 = 0
            r16 = 0
            r17 = 1892(0x764, float:2.651E-42)
            r18 = 0
            r4 = r11
            r8 = r9
            r9 = r0
            r11 = r12
            r12 = r2
            r0 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            java.lang.Object r2 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchCatalogPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0057 }
            if (r2 != r0) goto L_0x0138
            return r0
        L_0x0138:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x0057 }
        L_0x013a:
            java.lang.Object r0 = XH.x.b(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x0149
        L_0x013f:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0149:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aH.C17026a.m50fetchCatalogItemsForSubCategory0E7RQCE(java.lang.String, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: fetchCatalogSwapSuggestionsPage-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m51fetchCatalogSwapSuggestionsPage0E7RQCE(int r15, android.net.Uri r16, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogPage>> r17) {
        /*
            r14 = this;
            r1 = r14
            r0 = r17
            boolean r2 = r0 instanceof aH.C17026a.d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            aH.a$d r2 = (aH.C17026a.d) r2
            int r3 = r2.f140972n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f140972n = r3
        L_0x0015:
            r9 = r2
            goto L_0x001d
        L_0x0017:
            aH.a$d r2 = new aH.a$d
            r2.<init>(r14, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r2 = r9.f140970l
            java.lang.Object r12 = eI.C17187b.f()
            int r3 = r9.f140972n
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0094
            if (r3 == r7) goto L_0x0072
            if (r3 == r6) goto L_0x0059
            if (r3 != r5) goto L_0x0051
            java.lang.Object r0 = r9.f140966h
            com.sugarcube.core.network.api.CatalogApi r0 = (com.sugarcube.core.network.api.CatalogApi) r0
            java.lang.Object r0 = r9.f140965g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r9.f140964f
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r9.f140963e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r9.f140962d
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r9.f140961c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x004e }
            goto L_0x0109
        L_0x004e:
            r0 = move-exception
            goto L_0x0110
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0059:
            java.lang.Object r0 = r9.f140965g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r9.f140964f
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r9.f140963e
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r9.f140962d
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r9.f140961c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x004e }
            goto L_0x00df
        L_0x0072:
            int r4 = r9.f140968j
            int r0 = r9.f140967i
            java.lang.Object r3 = r9.f140965g
            aH.a r3 = (aH.C17026a) r3
            java.lang.Object r7 = r9.f140964f
            aH.a r7 = (aH.C17026a) r7
            java.lang.Object r8 = r9.f140963e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r10 = r9.f140962d
            android.net.Uri r10 = (android.net.Uri) r10
            java.lang.Object r11 = r9.f140961c
            aH.a r11 = (aH.C17026a) r11
            XH.y.b(r2)     // Catch:{ all -> 0x004e }
            r13 = r4
            r4 = r0
            r0 = r8
            r8 = r10
            r10 = r7
            r7 = r13
            goto L_0x00bc
        L_0x0094:
            XH.y.b(r2)
            XH.x$a r2 = XH.x.f139812b     // Catch:{ all -> 0x004e }
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f140920b     // Catch:{ all -> 0x004e }
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE     // Catch:{ all -> 0x004e }
            r9.f140961c = r1     // Catch:{ all -> 0x004e }
            r8 = r16
            r9.f140962d = r8     // Catch:{ all -> 0x004e }
            r9.f140963e = r0     // Catch:{ all -> 0x004e }
            r9.f140964f = r1     // Catch:{ all -> 0x004e }
            r9.f140965g = r1     // Catch:{ all -> 0x004e }
            r10 = r15
            r9.f140967i = r10     // Catch:{ all -> 0x004e }
            r9.f140968j = r4     // Catch:{ all -> 0x004e }
            r9.f140972n = r7     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.get(r3, r9)     // Catch:{ all -> 0x004e }
            if (r2 != r12) goto L_0x00b7
            return r12
        L_0x00b7:
            r3 = r1
            r11 = r3
            r7 = r4
            r4 = r10
            r10 = r11
        L_0x00bc:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x004e }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x004e }
            if (r8 == 0) goto L_0x00e2
            com.sugarcube.core.network.api.CatalogApi r5 = r3.f140919a     // Catch:{ all -> 0x004e }
            r9.f140961c = r11     // Catch:{ all -> 0x004e }
            r9.f140962d = r8     // Catch:{ all -> 0x004e }
            r9.f140963e = r0     // Catch:{ all -> 0x004e }
            r9.f140964f = r10     // Catch:{ all -> 0x004e }
            r9.f140965g = r3     // Catch:{ all -> 0x004e }
            r9.f140967i = r4     // Catch:{ all -> 0x004e }
            r9.f140968j = r7     // Catch:{ all -> 0x004e }
            r9.f140969k = r2     // Catch:{ all -> 0x004e }
            r9.f140972n = r6     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r5.fetchCatalogPage(r8, r9)     // Catch:{ all -> 0x004e }
            if (r2 != r12) goto L_0x00df
            return r12
        L_0x00df:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x004e }
            goto L_0x010b
        L_0x00e2:
            com.sugarcube.core.network.api.CatalogApi r6 = r3.f140919a     // Catch:{ all -> 0x004e }
            r9.f140961c = r11     // Catch:{ all -> 0x004e }
            r9.f140962d = r8     // Catch:{ all -> 0x004e }
            r9.f140963e = r0     // Catch:{ all -> 0x004e }
            r9.f140964f = r10     // Catch:{ all -> 0x004e }
            r9.f140965g = r3     // Catch:{ all -> 0x004e }
            r9.f140966h = r6     // Catch:{ all -> 0x004e }
            r9.f140967i = r4     // Catch:{ all -> 0x004e }
            r9.f140968j = r7     // Catch:{ all -> 0x004e }
            r9.f140969k = r2     // Catch:{ all -> 0x004e }
            r9.f140972n = r5     // Catch:{ all -> 0x004e }
            r0 = 30
            r7 = 0
            r8 = 0
            r10 = 24
            r11 = 0
            r3 = r6
            r5 = r2
            r6 = r0
            java.lang.Object r2 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchCatalogItemSwappables$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004e }
            if (r2 != r12) goto L_0x0109
            return r12
        L_0x0109:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x004e }
        L_0x010b:
            java.lang.Object r0 = XH.x.b(r2)     // Catch:{ all -> 0x004e }
            goto L_0x011a
        L_0x0110:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aH.C17026a.m51fetchCatalogSwapSuggestionsPage0E7RQCE(int, android.net.Uri, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: getCatalogPage-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m52getCatalogPage0E7RQCE(com.sugarcube.core.network.models.RoomType r20, android.net.Uri r21, dI.C17164e<? super XH.x<com.sugarcube.core.network.models.CatalogPage>> r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r22
            boolean r2 = r0 instanceof aH.C17026a.e
            if (r2 == 0) goto L_0x0018
            r2 = r0
            aH.a$e r2 = (aH.C17026a.e) r2
            int r3 = r2.f140986p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f140986p = r3
        L_0x0016:
            r15 = r2
            goto L_0x001e
        L_0x0018:
            aH.a$e r2 = new aH.a$e
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r15.f140984n
            java.lang.Object r14 = eI.C17187b.f()
            int r3 = r15.f140986p
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0095
            if (r3 == r6) goto L_0x0081
            if (r3 == r5) goto L_0x0065
            if (r3 != r4) goto L_0x005d
            java.lang.Object r0 = r15.f140981k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140980j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r15.f140979i
            com.sugarcube.core.network.api.CatalogApi r0 = (com.sugarcube.core.network.api.CatalogApi) r0
            java.lang.Object r0 = r15.f140978h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140977g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140976f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.f140975e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.f140974d
            com.sugarcube.core.network.models.RoomType r0 = (com.sugarcube.core.network.models.RoomType) r0
            java.lang.Object r0 = r15.f140973c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x005a }
            goto L_0x0120
        L_0x005a:
            r0 = move-exception
            goto L_0x0127
        L_0x005d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0065:
            java.lang.Object r0 = r15.f140978h
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140977g
            aH.a r0 = (aH.C17026a) r0
            java.lang.Object r0 = r15.f140976f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r15.f140975e
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r0 = r15.f140974d
            com.sugarcube.core.network.models.RoomType r0 = (com.sugarcube.core.network.models.RoomType) r0
            java.lang.Object r0 = r15.f140973c
            aH.a r0 = (aH.C17026a) r0
            XH.y.b(r2)     // Catch:{ all -> 0x005a }
            goto L_0x00da
        L_0x0081:
            java.lang.Object r0 = r15.f140976f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r3 = r15.f140975e
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r6 = r15.f140974d
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r7 = r15.f140973c
            aH.a r7 = (aH.C17026a) r7
            XH.y.b(r2)
            goto L_0x00b4
        L_0x0095:
            XH.y.b(r2)
            com.sugarcube.app.base.data.feature.ConfigRepository r2 = r1.f140920b
            com.sugarcube.app.base.data.feature.FeatureFlags$EnableSmartProductRecommendations r3 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableSmartProductRecommendations.INSTANCE
            r15.f140973c = r1
            r7 = r20
            r15.f140974d = r7
            r8 = r21
            r15.f140975e = r8
            r15.f140976f = r0
            r15.f140986p = r6
            java.lang.Object r2 = r2.get(r3, r15)
            if (r2 != r14) goto L_0x00b1
            return r14
        L_0x00b1:
            r6 = r7
            r3 = r8
            r7 = r1
        L_0x00b4:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            XH.x$a r8 = XH.x.f139812b     // Catch:{ all -> 0x005a }
            r8 = 0
            if (r3 == 0) goto L_0x00dd
            com.sugarcube.core.network.api.CatalogApi r4 = r7.f140919a     // Catch:{ all -> 0x005a }
            r15.f140973c = r7     // Catch:{ all -> 0x005a }
            r15.f140974d = r6     // Catch:{ all -> 0x005a }
            r15.f140975e = r3     // Catch:{ all -> 0x005a }
            r15.f140976f = r0     // Catch:{ all -> 0x005a }
            r15.f140977g = r7     // Catch:{ all -> 0x005a }
            r15.f140978h = r7     // Catch:{ all -> 0x005a }
            r15.f140982l = r2     // Catch:{ all -> 0x005a }
            r15.f140983m = r8     // Catch:{ all -> 0x005a }
            r15.f140986p = r5     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r4.fetchCatalogPage(r3, r15)     // Catch:{ all -> 0x005a }
            if (r2 != r14) goto L_0x00da
            return r14
        L_0x00da:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x005a }
            goto L_0x0122
        L_0x00dd:
            com.sugarcube.core.network.api.CatalogApi r5 = r7.f140919a     // Catch:{ all -> 0x005a }
            OE.q r9 = r7.f140921c     // Catch:{ all -> 0x005a }
            java.lang.String r11 = r9.getRegion()     // Catch:{ all -> 0x005a }
            java.lang.String r12 = r6.getApiKey()     // Catch:{ all -> 0x005a }
            r15.f140973c = r7     // Catch:{ all -> 0x005a }
            r15.f140974d = r6     // Catch:{ all -> 0x005a }
            r15.f140975e = r3     // Catch:{ all -> 0x005a }
            r15.f140976f = r0     // Catch:{ all -> 0x005a }
            r15.f140977g = r7     // Catch:{ all -> 0x005a }
            r15.f140978h = r7     // Catch:{ all -> 0x005a }
            r15.f140979i = r5     // Catch:{ all -> 0x005a }
            r15.f140980j = r11     // Catch:{ all -> 0x005a }
            r15.f140981k = r12     // Catch:{ all -> 0x005a }
            r15.f140982l = r2     // Catch:{ all -> 0x005a }
            r15.f140983m = r8     // Catch:{ all -> 0x005a }
            r15.f140986p = r4     // Catch:{ all -> 0x005a }
            r0 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r16 = 0
            r17 = 1660(0x67c, float:2.326E-42)
            r18 = 0
            r3 = r5
            r4 = r2
            r5 = r0
            r0 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            java.lang.Object r2 = com.sugarcube.core.network.api.CatalogApi.DefaultImpls.fetchCatalogPage$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x005a }
            if (r2 != r0) goto L_0x0120
            return r0
        L_0x0120:
            com.sugarcube.core.network.models.CatalogPage r2 = (com.sugarcube.core.network.models.CatalogPage) r2     // Catch:{ all -> 0x005a }
        L_0x0122:
            java.lang.Object r0 = XH.x.b(r2)     // Catch:{ all -> 0x005a }
            goto L_0x0131
        L_0x0127:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0131:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aH.C17026a.m52getCatalogPage0E7RQCE(com.sugarcube.core.network.models.RoomType, android.net.Uri, dI.e):java.lang.Object");
    }
}
