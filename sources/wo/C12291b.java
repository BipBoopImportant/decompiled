package wo;

import IC.C13026h;
import Nn.C10806i;
import Nn.C10813p;
import Nn.x;
import Oo.b;
import RC.m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vg.a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import sv.C11892a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwo/b;", "Lwo/a;", "Lsv/a;", "mCommerceConfigRepository", "LNn/x;", "checkoutRepository", "LVg/a;", "getOrderSummaryUseCase", "LUg/a;", "checkoutPriceMapper", "<init>", "(Lsv/a;LNn/x;LVg/a;LUg/a;)V", "", "checkoutId", "LTJ/g;", "LRC/m;", "a", "(Ljava/lang/String;)LTJ/g;", "Lsv/a;", "b", "LNn/x;", "c", "LVg/a;", "d", "LUg/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wo.b  reason: case insensitive filesystem */
public final class C12291b implements C12290a {

    /* renamed from: a  reason: collision with root package name */
    private final C11892a f105905a;

    /* renamed from: b  reason: collision with root package name */
    private final x f105906b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Vg.a f105907c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Ug.a f105908d;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwo/b$a;", "", "LNn/i;", "checkoutPrice", "LNn/p;", "deliveryServiceType", "<init>", "(LNn/i;LNn/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/i;", "()LNn/i;", "b", "LNn/p;", "()LNn/p;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wo.b$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C10806i f105909a;

        /* renamed from: b  reason: collision with root package name */
        private final C10813p f105910b;

        public a(C10806i iVar, C10813p pVar) {
            this.f105909a = iVar;
            this.f105910b = pVar;
        }

        public final C10806i a() {
            return this.f105909a;
        }

        public final C10813p b() {
            return this.f105910b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f105909a, aVar.f105909a) && this.f105910b == aVar.f105910b;
        }

        public int hashCode() {
            C10806i iVar = this.f105909a;
            int i10 = 0;
            int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            C10813p pVar = this.f105910b;
            if (pVar != null) {
                i10 = pVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            C10806i iVar = this.f105909a;
            C10813p pVar = this.f105910b;
            return "CheckoutDetails(checkoutPrice=" + iVar + ", deliveryServiceType=" + pVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wo.b$b  reason: collision with other inner class name */
    public static final class C2509b implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f105911a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wo.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f105912a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.checkout.impl.usecase.GetCheckoutPriceUiStateUseCaseImpl$invoke$$inlined$map$1$2", f = "GetCheckoutPriceUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: wo.b$b$a$a  reason: collision with other inner class name */
            public static final class C2510a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f105913c;

                /* renamed from: d  reason: collision with root package name */
                int f105914d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f105915e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2510a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f105915e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f105913c = obj;
                    this.f105914d |= Integer.MIN_VALUE;
                    return this.f105915e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f105912a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof wo.C12291b.C2509b.a.C2510a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    wo.b$b$a$a r0 = (wo.C12291b.C2509b.a.C2510a) r0
                    int r1 = r0.f105914d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f105914d = r1
                    goto L_0x0018
                L_0x0013:
                    wo.b$b$a$a r0 = new wo.b$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f105913c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f105914d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x005b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f105912a
                    Nn.f r7 = (Nn.C10803f) r7
                    wo.b$a r2 = new wo.b$a
                    r4 = 0
                    if (r7 == 0) goto L_0x0042
                    Nn.i r5 = r7.h()
                    goto L_0x0043
                L_0x0042:
                    r5 = r4
                L_0x0043:
                    if (r7 == 0) goto L_0x004f
                    Nn.K r7 = r7.i()
                    if (r7 == 0) goto L_0x004f
                    Nn.p r4 = r7.c()
                L_0x004f:
                    r2.<init>(r5, r4)
                    r0.f105914d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: wo.C12291b.C2509b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2509b(C16532g gVar) {
            this.f105911a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f105911a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wo.b$c */
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f105916a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wo.b$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f105917a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.checkout.impl.usecase.GetCheckoutPriceUiStateUseCaseImpl$invoke$$inlined$map$2$2", f = "GetCheckoutPriceUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: wo.b$c$a$a  reason: collision with other inner class name */
            public static final class C2511a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f105918c;

                /* renamed from: d  reason: collision with root package name */
                int f105919d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f105920e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2511a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f105920e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f105918c = obj;
                    this.f105919d |= Integer.MIN_VALUE;
                    return this.f105920e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f105917a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof wo.C12291b.c.a.C2511a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    wo.b$c$a$a r0 = (wo.C12291b.c.a.C2511a) r0
                    int r1 = r0.f105919d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f105919d = r1
                    goto L_0x0018
                L_0x0013:
                    wo.b$c$a$a r0 = new wo.b$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f105918c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f105919d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f105917a
                    com.ingka.ikea.mcomsettings.MComConfig r5 = (com.ingka.ikea.mcomsettings.MComConfig) r5
                    if (r5 == 0) goto L_0x0043
                    boolean r5 = r5.r()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    goto L_0x0044
                L_0x0043:
                    r5 = 0
                L_0x0044:
                    r0.f105919d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: wo.C12291b.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f105916a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f105916a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwo/b$a;", "checkoutDetails", "", "showTotalExclTax", "LRC/m;", "<anonymous>", "(Lwo/b$a;Z)LRC/m;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.usecase.GetCheckoutPriceUiStateUseCaseImpl$invoke$3", f = "GetCheckoutPriceUiStateUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wo.b$d */
    static final class d extends l implements q<a, Boolean, C17164e<? super m>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105921c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f105922d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f105923e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12291b f105924f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12291b bVar, C17164e<? super d> eVar) {
            super(3, eVar);
            this.f105924f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, Boolean bool, C17164e<? super m> eVar) {
            d dVar = new d(this.f105924f, eVar);
            dVar.f105922d = aVar;
            dVar.f105923e = bool;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f105921c == 0) {
                y.b(obj);
                a aVar = (a) this.f105922d;
                Boolean bool = (Boolean) this.f105923e;
                C10806i a10 = aVar.a();
                if (a10 == null) {
                    return null;
                }
                C12291b bVar = this.f105924f;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                return bVar.f105907c.a(bVar.f105908d.b(a10, C16877v.n(), (a.C1128a.C1129a) null, booleanValue, aVar.b()), C13026h.a(b.f84363E5), C16877v.n(), new a.b(booleanValue, booleanValue, true, true, false, false, 16, (DefaultConstructorMarker) null));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12291b(C11892a aVar, x xVar, Vg.a aVar2, Ug.a aVar3) {
        C17542s.j(aVar, "mCommerceConfigRepository");
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar2, "getOrderSummaryUseCase");
        C17542s.j(aVar3, "checkoutPriceMapper");
        this.f105905a = aVar;
        this.f105906b = xVar;
        this.f105907c = aVar2;
        this.f105908d = aVar3;
    }

    public C16532g<m> a(String str) {
        C17542s.j(str, "checkoutId");
        return C16534i.n(new C2509b(this.f105906b.q(str)), new c(C11892a.C2450a.a(this.f105905a, false, 1, (Object) null)), new d(this, (C17164e<? super d>) null));
    }
}
