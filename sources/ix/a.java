package Ix;

import D4.M;
import Gx.a;
import Hx.g;
import TJ.C16532g;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 $2\u00020\u0001:\u00014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010H@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H@¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H@¢\u0006\u0004\b$\u0010%J*\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0013H@¢\u0006\u0004\b)\u0010\"J(\u0010,\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H@¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020\u0013H@¢\u0006\u0004\b0\u00101J\"\u00103\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0013H@¢\u0006\u0004\b3\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015078\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010;¨\u0006="}, d2 = {"LIx/a;", "LGx/a;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;", "purchaseHistoryRemoteDataSource", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/b;", "customerReturnsRemoteDataSource", "<init>", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;Lcom/ingka/ikea/purchasehistorydata/impl/data/network/b;)V", "LTJ/g;", "LD4/M;", "LHx/d;", "h", "()LTJ/g;", "LXH/N;", "k", "()V", "LXH/x;", "m", "(LdI/e;)Ljava/lang/Object;", "", "id", "LHx/c;", "j", "(Ljava/lang/String;)LTJ/g;", "i", "(Ljava/lang/String;)LHx/c;", "LHx/f;", "type", "l", "(LHx/f;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "orderId", "cancelToken", "reasonCode", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "liteId", "e", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "rescheduleToken", "deliveryNumber", "LHx/g;", "d", "LGx/a$a;", "timeWindow", "g", "(Ljava/lang/String;Ljava/lang/String;LGx/a$a;LdI/e;)Ljava/lang/Object;", "purchaseId", "LGx/b;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "customerId", "f", "a", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/b;", "LNp/a;", "LNp/a;", "cache", "LKx/b;", "LKx/b;", "pagingDataManager", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Gx.a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2680a f110967e = new C2680a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f110968f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final com.ingka.ikea.purchasehistorydata.impl.data.network.e f110969a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ingka.ikea.purchasehistorydata.impl.data.network.b f110970b;

    /* renamed from: c  reason: collision with root package name */
    private final Np.a<String, Hx.c> f110971c = new Np.a<>(3);

    /* renamed from: d  reason: collision with root package name */
    private final Kx.b f110972d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIx/a$a;", "", "<init>", "()V", "", "PURCHASE_DETAILS_CACHE_MAX_SIZE", "I", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ix.a$a  reason: collision with other inner class name */
    public static final class C2680a {
        public /* synthetic */ C2680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2680a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f110973a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                Hx.f[] r0 = Hx.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hx.f r1 = Hx.f.RETURN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Hx.f r1 = Hx.f.RECEIPT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Hx.f r1 = Hx.f.ORDER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Hx.f r1 = Hx.f.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f110973a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ix.a.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.PurchaseHistoryRepositoryImpl", f = "PurchaseHistoryRepositoryImpl.kt", l = {88}, m = "findOrder")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f110974c;

        /* renamed from: d  reason: collision with root package name */
        Object f110975d;

        /* renamed from: e  reason: collision with root package name */
        Object f110976e;

        /* renamed from: f  reason: collision with root package name */
        Object f110977f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f110978g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f110979h;

        /* renamed from: i  reason: collision with root package name */
        int f110980i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f110979h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f110978g = obj;
            this.f110980i |= Integer.MIN_VALUE;
            return this.f110979h.e((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.PurchaseHistoryRepositoryImpl", f = "PurchaseHistoryRepositoryImpl.kt", l = {38}, m = "getLatestPurchase-IoAF18A")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f110981c;

        /* renamed from: d  reason: collision with root package name */
        Object f110982d;

        /* renamed from: e  reason: collision with root package name */
        Object f110983e;

        /* renamed from: f  reason: collision with root package name */
        Object f110984f;

        /* renamed from: g  reason: collision with root package name */
        int f110985g;

        /* renamed from: h  reason: collision with root package name */
        int f110986h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f110987i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f110988j;

        /* renamed from: k  reason: collision with root package name */
        int f110989k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f110988j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f110987i = obj;
            this.f110989k |= Integer.MIN_VALUE;
            Object m10 = this.f110988j.m(this);
            return m10 == C17187b.f() ? m10 : x.a(m10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.PurchaseHistoryRepositoryImpl", f = "PurchaseHistoryRepositoryImpl.kt", l = {52, 58, 66}, m = "getPurchaseDetails")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f110990c;

        /* renamed from: d  reason: collision with root package name */
        Object f110991d;

        /* renamed from: e  reason: collision with root package name */
        Object f110992e;

        /* renamed from: f  reason: collision with root package name */
        Object f110993f;

        /* renamed from: g  reason: collision with root package name */
        Object f110994g;

        /* renamed from: h  reason: collision with root package name */
        int f110995h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f110996i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f110997j;

        /* renamed from: k  reason: collision with root package name */
        int f110998k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f110997j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f110996i = obj;
            this.f110998k |= Integer.MIN_VALUE;
            return this.f110997j.l((Hx.f) null, (String) null, this);
        }
    }

    public a(com.ingka.ikea.purchasehistorydata.impl.data.network.e eVar, com.ingka.ikea.purchasehistorydata.impl.data.network.b bVar) {
        C17542s.j(eVar, "purchaseHistoryRemoteDataSource");
        C17542s.j(bVar, "customerReturnsRemoteDataSource");
        this.f110969a = eVar;
        this.f110970b = bVar;
        this.f110972d = new Kx.b(eVar);
    }

    public Object b(String str, String str2, String str3, C17164e<? super C16807N> eVar) {
        Object b10 = this.f110969a.b(str, str2, str3, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public Object c(String str, C17164e<? super Gx.b> eVar) {
        return this.f110970b.c(str, eVar);
    }

    public Object d(String str, String str2, String str3, C17164e<? super g> eVar) {
        return this.f110969a.d(str, str2, str3, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.String r6, java.lang.String r7, dI.C17164e<? super Hx.c> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Ix.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Ix.a$c r0 = (Ix.a.c) r0
            int r1 = r0.f110980i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f110980i = r1
            goto L_0x0018
        L_0x0013:
            Ix.a$c r0 = new Ix.a$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f110978g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f110980i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f110977f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f110976e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f110975d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f110974c
            Ix.a r7 = (Ix.a) r7
            XH.y.b(r1)
            goto L_0x0058
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            com.ingka.ikea.purchasehistorydata.impl.data.network.e r1 = r5.f110969a
            r0.f110974c = r5
            r0.f110975d = r6
            r0.f110976e = r7
            r0.f110977f = r8
            r0.f110980i = r4
            java.lang.Object r1 = r1.e(r6, r7, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            r7 = r5
        L_0x0058:
            Hx.c r1 = (Hx.c) r1
            Np.a<java.lang.String, Hx.c> r7 = r7.f110971c
            r7.e(r6, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ix.a.e(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public Object f(String str, String str2, C17164e<? super Gx.b> eVar) {
        return this.f110970b.f(str, str2, eVar);
    }

    public Object g(String str, String str2, a.C2656a aVar, C17164e<? super C16807N> eVar) {
        Object g10 = this.f110969a.g(str, str2, aVar, eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public C16532g<M<Hx.d>> h() {
        return this.f110972d.c();
    }

    public Hx.c i(String str) {
        C17542s.j(str, "id");
        return this.f110971c.b(str);
    }

    public C16532g<Hx.c> j(String str) {
        C17542s.j(str, "id");
        return this.f110971c.d(str);
    }

    public void k() {
        this.f110972d.b().a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object l(Hx.f r8, java.lang.String r9, dI.C17164e<? super Hx.c> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof Ix.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Ix.a$e r0 = (Ix.a.e) r0
            int r1 = r0.f110998k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f110998k = r1
            goto L_0x0018
        L_0x0013:
            Ix.a$e r0 = new Ix.a$e
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f110996i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f110998k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x007e
            if (r3 == r6) goto L_0x0065
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            java.lang.Object r8 = r0.f110994g
            Hx.f r8 = (Hx.f) r8
            java.lang.Object r8 = r0.f110993f
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f110992e
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f110991d
            Hx.f r8 = (Hx.f) r8
            java.lang.Object r8 = r0.f110990c
            Ix.a r8 = (Ix.a) r8
            XH.y.b(r1)
            goto L_0x00b1
        L_0x0044:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004c:
            java.lang.Object r8 = r0.f110994g
            Hx.f r8 = (Hx.f) r8
            java.lang.Object r8 = r0.f110993f
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f110992e
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f110991d
            Hx.f r8 = (Hx.f) r8
            java.lang.Object r8 = r0.f110990c
            Ix.a r8 = (Ix.a) r8
            XH.y.b(r1)
            goto L_0x00cc
        L_0x0065:
            java.lang.Object r8 = r0.f110994g
            Hx.f r8 = (Hx.f) r8
            java.lang.Object r8 = r0.f110993f
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f110992e
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.f110991d
            Hx.f r8 = (Hx.f) r8
            java.lang.Object r8 = r0.f110990c
            Ix.a r8 = (Ix.a) r8
            XH.y.b(r1)
            goto L_0x00e7
        L_0x007e:
            XH.y.b(r1)
            int[] r1 = Ix.a.b.f110973a
            int r3 = r8.ordinal()
            r1 = r1[r3]
            if (r1 == r6) goto L_0x00cf
            if (r1 == r5) goto L_0x00b4
            if (r1 == r4) goto L_0x0099
            r3 = 4
            if (r1 != r3) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            XH.t r8 = new XH.t
            r8.<init>()
            throw r8
        L_0x0099:
            com.ingka.ikea.purchasehistorydata.impl.data.network.e r3 = r7.f110969a
            r0.f110990c = r7
            r0.f110991d = r8
            r0.f110992e = r9
            r0.f110993f = r10
            r0.f110994g = r8
            r0.f110995h = r1
            r0.f110998k = r4
            java.lang.Object r1 = r3.c(r9, r0)
            if (r1 != r2) goto L_0x00b0
            return r2
        L_0x00b0:
            r8 = r7
        L_0x00b1:
            Hx.c r1 = (Hx.c) r1
            goto L_0x00e9
        L_0x00b4:
            com.ingka.ikea.purchasehistorydata.impl.data.network.e r3 = r7.f110969a
            r0.f110990c = r7
            r0.f110991d = r8
            r0.f110992e = r9
            r0.f110993f = r10
            r0.f110994g = r8
            r0.f110995h = r1
            r0.f110998k = r5
            java.lang.Object r1 = r3.h(r9, r0)
            if (r1 != r2) goto L_0x00cb
            return r2
        L_0x00cb:
            r8 = r7
        L_0x00cc:
            Hx.c r1 = (Hx.c) r1
            goto L_0x00e9
        L_0x00cf:
            com.ingka.ikea.purchasehistorydata.impl.data.network.e r3 = r7.f110969a
            r0.f110990c = r7
            r0.f110991d = r8
            r0.f110992e = r9
            r0.f110993f = r10
            r0.f110994g = r8
            r0.f110995h = r1
            r0.f110998k = r6
            java.lang.Object r1 = r3.f(r9, r0)
            if (r1 != r2) goto L_0x00e6
            return r2
        L_0x00e6:
            r8 = r7
        L_0x00e7:
            Hx.c r1 = (Hx.c) r1
        L_0x00e9:
            Np.a<java.lang.String, Hx.c> r8 = r8.f110971c
            r8.e(r9, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ix.a.l(Hx.f, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m(dI.C17164e<? super XH.x<Hx.d>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Ix.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Ix.a$d r0 = (Ix.a.d) r0
            int r1 = r0.f110989k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f110989k = r1
            goto L_0x0018
        L_0x0013:
            Ix.a$d r0 = new Ix.a$d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f110987i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f110989k
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f110984f
            Ix.a r6 = (Ix.a) r6
            java.lang.Object r6 = r0.f110983e
            Ix.a r6 = (Ix.a) r6
            java.lang.Object r6 = r0.f110982d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f110981c
            Ix.a r6 = (Ix.a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0062
        L_0x0039:
            r6 = move-exception
            goto L_0x006f
        L_0x003b:
            r6 = move-exception
            goto L_0x007a
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            com.ingka.ikea.purchasehistorydata.impl.data.network.e r1 = r5.f110969a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f110981c = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f110982d = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f110983e = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f110984f = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6 = 0
            r0.f110985g = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f110986h = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f110989k = r4     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r1 = r1.a(r6, r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            java.util.List r1 = (java.util.List) r1     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r6 = YH.C16877v.y0(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            Hx.d r6 = (Hx.d) r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0079
        L_0x006f:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0079:
            return r6
        L_0x007a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ix.a.m(dI.e):java.lang.Object");
    }
}
