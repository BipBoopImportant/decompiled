package com.sugarcube.app.base.ui.hybrid;

import OE.n;
import QE.J;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.google.android.material.snackbar.Snackbar;
import com.sugarcube.app.base.ui.hybrid.C14247a;
import com.sugarcube.app.base.ui.utils.BouncingBallView;
import com.sugarcube.core.logger.AnyKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridDoneFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "Lcom/sugarcube/app/base/ui/hybrid/a$c;", "uiState", "LXH/N;", "H0", "(Lcom/sugarcube/app/base/ui/hybrid/a$c;)V", "S0", "Q0", "()LXH/N;", "R0", "T0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "P", "Ljava/lang/String;", "TAG", "LQE/J;", "Q", "LQE/J;", "_binding", "Lcom/sugarcube/app/base/ui/hybrid/a;", "R", "LXH/o;", "J0", "()Lcom/sugarcube/app/base/ui/hybrid/a;", "viewModel", "I0", "()LQE/J;", "binding", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridDoneFragment extends Hilt_HybridDoneFragment {

    /* renamed from: P  reason: collision with root package name */
    private final String f124799P = AnyKt.SUGARCUBE_TAG;

    /* renamed from: Q  reason: collision with root package name */
    private J f124800Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f124801R;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124802a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.sugarcube.app.base.ui.hybrid.a$c[] r0 = com.sugarcube.app.base.ui.hybrid.C14247a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.hybrid.a$c r1 = com.sugarcube.app.base.ui.hybrid.C14247a.c.AlreadyLoggedIn     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.hybrid.a$c r1 = com.sugarcube.app.base.ui.hybrid.C14247a.c.PrivacyPolicy     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.app.base.ui.hybrid.a$c r1 = com.sugarcube.app.base.ui.hybrid.C14247a.c.LoggedOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f124802a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridDoneFragment.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124803a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124803a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124803a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124803a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124804c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f124804c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f124804c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124805c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f124805c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f124805c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f124806c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f124806c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f124806c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124807c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124808d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f124807c = aVar;
            this.f124808d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f124807c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f124808d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124809c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124810d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f124809c = oVar;
            this.f124810d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f124810d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f124809c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public HybridDoneFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f124801R = W.b(this, P.b(C14247a.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final void H0(C14247a.c cVar) {
        J I02 = I0();
        boolean z10 = cVar == C14247a.c.PrivacyPolicy;
        LinearLayout linearLayout = I02.f114382f;
        C17542s.i(linearLayout, "loggedInUserButtonsLayout");
        linearLayout.setVisibility(cVar == C14247a.c.AlreadyLoggedIn || z10 ? 0 : 8);
        LinearLayout linearLayout2 = I02.f114380d;
        C17542s.i(linearLayout2, "guestUserButtonsLayout");
        linearLayout2.setVisibility(cVar == C14247a.c.LoggedOut ? 0 : 8);
        int i10 = a.f124802a[cVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            TextView textView = I02.f114378b;
            C17542s.i(textView, "captionCaptureEnd");
            textView.setVisibility(0);
            I02.f114378b.setText(getText(n.f113465u1));
        } else if (i10 != 3) {
            TextView textView2 = I02.f114378b;
            C17542s.i(textView2, "captionCaptureEnd");
            textView2.setVisibility(8);
        } else {
            TextView textView3 = I02.f114378b;
            C17542s.i(textView3, "captionCaptureEnd");
            textView3.setVisibility(0);
            I02.f114378b.setText(getText(n.f113282T0));
        }
    }

    private final J I0() {
        J j10 = this.f124800Q;
        C17542s.g(j10);
        return j10;
    }

    private final C14247a J0() {
        return (C14247a) this.f124801R.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(HybridDoneFragment hybridDoneFragment, Boolean bool) {
        if (bool.booleanValue()) {
            hybridDoneFragment.S0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(HybridDoneFragment hybridDoneFragment, C14247a.c cVar) {
        String str = hybridDoneFragment.f124799P;
        Log.d(str, "uiState: " + cVar);
        C17542s.g(cVar);
        hybridDoneFragment.H0(cVar);
        BouncingBallView bouncingBallView = hybridDoneFragment.I0().f114388l;
        if (cVar == C14247a.c.LoggingIn) {
            C17542s.g(bouncingBallView);
            bouncingBallView.setVisibility(0);
            bouncingBallView.b();
        } else {
            bouncingBallView.c();
            C17542s.g(bouncingBallView);
            bouncingBallView.setVisibility(8);
        }
        if (cVar == C14247a.c.GoToGallery) {
            E0 u02 = hybridDoneFragment.u0();
            u02.w1().b().captureEndGoToRooms(u02.y1(), u02.r1(), u02.e1(), u02.d1());
            hybridDoneFragment.Q0();
        }
        if (cVar == C14247a.c.PrivacyPolicy) {
            hybridDoneFragment.u0().n2();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void M0(HybridDoneFragment hybridDoneFragment, View view) {
        E0 u02 = hybridDoneFragment.u0();
        u02.w1().b().captureEndLogin(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        hybridDoneFragment.R0();
    }

    /* access modifiers changed from: private */
    public static final void N0(HybridDoneFragment hybridDoneFragment, View view) {
        E0 u02 = hybridDoneFragment.u0();
        u02.w1().b().captureEndSignup(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        hybridDoneFragment.T0();
    }

    /* access modifiers changed from: private */
    public static final void O0(HybridDoneFragment hybridDoneFragment, View view) {
        E0 u02 = hybridDoneFragment.u0();
        u02.w1().b().captureEndGoToRooms(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        hybridDoneFragment.Q0();
    }

    /* access modifiers changed from: private */
    public static final void P0(HybridDoneFragment hybridDoneFragment, View view) {
        E0 u02 = hybridDoneFragment.u0();
        u02.w1().b().captureEndMaybeLater(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        hybridDoneFragment.Q0();
    }

    private final C16807N Q0() {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        activity.finish();
        return C16807N.f139792a;
    }

    private final void R0() {
        C14247a J02 = J0();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        J02.L(requireActivity);
    }

    private final void S0() {
        ConstraintLayout b10;
        J I02 = I0();
        if (I02 != null && (b10 = I02.getRoot()) != null) {
            String string = getResources().getString(n.f113336b5);
            C17542s.i(string, "getString(...)");
            Snackbar q02 = Snackbar.q0(b10, string, -1);
            C17542s.i(q02, "make(...)");
            u0().a2();
            View K10 = q02.K();
            C17542s.i(K10, "getView(...)");
            K10.setBackgroundColor(-16777216);
            q02.b0();
        }
    }

    private final void T0() {
        C14247a J02 = J0();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        J02.M(requireActivity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().c(J0());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        J c10 = J.c(layoutInflater, viewGroup, false);
        u0().w1().c().m(new File(u0().t1(), "pano_preview.jpg")).d(c10.f114381e);
        TextView textView = c10.f114384h;
        CharSequence text = getText(n.f113197F);
        textView.setText(Html.fromHtml("<u>" + text + "</u>", 0));
        this.f124800Q = c10;
        e0.a(u0().p1()).observe(getViewLifecycleOwner(), new b(new U(this)));
        J0().J().observe(getViewLifecycleOwner(), new b(new V(this)));
        ConstraintLayout b10 = I0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        J I02 = I0();
        I02.f114379c.setOnClickListener(new P(this));
        I02.f114384h.setOnClickListener(new Q(this));
        I02.f114383g.setOnClickListener(new S(this));
        I02.f114385i.setOnClickListener(new T(this));
    }
}
