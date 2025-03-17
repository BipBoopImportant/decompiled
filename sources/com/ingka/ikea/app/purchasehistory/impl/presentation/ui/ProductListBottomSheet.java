package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ai.J0;
import Ar.j;
import Ci.C10636h;
import Ei.C10691l;
import HJ.C15854t;
import Kf.C9133b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.E0;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.C8951o;
import z1.C6272b;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010:\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/ProductListBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "", "<init>", "()V", "", "productNumber", "LXH/N;", "G0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LIl/a;", "O", "LIl/a;", "getAppConfigApi", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LZw/a;", "P", "LZw/a;", "D0", "()LZw/a;", "setPipNavigation", "(LZw/a;)V", "pipNavigation", "LKf/b;", "Q", "LKf/b;", "A0", "()LKf/b;", "setCartApi", "(LKf/b;)V", "cartApi", "LAr/j;", "R", "LAr/j;", "C0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "S", "Ljava/lang/String;", "B0", "()Ljava/lang/String;", "destId", "LEi/l;", "T", "LXH/o;", "E0", "()LEi/l;", "viewModel", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductListBottomSheet extends Hilt_ProductListBottomSheet {

    /* renamed from: O  reason: collision with root package name */
    public Il.a f90817O;

    /* renamed from: P  reason: collision with root package name */
    public Zw.a f90818P;

    /* renamed from: Q  reason: collision with root package name */
    public C9133b f90819Q;

    /* renamed from: R  reason: collision with root package name */
    public j f90820R;

    /* renamed from: S  reason: collision with root package name */
    private final String f90821S = "purchaseHistory/order/list?orderId={orderId}&deliveryMethodId={deliveryMethodId}";

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f90822T;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductListBottomSheet f90823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposeView f90824b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ProductListBottomSheet$a$a  reason: collision with other inner class name */
        static final class C1982a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ProductListBottomSheet f90825a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ComposeView f90826b;

            C1982a(ProductListBottomSheet productListBottomSheet, ComposeView composeView) {
                this.f90825a = productListBottomSheet;
                this.f90826b = composeView;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(ProductListBottomSheet productListBottomSheet, String str) {
                C17542s.j(str, "it");
                productListBottomSheet.G0(str);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(ComposeView composeView, ProductListBottomSheet productListBottomSheet) {
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
                        String a10 = C11818a.a("Close callback received, dismiss bottom sheet", (Throwable) null);
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
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                productListBottomSheet.dismiss();
                return C16807N.f139792a;
            }

            public final void c(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-899759990, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ProductListBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (ProductListBottomSheet.kt:70)");
                    }
                    C10691l y02 = this.f90825a.E0();
                    mVar.W(-2070367120);
                    boolean F10 = mVar.F(this.f90825a);
                    ProductListBottomSheet productListBottomSheet = this.f90825a;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new i(productListBottomSheet);
                        mVar.u(D10);
                    }
                    C17642l lVar = (C17642l) D10;
                    mVar.P();
                    mVar.W(-2070363634);
                    boolean F11 = mVar.F(this.f90826b) | mVar.F(this.f90825a);
                    ComposeView composeView = this.f90826b;
                    ProductListBottomSheet productListBottomSheet2 = this.f90825a;
                    Object D11 = mVar.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new j(composeView, productListBottomSheet2);
                        mVar.u(D11);
                    }
                    mVar.P();
                    J0.e(y02, lVar, (C17631a) D11, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(ProductListBottomSheet productListBottomSheet, ComposeView composeView) {
            this.f90823a = productListBottomSheet;
            this.f90824b = composeView;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1251187689, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ProductListBottomSheet.onCreateView.<anonymous>.<anonymous> (ProductListBottomSheet.kt:67)");
                }
                TC.e.c(androidx.compose.ui.input.nestedscroll.a.b(androidx.compose.ui.d.f18749a, E0.h((View) null, mVar, 0, 1), (C6272b) null, 2, (Object) null), c1.c.e(-899759990, true, new C1982a(this.f90823a, this.f90824b), mVar, 54), mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90827c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f90827c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90827c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90828c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f90828c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90828c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90829c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f90829c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90829c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90830c = aVar;
            this.f90831d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90830c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90831d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90832c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90832c = oVar;
            this.f90833d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90833d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90832c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ProductListBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f90822T = W.b(this, P.b(C10691l.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final C10691l E0() {
        return (C10691l) this.f90822T.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(ProductListBottomSheet productListBottomSheet, C10691l.b bVar) {
        C17542s.j(bVar, "sideEffect");
        if (bVar instanceof C10691l.b.a) {
            C9133b A02 = productListBottomSheet.A0();
            Context requireContext = productListBottomSheet.requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            View rootView = productListBottomSheet.requireView().getRootView();
            C17542s.i(rootView, "getRootView(...)");
            C10691l.b.a aVar = (C10691l.b.a) bVar;
            A02.showAddToCartException(requireContext, rootView, aVar.b(), aVar.a());
        } else if (bVar instanceof C10691l.b.C1529b) {
            j C02 = productListBottomSheet.C0();
            View rootView2 = productListBottomSheet.requireView().getRootView();
            C17542s.i(rootView2, "getRootView(...)");
            String string = productListBottomSheet.getString(Oo.b.f84507T, ((C10691l.b.C1529b) bVar).a());
            C17542s.i(string, "getString(...)");
            j.a.s(C02, rootView2, string, (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void G0(String str) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Open pip for: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = ProductListBottomSheet.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        C8951o f10 = rw.f.f(this, B0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            D0().a(f10, str, Interaction$Component.PURCHASE_HISTORY);
        }
    }

    public final C9133b A0() {
        C9133b bVar = this.f90819Q;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartApi");
        return null;
    }

    public String B0() {
        return this.f90821S;
    }

    public final j C0() {
        j jVar = this.f90820R;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Zw.a D0() {
        Zw.a aVar = this.f90818P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c1.c.c(-1251187689, true, new a(this, composeView)));
        return composeView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        ip.j.a(E0().K(), this, new C10636h(this));
    }
}
