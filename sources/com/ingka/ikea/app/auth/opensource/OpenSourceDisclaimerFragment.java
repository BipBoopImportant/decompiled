package com.ingka.ikea.app.auth.opensource;

import Ar.j;
import HJ.C15854t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.core.logger.DslKt;
import el.C11248a;
import gf.C9729a;
import gf.C9730b;
import gf.C9731c;
import gf.C9732d;
import gf.C9733e;
import gf.C9734f;
import gf.C9737i;
import gf.m;
import hf.C9783a;
import hf.C9784b;
import hf.C9786d;
import hf.C9787e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lf.C10021d;
import lf.C10022e;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rw.f;
import x4.C8951o;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\u00048TX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010(R\u001b\u00102\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/ingka/ikea/app/auth/opensource/OpenSourceDisclaimerFragment;", "Lcom/ingka/ikea/app/auth/AuthDelegateFragment;", "<init>", "()V", "", "url", "LXH/N;", "j", "(Ljava/lang/String;)V", "c1", "f1", "a1", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LEo/a;", "z0", "LEo/a;", "V0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LAr/j;", "A0", "LAr/j;", "Y0", "()LAr/j;", "setFeedback$profile_implementation_release", "(LAr/j;)V", "feedback", "B0", "Ljava/lang/String;", "X0", "()Ljava/lang/String;", "destId", "C0", "LXH/o;", "L0", "pageTitle", "Lgf/i;", "D0", "Z0", "()Lgf/i;", "viewModel", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenSourceDisclaimerFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public j f70128A0;

    /* renamed from: B0  reason: collision with root package name */
    private final String f70129B0 = "open_source_disclaimer";

    /* renamed from: C0  reason: collision with root package name */
    private final C16824o f70130C0 = C16825p.b(new C9734f(this));

    /* renamed from: D0  reason: collision with root package name */
    private final C16824o f70131D0;

    /* renamed from: z0  reason: collision with root package name */
    public Eo.a f70132z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70133c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f70133c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70133c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70134c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f70134c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70134c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70135c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f70135c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70135c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70136c = aVar;
            this.f70137d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70136c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70137d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70138c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70138c = oVar;
            this.f70139d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70139d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70138c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public OpenSourceDisclaimerFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f70131D0 = W.b(this, P.b(C9737i.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(OpenSourceDisclaimerFragment openSourceDisclaimerFragment, String str) {
        C17542s.j(str, "url");
        openSourceDisclaimerFragment.j(str);
        return C16807N.f139792a;
    }

    private final C9737i Z0() {
        return (C9737i) this.f70131D0.getValue();
    }

    private final void a1() {
        K0().setVisibility(0);
        F<List<C9729a>> G10 = Z0().G();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(G10, viewLifecycleOwner, new C9732d(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(OpenSourceDisclaimerFragment openSourceDisclaimerFragment, List list) {
        C17542s.j(list, "sections");
        Iterable<C9729a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C9729a aVar : iterable) {
            List q10 = C16877v.q(new C9787e(aVar.b(), aVar.d(), aVar.a()), new el.b("1", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null), new C9784b(aVar.c()));
            arrayList.add(new C10022e((long) (aVar.e().hashCode() + q10.hashCode()), new SpannableString(aVar.e()), (Spannable) null, q10, false, 20, (DefaultConstructorMarker) null));
        }
        Lg.d.q(openSourceDisclaimerFragment.I0(), arrayList, false, (C17642l) null, 6, (Object) null);
        openSourceDisclaimerFragment.K0().setVisibility(8);
        return C16807N.f139792a;
    }

    private final void c1() {
        F<m> H10 = Z0().H();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(H10, viewLifecycleOwner, new C9733e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(OpenSourceDisclaimerFragment openSourceDisclaimerFragment, m mVar) {
        C17542s.j(mVar, "status");
        if (mVar instanceof m.a) {
            openSourceDisclaimerFragment.f1();
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(mVar + " is not supported.");
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = openSourceDisclaimerFragment.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
        }
        openSourceDisclaimerFragment.K0().setVisibility(8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String e1(OpenSourceDisclaimerFragment openSourceDisclaimerFragment) {
        return openSourceDisclaimerFragment.getString(Oo.b.f84726n5);
    }

    private final void f1() {
        j.a.j(Y0(), requireActivity(), Oo.b.f84536V8, Integer.valueOf(Oo.b.f84812v3), false, 0, new C9731c(this), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(OpenSourceDisclaimerFragment openSourceDisclaimerFragment) {
        C8951o f10 = f.f(openSourceDisclaimerFragment, openSourceDisclaimerFragment.X0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    private final void j(String str) {
        V0().a(getContext(), str);
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new C10021d(new C9786d(new C9730b(this)), new C9783a(), new C11248a())});
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f70130C0.getValue();
    }

    public final Eo.a V0() {
        Eo.a aVar = this.f70132z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public String X0() {
        return this.f70129B0;
    }

    public final j Y0() {
        j jVar = this.f70128A0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        a1();
        c1();
        C9737i Z02 = Z0();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        C9737i.F(Z02, requireContext, (String) null, 2, (Object) null);
    }
}
