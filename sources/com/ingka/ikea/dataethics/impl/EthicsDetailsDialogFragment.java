package com.ingka.ikea.dataethics.impl;

import Ar.j;
import Dp.e;
import Dp.f;
import Eo.a;
import Gp.g;
import Hp.b;
import Hp.c;
import Lg.d;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.dataethics.EthicsDialogData;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dl.C11212q;
import dl.r;
import el.C11248a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0000@\u0000X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u0002088BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020<8BX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/ingka/ikea/dataethics/impl/EthicsDetailsDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/dataethics/EthicsDialogData;", "ethicsDialogData", "LXH/N;", "H0", "(Lcom/ingka/ikea/dataethics/EthicsDialogData;)V", "Q0", "M0", "I0", "LHp/b;", "error", "R0", "(LHp/b;)V", "K0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "LHp/c;", "sections", "", "", "E0", "(Ljava/util/List;)Ljava/util/List;", "onStart", "LEo/a;", "P", "LEo/a;", "B0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LAr/j;", "Q", "LAr/j;", "D0", "()LAr/j;", "setFeedback$dataethics_implementation_release", "(LAr/j;)V", "feedback", "LLg/d;", "R", "LLg/d;", "_ethicsDetailsAdapter", "LEp/a;", "S", "LEp/a;", "_binding", "LHp/d;", "T", "LHp/d;", "viewModel", "LGp/g;", "U", "LXH/o;", "G0", "()LGp/g;", "safeArgs", "C0", "()LLg/d;", "ethicsDetailsAdapter", "A0", "()LEp/a;", "binding", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EthicsDetailsDialogFragment extends Hilt_EthicsDetailsDialogFragment {

    /* renamed from: P  reason: collision with root package name */
    public a f95469P;

    /* renamed from: Q  reason: collision with root package name */
    public j f95470Q;

    /* renamed from: R  reason: collision with root package name */
    private d f95471R;

    /* renamed from: S  reason: collision with root package name */
    private Ep.a f95472S;

    /* renamed from: T  reason: collision with root package name */
    private Hp.d f95473T;

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f95474U = C16825p.b(new Dp.a(this));

    private final Ep.a A0() {
        Ep.a aVar = this.f95472S;
        C17542s.g(aVar);
        return aVar;
    }

    private final d C0() {
        d dVar = this.f95471R;
        C17542s.g(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(EthicsDetailsDialogFragment ethicsDetailsDialogFragment, c cVar) {
        Hp.d dVar = ethicsDetailsDialogFragment.f95473T;
        if (dVar == null) {
            C17542s.z("viewModel");
            dVar = null;
        }
        dVar.G(((c.d) cVar).b());
        return C16807N.f139792a;
    }

    private final g G0() {
        return (g) this.f95474U.getValue();
    }

    private final void H0(EthicsDialogData ethicsDialogData) {
        if (getContext() != null) {
            this.f95473T = (Hp.d) new i0((k0) this, Hp.d.f81674s.a(ethicsDialogData)).a(Hp.d.class);
        }
    }

    private final void I0() {
        Hp.d dVar = this.f95473T;
        if (dVar == null) {
            C17542s.z("viewModel");
            dVar = null;
        }
        F<b> C10 = dVar.C();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(C10, viewLifecycleOwner, new Dp.c(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(EthicsDetailsDialogFragment ethicsDetailsDialogFragment, b bVar) {
        C17542s.j(bVar, UiComponentContainer.RESULT_ERROR);
        if (bVar instanceof b.a) {
            ethicsDetailsDialogFragment.R0(bVar);
            return C16807N.f139792a;
        }
        throw new t();
    }

    private final void K0() {
        Hp.d dVar = this.f95473T;
        if (dVar == null) {
            C17542s.z("viewModel");
            dVar = null;
        }
        F<String> D10 = dVar.D();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(D10, viewLifecycleOwner, new e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(EthicsDetailsDialogFragment ethicsDetailsDialogFragment, String str) {
        C17542s.j(str, "url");
        ethicsDetailsDialogFragment.B0().a(ethicsDetailsDialogFragment.getContext(), str);
        return C16807N.f139792a;
    }

    private final void M0() {
        Hp.d dVar = this.f95473T;
        if (dVar == null) {
            C17542s.z("viewModel");
            dVar = null;
        }
        F<List<c>> E10 = dVar.E();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(E10, viewLifecycleOwner, new Dp.d(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(EthicsDetailsDialogFragment ethicsDetailsDialogFragment, List list) {
        C17542s.j(list, "sections");
        d.q(ethicsDetailsDialogFragment.C0(), ethicsDetailsDialogFragment.E0(list), false, (C17642l) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void O0(EthicsDetailsDialogFragment ethicsDetailsDialogFragment, View view) {
        ethicsDetailsDialogFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public static final g P0(EthicsDetailsDialogFragment ethicsDetailsDialogFragment) {
        g.a aVar = g.f81184e;
        Bundle requireArguments = ethicsDetailsDialogFragment.requireArguments();
        C17542s.i(requireArguments, "requireArguments(...)");
        return aVar.a(requireArguments);
    }

    private final void Q0() {
        this.f95471R = new d((Lg.a<?>[]) new Lg.a[]{new Fp.a(), new C11212q(), new C11248a(), new Fp.d()});
        RecyclerView recyclerView = A0().f80744b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(C0());
    }

    private final void R0(b bVar) {
        j D02 = D0();
        Context context = getContext();
        String string = getString(bVar.b());
        C17542s.i(string, "getString(...)");
        j.a.k(D02, context, string, getString(bVar.a()), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
    }

    public final a B0() {
        a aVar = this.f95469P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final j D0() {
        j jVar = this.f95470Q;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final List<Object> E0(List<? extends c> list) {
        List<? extends c> list2 = list;
        C17542s.j(list2, "sections");
        ArrayList arrayList = new ArrayList();
        ArrayList<c> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            if (((c) next).a(requireContext)) {
                arrayList2.add(next);
            }
        }
        for (c cVar : arrayList2) {
            if (cVar instanceof c.a) {
                arrayList.add(new el.b("DIVIDER_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
                arrayList.add(new r.a(((c.a) cVar).b(), (String) null, (Integer) null, (Integer) null, r.c.H4, 0, (Integer) null, 32, (Integer) null, 32, (Integer) null, 1390, (DefaultConstructorMarker) null));
            } else if (cVar instanceof c.e) {
                arrayList.add(new r.a(((c.e) cVar).b(), (String) null, (Integer) null, (Integer) null, r.c.BodyMediumBold, 0, (Integer) null, 0, (Integer) null, 0, (Integer) null, 1390, (DefaultConstructorMarker) null));
            } else if (cVar instanceof c.b) {
                EthicsDialogData b10 = ((c.b) cVar).b();
                arrayList.add(new Fp.e(b10.getImage(), b10.getTitle(), b10.getMessage()));
            } else if (cVar instanceof c.C1592c) {
                arrayList.add(new r.a(((c.C1592c) cVar).b(), (String) null, (Integer) null, (Integer) null, r.c.BodyMedium, 0, (Integer) null, 0, (Integer) null, 32, (Integer) null, 1390, (DefaultConstructorMarker) null));
            } else if (cVar instanceof c.d) {
                arrayList.add(new el.b("DIVIDER_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
                arrayList.add(new Fp.c(new f(this, cVar)));
            } else {
                throw new t();
            }
        }
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f95472S = Ep.a.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = A0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f95471R = null;
        this.f95472S = null;
        super.onDestroyView();
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) A0().getRoot().findViewById(Uo.a.f88327h);
        toolbar.setNavigationOnClickListener(new Dp.b(this));
        toolbar.setNavigationIcon(C6012a.e(view.getContext(), C18146a.f148142M2));
        toolbar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
        int parseInt = Integer.parseInt(G0().a());
        int parseInt2 = Integer.parseInt(G0().d());
        int parseInt3 = Integer.parseInt(G0().b());
        String decode = Uri.decode(G0().c());
        C17542s.i(decode, "decode(...)");
        H0(new EthicsDialogData(parseInt, parseInt2, parseInt3, decode));
        Q0();
        M0();
        I0();
        K0();
    }
}
