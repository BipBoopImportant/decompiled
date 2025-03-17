package xo;

import Nn.S;
import Nn.x;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import tf.C10253a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxo/a;", "Lxo/c;", "LNn/x;", "repository", "Ltf/a;", "killSwitchRepo", "LaA/a;", "sessionManager", "<init>", "(LNn/x;Ltf/a;LaA/a;)V", "", "checkoutId", "LTJ/g;", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "b", "(Ljava/lang/String;)LTJ/g;", "", "", "data", "additionalValues", "LNn/S;", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LNn/x;", "Ltf/a;", "c", "LaA/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.a  reason: case insensitive filesystem */
public final class C12321a implements C12323c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f106070a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C10253a f106071b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C13909a f106072c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xo.a$a  reason: collision with other inner class name */
    public static final class C2521a implements C16532g<ShippingBillingDynamicModel> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f106073a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xo.a$a$a  reason: collision with other inner class name */
        public static final class C2522a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f106074a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.checkout.impl.userdetails.CheckoutUserDetailsRepositoryConnection$getConfiguration$$inlined$map$1$2", f = "CheckoutUserDetailsRepositoryConnection.kt", l = {50}, m = "emit")
            /* renamed from: xo.a$a$a$a  reason: collision with other inner class name */
            public static final class C2523a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f106075c;

                /* renamed from: d  reason: collision with root package name */
                int f106076d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2522a f106077e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2523a(C2522a aVar, C17164e eVar) {
                    super(eVar);
                    this.f106077e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f106075c = obj;
                    this.f106076d |= Integer.MIN_VALUE;
                    return this.f106077e.emit((Object) null, this);
                }
            }

            public C2522a(C16533h hVar) {
                this.f106074a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof xo.C12321a.C2521a.C2522a.C2523a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    xo.a$a$a$a r0 = (xo.C12321a.C2521a.C2522a.C2523a) r0
                    int r1 = r0.f106076d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f106076d = r1
                    goto L_0x0018
                L_0x0013:
                    xo.a$a$a$a r0 = new xo.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f106075c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f106076d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f106074a
                    Nn.f r5 = (Nn.C10803f) r5
                    if (r5 == 0) goto L_0x003f
                    com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel r5 = r5.k()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f106076d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: xo.C12321a.C2521a.C2522a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2521a(C16532g gVar) {
            this.f106073a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f106073a.collect(new C2522a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.checkout.impl.userdetails.CheckoutUserDetailsRepositoryConnection", f = "CheckoutUserDetailsRepositoryConnection.kt", l = {59, 93}, m = "submit")
    /* renamed from: xo.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f106078c;

        /* renamed from: d  reason: collision with root package name */
        Object f106079d;

        /* renamed from: e  reason: collision with root package name */
        Object f106080e;

        /* renamed from: f  reason: collision with root package name */
        Object f106081f;

        /* renamed from: g  reason: collision with root package name */
        Object f106082g;

        /* renamed from: h  reason: collision with root package name */
        Object f106083h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f106084i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C12321a f106085j;

        /* renamed from: k  reason: collision with root package name */
        int f106086k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12321a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f106085j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f106084i = obj;
            this.f106086k |= Integer.MIN_VALUE;
            return this.f106085j.a((String) null, (Map<String, ? extends Object>) null, (Map<String, String>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LNn/S;", "<anonymous>", "(LQJ/Q;)LNn/S;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.userdetails.CheckoutUserDetailsRepositoryConnection$submit$addressUpsert$1", f = "CheckoutUserDetailsRepositoryConnection.kt", l = {82, 86}, m = "invokeSuspend")
    /* renamed from: xo.a$c */
    static final class c extends l implements p<Q, C17164e<? super S>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f106087c;

        /* renamed from: d  reason: collision with root package name */
        Object f106088d;

        /* renamed from: e  reason: collision with root package name */
        int f106089e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f106090f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12321a f106091g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f106092h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f106093i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f106094j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LNn/S;", "<anonymous>", "(LQJ/Q;)LNn/S;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.checkout.impl.userdetails.CheckoutUserDetailsRepositoryConnection$submit$addressUpsert$1$getUpsertAddressDeferred$1", f = "CheckoutUserDetailsRepositoryConnection.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: xo.a$c$a  reason: collision with other inner class name */
        static final class C2524a extends l implements p<Q, C17164e<? super S>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f106095c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12321a f106096d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Map<String, Object> f106097e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2524a(C12321a aVar, Map<String, ? extends Object> map, C17164e<? super C2524a> eVar) {
                super(2, eVar);
                this.f106096d = aVar;
                this.f106097e = map;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2524a(this.f106096d, this.f106097e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super S> eVar) {
                return ((C2524a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f106095c;
                if (i10 == 0) {
                    y.b(obj);
                    x d10 = this.f106096d.f106070a;
                    Map<String, Object> map = this.f106097e;
                    this.f106095c = 1;
                    obj = d10.d(map, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.checkout.impl.userdetails.CheckoutUserDetailsRepositoryConnection$submit$addressUpsert$1$putShippingBillingDeferred$1", f = "CheckoutUserDetailsRepositoryConnection.kt", l = {61}, m = "invokeSuspend")
        /* renamed from: xo.a$c$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f106098c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12321a f106099d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f106100e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Map<String, Object> f106101f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Map<String, String> f106102g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C12321a aVar, String str, Map<String, ? extends Object> map, Map<String, String> map2, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f106099d = aVar;
                this.f106100e = str;
                this.f106101f = map;
                this.f106102g = map2;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f106099d, this.f106100e, this.f106101f, this.f106102g, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f106098c;
                if (i10 == 0) {
                    y.b(obj);
                    x d10 = this.f106099d.f106070a;
                    String str = this.f106100e;
                    Map<String, Object> map = this.f106101f;
                    Map<String, String> map2 = this.f106102g;
                    this.f106098c = 1;
                    if (d10.t(str, map, map2, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C12321a aVar, String str, Map<String, ? extends Object> map, Map<String, String> map2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f106091g = aVar;
            this.f106092h = str;
            this.f106093i = map;
            this.f106094j = map2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f106091g, this.f106092h, this.f106093i, this.f106094j, eVar);
            cVar.f106090f = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super S> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ed  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f106089e
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L_0x0041
                if (r2 == r3) goto L_0x0031
                if (r2 != r4) goto L_0x0029
                java.lang.Object r0 = r1.f106088d
                QJ.Y r0 = (QJ.Y) r0
                java.lang.Object r0 = r1.f106087c
                QJ.Y r0 = (QJ.Y) r0
                java.lang.Object r0 = r1.f106090f
                r2 = r0
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r17)     // Catch:{ all -> 0x0026 }
                r7 = r2
                r2 = r17
                goto L_0x00af
            L_0x0026:
                r0 = move-exception
                goto L_0x00b6
            L_0x0029:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0031:
                java.lang.Object r2 = r1.f106088d
                QJ.Y r2 = (QJ.Y) r2
                java.lang.Object r6 = r1.f106087c
                QJ.Y r6 = (QJ.Y) r6
                java.lang.Object r7 = r1.f106090f
                QJ.Q r7 = (QJ.Q) r7
                XH.y.b(r17)
                goto L_0x009e
            L_0x0041:
                XH.y.b(r17)
                java.lang.Object r2 = r1.f106090f
                QJ.Q r2 = (QJ.Q) r2
                xo.a$c$b r12 = new xo.a$c$b
                xo.a r7 = r1.f106091g
                java.lang.String r8 = r1.f106092h
                java.util.Map<java.lang.String, java.lang.Object> r9 = r1.f106093i
                java.util.Map<java.lang.String, java.lang.String> r10 = r1.f106094j
                r11 = 0
                r6 = r12
                r6.<init>(r7, r8, r9, r10, r11)
                r10 = 3
                r7 = 0
                r8 = 0
                r6 = r2
                r9 = r12
                QJ.Y r12 = QJ.C16314k.b(r6, r7, r8, r9, r10, r11)
                xo.a r6 = r1.f106091g
                aA.a r6 = r6.f106072c
                boolean r6 = r6.isLoggedIn()
                if (r6 == 0) goto L_0x008b
                xo.a r6 = r1.f106091g
                tf.a r6 = r6.f106071b
                boolean r6 = r6.a()
                if (r6 == 0) goto L_0x008b
                xo.a$c$a r9 = new xo.a$c$a
                xo.a r6 = r1.f106091g
                java.util.Map<java.lang.String, java.lang.Object> r7 = r1.f106093i
                r9.<init>(r6, r7, r5)
                r10 = 3
                r11 = 0
                r7 = 0
                r8 = 0
                r6 = r2
                QJ.Y r6 = QJ.C16314k.b(r6, r7, r8, r9, r10, r11)
                goto L_0x008c
            L_0x008b:
                r6 = r5
            L_0x008c:
                r1.f106090f = r2
                r1.f106087c = r12
                r1.f106088d = r6
                r1.f106089e = r3
                java.lang.Object r7 = r12.f(r1)
                if (r7 != r0) goto L_0x009b
                return r0
            L_0x009b:
                r7 = r2
                r2 = r6
                r6 = r12
            L_0x009e:
                if (r2 == 0) goto L_0x015f
                r1.f106090f = r7     // Catch:{ all -> 0x00b4 }
                r1.f106087c = r6     // Catch:{ all -> 0x00b4 }
                r1.f106088d = r2     // Catch:{ all -> 0x00b4 }
                r1.f106089e = r4     // Catch:{ all -> 0x00b4 }
                java.lang.Object r2 = r2.f(r1)     // Catch:{ all -> 0x00b4 }
                if (r2 != r0) goto L_0x00af
                return r0
            L_0x00af:
                Nn.S r2 = (Nn.S) r2     // Catch:{ all -> 0x00b4 }
                r5 = r2
                goto L_0x015f
            L_0x00b4:
                r0 = move-exception
                r2 = r7
            L_0x00b6:
                qv.e r12 = qv.e.WARN
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x00c9:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00e1
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r12, r10)
                if (r9 == 0) goto L_0x00c9
                r7.add(r8)
                goto L_0x00c9
            L_0x00e1:
                java.util.Iterator r13 = r7.iterator()
                r6 = r5
                r7 = r6
            L_0x00e7:
                boolean r8 = r13.hasNext()
                if (r8 == 0) goto L_0x015f
                java.lang.Object r8 = r13.next()
                qv.b r8 = (qv.C11819b) r8
                if (r6 != 0) goto L_0x0102
                java.lang.String r6 = "Unable to get upsert address"
                java.lang.String r6 = qv.C11818a.a(r6, r0)
                if (r6 != 0) goto L_0x00fe
                goto L_0x015f
            L_0x00fe:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x0102:
                r14 = r6
                if (r7 != 0) goto L_0x0152
                java.lang.Class r6 = r2.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r7 = 36
                java.lang.String r7 = HJ.C15854t.s1(r6, r7, r5, r4, r5)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r5, r4, r5)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x0123
                goto L_0x0129
            L_0x0123:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r7, r6)
            L_0x0129:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r9 = "main"
                boolean r7 = HJ.C15854t.b0(r7, r9, r3)
                if (r7 == 0) goto L_0x013c
                java.lang.String r7 = "m"
                goto L_0x013e
            L_0x013c:
                java.lang.String r7 = "b"
            L_0x013e:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "|"
                r9.append(r7)
                r9.append(r6)
                java.lang.String r7 = r9.toString()
            L_0x0152:
                r15 = r7
                r9 = 0
                r6 = r8
                r7 = r12
                r8 = r15
                r10 = r0
                r11 = r14
                r6.a(r7, r8, r9, r10, r11)
                r6 = r14
                r7 = r15
                goto L_0x00e7
            L_0x015f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.C12321a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12321a(x xVar, C10253a aVar, C13909a aVar2) {
        C17542s.j(xVar, "repository");
        C17542s.j(aVar, "killSwitchRepo");
        C17542s.j(aVar2, "sessionManager");
        this.f106070a = xVar;
        this.f106071b = aVar;
        this.f106072c = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15, java.util.Map<java.lang.String, java.lang.String> r16, dI.C17164e<? super Nn.S> r17) {
        /*
            r13 = this;
            r6 = r13
            r7 = r17
            boolean r0 = r7 instanceof xo.C12321a.b
            if (r0 == 0) goto L_0x0017
            r0 = r7
            xo.a$b r0 = (xo.C12321a.b) r0
            int r1 = r0.f106086k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0017
            int r1 = r1 - r2
            r0.f106086k = r1
        L_0x0015:
            r8 = r0
            goto L_0x001d
        L_0x0017:
            xo.a$b r0 = new xo.a$b
            r0.<init>(r13, r7)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r0 = r8.f106084i
            java.lang.Object r9 = eI.C17187b.f()
            int r1 = r8.f106086k
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L_0x006e
            if (r1 == r11) goto L_0x0052
            if (r1 != r10) goto L_0x004a
            java.lang.Object r1 = r8.f106083h
            Nn.S r1 = (Nn.S) r1
            java.lang.Object r2 = r8.f106082g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r8.f106081f
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = r8.f106080e
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = r8.f106079d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r8.f106078c
            xo.a r2 = (xo.C12321a) r2
            XH.y.b(r0)
            goto L_0x00af
        L_0x004a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0052:
            java.lang.Object r1 = r8.f106082g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r8.f106081f
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r8.f106080e
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r8.f106079d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.f106078c
            xo.a r5 = (xo.C12321a) r5
            XH.y.b(r0)
            r7 = r1
            r1 = r3
            r3 = r0
            r0 = r4
            goto L_0x0095
        L_0x006e:
            XH.y.b(r0)
            xo.a$c r12 = new xo.a$c
            r5 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f106078c = r6
            r0 = r14
            r8.f106079d = r0
            r1 = r15
            r8.f106080e = r1
            r2 = r16
            r8.f106081f = r2
            r8.f106082g = r7
            r8.f106086k = r11
            java.lang.Object r3 = QJ.b1.c(r12, r8)
            if (r3 != r9) goto L_0x0094
            return r9
        L_0x0094:
            r5 = r6
        L_0x0095:
            Nn.S r3 = (Nn.S) r3
            Nn.x r4 = r5.f106070a
            r8.f106078c = r5
            r8.f106079d = r0
            r8.f106080e = r1
            r8.f106081f = r2
            r8.f106082g = r7
            r8.f106083h = r3
            r8.f106086k = r10
            java.lang.Object r0 = r4.o(r0, r8)
            if (r0 != r9) goto L_0x00ae
            return r9
        L_0x00ae:
            r1 = r3
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.C12321a.a(java.lang.String, java.util.Map, java.util.Map, dI.e):java.lang.Object");
    }

    public C16532g<ShippingBillingDynamicModel> b(String str) {
        C17542s.j(str, "checkoutId");
        return new C2521a(this.f106070a.q(str));
    }
}
