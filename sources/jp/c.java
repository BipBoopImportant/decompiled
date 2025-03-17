package Jp;

import Mp.e;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.X;
import com.ingka.ikea.datalayer.impl.OfferHubRemote;
import com.ingka.ikea.datalayer.impl.SurpriseOffersRemote;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H@¢\u0006\u0004\b\u0012\u0010\u0010J$\u0010\u0017\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LJp/c;", "LIp/b;", "LJp/b;", "offerHubEndpoint", "LJp/d;", "secureOfferHubEndpoint", "LQJ/M;", "ioDispatcher", "LGo/a;", "clientIdentityProvider", "LMg/b;", "localHistoryRepository", "<init>", "(LJp/b;LJp/d;LQJ/M;LGo/a;LMg/b;)V", "LMp/a;", "a", "(LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "b", "", "filterKey", "filterValue", "LMp/e;", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LJp/b;", "LJp/d;", "LQJ/M;", "d", "LGo/a;", "e", "LMg/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Ip.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f82677a;

    /* renamed from: b  reason: collision with root package name */
    private final d f82678b;

    /* renamed from: c  reason: collision with root package name */
    private final M f82679c;

    /* renamed from: d  reason: collision with root package name */
    private final Go.a f82680d;

    /* renamed from: e  reason: collision with root package name */
    private final Mg.b f82681e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LMp/a;", "<anonymous>", "(LQJ/Q;)LMp/a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.datalayer.impl.OfferHubRepositoryImpl$getOfferHub$2", f = "OfferHubRepositoryImpl.kt", l = {31}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Mp.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f82683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f82683d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f82683d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Mp.a> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82682c;
            if (i10 == 0) {
                y.b(obj);
                b d10 = this.f82683d.f82677a;
                this.f82682c = 1;
                obj = d10.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((OfferHubRemote) obj).a();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.datalayer.impl.OfferHubRepositoryImpl", f = "OfferHubRepositoryImpl.kt", l = {35, 39}, m = "getRecommendationsOnSale")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f82684c;

        /* renamed from: d  reason: collision with root package name */
        Object f82685d;

        /* renamed from: e  reason: collision with root package name */
        Object f82686e;

        /* renamed from: f  reason: collision with root package name */
        Object f82687f;

        /* renamed from: g  reason: collision with root package name */
        Object f82688g;

        /* renamed from: h  reason: collision with root package name */
        Object f82689h;

        /* renamed from: i  reason: collision with root package name */
        Object f82690i;

        /* renamed from: j  reason: collision with root package name */
        Object f82691j;

        /* renamed from: k  reason: collision with root package name */
        Object f82692k;

        /* renamed from: l  reason: collision with root package name */
        Object f82693l;

        /* renamed from: m  reason: collision with root package name */
        int f82694m;

        /* renamed from: n  reason: collision with root package name */
        int f82695n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f82696o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c f82697p;

        /* renamed from: q  reason: collision with root package name */
        int f82698q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f82697p = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82696o = obj;
            this.f82698q |= Integer.MIN_VALUE;
            return this.f82697p.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LMp/e;", "<anonymous>", "(LQJ/Q;)LMp/e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.datalayer.impl.OfferHubRepositoryImpl$getSurpriseOffers$2", f = "OfferHubRepositoryImpl.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: Jp.c$c  reason: collision with other inner class name */
    static final class C1627c extends l implements p<Q, C17164e<? super e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82699c;

        /* renamed from: d  reason: collision with root package name */
        Object f82700d;

        /* renamed from: e  reason: collision with root package name */
        Object f82701e;

        /* renamed from: f  reason: collision with root package name */
        Object f82702f;

        /* renamed from: g  reason: collision with root package name */
        Object f82703g;

        /* renamed from: h  reason: collision with root package name */
        int f82704h;

        /* renamed from: i  reason: collision with root package name */
        int f82705i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f82706j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f82707k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f82708l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1627c(c cVar, String str, String str2, C17164e<? super C1627c> eVar) {
            super(2, eVar);
            this.f82706j = cVar;
            this.f82707k = str;
            this.f82708l = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1627c(this.f82706j, this.f82707k, this.f82708l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super e> eVar) {
            return ((C1627c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82705i;
            if (i10 == 0) {
                y.b(obj);
                String str = this.f82707k;
                String str2 = this.f82708l;
                Map c10 = X.c();
                c10.put("limit", "100");
                if (!(str == null || str2 == null)) {
                    c10.put(str, str2);
                }
                Map b10 = X.b(c10);
                b d10 = this.f82706j.f82677a;
                this.f82699c = b10;
                this.f82700d = str;
                this.f82701e = str2;
                this.f82702f = c10;
                this.f82703g = c10;
                this.f82704h = 0;
                this.f82705i = 1;
                obj = d10.a(b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Map map = (Map) this.f82703g;
                Map map2 = (Map) this.f82702f;
                String str3 = (String) this.f82701e;
                String str4 = (String) this.f82700d;
                Map map3 = (Map) this.f82699c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((SurpriseOffersRemote) obj).b();
        }
    }

    public c(b bVar, d dVar, M m10, Go.a aVar, Mg.b bVar2) {
        C17542s.j(bVar, "offerHubEndpoint");
        C17542s.j(dVar, "secureOfferHubEndpoint");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(aVar, "clientIdentityProvider");
        C17542s.j(bVar2, "localHistoryRepository");
        this.f82677a = bVar;
        this.f82678b = dVar;
        this.f82679c = m10;
        this.f82680d = aVar;
        this.f82681e = bVar2;
    }

    public Object a(C17164e<? super Mp.a> eVar) {
        return C16310i.g(this.f82679c, new a(this, (C17164e<? super a>) null), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099 A[LOOP:0: B:19:0x0093->B:21:0x0099, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super com.ingka.ikea.core.model.product.ProductCarousel> r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof Jp.c.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Jp.c$b r2 = (Jp.c.b) r2
            int r3 = r2.f82698q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f82698q = r3
            goto L_0x001c
        L_0x0017:
            Jp.c$b r2 = new Jp.c$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f82696o
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f82698q
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x006d
            if (r5 == r7) goto L_0x0061
            if (r5 != r6) goto L_0x0059
            java.lang.Object r1 = r2.f82693l
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r1 = r2.f82692k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f82691j
            Jp.d r1 = (Jp.d) r1
            java.lang.Object r1 = r2.f82690i
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f82689h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f82688g
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f82687f
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f82686e
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f82685d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f82684c
            Jp.c r1 = (Jp.c) r1
            XH.y.b(r3)
            goto L_0x00fa
        L_0x0059:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0061:
            java.lang.Object r1 = r2.f82685d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f82684c
            Jp.c r5 = (Jp.c) r5
            XH.y.b(r3)
            goto L_0x0082
        L_0x006d:
            XH.y.b(r3)
            Mg.b r3 = r0.f82681e
            r2.f82684c = r0
            r2.f82685d = r1
            r2.f82698q = r7
            r5 = 50
            java.lang.Object r3 = r3.g(r5, r2)
            if (r3 != r4) goto L_0x0081
            return r4
        L_0x0081:
            r5 = r0
        L_0x0082:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = YH.C16877v.y(r3, r9)
            r8.<init>(r9)
            java.util.Iterator r3 = r3.iterator()
        L_0x0093:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x00a7
            java.lang.Object r9 = r3.next()
            Pg.a r9 = (Pg.a) r9
            java.lang.String r9 = r9.b()
            r8.add(r9)
            goto L_0x0093
        L_0x00a7:
            Jp.d r9 = r5.f82678b
            Go.a r10 = r5.f82680d
            java.lang.String r10 = r10.c()
            boolean r11 = r8.isEmpty()
            r7 = r7 ^ r11
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            boolean r11 = r7.booleanValue()
            r12 = 0
            if (r11 == 0) goto L_0x00c1
            r11 = r8
            goto L_0x00c2
        L_0x00c1:
            r11 = r12
        L_0x00c2:
            if (r11 == 0) goto L_0x00d8
            r20 = 62
            r21 = 0
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r13 = r11
            java.lang.String r12 = YH.C16877v.G0(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00d8:
            r2.f82684c = r5
            r2.f82685d = r1
            r2.f82686e = r8
            r2.f82687f = r11
            r2.f82688g = r8
            r2.f82689h = r8
            r2.f82690i = r3
            r2.f82691j = r9
            r2.f82692k = r10
            r2.f82693l = r7
            r1 = 0
            r2.f82694m = r1
            r2.f82695n = r1
            r2.f82698q = r6
            java.lang.Object r3 = r9.a(r10, r12, r2)
            if (r3 != r4) goto L_0x00fa
            return r4
        L_0x00fa:
            com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote r3 = (com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote) r3
            com.ingka.ikea.core.model.product.ProductCarousel r1 = r3.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Jp.c.b(dI.e):java.lang.Object");
    }

    public Object c(String str, String str2, C17164e<? super e> eVar) {
        return C16310i.g(this.f82679c, new C1627c(this, str, str2, (C17164e<? super C1627c>) null), eVar);
    }
}
