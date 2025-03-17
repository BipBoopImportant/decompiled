package Kx;

import D4.P;
import Hx.d;
import QJ.C16310i;
import QJ.Q;
import XH.C16807N;
import com.ingka.ikea.purchasehistorydata.impl.data.network.e;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH@¢\u0006\u0004\b\u0011\u0010\fJ%\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"LKx/c;", "LD4/P;", "", "LHx/d;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;", "purchasesSource", "<init>", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;)V", "LD4/P$a;", "params", "LD4/P$b;", "l", "(LD4/P$a;LdI/e;)Ljava/lang/Object;", "key", "total", "j", "(II)Ljava/lang/Integer;", "f", "LD4/Q;", "state", "k", "(LD4/Q;)Ljava/lang/Integer;", "b", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;", "c", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends P<Integer, d> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f111769c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f111770d = 8;

    /* renamed from: b  reason: collision with root package name */
    private final e f111771b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKx/c$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LD4/P$b;", "", "LHx/d;", "<anonymous>", "(LQJ/Q;)LD4/P$b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.paging.PurchaseHistoryPagingSource$load$2", f = "PurchaseHistoryPagingSource.kt", l = {25}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super P.b<Integer, d>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f111772c;

        /* renamed from: d  reason: collision with root package name */
        Object f111773d;

        /* renamed from: e  reason: collision with root package name */
        Object f111774e;

        /* renamed from: f  reason: collision with root package name */
        Object f111775f;

        /* renamed from: g  reason: collision with root package name */
        int f111776g;

        /* renamed from: h  reason: collision with root package name */
        int f111777h;

        /* renamed from: i  reason: collision with root package name */
        int f111778i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f111779j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f111780k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ P.a<Integer> f111781l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, P.a<Integer> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f111780k = cVar;
            this.f111781l = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f111780k, this.f111781l, eVar);
            bVar.f111779j = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super P.b<Integer, d>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
            r13 = r0;
            r0 = r15;
            r15 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
            throw r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            r15 = move-exception;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0020, B:11:0x003c] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0026 A[ExcHandler: CancellationException (r15v15 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:4:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f111778i
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 != r3) goto L_0x0029
                java.lang.Object r0 = r14.f111775f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r14.f111774e
                D4.P$a r0 = (D4.P.a) r0
                java.lang.Object r0 = r14.f111773d
                Kx.c r0 = (Kx.c) r0
                java.lang.Object r0 = r14.f111772c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r14.f111779j
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r15)     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                goto L_0x0057
            L_0x0024:
                r15 = move-exception
                goto L_0x0062
            L_0x0026:
                r15 = move-exception
                goto L_0x0127
            L_0x0029:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0031:
                XH.y.b(r15)
                java.lang.Object r15 = r14.f111779j
                QJ.Q r15 = (QJ.Q) r15
                Kx.c r1 = r14.f111780k
                D4.P$a<java.lang.Integer> r4 = r14.f111781l
                XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111779j = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111772c = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111773d = r1     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111774e = r4     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111775f = r15     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111776g = r2     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111777h = r2     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                r14.f111778i = r3     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                java.lang.Object r1 = r1.l(r4, r14)     // Catch:{ CancellationException -> 0x0026, all -> 0x005e }
                if (r1 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r0 = r15
                r15 = r1
            L_0x0057:
                D4.P$b r15 = (D4.P.b) r15     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                java.lang.Object r15 = XH.x.b(r15)     // Catch:{ CancellationException -> 0x0026, all -> 0x0024 }
                goto L_0x006c
            L_0x005e:
                r0 = move-exception
                r13 = r0
                r0 = r15
                r15 = r13
            L_0x0062:
                XH.x$a r1 = XH.x.f139812b
                java.lang.Object r15 = XH.y.a(r15)
                java.lang.Object r15 = XH.x.b(r15)
            L_0x006c:
                java.lang.Throwable r1 = XH.x.e(r15)
                if (r1 != 0) goto L_0x0076
                D4.P$b r15 = (D4.P.b) r15
                goto L_0x0126
            L_0x0076:
                qv.e r15 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0089:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x00a0
                java.lang.Object r6 = r4.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r15, r2)
                if (r7 == 0) goto L_0x0089
                r5.add(r6)
                goto L_0x0089
            L_0x00a0:
                java.util.Iterator r2 = r5.iterator()
                r10 = 0
                r4 = r10
                r5 = r4
            L_0x00a7:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0121
                java.lang.Object r6 = r2.next()
                qv.b r6 = (qv.C11819b) r6
                if (r4 != 0) goto L_0x00c3
                java.lang.String r4 = "Error purchase history page"
                java.lang.String r4 = qv.C11818a.a(r4, r1)
                if (r4 != 0) goto L_0x00bf
                goto L_0x0121
            L_0x00bf:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x00c3:
                r11 = r4
                if (r5 != 0) goto L_0x0114
                java.lang.Class r4 = r0.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r10, r7, r10)
                r8 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r8, r10, r7, r10)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00e5
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00eb:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00fe
                java.lang.String r5 = "m"
                goto L_0x0100
            L_0x00fe:
                java.lang.String r5 = "b"
            L_0x0100:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x0114:
                r12 = r5
                r7 = 0
                r4 = r6
                r5 = r15
                r6 = r12
                r8 = r1
                r9 = r11
                r4.a(r5, r6, r7, r8, r9)
                r4 = r11
                r5 = r12
                goto L_0x00a7
            L_0x0121:
                D4.P$b$a r15 = new D4.P$b$a
                r15.<init>(r1)
            L_0x0126:
                return r15
            L_0x0127:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: Kx.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.purchasehistorydata.impl.data.paging.PurchaseHistoryPagingSource", f = "PurchaseHistoryPagingSource.kt", l = {40}, m = "loadPage")
    /* renamed from: Kx.c$c  reason: collision with other inner class name */
    static final class C2728c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f111782c;

        /* renamed from: d  reason: collision with root package name */
        Object f111783d;

        /* renamed from: e  reason: collision with root package name */
        Object f111784e;

        /* renamed from: f  reason: collision with root package name */
        int f111785f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f111786g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f111787h;

        /* renamed from: i  reason: collision with root package name */
        int f111788i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2728c(c cVar, C17164e<? super C2728c> eVar) {
            super(eVar);
            this.f111787h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111786g = obj;
            this.f111788i |= Integer.MIN_VALUE;
            return this.f111787h.l((P.a<Integer>) null, this);
        }
    }

    public c(e eVar) {
        C17542s.j(eVar, "purchasesSource");
        this.f111771b = eVar;
    }

    private final Integer j(int i10, int i11) {
        if (i11 > 0) {
            return Integer.valueOf(i10 + 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(D4.P.a<java.lang.Integer> r7, dI.C17164e<? super D4.P.b<java.lang.Integer, Hx.d>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Kx.c.C2728c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Kx.c$c r0 = (Kx.c.C2728c) r0
            int r1 = r0.f111788i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111788i = r1
            goto L_0x0018
        L_0x0013:
            Kx.c$c r0 = new Kx.c$c
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f111786g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111788i
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            int r7 = r0.f111785f
            java.lang.Object r8 = r0.f111784e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f111783d
            D4.P$a r8 = (D4.P.a) r8
            java.lang.Object r8 = r0.f111782c
            Kx.c r8 = (Kx.c) r8
            XH.y.b(r1)
            goto L_0x0065
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            XH.y.b(r1)
            java.lang.Object r1 = r7.a()
            if (r1 == 0) goto L_0x0076
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.ingka.ikea.purchasehistorydata.impl.data.network.e r3 = r6.f111771b
            r0.f111782c = r6
            r0.f111783d = r7
            r0.f111784e = r8
            r0.f111785f = r1
            r0.f111788i = r4
            java.lang.Object r7 = r3.a(r1, r0)
            if (r7 != r2) goto L_0x0061
            return r2
        L_0x0061:
            r8 = r6
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x0065:
            java.util.List r1 = (java.util.List) r1
            D4.P$b$b r0 = new D4.P$b$b
            int r2 = r1.size()
            java.lang.Integer r7 = r8.j(r7, r2)
            r8 = 0
            r0.<init>(r1, r8, r7)
            return r0
        L_0x0076:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Kx.c.l(D4.P$a, dI.e):java.lang.Object");
    }

    public Object f(P.a<Integer> aVar, C17164e<? super P.b<Integer, d>> eVar) {
        return C16310i.g(eVar.getContext(), new b(this, aVar, (C17164e<? super b>) null), eVar);
    }

    /* renamed from: k */
    public Integer d(D4.Q<Integer, d> q10) {
        C17542s.j(q10, "state");
        Integer c10 = q10.c();
        if (c10 == null) {
            return null;
        }
        int intValue = c10.intValue();
        P.b.C0534b<Integer, d> b10 = q10.b(intValue);
        Integer p10 = b10 != null ? b10.p() : null;
        P.b.C0534b<Integer, d> b11 = q10.b(intValue);
        Integer m10 = b11 != null ? b11.m() : null;
        if (p10 != null) {
            return Integer.valueOf(p10.intValue() + 1);
        }
        if (m10 != null) {
            return Integer.valueOf(m10.intValue() - 1);
        }
        return null;
    }
}
