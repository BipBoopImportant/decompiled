package Du;

import Du.a;
import Du.d;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.instore.wayfinding.impl.navigation.WayfindingRoutes$KompassMap;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sp.C11879a;
import su.C11891a;
import x4.O;
import yd.C10461o;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010A\u001a\u0004\u0018\u00010\"8BX\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010$R \u0010G\u001a\b\u0012\u0004\u0012\u00020:0B8\u0016X\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"LDu/f;", "Landroidx/lifecycle/f0;", "", "LJu/a;", "wayfindingStorage", "LFB/a;", "localStoreSelectionRepository", "Lsu/a;", "analytics", "LIl/a;", "appConfigApi", "Landroidx/lifecycle/U;", "savedStateHandle", "Lru/c;", "wayfindingIntegration", "<init>", "(LJu/a;LFB/a;Lsu/a;LIl/a;Landroidx/lifecycle/U;Lru/c;)V", "LXH/N;", "C", "()V", "", "isEnabled", "onboardingFinished", "F", "(ZZLdI/e;)Ljava/lang/Object;", "I", "(Z)V", "", "level", "J", "(Ljava/lang/Integer;)V", "LEu/a;", "G", "(Ljava/lang/Integer;)LEu/a;", "", "E", "()Ljava/lang/String;", "destinationId", "fromMfaqList", "L", "(Ljava/lang/String;Z)V", "LDu/a;", "action", "H", "(LDu/a;)V", "m", "LJu/a;", "n", "LFB/a;", "o", "Lsu/a;", "p", "LIl/a;", "q", "Landroidx/lifecycle/U;", "r", "Lru/c;", "LTJ/B;", "LDu/d;", "s", "LTJ/B;", "viewModelState", "t", "LXH/o;", "D", "productId", "LTJ/P;", "u", "LTJ/P;", "getState", "()LTJ/P;", "state", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 implements C11879a {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ju.a f80341m;

    /* renamed from: n  reason: collision with root package name */
    private final C12860a f80342n;

    /* renamed from: o  reason: collision with root package name */
    private final C11891a f80343o;

    /* renamed from: p  reason: collision with root package name */
    private final Il.a f80344p;

    /* renamed from: q  reason: collision with root package name */
    private final U f80345q;

    /* renamed from: r  reason: collision with root package name */
    private final ru.c f80346r;

    /* renamed from: s  reason: collision with root package name */
    private final C16505B<d> f80347s;

    /* renamed from: t  reason: collision with root package name */
    private final C16824o f80348t = C16825p.b(new e(this));

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<d> f80349u;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f80350a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                yd.o$b[] r0 = yd.C10461o.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yd.o$b r1 = yd.C10461o.b.MFAQ     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yd.o$b r1 = yd.C10461o.b.MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f80350a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Du.f.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements q<Boolean, Boolean, C17164e<? super C16807N>, Object> {
        b(Object obj) {
            super(3, obj, f.class, "handleWayfindingState", "handleWayfindingState(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return t(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object t(boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
            return ((f) this.receiver).F(z10, z11, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.wayfinding.impl.map.presentation.WayfindingMapViewModelImpl", f = "WayfindingMapViewModelImpl.kt", l = {74}, m = "handleWayfindingState")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80351c;

        /* renamed from: d  reason: collision with root package name */
        Object f80352d;

        /* renamed from: e  reason: collision with root package name */
        boolean f80353e;

        /* renamed from: f  reason: collision with root package name */
        boolean f80354f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f80355g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f80356h;

        /* renamed from: i  reason: collision with root package name */
        int f80357i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f80356h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80355g = obj;
            this.f80357i |= Integer.MIN_VALUE;
            return this.f80356h.F(false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Du/f$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80358a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, f fVar) {
            super(aVar);
            this.f80358a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f80358a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to update onboarding finished", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.wayfinding.impl.map.presentation.WayfindingMapViewModelImpl$onAction$2", f = "WayfindingMapViewModelImpl.kt", l = {146}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80359c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f80360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f80360d = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f80360d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80359c;
            if (i10 == 0) {
                y.b(obj);
                Ju.a i11 = this.f80360d.f80341m;
                this.f80359c = 1;
                if (i11.a(this) == f10) {
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

    public f(Ju.a aVar, C12860a aVar2, C11891a aVar3, Il.a aVar4, U u10, ru.c cVar) {
        C17542s.j(aVar, "wayfindingStorage");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(aVar3, "analytics");
        C17542s.j(aVar4, "appConfigApi");
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(cVar, "wayfindingIntegration");
        this.f80341m = aVar;
        this.f80342n = aVar2;
        this.f80343o = aVar3;
        this.f80344p = aVar4;
        this.f80345q = u10;
        this.f80346r = cVar;
        C16505B<d> a10 = C16521S.a(d.c.f80338a);
        this.f80347s = a10;
        this.f80349u = C16534i.c0(C16534i.c(a10), g0.a(this), ip.f.a(), a10.getValue());
        C();
    }

    private final void C() {
        C16534i.M(C16534i.n(C16534i.s(this.f80346r.a()), C16534i.s(this.f80341m.b()), new b(this)), g0.a(this));
    }

    private final String D() {
        return (String) this.f80348t.getValue();
    }

    private final String E() {
        C12832d c10 = this.f80342n.c();
        String e10 = c10 != null ? c10.e() : null;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("store id cannot be null, store should be selected when in wayfinding");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(boolean r6, boolean r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Du.f.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Du.f$c r0 = (Du.f.c) r0
            int r1 = r0.f80357i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80357i = r1
            goto L_0x0018
        L_0x0013:
            Du.f$c r0 = new Du.f$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f80355g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80357i
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            boolean r7 = r0.f80354f
            java.lang.Object r6 = r0.f80352d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f80351c
            Du.f r6 = (Du.f) r6
            XH.y.b(r1)
            goto L_0x0058
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            XH.y.b(r1)
            if (r6 == 0) goto L_0x0064
            ru.c r1 = r5.f80346r
            java.lang.String r3 = r5.E()
            r0.f80351c = r5
            r0.f80352d = r8
            r0.f80353e = r6
            r0.f80354f = r7
            r0.f80357i = r4
            java.lang.Object r1 = r1.b(r3, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            r6 = r5
        L_0x0058:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r8 = r1.booleanValue()
            if (r8 == 0) goto L_0x0065
            r6.I(r7)
            goto L_0x008a
        L_0x0064:
            r6 = r5
        L_0x0065:
            TJ.B<Du.d> r6 = r6.f80347s
        L_0x0067:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            Du.d r8 = (Du.d) r8
            Du.d$b r8 = new Du.d$b
            Du.b$a r0 = new Du.b$a
            int r1 = Au.c.f79160f
            IC.e r1 = IC.C13026h.a(r1)
            int r2 = Au.c.f79159e
            IC.e r2 = IC.C13026h.a(r2)
            r0.<init>(r1, r2)
            r8.<init>(r0)
            boolean r7 = r6.e(r7, r8)
            if (r7 == 0) goto L_0x0067
        L_0x008a:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Du.f.F(boolean, boolean, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Eu.a G(java.lang.Integer r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0016
            int r2 = r2.intValue()
            int r0 = Au.c.f79158d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            IC.e r2 = IC.C13026h.b(r0, r2)
            if (r2 != 0) goto L_0x001c
        L_0x0016:
            java.lang.String r2 = ""
            IC.e r2 = IC.C13026h.c(r2)
        L_0x001c:
            Eu.a r0 = new Eu.a
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Du.f.G(java.lang.Integer):Eu.a");
    }

    private final void I(boolean z10) {
        d value;
        d value2;
        if (z10) {
            C16505B<d> b10 = this.f80347s;
            do {
                value2 = b10.getValue();
                d dVar = value2;
            } while (!b10.e(value2, new d.a(new c(E(), D(), this.f80344p.i(), this.f80344p.a()), G((Integer) null))));
        } else if (!z10) {
            C16505B<d> b11 = this.f80347s;
            do {
                value = b11.getValue();
                d dVar2 = value;
            } while (!b11.e(value, d.C1517d.f80339a));
        } else {
            throw new t();
        }
    }

    private final void J(Integer num) {
        d value;
        d value2 = this.f80347s.getValue();
        if (value2 instanceof d.a) {
            d.a aVar = (d.a) value2;
            C16505B<d> b10 = this.f80347s;
            do {
                value = b10.getValue();
                d dVar = value;
            } while (!b10.e(value, d.a.b(aVar, (c) null, G(num), 1, (Object) null)));
        }
    }

    /* access modifiers changed from: private */
    public static final String K(f fVar) {
        return ((WayfindingRoutes$KompassMap) O.a(fVar.f80345q, P.b(WayfindingRoutes$KompassMap.class), X.j())).b();
    }

    private final void L(String str, boolean z10) {
        this.f80343o.e(E(), str, z10);
    }

    public void H(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.c) {
            C10461o.c a10 = ((a.c) aVar).a();
            int i10 = a.f80350a[a10.b().ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    z10 = false;
                } else {
                    throw new t();
                }
            }
            L(a10.a(), z10);
        } else if (C17542s.e(aVar, a.f.f80326a)) {
            F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
        } else if (C17542s.e(aVar, a.b.f80321a)) {
            this.f80343o.c(E());
        } else if (aVar instanceof a.C1516a) {
            J(Integer.valueOf(((a.C1516a) aVar).a()));
        } else if (C17542s.e(aVar, a.e.f80325a)) {
            this.f80343o.a(E());
        } else if (C17542s.e(aVar, a.d.f80324a)) {
            this.f80343o.i(E());
        } else {
            throw new t();
        }
    }

    public C16519P<d> getState() {
        return this.f80349u;
    }
}
