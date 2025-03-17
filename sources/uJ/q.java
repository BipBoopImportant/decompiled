package Uj;

import Ae.l;
import EB.C12829a;
import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import MB.C13194a;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import Tj.C;
import Uj.u;
import Uj.v;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ej.C11244b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sp.C11879a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u0010\u0015J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030A8\u0016X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, d2 = {"LUj/q;", "Lsp/a;", "LUj/v;", "LUj/y;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LFB/a;", "localStoreSelectionRepository", "LTj/C;", "onboardingUseCase", "Lej/b;", "scanAndGoCleanUp", "<init>", "(Landroidx/lifecycle/U;LFB/a;LTj/C;Lej/b;)V", "LUj/v$e;", "action", "LXH/N;", "K", "(LUj/v$e;)V", "M", "()V", "H", "LUj/v$h;", "N", "(LUj/v$h;)V", "LUj/v$c;", "I", "(LUj/v$c;)V", "LMB/a$b;", "result", "Lkotlin/Function1;", "", "onSuccess", "P", "(LMB/a$b;LnI/l;)V", "", "value", "R", "(Z)V", "LIC/e;", "uiText", "Q", "(LIC/e;)V", "LUj/u;", "navAction", "F", "(LUj/u;)V", "L", "G", "(LUj/v;)V", "m", "LFB/a;", "n", "LTj/C;", "o", "Lej/b;", "LAe/l;", "p", "LAe/l;", "navArgEntryPoint", "LTJ/B;", "q", "LTJ/B;", "viewModelUiState", "LTJ/P;", "r", "LTJ/P;", "getState", "()LTJ/P;", "state", "LQJ/N;", "s", "LQJ/N;", "coroutineExceptionHandler", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends f0 implements C11879a<v, y> {

    /* renamed from: m  reason: collision with root package name */
    private final C12860a f88249m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C f88250n;

    /* renamed from: o  reason: collision with root package name */
    private final C11244b f88251o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final l f88252p;

    /* renamed from: q  reason: collision with root package name */
    private final C16505B<y> f88253q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<y> f88254r;

    /* renamed from: s  reason: collision with root package name */
    private final N f88255s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoOnboardingFragmentViewModel$onConfirm$1", f = "ScanAndGoOnboardingFragmentViewModel.kt", l = {89}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88256c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f88257d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f88258e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v.e f88259f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar, v.e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f88258e = qVar;
            this.f88259f = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f88258e, this.f88259f, eVar);
            aVar.f88257d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f88256c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f88257d;
                C k10 = this.f88258e.f88250n;
                C12832d a10 = this.f88259f.a();
                l j10 = this.f88258e.f88252p;
                this.f88257d = q11;
                this.f88256c = 1;
                Object a11 = k10.a(a10, j10, this);
                if (a11 == f10) {
                    return f10;
                }
                q10 = q11;
                obj2 = a11;
            } else if (i10 == 1) {
                q10 = (Q) this.f88257d;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q qVar = this.f88258e;
            v.e eVar = this.f88259f;
            if (x.h(obj2)) {
                C16807N n10 = (C16807N) obj2;
                qVar.R(false);
                qVar.F(new u.c(eVar.a().e(), qVar.f88252p));
            }
            q qVar2 = this.f88258e;
            Throwable e10 = x.e(obj2);
            if (e10 != null) {
                e eVar2 = e.VERBOSE;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a12 = C11818a.a((String) null, e10);
                        if (a12 == null) {
                            break;
                        }
                        str = C11820c.a(a12);
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
                    bVar.a(eVar2, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                qVar2.Q(C13026h.a(Oo.b.f84843y3));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoOnboardingFragmentViewModel$onStorePickerResult$2", f = "ScanAndGoOnboardingFragmentViewModel.kt", l = {152}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88260c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f88261d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f88262e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13194a.b f88263f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f88264g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, C13194a.b bVar, C17642l<? super String, C16807N> lVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f88262e = qVar;
            this.f88263f = bVar;
            this.f88264g = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f88262e, this.f88263f, this.f88264g, eVar);
            bVar.f88261d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f88260c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f88261d;
                C k10 = this.f88262e.f88250n;
                C12832d dVar = new C12832d(((C13194a.b.C2743a) this.f88263f).b(), ((C13194a.b.C2743a) this.f88263f).c(), (String) null, ((C13194a.b.C2743a) this.f88263f).d(), C12829a.Companion.a(((C13194a.b.C2743a) this.f88263f).a()), 4, (DefaultConstructorMarker) null);
                l j10 = this.f88262e.f88252p;
                this.f88261d = q11;
                this.f88260c = 1;
                Object a10 = k10.a(dVar, j10, this);
                if (a10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj2 = a10;
            } else if (i10 == 1) {
                q10 = (Q) this.f88261d;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C17642l<String, C16807N> lVar = this.f88264g;
            C13194a.b bVar = this.f88263f;
            if (x.h(obj2)) {
                C16807N n10 = (C16807N) obj2;
                lVar.invoke(((C13194a.b.C2743a) bVar).b());
            }
            q qVar = this.f88262e;
            Throwable e10 = x.e(obj2);
            if (e10 != null) {
                e eVar = e.VERBOSE;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a((String) null, e10);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
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
                    bVar2.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                qVar.Q(C13026h.a(Oo.b.f84843y3));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Uj/q$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f88265a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, q qVar) {
            super(aVar);
            this.f88265a = qVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f88265a.Q(C13026h.a(Oo.b.f84843y3));
        }
    }

    public q(U u10, C12860a aVar, C c10, C11244b bVar) {
        y value;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(c10, "onboardingUseCase");
        C17542s.j(bVar, "scanAndGoCleanUp");
        this.f88249m = aVar;
        this.f88250n = c10;
        this.f88251o = bVar;
        Object f10 = u10.f("entryPoint");
        if (f10 != null) {
            l a10 = l.Companion.a((String) f10);
            this.f88252p = a10 == null ? l.UNKNOWN : a10;
            C16505B<y> a11 = C16521S.a(new y(false, (x) null, (w) null, (u) null, 15, (DefaultConstructorMarker) null));
            this.f88253q = a11;
            this.f88254r = a11;
            this.f88255s = new c(N.f137593c0, this);
            do {
                value = a11.getValue();
            } while (!a11.e(value, y.b(value, false, (x) null, new w(this.f88249m.c()), (u) null, 10, (Object) null)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void F(u uVar) {
        y value;
        if (uVar instanceof u.c) {
            this.f88251o.b(((u.c) uVar).b());
        }
        C16505B<y> b10 = this.f88253q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, false, (x) null, (w) null, uVar, 6, (Object) null)));
    }

    private final void H() {
        F(u.b.f88269a);
    }

    private final void I(v.c cVar) {
        P(cVar.a(), new o());
    }

    /* access modifiers changed from: private */
    public static final C16807N J(String str) {
        C17542s.j(str, "it");
        return C16807N.f139792a;
    }

    private final void K(v.e eVar) {
        R(true);
        F0 unused = C16314k.d(g0.a(this), this.f88255s, (T) null, new a(this, eVar, (C17164e<? super a>) null), 2, (Object) null);
    }

    private final void L() {
        y value;
        C16505B<y> b10 = this.f88253q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, false, (x) null, (w) null, (u) null, 6, (Object) null)));
    }

    private final void M() {
        F(u.d.f88272a);
    }

    private final void N(v.h hVar) {
        P(hVar.a(), new p(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N O(q qVar, String str) {
        C17542s.j(str, "storeId");
        qVar.F(new u.c(str, qVar.f88252p));
        return C16807N.f139792a;
    }

    private final void P(C13194a.b bVar, C17642l<? super String, C16807N> lVar) {
        C13194a.b bVar2 = bVar;
        if (bVar2 instanceof C13194a.b.C2743a) {
            C16505B<y> b10 = this.f88253q;
            while (true) {
                y value = b10.getValue();
                C13194a.b.C2743a aVar = (C13194a.b.C2743a) bVar2;
                if (b10.e(value, y.b(value, true, (x) null, new w(new C12832d(aVar.b(), aVar.c(), (String) null, aVar.d(), C12829a.Companion.a(aVar.a()), 4, (DefaultConstructorMarker) null)), (u) null, 8, (Object) null))) {
                    F0 unused = C16314k.d(g0.a(this), this.f88255s, (T) null, new b(this, bVar2, lVar, (C17164e<? super b>) null), 2, (Object) null);
                    return;
                }
                C17642l<? super String, C16807N> lVar2 = lVar;
            }
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void Q(C13023e eVar) {
        y value;
        C16505B<y> b10 = this.f88253q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, false, new x(eVar), (w) null, (u) null, 12, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void R(boolean z10) {
        y value;
        C16505B<y> b10 = this.f88253q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, y.b(value, z10, (x) null, (w) null, (u) null, 14, (Object) null)));
    }

    public void G(v vVar) {
        y value;
        y value2;
        C17542s.j(vVar, "action");
        if (vVar instanceof v.b) {
            H();
        } else if (C17542s.e(vVar, v.a.f88273a)) {
            L();
        } else if (C17542s.e(vVar, v.d.f88276a)) {
            C16505B<y> b10 = this.f88253q;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, y.b(value2, false, (x) null, (w) null, u.a.f88268a, 7, (Object) null)));
        } else if (vVar instanceof v.e) {
            K((v.e) vVar);
        } else if (vVar instanceof v.h) {
            N((v.h) vVar);
        } else if (vVar instanceof v.c) {
            I((v.c) vVar);
        } else if (C17542s.e(vVar, v.f.f88278a)) {
            M();
        } else if (C17542s.e(vVar, v.g.f88279a)) {
            C16505B<y> b11 = this.f88253q;
            do {
                value = b11.getValue();
            } while (!b11.e(value, y.b(value, false, (x) null, (w) null, (u) null, 13, (Object) null)));
        } else {
            throw new t();
        }
    }

    public C16519P<y> getState() {
        return this.f88254r;
    }
}
