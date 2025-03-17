package ig;

import HJ.C15854t;
import IC.C13026h;
import Ln.e;
import Ln.h;
import RC.m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import aA.C13909a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sv.C11892a;
import tf.C10253a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"Lig/n;", "Lig/m;", "LLn/h;", "cartRepository", "Lsv/a;", "mCommerceConfigRepository", "Ltf/a;", "killSwitchRepository", "LaA/a;", "sessionManager", "LJq/c;", "familyRewardsRepository", "<init>", "(LLn/h;Lsv/a;Ltf/a;LaA/a;LJq/c;)V", "Lig/n$a;", "", "showTotalExclTax", "", "c", "(Lig/n$a;Z)D", "LTJ/g;", "LRC/m$b;", "invoke", "()LTJ/g;", "a", "LaA/a;", "b", "LJq/c;", "LTJ/g;", "d", "cartFamilyTotalPrice", "e", "input", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f74480a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Jq.c f74481b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f74482c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<a> f74483d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Double> f74484e;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lig/n$a;", "", "LLn/e$b;", "totalPrice", "", "upsellFamilySavings", "<init>", "(LLn/e$b;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/e$b;", "()LLn/e$b;", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e.b f74485a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f74486b;

        public a(e.b bVar, Double d10) {
            C17542s.j(bVar, "totalPrice");
            this.f74485a = bVar;
            this.f74486b = d10;
        }

        public final e.b a() {
            return this.f74485a;
        }

        public final Double b() {
            return this.f74486b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74485a, aVar.f74485a) && C17542s.e(this.f74486b, aVar.f74486b);
        }

        public int hashCode() {
            int hashCode = this.f74485a.hashCode() * 31;
            Double d10 = this.f74486b;
            return hashCode + (d10 == null ? 0 : d10.hashCode());
        }

        public String toString() {
            e.b bVar = this.f74485a;
            Double d10 = this.f74486b;
            return "CartPriceData(totalPrice=" + bVar + ", upsellFamilySavings=" + d10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isEnabled", "Lig/n$a;", "cartTotalPrice", "showTotalExclTax", "", "<anonymous>", "(ZLig/n$a;Z)D"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEstimatedFamilyRewardsUseCaseImpl$input$1", f = "GetEstimatedFamilyRewardsUseCase.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements r<Boolean, a, Boolean, C17164e<? super Double>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74487c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f74488d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74489e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f74490f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f74491g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, C17164e<? super b> eVar) {
            super(4, eVar);
            this.f74491g = nVar;
        }

        public final Object i(boolean z10, a aVar, boolean z11, C17164e<? super Double> eVar) {
            b bVar = new b(this.f74491g, eVar);
            bVar.f74488d = z10;
            bVar.f74489e = aVar;
            bVar.f74490f = z11;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74487c == 0) {
                y.b(obj);
                boolean z10 = this.f74488d;
                a aVar = (a) this.f74489e;
                boolean z11 = this.f74490f;
                if (z10 && aVar != null) {
                    return kotlin.coroutines.jvm.internal.b.c(this.f74491g.c(aVar, z11));
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), (a) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "inputValue", "", "hasFamilyPrivileges", "LRC/m$b;", "<anonymous>", "(DZ)LRC/m$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEstimatedFamilyRewardsUseCaseImpl$invoke$1", f = "GetEstimatedFamilyRewardsUseCase.kt", l = {68}, m = "invokeSuspend")
    static final class c extends l implements q<Double, Boolean, C17164e<? super m.b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f74492c;

        /* renamed from: d  reason: collision with root package name */
        Object f74493d;

        /* renamed from: e  reason: collision with root package name */
        double f74494e;

        /* renamed from: f  reason: collision with root package name */
        int f74495f;

        /* renamed from: g  reason: collision with root package name */
        int f74496g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f74497h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ boolean f74498i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ n f74499j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f74499j = nVar;
        }

        public final Object i(Double d10, boolean z10, C17164e<? super m.b> eVar) {
            c cVar = new c(this.f74499j, eVar);
            cVar.f74497h = d10;
            cVar.f74498i = z10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Double) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            n nVar;
            boolean z10;
            Object f10 = C17187b.f();
            int i10 = this.f74496g;
            if (i10 == 0) {
                y.b(obj);
                Double d10 = (Double) this.f74497h;
                boolean z11 = this.f74498i;
                if (d10 == null) {
                    return null;
                }
                n nVar2 = this.f74499j;
                double doubleValue = d10.doubleValue();
                Jq.c a10 = nVar2.f74481b;
                double doubleValue2 = d10.doubleValue();
                this.f74497h = d10;
                this.f74492c = d10;
                this.f74493d = nVar2;
                this.f74498i = z11;
                this.f74494e = doubleValue;
                this.f74495f = 0;
                this.f74496g = 1;
                obj2 = a10.b(doubleValue2, this);
                if (obj2 == f10) {
                    return f10;
                }
                z10 = z11;
                nVar = nVar2;
            } else if (i10 == 1) {
                z10 = this.f74498i;
                nVar = (n) this.f74493d;
                Double d11 = (Double) this.f74492c;
                Double d12 = (Double) this.f74497h;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (x.e(obj2) != null) {
                qv.e eVar = qv.e.DEBUG;
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
                        String a11 = C11818a.a("Unable to fetch estimated family reward points", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = nVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
            }
            if (x.g(obj2)) {
                obj2 = null;
            }
            Integer num = (Integer) obj2;
            if (num == null) {
                return null;
            }
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num == null) {
                return null;
            }
            String str5 = "+ " + num.intValue();
            return new m.b(z10 ? C13026h.b(Oo.b.f84373F5, str5) : C13026h.b(Oo.b.f84383G5, str5), str5);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LRC/m$b;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEstimatedFamilyRewardsUseCaseImpl$invoke$2", f = "GetEstimatedFamilyRewardsUseCase.kt", l = {97}, m = "invokeSuspend")
    static final class d extends l implements p<C16533h<? super m.b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74500c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74501d;

        d(C17164e<? super d> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(eVar);
            dVar.f74501d = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super m.b> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74500c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74501d;
                this.f74501d = hVar;
                this.f74500c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f74501d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74502a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74503a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEstimatedFamilyRewardsUseCaseImpl$special$$inlined$map$1$2", f = "GetEstimatedFamilyRewardsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.n$e$a$a  reason: collision with other inner class name */
            public static final class C1335a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74504c;

                /* renamed from: d  reason: collision with root package name */
                int f74505d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74506e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1335a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74506e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74504c = obj;
                    this.f74505d |= Integer.MIN_VALUE;
                    return this.f74506e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74503a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ig.n.e.a.C1335a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ig.n$e$a$a r0 = (ig.n.e.a.C1335a) r0
                    int r1 = r0.f74505d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74505d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.n$e$a$a r0 = new ig.n$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f74504c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74505d
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
                    TJ.h r6 = r4.f74503a
                    com.ingka.ikea.mcomsettings.MComConfig r5 = (com.ingka.ikea.mcomsettings.MComConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.r()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f74505d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.n.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f74502a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74502a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74507a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74508a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEstimatedFamilyRewardsUseCaseImpl$special$$inlined$map$2$2", f = "GetEstimatedFamilyRewardsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ig.n$f$a$a  reason: collision with other inner class name */
            public static final class C1336a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74509c;

                /* renamed from: d  reason: collision with root package name */
                int f74510d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74511e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1336a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74511e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74509c = obj;
                    this.f74510d |= Integer.MIN_VALUE;
                    return this.f74511e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f74508a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                r6 = r6.c();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ig.n.f.a.C1336a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ig.n$f$a$a r0 = (ig.n.f.a.C1336a) r0
                    int r1 = r0.f74510d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74510d = r1
                    goto L_0x0018
                L_0x0013:
                    ig.n$f$a$a r0 = new ig.n$f$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f74509c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74510d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x005c
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f74508a
                    Ln.g r6 = (Ln.g) r6
                    if (r6 == 0) goto L_0x0052
                    Ln.e r6 = r6.c()
                    if (r6 == 0) goto L_0x0052
                    ig.n$a r2 = new ig.n$a
                    Ln.e$a r4 = r6.b()
                    Ln.e$b r4 = r4.c()
                    java.lang.Double r6 = r6.d()
                    r2.<init>(r4, r6)
                    goto L_0x0053
                L_0x0052:
                    r2 = 0
                L_0x0053:
                    r0.f74510d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ig.n.f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f74507a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74507a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public n(h hVar, C11892a aVar, C10253a aVar2, C13909a aVar3, Jq.c cVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar, "mCommerceConfigRepository");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(aVar3, "sessionManager");
        C17542s.j(cVar, "familyRewardsRepository");
        this.f74480a = aVar3;
        this.f74481b = cVar;
        e eVar = new e(C11892a.C2450a.a(aVar, false, 1, (Object) null));
        this.f74482c = eVar;
        f fVar = new f(hVar.m());
        this.f74483d = fVar;
        this.f74484e = C16534i.s(C16534i.m(aVar2.y(), fVar, eVar, new b(this, (C17164e<? super b>) null)));
    }

    /* access modifiers changed from: private */
    public final double c(a aVar, boolean z10) {
        double d10;
        if (z10) {
            d10 = aVar.a().a();
        } else {
            Double b10 = aVar.a().b();
            d10 = b10 != null ? b10.doubleValue() : aVar.a().a();
        }
        Double b11 = aVar.b();
        return d10 - (b11 != null ? b11.doubleValue() : 0.0d);
    }

    public C16532g<m.b> invoke() {
        return C16534i.s(C16534i.S(C16534i.n(this.f74484e, this.f74480a.f(), new c(this, (C17164e<? super c>) null)), new d((C17164e<? super d>) null)));
    }
}
