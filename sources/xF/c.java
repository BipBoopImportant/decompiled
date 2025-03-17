package Xf;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LXf/c;", "LXf/b;", "LXf/a;", "remoteShoppingEndpoint", "<init>", "(LXf/a;)V", "Lcom/ingka/ikea/app/cart/impl/data/b;", "a", "(LdI/e;)Ljava/lang/Object;", "LXf/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f64799a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.impl.data.RemoteShoppingRemoteDataSourceImpl", f = "RemoteShoppingRemoteDataSource.kt", l = {21}, m = "fetchRemoteSales")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f64800c;

        /* renamed from: d  reason: collision with root package name */
        Object f64801d;

        /* renamed from: e  reason: collision with root package name */
        Object f64802e;

        /* renamed from: f  reason: collision with root package name */
        Object f64803f;

        /* renamed from: g  reason: collision with root package name */
        int f64804g;

        /* renamed from: h  reason: collision with root package name */
        int f64805h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f64806i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f64807j;

        /* renamed from: k  reason: collision with root package name */
        int f64808k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f64807j = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f64806i = obj;
            this.f64808k |= Integer.MIN_VALUE;
            return this.f64807j.a(this);
        }
    }

    public c(a aVar) {
        C17542s.j(aVar, "remoteShoppingEndpoint");
        this.f64799a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0036, B:17:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[ExcHandler: CancellationException (r14v6 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super com.ingka.ikea.app.cart.impl.data.b> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof Xf.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Xf.c$a r0 = (Xf.c.a) r0
            int r1 = r0.f64808k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f64808k = r1
            goto L_0x0018
        L_0x0013:
            Xf.c$a r0 = new Xf.c$a
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f64806i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f64808k
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r5) goto L_0x003f
            java.lang.Object r14 = r0.f64803f
            Xf.c r14 = (Xf.c) r14
            java.lang.Object r14 = r0.f64802e
            Xf.c r14 = (Xf.c) r14
            java.lang.Object r14 = r0.f64801d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f64800c
            Xf.c r14 = (Xf.c) r14
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            goto L_0x0064
        L_0x003a:
            r0 = move-exception
            goto L_0x0071
        L_0x003c:
            r14 = move-exception
            goto L_0x012f
        L_0x003f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0047:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            Xf.a r1 = r13.f64799a     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64800c = r13     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64801d = r14     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64802e = r13     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64803f = r13     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64804g = r4     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64805h = r4     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            r0.f64808k = r5     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            java.lang.Object r1 = r1.a(r0)     // Catch:{ CancellationException -> 0x003c, all -> 0x006f }
            if (r1 != r2) goto L_0x0063
            return r2
        L_0x0063:
            r14 = r13
        L_0x0064:
            com.ingka.ikea.app.cart.impl.data.RemoteShoppingRemote r1 = (com.ingka.ikea.app.cart.impl.data.RemoteShoppingRemote) r1     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            com.ingka.ikea.app.cart.impl.data.b r0 = r1.toLocal()     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x003c, all -> 0x003a }
            goto L_0x007b
        L_0x006f:
            r0 = move-exception
            r14 = r13
        L_0x0071:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x007b:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x0085
            com.ingka.ikea.app.cart.impl.data.b r0 = (com.ingka.ikea.app.cart.impl.data.b) r0
            goto L_0x012e
        L_0x0085:
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0098:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00af
            java.lang.Object r6 = r2.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r0, r4)
            if (r7 == 0) goto L_0x0098
            r3.add(r6)
            goto L_0x0098
        L_0x00af:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r4 = r3
            r6 = r4
        L_0x00b6:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x012d
            java.lang.Object r7 = r2.next()
            qv.b r7 = (qv.C11819b) r7
            if (r4 != 0) goto L_0x00d1
            java.lang.String r4 = "Failed to fetch remote sales details"
            java.lang.String r4 = qv.C11818a.a(r4, r1)
            if (r4 != 0) goto L_0x00cd
            goto L_0x012d
        L_0x00cd:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00d1:
            if (r6 != 0) goto L_0x0121
            java.lang.Class r6 = r14.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            r9 = 2
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r3, r9, r3)
            r10 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r10, r3, r9, r3)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x00f8:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r5)
            if (r8 == 0) goto L_0x010b
            java.lang.String r8 = "m"
            goto L_0x010d
        L_0x010b:
            java.lang.String r8 = "b"
        L_0x010d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0121:
            r12 = r6
            r9 = 0
            r6 = r7
            r7 = r0
            r8 = r12
            r10 = r1
            r11 = r4
            r6.a(r7, r8, r9, r10, r11)
            r6 = r12
            goto L_0x00b6
        L_0x012d:
            r0 = r3
        L_0x012e:
            return r0
        L_0x012f:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.c.a(dI.e):java.lang.Object");
    }
}
