package qo;

import Nn.w;
import Nn.x;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JL\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HB¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqo/d;", "Lqo/c;", "LNn/x;", "checkoutRepository", "Lqo/a;", "getGooglePaymentOptionUseCase", "<init>", "(LNn/x;Lqo/a;)V", "", "checkoutId", "shopperResultUrlString", "", "Ltv/a;", "allowedCardAuthMethods", "Ltv/b;", "allowedCardNetworks", "LNn/w;", "googlePayTaxInfo", "LXH/x;", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LNn/w;LdI/e;)Ljava/lang/Object;", "LNn/x;", "b", "Lqo/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final x f101905a;

    /* renamed from: b  reason: collision with root package name */
    private final C11801a f101906b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.checkout.impl.payment.usecase.InitiateExpressPaymentUseCaseImpl", f = "InitiateExpressPaymentUseCase.kt", l = {48, 53}, m = "invoke-hUnOzRk")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f101907c;

        /* renamed from: d  reason: collision with root package name */
        Object f101908d;

        /* renamed from: e  reason: collision with root package name */
        Object f101909e;

        /* renamed from: f  reason: collision with root package name */
        Object f101910f;

        /* renamed from: g  reason: collision with root package name */
        Object f101911g;

        /* renamed from: h  reason: collision with root package name */
        Object f101912h;

        /* renamed from: i  reason: collision with root package name */
        Object f101913i;

        /* renamed from: j  reason: collision with root package name */
        Object f101914j;

        /* renamed from: k  reason: collision with root package name */
        Object f101915k;

        /* renamed from: l  reason: collision with root package name */
        Object f101916l;

        /* renamed from: m  reason: collision with root package name */
        int f101917m;

        /* renamed from: n  reason: collision with root package name */
        int f101918n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f101919o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d f101920p;

        /* renamed from: q  reason: collision with root package name */
        int f101921q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f101920p = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101919o = obj;
            this.f101921q |= Integer.MIN_VALUE;
            Object a10 = this.f101920p.a((String) null, (String) null, (List<? extends C11996a>) null, (List<? extends C11997b>) null, (w) null, this);
            return a10 == C17187b.f() ? a10 : XH.x.a(a10);
        }
    }

    public d(x xVar, C11801a aVar) {
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar, "getGooglePaymentOptionUseCase");
        this.f101905a = xVar;
        this.f101906b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b A[Catch:{ CancellationException -> 0x0064, all -> 0x0061 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0125 A[Catch:{ CancellationException -> 0x0064, all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0144 A[Catch:{ CancellationException -> 0x0064, all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c0 A[EDGE_INSN: B:67:0x01c0->B:60:0x01c0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r17, java.lang.String r18, java.util.List<? extends tv.C11996a> r19, java.util.List<? extends tv.C11997b> r20, Nn.w r21, dI.C17164e<? super XH.x<XH.C16807N>> r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            boolean r6 = r5 instanceof qo.d.a
            if (r6 == 0) goto L_0x001f
            r6 = r5
            qo.d$a r6 = (qo.d.a) r6
            int r7 = r6.f101921q
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f101921q = r7
            goto L_0x0024
        L_0x001f:
            qo.d$a r6 = new qo.d$a
            r6.<init>(r1, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f101919o
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f101921q
            r11 = 1
            r12 = 2
            if (r9 == 0) goto L_0x00a5
            if (r9 == r11) goto L_0x006f
            if (r9 != r12) goto L_0x0067
            java.lang.Object r0 = r6.f101916l
            Nn.D$c r0 = (Nn.D.c) r0
            java.lang.Object r0 = r6.f101915k
            qo.d r0 = (qo.d) r0
            java.lang.Object r2 = r6.f101914j
            qo.d r2 = (qo.d) r2
            java.lang.Object r2 = r6.f101913i
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r6.f101912h
            Nn.w r2 = (Nn.w) r2
            java.lang.Object r2 = r6.f101911g
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r6.f101910f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r6.f101909e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f101908d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.f101907c
            qo.d r2 = (qo.d) r2
            XH.y.b(r7)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            goto L_0x010c
        L_0x0061:
            r0 = move-exception
            goto L_0x01c7
        L_0x0064:
            r0 = move-exception
            goto L_0x01d2
        L_0x0067:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006f:
            int r0 = r6.f101918n
            int r2 = r6.f101917m
            java.lang.Object r3 = r6.f101916l
            Nn.D$c r3 = (Nn.D.c) r3
            java.lang.Object r4 = r6.f101915k
            qo.d r4 = (qo.d) r4
            java.lang.Object r5 = r6.f101914j
            qo.d r5 = (qo.d) r5
            java.lang.Object r9 = r6.f101913i
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r13 = r6.f101912h
            Nn.w r13 = (Nn.w) r13
            java.lang.Object r14 = r6.f101911g
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r6.f101910f
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r12 = r6.f101909e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r6.f101908d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r6.f101907c
            qo.d r10 = (qo.d) r10
            XH.y.b(r7)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r4
            r4 = r10
            r10 = r12
            goto L_0x00e8
        L_0x00a5:
            XH.y.b(r7)
            XH.x$a r7 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            qo.a r7 = r1.f101906b     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            Nn.D$c r7 = r7.a(r2, r3)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r4 == 0) goto L_0x00b7
            Nn.x r9 = r1.f101905a     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r9.r(r0, r4)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
        L_0x00b7:
            Nn.x r9 = r1.f101905a     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101907c = r1     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101908d = r0     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r10 = r18
            r6.f101909e = r10     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101910f = r2     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101911g = r3     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101912h = r4     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101913i = r5     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101914j = r1     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101915k = r1     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101916l = r7     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r11 = 0
            r6.f101917m = r11     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101918n = r11     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r11 = 1
            r6.f101921q = r11     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.Object r9 = r9.j(r0, r7, r6)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r9 != r8) goto L_0x00de
            return r8
        L_0x00de:
            r11 = r0
            r0 = r1
            r15 = r2
            r14 = r3
            r13 = r4
            r9 = r5
            r2 = 0
            r3 = 0
            r4 = r0
            r5 = r4
        L_0x00e8:
            Nn.x r12 = r0.f101905a     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101907c = r4     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101908d = r11     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101909e = r10     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101910f = r15     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101911g = r14     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101912h = r13     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101913i = r9     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101914j = r5     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101915k = r0     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101916l = r7     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101917m = r3     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6.f101918n = r2     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r2 = 2
            r6.f101921q = r2     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.Object r2 = r12.a(r11, r10, r6)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r2 != r8) goto L_0x010c
            return r8
        L_0x010c:
            qv.e r2 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            qv.d r3 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.util.List r3 = r3.a()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r4.<init>()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
        L_0x011f:
            boolean r5 = r3.hasNext()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r5 == 0) goto L_0x0137
            java.lang.Object r5 = r3.next()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r6 = r5
            qv.b r6 = (qv.C11819b) r6     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r7 = 0
            boolean r6 = r6.b(r2, r7)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r6 == 0) goto L_0x011f
            r4.add(r5)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            goto L_0x011f
        L_0x0137:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x013e:
            boolean r7 = r3.hasNext()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r7 == 0) goto L_0x01c0
            java.lang.Object r7 = r3.next()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            qv.b r7 = (qv.C11819b) r7     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r8 = 0
            if (r5 != 0) goto L_0x015a
            java.lang.String r5 = "Initiate express flow done"
            java.lang.String r5 = qv.C11818a.a(r5, r8)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r5 != 0) goto L_0x0156
            goto L_0x01c0
        L_0x0156:
            java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
        L_0x015a:
            if (r6 != 0) goto L_0x01ac
            java.lang.Class r6 = r0.getClass()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.String r6 = r6.getName()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            kotlin.jvm.internal.C17542s.g(r6)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r9 = 36
            r10 = 2
            java.lang.String r9 = HJ.C15854t.s1(r6, r9, r4, r10, r4)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r11 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r11, r4, r10, r4)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            int r11 = r9.length()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r11 != 0) goto L_0x017b
            goto L_0x0181
        L_0x017b:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r9, r6)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
        L_0x0181:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.String r9 = r9.getName()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.String r11 = "main"
            r12 = 1
            boolean r9 = HJ.C15854t.b0(r9, r11, r12)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            if (r9 == 0) goto L_0x0195
            java.lang.String r9 = "m"
            goto L_0x0197
        L_0x0195:
            java.lang.String r9 = "b"
        L_0x0197:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r11.<init>()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r11.append(r9)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.String r9 = "|"
            r11.append(r9)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            r11.append(r6)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.String r6 = r11.toString()     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            goto L_0x01ae
        L_0x01ac:
            r10 = 2
            r12 = 1
        L_0x01ae:
            r9 = 0
            r17 = r7
            r18 = r2
            r19 = r6
            r20 = r9
            r21 = r8
            r22 = r5
            r17.a(r18, r19, r20, r21, r22)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            goto L_0x013e
        L_0x01c0:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0064, all -> 0x0061 }
            goto L_0x01d1
        L_0x01c7:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x01d1:
            return r0
        L_0x01d2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.d.a(java.lang.String, java.lang.String, java.util.List, java.util.List, Nn.w, dI.e):java.lang.Object");
    }
}
