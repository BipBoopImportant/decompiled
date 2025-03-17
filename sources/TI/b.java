package ti;

import Kf.y;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0013H@¢\u0006\u0004\b\u0018\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0013H@¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\bH@¢\u0006\u0004\b\u001a\u0010\nJ\u0010\u0010\u001b\u001a\u00020\bH@¢\u0006\u0004\b\u001b\u0010\nJ\u0010\u0010\u001c\u001a\u00020\bH@¢\u0006\u0004\b\u001c\u0010\nJ\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0013H@¢\u0006\u0004\b\u001e\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"Lti/b;", "Lti/a;", "LFn/g;", "cartCaasOnlineRemoteSource", "Lui/a;", "caasOnlineCartModelMapper", "<init>", "(LFn/g;Lui/a;)V", "Lsi/a;", "h", "(LdI/e;)Ljava/lang/Object;", "", "LKf/y;", "items", "addItems", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "item", "i", "(LKf/y;LdI/e;)Ljava/lang/Object;", "", "itemNumber", "g", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "code", "f", "b", "d", "e", "c", "sourceUserId", "a", "LFn/g;", "Lui/a;", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Fn.g f76885a;

    /* renamed from: b  reason: collision with root package name */
    private final ui.a f76886b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {64}, m = "addItems")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76887c;

        /* renamed from: d  reason: collision with root package name */
        Object f76888d;

        /* renamed from: e  reason: collision with root package name */
        Object f76889e;

        /* renamed from: f  reason: collision with root package name */
        Object f76890f;

        /* renamed from: g  reason: collision with root package name */
        Object f76891g;

        /* renamed from: h  reason: collision with root package name */
        Object f76892h;

        /* renamed from: i  reason: collision with root package name */
        Object f76893i;

        /* renamed from: j  reason: collision with root package name */
        Object f76894j;

        /* renamed from: k  reason: collision with root package name */
        Object f76895k;

        /* renamed from: l  reason: collision with root package name */
        int f76896l;

        /* renamed from: m  reason: collision with root package name */
        int f76897m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f76898n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ b f76899o;

        /* renamed from: p  reason: collision with root package name */
        int f76900p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f76899o = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76898n = obj;
            this.f76900p |= Integer.MIN_VALUE;
            return this.f76899o.addItems((List<y>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {123}, m = "clearCart")
    /* renamed from: ti.b$b  reason: collision with other inner class name */
    static final class C1418b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76901c;

        /* renamed from: d  reason: collision with root package name */
        Object f76902d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f76903e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f76904f;

        /* renamed from: g  reason: collision with root package name */
        int f76905g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1418b(b bVar, C17164e<? super C1418b> eVar) {
            super(eVar);
            this.f76904f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76903e = obj;
            this.f76905g |= Integer.MIN_VALUE;
            return this.f76904f.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {118}, m = "clearEmployeeDiscountAgreedTerms")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76906c;

        /* renamed from: d  reason: collision with root package name */
        Object f76907d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f76908e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f76909f;

        /* renamed from: g  reason: collision with root package name */
        int f76910g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f76909f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76908e = obj;
            this.f76910g |= Integer.MIN_VALUE;
            return this.f76909f.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {86}, m = "deleteCartItem")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76911c;

        /* renamed from: d  reason: collision with root package name */
        Object f76912d;

        /* renamed from: e  reason: collision with root package name */
        Object f76913e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f76914f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f76915g;

        /* renamed from: h  reason: collision with root package name */
        int f76916h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f76915g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76914f = obj;
            this.f76916h |= Integer.MIN_VALUE;
            return this.f76915g.g((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {108}, m = "deleteDiscount")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76917c;

        /* renamed from: d  reason: collision with root package name */
        Object f76918d;

        /* renamed from: e  reason: collision with root package name */
        Object f76919e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f76920f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f76921g;

        /* renamed from: h  reason: collision with root package name */
        int f76922h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f76921g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76920f = obj;
            this.f76922h |= Integer.MIN_VALUE;
            return this.f76921g.b((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {56}, m = "fetchCart")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76923c;

        /* renamed from: d  reason: collision with root package name */
        Object f76924d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f76925e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f76926f;

        /* renamed from: g  reason: collision with root package name */
        int f76927g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f76926f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76925e = obj;
            this.f76927g |= Integer.MIN_VALUE;
            return this.f76926f.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {93}, m = "putDiscount")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76928c;

        /* renamed from: d  reason: collision with root package name */
        Object f76929d;

        /* renamed from: e  reason: collision with root package name */
        Object f76930e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f76931f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f76932g;

        /* renamed from: h  reason: collision with root package name */
        int f76933h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f76932g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76931f = obj;
            this.f76933h |= Integer.MIN_VALUE;
            return this.f76932g.f((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {130}, m = "replaceCart")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76934c;

        /* renamed from: d  reason: collision with root package name */
        Object f76935d;

        /* renamed from: e  reason: collision with root package name */
        Object f76936e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f76937f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f76938g;

        /* renamed from: h  reason: collision with root package name */
        int f76939h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f76938g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76937f = obj;
            this.f76939h |= Integer.MIN_VALUE;
            return this.f76938g.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {113}, m = "setEmployeeDiscountAgreedTerms")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76940c;

        /* renamed from: d  reason: collision with root package name */
        Object f76941d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f76942e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f76943f;

        /* renamed from: g  reason: collision with root package name */
        int f76944g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f76943f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76942e = obj;
            this.f76944g |= Integer.MIN_VALUE;
            return this.f76943f.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.providers.cart.repo.v2.network.CartNetworkWrapperImpl", f = "CartNetworkWrapper.kt", l = {76}, m = "updateItem")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f76945c;

        /* renamed from: d  reason: collision with root package name */
        Object f76946d;

        /* renamed from: e  reason: collision with root package name */
        Object f76947e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f76948f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f76949g;

        /* renamed from: h  reason: collision with root package name */
        int f76950h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f76949g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f76948f = obj;
            this.f76950h |= Integer.MIN_VALUE;
            return this.f76949g.i((y) null, this);
        }
    }

    public b(Fn.g gVar, ui.a aVar) {
        C17542s.j(gVar, "cartCaasOnlineRemoteSource");
        C17542s.j(aVar, "caasOnlineCartModelMapper");
        this.f76885a = gVar;
        this.f76886b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super si.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ti.b.h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ti.b$h r0 = (ti.b.h) r0
            int r1 = r0.f76939h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76939h = r1
            goto L_0x0018
        L_0x0013:
            ti.b$h r0 = new ti.b$h
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f76937f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76939h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f76936e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76935d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f76934c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x0052
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            r0.f76934c = r5
            r0.f76935d = r6
            r0.f76936e = r7
            r0.f76939h = r4
            java.lang.Object r1 = r1.i(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r6 = r5
        L_0x0052:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object addItems(java.util.List<Kf.y> r11, dI.C17164e<? super si.a> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ti.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ti.b$a r0 = (ti.b.a) r0
            int r1 = r0.f76900p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76900p = r1
            goto L_0x0018
        L_0x0013:
            ti.b$a r0 = new ti.b$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f76898n
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76900p
            r4 = 1
            if (r3 == 0) goto L_0x0055
            if (r3 != r4) goto L_0x004d
            java.lang.Object r11 = r0.f76895k
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f76894j
            Fn.g r11 = (Fn.g) r11
            java.lang.Object r11 = r0.f76893i
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r11 = r0.f76892h
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r0.f76891g
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f76890f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = r0.f76889e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f76888d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f76887c
            ti.b r11 = (ti.b) r11
            XH.y.b(r1)
            goto L_0x00ab
        L_0x004d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0055:
            XH.y.b(r1)
            Fn.g r1 = r10.f76885a
            r3 = r11
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = YH.C16877v.y(r3, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r3.iterator()
        L_0x006c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r6.next()
            Kf.y r7 = (Kf.y) r7
            Fn.f r8 = new Fn.f
            java.lang.String r9 = r7.a()
            int r7 = r7.b()
            float r7 = (float) r7
            r8.<init>(r9, r7)
            r5.add(r8)
            goto L_0x006c
        L_0x008a:
            r0.f76887c = r10
            r0.f76888d = r11
            r0.f76889e = r12
            r0.f76890f = r3
            r0.f76891g = r3
            r0.f76892h = r5
            r0.f76893i = r6
            r0.f76894j = r1
            r0.f76895k = r5
            r11 = 0
            r0.f76896l = r11
            r0.f76897m = r11
            r0.f76900p = r4
            java.lang.Object r1 = r1.addItems(r5, r0)
            if (r1 != r2) goto L_0x00aa
            return r2
        L_0x00aa:
            r11 = r10
        L_0x00ab:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r11 = r11.f76886b
            si.a r11 = r11.a(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.addItems(java.util.List, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r6, dI.C17164e<? super si.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ti.b.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ti.b$e r0 = (ti.b.e) r0
            int r1 = r0.f76922h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76922h = r1
            goto L_0x0018
        L_0x0013:
            ti.b$e r0 = new ti.b$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f76920f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76922h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f76919e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76918d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f76917c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x0052
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            r0.f76917c = r5
            r0.f76918d = r6
            r0.f76919e = r7
            r0.f76922h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r6 = r5
        L_0x0052:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.b(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super si.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ti.b.C1418b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ti.b$b r0 = (ti.b.C1418b) r0
            int r1 = r0.f76905g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76905g = r1
            goto L_0x0018
        L_0x0013:
            ti.b$b r0 = new ti.b$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f76903e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76905g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f76902d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76901c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            r0.f76901c = r5
            r0.f76902d = r6
            r0.f76905g = r4
            java.lang.Object r1 = r1.c(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r6 = r5
        L_0x004c:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.c(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(dI.C17164e<? super si.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ti.b.i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ti.b$i r0 = (ti.b.i) r0
            int r1 = r0.f76944g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76944g = r1
            goto L_0x0018
        L_0x0013:
            ti.b$i r0 = new ti.b$i
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f76942e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76944g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f76941d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76940c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            r0.f76940c = r5
            r0.f76941d = r6
            r0.f76944g = r4
            java.lang.Object r1 = r1.m(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r6 = r5
        L_0x004c:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.d(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(dI.C17164e<? super si.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ti.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ti.b$c r0 = (ti.b.c) r0
            int r1 = r0.f76910g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76910g = r1
            goto L_0x0018
        L_0x0013:
            ti.b$c r0 = new ti.b$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f76908e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76910g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f76907d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76906c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            r0.f76906c = r5
            r0.f76907d = r6
            r0.f76910g = r4
            java.lang.Object r1 = r1.j(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r6 = r5
        L_0x004c:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.e(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.lang.String r6, dI.C17164e<? super si.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ti.b.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ti.b$g r0 = (ti.b.g) r0
            int r1 = r0.f76933h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76933h = r1
            goto L_0x0018
        L_0x0013:
            ti.b$g r0 = new ti.b$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f76931f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76933h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f76930e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76929d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f76928c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)     // Catch:{ d -> 0x0035 }
            goto L_0x0058
        L_0x0035:
            r6 = move-exception
            goto L_0x0061
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a     // Catch:{ d -> 0x0035 }
            java.util.List r3 = YH.C16877v.e(r6)     // Catch:{ d -> 0x0035 }
            r0.f76928c = r5     // Catch:{ d -> 0x0035 }
            r0.f76929d = r6     // Catch:{ d -> 0x0035 }
            r0.f76930e = r7     // Catch:{ d -> 0x0035 }
            r0.f76933h = r4     // Catch:{ d -> 0x0035 }
            java.lang.Object r1 = r1.l(r3, r0)     // Catch:{ d -> 0x0035 }
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            r6 = r5
        L_0x0058:
            Fn.b$b r1 = (Fn.b.C1565b) r1     // Catch:{ d -> 0x0035 }
            ui.a r6 = r6.f76886b     // Catch:{ d -> 0x0035 }
            si.a r6 = r6.a(r1)     // Catch:{ d -> 0x0035 }
            return r6
        L_0x0061:
            Fn.d$b r7 = Fn.d.b.f80977a
            boolean r7 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r7 != 0) goto L_0x007a
            Fn.d$a r7 = Fn.d.a.f80976a
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 == 0) goto L_0x0074
            Ln.b$e r6 = Ln.b.e.f83288a
            goto L_0x007c
        L_0x0074:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x007a:
            Ln.b$b r6 = Ln.b.C1665b.f83285a
        L_0x007c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.f(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(java.lang.String r6, dI.C17164e<? super si.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ti.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ti.b$d r0 = (ti.b.d) r0
            int r1 = r0.f76916h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76916h = r1
            goto L_0x0018
        L_0x0013:
            ti.b$d r0 = new ti.b$d
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f76914f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76916h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f76913e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76912d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f76911c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x0056
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            java.util.List r3 = YH.C16877v.e(r6)
            r0.f76911c = r5
            r0.f76912d = r6
            r0.f76913e = r7
            r0.f76916h = r4
            java.lang.Object r1 = r1.k(r3, r0)
            if (r1 != r2) goto L_0x0055
            return r2
        L_0x0055:
            r6 = r5
        L_0x0056:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.g(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(dI.C17164e<? super si.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ti.b.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ti.b$f r0 = (ti.b.f) r0
            int r1 = r0.f76927g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76927g = r1
            goto L_0x0018
        L_0x0013:
            ti.b$f r0 = new ti.b$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f76925e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76927g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f76924d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f76923c
            ti.b r6 = (ti.b) r6
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Fn.g r1 = r5.f76885a
            r0.f76923c = r5
            r0.f76924d = r6
            r0.f76927g = r4
            java.lang.Object r1 = r1.h(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r6 = r5
        L_0x004c:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            if (r1 == 0) goto L_0x0057
            ui.a r6 = r6.f76886b
            si.a r6 = r6.a(r1)
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.h(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object i(Kf.y r8, dI.C17164e<? super si.a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ti.b.j
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ti.b$j r0 = (ti.b.j) r0
            int r1 = r0.f76950h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f76950h = r1
            goto L_0x0018
        L_0x0013:
            ti.b$j r0 = new ti.b$j
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f76948f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f76950h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r8 = r0.f76947e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f76946d
            Kf.y r8 = (Kf.y) r8
            java.lang.Object r8 = r0.f76945c
            ti.b r8 = (ti.b) r8
            XH.y.b(r1)
            goto L_0x0060
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            XH.y.b(r1)
            Fn.g r1 = r7.f76885a
            Fn.f r3 = new Fn.f
            java.lang.String r5 = r8.a()
            int r6 = r8.b()
            float r6 = (float) r6
            r3.<init>(r5, r6)
            r0.f76945c = r7
            r0.f76946d = r8
            r0.f76947e = r9
            r0.f76950h = r4
            java.lang.Object r1 = r1.n(r3, r0)
            if (r1 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r8 = r7
        L_0x0060:
            Fn.b$b r1 = (Fn.b.C1565b) r1
            ui.a r8 = r8.f76886b
            si.a r8 = r8.a(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.i(Kf.y, dI.e):java.lang.Object");
    }
}
