package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import HJ.C15854t;
import M6.w;
import Nn.C10801d;
import Nn.C10803f;
import Nn.C10814q;
import Nn.J;
import Nn.K;
import Nn.S;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.model.PriceResponse;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import th.C10258c;
import th.e;
import th.g;
import vh.C10315a0;
import vh.C10334k;
import vh.N;
import vh.X;
import wh.C10376g;
import wh.n;
import wh.o;
import wh.q;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001AB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u0010H@¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH@¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H@¢\u0006\u0004\b)\u0010*JJ\u00101\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010,\u001a\u00020+2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020(0'H@¢\u0006\u0004\b1\u00102J,\u00106\u001a\u0002052\u0006\u0010\u001f\u001a\u00020\u00142\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030-H@¢\u0006\u0004\b6\u00107J&\u0010:\u001a\u0004\u0018\u0001092\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030-H@¢\u0006\u0004\b:\u0010;J4\u0010=\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140-H@¢\u0006\u0004\b=\u0010>J&\u0010A\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00142\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0'H@¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010GR\u0014\u0010K\u001a\u00020H8BX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/c;", "LSn/a;", "Ltw/g;", "networkParameters", "LQJ/M;", "defaultDispatcher", "LRn/d;", "apolloClientProvider", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint;", "checkoutEndpoint", "LAe/b;", "developerAnalytics", "<init>", "(Ltw/g;LQJ/M;LRn/d;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint;LAe/b;)V", "LM6/w$a;", "D", "LL6/a;", "LM6/g;", "m", "(LL6/a;LdI/e;)Ljava/lang/Object;", "", "zipCode", "stateCode", "deliveryCountryCode", "LNn/d;", "cart", "LUn/a;", "preferredDelivery", "LNn/f;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/d;LUn/a;LdI/e;)Ljava/lang/Object;", "checkoutId", "deliveryServiceId", "pickupPointId", "serviceAreaId", "LNn/J$b;", "selectServiceCategory", "", "supportsWheelChairCapability", "", "LNn/q;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/J$b;ZLdI/e;)Ljava/lang/Object;", "LNn/J;", "deliveriesAndServices", "", "additionalValues", "deliveryTimeWindows", "LSn/e;", "g", "(Ljava/lang/String;Ljava/lang/String;LNn/J;Ljava/util/Map;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "", "data", "LXH/N;", "c", "(Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "addressData", "LNn/S;", "d", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LSn/f;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LNn/d$a;", "itemDetails", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Ltw/g;", "LQJ/M;", "LRn/d;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint;", "LAe/b;", "LVe/b;", "n", "()LVe/b;", "apolloClient", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Sn.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f93751f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final List<C10376g> f93752g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List<C10376g> f93753h;

    /* renamed from: a  reason: collision with root package name */
    private final tw.g f93754a;

    /* renamed from: b  reason: collision with root package name */
    private final M f93755b;

    /* renamed from: c  reason: collision with root package name */
    private final Rn.d f93756c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final CheckoutEndpoint f93757d;

    /* renamed from: e  reason: collision with root package name */
    private final Ae.b f93758e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/c$a;", "", "<init>", "()V", "", "Lwh/g;", "supportedCollectDeliveryServices", "Ljava/util/List;", "supportedHomeDeliveryServices", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl", f = "CheckoutRemoteDataSourceImpl.kt", l = {556}, m = "executeWithErrorHandling")
    static final class b<D extends w.a> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f93759c;

        /* renamed from: d  reason: collision with root package name */
        Object f93760d;

        /* renamed from: e  reason: collision with root package name */
        Object f93761e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f93762f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f93763g;

        /* renamed from: h  reason: collision with root package name */
        int f93764h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f93763g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f93762f = obj;
            this.f93764h |= Integer.MIN_VALUE;
            return this.f93763g.m((L6.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LNn/f;", "<anonymous>", "(LQJ/Q;)LNn/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$fetchCheckout$2", f = "CheckoutRemoteDataSourceImpl.kt", l = {478, 495, 524}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.checkout.datalayer.impl.repo.network.c$c  reason: collision with other inner class name */
    static final class C2095c extends l implements p<Q, C17164e<? super C10803f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93765c;

        /* renamed from: d  reason: collision with root package name */
        Object f93766d;

        /* renamed from: e  reason: collision with root package name */
        Object f93767e;

        /* renamed from: f  reason: collision with root package name */
        Object f93768f;

        /* renamed from: g  reason: collision with root package name */
        Object f93769g;

        /* renamed from: h  reason: collision with root package name */
        Object f93770h;

        /* renamed from: i  reason: collision with root package name */
        Object f93771i;

        /* renamed from: j  reason: collision with root package name */
        Object f93772j;

        /* renamed from: k  reason: collision with root package name */
        Object f93773k;

        /* renamed from: l  reason: collision with root package name */
        Object f93774l;

        /* renamed from: m  reason: collision with root package name */
        Object f93775m;

        /* renamed from: n  reason: collision with root package name */
        Object f93776n;

        /* renamed from: o  reason: collision with root package name */
        Object f93777o;

        /* renamed from: p  reason: collision with root package name */
        Object f93778p;

        /* renamed from: q  reason: collision with root package name */
        Object f93779q;

        /* renamed from: r  reason: collision with root package name */
        int f93780r;

        /* renamed from: s  reason: collision with root package name */
        int f93781s;

        /* renamed from: t  reason: collision with root package name */
        int f93782t;

        /* renamed from: u  reason: collision with root package name */
        int f93783u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ String f93784v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ c f93785w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ List<C10801d.a> f93786x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2095c(String str, c cVar, List<C10801d.a> list, C17164e<? super C2095c> eVar) {
            super(2, eVar);
            this.f93784v = str;
            this.f93785w = cVar;
            this.f93786x = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2095c(this.f93784v, this.f93785w, this.f93786x, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C10803f> eVar) {
            return ((C2095c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01de  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0233  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x023b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93783u
                r3 = 3
                r4 = 1
                java.lang.String r5 = "No data"
                r6 = 0
                r7 = 2
                r8 = 0
                if (r2 == 0) goto L_0x008d
                if (r2 == r4) goto L_0x0082
                if (r2 == r7) goto L_0x0066
                if (r2 != r3) goto L_0x005e
                java.lang.Object r1 = r0.f93779q
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93778p
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93777o
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93776n
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r1 = r0.f93775m
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93774l
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93773k
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93772j
                th.f$c r1 = (th.f.c) r1
                java.lang.Object r1 = r0.f93771i
                th.d r1 = (th.C10259d) r1
                java.lang.Object r1 = r0.f93770h
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r0.f93769g
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r3 = r0.f93768f
                XH.v r3 = (XH.v) r3
                java.lang.Object r3 = r0.f93767e
                th.f r3 = (th.f) r3
                java.lang.Object r3 = r0.f93766d
                com.ingka.ikea.checkout.datalayer.impl.repo.network.a r3 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.a) r3
                java.lang.Object r4 = r0.f93765c
                th.b r4 = (th.C10257b) r4
                XH.y.b(r20)
                r6 = r1
                r17 = r5
                r1 = r20
                r5 = r2
                goto L_0x01d1
            L_0x005e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0066:
                java.lang.Object r2 = r0.f93769g
                M6.g r2 = (M6.g) r2
                java.lang.Object r2 = r0.f93768f
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = r0.f93767e
                th.f r2 = (th.f) r2
                java.lang.Object r4 = r0.f93766d
                com.ingka.ikea.checkout.datalayer.impl.repo.network.a r4 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.a) r4
                java.lang.Object r9 = r0.f93765c
                th.b r9 = (th.C10257b) r9
                XH.y.b(r20)
                r11 = r2
                r2 = r20
                goto L_0x0100
            L_0x0082:
                java.lang.Object r2 = r0.f93765c
                th.b r2 = (th.C10257b) r2
                XH.y.b(r20)
                r4 = r20
            L_0x008b:
                r9 = r2
                goto L_0x00ac
            L_0x008d:
                XH.y.b(r20)
                th.b r2 = new th.b
                java.lang.String r9 = r0.f93784v
                r2.<init>(r9)
                com.ingka.ikea.checkout.datalayer.impl.repo.network.c r9 = r0.f93785w
                Ve.b r10 = r9.n()
                L6.a r10 = r10.b(r2)
                r0.f93765c = r2
                r0.f93783u = r4
                java.lang.Object r4 = r9.m(r10, r0)
                if (r4 != r1) goto L_0x008b
                return r1
            L_0x00ac:
                java.util.List<Nn.d$a> r2 = r0.f93786x
                M6.g r4 = (M6.g) r4
                com.ingka.ikea.checkout.datalayer.impl.repo.network.d.q(r4, r8, r7, r8)
                D r10 = r4.f38571c
                th.b$c r10 = (th.C10257b.c) r10
                if (r10 == 0) goto L_0x0242
                th.b$a r10 = r10.a()
                if (r10 == 0) goto L_0x0242
                vh.c r10 = r10.a()
                if (r10 == 0) goto L_0x0242
                com.ingka.ikea.checkout.datalayer.impl.repo.network.a r10 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.G(r10, r2)
                if (r10 == 0) goto L_0x0242
                th.f r11 = new th.f
                java.lang.String r12 = r10.a()
                java.lang.String r13 = r10.d()
                java.util.List r14 = com.ingka.ikea.checkout.datalayer.impl.repo.network.c.f93752g
                java.util.List r15 = com.ingka.ikea.checkout.datalayer.impl.repo.network.c.f93753h
                r11.<init>(r12, r13, r14, r15)
                com.ingka.ikea.checkout.datalayer.impl.repo.network.c r12 = r0.f93785w
                Ve.b r13 = r12.n()
                L6.a r13 = r13.b(r11)
                r0.f93765c = r9
                r0.f93766d = r10
                r0.f93767e = r11
                r0.f93768f = r2
                r0.f93769g = r4
                r0.f93780r = r6
                r0.f93783u = r7
                java.lang.Object r2 = r12.m(r13, r0)
                if (r2 != r1) goto L_0x00ff
                return r1
            L_0x00ff:
                r4 = r10
            L_0x0100:
                M6.g r2 = (M6.g) r2
                com.ingka.ikea.checkout.datalayer.impl.repo.network.d.q(r2, r8, r7, r8)
                D r2 = r2.f38571c
                th.f$c r2 = (th.f.c) r2
                if (r2 == 0) goto L_0x023b
                java.util.List r10 = r2.b()
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r12 = new java.util.ArrayList
                r13 = 10
                int r13 = YH.C16877v.y(r10, r13)
                r12.<init>(r13)
                java.util.Iterator r10 = r10.iterator()
            L_0x0120:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x0134
                java.lang.Object r13 = r10.next()
                th.f$d r13 = (th.f.d) r13
                vh.u r13 = r13.a()
                r12.add(r13)
                goto L_0x0120
            L_0x0134:
                java.util.List r10 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.r(r12)
                java.util.List r12 = r2.a()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r14 = r12.iterator()
            L_0x0147:
                boolean r15 = r14.hasNext()
                if (r15 == 0) goto L_0x0161
                java.lang.Object r15 = r14.next()
                th.f$a r15 = (th.f.a) r15
                vh.u r15 = r15.a()
                Nn.o r15 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.y(r15)
                if (r15 == 0) goto L_0x0147
                r13.add(r15)
                goto L_0x0147
            L_0x0161:
                java.util.List r15 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.Q(r13)
                XH.v r7 = new XH.v
                r7.<init>(r10, r15)
                java.lang.Object r16 = r7.a()
                r8 = r16
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r16 = r7.b()
                r3 = r16
                java.util.List r3 = (java.util.List) r3
                th.d r6 = new th.d
                r17 = r5
                java.lang.String r5 = r4.a()
                r18 = r1
                java.lang.String r1 = r4.d()
                r20 = r10
                java.util.List r10 = YH.C16877v.n()
                r6.<init>(r5, r1, r10)
                com.ingka.ikea.checkout.datalayer.impl.repo.network.c r1 = r0.f93785w
                Ve.b r5 = r1.n()
                L6.a r5 = r5.b(r6)
                r0.f93765c = r9
                r0.f93766d = r4
                r0.f93767e = r11
                r0.f93768f = r7
                r0.f93769g = r8
                r0.f93770h = r3
                r0.f93771i = r6
                r0.f93772j = r2
                r0.f93773k = r13
                r0.f93774l = r15
                r0.f93775m = r12
                r0.f93776n = r13
                r0.f93777o = r12
                r0.f93778p = r14
                r2 = r20
                r0.f93779q = r2
                r2 = 0
                r0.f93780r = r2
                r0.f93781s = r2
                r0.f93782t = r2
                r2 = 3
                r0.f93783u = r2
                java.lang.Object r1 = r1.m(r5, r0)
                r2 = r18
                if (r1 != r2) goto L_0x01ce
                return r2
            L_0x01ce:
                r6 = r3
                r3 = r4
                r5 = r8
            L_0x01d1:
                M6.g r1 = (M6.g) r1
                r2 = 2
                r4 = 0
                com.ingka.ikea.checkout.datalayer.impl.repo.network.d.q(r1, r4, r2, r4)
                D r1 = r1.f38571c
                th.d$b r1 = (th.C10259d.b) r1
                if (r1 == 0) goto L_0x0233
                th.d$e r2 = r1.a()
                th.d$c r2 = r2.a()
                vh.f0 r2 = r2.a()
                java.util.List r4 = YH.C16877v.n()
                Nn.K r2 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.D(r2, r4)
                th.d$e r1 = r1.a()
                th.d$f r1 = r1.c()
                vh.E0 r1 = r1.a()
                r4 = 0
                com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.H(r1, r4)
                XH.v r4 = new XH.v
                r4.<init>(r2, r1)
                java.lang.Object r1 = r4.a()
                r7 = r1
                Nn.K r7 = (Nn.K) r7
                java.lang.Object r1 = r4.b()
                r10 = r1
                com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel r10 = (com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel) r10
                Nn.f r1 = new Nn.f
                java.lang.String r4 = r3.a()
                java.lang.String r8 = r3.d()
                Nn.i r9 = r3.c()
                java.util.List r11 = r3.b()
                r12 = 0
                r2 = r1
                r3 = r4
                r4 = r8
                r8 = r9
                r9 = r11
                r11 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r1
            L_0x0233:
                java.io.IOException r1 = new java.io.IOException
                r2 = r17
                r1.<init>(r2)
                throw r1
            L_0x023b:
                r2 = r5
                java.io.IOException r1 = new java.io.IOException
                r1.<init>(r2)
                throw r1
            L_0x0242:
                r2 = r5
                java.io.IOException r1 = new java.io.IOException
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.c.C2095c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LNn/q;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$getDeliveryTimeWindows$2", f = "CheckoutRemoteDataSourceImpl.kt", l = {290}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super List<? extends C10814q>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93787c;

        /* renamed from: d  reason: collision with root package name */
        Object f93788d;

        /* renamed from: e  reason: collision with root package name */
        int f93789e;

        /* renamed from: f  reason: collision with root package name */
        int f93790f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f93791g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f93792h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f93793i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f93794j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ J.b f93795k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c f93796l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f93797m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f93798a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    Nn.J$b[] r0 = Nn.J.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Nn.J$b r1 = Nn.J.b.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Nn.J$b r1 = Nn.J.b.COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f93798a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.c.d.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, String str4, J.b bVar, c cVar, boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f93791g = str;
            this.f93792h = str2;
            this.f93793i = str3;
            this.f93794j = str4;
            this.f93795k = bVar;
            this.f93796l = cVar;
            this.f93797m = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f93791g, this.f93792h, this.f93793i, this.f93794j, this.f93795k, this.f93796l, this.f93797m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super List<C10814q>> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List<C10258c.d> a10;
            q qVar;
            Object f10 = C17187b.f();
            int i10 = this.f93790f;
            if (i10 == 0) {
                y.b(obj);
                String str = this.f93791g;
                String str2 = this.f93792h;
                M6.y a11 = M6.y.f38615a.a(this.f93793i);
                String str3 = this.f93794j;
                J.b bVar = this.f93795k;
                int i11 = a.f93798a[bVar.ordinal()];
                if (i11 == 1) {
                    qVar = q.HOME_DELIVERY;
                } else if (i11 == 2) {
                    qVar = q.COLLECT;
                } else {
                    throw new t();
                }
                C10258c cVar = new C10258c(str, str2, a11, str3, qVar);
                c cVar2 = this.f93796l;
                L6.a b10 = cVar2.n().b(cVar);
                this.f93787c = cVar;
                this.f93788d = bVar;
                this.f93789e = i11;
                this.f93790f = 1;
                obj = cVar2.m(b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                J.b bVar2 = (J.b) this.f93788d;
                C10258c cVar3 = (C10258c) this.f93787c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            M6.g gVar = (M6.g) obj;
            d.q(gVar, (String) null, 2, (Object) null);
            C10258c.C1416c cVar4 = (C10258c.C1416c) gVar.f38571c;
            if (cVar4 == null || (a10 = cVar4.a()) == null) {
                throw new IOException("No data");
            }
            Iterable<C10258c.d> iterable = a10;
            boolean z10 = this.f93797m;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C10258c.d dVar : iterable) {
                Nn.M i12 = d.E(dVar.c().a(), z10);
                Nn.M i13 = d.E(dVar.a().a(), z10);
                ArrayList arrayList2 = new ArrayList();
                for (C10258c.f a12 : dVar.d()) {
                    Nn.M i14 = d.E(a12.a(), z10);
                    if (i14 != null) {
                        arrayList2.add(i14);
                    }
                }
                if (i12 != null) {
                    arrayList.add(new C10814q(dVar.b(), i12, arrayList2, i13));
                } else {
                    throw new IOException("Invalid data");
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LSn/f;", "<anonymous>", "(LQJ/Q;)LSn/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$getSelectedDelivery$2", f = "CheckoutRemoteDataSourceImpl.kt", l = {458}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super Sn.f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93799c;

        /* renamed from: d  reason: collision with root package name */
        int f93800d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f93801e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f93802f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f93803g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f93804h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, String str2, Map<String, String> map, c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f93801e = str;
            this.f93802f = str2;
            this.f93803g = map;
            this.f93804h = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f93801e, this.f93802f, this.f93803g, this.f93804h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Sn.f> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93800d;
            if (i10 == 0) {
                y.b(obj);
                th.e eVar = new th.e(this.f93801e, this.f93802f, d.s(this.f93803g));
                c cVar = this.f93804h;
                L6.a b10 = cVar.n().b(eVar);
                this.f93799c = eVar;
                this.f93800d = 1;
                obj = cVar.m(b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                th.e eVar2 = (th.e) this.f93799c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            M6.g gVar = (M6.g) obj;
            d.q(gVar, (String) null, 2, (Object) null);
            e.b bVar = (e.b) gVar.f38571c;
            if (bVar != null) {
                return new Sn.f(d.H(bVar.a().a().a(), true));
            }
            throw new IOException("No data");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LNn/S;", "<anonymous>", "(LQJ/Q;)LNn/S;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$getUpsertAddressAction$2", f = "CheckoutRemoteDataSourceImpl.kt", l = {439}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super S>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93805c;

        /* renamed from: d  reason: collision with root package name */
        Object f93806d;

        /* renamed from: e  reason: collision with root package name */
        Object f93807e;

        /* renamed from: f  reason: collision with root package name */
        Object f93808f;

        /* renamed from: g  reason: collision with root package name */
        Object f93809g;

        /* renamed from: h  reason: collision with root package name */
        Object f93810h;

        /* renamed from: i  reason: collision with root package name */
        Object f93811i;

        /* renamed from: j  reason: collision with root package name */
        int f93812j;

        /* renamed from: k  reason: collision with root package name */
        int f93813k;

        /* renamed from: l  reason: collision with root package name */
        int f93814l;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f93815m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f93816n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ c f93817o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Map<String, ? extends Object> map, c cVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f93816n = map;
            this.f93817o = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f93816n, this.f93817o, eVar);
            fVar.f93815m = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super S> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93814l;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f93815m;
                if (this.f93816n.isEmpty()) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No data to upsert address");
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = q10.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, illegalArgumentException, str3);
                        str = str3;
                        str2 = str4;
                    }
                    throw illegalArgumentException;
                }
                Map<String, Object> map = this.f93816n;
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    arrayList2.add(new CheckoutEndpoint.KeyValuePair((String) next2.getKey(), next2.getValue().toString()));
                }
                CheckoutEndpoint.UpsertAddressBody upsertAddressBody = new CheckoutEndpoint.UpsertAddressBody(arrayList2);
                CheckoutEndpoint j10 = this.f93817o.f93757d;
                this.f93815m = q10;
                this.f93805c = upsertAddressBody;
                this.f93806d = map;
                this.f93807e = map;
                this.f93808f = arrayList2;
                this.f93809g = it;
                this.f93810h = arrayList2;
                this.f93811i = arrayList2;
                this.f93812j = 0;
                this.f93813k = 0;
                this.f93814l = 1;
                obj = j10.b(upsertAddressBody, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list = (List) this.f93811i;
                List list2 = (List) this.f93810h;
                Iterator it2 = (Iterator) this.f93809g;
                Collection collection = (Collection) this.f93808f;
                Map map2 = (Map) this.f93807e;
                Map map3 = (Map) this.f93806d;
                CheckoutEndpoint.UpsertAddressBody upsertAddressBody2 = (CheckoutEndpoint.UpsertAddressBody) this.f93805c;
                Q q11 = (Q) this.f93815m;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CheckoutEndpoint.UpsertAddressRemoteModel upsertAddressRemoteModel = (CheckoutEndpoint.UpsertAddressRemoteModel) C16877v.y0((List) obj);
            if (upsertAddressRemoteModel != null) {
                return upsertAddressRemoteModel.b();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$putShippingBilling$3", f = "CheckoutRemoteDataSourceImpl.kt", l = {397}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93818c;

        /* renamed from: d  reason: collision with root package name */
        Object f93819d;

        /* renamed from: e  reason: collision with root package name */
        Object f93820e;

        /* renamed from: f  reason: collision with root package name */
        Object f93821f;

        /* renamed from: g  reason: collision with root package name */
        Object f93822g;

        /* renamed from: h  reason: collision with root package name */
        Object f93823h;

        /* renamed from: i  reason: collision with root package name */
        Object f93824i;

        /* renamed from: j  reason: collision with root package name */
        Object f93825j;

        /* renamed from: k  reason: collision with root package name */
        int f93826k;

        /* renamed from: l  reason: collision with root package name */
        int f93827l;

        /* renamed from: m  reason: collision with root package name */
        int f93828m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f93829n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ c f93830o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f93831p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f93832q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, String str, Map<String, ? extends Object> map, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f93830o = cVar;
            this.f93831p = str;
            this.f93832q = map;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f93830o, this.f93831p, this.f93832q, eVar);
            gVar.f93829n = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x018b  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01c8  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x024e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r1 = r23
                java.lang.String r2 = "|"
                java.lang.String r3 = "b"
                java.lang.String r4 = "m"
                java.lang.String r5 = "main"
                java.lang.String r6 = "Kt"
                java.lang.Object r0 = eI.C17187b.f()
                int r7 = r1.f93828m
                r9 = 1
                if (r7 == 0) goto L_0x004a
                if (r7 != r9) goto L_0x0042
                java.lang.Object r0 = r1.f93825j
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r1.f93824i
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r1.f93823h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f93822g
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint) r0
                java.lang.Object r0 = r1.f93821f
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f93820e
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Object r0 = r1.f93819d
                java.util.Map r0 = (java.util.Map) r0
                java.lang.Object r0 = r1.f93818c
                java.util.Map r0 = (java.util.Map) r0
                java.lang.Object r0 = r1.f93829n
                QJ.Q r0 = (QJ.Q) r0
                XH.y.b(r24)
                r8 = r24
                r7 = r0
                goto L_0x00b8
            L_0x0042:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x004a:
                XH.y.b(r24)
                java.lang.Object r7 = r1.f93829n
                QJ.Q r7 = (QJ.Q) r7
                com.ingka.ikea.checkout.datalayer.impl.repo.network.c r10 = r1.f93830o
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint r10 = r10.f93757d
                java.lang.String r11 = r1.f93831p
                java.util.Map<java.lang.String, java.lang.Object> r12 = r1.f93832q
                java.util.ArrayList r13 = new java.util.ArrayList
                int r14 = r12.size()
                r13.<init>(r14)
                java.util.Set r14 = r12.entrySet()
                java.util.Iterator r14 = r14.iterator()
            L_0x006c:
                boolean r15 = r14.hasNext()
                if (r15 == 0) goto L_0x0092
                java.lang.Object r15 = r14.next()
                java.util.Map$Entry r15 = (java.util.Map.Entry) r15
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$KeyValuePair r9 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$KeyValuePair
                java.lang.Object r16 = r15.getKey()
                r8 = r16
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r15 = r15.getValue()
                java.lang.String r15 = r15.toString()
                r9.<init>(r8, r15)
                r13.add(r9)
                r9 = 1
                goto L_0x006c
            L_0x0092:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$PutShippingBillingBody r8 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$PutShippingBillingBody
                r8.<init>(r13)
                r1.f93829n = r7
                r1.f93818c = r12
                r1.f93819d = r12
                r1.f93820e = r13
                r1.f93821f = r14
                r1.f93822g = r10
                r1.f93823h = r11
                r1.f93824i = r13
                r1.f93825j = r13
                r9 = 0
                r1.f93826k = r9
                r1.f93827l = r9
                r9 = 1
                r1.f93828m = r9
                java.lang.Object r8 = r10.a(r11, r8, r1)
                if (r8 != r0) goto L_0x00b8
                return r0
            L_0x00b8:
                QL.x r8 = (QL.x) r8
                boolean r0 = r8.e()
                if (r0 != 0) goto L_0x0258
                r11 = 2
                r12 = 0
                GK.E r0 = r8.d()     // Catch:{ Exception -> 0x00e3 }
                if (r0 == 0) goto L_0x0186
                java.lang.String r0 = r0.l()     // Catch:{ Exception -> 0x00e3 }
                if (r0 == 0) goto L_0x0186
                Yz.b r8 = Yz.b.f118278a     // Catch:{ Exception -> 0x00e3 }
                kK.c r8 = r8.b()     // Catch:{ Exception -> 0x00e3 }
                r8.a()     // Catch:{ Exception -> 0x00e3 }
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$PutShippingBillingErrorRemote$a r13 = com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.PutShippingBillingErrorRemote.Companion     // Catch:{ Exception -> 0x00e3 }
                kotlinx.serialization.KSerializer r13 = r13.serializer()     // Catch:{ Exception -> 0x00e3 }
                java.lang.Object r0 = r8.c(r13, r0)     // Catch:{ Exception -> 0x00e3 }
                goto L_0x0187
            L_0x00e3:
                r0 = move-exception
                qv.e r8 = qv.e.DEBUG
                qv.d r13 = qv.d.f102012a
                java.util.List r13 = r13.a()
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r13 = r13.iterator()
            L_0x00f7:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x010f
                java.lang.Object r15 = r13.next()
                r9 = r15
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r8, r10)
                if (r9 == 0) goto L_0x00f7
                r14.add(r15)
                goto L_0x00f7
            L_0x010f:
                java.util.Iterator r9 = r14.iterator()
                r10 = r12
                r13 = r10
            L_0x0115:
                boolean r14 = r9.hasNext()
                if (r14 == 0) goto L_0x0186
                java.lang.Object r14 = r9.next()
                r17 = r14
                qv.b r17 = (qv.C11819b) r17
                if (r10 != 0) goto L_0x0132
                java.lang.String r10 = "Exception when parsing errorBody"
                java.lang.String r10 = qv.C11818a.a(r10, r0)
                if (r10 != 0) goto L_0x012e
                goto L_0x0186
            L_0x012e:
                java.lang.String r10 = qv.C11820c.a(r10)
            L_0x0132:
                if (r13 != 0) goto L_0x0178
                java.lang.Class<QL.x> r13 = QL.x.class
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                r14 = 36
                java.lang.String r15 = HJ.C15854t.s1(r13, r14, r12, r11, r12)
                r14 = 46
                java.lang.String r15 = HJ.C15854t.o1(r15, r14, r12, r11, r12)
                int r14 = r15.length()
                if (r14 != 0) goto L_0x0150
                goto L_0x0154
            L_0x0150:
                java.lang.String r13 = HJ.C15854t.P0(r15, r6)
            L_0x0154:
                java.lang.Thread r14 = java.lang.Thread.currentThread()
                java.lang.String r14 = r14.getName()
                r15 = 1
                boolean r14 = HJ.C15854t.b0(r14, r5, r15)
                if (r14 == 0) goto L_0x0165
                r14 = r4
                goto L_0x0166
            L_0x0165:
                r14 = r3
            L_0x0166:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r14)
                r15.append(r2)
                r15.append(r13)
                java.lang.String r13 = r15.toString()
            L_0x0178:
                r20 = 0
                r18 = r8
                r19 = r13
                r21 = r0
                r22 = r10
                r17.a(r18, r19, r20, r21, r22)
                goto L_0x0115
            L_0x0186:
                r0 = r12
            L_0x0187:
                com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint$PutShippingBillingErrorRemote r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint.PutShippingBillingErrorRemote) r0
                if (r0 == 0) goto L_0x0190
                Nn.e$b r0 = r0.a()
                goto L_0x0191
            L_0x0190:
                r0 = r12
            L_0x0191:
                qv.e r8 = qv.e.DEBUG
                qv.d r9 = qv.d.f102012a
                java.util.List r9 = r9.a()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L_0x01a4:
                boolean r13 = r9.hasNext()
                if (r13 == 0) goto L_0x01bc
                java.lang.Object r13 = r9.next()
                r14 = r13
                qv.b r14 = (qv.C11819b) r14
                r15 = 0
                boolean r14 = r14.b(r8, r15)
                if (r14 == 0) goto L_0x01a4
                r10.add(r13)
                goto L_0x01a4
            L_0x01bc:
                java.util.Iterator r9 = r10.iterator()
                r10 = r12
                r13 = r10
            L_0x01c2:
                boolean r14 = r9.hasNext()
                if (r14 == 0) goto L_0x024b
                java.lang.Object r14 = r9.next()
                r17 = r14
                qv.b r17 = (qv.C11819b) r17
                r14 = 0
                if (r10 != 0) goto L_0x01ef
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r15 = "putShippingBilling error: "
                r10.append(r15)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                java.lang.String r10 = qv.C11818a.a(r10, r14)
                if (r10 != 0) goto L_0x01eb
                goto L_0x024b
            L_0x01eb:
                java.lang.String r10 = qv.C11820c.a(r10)
            L_0x01ef:
                if (r13 != 0) goto L_0x0238
                java.lang.Class r13 = r7.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                r15 = 36
                java.lang.String r14 = HJ.C15854t.s1(r13, r15, r12, r11, r12)
                r15 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r15, r12, r11, r12)
                int r18 = r14.length()
                if (r18 != 0) goto L_0x020f
                goto L_0x0213
            L_0x020f:
                java.lang.String r13 = HJ.C15854t.P0(r14, r6)
            L_0x0213:
                java.lang.Thread r14 = java.lang.Thread.currentThread()
                java.lang.String r14 = r14.getName()
                r11 = 1
                boolean r14 = HJ.C15854t.b0(r14, r5, r11)
                if (r14 == 0) goto L_0x0224
                r14 = r4
                goto L_0x0225
            L_0x0224:
                r14 = r3
            L_0x0225:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r14)
                r11.append(r2)
                r11.append(r13)
                java.lang.String r13 = r11.toString()
                goto L_0x023a
            L_0x0238:
                r15 = 46
            L_0x023a:
                r20 = 0
                r18 = r8
                r19 = r13
                r11 = 0
                r21 = r11
                r22 = r10
                r17.a(r18, r19, r20, r21, r22)
                r11 = 2
                goto L_0x01c2
            L_0x024b:
                if (r0 == 0) goto L_0x024e
                goto L_0x0257
            L_0x024e:
                Nn.e$b$c r0 = new Nn.e$b$c
                java.util.List r2 = YH.C16877v.n()
                r0.<init>(r2)
            L_0x0257:
                throw r0
            L_0x0258:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LNn/f;", "<anonymous>", "(LQJ/Q;)LNn/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$putZipCode$2", f = "CheckoutRemoteDataSourceImpl.kt", l = {257}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C10803f>, Object> {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ String f93833A;

        /* renamed from: B  reason: collision with root package name */
        final /* synthetic */ String f93834B;

        /* renamed from: C  reason: collision with root package name */
        final /* synthetic */ c f93835C;

        /* renamed from: c  reason: collision with root package name */
        Object f93836c;

        /* renamed from: d  reason: collision with root package name */
        Object f93837d;

        /* renamed from: e  reason: collision with root package name */
        Object f93838e;

        /* renamed from: f  reason: collision with root package name */
        Object f93839f;

        /* renamed from: g  reason: collision with root package name */
        Object f93840g;

        /* renamed from: h  reason: collision with root package name */
        Object f93841h;

        /* renamed from: i  reason: collision with root package name */
        Object f93842i;

        /* renamed from: j  reason: collision with root package name */
        Object f93843j;

        /* renamed from: k  reason: collision with root package name */
        Object f93844k;

        /* renamed from: l  reason: collision with root package name */
        Object f93845l;

        /* renamed from: m  reason: collision with root package name */
        Object f93846m;

        /* renamed from: n  reason: collision with root package name */
        Object f93847n;

        /* renamed from: o  reason: collision with root package name */
        Object f93848o;

        /* renamed from: p  reason: collision with root package name */
        Object f93849p;

        /* renamed from: q  reason: collision with root package name */
        Object f93850q;

        /* renamed from: r  reason: collision with root package name */
        Object f93851r;

        /* renamed from: s  reason: collision with root package name */
        Object f93852s;

        /* renamed from: t  reason: collision with root package name */
        int f93853t;

        /* renamed from: u  reason: collision with root package name */
        int f93854u;

        /* renamed from: v  reason: collision with root package name */
        int f93855v;

        /* renamed from: w  reason: collision with root package name */
        private /* synthetic */ Object f93856w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ C10801d f93857x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ Un.a f93858y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ String f93859z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C10801d dVar, Un.a aVar, String str, String str2, String str3, c cVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f93857x = dVar;
            this.f93858y = aVar;
            this.f93859z = str;
            this.f93833A = str2;
            this.f93834B = str3;
            this.f93835C = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f93857x, this.f93858y, this.f93859z, this.f93833A, this.f93834B, this.f93835C, eVar);
            hVar.f93856w = obj;
            return hVar;
        }

        public final Object invoke(Q q10, C17164e<? super C10803f> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                r28 = this;
                r0 = r28
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f93855v
                r3 = 1
                if (r2 == 0) goto L_0x0060
                if (r2 != r3) goto L_0x0058
                java.lang.Object r1 = r0.f93852s
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93851r
                M6.y r1 = (M6.y) r1
                java.lang.Object r1 = r0.f93850q
                M6.y r1 = (M6.y) r1
                java.lang.Object r1 = r0.f93849p
                M6.y r1 = (M6.y) r1
                java.lang.Object r1 = r0.f93848o
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93846m
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f93845l
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f93844k
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f93843j
                M6.y r1 = (M6.y) r1
                java.lang.Object r1 = r0.f93842i
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93841h
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f93840g
                M6.y r1 = (M6.y) r1
                java.lang.Object r1 = r0.f93839f
                M6.y r1 = (M6.y) r1
                java.lang.Object r1 = r0.f93838e
                th.a r1 = (th.C10256a) r1
                java.lang.Object r1 = r0.f93837d
                wh.j r1 = (wh.j) r1
                java.lang.Object r1 = r0.f93836c
                wh.b r1 = (wh.C10371b) r1
                java.lang.Object r1 = r0.f93856w
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r29)
                r1 = r29
                goto L_0x023e
            L_0x0058:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0060:
                XH.y.b(r29)
                java.lang.Object r2 = r0.f93856w
                QJ.Q r2 = (QJ.Q) r2
                qv.e r10 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x007a:
                boolean r5 = r4.hasNext()
                r12 = 0
                if (r5 == 0) goto L_0x0092
                java.lang.Object r5 = r4.next()
                r6 = r5
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r10, r12)
                if (r6 == 0) goto L_0x007a
                r11.add(r5)
                goto L_0x007a
            L_0x0092:
                java.util.Iterator r13 = r11.iterator()
                r14 = 0
                r6 = r11
                r4 = r14
                r5 = r4
            L_0x009a:
                boolean r7 = r13.hasNext()
                r8 = 2
                if (r7 == 0) goto L_0x011f
                java.lang.Object r15 = r13.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                r9 = 0
                if (r4 != 0) goto L_0x00ba
                java.lang.String r4 = "putZipCode"
                java.lang.String r4 = qv.C11818a.a(r4, r9)
                if (r4 != 0) goto L_0x00b6
                r6 = r15
                goto L_0x011f
            L_0x00b6:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x00ba:
                r16 = r4
                if (r5 != 0) goto L_0x010b
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r14, r8, r14)
                r7 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r7, r14, r8, r14)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00dc
                goto L_0x00e2
            L_0x00dc:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00e2:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00f5
                java.lang.String r5 = "m"
                goto L_0x00f7
            L_0x00f5:
                java.lang.String r5 = "b"
            L_0x00f7:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x010b:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r10
                r6 = r17
                r8 = r9
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r6 = r15
                r4 = r16
                r5 = r17
                goto L_0x009a
            L_0x011f:
                Nn.d r4 = r0.f93857x
                java.util.List r4 = r4.d()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r7 = new java.util.ArrayList
                r9 = 10
                int r9 = YH.C16877v.y(r4, r9)
                r7.<init>(r9)
                java.util.Iterator r4 = r4.iterator()
            L_0x0136:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0158
                java.lang.Object r9 = r4.next()
                Nn.d$a r9 = (Nn.C10801d.a) r9
                wh.c r10 = new wh.c
                java.lang.String r15 = r9.b()
                int r3 = r9.c()
                java.lang.String r9 = r9.d()
                r10.<init>(r15, r3, r9)
                r7.add(r10)
                r3 = 1
                goto L_0x0136
            L_0x0158:
                M6.y$b r3 = M6.y.f38615a
                Nn.d r4 = r0.f93857x
                java.lang.String r4 = r4.b()
                M6.y r4 = r3.a(r4)
                Nn.d r9 = r0.f93857x
                java.lang.String r9 = r9.c()
                M6.y r9 = r3.a(r9)
                Nn.d r10 = r0.f93857x
                boolean r10 = r10.a()
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r10)
                M6.y r10 = r3.a(r10)
                wh.b r15 = new wh.b
                r19 = 0
                r12 = 8
                r22 = 0
                r23 = r15
                r16 = r7
                r17 = r4
                r18 = r9
                r20 = r10
                r21 = r12
                r15.<init>(r16, r17, r18, r19, r20, r21, r22)
                Un.a r15 = r0.f93858y
                boolean r12 = r15 instanceof Un.a.C1852a
                if (r12 == 0) goto L_0x01ab
                wh.j r14 = new wh.j
                wh.k r8 = wh.k.CLICK_COLLECT_STORE
                Un.a$a r15 = (Un.a.C1852a) r15
                java.lang.String r12 = r15.a()
                M6.y r12 = r3.a(r12)
                r14.<init>(r8, r12)
                goto L_0x01ba
            L_0x01ab:
                boolean r12 = r15 instanceof Un.a.b
                if (r12 == 0) goto L_0x01b8
                wh.j r12 = new wh.j
                wh.k r15 = wh.k.HOME_DELIVERY
                r12.<init>(r15, r14, r8, r14)
                r14 = r12
                goto L_0x01ba
            L_0x01b8:
                if (r15 != 0) goto L_0x0266
            L_0x01ba:
                java.lang.String r8 = r0.f93859z
                M6.y r8 = r3.a(r8)
                M6.y r12 = r3.a(r14)
                java.util.List r15 = com.ingka.ikea.checkout.datalayer.impl.repo.network.c.f93752g
                r24 = r1
                java.util.List r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.c.f93753h
                r16 = r15
                java.lang.String r15 = r0.f93833A
                M6.y r3 = r3.a(r15)
                th.a r15 = new th.a
                r25 = r4
                java.lang.String r4 = r0.f93834B
                r27 = r15
                r26 = r16
                r16 = r4
                r17 = r8
                r18 = r3
                r19 = r23
                r20 = r12
                r21 = r26
                r22 = r1
                r15.<init>(r16, r17, r18, r19, r20, r21, r22)
                com.ingka.ikea.checkout.datalayer.impl.repo.network.c r4 = r0.f93835C
                Ve.b r15 = r4.n()
                r16 = r4
                r4 = r27
                L6.a r15 = r15.a(r4)
                r0.f93856w = r2
                r2 = r23
                r0.f93836c = r2
                r0.f93837d = r14
                r0.f93838e = r4
                r0.f93839f = r8
                r0.f93840g = r12
                r2 = r26
                r0.f93841h = r2
                r0.f93842i = r1
                r0.f93843j = r3
                r0.f93844k = r5
                r0.f93845l = r11
                r0.f93846m = r13
                r0.f93847n = r6
                r0.f93848o = r7
                r0.f93849p = r10
                r0.f93850q = r9
                r1 = r25
                r0.f93851r = r1
                r0.f93852s = r7
                r1 = 0
                r0.f93853t = r1
                r1 = 8
                r0.f93854u = r1
                r1 = 1
                r0.f93855v = r1
                r1 = r16
                java.lang.Object r1 = r1.m(r15, r0)
                r2 = r24
                if (r1 != r2) goto L_0x023e
                return r2
            L_0x023e:
                M6.g r1 = (M6.g) r1
                java.lang.String r2 = r0.f93834B
                M6.g unused = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.p(r1, r2)
                D r1 = r1.f38571c
                th.a$e r1 = (th.C10256a.e) r1
                if (r1 == 0) goto L_0x025e
                th.a$d r1 = r1.a()
                if (r1 == 0) goto L_0x025e
                Nn.d r2 = r0.f93857x
                java.util.List r2 = r2.d()
                Nn.f r1 = com.ingka.ikea.checkout.datalayer.impl.repo.network.d.v(r1, r2)
                if (r1 == 0) goto L_0x025e
                return r1
            L_0x025e:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "No data"
                r1.<init>(r2)
                throw r1
            L_0x0266:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LSn/e;", "<anonymous>", "(LQJ/Q;)LSn/e;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutRemoteDataSourceImpl$selectDeliveriesAndServices$2", f = "CheckoutRemoteDataSourceImpl.kt", l = {353}, m = "invokeSuspend")
    static final class i extends l implements p<Q, C17164e<? super Sn.e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f93860c;

        /* renamed from: d  reason: collision with root package name */
        Object f93861d;

        /* renamed from: e  reason: collision with root package name */
        Object f93862e;

        /* renamed from: f  reason: collision with root package name */
        Object f93863f;

        /* renamed from: g  reason: collision with root package name */
        Object f93864g;

        /* renamed from: h  reason: collision with root package name */
        Object f93865h;

        /* renamed from: i  reason: collision with root package name */
        Object f93866i;

        /* renamed from: j  reason: collision with root package name */
        Object f93867j;

        /* renamed from: k  reason: collision with root package name */
        Object f93868k;

        /* renamed from: l  reason: collision with root package name */
        Object f93869l;

        /* renamed from: m  reason: collision with root package name */
        Object f93870m;

        /* renamed from: n  reason: collision with root package name */
        Object f93871n;

        /* renamed from: o  reason: collision with root package name */
        int f93872o;

        /* renamed from: p  reason: collision with root package name */
        int f93873p;

        /* renamed from: q  reason: collision with root package name */
        int f93874q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ J f93875r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f93876s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f93877t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f93878u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f93879v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ List<C10814q> f93880w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(J j10, Map<String, String> map, String str, String str2, c cVar, List<C10814q> list, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f93875r = j10;
            this.f93876s = map;
            this.f93877t = str;
            this.f93878u = str2;
            this.f93879v = cVar;
            this.f93880w = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f93875r, this.f93876s, this.f93877t, this.f93878u, this.f93879v, this.f93880w, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Sn.e> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            g.c a10;
            Object f10 = C17187b.f();
            int i10 = this.f93874q;
            if (i10 == 0) {
                y.b(obj);
                String b10 = this.f93875r.a().b();
                Iterable a11 = this.f93875r.a().a();
                ArrayList arrayList = new ArrayList(C16877v.y(a11, 10));
                Iterator it = a11.iterator();
                while (it.hasNext()) {
                    J.a.C1694a aVar = (J.a.C1694a) it.next();
                    arrayList.add(new n(aVar.a(), aVar.d(), M6.y.f38615a.a(aVar.b()), new wh.p(aVar.c().a(), aVar.c().b())));
                }
                o oVar = new o(b10, arrayList);
                q n10 = d.O(this.f93875r.b());
                wh.l lVar = new wh.l(oVar, n10);
                List c10 = d.s(this.f93876s);
                th.g gVar = new th.g(this.f93877t, lVar, this.f93878u, c10);
                c cVar = this.f93879v;
                L6.a a12 = cVar.n().a(gVar);
                this.f93860c = gVar;
                this.f93861d = lVar;
                this.f93862e = c10;
                this.f93863f = a11;
                this.f93864g = arrayList;
                this.f93865h = it;
                this.f93866i = b10;
                this.f93867j = arrayList;
                this.f93868k = arrayList;
                this.f93869l = b10;
                this.f93870m = n10;
                this.f93871n = oVar;
                this.f93872o = 0;
                this.f93873p = 0;
                this.f93874q = 1;
                obj2 = cVar.m(a12, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                o oVar2 = (o) this.f93871n;
                q qVar = (q) this.f93870m;
                String str = (String) this.f93869l;
                List list = (List) this.f93868k;
                List list2 = (List) this.f93867j;
                String str2 = (String) this.f93866i;
                Iterator it2 = (Iterator) this.f93865h;
                Collection collection = (Collection) this.f93864g;
                Iterable iterable = (Iterable) this.f93863f;
                List list3 = (List) this.f93862e;
                wh.l lVar2 = (wh.l) this.f93861d;
                th.g gVar2 = (th.g) this.f93860c;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            M6.g gVar3 = (M6.g) obj2;
            PriceResponse.PriceExclSavings priceExclSavings = null;
            d.q(gVar3, (String) null, 2, (Object) null);
            g.b bVar = (g.b) gVar3.f38571c;
            g.e a13 = bVar != null ? bVar.a() : null;
            if (a13 == null || (a10 = a13.a()) == null) {
                throw new IOException("No data");
            }
            K h10 = d.D(a10.a(), this.f93880w);
            if (h10 != null) {
                ShippingBillingDynamicModel k10 = d.H(a13.c().a(), false);
                C10334k a14 = a13.b().a();
                C10315a0 b11 = a14.b().b();
                List<N.a> a15 = a14.b().a().a();
                X a16 = a14.a().a();
                X a17 = a14.c().a();
                Double c11 = b11.c();
                Double b12 = b11.b();
                Double d10 = b11.d();
                List<C10315a0.c> f11 = b11.f();
                List d11 = f11 != null ? d.t(f11) : null;
                List l10 = a15 != null ? d.M(a15) : null;
                C10315a0.a a18 = b11.a();
                PriceResponse.DiscountSummaryResponse e10 = a18 != null ? d.u(a18) : null;
                X.a a19 = a16.a();
                PriceResponse.PriceExclSavings m10 = a19 != null ? d.N(a19) : null;
                X.a a20 = a17.a();
                if (a20 != null) {
                    priceExclSavings = d.N(a20);
                }
                return new Sn.e(h10, d.P(c11, b12, d10, d11, e10, l10, m10, priceExclSavings), k10);
            }
            throw new IOException("Unable to parse deliveryService correctly");
        }
    }

    static {
        C10376g gVar = C10376g.StandardHomeDeliveryParcel;
        C10376g gVar2 = C10376g.StandardHomeDeliveryTruck;
        C10376g gVar3 = C10376g.ExpressHomeDeliveryTruck;
        C10376g gVar4 = C10376g.CurbSideDeliveryTruck;
        C10376g gVar5 = C10376g.ExpressCurbSideTruck;
        C10376g gVar6 = C10376g.InternalPickupPointTruck;
        C10376g gVar7 = C10376g.InternalPickupPointParcel;
        C10376g gVar8 = C10376g.ExternalPickupPointTruck;
        C10376g gVar9 = C10376g.ExternalPickupPointParcel;
        C10376g gVar10 = C10376g.CollectAtStore;
        C10376g gVar11 = C10376g.InternalLockers;
        C10376g gVar12 = C10376g.ExternalLockers;
        C10376g gVar13 = gVar2;
        C10376g gVar14 = gVar3;
        f93752g = C16877v.q(gVar, gVar13, gVar14, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, C10376g.ClickCollectNearYouParcel, C10376g.ClickCollectNearYouTruck);
        f93753h = C16877v.q(gVar, gVar13, gVar14, C10376g.HomeDeliveryParcelExpress, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12);
    }

    public c(tw.g gVar, M m10, Rn.d dVar, CheckoutEndpoint checkoutEndpoint, Ae.b bVar) {
        C17542s.j(gVar, "networkParameters");
        C17542s.j(m10, "defaultDispatcher");
        C17542s.j(dVar, "apolloClientProvider");
        C17542s.j(checkoutEndpoint, "checkoutEndpoint");
        C17542s.j(bVar, "developerAnalytics");
        this.f93754a = gVar;
        this.f93755b = m10;
        this.f93756c = dVar;
        this.f93757d = checkoutEndpoint;
        this.f93758e = bVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends M6.w.a> java.lang.Object m(L6.a<D> r6, dI.C17164e<? super M6.g<D>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ingka.ikea.checkout.datalayer.impl.repo.network.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.ingka.ikea.checkout.datalayer.impl.repo.network.c$b r0 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.c.b) r0
            int r1 = r0.f93764h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f93764h = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.checkout.datalayer.impl.repo.network.c$b r0 = new com.ingka.ikea.checkout.datalayer.impl.repo.network.c$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f93762f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f93764h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f93761e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f93760d
            L6.a r6 = (L6.a) r6
            java.lang.Object r6 = r0.f93759c
            com.ingka.ikea.checkout.datalayer.impl.repo.network.c r6 = (com.ingka.ikea.checkout.datalayer.impl.repo.network.c) r6
            XH.y.b(r1)     // Catch:{ d -> 0x0035 }
            goto L_0x0052
        L_0x0035:
            r7 = move-exception
            goto L_0x0057
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            r0.f93759c = r5     // Catch:{ d -> 0x0055 }
            r0.f93760d = r6     // Catch:{ d -> 0x0055 }
            r0.f93761e = r7     // Catch:{ d -> 0x0055 }
            r0.f93764h = r4     // Catch:{ d -> 0x0055 }
            java.lang.Object r1 = r6.a(r0)     // Catch:{ d -> 0x0055 }
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r6 = r5
        L_0x0052:
            M6.g r1 = (M6.g) r1     // Catch:{ d -> 0x0035 }
            return r1
        L_0x0055:
            r7 = move-exception
            r6 = r5
        L_0x0057:
            Ae.b r6 = r6.f93758e
            r6.a(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.datalayer.impl.repo.network.c.m(L6.a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Ve.b n() {
        return this.f93756c.a(this.f93754a.i(), this.f93754a.a());
    }

    public Object a(String str, List<C10801d.a> list, C17164e<? super C10803f> eVar) {
        return C16310i.g(this.f93755b, new C2095c(str, this, list, (C17164e<? super C2095c>) null), eVar);
    }

    public Object b(String str, String str2, String str3, String str4, J.b bVar, boolean z10, C17164e<? super List<C10814q>> eVar) {
        return C16310i.g(this.f93755b, new d(str, str2, str3, str4, bVar, this, z10, (C17164e<? super d>) null), eVar);
    }

    public Object c(String str, Map<String, ? extends Object> map, C17164e<? super C16807N> eVar) {
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("putShippingBilling", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar2, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        Object g10 = C16310i.g(this.f93755b, new g(this, str, map, (C17164e<? super g>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public Object d(Map<String, ? extends Object> map, C17164e<? super S> eVar) {
        return C16310i.g(this.f93755b, new f(map, this, (C17164e<? super f>) null), eVar);
    }

    public Object e(String str, String str2, String str3, C10801d dVar, Un.a aVar, C17164e<? super C10803f> eVar) {
        return C16310i.g(this.f93755b, new h(dVar, aVar, str2, str3, str, this, (C17164e<? super h>) null), eVar);
    }

    public Object f(String str, String str2, Map<String, String> map, C17164e<? super Sn.f> eVar) {
        return C16310i.g(this.f93755b, new e(str, str2, map, this, (C17164e<? super e>) null), eVar);
    }

    public Object g(String str, String str2, J j10, Map<String, String> map, List<C10814q> list, C17164e<? super Sn.e> eVar) {
        return C16310i.g(this.f93755b, new i(j10, map, str, str2, this, list, (C17164e<? super i>) null), eVar);
    }
}
