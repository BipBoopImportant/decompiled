package com.ingka.ikea.app.auth.policies;

import Ar.j;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import af.k;
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
import com.ingka.ikea.app.auth.policies.c;
import com.ingka.ikea.dataethics.EthicsDialogData;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.util.List;
import jf.C9913d;
import kf.C9977a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import p000if.f;
import p000if.g;
import p000if.h;
import x4.C8951o;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0016XD¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00106\u001a\u00020-8TX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00101R\u001a\u0010<\u001a\u0002078\u0014XD¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/ingka/ikea/app/auth/policies/PoliciesFragment;", "Lcom/ingka/ikea/app/auth/AuthDelegateFragment;", "<init>", "()V", "LXH/N;", "g1", "c1", "Lkf/a;", "error", "m1", "(Lkf/a;)V", "e1", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LEo/a;", "z0", "LEo/a;", "X0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LCp/a;", "A0", "LCp/a;", "Y0", "()LCp/a;", "setDataEthicsNavigation", "(LCp/a;)V", "dataEthicsNavigation", "LAr/j;", "B0", "LAr/j;", "a1", "()LAr/j;", "setFeedback$profile_implementation_release", "(LAr/j;)V", "feedback", "", "C0", "Ljava/lang/String;", "Z0", "()Ljava/lang/String;", "destId", "D0", "LXH/o;", "L0", "pageTitle", "", "E0", "Z", "H0", "()Z", "excludeLastItemDecoration", "Lcom/ingka/ikea/app/auth/policies/b;", "F0", "b1", "()Lcom/ingka/ikea/app/auth/policies/b;", "viewModel", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PoliciesFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public Cp.a f70143A0;

    /* renamed from: B0  reason: collision with root package name */
    public j f70144B0;

    /* renamed from: C0  reason: collision with root package name */
    private final String f70145C0 = "policies";

    /* renamed from: D0  reason: collision with root package name */
    private final C16824o f70146D0 = C16825p.b(new h(this));

    /* renamed from: E0  reason: collision with root package name */
    private final boolean f70147E0 = true;

    /* renamed from: F0  reason: collision with root package name */
    private final C16824o f70148F0;

    /* renamed from: z0  reason: collision with root package name */
    public Eo.a f70149z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70150c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f70150c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70150c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70151c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f70151c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70151c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70152c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f70152c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70152c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70153c = aVar;
            this.f70154d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70153c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70154d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70155c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70155c = oVar;
            this.f70156d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70156d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70155c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PoliciesFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f70148F0 = W.b(this, P.b(b.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    private final b b1() {
        return (b) this.f70148F0.getValue();
    }

    private final void c1() {
        F<C9977a> C10 = b1().C();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(C10, viewLifecycleOwner, new f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(PoliciesFragment policiesFragment, C9977a aVar) {
        C17542s.j(aVar, UiComponentContainer.RESULT_ERROR);
        if (aVar instanceof C9977a.C1360a) {
            policiesFragment.m1(aVar);
        } else if (aVar instanceof C9977a.b) {
            policiesFragment.m1(aVar);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void e1() {
        F<String> E10 = b1().E();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(E10, viewLifecycleOwner, new p000if.e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(PoliciesFragment policiesFragment, String str) {
        C17542s.j(str, "url");
        policiesFragment.X0().a(policiesFragment.getContext(), str);
        return C16807N.f139792a;
    }

    private final void g1() {
        F<List<c>> F10 = b1().F();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(F10, viewLifecycleOwner, new g(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: af.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: jf.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: af.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: af.m} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final XH.C16807N h1(com.ingka.ikea.app.auth.policies.PoliciesFragment r17, java.util.List r18) {
        /*
            r0 = r17
            r1 = r18
            java.lang.String r2 = "sections"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = 10
            int r4 = YH.C16877v.y(r1, r2)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r1.next()
            com.ingka.ikea.app.auth.policies.c r4 = (com.ingka.ikea.app.auth.policies.c) r4
            boolean r5 = r4 instanceof com.ingka.ikea.app.auth.policies.c.b
            if (r5 == 0) goto L_0x003e
            jf.b r5 = new jf.b
            com.ingka.ikea.app.auth.policies.c$b r4 = (com.ingka.ikea.app.auth.policies.c.b) r4
            java.util.List r4 = r4.a()
            r5.<init>(r4)
            if.b r4 = new if.b
            r4.<init>(r0)
            r5.e(r4)
            goto L_0x00a8
        L_0x003e:
            boolean r5 = r4 instanceof com.ingka.ikea.app.auth.policies.c.a
            if (r5 == 0) goto L_0x00ad
            r5 = r4
            com.ingka.ikea.app.auth.policies.c$a r5 = (com.ingka.ikea.app.auth.policies.c.a) r5
            java.util.List r6 = r5.b()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            int r7 = YH.C16877v.y(r6, r2)
            r8.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r6.next()
            r9 = r7
            Cp.c r9 = (Cp.c) r9
            if.c r14 = new if.c
            r14.<init>(r0, r9)
            r15 = 15
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            Cp.c r7 = Cp.c.d(r9, r10, r11, r12, r13, r14, r15, r16)
            r8.add(r7)
            goto L_0x0058
        L_0x007a:
            int r6 = r5.e()
            java.lang.String r9 = r0.getString(r6)
            java.lang.String r6 = "getString(...)"
            kotlin.jvm.internal.C17542s.i(r9, r6)
            int r7 = r5.a()
            java.lang.String r10 = r0.getString(r7)
            kotlin.jvm.internal.C17542s.i(r10, r6)
            int r5 = r5.c()
            java.lang.String r11 = r0.getString(r5)
            kotlin.jvm.internal.C17542s.i(r11, r6)
            if.d r12 = new if.d
            r12.<init>(r0, r4)
            af.m r5 = new af.m
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x00a8:
            r3.add(r5)
            goto L_0x001a
        L_0x00ad:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x00b3:
            Lg.d r2 = r17.I0()
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            Lg.d.q(r2, r3, r4, r5, r6, r7)
            android.view.View r0 = r17.K0()
            r1 = 8
            r0.setVisibility(r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.policies.PoliciesFragment.h1(com.ingka.ikea.app.auth.policies.PoliciesFragment, java.util.List):XH.N");
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(PoliciesFragment policiesFragment, String str) {
        C17542s.j(str, "url");
        policiesFragment.b1().G(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(PoliciesFragment policiesFragment, Cp.c cVar, EthicsDialogData ethicsDialogData) {
        C17542s.j(ethicsDialogData, "it");
        C8951o f10 = rw.f.f(policiesFragment, policiesFragment.Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            policiesFragment.Y0().a(f10, cVar.e());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(PoliciesFragment policiesFragment, c cVar) {
        policiesFragment.b1().G(((c.a) cVar).d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String l1(PoliciesFragment policiesFragment) {
        return policiesFragment.getString(We.c.f64741w);
    }

    private final void m1(C9977a aVar) {
        j a12 = a1();
        Context context = getContext();
        String string = getString(aVar.b());
        C17542s.i(string, "getString(...)");
        j.a.k(a12, context, string, getString(aVar.a()), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new k(), new C9913d()});
    }

    /* access modifiers changed from: protected */
    public boolean H0() {
        return this.f70147E0;
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f70146D0.getValue();
    }

    public final Eo.a X0() {
        Eo.a aVar = this.f70149z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final Cp.a Y0() {
        Cp.a aVar = this.f70143A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("dataEthicsNavigation");
        return null;
    }

    public String Z0() {
        return this.f70145C0;
    }

    public final j a1() {
        j jVar = this.f70144B0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        g1();
        c1();
        e1();
    }
}
