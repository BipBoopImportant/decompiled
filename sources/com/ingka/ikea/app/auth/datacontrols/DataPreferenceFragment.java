package com.ingka.ikea.app.auth.datacontrols;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import Ze.f;
import Ze.g;
import Ze.h;
import Ze.i;
import Ze.j;
import Ze.n;
import Ze.r;
import af.k;
import af.m;
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
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.dataethics.EthicsDialogData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\u001e8TX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\"R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/ingka/ikea/app/auth/datacontrols/DataPreferenceFragment;", "Lcom/ingka/ikea/app/auth/AuthDelegateFragment;", "<init>", "()V", "LZe/r;", "section", "Laf/m;", "W0", "(LZe/r;)Laf/m;", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "E0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "LCp/a;", "z0", "LCp/a;", "Z0", "()LCp/a;", "setDataEthicsNavigation", "(LCp/a;)V", "dataEthicsNavigation", "", "A0", "Ljava/lang/String;", "c1", "()Ljava/lang/String;", "destId", "B0", "LXH/o;", "L0", "pageTitle", "LZe/n;", "C0", "d1", "()LZe/n;", "viewModel", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataPreferenceFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final String f70020A0 = "data_preferences";

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f70021B0 = C16825p.b(new j(this));

    /* renamed from: C0  reason: collision with root package name */
    private final C16824o f70022C0;

    /* renamed from: z0  reason: collision with root package name */
    public Cp.a f70023z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70024c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f70024c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70024c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70025c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f70025c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70025c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70026c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f70026c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70026c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70027c = aVar;
            this.f70028d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70027c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70028d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70029c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70029c = oVar;
            this.f70030d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70030d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70029c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DataPreferenceFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f70022C0 = W.b(this, P.b(n.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    private final m W0(r rVar) {
        Iterable<Cp.c> a10 = rVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (Cp.c cVar : a10) {
            arrayList.add(Cp.c.d(cVar, 0, 0, 0, (EthicsDialogData) null, new f(this, cVar), 15, (Object) null));
        }
        String string = getString(rVar.b());
        C17542s.i(string, "getString(...)");
        return new m(arrayList, string, (String) null, (String) null, new g(), 12, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N X0(DataPreferenceFragment dataPreferenceFragment, Cp.c cVar, EthicsDialogData ethicsDialogData) {
        C17542s.j(ethicsDialogData, "it");
        C8951o f10 = rw.f.f(dataPreferenceFragment, dataPreferenceFragment.c1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            dataPreferenceFragment.Z0().a(f10, cVar.e());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(DataPreferenceFragment dataPreferenceFragment) {
        C8951o f10 = rw.f.f(dataPreferenceFragment, dataPreferenceFragment.c1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C8951o.g0(f10, "data_controls_learn_more", (C) null, (I.a) null, 6, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(DataPreferenceFragment dataPreferenceFragment, af.f fVar) {
        C17542s.j(fVar, "delegateViewModel");
        dataPreferenceFragment.d1().G(fVar);
        return C16807N.f139792a;
    }

    private final n d1() {
        return (n) this.f70022C0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e1(DataPreferenceFragment dataPreferenceFragment, List list) {
        C17542s.j(list, "sections");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object next : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            if (next instanceof r) {
                next = dataPreferenceFragment.W0((r) next);
            }
            arrayList.add(next);
            if (i10 > 0 && i10 < list.size() - 1) {
                arrayList.add(new el.d("CONSENT_DIVIDER_ID"));
            }
            i10 = i11;
        }
        Lg.d.q(dataPreferenceFragment.I0(), arrayList, false, (C17642l) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String f1(DataPreferenceFragment dataPreferenceFragment) {
        return dataPreferenceFragment.getString(We.c.f64735q);
    }

    /* access modifiers changed from: protected */
    public void E0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new af.b(new h(this)), new af.e(new i(this)), new el.c(), new k()});
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f70021B0.getValue();
    }

    public final Cp.a Z0() {
        Cp.a aVar = this.f70023z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("dataEthicsNavigation");
        return null;
    }

    public String c1() {
        return this.f70020A0;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        F<List<Object>> F10 = d1().F();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(F10, viewLifecycleOwner, new Ze.k(this));
    }
}
