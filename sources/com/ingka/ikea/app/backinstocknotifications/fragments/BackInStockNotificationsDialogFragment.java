package com.ingka.ikea.app.backinstocknotifications.fragments;

import HJ.C15854t;
import IC.C13023e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.core.logger.DslKt;
import ip.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lm.C11550a;
import lm.d;
import nI.C17631a;
import nI.p;
import pf.C10138a;
import pf.C10139b;
import pf.C10140c;
import pf.C10142e;
import qf.C10190a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/ingka/ikea/app/backinstocknotifications/fragments/BackInStockNotificationsDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LXH/N;", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "D0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LEo/a;", "P", "LEo/a;", "B0", "()LEo/a;", "setChromeTabApi", "(LEo/a;)V", "chromeTabApi", "LIl/a;", "Q", "LIl/a;", "y0", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "Llm/a;", "R", "Llm/a;", "z0", "()Llm/a;", "setBackInStockApi", "(Llm/a;)V", "backInStockApi", "Lrf/b;", "S", "LXH/o;", "A0", "()Lrf/b;", "backInStockNotificationsViewModel", "Lqf/a;", "T", "C0", "()Lqf/a;", "safeArgs", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackInStockNotificationsDialogFragment extends Hilt_BackInStockNotificationsDialogFragment {

    /* renamed from: P  reason: collision with root package name */
    public Eo.a f70194P;

    /* renamed from: Q  reason: collision with root package name */
    public Il.a f70195Q;

    /* renamed from: R  reason: collision with root package name */
    public C11550a f70196R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f70197S;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f70198T = C16825p.b(new C10139b(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BackInStockNotificationsDialogFragment f70199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11550a.c f70200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f70201c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f70202d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ComposeView f70203e;

        a(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment, C11550a.c cVar, String str, String str2, ComposeView composeView) {
            this.f70199a = backInStockNotificationsDialogFragment;
            this.f70200b = cVar;
            this.f70201c = str;
            this.f70202d = str2;
            this.f70203e = composeView;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment) {
            backInStockNotificationsDialogFragment.dismiss();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment, String str, String str2) {
            rw.d.a(backInStockNotificationsDialogFragment, new d.a(str, str2), "BackInStockNotificationsRequestKey");
            backInStockNotificationsDialogFragment.dismiss();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment, ComposeView composeView) {
            String t10 = backInStockNotificationsDialogFragment.y0().t();
            if (t10 != null) {
                backInStockNotificationsDialogFragment.B0().a(backInStockNotificationsDialogFragment.requireContext(), t10);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("No privacy policy URL found");
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
                        String name = composeView.getClass().getName();
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
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final String k(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment, C11550a.c cVar, lm.b bVar, String str) {
            C17542s.j(bVar, "backInStockException");
            C17542s.j(str, "productTitle");
            C13023e a10 = backInStockNotificationsDialogFragment.z0().a(bVar, cVar, str);
            Context requireContext = backInStockNotificationsDialogFragment.requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            return a10.b(requireContext);
        }

        public final void f(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(80335857, i10, -1, "com.ingka.ikea.app.backinstocknotifications.fragments.BackInStockNotificationsDialogFragment.onCreateView.<anonymous>.<anonymous> (BackInStockNotificationsDialogFragment.kt:101)");
                }
                rf.b w02 = this.f70199a.A0();
                C11550a.c cVar = this.f70200b;
                if (cVar != null) {
                    String e10 = this.f70199a.C0().e();
                    String str = this.f70201c;
                    String str2 = this.f70202d;
                    mVar.W(573085474);
                    boolean F10 = mVar.F(this.f70199a);
                    BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment = this.f70199a;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new a(backInStockNotificationsDialogFragment);
                        mVar.u(D10);
                    }
                    C17631a aVar = (C17631a) D10;
                    mVar.P();
                    mVar.W(573087724);
                    boolean F11 = mVar.F(this.f70199a) | mVar.V(this.f70201c) | mVar.V(this.f70202d);
                    BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment2 = this.f70199a;
                    String str3 = this.f70201c;
                    String str4 = this.f70202d;
                    Object D11 = mVar.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new b(backInStockNotificationsDialogFragment2, str3, str4);
                        mVar.u(D11);
                    }
                    C17631a aVar2 = (C17631a) D11;
                    mVar.P();
                    mVar.W(573102211);
                    boolean F12 = mVar.F(this.f70199a) | mVar.F(this.f70203e);
                    BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment3 = this.f70199a;
                    ComposeView composeView = this.f70203e;
                    Object D12 = mVar.D();
                    if (F12 || D12 == C4889m.f14007a.a()) {
                        D12 = new c(backInStockNotificationsDialogFragment3, composeView);
                        mVar.u(D12);
                    }
                    C17631a aVar3 = (C17631a) D12;
                    mVar.P();
                    mVar.W(573115562);
                    boolean F13 = mVar.F(this.f70199a) | mVar.F(this.f70200b);
                    BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment4 = this.f70199a;
                    C11550a.c cVar2 = this.f70200b;
                    Object D13 = mVar.D();
                    if (F13 || D13 == C4889m.f14007a.a()) {
                        D13 = new d(backInStockNotificationsDialogFragment4, cVar2);
                        mVar.u(D13);
                    }
                    mVar.P();
                    C10142e.b(w02, cVar, e10, str, str2, new C10138a(aVar, aVar2, aVar3, (p) D13), mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70204c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f70204c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70204c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70205c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f70205c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70205c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70206c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f70206c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70206c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70207c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70207c = aVar;
            this.f70208d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70207c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70208d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70209c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70209c = oVar;
            this.f70210d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70210d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70209c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public BackInStockNotificationsDialogFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f70197S = W.b(this, P.b(rf.b.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final rf.b A0() {
        return (rf.b) this.f70197S.getValue();
    }

    /* access modifiers changed from: private */
    public final C10190a C0() {
        return (C10190a) this.f70198T.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment, int i10) {
        rw.d.a(backInStockNotificationsDialogFragment, new d.b(i10), "BackInStockNotificationsRequestKey");
        backInStockNotificationsDialogFragment.dismiss();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C10190a F0(BackInStockNotificationsDialogFragment backInStockNotificationsDialogFragment) {
        C10190a.C1399a aVar = C10190a.f76051i;
        Bundle requireArguments = backInStockNotificationsDialogFragment.requireArguments();
        C17542s.i(requireArguments, "requireArguments(...)");
        return aVar.a(requireArguments);
    }

    public final Eo.a B0() {
        Eo.a aVar = this.f70194P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabApi");
        return null;
    }

    /* renamed from: D0 */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C11550a.c cVar;
        C11550a.c aVar;
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        String c10 = C0().c();
        String d10 = C0().d();
        if (!C15854t.v0(C0().h())) {
            aVar = new C11550a.c.C2258c(C0().h(), C0().a());
        } else if (!C15854t.v0(C0().f()) && C0().b()) {
            aVar = new C11550a.c.b(C0().f(), C0().g());
        } else if (!C15854t.v0(C0().f())) {
            aVar = new C11550a.c.C2255a(C0().f(), C0().g());
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Zip code or store id not entered correctly");
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = ComposeView.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            dismiss();
            cVar = null;
            composeView.setContent(c1.c.c(80335857, true, new a(this, cVar, c10, d10, composeView)));
            return composeView;
        }
        cVar = aVar;
        composeView.setContent(c1.c.c(80335857, true, new a(this, cVar, c10, d10, composeView)));
        return composeView;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
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
        F<Integer> F10 = A0().F();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(F10, viewLifecycleOwner, new C10140c(this));
    }

    public final Il.a y0() {
        Il.a aVar = this.f70195Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public final C11550a z0() {
        C11550a aVar = this.f70196R;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("backInStockApi");
        return null;
    }
}
