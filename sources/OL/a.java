package Ol;

import Il.c;
import com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote;
import com.ingka.ikea.appconfig.impl.service.network.MarketListRemote;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H@¢\u0006\u0004\b\u0013\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH@¢\u0006\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"LOl/a;", "LIl/c;", "LPl/c;", "marketsEndpoint", "LPl/a;", "marketConfigEndpoint", "<init>", "(LPl/c;LPl/a;)V", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketListRemote;", "d", "(LdI/e;)Ljava/lang/Object;", "", "marketCode", "languageCode", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "LRl/d;", "b", "LRl/e;", "c", "LPl/c;", "LPl/a;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Pl.c f84291a;

    /* renamed from: b  reason: collision with root package name */
    private final Pl.a f84292b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.impl.service.MarketConfigRemoteDataSourceImpl", f = "MarketConfigRemoteDataSourceImpl.kt", l = {27}, m = "getMarketConfig")
    /* renamed from: Ol.a$a  reason: collision with other inner class name */
    static final class C1717a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f84293c;

        /* renamed from: d  reason: collision with root package name */
        Object f84294d;

        /* renamed from: e  reason: collision with root package name */
        Object f84295e;

        /* renamed from: f  reason: collision with root package name */
        Object f84296f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f84297g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f84298h;

        /* renamed from: i  reason: collision with root package name */
        int f84299i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1717a(a aVar, C17164e<? super C1717a> eVar) {
            super(eVar);
            this.f84298h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f84297g = obj;
            this.f84299i |= Integer.MIN_VALUE;
            return this.f84298h.c((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.impl.service.MarketConfigRemoteDataSourceImpl", f = "MarketConfigRemoteDataSourceImpl.kt", l = {24}, m = "getMarketList")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f84300c;

        /* renamed from: d  reason: collision with root package name */
        Object f84301d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f84302e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f84303f;

        /* renamed from: g  reason: collision with root package name */
        int f84304g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f84303f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f84302e = obj;
            this.f84304g |= Integer.MIN_VALUE;
            return this.f84303f.b(this);
        }
    }

    public a(Pl.c cVar, Pl.a aVar) {
        C17542s.j(cVar, "marketsEndpoint");
        C17542s.j(aVar, "marketConfigEndpoint");
        this.f84291a = cVar;
        this.f84292b = aVar;
    }

    private final Object a(String str, String str2, C17164e<? super MarketConfigRemote> eVar) {
        return this.f84292b.a(str, str2, eVar);
    }

    private final Object d(C17164e<? super MarketListRemote> eVar) {
        return this.f84291a.a(eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super java.util.List<Rl.d>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Ol.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Ol.a$b r0 = (Ol.a.b) r0
            int r1 = r0.f84304g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f84304g = r1
            goto L_0x0018
        L_0x0013:
            Ol.a$b r0 = new Ol.a$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f84302e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f84304g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f84301d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f84300c
            Ol.a r6 = (Ol.a) r6
            XH.y.b(r1)
            goto L_0x0049
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            r0.f84300c = r5
            r0.f84301d = r6
            r0.f84304g = r4
            java.lang.Object r1 = r5.d(r0)
            if (r1 != r2) goto L_0x0049
            return r2
        L_0x0049:
            com.ingka.ikea.appconfig.impl.service.network.MarketListRemote r1 = (com.ingka.ikea.appconfig.impl.service.network.MarketListRemote) r1
            java.util.List r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ol.a.b(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r6, java.lang.String r7, dI.C17164e<? super Rl.e> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Ol.a.C1717a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Ol.a$a r0 = (Ol.a.C1717a) r0
            int r1 = r0.f84299i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f84299i = r1
            goto L_0x0018
        L_0x0013:
            Ol.a$a r0 = new Ol.a$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f84297g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f84299i
            r4 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r6 = r0.f84296f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f84295e
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f84294d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.f84293c
            Ol.a r8 = (Ol.a) r8
            XH.y.b(r1)
            goto L_0x0056
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0042:
            XH.y.b(r1)
            r0.f84293c = r5
            r0.f84294d = r6
            r0.f84295e = r7
            r0.f84296f = r8
            r0.f84299i = r4
            java.lang.Object r1 = r5.a(r6, r7, r0)
            if (r1 != r2) goto L_0x0056
            return r2
        L_0x0056:
            com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote r1 = (com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote) r1
            Rl.e r6 = r1.b(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ol.a.c(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
