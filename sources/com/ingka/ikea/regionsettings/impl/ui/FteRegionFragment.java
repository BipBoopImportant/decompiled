package com.ingka.ikea.regionsettings.impl.ui;

import Ae.p;
import Ar.j;
import Cw.C12727a;
import HJ.C15854t;
import Rl.f;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.core.logger.DslKt;
import gy.C14522a;
import jC.C14615b;
import jC.q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import ky.g;
import l3.a;
import lC.l;
import my.C14827s;
import nI.C17631a;
import ny.C14857c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.C8951o;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0015¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016XD¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0014XD¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u0002018\u0014XD¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00104R\u001a\u0010;\u001a\u0002018\u0014XD¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b:\u00104R\u001b\u0010A\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/ingka/ikea/regionsettings/impl/ui/FteRegionFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LRl/d;", "market", "LRl/f;", "language", "LXH/N;", "Q0", "(LRl/d;LRl/f;)V", "L0", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "LAe/e;", "X", "LAe/e;", "M0", "()LAe/e;", "setAnalytics$regionsettings_implementation_release", "(LAe/e;)V", "analytics", "LAr/j;", "Y", "LAr/j;", "getFeedback$regionsettings_implementation_release", "()LAr/j;", "setFeedback$regionsettings_implementation_release", "(LAr/j;)V", "feedback", "LCw/a;", "Z", "LCw/a;", "getOnboardingNavigation$regionsettings_implementation_release", "()LCw/a;", "setOnboardingNavigation$regionsettings_implementation_release", "(LCw/a;)V", "onboardingNavigation", "", "y0", "Ljava/lang/String;", "N0", "()Ljava/lang/String;", "destId", "", "z0", "v0", "()Z", "drawUnderStatusBar", "A0", "u0", "drawUnderNavigationBar", "B0", "t0", "drawUnderDisplayCutout", "Lny/c;", "C0", "LXH/o;", "O0", "()Lny/c;", "viewModel", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FteRegionFragment extends b {

    /* renamed from: A0  reason: collision with root package name */
    private final boolean f119709A0 = true;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f119710B0 = true;

    /* renamed from: C0  reason: collision with root package name */
    private final C16824o f119711C0;

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f119712X;

    /* renamed from: Y  reason: collision with root package name */
    public j f119713Y;

    /* renamed from: Z  reason: collision with root package name */
    public C12727a f119714Z;

    /* renamed from: y0  reason: collision with root package name */
    private final String f119715y0 = "region/select";

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f119716z0 = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119717c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f119717c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119717c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119718c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f119718c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119718c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119719c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f119719c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119719c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119720c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119720c = aVar;
            this.f119721d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119720c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119721d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119722c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119722c = oVar;
            this.f119723d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119723d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119722c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FteRegionFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f119711C0 = W.b(this, P.b(C14857c.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(FteRegionFragment fteRegionFragment, Rl.d dVar, f fVar) {
        C17542s.j(dVar, "market");
        C17542s.j(fVar, "language");
        fteRegionFragment.Q0(dVar, fVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(FteRegionFragment fteRegionFragment) {
        fteRegionFragment.L0();
        return C16807N.f139792a;
    }

    private final void L0() {
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
                String a10 = C11818a.a("Region selection finished - popping!", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = FteRegionFragment.class.getName();
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
        rw.d.a(this, C14522a.C3128a.b.f127377a, "RegionSelectKey");
        C8951o.o0(androidx.navigation.fragment.a.a(this), N0(), true, false, 4, (Object) null);
    }

    private final C14857c O0() {
        return (C14857c) this.f119711C0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        l a10 = qVar.a();
        C14615b.C3152b bVar = C14615b.C3152b.f127857b;
        a10.a(bVar);
        qVar.b().a(bVar);
        return C16807N.f139792a;
    }

    private final void Q0(Rl.d dVar, f fVar) {
        String str;
        char c10;
        Class<FteRegionFragment> cls;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = FteRegionFragment.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Restarting for market: '" + dVar.c() + "' language: '" + fVar.b() + "'", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        ow.d dVar2 = (ow.d) getActivity();
        if (dVar2 != null) {
            dVar2.h(dVar.a(), fVar.a());
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No activity, could not update locale");
        qv.e eVar2 = qv.e.ERROR;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str6 == null) {
                String a11 = C11818a.a((String) null, illegalStateException);
                if (a11 != null) {
                    str6 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            if (str7 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str7, false, illegalStateException, str6);
            c10 = '$';
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(945810557);
        if (C4895p.J()) {
            C4895p.S(945810557, i10, -1, "com.ingka.ikea.regionsettings.impl.ui.FteRegionFragment.FragmentContent (FteRegionFragment.kt:63)");
        }
        M0().p(p.FTE);
        C14857c O02 = O0();
        mVar.W(-875417359);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new ky.f(this);
            mVar.u(D10);
        }
        nI.p pVar = (nI.p) D10;
        mVar.P();
        mVar.W(-875414665);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new g(this);
            mVar.u(D11);
        }
        mVar.P();
        C14827s.x(O02, pVar, (C17631a) D11, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        rw.d.a(this, C14522a.C3128a.C3129a.f127376a, "RegionSelectKey");
        b(new ky.e());
    }

    public final Ae.e M0() {
        Ae.e eVar = this.f119712X;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public String N0() {
        return this.f119715y0;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f119710B0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f119709A0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f119716z0;
    }
}
