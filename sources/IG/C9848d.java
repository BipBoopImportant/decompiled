package ig;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Ln.e;
import Ln.h;
import RC.m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vg.a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11523e;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sv.C11892a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 ¨\u0006#"}, d2 = {"Lig/d;", "Lig/c;", "LLn/h;", "cartRepository", "Lsv/a;", "mCommerceConfigRepository", "LVg/a;", "getOrderSummaryUseCase", "Lig/m;", "getEstimatedFamilyRewardsUseCase", "<init>", "(LLn/h;Lsv/a;LVg/a;Lig/m;)V", "Lig/d$a;", "LRC/m$b;", "familyRewardsPromotion", "LVg/a$a;", "e", "(Lig/d$a;LRC/m$b;)LVg/a$a;", "LLn/e$b;", "LVg/a$a$e;", "d", "(LLn/e$b;)LVg/a$a$e;", "LTJ/g;", "LRC/m;", "invoke", "()LTJ/g;", "a", "LVg/a;", "b", "Lig/m;", "", "c", "LTJ/g;", "showTotalExclTax", "cartPrice", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ig.d  reason: case insensitive filesystem */
public final class C9848d implements C9847c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Vg.a f74359a;

    /* renamed from: b  reason: collision with root package name */
    private final m f74360b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f74361c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16532g<a> f74362d;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lig/d$a;", "", "LLn/e;", "priceHolder", "LVg/a$a$c;", "coupon", "<init>", "(LLn/e;LVg/a$a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/e;", "b", "()LLn/e;", "LVg/a$a$c;", "()LVg/a$a$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ig.d$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e f74363a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C1128a.c f74364b;

        public a(e eVar, a.C1128a.c cVar) {
            this.f74363a = eVar;
            this.f74364b = cVar;
        }

        public final a.C1128a.c a() {
            return this.f74364b;
        }

        public final e b() {
            return this.f74363a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74363a, aVar.f74363a) && C17542s.e(this.f74364b, aVar.f74364b);
        }

        public int hashCode() {
            e eVar = this.f74363a;
            int i10 = 0;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            a.C1128a.c cVar = this.f74364b;
            if (cVar != null) {
                i10 = cVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            e eVar = this.f74363a;
            a.C1128a.c cVar = this.f74364b;
            return "CartPriceData(priceHolder=" + eVar + ", coupon=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "showTotalExclTax", "Lig/d$a;", "cartPrice", "LRC/m$b;", "familyRewards", "LRC/m;", "<anonymous>", "(ZLig/d$a;LRC/m$b;)LRC/m;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartPriceUiStateUseCaseImpl$invoke$1", f = "GetCartPriceUiStateUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ig.d$b */
    static final class b extends l implements r<Boolean, a, m.b, C17164e<? super m>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74365c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74366d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74367e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f74368f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C9848d f74369g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C9848d dVar, C17164e<? super b> eVar) {
            super(4, eVar);
            this.f74369g = dVar;
        }

        /* renamed from: i */
        public final Object l(Boolean bool, a aVar, m.b bVar, C17164e<? super m> eVar) {
            b bVar2 = new b(this.f74369g, eVar);
            bVar2.f74366d = bool;
            bVar2.f74367e = aVar;
            bVar2.f74368f = bVar;
            return bVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74365c == 0) {
                y.b(obj);
                Boolean bool = (Boolean) this.f74366d;
                a.C1128a a10 = this.f74369g.e((a) this.f74367e, (m.b) this.f74368f);
                if (a10 == null) {
                    return null;
                }
                Vg.a c10 = this.f74369g.f74359a;
                C13023e a11 = C13026h.a(Oo.b.f84363E5);
                List n10 = C16877v.n();
                boolean z10 = false;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                if (bool != null) {
                    z10 = bool.booleanValue();
                }
                return c10.a(a10, a11, n10, new a.b(booleanValue, z10, false, true, false, true, 16, (DefaultConstructorMarker) null));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ig.d$c */
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74370a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.d$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74371a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartPriceUiStateUseCaseImpl$special$$inlined$map$1$2", f = "GetCartPriceUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.d$c$a$a  reason: collision with other inner class name */
            public static final class C1329a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74372c;

                /* renamed from: d  reason: collision with root package name */
                int f74373d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74374e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1329a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74374e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74372c = obj;
                    this.f74373d |= Integer.MIN_VALUE;
                    return this.f74374e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74371a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ig.C9848d.c.a.C1329a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ig.d$c$a$a r0 = (ig.C9848d.c.a.C1329a) r0
                    int r1 = r0.f74373d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74373d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.d$c$a$a r0 = new ig.d$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74372c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74373d
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
                    TJ.h r6 = r4.f74371a
                    com.ingka.ikea.mcomsettings.MComConfig r5 = (com.ingka.ikea.mcomsettings.MComConfig) r5
                    if (r5 == 0) goto L_0x0043
                    boolean r5 = r5.r()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    goto L_0x0044
                L_0x0043:
                    r5 = 0
                L_0x0044:
                    r0.f74373d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.C9848d.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f74370a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74370a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ig.d$d  reason: collision with other inner class name */
    public static final class C1330d implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74375a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.d$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74376a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetCartPriceUiStateUseCaseImpl$special$$inlined$map$2$2", f = "GetCartPriceUiStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.d$d$a$a  reason: collision with other inner class name */
            public static final class C1331a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74377c;

                /* renamed from: d  reason: collision with root package name */
                int f74378d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74379e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1331a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74379e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74377c = obj;
                    this.f74378d |= Integer.MIN_VALUE;
                    return this.f74379e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74376a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof ig.C9848d.C1330d.a.C1331a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    ig.d$d$a$a r0 = (ig.C9848d.C1330d.a.C1331a) r0
                    int r1 = r0.f74378d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74378d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.d$d$a$a r0 = new ig.d$d$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f74377c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74378d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0064
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f74376a
                    Ln.g r7 = (Ln.g) r7
                    r2 = 0
                    if (r7 == 0) goto L_0x0040
                    Ln.e r4 = r7.c()
                    goto L_0x0041
                L_0x0040:
                    r4 = r2
                L_0x0041:
                    if (r7 == 0) goto L_0x0056
                    Ln.c r7 = r7.a()
                    if (r7 == 0) goto L_0x0056
                    Vg.a$a$c r2 = new Vg.a$a$c
                    java.lang.String r5 = r7.a()
                    java.lang.String r7 = r7.b()
                    r2.<init>(r5, r7)
                L_0x0056:
                    ig.d$a r7 = new ig.d$a
                    r7.<init>(r4, r2)
                    r0.f74378d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0064
                    return r1
                L_0x0064:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.C9848d.C1330d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1330d(C16532g gVar) {
            this.f74375a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74375a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C9848d(h hVar, C11892a aVar, Vg.a aVar2, m mVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar, "mCommerceConfigRepository");
        C17542s.j(aVar2, "getOrderSummaryUseCase");
        C17542s.j(mVar, "getEstimatedFamilyRewardsUseCase");
        this.f74359a = aVar2;
        this.f74360b = mVar;
        this.f74361c = new c(C11892a.C2450a.a(aVar, false, 1, (Object) null));
        this.f74362d = new C1330d(hVar.m());
    }

    private final a.C1128a.e d(e.b bVar) {
        return new a.C1128a.e(bVar.b(), bVar.a(), bVar.c());
    }

    /* access modifiers changed from: private */
    public final a.C1128a e(a aVar, m.b bVar) {
        e.a b10;
        e b11 = aVar.b();
        if (b11 == null || (b10 = b11.b()) == null) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Unable to update price ui state: " + this.f74362d, (Throwable) null);
                    if (a10 == null) {
                        return null;
                    }
                    str2 = C11820c.a(a10);
                }
                if (str == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar2.a(eVar, str, false, (Throwable) null, str2);
            }
            return null;
        }
        a.C1128a.e d10 = d(b10.c());
        e.b d11 = b10.d();
        a.C1128a.e d12 = d11 != null ? d(d11) : null;
        Double c10 = aVar.b().c();
        Double a11 = aVar.b().a();
        Double d13 = aVar.b().d();
        a.C1128a.c a12 = aVar.a();
        Iterable<C11523e> b12 = b10.b();
        ArrayList arrayList2 = new ArrayList(C16877v.y(b12, 10));
        for (C11523e eVar2 : b12) {
            String b13 = eVar2.b();
            String c11 = eVar2.c();
            if (c11 == null || C15854t.v0(c11)) {
                c11 = null;
            }
            arrayList2.add(new a.C1128a.d(eVar2.a(), b13, c11 != null ? C13026h.c(c11) : null));
        }
        e.b a13 = b10.a();
        return new a.C1128a(d10, d12, c10, a11, d13, a12, arrayList2, a13 != null ? d(a13) : null, new a.C1128a.b(C13026h.a(Oo.b.f84353D5), (a.C1128a.e) null), C16877v.n(), (a.C1128a.C1129a) null, bVar);
    }

    public C16532g<m> invoke() {
        return C16534i.m(this.f74361c, this.f74362d, this.f74360b.invoke(), new b(this, (C17164e<? super b>) null));
    }
}
