package com.ingka.ikea.app.auth.help;

import Ar.j;
import IC.C13023e;
import IC.C13026h;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13589g1;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import bf.f;
import bf.g;
import bf.h;
import bf.i;
import bf.l;
import bf.m;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.util.ArrayList;
import java.util.List;
import kf.C9977a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import vl.n;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0016XD¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020%8TX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010)R\u001a\u00104\u001a\u00020/8\u0014XD¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/ingka/ikea/app/auth/help/HelpFragment;", "Lcom/ingka/ikea/app/auth/AuthDelegateFragment;", "<init>", "()V", "LXH/N;", "c1", "Y0", "Lkf/a;", "error", "g1", "(Lkf/a;)V", "a1", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LEo/a;", "z0", "LEo/a;", "V0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LAr/j;", "A0", "LAr/j;", "W0", "()LAr/j;", "setFeedback$profile_implementation_release", "(LAr/j;)V", "feedback", "", "B0", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "C0", "LXH/o;", "L0", "pageTitle", "", "D0", "Z", "H0", "()Z", "excludeLastItemDecoration", "Lbf/m;", "E0", "X0", "()Lbf/m;", "viewModel", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HelpFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public j f70034A0;

    /* renamed from: B0  reason: collision with root package name */
    private final String f70035B0 = "help";

    /* renamed from: C0  reason: collision with root package name */
    private final C16824o f70036C0 = C16825p.b(new g(this));

    /* renamed from: D0  reason: collision with root package name */
    private final boolean f70037D0 = true;

    /* renamed from: E0  reason: collision with root package name */
    private final C16824o f70038E0;

    /* renamed from: z0  reason: collision with root package name */
    public Eo.a f70039z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70040c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f70040c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70040c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70041c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f70041c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70041c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70042c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f70042c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70042c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70043c = aVar;
            this.f70044d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70043c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70044d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70045c = oVar;
            this.f70046d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70046d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70045c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public HelpFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f70038E0 = W.b(this, P.b(m.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    private final m X0() {
        return (m) this.f70038E0.getValue();
    }

    private final void Y0() {
        F<C9977a> C10 = X0().C();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(C10, viewLifecycleOwner, new f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N Z0(HelpFragment helpFragment, C9977a aVar) {
        C17542s.j(aVar, UiComponentContainer.RESULT_ERROR);
        if (aVar instanceof C9977a.C1360a) {
            helpFragment.g1(aVar);
        } else if (aVar instanceof C9977a.b) {
            helpFragment.g1(aVar);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void a1() {
        F<String> E10 = X0().E();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(E10, viewLifecycleOwner, new h(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(HelpFragment helpFragment, String str) {
        C17542s.j(str, "url");
        helpFragment.V0().a(helpFragment.getContext(), str);
        return C16807N.f139792a;
    }

    private final void c1() {
        F<List<l>> F10 = X0().F();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(F10, viewLifecycleOwner, new i(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(HelpFragment helpFragment, List list) {
        List list2 = list;
        C17542s.j(list2, "sections");
        Iterable iterable = list2;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            l lVar = (l) next;
            arrayList.add(new n.b(String.valueOf(i10), (String) null, C13589g1.Large, false, new bf.e(helpFragment, lVar), (C17631a) null, C13026h.c(lVar.a()), (C13023e) null, (C13573c1) null, C13569b1.f.f116152b, false, (p) null, 3498, (DefaultConstructorMarker) null));
            i10 = i11;
        }
        Lg.d.q(helpFragment.I0(), arrayList, false, (C17642l) null, 6, (Object) null);
        helpFragment.K0().setVisibility(8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e1(HelpFragment helpFragment, l lVar) {
        helpFragment.X0().G(lVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String f1(HelpFragment helpFragment) {
        return helpFragment.getString(We.c.f64740v);
    }

    private final void g1(C9977a aVar) {
        j W02 = W0();
        Context context = getContext();
        String string = getString(aVar.b());
        C17542s.i(string, "getString(...)");
        j.a.k(W02, context, string, getString(aVar.a()), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new vl.m()});
    }

    /* access modifiers changed from: protected */
    public boolean H0() {
        return this.f70037D0;
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f70036C0.getValue();
    }

    public final Eo.a V0() {
        Eo.a aVar = this.f70039z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final j W0() {
        j jVar = this.f70034A0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        K0().setVisibility(0);
        c1();
        Y0();
        a1();
    }
}
