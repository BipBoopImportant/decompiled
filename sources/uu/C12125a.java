package uu;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import wu.C12303a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Luu/a;", "", "Lwu/a;", "endpoint", "<init>", "(Lwu/a;)V", "", "storeId", "productId", "Lyu/b;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/x;", "Lyu/a;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lwu/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uu.a  reason: case insensitive filesystem */
public final class C12125a {

    /* renamed from: a  reason: collision with root package name */
    private final C12303a f104407a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.wayfinding.datalayer.impl.WayfindingRemoteDataSource", f = "WayfindingRemoteDataSource.kt", l = {19}, m = "fetchProductLocation")
    /* renamed from: uu.a$a  reason: collision with other inner class name */
    static final class C2484a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f104408c;

        /* renamed from: d  reason: collision with root package name */
        Object f104409d;

        /* renamed from: e  reason: collision with root package name */
        Object f104410e;

        /* renamed from: f  reason: collision with root package name */
        Object f104411f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f104412g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C12125a f104413h;

        /* renamed from: i  reason: collision with root package name */
        int f104414i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2484a(C12125a aVar, C17164e<? super C2484a> eVar) {
            super(eVar);
            this.f104413h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f104412g = obj;
            this.f104414i |= Integer.MIN_VALUE;
            return this.f104413h.a((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.wayfinding.datalayer.impl.WayfindingRemoteDataSource", f = "WayfindingRemoteDataSource.kt", l = {27}, m = "fetchWayfindingDetails-gIAlu-s")
    /* renamed from: uu.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f104415c;

        /* renamed from: d  reason: collision with root package name */
        Object f104416d;

        /* renamed from: e  reason: collision with root package name */
        Object f104417e;

        /* renamed from: f  reason: collision with root package name */
        Object f104418f;

        /* renamed from: g  reason: collision with root package name */
        Object f104419g;

        /* renamed from: h  reason: collision with root package name */
        int f104420h;

        /* renamed from: i  reason: collision with root package name */
        int f104421i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f104422j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C12125a f104423k;

        /* renamed from: l  reason: collision with root package name */
        int f104424l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12125a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f104423k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f104422j = obj;
            this.f104424l |= Integer.MIN_VALUE;
            Object b10 = this.f104423k.b((String) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public C12125a(C12303a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f104407a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, dI.C17164e<? super yu.C12517b> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof uu.C12125a.C2484a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            uu.a$a r0 = (uu.C12125a.C2484a) r0
            int r1 = r0.f104414i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f104414i = r1
            goto L_0x0018
        L_0x0013:
            uu.a$a r0 = new uu.a$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f104412g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f104414i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f104411f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f104410e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f104409d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f104408c
            uu.a r6 = (uu.C12125a) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            wu.a r1 = r5.f104407a
            r0.f104408c = r5
            r0.f104409d = r6
            r0.f104410e = r7
            r0.f104411f = r8
            r0.f104414i = r4
            java.lang.Object r1 = r1.a(r6, r7, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote r1 = (com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.WayfindingProductLocationRemote) r1
            yu.b r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.C12125a.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, dI.C17164e<? super XH.x<yu.C12516a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uu.C12125a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uu.a$b r0 = (uu.C12125a.b) r0
            int r1 = r0.f104424l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f104424l = r1
            goto L_0x0018
        L_0x0013:
            uu.a$b r0 = new uu.a$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f104422j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f104424l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f104419g
            uu.a r6 = (uu.C12125a) r6
            java.lang.Object r6 = r0.f104418f
            uu.a r6 = (uu.C12125a) r6
            java.lang.Object r6 = r0.f104417e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f104416d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f104415c
            uu.a r6 = (uu.C12125a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0068
        L_0x003d:
            r6 = move-exception
            goto L_0x0073
        L_0x003f:
            r6 = move-exception
            goto L_0x007e
        L_0x0041:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            wu.a r1 = r5.f104407a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104415c = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104416d = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104417e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104418f = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104419g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f104420h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104421i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f104424l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r1 = r1.b(r6, r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.StoreWayfindingDetailsRemote r1 = (com.ingka.ikea.instore.wayfinding.datalayer.impl.network.model.StoreWayfindingDetailsRemote) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            yu.a r6 = r1.a()     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x007d
        L_0x0073:
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x007d:
            return r6
        L_0x007e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.C12125a.b(java.lang.String, dI.e):java.lang.Object");
    }
}
