package com.sugarcube.app.base.debug;

import JF.C13113u;
import JF.T;
import RE.U;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.v;
import androidx.activity.w;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.app.base.debug.a;
import com.sugarcube.app.base.debug.n;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.C5747v0;
import s0.C5834E;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/sugarcube/app/base/debug/DebugFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "LXH/N;", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "", "J", "Ljava/lang/String;", "TAG", "Lcom/sugarcube/app/base/debug/o;", "K", "LXH/o;", "t0", "()Lcom/sugarcube/app/base/debug/o;", "viewModel", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugFragment extends Hilt_DebugFragment implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f122949I = new T();

    /* renamed from: J  reason: collision with root package name */
    private final String f122950J = "DebugFragment";

    /* renamed from: K  reason: collision with root package name */
    private final C16824o f122951K;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/sugarcube/app/base/debug/DebugFragment$a", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DebugFragment f122952b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DebugFragment debugFragment) {
            super(true);
            this.f122952b = debugFragment;
        }

        public void handleOnBackPressed() {
            if (!this.f122952b.t0().G(a.C3026a.f122967a)) {
                this.f122952b.getParentFragmentManager().p1();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DebugFragment f122953a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5834E, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DebugFragment f122954a;

            a(DebugFragment debugFragment) {
                this.f122954a = debugFragment;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(DebugFragment debugFragment, a aVar) {
                C17542s.j(aVar, "action");
                debugFragment.t0().G(aVar);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(s0.C5834E r9, U0.C4889m r10, int r11) {
                /*
                    r8 = this;
                    java.lang.String r0 = "innerPadding"
                    kotlin.jvm.internal.C17542s.j(r9, r0)
                    r0 = r11 & 6
                    if (r0 != 0) goto L_0x0013
                    boolean r0 = r10.V(r9)
                    if (r0 == 0) goto L_0x0011
                    r0 = 4
                    goto L_0x0012
                L_0x0011:
                    r0 = 2
                L_0x0012:
                    r11 = r11 | r0
                L_0x0013:
                    r0 = r11 & 19
                    r1 = 18
                    if (r0 != r1) goto L_0x0025
                    boolean r0 = r10.l()
                    if (r0 != 0) goto L_0x0020
                    goto L_0x0025
                L_0x0020:
                    r10.L()
                    goto L_0x009b
                L_0x0025:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0034
                    r0 = -1
                    java.lang.String r1 = "com.sugarcube.app.base.debug.DebugFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugFragment.kt:102)"
                    r2 = -2017492760(0xffffffff87bf80e8, float:-2.881425E-34)
                    U0.C4895p.S(r2, r11, r0, r1)
                L_0x0034:
                    com.sugarcube.app.base.debug.DebugFragment r0 = r8.f122954a
                    com.sugarcube.app.base.debug.o r0 = r0.t0()
                    androidx.lifecycle.K r0 = r0.E()
                    java.lang.Object r0 = r0.getValue()
                    kotlin.jvm.internal.C17542s.g(r0)
                    r1 = r0
                    java.util.List r1 = (java.util.List) r1
                    com.sugarcube.app.base.debug.DebugFragment r0 = r8.f122954a
                    com.sugarcube.app.base.debug.o r0 = r0.t0()
                    java.util.Map r2 = r0.C()
                    com.sugarcube.app.base.debug.DebugFragment r0 = r8.f122954a
                    com.sugarcube.app.base.debug.o r0 = r0.t0()
                    androidx.lifecycle.K r3 = r0.D()
                    r0 = 1890759242(0x70b2b24a, float:4.4243096E29)
                    r10.W(r0)
                    com.sugarcube.app.base.debug.DebugFragment r0 = r8.f122954a
                    boolean r0 = r10.F(r0)
                    com.sugarcube.app.base.debug.DebugFragment r4 = r8.f122954a
                    java.lang.Object r5 = r10.D()
                    if (r0 != 0) goto L_0x0078
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r5 != r0) goto L_0x0080
                L_0x0078:
                    com.sugarcube.app.base.debug.m r5 = new com.sugarcube.app.base.debug.m
                    r5.<init>(r4)
                    r10.u(r5)
                L_0x0080:
                    r4 = r5
                    nI.l r4 = (nI.C17642l) r4
                    r10.P()
                    int r11 = r11 << 12
                    r0 = 57344(0xe000, float:8.0356E-41)
                    r7 = r11 & r0
                    r5 = r9
                    r6 = r10
                    com.sugarcube.app.base.debug.n.c(r1, r2, r3, r4, r5, r6, r7)
                    boolean r9 = U0.C4895p.J()
                    if (r9 == 0) goto L_0x009b
                    U0.C4895p.R()
                L_0x009b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.DebugFragment.b.a.b(s0.E, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        b(DebugFragment debugFragment) {
            this.f122953a = debugFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(DebugFragment debugFragment) {
            if (!debugFragment.t0().G(a.C3026a.f122967a)) {
                debugFragment.getParentFragmentManager().p1();
            }
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1128658579, i10, -1, "com.sugarcube.app.base.debug.DebugFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (DebugFragment.kt:95)");
                }
                mVar.W(1422954405);
                boolean F10 = mVar.F(this.f122953a);
                DebugFragment debugFragment = this.f122953a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new l(debugFragment);
                    mVar.u(D10);
                }
                mVar.P();
                n.e((C17631a) D10, c1.c.e(-2017492760, true, new a(this.f122953a), mVar, 54), mVar, 48);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f122955c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f122955c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f122955c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f122956c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f122956c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f122956c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f122957c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f122957c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f122957c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f122958c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f122959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f122958c = aVar;
            this.f122959d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f122958c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f122959d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f122960c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f122961d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f122960c = oVar;
            this.f122961d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f122961d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f122960c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DebugFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f122951K = W.b(this, P.b(o.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public final o t0() {
        return (o) this.f122951K.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N u0(ComposeView composeView, DebugFragment debugFragment, List list) {
        C13113u.h(composeView, (C5747v0) null, c1.c.c(-1128658579, true, new b(debugFragment)), 1, (Object) null);
        return C16807N.f139792a;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f122949I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, (Integer) null, 28, (Object) null);
        w onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.i(viewLifecycleOwner2, new a(this));
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new s1.c(viewLifecycleOwner3));
        t0().E().observe(getViewLifecycleOwner(), new n.c(new U(composeView, this)));
        return composeView;
    }
}
