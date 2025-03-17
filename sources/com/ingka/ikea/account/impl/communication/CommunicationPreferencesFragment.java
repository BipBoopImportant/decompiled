package com.ingka.ikea.account.impl.communication;

import Ar.j;
import Eo.a;
import Oo.b;
import Ud.c;
import Ud.e;
import Ud.f;
import Wd.C9347b;
import Wd.t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import cD.C14029a;
import com.ingka.ikea.account.impl.dynamicfields.d;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import dl.C11210o;
import dl.C11211p;
import il.C11404d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import pg.H;
import pg.p;
import qg.i;
import qg.v;
import sg.g;
import sg.m;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0005J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010\u001dJ\u000f\u00101\u001a\u00020\u0006H\u0014¢\u0006\u0004\b1\u0010\u0005R\"\u00109\u001a\u0002028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020\u001a8TX\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010Z\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b#\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010aR\u0016\u0010d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010cR\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010W¨\u0006g"}, d2 = {"Lcom/ingka/ikea/account/impl/communication/CommunicationPreferencesFragment;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateFragment;", "Lsg/g;", "Lsg/m;", "<init>", "()V", "LXH/N;", "h1", "", "withDiff", "l1", "(Z)V", "a1", "k1", "e1", "c1", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "key", "p0", "(Ljava/lang/String;)V", "title", "body", "n", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/recyclerview/widget/RecyclerView;", "E0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "position", "scrollTo", "a", "(IZ)V", "i0", "(I)V", "h0", "(I)I", "f0", "url", "j", "N0", "LcD/a;", "z0", "LcD/a;", "Y0", "()LcD/a;", "setEditProfileRepository", "(LcD/a;)V", "editProfileRepository", "LEo/a;", "A0", "LEo/a;", "X0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LAr/j;", "B0", "LAr/j;", "Z0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LIl/a;", "C0", "LIl/a;", "W0", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "D0", "LXH/o;", "L0", "()Ljava/lang/String;", "pageTitle", "Z", "H0", "()Z", "excludeLastItemDecoration", "Lcom/ingka/ikea/account/impl/dynamicfields/d;", "F0", "Lcom/ingka/ikea/account/impl/dynamicfields/d;", "consentsViewModel", "", "", "Ljava/util/List;", "consentSections", "Ljava/lang/String;", "lastSwitchedKey", "I0", "consentLoading", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommunicationPreferencesFragment extends a implements g, m {

    /* renamed from: A0  reason: collision with root package name */
    public a f69464A0;

    /* renamed from: B0  reason: collision with root package name */
    public j f69465B0;

    /* renamed from: C0  reason: collision with root package name */
    public Il.a f69466C0;

    /* renamed from: D0  reason: collision with root package name */
    private final C16824o f69467D0 = C16825p.b(new Ud.a(this));

    /* renamed from: E0  reason: collision with root package name */
    private final boolean f69468E0 = true;

    /* renamed from: F0  reason: collision with root package name */
    private d f69469F0;

    /* renamed from: G0  reason: collision with root package name */
    private final List<Object> f69470G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    private String f69471H0 = "";

    /* renamed from: I0  reason: collision with root package name */
    private boolean f69472I0;

    /* renamed from: z0  reason: collision with root package name */
    public C14029a f69473z0;

    private final void a1() {
        d dVar = this.f69469F0;
        if (dVar == null) {
            C17542s.z("consentsViewModel");
            dVar = null;
        }
        F<ip.d<String>> g02 = dVar.g0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(g02, viewLifecycleOwner, new f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(CommunicationPreferencesFragment communicationPreferencesFragment, ip.d dVar) {
        C17542s.j(dVar, "it");
        View view = communicationPreferencesFragment.getView();
        if (view != null) {
            j Z02 = communicationPreferencesFragment.Z0();
            String string = communicationPreferencesFragment.getString(b.f84321A3);
            C17542s.i(string, "getString(...)");
            j.a.s(Z02, view, string, (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
        }
        communicationPreferencesFragment.k1();
        return C16807N.f139792a;
    }

    private final void c1() {
        d dVar = this.f69469F0;
        if (dVar == null) {
            C17542s.z("consentsViewModel");
            dVar = null;
        }
        F<Boolean> m02 = dVar.m0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(m02, viewLifecycleOwner, new e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(CommunicationPreferencesFragment communicationPreferencesFragment, boolean z10) {
        ArrayList<v> arrayList = new ArrayList<>();
        for (Object next : communicationPreferencesFragment.f69470G0) {
            if (next instanceof v) {
                arrayList.add(next);
            }
        }
        for (v vVar : arrayList) {
            vVar.q(z10);
            communicationPreferencesFragment.I0().g(vVar, C11404d.ENABLED_STATE_CHANGED);
        }
        return C16807N.f139792a;
    }

    private final void e1() {
        d dVar = this.f69469F0;
        d dVar2 = null;
        if (dVar == null) {
            C17542s.z("consentsViewModel");
            dVar = null;
        }
        F<Boolean> n02 = dVar.n0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(n02, viewLifecycleOwner, new Ud.b(this));
        d dVar3 = this.f69469F0;
        if (dVar3 == null) {
            C17542s.z("consentsViewModel");
        } else {
            dVar2 = dVar3;
        }
        F<Boolean> l02 = dVar2.l0();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ip.j.a(l02, viewLifecycleOwner2, new c(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(CommunicationPreferencesFragment communicationPreferencesFragment, boolean z10) {
        communicationPreferencesFragment.f69472I0 = z10;
        communicationPreferencesFragment.K0().setVisibility(communicationPreferencesFragment.f69472I0 ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(CommunicationPreferencesFragment communicationPreferencesFragment, boolean z10) {
        communicationPreferencesFragment.f69472I0 = z10;
        communicationPreferencesFragment.K0().setVisibility(communicationPreferencesFragment.f69472I0 ? 0 : 8);
        return C16807N.f139792a;
    }

    private final void h1() {
        d dVar = this.f69469F0;
        if (dVar == null) {
            C17542s.z("consentsViewModel");
            dVar = null;
        }
        F<t> e02 = dVar.e0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(e02, viewLifecycleOwner, new Ud.d(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(CommunicationPreferencesFragment communicationPreferencesFragment, t tVar) {
        C17542s.j(tVar, "fields");
        ArrayList arrayList = new ArrayList();
        if (!C17542s.e(tVar, d.f69514Q.c())) {
            boolean z10 = false;
            for (i iVar : tVar.a()) {
                boolean z11 = iVar instanceof v;
                if (z11 && z10) {
                    arrayList.add(new el.d("CONSENT_DIVIDER_ID"));
                }
                arrayList.add(iVar);
                z10 = z11;
            }
        }
        communicationPreferencesFragment.f69470G0.clear();
        communicationPreferencesFragment.f69470G0.add(new C11210o("TOP_SPACING_ID", 40));
        communicationPreferencesFragment.f69470G0.addAll(arrayList);
        m1(communicationPreferencesFragment, false, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String j1(CommunicationPreferencesFragment communicationPreferencesFragment) {
        return communicationPreferencesFragment.getString(b.f84429L1);
    }

    private final void k1() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f69470G0) {
            if (next instanceof v) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((v) obj).e(), this.f69471H0)) {
                break;
            }
        }
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.r(Boolean.valueOf(!((Boolean) vVar.j()).booleanValue()));
            I0().g(vVar, C11404d.VALUE_CHANGED);
        }
    }

    private final void l1(boolean z10) {
        Lg.d.q(I0(), this.f69470G0, z10, (C17642l) null, 4, (Object) null);
    }

    static /* synthetic */ void m1(CommunicationPreferencesFragment communicationPreferencesFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        communicationPreferencesFragment.l1(z10);
    }

    /* access modifiers changed from: protected */
    public void E0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new C11211p(), new p(this), new H(this, this), new el.c()});
    }

    /* access modifiers changed from: protected */
    public boolean H0() {
        return this.f69468E0;
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f69467D0.getValue();
    }

    /* access modifiers changed from: protected */
    public void N0() {
        androidx.navigation.fragment.a.a(this).k0();
    }

    public final Il.a W0() {
        Il.a aVar = this.f69466C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final a X0() {
        a aVar = this.f69464A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final C14029a Y0() {
        C14029a aVar = this.f69473z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("editProfileRepository");
        return null;
    }

    public final j Z0() {
        j jVar = this.f69465B0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void a(int i10, boolean z10) {
    }

    public void f0() {
    }

    public int h0(int i10) {
        return 0;
    }

    public void i0(int i10) {
    }

    public void j(String str) {
        C17542s.j(str, "url");
        X0().a(getContext(), str);
    }

    public boolean k0() {
        return g.a.a(this);
    }

    public void n(String str, String str2) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        FullscreenDialogFragment.a.b(FullscreenDialogFragment.f94870N, str, (String) null, str2, 0, (FullscreenDialogFragment.b) null, 26, (Object) null).show(getParentFragmentManager(), "fullscreen_dialog");
    }

    public void onDestroyView() {
        M0().setAdapter((RecyclerView.h) null);
        M0().setLayoutManager((RecyclerView.q) null);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f69469F0 = (d) new i0((k0) this, (i0.c) d.a.b(d.f69514Q, W0(), new Ud.i(Y0()), (C9347b) null, false, 12, (Object) null)).a(d.class);
        h1();
        e1();
        a1();
        c1();
        view.setFocusableInTouchMode(true);
    }

    public void p0(String str) {
        C17542s.j(str, "key");
        this.f69471H0 = str;
        d dVar = this.f69469F0;
        if (dVar == null) {
            C17542s.z("consentsViewModel");
            dVar = null;
        }
        dVar.x0(true);
    }
}
