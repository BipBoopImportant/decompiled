package lz;

import cz.C14328b;
import dI.C17164e;
import iz.C14587a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llz/e;", "Llz/d;", "Lcz/b;", "service", "Liz/a;", "errorMapper", "<init>", "(Lcz/b;Liz/a;)V", "", "storeId", "productId", "", "quantity", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "c", "(Ljava/lang/String;Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "a", "Lcz/b;", "b", "Liz/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14328b f129215a;

    /* renamed from: b  reason: collision with root package name */
    private final C14587a f129216b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CombinationProductRemoteDataSourceImpl", f = "CombinationProductRemoteDataSource.kt", l = {29}, m = "getCombinationDetails")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129217c;

        /* renamed from: d  reason: collision with root package name */
        Object f129218d;

        /* renamed from: e  reason: collision with root package name */
        Object f129219e;

        /* renamed from: f  reason: collision with root package name */
        Object f129220f;

        /* renamed from: g  reason: collision with root package name */
        Object f129221g;

        /* renamed from: h  reason: collision with root package name */
        Object f129222h;

        /* renamed from: i  reason: collision with root package name */
        Object f129223i;

        /* renamed from: j  reason: collision with root package name */
        Object f129224j;

        /* renamed from: k  reason: collision with root package name */
        Object f129225k;

        /* renamed from: l  reason: collision with root package name */
        int f129226l;

        /* renamed from: m  reason: collision with root package name */
        int f129227m;

        /* renamed from: n  reason: collision with root package name */
        int f129228n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f129229o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e f129230p;

        /* renamed from: q  reason: collision with root package name */
        int f129231q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f129230p = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129229o = obj;
            this.f129231q |= Integer.MIN_VALUE;
            return this.f129230p.c((String) null, (String) null, 0, this);
        }
    }

    public e(C14328b bVar, C14587a aVar) {
        C17542s.j(bVar, "service");
        C17542s.j(aVar, "errorMapper");
        this.f129215a = bVar;
        this.f129216b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r8, java.lang.String r9, int r10, dI.C17164e<? super com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof lz.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            lz.e$a r0 = (lz.e.a) r0
            int r1 = r0.f129231q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129231q = r1
            goto L_0x0018
        L_0x0013:
            lz.e$a r0 = new lz.e$a
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f129229o
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129231q
            r4 = 1
            if (r3 == 0) goto L_0x005a
            if (r3 != r4) goto L_0x0052
            java.lang.Object r8 = r0.f129225k
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f129224j
            lz.h r8 = (lz.h) r8
            java.lang.Object r9 = r0.f129223i
            iz.a r9 = (iz.C14587a) r9
            java.lang.Object r10 = r0.f129222h
            iz.a r10 = (iz.C14587a) r10
            java.lang.Object r10 = r0.f129221g
            lz.h r10 = (lz.h) r10
            java.lang.Object r10 = r0.f129220f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f129219e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f129218d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f129217c
            lz.e r10 = (lz.e) r10
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            goto L_0x008b
        L_0x004d:
            r8 = move-exception
            goto L_0x0092
        L_0x004f:
            r8 = move-exception
            goto L_0x00fc
        L_0x0052:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x005a:
            XH.y.b(r1)
            lz.h r1 = lz.h.f129233a
            iz.a r3 = r7.f129216b
            cz.b r5 = r7.f129215a     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129217c = r7     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129218d = r8     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129219e = r9     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129220f = r11     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129221g = r1     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129222h = r3     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129223i = r3     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129224j = r1     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129225k = r0     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129226l = r10     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r11 = 0
            r0.f129227m = r11     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129228n = r11     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            r0.f129231q = r4     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            java.lang.Object r8 = r5.c(r8, r9, r10, r0)     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            if (r8 != r2) goto L_0x0087
            return r2
        L_0x0087:
            r9 = r3
            r6 = r1
            r1 = r8
            r8 = r6
        L_0x008b:
            QL.x r1 = (QL.x) r1     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            java.lang.Object r8 = r8.b(r9, r1)     // Catch:{ CancellationException -> 0x004f, Exception -> 0x004d }
            return r8
        L_0x0092:
            boolean r9 = r8 instanceof java.lang.NullPointerException
            if (r9 == 0) goto L_0x00a6
            hp.c r9 = new hp.c
            hp.c$a r10 = hp.C11377c.a.RESPONSE
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L_0x00a2
            java.lang.String r8 = "NPE: Check if response body was null"
        L_0x00a2:
            r9.<init>(r10, r8)
            goto L_0x00fb
        L_0x00a6:
            boolean r9 = r8 instanceof java.net.SocketTimeoutException
            if (r9 != 0) goto L_0x00ec
            boolean r9 = r8 instanceof java.util.concurrent.TimeoutException
            if (r9 == 0) goto L_0x00af
            goto L_0x00ec
        L_0x00af:
            boolean r9 = r8 instanceof java.net.UnknownHostException
            if (r9 == 0) goto L_0x00c3
            hp.c r9 = new hp.c
            hp.c$a r10 = hp.C11377c.a.NO_NETWORK
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L_0x00bf
            java.lang.String r8 = "Unknown host exception, but throwable message was null"
        L_0x00bf:
            r9.<init>(r10, r8)
            goto L_0x00fb
        L_0x00c3:
            hp.c r9 = new hp.c
            hp.c$a r10 = hp.C11377c.a.UNKNOWN
            java.lang.Throwable r11 = r8.getCause()
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown error occurred during network call:\n "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = " \n "
            r0.append(r11)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r10, r8)
            goto L_0x00fb
        L_0x00ec:
            hp.c r9 = new hp.c
            hp.c$a r10 = hp.C11377c.a.TIMEOUT
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L_0x00f8
            java.lang.String r8 = "Timeout exception, but throwable message was null"
        L_0x00f8:
            r9.<init>(r10, r8)
        L_0x00fb:
            throw r9
        L_0x00fc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.e.c(java.lang.String, java.lang.String, int, dI.e):java.lang.Object");
    }
}
