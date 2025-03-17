package Hm;

import Am.a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Jm.c;
import Jm.d;
import Jm.e;
import Jm.f;
import Jm.g;
import KJ.C15985a;
import Mm.h;
import QJ.Q;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0018068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b+\u0010=R\u0014\u0010@\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"LHm/e;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LAm/a;", "benefitsRepository", "LLm/a;", "benefitApplinkUriMapper", "Lsf/c;", "appUserDataRepository", "<init>", "(Landroidx/lifecycle/U;LAm/a;LLm/a;Lsf/c;)V", "", "id", "LXH/N;", "K", "(Ljava/lang/String;)V", "LAm/a$a;", "benefits", "O", "(LAm/a$a;)V", "LMm/a;", "H", "(Ljava/lang/String;)LMm/a;", "LJm/f;", "state", "LJm/e;", "N", "(LJm/f;)LJm/e;", "benefit", "", "L", "(LMm/a;)Z", "LJm/b;", "M", "(LMm/a;)LJm/b;", "uiState", "P", "(LJm/e;)V", "LJm/d;", "event", "Q", "(LJm/d;)V", "m", "Landroidx/lifecycle/U;", "n", "LLm/a;", "o", "Lsf/c;", "p", "LXH/o;", "J", "()Z", "consumeTakeATour", "LTJ/B;", "q", "LTJ/B;", "viewModelState", "LTJ/P;", "r", "LTJ/P;", "()LTJ/P;", "I", "()LAm/a$a;", "benefitResult", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final U f81334m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Lm.a f81335n;

    /* renamed from: o  reason: collision with root package name */
    private final C10242c f81336o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o f81337p = C16825p.b(new d(this));
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<f> f81338q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<Jm.e> f81339r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17525a implements p<a.C1458a, C17164e<? super C16807N>, Object> {
        a(Object obj) {
            super(2, obj, e.class, "onBenefitsResult", "onBenefitsResult(Lcom/ingka/ikea/benefits/BenefitsRepository$FamilyBenefitResult;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(a.C1458a aVar, C17164e<? super C16807N> eVar) {
            return ((e) this.f144363a).O(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.benefits.impl.presentation.BenefitsListViewModel$handleBenefitSelected$1", f = "BenefitsListViewModel.kt", l = {82}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f81341d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81342e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Mm.a f81343f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, String str, Mm.a aVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f81341d = eVar;
            this.f81342e = str;
            this.f81343f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f81341d, this.f81342e, this.f81343f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f81340c;
            if (i10 == 0) {
                y.b(obj);
                Lm.a k10 = this.f81341d.f81335n;
                String str = this.f81342e;
                Interaction$Component interaction$Component = Interaction$Component.BENEFITS;
                this.f81340c = 1;
                obj = k10.a(str, interaction$Component, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) obj;
            if (str2 == null) {
                C16505B D10 = this.f81341d.f81338q;
                Mm.a aVar = this.f81343f;
                do {
                    value2 = D10.getValue();
                } while (!D10.e(value2, f.b((f) value2, (a.C1458a) null, new c.C1623c(aVar.d()), 1, (Object) null)));
            } else {
                C16505B D11 = this.f81341d.f81338q;
                do {
                    value = D11.getValue();
                } while (!D11.e(value, f.b((f) value, (a.C1458a) null, new c.a(g.a(str2), (DefaultConstructorMarker) null), 1, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<Jm.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f81344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f81345b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f81346a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f81347b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.benefits.impl.presentation.BenefitsListViewModel$special$$inlined$map$1$2", f = "BenefitsListViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Hm.e$c$a$a  reason: collision with other inner class name */
            public static final class C1586a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f81348c;

                /* renamed from: d  reason: collision with root package name */
                int f81349d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f81350e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1586a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f81350e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f81348c = obj;
                    this.f81349d |= Integer.MIN_VALUE;
                    return this.f81350e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, e eVar) {
                this.f81346a = hVar;
                this.f81347b = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Hm.e.c.a.C1586a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Hm.e$c$a$a r0 = (Hm.e.c.a.C1586a) r0
                    int r1 = r0.f81349d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f81349d = r1
                    goto L_0x0018
                L_0x0013:
                    Hm.e$c$a$a r0 = new Hm.e$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f81348c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f81349d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f81346a
                    Jm.f r5 = (Jm.f) r5
                    Hm.e r2 = r4.f81347b
                    Jm.e r5 = r2.N(r5)
                    r0.f81349d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Hm.e.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, e eVar) {
            this.f81344a = gVar;
            this.f81345b = eVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f81344a.collect(new a(hVar, this.f81345b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJm/f;", "it", "LXH/N;", "<anonymous>", "(LJm/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.benefits.impl.presentation.BenefitsListViewModel$uiState$1", f = "BenefitsListViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81351c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f81352d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f81353e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f81353e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f81353e, eVar);
            dVar.f81352d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(f fVar, C17164e<? super C16807N> eVar) {
            return ((d) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f81351c == 0) {
                y.b(obj);
                f fVar = (f) this.f81352d;
                e eVar = this.f81353e;
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("ViewModelState: " + fVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = eVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar2, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hm.e$e  reason: collision with other inner class name */
    /* synthetic */ class C1587e extends C17525a implements p<Jm.e, C17164e<? super C16807N>, Object> {
        C1587e(Object obj) {
            super(2, obj, e.class, "onEachUiState", "onEachUiState(Lcom/ingka/ikea/benefits/impl/presentation/model/BenefitsList$UiState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(Jm.e eVar, C17164e<? super C16807N> eVar2) {
            return ((e) this.f144363a).P(eVar);
        }
    }

    public e(U u10, Am.a aVar, Lm.a aVar2, C10242c cVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "benefitsRepository");
        C17542s.j(aVar2, "benefitApplinkUriMapper");
        C17542s.j(cVar, "appUserDataRepository");
        this.f81334m = u10;
        this.f81335n = aVar2;
        this.f81336o = cVar;
        C16505B<f> a10 = C16521S.a(new f((a.C1458a) null, (Jm.c) null, 3, (DefaultConstructorMarker) null));
        this.f81338q = a10;
        this.f81339r = C16534i.c0(C16534i.R(new c(C16534i.R(a10, new d(this, (C17164e<? super d>) null)), this), new C1587e(this)), g0.a(this), ip.f.a(), new e.a((Jm.c) null, 1, (DefaultConstructorMarker) null));
        C16534i.M(C16534i.R(aVar.c(), new a(this)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public static final boolean G(e eVar) {
        Boolean bool = (Boolean) eVar.f81334m.f("is_take_a_tour_key");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final Mm.a H(String str) {
        Mm.d a10 = I().a();
        Mm.a b10 = a10 != null ? a10.b(str) : null;
        if (b10 == null) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a11 = C11818a.a("Benefit " + str + " not found in state: " + P.b(I().getClass()), (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = e.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public final a.C1458a I() {
        return this.f81338q.getValue().c();
    }

    private final boolean J() {
        return ((Boolean) this.f81337p.getValue()).booleanValue();
    }

    private final void K(String str) {
        Mm.b a10;
        String a11;
        Mm.a H10 = H(str);
        if (H10 != null && (a10 = H10.a()) != null && (a11 = a10.a()) != null) {
            Km.a.b(this, new b(this, a11, H10, (C17164e<? super b>) null));
        }
    }

    private final boolean L(Mm.a aVar) {
        Iterable<Mm.e> e10 = aVar.e();
        ArrayList arrayList = new ArrayList(C16877v.y(e10, 10));
        for (Mm.e a10 : e10) {
            arrayList.add(a10.a());
        }
        return arrayList.contains(Mm.f.IMAGE);
    }

    private final Jm.b M(Mm.a aVar) {
        C13023e eVar;
        Object obj;
        String b10;
        String d10 = aVar.d();
        C13023e c10 = C13026h.c(aVar.f());
        C13023e c11 = C13026h.c(aVar.b());
        h c12 = aVar.c();
        Iterator it = aVar.e().iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Mm.e) obj).a() == Mm.f.IMAGE) {
                break;
            }
        }
        Mm.e eVar2 = (Mm.e) obj;
        String b11 = eVar2 != null ? eVar2.b() : null;
        if (b11 == null) {
            b11 = "";
        }
        String str = b11;
        Mm.b a10 = aVar.a();
        if (!(a10 == null || (b10 = a10.b()) == null)) {
            eVar = C13026h.c(b10);
        }
        return new Jm.b(d10, c10, c11, str, c12, eVar);
    }

    /* access modifiers changed from: private */
    public final Jm.e N(f fVar) {
        Mm.d a10 = fVar.c().a();
        List<Mm.a> a11 = a10 != null ? a10.a() : null;
        if (a11 == null) {
            a11 = C16877v.n();
        }
        if (a11.isEmpty() && (fVar.c() instanceof a.C1458a.b)) {
            return new e.a(fVar.d());
        }
        Jm.c d10 = fVar.d();
        ArrayList<Mm.a> arrayList = new ArrayList<>();
        for (Object next : a11) {
            if (L((Mm.a) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (Mm.a M10 : arrayList) {
            arrayList2.add(M(M10));
        }
        return new e.b(C15985a.h(arrayList2), d10);
    }

    /* access modifiers changed from: private */
    public final void O(a.C1458a aVar) {
        f value;
        C16505B<f> b10 = this.f81338q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, f.b(value, aVar, (Jm.c) null, 2, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void P(Jm.e eVar) {
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("UiState: " + eVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = e.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar2, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if ((eVar instanceof e.b) && J()) {
            this.f81336o.f(true);
        }
    }

    public final void Q(Jm.d dVar) {
        f value;
        f value2;
        C17542s.j(dVar, "event");
        if (dVar instanceof d.a) {
            C16505B<f> b10 = this.f81338q;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, f.b(value2, (a.C1458a) null, c.b.f82617a, 1, (Object) null)));
        } else if (dVar instanceof d.b) {
            K(((d.b) dVar).a());
        } else if (dVar instanceof d.c) {
            C16505B<f> b11 = this.f81338q;
            do {
                value = b11.getValue();
            } while (!b11.e(value, f.b(value, (a.C1458a) null, (Jm.c) null, 1, (Object) null)));
        } else {
            throw new t();
        }
    }

    public final C16519P<Jm.e> m() {
        return this.f81339r;
    }
}
