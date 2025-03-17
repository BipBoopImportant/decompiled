package ig;

import IC.C13026h;
import Ln.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import ag.k;
import dI.C17164e;
import eI.C17187b;
import ip.g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.s;
import qx.C14956a;
import tf.C10253a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lig/p;", "Lig/o;", "LLn/h;", "cartRepository", "LIl/a;", "appConfigApi", "LaA/a;", "sessionManager", "Ltf/a;", "killSwitchRepository", "<init>", "(LLn/h;LIl/a;LaA/a;Ltf/a;)V", "", "isFamilyRewardsEnabled", "hasFamilyPrivileges", "isLoggedIn", "", "familyDiscount", "Lag/k;", "b", "(ZZZLjava/lang/Double;)Lag/k;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "LIl/a;", "LaA/a;", "c", "Ltf/a;", "d", "LTJ/g;", "upsellFamilySavings", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f74512a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f74513b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f74514c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<Double> f74515d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "upsellFamilySavings", "", "isLoggedIn", "hasFamilyPrivileges", "isFamilyRewardsEnabled", "Lag/k;", "<anonymous>", "(DZZZ)Lag/k;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetFamilyPromotionBannerUseCaseImpl$invoke$1", f = "GetFamilyPromotionBannerUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements s<Double, Boolean, Boolean, Boolean, C17164e<? super k>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74516c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74517d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f74518e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f74519f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ boolean f74520g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f74521h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C17164e<? super a> eVar) {
            super(5, eVar);
            this.f74521h = pVar;
        }

        public final Object i(Double d10, boolean z10, boolean z11, boolean z12, C17164e<? super k> eVar) {
            a aVar = new a(this.f74521h, eVar);
            aVar.f74517d = d10;
            aVar.f74518e = z10;
            aVar.f74519f = z11;
            aVar.f74520g = z12;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74516c == 0) {
                y.b(obj);
                boolean z10 = this.f74518e;
                boolean z11 = this.f74519f;
                boolean z12 = this.f74520g;
                return this.f74521h.b(z12, z11, z10, (Double) this.f74517d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((Double) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (C17164e) obj5);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74522a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74523a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetFamilyPromotionBannerUseCaseImpl$special$$inlined$map$1$2", f = "GetFamilyPromotionBannerUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.p$b$a$a  reason: collision with other inner class name */
            public static final class C1337a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74524c;

                /* renamed from: d  reason: collision with root package name */
                int f74525d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74526e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1337a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74526e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74524c = obj;
                    this.f74525d |= Integer.MIN_VALUE;
                    return this.f74526e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74523a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                r5 = r5.c();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ig.p.b.a.C1337a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ig.p$b$a$a r0 = (ig.p.b.a.C1337a) r0
                    int r1 = r0.f74525d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74525d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.p$b$a$a r0 = new ig.p$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74524c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74525d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f74523a
                    Ln.g r5 = (Ln.g) r5
                    if (r5 == 0) goto L_0x0045
                    Ln.e r5 = r5.c()
                    if (r5 == 0) goto L_0x0045
                    java.lang.Double r5 = r5.d()
                    goto L_0x0046
                L_0x0045:
                    r5 = 0
                L_0x0046:
                    r0.f74525d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.p.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f74522a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74522a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public p(h hVar, Il.a aVar, C13909a aVar2, C10253a aVar3) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "sessionManager");
        C17542s.j(aVar3, "killSwitchRepository");
        this.f74512a = aVar;
        this.f74513b = aVar2;
        this.f74514c = aVar3;
        this.f74515d = new b(hVar.m());
    }

    /* access modifiers changed from: private */
    public final k b(boolean z10, boolean z11, boolean z12, Double d10) {
        boolean z13 = false;
        boolean z14 = (d10 == null || C17542s.a(d10, 0.0d)) && z12;
        String str = null;
        if (z11 || z14) {
            return null;
        }
        if (d10 != null && d10.doubleValue() > 0.0d) {
            z13 = true;
        }
        int i10 = z12 ? Oo.b.f84444M6 : z10 ? z13 ? Oo.b.f84404I6 : Oo.b.f84414J6 : z13 ? Oo.b.f84434L6 : Oo.b.f84424K6;
        if (d10 != null) {
            if (!g.a(Double.valueOf(d10.doubleValue()), 0.0d)) {
                d10 = null;
            }
            if (d10 != null) {
                str = C14956a.f130484a.b(d10.doubleValue(), this.f74512a.s());
            }
        }
        return new k(str, C13026h.a(i10), z12);
    }

    public C16532g<k> invoke() {
        return C16534i.l(this.f74515d, this.f74513b.n(), this.f74513b.f(), this.f74514c.y(), new a(this, (C17164e<? super a>) null));
    }
}
