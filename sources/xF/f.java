package Xf;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LXf/f;", "LXf/e;", "LXf/d;", "replacementRecommendationsEndpoint", "<init>", "(LXf/d;)V", "", "itemNo", "", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXf/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final d f64809a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.impl.data.ReplacementRecommendationsRemoteDataSourceImpl", f = "ReplacementRecommendationsRemoteDataSource.kt", l = {26}, m = "fetchReplacementRecommendations")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f64810c;

        /* renamed from: d  reason: collision with root package name */
        Object f64811d;

        /* renamed from: e  reason: collision with root package name */
        Object f64812e;

        /* renamed from: f  reason: collision with root package name */
        Object f64813f;

        /* renamed from: g  reason: collision with root package name */
        Object f64814g;

        /* renamed from: h  reason: collision with root package name */
        int f64815h;

        /* renamed from: i  reason: collision with root package name */
        int f64816i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f64817j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ f f64818k;

        /* renamed from: l  reason: collision with root package name */
        int f64819l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f64818k = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f64817j = obj;
            this.f64819l |= Integer.MIN_VALUE;
            return this.f64818k.a((String) null, this);
        }
    }

    public f(d dVar) {
        C17542s.j(dVar, "replacementRecommendationsEndpoint");
        this.f64809a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super java.util.List<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Xf.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Xf.f$a r0 = (Xf.f.a) r0
            int r1 = r0.f64819l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f64819l = r1
            goto L_0x0018
        L_0x0013:
            Xf.f$a r0 = new Xf.f$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f64817j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f64819l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f64814g
            Xf.f r6 = (Xf.f) r6
            java.lang.Object r6 = r0.f64813f
            Xf.f r6 = (Xf.f) r6
            java.lang.Object r6 = r0.f64812e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f64811d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f64810c
            Xf.f r6 = (Xf.f) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0068
        L_0x003d:
            r6 = move-exception
            goto L_0x0073
        L_0x003f:
            r6 = move-exception
            goto L_0x008d
        L_0x0041:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            Xf.d r1 = r5.f64809a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64810c = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64811d = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64812e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64813f = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64814g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f64815h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64816i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f64819l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r1 = r1.a(r6, r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            com.ingka.ikea.app.cart.impl.data.ReplacementRecommendationsRemote r1 = (com.ingka.ikea.app.cart.impl.data.ReplacementRecommendationsRemote) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.util.List r6 = r1.b()     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x007d
        L_0x0073:
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x007d:
            boolean r7 = XH.x.g(r6)
            if (r7 == 0) goto L_0x0084
            r6 = 0
        L_0x0084:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x008c
            java.util.List r6 = YH.C16877v.n()
        L_0x008c:
            return r6
        L_0x008d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.f.a(java.lang.String, dI.e):java.lang.Object");
    }
}
