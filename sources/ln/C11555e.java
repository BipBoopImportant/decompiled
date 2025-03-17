package ln;

import YH.C16877v;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lln/e;", "Lln/d;", "Lln/c;", "userRecommendationsCarouselEndpoint", "LGo/a;", "clientIdentityProvider", "<init>", "(Lln/c;LGo/a;)V", "", "", "c", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "a", "(LdI/e;)Ljava/lang/Object;", "recentItemNos", "b", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lln/c;", "LGo/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ln.e  reason: case insensitive filesystem */
public final class C11555e implements C11554d {

    /* renamed from: a  reason: collision with root package name */
    private final C11553c f99227a;

    /* renamed from: b  reason: collision with root package name */
    private final Go.a f99228b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.UserRecommendationsCarouselRemoteDataSourceImpl", f = "UserRecommendationsCarouselRemoteDataSource.kt", l = {37}, m = "getPersonalRecommendations")
    /* renamed from: ln.e$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99229c;

        /* renamed from: d  reason: collision with root package name */
        Object f99230d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99231e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11555e f99232f;

        /* renamed from: g  reason: collision with root package name */
        int f99233g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11555e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f99232f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99231e = obj;
            this.f99233g |= Integer.MIN_VALUE;
            return this.f99232f.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.UserRecommendationsCarouselRemoteDataSourceImpl", f = "UserRecommendationsCarouselRemoteDataSource.kt", l = {46}, m = "getSimilarRecommendations")
    /* renamed from: ln.e$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99234c;

        /* renamed from: d  reason: collision with root package name */
        Object f99235d;

        /* renamed from: e  reason: collision with root package name */
        Object f99236e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f99237f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11555e f99238g;

        /* renamed from: h  reason: collision with root package name */
        int f99239h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11555e eVar, C17164e<? super b> eVar2) {
            super(eVar2);
            this.f99238g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99237f = obj;
            this.f99239h |= Integer.MIN_VALUE;
            return this.f99238g.b((List<String>) null, this);
        }
    }

    public C11555e(C11553c cVar, Go.a aVar) {
        C17542s.j(cVar, "userRecommendationsCarouselEndpoint");
        C17542s.j(aVar, "clientIdentityProvider");
        this.f99227a = cVar;
        this.f99228b = aVar;
    }

    private final String c(List<String> list) {
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super com.ingka.ikea.core.model.product.ProductCarousel> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ln.C11555e.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ln.e$a r0 = (ln.C11555e.a) r0
            int r1 = r0.f99233g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f99233g = r1
            goto L_0x0018
        L_0x0013:
            ln.e$a r0 = new ln.e$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f99231e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f99233g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f99230d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f99229c
            ln.e r6 = (ln.C11555e) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            ln.c r1 = r5.f99227a
            Go.a r3 = r5.f99228b
            java.lang.String r3 = r3.c()
            r0.f99229c = r5
            r0.f99230d = r6
            r0.f99233g = r4
            java.lang.Object r1 = r1.a(r3, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.UserRecommendationsCarouselRemote r1 = (com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.UserRecommendationsCarouselRemote) r1
            com.ingka.ikea.core.model.product.ProductCarousel r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.C11555e.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.util.List<java.lang.String> r6, dI.C17164e<? super com.ingka.ikea.core.model.product.ProductCarousel> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ln.C11555e.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ln.e$b r0 = (ln.C11555e.b) r0
            int r1 = r0.f99239h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f99239h = r1
            goto L_0x0018
        L_0x0013:
            ln.e$b r0 = new ln.e$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f99237f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f99239h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f99236e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f99235d
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.f99234c
            ln.e r6 = (ln.C11555e) r6
            XH.y.b(r1)
            goto L_0x0059
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            ln.c r1 = r5.f99227a
            if (r6 == 0) goto L_0x0049
            java.lang.String r3 = r5.c(r6)
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            r0.f99234c = r5
            r0.f99235d = r6
            r0.f99236e = r7
            r0.f99239h = r4
            java.lang.Object r1 = r1.b(r3, r0)
            if (r1 != r2) goto L_0x0059
            return r2
        L_0x0059:
            com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.UserRecommendationsCarouselRemote r1 = (com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.UserRecommendationsCarouselRemote) r1
            com.ingka.ikea.core.model.product.ProductCarousel r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.C11555e.b(java.util.List, dI.e):java.lang.Object");
    }
}
