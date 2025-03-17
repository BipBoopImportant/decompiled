package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import Nn.C10806i;
import Nn.D;
import Nn.w;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\rH@¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH@¢\u0006\u0004\b\u001c\u0010\u0012J \u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH@¢\u0006\u0004\b\u001e\u0010\u0012J \u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH@¢\u0006\u0004\b!\u0010\u0012J \u0010#\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH@¢\u0006\u0004\b#\u0010\u0012J \u0010&\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H@¢\u0006\u0004\b&\u0010'J(\u0010+\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH@¢\u0006\u0004\b+\u0010,J \u0010.\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH@¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010/\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\rH@¢\u0006\u0004\b/\u0010\u0015J*\u00104\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000101H@¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00107¨\u00068"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/f;", "LSn/c;", "LQJ/M;", "defaultDispatcher", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint;", "paymentEndpoint", "<init>", "(LQJ/M;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint;)V", "LQL/x;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PrepaidResponse;", "LNn/h;", "o", "(LQL/x;)LNn/h;", "", "checkoutId", "serviceAreaId", "LSn/b;", "k", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LRn/f;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "paymentContextId", "", "LNn/D;", "h", "shopperResultUrl", "LSn/d;", "a", "paymentBrandName", "c", "externalSessionIopgId", "LXH/N;", "l", "externalSessionToken", "d", "", "usePayOnDelivery", "j", "(Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "cardNumber", "securityCode", "LRn/e;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "iopgId", "i", "b", "googlePayAddressJson", "LNn/w;", "googlePayTaxInfo", "LNn/i;", "f", "(Ljava/lang/String;Ljava/lang/String;LNn/w;LdI/e;)Ljava/lang/Object;", "LQJ/M;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements Sn.c {

    /* renamed from: a  reason: collision with root package name */
    private final M f93889a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final PaymentEndpoint f93890b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f93891a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.checkout.datalayer.impl.repo.network.e[] r0 = com.ingka.ikea.checkout.datalayer.impl.repo.network.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.checkout.datalayer.impl.repo.network.e r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.e.GIFTCARD_VALIDATION_ERROR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.e r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.e.GIFTCARD_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.e r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.e.PAYMENTCONTEXT_ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f93891a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$clearPaymentSession$2", f = "PaymentRemoteDataSourceImpl.kt", l = {243}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93892c;

        /* renamed from: d  reason: collision with root package name */
        Object f93893d;

        /* renamed from: e  reason: collision with root package name */
        Object f93894e;

        /* renamed from: f  reason: collision with root package name */
        Object f93895f;

        /* renamed from: g  reason: collision with root package name */
        Object f93896g;

        /* renamed from: h  reason: collision with root package name */
        Object f93897h;

        /* renamed from: i  reason: collision with root package name */
        Object f93898i;

        /* renamed from: j  reason: collision with root package name */
        Object f93899j;

        /* renamed from: k  reason: collision with root package name */
        int f93900k;

        /* renamed from: l  reason: collision with root package name */
        int f93901l;

        /* renamed from: m  reason: collision with root package name */
        int f93902m;

        /* renamed from: n  reason: collision with root package name */
        int f93903n;

        /* renamed from: o  reason: collision with root package name */
        int f93904o;

        /* renamed from: p  reason: collision with root package name */
        int f93905p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f93906q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f93907r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f93908s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f93907r = fVar;
            this.f93908s = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f93907r, this.f93908s, eVar);
            bVar.f93906q = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93905p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x004a
                if (r2 != r11) goto L_0x0042
                java.lang.Object r1 = r0.f93898i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93897h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93896g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93895f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93894e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f93893d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93892c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93906q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r23)
                r21 = r4
                r4 = r23
                goto L_0x0149
            L_0x0042:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004a:
                XH.y.b(r23)
                java.lang.Object r2 = r0.f93906q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0064:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x007b
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x0064
                r11.add(r8)
                goto L_0x0064
            L_0x007b:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r14 = r9
            L_0x0083:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x010f
                java.lang.Object r20 = r8.next()
                r16 = r20
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00a7
                java.lang.String r10 = "clearPaymentSession"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00a3
                r21 = r4
                r10 = r15
                r4 = r20
                goto L_0x0114
            L_0x00a3:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00a7:
                if (r14 != 0) goto L_0x00f5
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r21 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00ca
                goto L_0x00ce
            L_0x00ca:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00ce:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00df
                r4 = r5
                goto L_0x00e1
            L_0x00df:
                r4 = r21
            L_0x00e1:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r14 = r12.toString()
            L_0x00f3:
                r4 = r14
                goto L_0x00f8
            L_0x00f5:
                r21 = r4
                goto L_0x00f3
            L_0x00f8:
                r17 = 0
                r14 = r16
                r10 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r20
                r4 = r21
                r12 = 0
                goto L_0x0083
            L_0x010f:
                r21 = r4
                r10 = r15
                r4 = r16
            L_0x0114:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r12 = r0.f93907r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r12 = r12.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$DeletePaymentSessionBody r15 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$DeletePaymentSessionBody
                java.lang.String r13 = r0.f93908s
                r15.<init>(r13)
                r0.f93906q = r2
                r0.f93892c = r2
                r0.f93893d = r2
                r0.f93894e = r10
                r0.f93895f = r9
                r0.f93896g = r14
                r0.f93897h = r11
                r0.f93898i = r8
                r0.f93899j = r4
                r4 = 0
                r0.f93900k = r4
                r0.f93901l = r4
                r0.f93902m = r4
                r0.f93903n = r4
                r0.f93904o = r4
                r4 = 1
                r0.f93905p = r4
                java.lang.Object r4 = r12.h(r15, r0)
                if (r4 != r1) goto L_0x0148
                return r1
            L_0x0148:
                r1 = r2
            L_0x0149:
                QL.x r4 = (QL.x) r4
                boolean r2 = r4.e()
                if (r2 != 0) goto L_0x0203
                qv.e r2 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0164:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x017c
                java.lang.Object r9 = r4.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r2, r11)
                if (r10 == 0) goto L_0x0164
                r8.add(r9)
                goto L_0x0164
            L_0x017c:
                java.util.Iterator r4 = r8.iterator()
                r8 = 0
                r9 = 0
            L_0x0182:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x0200
                java.lang.Object r10 = r4.next()
                qv.b r10 = (qv.C11819b) r10
                r12 = 0
                if (r8 != 0) goto L_0x019d
                java.lang.String r8 = "Unsuccessful delete payment session"
                java.lang.String r8 = qv.C11818a.a(r8, r12)
                if (r8 == 0) goto L_0x0200
                java.lang.String r8 = qv.C11820c.a(r8)
            L_0x019d:
                r14 = r8
                if (r9 != 0) goto L_0x01ec
                java.lang.Class r8 = r1.getClass()
                java.lang.String r8 = r8.getName()
                kotlin.jvm.internal.C17542s.g(r8)
                r11 = 0
                r13 = 2
                r15 = 36
                java.lang.String r9 = HJ.C15854t.s1(r8, r15, r11, r13, r11)
                r15 = 46
                java.lang.String r9 = HJ.C15854t.o1(r9, r15, r11, r13, r11)
                int r16 = r9.length()
                if (r16 != 0) goto L_0x01c0
                goto L_0x01c4
            L_0x01c0:
                java.lang.String r8 = HJ.C15854t.P0(r9, r7)
            L_0x01c4:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r15 = 1
                boolean r9 = HJ.C15854t.b0(r9, r6, r15)
                if (r9 == 0) goto L_0x01d5
                r9 = r5
                goto L_0x01d7
            L_0x01d5:
                r9 = r21
            L_0x01d7:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r9)
                r11.append(r3)
                r11.append(r8)
                java.lang.String r9 = r11.toString()
            L_0x01e9:
                r17 = r9
                goto L_0x01ef
            L_0x01ec:
                r13 = 2
                r15 = 1
                goto L_0x01e9
            L_0x01ef:
                r11 = 0
                r8 = r10
                r9 = r2
                r10 = r17
                r16 = 0
                r18 = r13
                r13 = r14
                r8.a(r9, r10, r11, r12, r13)
                r8 = r14
                r9 = r17
                goto L_0x0182
            L_0x0200:
                Nn.h$e r1 = Nn.C10805h.e.f84074a
                throw r1
            L_0x0203:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LRn/f;", "<anonymous>", "(LQJ/Q;)LRn/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$completePayment$2", f = "PaymentRemoteDataSourceImpl.kt", l = {182}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Rn.f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93909c;

        /* renamed from: d  reason: collision with root package name */
        Object f93910d;

        /* renamed from: e  reason: collision with root package name */
        Object f93911e;

        /* renamed from: f  reason: collision with root package name */
        Object f93912f;

        /* renamed from: g  reason: collision with root package name */
        Object f93913g;

        /* renamed from: h  reason: collision with root package name */
        Object f93914h;

        /* renamed from: i  reason: collision with root package name */
        Object f93915i;

        /* renamed from: j  reason: collision with root package name */
        Object f93916j;

        /* renamed from: k  reason: collision with root package name */
        int f93917k;

        /* renamed from: l  reason: collision with root package name */
        int f93918l;

        /* renamed from: m  reason: collision with root package name */
        int f93919m;

        /* renamed from: n  reason: collision with root package name */
        int f93920n;

        /* renamed from: o  reason: collision with root package name */
        int f93921o;

        /* renamed from: p  reason: collision with root package name */
        int f93922p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f93923q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f93924r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f93925s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f93926t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, String str, boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f93924r = fVar;
            this.f93925s = str;
            this.f93926t = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f93924r, this.f93925s, this.f93926t, eVar);
            cVar.f93923q = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super Rn.f> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93922p
                r3 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r1 = r0.f93915i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93914h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93913g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93912f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93911e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f93910d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93909c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93923q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r19)
                r2 = r19
                goto L_0x012e
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003c:
                XH.y.b(r19)
                java.lang.Object r2 = r0.f93923q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r10 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0056:
                boolean r5 = r4.hasNext()
                r12 = 0
                if (r5 == 0) goto L_0x006e
                java.lang.Object r5 = r4.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r10, r12)
                if (r6 == 0) goto L_0x0056
                r11.add(r5)
                goto L_0x0056
            L_0x006e:
                java.util.Iterator r13 = r11.iterator()
                r14 = 0
                r6 = r11
                r4 = r14
                r5 = r4
            L_0x0076:
                boolean r7 = r13.hasNext()
                if (r7 == 0) goto L_0x00fa
                java.lang.Object r15 = r13.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                if (r4 != 0) goto L_0x0095
                java.lang.String r7 = "completePayment"
                java.lang.String r7 = qv.C11818a.a(r7, r8)
                if (r7 != 0) goto L_0x0091
                r6 = r15
                goto L_0x00fa
            L_0x0091:
                java.lang.String r4 = qv.C11820c.a(r7)
            L_0x0095:
                r16 = r4
                if (r5 != 0) goto L_0x00e7
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r14, r7, r14)
                r9 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r9, r14, r7, r14)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00b8
                goto L_0x00be
            L_0x00b8:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00be:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "m"
                goto L_0x00d3
            L_0x00d1:
                java.lang.String r5 = "b"
            L_0x00d3:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x00e7:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r10
                r6 = r17
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r6 = r15
                r4 = r16
                r5 = r17
                goto L_0x0076
            L_0x00fa:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r7 = r0.f93924r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r7 = r7.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$CompletePaymentBody r8 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$CompletePaymentBody
                java.lang.String r9 = r0.f93925s
                boolean r14 = r0.f93926t
                r8.<init>(r9, r14)
                r0.f93923q = r2
                r0.f93909c = r2
                r0.f93910d = r2
                r0.f93911e = r10
                r0.f93912f = r4
                r0.f93913g = r5
                r0.f93914h = r11
                r0.f93915i = r13
                r0.f93916j = r6
                r0.f93917k = r12
                r0.f93918l = r12
                r0.f93919m = r12
                r0.f93920n = r12
                r0.f93921o = r12
                r0.f93922p = r3
                java.lang.Object r2 = r7.d(r8, r0)
                if (r2 != r1) goto L_0x012e
                return r1
            L_0x012e:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote) r2
                Rn.f r1 = r2.d()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LSn/d;", "<anonymous>", "(LQJ/Q;)LSn/d;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$createOnlineTransferSession$2", f = "PaymentRemoteDataSourceImpl.kt", l = {115}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Sn.d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93927c;

        /* renamed from: d  reason: collision with root package name */
        Object f93928d;

        /* renamed from: e  reason: collision with root package name */
        Object f93929e;

        /* renamed from: f  reason: collision with root package name */
        Object f93930f;

        /* renamed from: g  reason: collision with root package name */
        Object f93931g;

        /* renamed from: h  reason: collision with root package name */
        Object f93932h;

        /* renamed from: i  reason: collision with root package name */
        Object f93933i;

        /* renamed from: j  reason: collision with root package name */
        Object f93934j;

        /* renamed from: k  reason: collision with root package name */
        int f93935k;

        /* renamed from: l  reason: collision with root package name */
        int f93936l;

        /* renamed from: m  reason: collision with root package name */
        int f93937m;

        /* renamed from: n  reason: collision with root package name */
        int f93938n;

        /* renamed from: o  reason: collision with root package name */
        int f93939o;

        /* renamed from: p  reason: collision with root package name */
        int f93940p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f93941q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f93942r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f93943s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f93944t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f93945a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    Nn.E[] r0 = Nn.E.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Nn.E r1 = Nn.E.SWISH     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Nn.E r1 = Nn.E.ACI     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Nn.E r1 = Nn.E.ALFABANK     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Nn.E r1 = Nn.E.WORLDLINE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f93945a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.d.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, String str, String str2, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f93942r = fVar;
            this.f93943s = str;
            this.f93944t = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f93942r, this.f93943s, this.f93944t, eVar);
            dVar.f93941q = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super Sn.d> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93940p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003d
                if (r2 != r4) goto L_0x0035
                java.lang.Object r1 = r0.f93933i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93932h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93931g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93930f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93929e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f93928d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93927c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93941q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r20)
                r2 = r20
                goto L_0x0130
            L_0x0035:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003d:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f93941q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r11 = qv.e.DEBUG
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0057:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x006f
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x0057
                r12.add(r6)
                goto L_0x0057
            L_0x006f:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x0077:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x00fc
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                r9 = 0
                if (r5 != 0) goto L_0x0097
                java.lang.String r8 = "Create Online Transfer Session"
                java.lang.String r8 = qv.C11818a.a(r8, r9)
                if (r8 != 0) goto L_0x0093
                r7 = r16
                goto L_0x00fc
            L_0x0093:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x0097:
                r17 = r5
                if (r6 != 0) goto L_0x00e8
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r3, r15)
                r8 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r8, r15, r3, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00b9
                goto L_0x00bf
            L_0x00b9:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00bf:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r4)
                if (r6 == 0) goto L_0x00d2
                java.lang.String r6 = "m"
                goto L_0x00d4
            L_0x00d2:
                java.lang.String r6 = "b"
            L_0x00d4:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00e8:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x0077
            L_0x00fc:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r8 = r0.f93942r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r8 = r8.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$OnlineTransferSessionBody r9 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$OnlineTransferSessionBody
                java.lang.String r10 = r0.f93943s
                java.lang.String r15 = r0.f93944t
                r9.<init>(r10, r15)
                r0.f93941q = r2
                r0.f93927c = r2
                r0.f93928d = r2
                r0.f93929e = r11
                r0.f93930f = r5
                r0.f93931g = r6
                r0.f93932h = r12
                r0.f93933i = r14
                r0.f93934j = r7
                r0.f93935k = r13
                r0.f93936l = r13
                r0.f93937m = r13
                r0.f93938n = r13
                r0.f93939o = r13
                r0.f93940p = r4
                java.lang.Object r2 = r8.j(r9, r0)
                if (r2 != r1) goto L_0x0130
                return r1
            L_0x0130:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote) r2
                Sn.d r1 = r2.a()
                Nn.E r2 = r1.a()
                int[] r5 = com.ingka.ikea.checkout.datalayer.impl.repo.network.f.d.a.f93945a
                int r2 = r2.ordinal()
                r2 = r5[r2]
                if (r2 == r4) goto L_0x016d
                if (r2 == r3) goto L_0x0152
                r3 = 3
                if (r2 == r3) goto L_0x0152
                r3 = 4
                if (r2 == r3) goto L_0x0152
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x0152:
                Nn.e$c$b r2 = new Nn.e$c$b
                Nn.E r1 = r1.a()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unknown PSP: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L_0x016d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LSn/d;", "<anonymous>", "(LQJ/Q;)LSn/d;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$createPspSession$2", f = "PaymentRemoteDataSourceImpl.kt", l = {87}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Sn.d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93946c;

        /* renamed from: d  reason: collision with root package name */
        Object f93947d;

        /* renamed from: e  reason: collision with root package name */
        Object f93948e;

        /* renamed from: f  reason: collision with root package name */
        Object f93949f;

        /* renamed from: g  reason: collision with root package name */
        Object f93950g;

        /* renamed from: h  reason: collision with root package name */
        Object f93951h;

        /* renamed from: i  reason: collision with root package name */
        Object f93952i;

        /* renamed from: j  reason: collision with root package name */
        Object f93953j;

        /* renamed from: k  reason: collision with root package name */
        int f93954k;

        /* renamed from: l  reason: collision with root package name */
        int f93955l;

        /* renamed from: m  reason: collision with root package name */
        int f93956m;

        /* renamed from: n  reason: collision with root package name */
        int f93957n;

        /* renamed from: o  reason: collision with root package name */
        int f93958o;

        /* renamed from: p  reason: collision with root package name */
        int f93959p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f93960q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f93961r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f93962s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f93963t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f93964a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    Nn.E[] r0 = Nn.E.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Nn.E r1 = Nn.E.ACI     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Nn.E r1 = Nn.E.ALFABANK     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Nn.E r1 = Nn.E.WORLDLINE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Nn.E r1 = Nn.E.SWISH     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f93964a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.e.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, String str, String str2, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f93961r = fVar;
            this.f93962s = str;
            this.f93963t = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f93961r, this.f93962s, this.f93963t, eVar);
            eVar2.f93960q = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super Sn.d> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93959p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003d
                if (r2 != r4) goto L_0x0035
                java.lang.Object r1 = r0.f93952i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93951h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93950g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93949f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93948e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f93947d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93946c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93960q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r20)
                r2 = r20
                goto L_0x0130
            L_0x0035:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003d:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f93960q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r11 = qv.e.DEBUG
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0057:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x006f
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x0057
                r12.add(r6)
                goto L_0x0057
            L_0x006f:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x0077:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x00fc
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                r9 = 0
                if (r5 != 0) goto L_0x0097
                java.lang.String r8 = "Create PSP Session"
                java.lang.String r8 = qv.C11818a.a(r8, r9)
                if (r8 != 0) goto L_0x0093
                r7 = r16
                goto L_0x00fc
            L_0x0093:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x0097:
                r17 = r5
                if (r6 != 0) goto L_0x00e8
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r3, r15)
                r8 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r8, r15, r3, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00b9
                goto L_0x00bf
            L_0x00b9:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00bf:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r4)
                if (r6 == 0) goto L_0x00d2
                java.lang.String r6 = "m"
                goto L_0x00d4
            L_0x00d2:
                java.lang.String r6 = "b"
            L_0x00d4:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00e8:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x0077
            L_0x00fc:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r8 = r0.f93961r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r8 = r8.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$CreatePspSessionBody r9 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$CreatePspSessionBody
                java.lang.String r10 = r0.f93962s
                java.lang.String r15 = r0.f93963t
                r9.<init>(r10, r15)
                r0.f93960q = r2
                r0.f93946c = r2
                r0.f93947d = r2
                r0.f93948e = r11
                r0.f93949f = r5
                r0.f93950g = r6
                r0.f93951h = r12
                r0.f93952i = r14
                r0.f93953j = r7
                r0.f93954k = r13
                r0.f93955l = r13
                r0.f93956m = r13
                r0.f93957n = r13
                r0.f93958o = r13
                r0.f93959p = r4
                java.lang.Object r2 = r8.k(r9, r0)
                if (r2 != r1) goto L_0x0130
                return r1
            L_0x0130:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.PspSessionRemote) r2
                Sn.d r1 = r2.a()
                Nn.E r2 = r1.a()
                int[] r5 = com.ingka.ikea.checkout.datalayer.impl.repo.network.f.e.a.f93964a
                int r2 = r2.ordinal()
                r2 = r5[r2]
                if (r2 == r4) goto L_0x015a
                if (r2 == r3) goto L_0x015a
                r3 = 3
                if (r2 == r3) goto L_0x015a
                r1 = 4
                if (r2 == r1) goto L_0x0152
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x0152:
                Nn.e$c$b r1 = new Nn.e$c$b
                java.lang.String r2 = "Swish shouldn't be received here"
                r1.<init>(r2)
                throw r1
            L_0x015a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LRn/e;", "<anonymous>", "(LQJ/Q;)LRn/e;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$deletePrepaidPayment$2", f = "PaymentRemoteDataSourceImpl.kt", l = {222}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.checkout.datalayer.impl.repo.network.f$f  reason: collision with other inner class name */
    static final class C2096f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Rn.e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93965c;

        /* renamed from: d  reason: collision with root package name */
        Object f93966d;

        /* renamed from: e  reason: collision with root package name */
        Object f93967e;

        /* renamed from: f  reason: collision with root package name */
        Object f93968f;

        /* renamed from: g  reason: collision with root package name */
        Object f93969g;

        /* renamed from: h  reason: collision with root package name */
        Object f93970h;

        /* renamed from: i  reason: collision with root package name */
        Object f93971i;

        /* renamed from: j  reason: collision with root package name */
        Object f93972j;

        /* renamed from: k  reason: collision with root package name */
        int f93973k;

        /* renamed from: l  reason: collision with root package name */
        int f93974l;

        /* renamed from: m  reason: collision with root package name */
        int f93975m;

        /* renamed from: n  reason: collision with root package name */
        int f93976n;

        /* renamed from: o  reason: collision with root package name */
        int f93977o;

        /* renamed from: p  reason: collision with root package name */
        int f93978p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f93979q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f93980r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f93981s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f93982t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2096f(f fVar, String str, String str2, C17164e<? super C2096f> eVar) {
            super(2, eVar);
            this.f93980r = fVar;
            this.f93981s = str;
            this.f93982t = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2096f fVar = new C2096f(this.f93980r, this.f93981s, this.f93982t, eVar);
            fVar.f93979q = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super Rn.e> eVar) {
            return ((C2096f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93978p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x004c
                if (r2 != r11) goto L_0x0044
                java.lang.Object r1 = r0.f93971i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93970h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93969g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93968f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93967e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f93966d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93965c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93979q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r23)
                r21 = r4
                r17 = r5
                r4 = r23
                goto L_0x014f
            L_0x0044:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004c:
                XH.y.b(r23)
                java.lang.Object r2 = r0.f93979q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0066:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x007d
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x0066
                r11.add(r8)
                goto L_0x0066
            L_0x007d:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r14 = r9
            L_0x0085:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x0111
                java.lang.Object r20 = r8.next()
                r16 = r20
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00a9
                java.lang.String r10 = "Delete prepaid payment"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00a5
                r21 = r4
                r10 = r15
                r4 = r20
                goto L_0x0116
            L_0x00a5:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00a9:
                if (r14 != 0) goto L_0x00f7
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r21 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00cc
                goto L_0x00d0
            L_0x00cc:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00d0:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00e1
                r4 = r5
                goto L_0x00e3
            L_0x00e1:
                r4 = r21
            L_0x00e3:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r14 = r12.toString()
            L_0x00f5:
                r4 = r14
                goto L_0x00fa
            L_0x00f7:
                r21 = r4
                goto L_0x00f5
            L_0x00fa:
                r17 = 0
                r14 = r16
                r10 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r20
                r4 = r21
                r12 = 0
                goto L_0x0085
            L_0x0111:
                r21 = r4
                r10 = r15
                r4 = r16
            L_0x0116:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r12 = r0.f93980r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r12 = r12.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$DeletePrepaidPaymentBody r15 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$DeletePrepaidPaymentBody
                java.lang.String r13 = r0.f93981s
                r17 = r5
                java.lang.String r5 = r0.f93982t
                r15.<init>(r13, r5)
                r0.f93979q = r2
                r0.f93965c = r2
                r0.f93966d = r2
                r0.f93967e = r10
                r0.f93968f = r9
                r0.f93969g = r14
                r0.f93970h = r11
                r0.f93971i = r8
                r0.f93972j = r4
                r4 = 0
                r0.f93973k = r4
                r0.f93974l = r4
                r0.f93975m = r4
                r0.f93976n = r4
                r0.f93977o = r4
                r4 = 1
                r0.f93978p = r4
                java.lang.Object r4 = r12.b(r15, r0)
                if (r4 != r1) goto L_0x014e
                return r1
            L_0x014e:
                r1 = r2
            L_0x014f:
                QL.x r4 = (QL.x) r4
                boolean r2 = r4.e()
                if (r2 == 0) goto L_0x0219
                java.lang.Object r2 = r4.a()
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse) r2
                if (r2 == 0) goto L_0x0167
                Rn.e r2 = r2.b()
                if (r2 != 0) goto L_0x0166
                goto L_0x0167
            L_0x0166:
                return r2
            L_0x0167:
                qv.e r2 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x017a:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x0192
                java.lang.Object r8 = r4.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r2, r10)
                if (r9 == 0) goto L_0x017a
                r5.add(r8)
                goto L_0x017a
            L_0x0192:
                java.util.Iterator r4 = r5.iterator()
                r5 = 0
                r8 = 0
            L_0x0198:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0216
                java.lang.Object r9 = r4.next()
                qv.b r9 = (qv.C11819b) r9
                r12 = 0
                if (r5 != 0) goto L_0x01b3
                java.lang.String r5 = "No body found"
                java.lang.String r5 = qv.C11818a.a(r5, r12)
                if (r5 == 0) goto L_0x0216
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x01b3:
                if (r8 != 0) goto L_0x0202
                java.lang.Class r8 = r1.getClass()
                java.lang.String r8 = r8.getName()
                kotlin.jvm.internal.C17542s.g(r8)
                r13 = 0
                r14 = 36
                r15 = 2
                java.lang.String r10 = HJ.C15854t.s1(r8, r14, r13, r15, r13)
                r11 = 46
                java.lang.String r10 = HJ.C15854t.o1(r10, r11, r13, r15, r13)
                int r16 = r10.length()
                if (r16 != 0) goto L_0x01d5
                goto L_0x01d9
            L_0x01d5:
                java.lang.String r8 = HJ.C15854t.P0(r10, r7)
            L_0x01d9:
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                r14 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r14)
                if (r10 == 0) goto L_0x01eb
                r10 = r17
                goto L_0x01ed
            L_0x01eb:
                r10 = r21
            L_0x01ed:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                r11.append(r3)
                r11.append(r8)
                java.lang.String r8 = r11.toString()
            L_0x01ff:
                r16 = r8
                goto L_0x0206
            L_0x0202:
                r13 = 0
                r14 = 1
                r15 = 2
                goto L_0x01ff
            L_0x0206:
                r11 = 0
                r8 = r9
                r9 = r2
                r10 = r16
                r18 = 46
                r19 = r13
                r13 = r5
                r8.a(r9, r10, r11, r12, r13)
                r8 = r16
                goto L_0x0198
            L_0x0216:
                Nn.h$e r1 = Nn.C10805h.e.f84074a
                throw r1
            L_0x0219:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r1 = r0.f93980r
                Nn.h r1 = r1.o(r4)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.C2096f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LNn/D;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$getPaymentOptions$2", f = "PaymentRemoteDataSourceImpl.kt", l = {74}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super List<? extends D>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93983c;

        /* renamed from: d  reason: collision with root package name */
        Object f93984d;

        /* renamed from: e  reason: collision with root package name */
        Object f93985e;

        /* renamed from: f  reason: collision with root package name */
        Object f93986f;

        /* renamed from: g  reason: collision with root package name */
        Object f93987g;

        /* renamed from: h  reason: collision with root package name */
        Object f93988h;

        /* renamed from: i  reason: collision with root package name */
        Object f93989i;

        /* renamed from: j  reason: collision with root package name */
        Object f93990j;

        /* renamed from: k  reason: collision with root package name */
        int f93991k;

        /* renamed from: l  reason: collision with root package name */
        int f93992l;

        /* renamed from: m  reason: collision with root package name */
        int f93993m;

        /* renamed from: n  reason: collision with root package name */
        int f93994n;

        /* renamed from: o  reason: collision with root package name */
        int f93995o;

        /* renamed from: p  reason: collision with root package name */
        int f93996p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f93997q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f93998r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f93999s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, String str, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f93998r = fVar;
            this.f93999s = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f93998r, this.f93999s, eVar);
            gVar.f93997q = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super List<? extends D>> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93996p
                r3 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r1 = r0.f93989i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93988h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93987g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93986f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93985e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f93984d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93983c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f93997q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r19)
                r2 = r19
                goto L_0x0127
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003c:
                XH.y.b(r19)
                java.lang.Object r2 = r0.f93997q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r10 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0056:
                boolean r5 = r4.hasNext()
                r12 = 0
                if (r5 == 0) goto L_0x006e
                java.lang.Object r5 = r4.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r10, r12)
                if (r6 == 0) goto L_0x0056
                r11.add(r5)
                goto L_0x0056
            L_0x006e:
                java.util.Iterator r13 = r11.iterator()
                r14 = 0
                r6 = r11
                r4 = r14
                r5 = r4
            L_0x0076:
                boolean r7 = r13.hasNext()
                if (r7 == 0) goto L_0x00fa
                java.lang.Object r15 = r13.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                if (r4 != 0) goto L_0x0095
                java.lang.String r7 = "Fetch payment options"
                java.lang.String r7 = qv.C11818a.a(r7, r8)
                if (r7 != 0) goto L_0x0091
                r6 = r15
                goto L_0x00fa
            L_0x0091:
                java.lang.String r4 = qv.C11820c.a(r7)
            L_0x0095:
                r16 = r4
                if (r5 != 0) goto L_0x00e7
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r14, r7, r14)
                r9 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r9, r14, r7, r14)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00b8
                goto L_0x00be
            L_0x00b8:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00be:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "m"
                goto L_0x00d3
            L_0x00d1:
                java.lang.String r5 = "b"
            L_0x00d3:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x00e7:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r10
                r6 = r17
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r6 = r15
                r4 = r16
                r5 = r17
                goto L_0x0076
            L_0x00fa:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r7 = r0.f93998r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r7 = r7.f93890b
                java.lang.String r8 = r0.f93999s
                r0.f93997q = r2
                r0.f93983c = r2
                r0.f93984d = r2
                r0.f93985e = r10
                r0.f93986f = r4
                r0.f93987g = r5
                r0.f93988h = r11
                r0.f93989i = r13
                r0.f93990j = r6
                r0.f93991k = r12
                r0.f93992l = r12
                r0.f93993m = r12
                r0.f93994n = r12
                r0.f93995o = r12
                r0.f93996p = r3
                java.lang.Object r2 = r7.i(r8, r0)
                if (r2 != r1) goto L_0x0127
                return r1
            L_0x0127:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentOptionsRemote) r2
                java.util.List r1 = r2.b()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LRn/f;", "<anonymous>", "(LQJ/Q;)LRn/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$getPaymentStatus$2", f = "PaymentRemoteDataSourceImpl.kt", l = {163}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Rn.f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f94000c;

        /* renamed from: d  reason: collision with root package name */
        Object f94001d;

        /* renamed from: e  reason: collision with root package name */
        Object f94002e;

        /* renamed from: f  reason: collision with root package name */
        Object f94003f;

        /* renamed from: g  reason: collision with root package name */
        Object f94004g;

        /* renamed from: h  reason: collision with root package name */
        Object f94005h;

        /* renamed from: i  reason: collision with root package name */
        Object f94006i;

        /* renamed from: j  reason: collision with root package name */
        Object f94007j;

        /* renamed from: k  reason: collision with root package name */
        int f94008k;

        /* renamed from: l  reason: collision with root package name */
        int f94009l;

        /* renamed from: m  reason: collision with root package name */
        int f94010m;

        /* renamed from: n  reason: collision with root package name */
        int f94011n;

        /* renamed from: o  reason: collision with root package name */
        int f94012o;

        /* renamed from: p  reason: collision with root package name */
        int f94013p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f94014q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f94015r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f94016s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, String str, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f94015r = fVar;
            this.f94016s = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f94015r, this.f94016s, eVar);
            hVar.f94014q = obj;
            return hVar;
        }

        public final Object invoke(Q q10, C17164e<? super Rn.f> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f94013p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x004a
                if (r2 != r11) goto L_0x0042
                java.lang.Object r1 = r0.f94006i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f94005h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f94004g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94003f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94002e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f94001d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94000c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94014q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r24)
                r22 = r4
                r4 = r24
                goto L_0x0144
            L_0x0042:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004a:
                XH.y.b(r24)
                java.lang.Object r2 = r0.f94014q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0064:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x007b
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x0064
                r11.add(r8)
                goto L_0x0064
            L_0x007b:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r14 = r9
            L_0x0083:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x010f
                java.lang.Object r21 = r8.next()
                r16 = r21
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00a7
                java.lang.String r10 = "getPaymentStatus"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00a3
                r22 = r4
                r10 = r15
                r4 = r21
                goto L_0x0114
            L_0x00a3:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00a7:
                if (r14 != 0) goto L_0x00f5
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r22 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00ca
                goto L_0x00ce
            L_0x00ca:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00ce:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00df
                r4 = r5
                goto L_0x00e1
            L_0x00df:
                r4 = r22
            L_0x00e1:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r14 = r12.toString()
            L_0x00f3:
                r4 = r14
                goto L_0x00f8
            L_0x00f5:
                r22 = r4
                goto L_0x00f3
            L_0x00f8:
                r17 = 0
                r14 = r16
                r10 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r21
                r4 = r22
                r12 = 0
                goto L_0x0083
            L_0x010f:
                r22 = r4
                r10 = r15
                r4 = r16
            L_0x0114:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r12 = r0.f94015r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r12 = r12.f93890b
                java.lang.String r15 = r0.f94016s
                r0.f94014q = r2
                r0.f94000c = r2
                r0.f94001d = r2
                r0.f94002e = r10
                r0.f94003f = r9
                r0.f94004g = r14
                r0.f94005h = r11
                r0.f94006i = r8
                r0.f94007j = r4
                r4 = 0
                r0.f94008k = r4
                r0.f94009l = r4
                r0.f94010m = r4
                r0.f94011n = r4
                r0.f94012o = r4
                r4 = 1
                r0.f94013p = r4
                java.lang.Object r4 = r12.g(r15, r0)
                if (r4 != r1) goto L_0x0143
                return r1
            L_0x0143:
                r1 = r2
            L_0x0144:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote) r4
                java.lang.String r2 = r4.c()
                qv.e r8 = qv.e.DEBUG
                qv.d r9 = qv.d.f102012a
                java.util.List r9 = r9.a()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x015d:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x0175
                java.lang.Object r11 = r9.next()
                r12 = r11
                qv.b r12 = (qv.C11819b) r12
                r14 = 0
                boolean r12 = r12.b(r8, r14)
                if (r12 == 0) goto L_0x015d
                r10.add(r11)
                goto L_0x015d
            L_0x0175:
                java.util.Iterator r9 = r10.iterator()
                r10 = r13
                r11 = r10
            L_0x017b:
                boolean r12 = r9.hasNext()
                if (r12 == 0) goto L_0x020e
                java.lang.Object r12 = r9.next()
                r14 = r12
                qv.b r14 = (qv.C11819b) r14
                r12 = 0
                if (r10 != 0) goto L_0x01a8
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r15 = "Got payment status: "
                r10.append(r15)
                r10.append(r2)
                java.lang.String r10 = r10.toString()
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x01a4
                goto L_0x020e
            L_0x01a4:
                java.lang.String r10 = qv.C11820c.a(r10)
            L_0x01a8:
                if (r11 != 0) goto L_0x01f5
                java.lang.Class r11 = r1.getClass()
                java.lang.String r11 = r11.getName()
                kotlin.jvm.internal.C17542s.g(r11)
                r12 = 2
                r15 = 36
                java.lang.String r0 = HJ.C15854t.s1(r11, r15, r13, r12, r13)
                r20 = r1
                r1 = 46
                java.lang.String r0 = HJ.C15854t.o1(r0, r1, r13, r12, r13)
                int r16 = r0.length()
                if (r16 != 0) goto L_0x01cb
                goto L_0x01cf
            L_0x01cb:
                java.lang.String r11 = HJ.C15854t.P0(r0, r7)
            L_0x01cf:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r0 = r0.getName()
                r1 = 1
                boolean r0 = HJ.C15854t.b0(r0, r6, r1)
                if (r0 == 0) goto L_0x01e0
                r0 = r5
                goto L_0x01e2
            L_0x01e0:
                r0 = r22
            L_0x01e2:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r3)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                goto L_0x01fa
            L_0x01f5:
                r20 = r1
                r12 = 2
                r15 = 36
            L_0x01fa:
                r17 = 0
                r0 = r15
                r15 = r8
                r16 = r11
                r1 = 0
                r18 = r1
                r19 = r10
                r14.a(r15, r16, r17, r18, r19)
                r0 = r23
                r1 = r20
                goto L_0x017b
            L_0x020e:
                if (r2 == 0) goto L_0x0215
                Rn.f r0 = r4.d()
                return r0
            L_0x0215:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "No payment status returned"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LRn/f;", "<anonymous>", "(LQJ/Q;)LRn/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$initiateExpressPayment$2", f = "PaymentRemoteDataSourceImpl.kt", l = {62}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Rn.f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f94017c;

        /* renamed from: d  reason: collision with root package name */
        Object f94018d;

        /* renamed from: e  reason: collision with root package name */
        Object f94019e;

        /* renamed from: f  reason: collision with root package name */
        Object f94020f;

        /* renamed from: g  reason: collision with root package name */
        Object f94021g;

        /* renamed from: h  reason: collision with root package name */
        Object f94022h;

        /* renamed from: i  reason: collision with root package name */
        Object f94023i;

        /* renamed from: j  reason: collision with root package name */
        Object f94024j;

        /* renamed from: k  reason: collision with root package name */
        int f94025k;

        /* renamed from: l  reason: collision with root package name */
        int f94026l;

        /* renamed from: m  reason: collision with root package name */
        int f94027m;

        /* renamed from: n  reason: collision with root package name */
        int f94028n;

        /* renamed from: o  reason: collision with root package name */
        int f94029o;

        /* renamed from: p  reason: collision with root package name */
        int f94030p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f94031q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f94032r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f94033s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar, String str, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f94032r = fVar;
            this.f94033s = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f94032r, this.f94033s, eVar);
            iVar.f94031q = obj;
            return iVar;
        }

        public final Object invoke(Q q10, C17164e<? super Rn.f> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f94030p
                r3 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r1 = r0.f94023i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f94022h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f94021g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94020f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94019e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f94018d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94017c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94031q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r19)
                r2 = r19
                goto L_0x012c
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003c:
                XH.y.b(r19)
                java.lang.Object r2 = r0.f94031q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r10 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0056:
                boolean r5 = r4.hasNext()
                r12 = 0
                if (r5 == 0) goto L_0x006e
                java.lang.Object r5 = r4.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r10, r12)
                if (r6 == 0) goto L_0x0056
                r11.add(r5)
                goto L_0x0056
            L_0x006e:
                java.util.Iterator r13 = r11.iterator()
                r14 = 0
                r6 = r11
                r4 = r14
                r5 = r4
            L_0x0076:
                boolean r7 = r13.hasNext()
                if (r7 == 0) goto L_0x00fa
                java.lang.Object r15 = r13.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                if (r4 != 0) goto L_0x0095
                java.lang.String r7 = "Initiate express payment session"
                java.lang.String r7 = qv.C11818a.a(r7, r8)
                if (r7 != 0) goto L_0x0091
                r6 = r15
                goto L_0x00fa
            L_0x0091:
                java.lang.String r4 = qv.C11820c.a(r7)
            L_0x0095:
                r16 = r4
                if (r5 != 0) goto L_0x00e7
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r14, r7, r14)
                r9 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r9, r14, r7, r14)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00b8
                goto L_0x00be
            L_0x00b8:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00be:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "m"
                goto L_0x00d3
            L_0x00d1:
                java.lang.String r5 = "b"
            L_0x00d3:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x00e7:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r10
                r6 = r17
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r6 = r15
                r4 = r16
                r5 = r17
                goto L_0x0076
            L_0x00fa:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r7 = r0.f94032r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r7 = r7.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$InitiateExpressPaymentBody r8 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$InitiateExpressPaymentBody
                java.lang.String r9 = r0.f94033s
                r8.<init>(r9)
                r0.f94031q = r2
                r0.f94017c = r2
                r0.f94018d = r2
                r0.f94019e = r10
                r0.f94020f = r4
                r0.f94021g = r5
                r0.f94022h = r11
                r0.f94023i = r13
                r0.f94024j = r6
                r0.f94025k = r12
                r0.f94026l = r12
                r0.f94027m = r12
                r0.f94028n = r12
                r0.f94029o = r12
                r0.f94030p = r3
                java.lang.Object r2 = r7.f(r8, r0)
                if (r2 != r1) goto L_0x012c
                return r1
            L_0x012c:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PaymentContextRemote) r2
                Rn.f r1 = r2.d()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LSn/b;", "<anonymous>", "(LQJ/Q;)LSn/b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$initiatePayment$2", f = "PaymentRemoteDataSourceImpl.kt", l = {42}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Sn.b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f94034c;

        /* renamed from: d  reason: collision with root package name */
        Object f94035d;

        /* renamed from: e  reason: collision with root package name */
        Object f94036e;

        /* renamed from: f  reason: collision with root package name */
        Object f94037f;

        /* renamed from: g  reason: collision with root package name */
        Object f94038g;

        /* renamed from: h  reason: collision with root package name */
        Object f94039h;

        /* renamed from: i  reason: collision with root package name */
        Object f94040i;

        /* renamed from: j  reason: collision with root package name */
        Object f94041j;

        /* renamed from: k  reason: collision with root package name */
        int f94042k;

        /* renamed from: l  reason: collision with root package name */
        int f94043l;

        /* renamed from: m  reason: collision with root package name */
        int f94044m;

        /* renamed from: n  reason: collision with root package name */
        int f94045n;

        /* renamed from: o  reason: collision with root package name */
        int f94046o;

        /* renamed from: p  reason: collision with root package name */
        int f94047p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f94048q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f94049r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f94050s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f94051t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar, String str, String str2, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f94049r = fVar;
            this.f94050s = str;
            this.f94051t = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f94049r, this.f94050s, this.f94051t, eVar);
            jVar.f94048q = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super Sn.b> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f94047p
                r3 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r1 = r0.f94040i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f94039h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f94038g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94037f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94036e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f94035d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94034c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94048q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r19)
                r2 = r19
                goto L_0x012e
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003c:
                XH.y.b(r19)
                java.lang.Object r2 = r0.f94048q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r10 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0056:
                boolean r5 = r4.hasNext()
                r12 = 0
                if (r5 == 0) goto L_0x006e
                java.lang.Object r5 = r4.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r10, r12)
                if (r6 == 0) goto L_0x0056
                r11.add(r5)
                goto L_0x0056
            L_0x006e:
                java.util.Iterator r13 = r11.iterator()
                r14 = 0
                r6 = r11
                r4 = r14
                r5 = r4
            L_0x0076:
                boolean r7 = r13.hasNext()
                if (r7 == 0) goto L_0x00fa
                java.lang.Object r15 = r13.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                if (r4 != 0) goto L_0x0095
                java.lang.String r7 = "Initiate payment session"
                java.lang.String r7 = qv.C11818a.a(r7, r8)
                if (r7 != 0) goto L_0x0091
                r6 = r15
                goto L_0x00fa
            L_0x0091:
                java.lang.String r4 = qv.C11820c.a(r7)
            L_0x0095:
                r16 = r4
                if (r5 != 0) goto L_0x00e7
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r14, r7, r14)
                r9 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r9, r14, r7, r14)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00b8
                goto L_0x00be
            L_0x00b8:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00be:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00d1
                java.lang.String r5 = "m"
                goto L_0x00d3
            L_0x00d1:
                java.lang.String r5 = "b"
            L_0x00d3:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x00e7:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r10
                r6 = r17
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r6 = r15
                r4 = r16
                r5 = r17
                goto L_0x0076
            L_0x00fa:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r7 = r0.f94049r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r7 = r7.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$InitiatePaymentBody r8 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$InitiatePaymentBody
                java.lang.String r9 = r0.f94050s
                java.lang.String r14 = r0.f94051t
                r8.<init>(r9, r14)
                r0.f94048q = r2
                r0.f94034c = r2
                r0.f94035d = r2
                r0.f94036e = r10
                r0.f94037f = r4
                r0.f94038g = r5
                r0.f94039h = r11
                r0.f94040i = r13
                r0.f94041j = r6
                r0.f94042k = r12
                r0.f94043l = r12
                r0.f94044m = r12
                r0.f94045n = r12
                r0.f94046o = r12
                r0.f94047p = r3
                java.lang.Object r2 = r7.e(r8, r0)
                if (r2 != r1) goto L_0x012e
                return r1
            L_0x012e:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.model.InitiatePaymentResponse r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.model.InitiatePaymentResponse) r2
                Sn.b r1 = r2.a()
                Sn.b r2 = new Sn.b
                Rn.e r3 = r1.a()
                Nn.i r1 = r1.b()
                r2.<init>(r3, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LNn/i;", "<anonymous>", "(LQJ/Q;)LNn/i;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$putExpressAddress$2", f = "PaymentRemoteDataSourceImpl.kt", l = {263}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C10806i>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f94052c;

        /* renamed from: d  reason: collision with root package name */
        Object f94053d;

        /* renamed from: e  reason: collision with root package name */
        Object f94054e;

        /* renamed from: f  reason: collision with root package name */
        Object f94055f;

        /* renamed from: g  reason: collision with root package name */
        Object f94056g;

        /* renamed from: h  reason: collision with root package name */
        Object f94057h;

        /* renamed from: i  reason: collision with root package name */
        Object f94058i;

        /* renamed from: j  reason: collision with root package name */
        Object f94059j;

        /* renamed from: k  reason: collision with root package name */
        Object f94060k;

        /* renamed from: l  reason: collision with root package name */
        int f94061l;

        /* renamed from: m  reason: collision with root package name */
        int f94062m;

        /* renamed from: n  reason: collision with root package name */
        int f94063n;

        /* renamed from: o  reason: collision with root package name */
        int f94064o;

        /* renamed from: p  reason: collision with root package name */
        int f94065p;

        /* renamed from: q  reason: collision with root package name */
        int f94066q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f94067r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ f f94068s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f94069t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f94070u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ w f94071v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(f fVar, String str, String str2, w wVar, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f94068s = fVar;
            this.f94069t = str;
            this.f94070u = str2;
            this.f94071v = wVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f94068s, this.f94069t, this.f94070u, this.f94071v, eVar);
            kVar.f94067r = obj;
            return kVar;
        }

        public final Object invoke(Q q10, C17164e<? super C10806i> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                r29 = this;
                r1 = r29
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f94066q
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r10 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x0055
                if (r2 != r10) goto L_0x004d
                java.lang.Object r0 = r1.f94059j
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f94058i
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r1.f94057h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f94056g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f94055f
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r1.f94054e
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f94053d
                Nn.w r0 = (Nn.w) r0
                java.lang.Object r0 = r1.f94052c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f94067r
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r30)
                r2 = r0
                r18 = r3
                r21 = r4
                r17 = r5
                r19 = r6
                r3 = r30
                goto L_0x016d
            L_0x004d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0055:
                XH.y.b(r30)
                java.lang.Object r2 = r1.f94067r
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x006f:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x0086
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x006f
                r10.add(r8)
                goto L_0x006f
            L_0x0086:
                java.util.Iterator r8 = r10.iterator()
                r16 = r10
                r9 = r13
                r14 = r9
            L_0x008e:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x011a
                java.lang.Object r20 = r8.next()
                r16 = r20
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00b2
                java.lang.String r11 = "putExpressAddress"
                java.lang.String r11 = qv.C11818a.a(r11, r12)
                if (r11 != 0) goto L_0x00ae
                r21 = r4
                r11 = r15
                r4 = r20
                goto L_0x011f
            L_0x00ae:
                java.lang.String r9 = qv.C11820c.a(r11)
            L_0x00b2:
                if (r14 != 0) goto L_0x0100
                java.lang.Class r11 = r2.getClass()
                java.lang.String r11 = r11.getName()
                kotlin.jvm.internal.C17542s.g(r11)
                r21 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r11, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00d5
                goto L_0x00d9
            L_0x00d5:
                java.lang.String r11 = HJ.C15854t.P0(r4, r7)
            L_0x00d9:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00ea
                r4 = r5
                goto L_0x00ec
            L_0x00ea:
                r4 = r21
            L_0x00ec:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r11)
                java.lang.String r14 = r12.toString()
            L_0x00fe:
                r4 = r14
                goto L_0x0103
            L_0x0100:
                r21 = r4
                goto L_0x00fe
            L_0x0103:
                r17 = 0
                r14 = r16
                r11 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r20
                r4 = r21
                r12 = 0
                goto L_0x008e
            L_0x011a:
                r21 = r4
                r11 = r15
                r4 = r16
            L_0x011f:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r12 = r1.f94068s
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r12 = r12.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$ExpressAddressBody r15 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$ExpressAddressBody
                java.lang.String r13 = r1.f94069t
                r17 = r5
                java.lang.String r5 = r1.f94070u
                r18 = r3
                Nn.w r3 = r1.f94071v
                if (r3 == 0) goto L_0x013e
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$GooglePayTaxInfo r19 = com.ingka.ikea.checkout.datalayer.impl.repo.network.g.b(r3)
                r28 = r19
                r19 = r6
                r6 = r28
                goto L_0x0141
            L_0x013e:
                r19 = r6
                r6 = 0
            L_0x0141:
                r15.<init>(r13, r5, r6)
                r1.f94067r = r2
                r1.f94052c = r2
                r1.f94053d = r3
                r1.f94054e = r2
                r1.f94055f = r11
                r1.f94056g = r9
                r1.f94057h = r14
                r1.f94058i = r10
                r1.f94059j = r8
                r1.f94060k = r4
                r3 = 0
                r1.f94061l = r3
                r1.f94062m = r3
                r1.f94063n = r3
                r1.f94064o = r3
                r1.f94065p = r3
                r3 = 1
                r1.f94066q = r3
                java.lang.Object r3 = r12.a(r15, r1)
                if (r3 != r0) goto L_0x016d
                return r0
            L_0x016d:
                QL.x r3 = (QL.x) r3
                boolean r0 = r3.e()
                if (r0 != 0) goto L_0x031e
                GK.E r0 = r3.d()     // Catch:{ Exception -> 0x0195 }
                if (r0 == 0) goto L_0x0197
                java.lang.String r0 = r0.l()     // Catch:{ Exception -> 0x0195 }
                if (r0 == 0) goto L_0x0197
                Yz.b r3 = Yz.b.f118278a     // Catch:{ Exception -> 0x0195 }
                kK.c r3 = r3.b()     // Catch:{ Exception -> 0x0195 }
                r3.a()     // Catch:{ Exception -> 0x0195 }
                com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse$a r4 = com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse.Companion     // Catch:{ Exception -> 0x0195 }
                kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch:{ Exception -> 0x0195 }
                java.lang.Object r0 = r3.c(r4, r0)     // Catch:{ Exception -> 0x0195 }
                goto L_0x0198
            L_0x0195:
                r0 = move-exception
                goto L_0x019e
            L_0x0197:
                r0 = 0
            L_0x0198:
                r15 = r18
                r14 = r19
                goto L_0x0250
            L_0x019e:
                qv.e r3 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x01b1:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x01c9
                java.lang.Object r6 = r4.next()
                r8 = r6
                qv.b r8 = (qv.C11819b) r8
                r9 = 0
                boolean r8 = r8.b(r3, r9)
                if (r8 == 0) goto L_0x01b1
                r5.add(r6)
                goto L_0x01b1
            L_0x01c9:
                java.util.Iterator r4 = r5.iterator()
                r5 = 0
                r6 = 0
            L_0x01cf:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x01e5
                java.lang.Object r8 = r4.next()
                qv.b r8 = (qv.C11819b) r8
                if (r5 != 0) goto L_0x01ef
                java.lang.String r5 = "Exception when parsing errorBody"
                java.lang.String r5 = qv.C11818a.a(r5, r0)
                if (r5 != 0) goto L_0x01eb
            L_0x01e5:
                r15 = r18
                r14 = r19
                goto L_0x024f
            L_0x01eb:
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x01ef:
                if (r6 != 0) goto L_0x023e
                java.lang.Class<QL.x> r6 = QL.x.class
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r9 = 36
                r10 = 2
                r11 = 0
                java.lang.String r12 = HJ.C15854t.s1(r6, r9, r11, r10, r11)
                r9 = 46
                java.lang.String r12 = HJ.C15854t.o1(r12, r9, r11, r10, r11)
                int r9 = r12.length()
                if (r9 != 0) goto L_0x020f
                goto L_0x0213
            L_0x020f:
                java.lang.String r6 = HJ.C15854t.P0(r12, r7)
            L_0x0213:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r14 = r19
                r10 = 1
                boolean r9 = HJ.C15854t.b0(r9, r14, r10)
                if (r9 == 0) goto L_0x0227
                r9 = r17
                goto L_0x0229
            L_0x0227:
                r9 = r21
            L_0x0229:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                r15 = r18
                r10.append(r15)
                r10.append(r6)
                java.lang.String r6 = r10.toString()
                goto L_0x0242
            L_0x023e:
                r15 = r18
                r14 = r19
            L_0x0242:
                r11 = 0
                r9 = r3
                r10 = r6
                r12 = r0
                r13 = r5
                r8.a(r9, r10, r11, r12, r13)
                r19 = r14
                r18 = r15
                goto L_0x01cf
            L_0x024f:
                r0 = 0
            L_0x0250:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse$ExpressAddressErrorResponse r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse.ExpressAddressErrorResponse) r0
                if (r0 == 0) goto L_0x0259
                Nn.t r11 = r0.c()
                goto L_0x025a
            L_0x0259:
                r11 = 0
            L_0x025a:
                qv.e r0 = qv.e.DEBUG
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x026d:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0285
                java.lang.Object r5 = r3.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                r8 = 0
                boolean r6 = r6.b(r0, r8)
                if (r6 == 0) goto L_0x026d
                r4.add(r5)
                goto L_0x026d
            L_0x0285:
                java.util.Iterator r3 = r4.iterator()
                r4 = 0
                r5 = 0
            L_0x028b:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x0318
                java.lang.Object r6 = r3.next()
                r22 = r6
                qv.b r22 = (qv.C11819b) r22
                r6 = 0
                if (r4 != 0) goto L_0x02b8
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r8 = "ExpressAddressResponse error: "
                r4.append(r8)
                r4.append(r11)
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = qv.C11818a.a(r4, r6)
                if (r4 != 0) goto L_0x02b4
                goto L_0x0318
            L_0x02b4:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x02b8:
                if (r5 != 0) goto L_0x0305
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r8 = 36
                r9 = 2
                r10 = 0
                java.lang.String r12 = HJ.C15854t.s1(r5, r8, r10, r9, r10)
                r13 = 46
                java.lang.String r12 = HJ.C15854t.o1(r12, r13, r10, r9, r10)
                int r16 = r12.length()
                if (r16 != 0) goto L_0x02da
                goto L_0x02de
            L_0x02da:
                java.lang.String r5 = HJ.C15854t.P0(r12, r7)
            L_0x02de:
                java.lang.Thread r12 = java.lang.Thread.currentThread()
                java.lang.String r12 = r12.getName()
                r8 = 1
                boolean r12 = HJ.C15854t.b0(r12, r14, r8)
                if (r12 == 0) goto L_0x02f0
                r12 = r17
                goto L_0x02f2
            L_0x02f0:
                r12 = r21
            L_0x02f2:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r12)
                r8.append(r15)
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                goto L_0x0309
            L_0x0305:
                r9 = 2
                r10 = 0
                r13 = 46
            L_0x0309:
                r25 = 0
                r23 = r0
                r24 = r5
                r26 = r6
                r27 = r4
                r22.a(r23, r24, r25, r26, r27)
                goto L_0x028b
            L_0x0318:
                if (r11 == 0) goto L_0x031b
                goto L_0x031d
            L_0x031b:
                Nn.t$a r11 = Nn.t.a.f84151a
            L_0x031d:
                throw r11
            L_0x031e:
                java.lang.Object r0 = r3.a()
                kotlin.jvm.internal.C17542s.g(r0)
                com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.ExpressAddressResponse) r0
                Nn.i r0 = r0.a()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$submitExternalPayment$2", f = "PaymentRemoteDataSourceImpl.kt", l = {143}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f94072c;

        /* renamed from: d  reason: collision with root package name */
        Object f94073d;

        /* renamed from: e  reason: collision with root package name */
        Object f94074e;

        /* renamed from: f  reason: collision with root package name */
        Object f94075f;

        /* renamed from: g  reason: collision with root package name */
        Object f94076g;

        /* renamed from: h  reason: collision with root package name */
        Object f94077h;

        /* renamed from: i  reason: collision with root package name */
        Object f94078i;

        /* renamed from: j  reason: collision with root package name */
        Object f94079j;

        /* renamed from: k  reason: collision with root package name */
        int f94080k;

        /* renamed from: l  reason: collision with root package name */
        int f94081l;

        /* renamed from: m  reason: collision with root package name */
        int f94082m;

        /* renamed from: n  reason: collision with root package name */
        int f94083n;

        /* renamed from: o  reason: collision with root package name */
        int f94084o;

        /* renamed from: p  reason: collision with root package name */
        int f94085p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f94086q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f94087r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f94088s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f94089t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar, String str, String str2, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f94087r = fVar;
            this.f94088s = str;
            this.f94089t = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f94087r, this.f94088s, this.f94089t, eVar);
            lVar.f94086q = obj;
            return lVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f94085p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x004c
                if (r2 != r11) goto L_0x0044
                java.lang.Object r1 = r0.f94078i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f94077h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f94076g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94075f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94074e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f94073d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94072c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94086q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r23)
                r21 = r4
                r17 = r5
                r4 = r23
                goto L_0x014f
            L_0x0044:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004c:
                XH.y.b(r23)
                java.lang.Object r2 = r0.f94086q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0066:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x007d
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x0066
                r11.add(r8)
                goto L_0x0066
            L_0x007d:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r14 = r9
            L_0x0085:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x0111
                java.lang.Object r20 = r8.next()
                r16 = r20
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00a9
                java.lang.String r10 = "submitExternalPayment"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00a5
                r21 = r4
                r10 = r15
                r4 = r20
                goto L_0x0116
            L_0x00a5:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00a9:
                if (r14 != 0) goto L_0x00f7
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r21 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00cc
                goto L_0x00d0
            L_0x00cc:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00d0:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00e1
                r4 = r5
                goto L_0x00e3
            L_0x00e1:
                r4 = r21
            L_0x00e3:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r14 = r12.toString()
            L_0x00f5:
                r4 = r14
                goto L_0x00fa
            L_0x00f7:
                r21 = r4
                goto L_0x00f5
            L_0x00fa:
                r17 = 0
                r14 = r16
                r10 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r20
                r4 = r21
                r12 = 0
                goto L_0x0085
            L_0x0111:
                r21 = r4
                r10 = r15
                r4 = r16
            L_0x0116:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r12 = r0.f94087r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r12 = r12.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$ExternalPaymentBody r15 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$ExternalPaymentBody
                java.lang.String r13 = r0.f94088s
                r17 = r5
                java.lang.String r5 = r0.f94089t
                r15.<init>(r13, r5)
                r0.f94086q = r2
                r0.f94072c = r2
                r0.f94073d = r2
                r0.f94074e = r10
                r0.f94075f = r9
                r0.f94076g = r14
                r0.f94077h = r11
                r0.f94078i = r8
                r0.f94079j = r4
                r4 = 0
                r0.f94080k = r4
                r0.f94081l = r4
                r0.f94082m = r4
                r0.f94083n = r4
                r0.f94084o = r4
                r4 = 1
                r0.f94085p = r4
                java.lang.Object r4 = r12.c(r15, r0)
                if (r4 != r1) goto L_0x014e
                return r1
            L_0x014e:
                r1 = r2
            L_0x014f:
                QL.x r4 = (QL.x) r4
                boolean r2 = r4.e()
                if (r2 != 0) goto L_0x0209
                qv.e r2 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x016a:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x0182
                java.lang.Object r8 = r4.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r2, r10)
                if (r9 == 0) goto L_0x016a
                r5.add(r8)
                goto L_0x016a
            L_0x0182:
                java.util.Iterator r4 = r5.iterator()
                r5 = 0
                r8 = 0
            L_0x0188:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0206
                java.lang.Object r9 = r4.next()
                qv.b r9 = (qv.C11819b) r9
                r12 = 0
                if (r5 != 0) goto L_0x01a3
                java.lang.String r5 = "Unsuccessful submit external payment"
                java.lang.String r5 = qv.C11818a.a(r5, r12)
                if (r5 == 0) goto L_0x0206
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x01a3:
                if (r8 != 0) goto L_0x01f2
                java.lang.Class r8 = r1.getClass()
                java.lang.String r8 = r8.getName()
                kotlin.jvm.internal.C17542s.g(r8)
                r13 = 0
                r14 = 36
                r15 = 2
                java.lang.String r10 = HJ.C15854t.s1(r8, r14, r13, r15, r13)
                r11 = 46
                java.lang.String r10 = HJ.C15854t.o1(r10, r11, r13, r15, r13)
                int r16 = r10.length()
                if (r16 != 0) goto L_0x01c5
                goto L_0x01c9
            L_0x01c5:
                java.lang.String r8 = HJ.C15854t.P0(r10, r7)
            L_0x01c9:
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                r14 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r14)
                if (r10 == 0) goto L_0x01db
                r10 = r17
                goto L_0x01dd
            L_0x01db:
                r10 = r21
            L_0x01dd:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                r11.append(r3)
                r11.append(r8)
                java.lang.String r8 = r11.toString()
            L_0x01ef:
                r16 = r8
                goto L_0x01f6
            L_0x01f2:
                r13 = 0
                r14 = 1
                r15 = 2
                goto L_0x01ef
            L_0x01f6:
                r11 = 0
                r8 = r9
                r9 = r2
                r10 = r16
                r18 = 46
                r19 = r13
                r13 = r5
                r8.a(r9, r10, r11, r12, r13)
                r8 = r16
                goto L_0x0188
            L_0x0206:
                Nn.h$e r1 = Nn.C10805h.e.f84074a
                throw r1
            L_0x0209:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LRn/e;", "<anonymous>", "(LQJ/Q;)LRn/e;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentRemoteDataSourceImpl$submitPrepaidPayment$2", f = "PaymentRemoteDataSourceImpl.kt", l = {198}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super Rn.e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f94090c;

        /* renamed from: d  reason: collision with root package name */
        Object f94091d;

        /* renamed from: e  reason: collision with root package name */
        Object f94092e;

        /* renamed from: f  reason: collision with root package name */
        Object f94093f;

        /* renamed from: g  reason: collision with root package name */
        Object f94094g;

        /* renamed from: h  reason: collision with root package name */
        Object f94095h;

        /* renamed from: i  reason: collision with root package name */
        Object f94096i;

        /* renamed from: j  reason: collision with root package name */
        Object f94097j;

        /* renamed from: k  reason: collision with root package name */
        int f94098k;

        /* renamed from: l  reason: collision with root package name */
        int f94099l;

        /* renamed from: m  reason: collision with root package name */
        int f94100m;

        /* renamed from: n  reason: collision with root package name */
        int f94101n;

        /* renamed from: o  reason: collision with root package name */
        int f94102o;

        /* renamed from: p  reason: collision with root package name */
        int f94103p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f94104q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f94105r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f94106s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f94107t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f94108u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(f fVar, String str, String str2, String str3, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f94105r = fVar;
            this.f94106s = str;
            this.f94107t = str2;
            this.f94108u = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(this.f94105r, this.f94106s, this.f94107t, this.f94108u, eVar);
            mVar.f94104q = obj;
            return mVar;
        }

        public final Object invoke(Q q10, C17164e<? super Rn.e> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f94103p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x004e
                if (r2 != r11) goto L_0x0046
                java.lang.Object r1 = r0.f94096i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f94095h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f94094g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94093f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f94092e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f94091d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94090c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f94104q
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r24)
                r18 = r3
                r22 = r4
                r17 = r5
                r3 = r24
                goto L_0x0155
            L_0x0046:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004e:
                XH.y.b(r24)
                java.lang.Object r2 = r0.f94104q
                QJ.Q r2 = (QJ.Q) r2
                qv.e r15 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0068:
                boolean r16 = r14.hasNext()
                if (r16 == 0) goto L_0x007f
                java.lang.Object r8 = r14.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r12)
                if (r9 == 0) goto L_0x0068
                r11.add(r8)
                goto L_0x0068
            L_0x007f:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r14 = r9
            L_0x0087:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x0113
                java.lang.Object r21 = r8.next()
                r16 = r21
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00ab
                java.lang.String r10 = "Submit prepaid payment"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00a7
                r22 = r4
                r10 = r15
                r4 = r21
                goto L_0x0118
            L_0x00a7:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00ab:
                if (r14 != 0) goto L_0x00f9
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r22 = r4
                r12 = 2
                r14 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r14, r13, r12, r13)
                r14 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r14, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00ce
                goto L_0x00d2
            L_0x00ce:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00d2:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00e3
                r4 = r5
                goto L_0x00e5
            L_0x00e3:
                r4 = r22
            L_0x00e5:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r14 = r12.toString()
            L_0x00f7:
                r4 = r14
                goto L_0x00fc
            L_0x00f9:
                r22 = r4
                goto L_0x00f7
            L_0x00fc:
                r17 = 0
                r14 = r16
                r10 = r15
                r16 = r4
                r12 = 0
                r18 = r12
                r19 = r9
                r14.a(r15, r16, r17, r18, r19)
                r14 = r4
                r16 = r21
                r4 = r22
                r12 = 0
                goto L_0x0087
            L_0x0113:
                r22 = r4
                r10 = r15
                r4 = r16
            L_0x0118:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r12 = r0.f94105r
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint r12 = r12.f93890b
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$PrepaidPaymentBody r15 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint$PrepaidPaymentBody
                java.lang.String r13 = r0.f94106s
                r17 = r5
                java.lang.String r5 = r0.f94107t
                r18 = r3
                java.lang.String r3 = r0.f94108u
                r15.<init>(r13, r5, r3)
                r0.f94104q = r2
                r0.f94090c = r2
                r0.f94091d = r2
                r0.f94092e = r10
                r0.f94093f = r9
                r0.f94094g = r14
                r0.f94095h = r11
                r0.f94096i = r8
                r0.f94097j = r4
                r3 = 0
                r0.f94098k = r3
                r0.f94099l = r3
                r0.f94100m = r3
                r0.f94101n = r3
                r0.f94102o = r3
                r3 = 1
                r0.f94103p = r3
                java.lang.Object r3 = r12.l(r15, r0)
                if (r3 != r1) goto L_0x0154
                return r1
            L_0x0154:
                r1 = r2
            L_0x0155:
                QL.x r3 = (QL.x) r3
                boolean r2 = r3.e()
                if (r2 == 0) goto L_0x0227
                java.lang.Object r2 = r3.a()
                com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse r2 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse) r2
                if (r2 == 0) goto L_0x016d
                Rn.e r2 = r2.b()
                if (r2 != 0) goto L_0x016c
                goto L_0x016d
            L_0x016c:
                return r2
            L_0x016d:
                qv.e r2 = qv.e.WARN
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x0180:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0198
                java.lang.Object r5 = r3.next()
                r8 = r5
                qv.b r8 = (qv.C11819b) r8
                r9 = 0
                boolean r8 = r8.b(r2, r9)
                if (r8 == 0) goto L_0x0180
                r4.add(r5)
                goto L_0x0180
            L_0x0198:
                java.util.Iterator r3 = r4.iterator()
                r4 = 0
                r5 = 0
            L_0x019e:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x0224
                java.lang.Object r8 = r3.next()
                qv.b r8 = (qv.C11819b) r8
                r12 = 0
                if (r4 != 0) goto L_0x01b9
                java.lang.String r4 = "No body found"
                java.lang.String r4 = qv.C11818a.a(r4, r12)
                if (r4 == 0) goto L_0x0224
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x01b9:
                if (r5 != 0) goto L_0x0208
                java.lang.Class r5 = r1.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r13 = 0
                r14 = 36
                r15 = 2
                java.lang.String r9 = HJ.C15854t.s1(r5, r14, r13, r15, r13)
                r11 = 46
                java.lang.String r9 = HJ.C15854t.o1(r9, r11, r13, r15, r13)
                int r10 = r9.length()
                if (r10 != 0) goto L_0x01db
                goto L_0x01df
            L_0x01db:
                java.lang.String r5 = HJ.C15854t.P0(r9, r7)
            L_0x01df:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r10 = 1
                boolean r9 = HJ.C15854t.b0(r9, r6, r10)
                if (r9 == 0) goto L_0x01f1
                r9 = r17
                goto L_0x01f3
            L_0x01f1:
                r9 = r22
            L_0x01f3:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                r9 = r18
                r10.append(r9)
                r10.append(r5)
                java.lang.String r5 = r10.toString()
                goto L_0x0210
            L_0x0208:
                r9 = r18
                r11 = 46
                r13 = 0
                r14 = 36
                r15 = 2
            L_0x0210:
                r16 = 0
                r18 = r9
                r9 = r2
                r19 = 1
                r10 = r5
                r20 = r11
                r11 = r16
                r16 = r13
                r13 = r4
                r8.a(r9, r10, r11, r12, r13)
                goto L_0x019e
            L_0x0224:
                Nn.h$e r1 = Nn.C10805h.e.f84074a
                throw r1
            L_0x0227:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.f r1 = r0.f94105r
                Nn.h r1 = r1.o(r3)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(M m10, PaymentEndpoint paymentEndpoint) {
        C17542s.j(m10, "defaultDispatcher");
        C17542s.j(paymentEndpoint, "paymentEndpoint");
        this.f93889a = m10;
        this.f93890b = paymentEndpoint;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Nn.C10805h o(QL.x<com.ingka.ikea.checkout.datalayer.impl.repo.network.PrepaidResponse> r23) {
        /*
            r22 = this;
            java.lang.String r1 = "|"
            java.lang.String r2 = "b"
            java.lang.String r3 = "m"
            java.lang.String r4 = "main"
            java.lang.String r5 = "Kt"
            r6 = 46
            r7 = 36
            r9 = 2
            r10 = 0
            GK.E r0 = r23.d()     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r0.l()     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x00de
            Yz.b r11 = Yz.b.f118278a     // Catch:{ Exception -> 0x0031 }
            kK.c r11 = r11.b()     // Catch:{ Exception -> 0x0031 }
            r11.a()     // Catch:{ Exception -> 0x0031 }
            com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentErrorBody$a r12 = com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentErrorBody.Companion     // Catch:{ Exception -> 0x0031 }
            kotlinx.serialization.KSerializer r12 = r12.serializer()     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r0 = r11.c(r12, r0)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00df
        L_0x0031:
            r0 = move-exception
            qv.e r15 = qv.e.DEBUG
            qv.d r11 = qv.d.f102012a
            java.util.List r11 = r11.a()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0045:
            boolean r13 = r11.hasNext()
            r14 = 0
            if (r13 == 0) goto L_0x005d
            java.lang.Object r13 = r11.next()
            r8 = r13
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r15, r14)
            if (r8 == 0) goto L_0x0045
            r12.add(r13)
            goto L_0x0045
        L_0x005d:
            java.util.Iterator r8 = r12.iterator()
            r11 = r10
            r12 = r11
        L_0x0063:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x00de
            java.lang.Object r13 = r8.next()
            qv.b r13 = (qv.C11819b) r13
            if (r11 != 0) goto L_0x007f
            java.lang.String r11 = "Exception when parsing errorBody"
            java.lang.String r11 = qv.C11818a.a(r11, r0)
            if (r11 != 0) goto L_0x007b
            goto L_0x00de
        L_0x007b:
            java.lang.String r11 = qv.C11820c.a(r11)
        L_0x007f:
            r17 = r11
            if (r12 != 0) goto L_0x00c5
            java.lang.Class r11 = r23.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r12 = HJ.C15854t.s1(r11, r7, r10, r9, r10)
            java.lang.String r12 = HJ.C15854t.o1(r12, r6, r10, r9, r10)
            int r16 = r12.length()
            if (r16 != 0) goto L_0x009d
            goto L_0x00a1
        L_0x009d:
            java.lang.String r11 = HJ.C15854t.P0(r12, r5)
        L_0x00a1:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r14 = 1
            boolean r12 = HJ.C15854t.b0(r12, r4, r14)
            if (r12 == 0) goto L_0x00b2
            r12 = r3
            goto L_0x00b3
        L_0x00b2:
            r12 = r2
        L_0x00b3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r14.append(r1)
            r14.append(r11)
            java.lang.String r12 = r14.toString()
        L_0x00c5:
            r18 = r12
            r11 = r13
            r12 = r15
            r13 = r18
            r19 = 0
            r14 = r19
            r20 = r15
            r15 = r0
            r16 = r17
            r11.a(r12, r13, r14, r15, r16)
            r11 = r17
            r12 = r18
            r15 = r20
            goto L_0x0063
        L_0x00de:
            r0 = r10
        L_0x00df:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentErrorBody r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentErrorBody) r0
            if (r0 != 0) goto L_0x0194
            qv.e r0 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00f6:
            boolean r12 = r8.hasNext()
            r15 = 0
            if (r12 == 0) goto L_0x010e
            java.lang.Object r12 = r8.next()
            r13 = r12
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r0, r15)
            if (r13 == 0) goto L_0x00f6
            r11.add(r12)
            goto L_0x00f6
        L_0x010e:
            java.util.Iterator r8 = r11.iterator()
            r11 = r10
            r12 = r11
        L_0x0114:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0190
            java.lang.Object r13 = r8.next()
            qv.b r13 = (qv.C11819b) r13
            r14 = 0
            if (r11 != 0) goto L_0x0131
            java.lang.String r11 = "No status found in error"
            java.lang.String r11 = qv.C11818a.a(r11, r14)
            if (r11 != 0) goto L_0x012d
            goto L_0x0190
        L_0x012d:
            java.lang.String r11 = qv.C11820c.a(r11)
        L_0x0131:
            r17 = r11
            if (r12 != 0) goto L_0x0177
            java.lang.Class r11 = r23.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r12 = HJ.C15854t.s1(r11, r7, r10, r9, r10)
            java.lang.String r12 = HJ.C15854t.o1(r12, r6, r10, r9, r10)
            int r16 = r12.length()
            if (r16 != 0) goto L_0x014f
            goto L_0x0153
        L_0x014f:
            java.lang.String r11 = HJ.C15854t.P0(r12, r5)
        L_0x0153:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r14 = 1
            boolean r12 = HJ.C15854t.b0(r12, r4, r14)
            if (r12 == 0) goto L_0x0164
            r12 = r3
            goto L_0x0165
        L_0x0164:
            r12 = r2
        L_0x0165:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r14.append(r1)
            r14.append(r11)
            java.lang.String r12 = r14.toString()
        L_0x0177:
            r18 = r12
            r11 = r13
            r12 = r0
            r13 = r18
            r16 = 0
            r14 = r15
            r19 = r15
            r15 = r16
            r16 = r17
            r11.a(r12, r13, r14, r15, r16)
            r11 = r17
            r12 = r18
            r15 = r19
            goto L_0x0114
        L_0x0190:
            Nn.h$e r0 = Nn.C10805h.e.f84074a
            goto L_0x035c
        L_0x0194:
            qv.e r8 = qv.e.WARN
            qv.d r11 = qv.d.f102012a
            java.util.List r11 = r11.a()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x01a7:
            boolean r13 = r11.hasNext()
            r15 = 0
            if (r13 == 0) goto L_0x01bf
            java.lang.Object r13 = r11.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r8, r15)
            if (r14 == 0) goto L_0x01a7
            r12.add(r13)
            goto L_0x01a7
        L_0x01bf:
            java.util.Iterator r17 = r12.iterator()
            r11 = r10
            r12 = r11
        L_0x01c5:
            boolean r13 = r17.hasNext()
            if (r13 == 0) goto L_0x0258
            java.lang.Object r13 = r17.next()
            qv.b r13 = (qv.C11819b) r13
            r14 = 0
            if (r11 != 0) goto L_0x01f5
            java.lang.String r11 = r0.a()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Found error body with message: "
            r15.append(r6)
            r15.append(r11)
            java.lang.String r6 = r15.toString()
            java.lang.String r6 = qv.C11818a.a(r6, r14)
            if (r6 != 0) goto L_0x01f1
            goto L_0x0258
        L_0x01f1:
            java.lang.String r11 = qv.C11820c.a(r6)
        L_0x01f5:
            r6 = r11
            if (r12 != 0) goto L_0x023c
            java.lang.Class r11 = r23.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            java.lang.String r12 = HJ.C15854t.s1(r11, r7, r10, r9, r10)
            r15 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r15, r10, r9, r10)
            int r15 = r12.length()
            if (r15 != 0) goto L_0x0214
            goto L_0x0218
        L_0x0214:
            java.lang.String r11 = HJ.C15854t.P0(r12, r5)
        L_0x0218:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r15 = 1
            boolean r12 = HJ.C15854t.b0(r12, r4, r15)
            if (r12 == 0) goto L_0x0229
            r12 = r3
            goto L_0x022a
        L_0x0229:
            r12 = r2
        L_0x022a:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r1)
            r15.append(r11)
            java.lang.String r12 = r15.toString()
        L_0x023c:
            r19 = r12
            r11 = r13
            r12 = r8
            r13 = r19
            r16 = r14
            r15 = 0
            r14 = r15
            r20 = r15
            r15 = r16
            r16 = r6
            r11.a(r12, r13, r14, r15, r16)
            r11 = r6
            r12 = r19
            r15 = r20
            r6 = 46
            goto L_0x01c5
        L_0x0258:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.e$a r6 = com.ingka.ikea.checkout.datalayer.impl.repo.network.e.Companion
            java.lang.String r8 = r0.b()
            com.ingka.ikea.checkout.datalayer.impl.repo.network.e r6 = r6.a(r8)
            r8 = -1
            if (r6 != 0) goto L_0x0267
            r6 = r8
            goto L_0x026f
        L_0x0267:
            int[] r11 = com.ingka.ikea.checkout.datalayer.impl.repo.network.f.a.f93891a
            int r6 = r6.ordinal()
            r6 = r11[r6]
        L_0x026f:
            if (r6 == r8) goto L_0x028c
            r8 = 1
            if (r6 == r8) goto L_0x0283
            if (r6 == r9) goto L_0x0283
            r0 = 3
            if (r6 != r0) goto L_0x027d
            Nn.h$c r0 = Nn.C10805h.c.f84071a
            goto L_0x035c
        L_0x027d:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0283:
            Nn.h$b r0 = new Nn.h$b
            Nn.h$b$a r1 = Nn.C10805h.b.a.GIFT_CARD_GENERAL_ERROR
            r0.<init>(r1)
            goto L_0x035c
        L_0x028c:
            qv.e r6 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x029f:
            boolean r12 = r8.hasNext()
            r15 = 0
            if (r12 == 0) goto L_0x02b7
            java.lang.Object r12 = r8.next()
            r13 = r12
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r6, r15)
            if (r13 == 0) goto L_0x029f
            r11.add(r12)
            goto L_0x029f
        L_0x02b7:
            java.util.Iterator r8 = r11.iterator()
            r11 = r10
            r12 = r11
        L_0x02bd:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x035a
            java.lang.Object r13 = r8.next()
            qv.b r13 = (qv.C11819b) r13
            r14 = 0
            if (r11 != 0) goto L_0x02ed
            java.lang.String r11 = r0.a()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "no valid status found in error: "
            r15.append(r7)
            r15.append(r11)
            java.lang.String r7 = r15.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r14)
            if (r7 != 0) goto L_0x02e9
            goto L_0x035a
        L_0x02e9:
            java.lang.String r11 = qv.C11820c.a(r7)
        L_0x02ed:
            r7 = r11
            if (r12 != 0) goto L_0x0338
            java.lang.Class r11 = r23.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r15 = 36
            java.lang.String r12 = HJ.C15854t.s1(r11, r15, r10, r9, r10)
            r15 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r15, r10, r9, r10)
            int r18 = r12.length()
            if (r18 != 0) goto L_0x030e
            goto L_0x0312
        L_0x030e:
            java.lang.String r11 = HJ.C15854t.P0(r12, r5)
        L_0x0312:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r9 = 1
            boolean r12 = HJ.C15854t.b0(r12, r4, r9)
            if (r12 == 0) goto L_0x0323
            r12 = r3
            goto L_0x0324
        L_0x0323:
            r12 = r2
        L_0x0324:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r12)
            r9.append(r1)
            r9.append(r11)
            java.lang.String r12 = r9.toString()
        L_0x0336:
            r9 = r12
            goto L_0x033b
        L_0x0338:
            r15 = 46
            goto L_0x0336
        L_0x033b:
            r11 = r13
            r12 = r6
            r13 = r9
            r19 = r14
            r16 = 0
            r14 = r16
            r17 = r15
            r21 = r16
            r20 = 36
            r15 = r19
            r16 = r7
            r11.a(r12, r13, r14, r15, r16)
            r11 = r7
            r12 = r9
            r7 = r20
            r15 = r21
            r9 = 2
            goto L_0x02bd
        L_0x035a:
            Nn.h$e r0 = Nn.C10805h.e.f84074a
        L_0x035c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.f.o(QL.x):Nn.h");
    }

    public Object a(String str, String str2, C17164e<? super Sn.d> eVar) {
        return C16310i.g(this.f93889a, new e(this, str, str2, (C17164e<? super e>) null), eVar);
    }

    public Object b(String str, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f93889a, new b(this, str, (C17164e<? super b>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public Object c(String str, String str2, C17164e<? super Sn.d> eVar) {
        return C16310i.g(this.f93889a, new d(this, str, str2, (C17164e<? super d>) null), eVar);
    }

    public Object d(String str, String str2, C17164e<? super Rn.f> eVar) {
        return C16310i.g(this.f93889a, new h(this, str, (C17164e<? super h>) null), eVar);
    }

    public Object e(String str, C17164e<? super Rn.f> eVar) {
        return C16310i.g(this.f93889a, new i(this, str, (C17164e<? super i>) null), eVar);
    }

    public Object f(String str, String str2, w wVar, C17164e<? super C10806i> eVar) {
        return C16310i.g(this.f93889a, new k(this, str, str2, wVar, (C17164e<? super k>) null), eVar);
    }

    public Object g(String str, String str2, String str3, C17164e<? super Rn.e> eVar) {
        return C16310i.g(this.f93889a, new m(this, str, str2, str3, (C17164e<? super m>) null), eVar);
    }

    public Object h(String str, C17164e<? super List<? extends D>> eVar) {
        return C16310i.g(this.f93889a, new g(this, str, (C17164e<? super g>) null), eVar);
    }

    public Object i(String str, String str2, C17164e<? super Rn.e> eVar) {
        return C16310i.g(this.f93889a, new C2096f(this, str, str2, (C17164e<? super C2096f>) null), eVar);
    }

    public Object j(String str, boolean z10, C17164e<? super Rn.f> eVar) {
        return C16310i.g(this.f93889a, new c(this, str, z10, (C17164e<? super c>) null), eVar);
    }

    public Object k(String str, String str2, C17164e<? super Sn.b> eVar) {
        return C16310i.g(this.f93889a, new j(this, str, str2, (C17164e<? super j>) null), eVar);
    }

    public Object l(String str, String str2, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f93889a, new l(this, str, str2, (C17164e<? super l>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }
}
