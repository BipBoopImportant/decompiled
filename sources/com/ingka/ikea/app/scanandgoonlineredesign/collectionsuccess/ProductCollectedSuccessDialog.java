package com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess;

import TJ.C16519P;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess.a;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import dI.C17164e;
import eI.C17187b;
import fj.C11265a;
import jC.C14615b;
import jC.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016XD¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0014XD¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00109\u001a\u0002018\u0014XD¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u0014\u0010<\u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/ProductCollectedSuccessDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;", "uiState", "LXH/N;", "C0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;", "uiEffect", "z0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/widget/LinearLayout;", "A0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/LinearLayout;", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LFz/f;", "M", "LFz/f;", "_binding", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a;", "N", "LXH/o;", "y0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a;", "viewModel", "", "O", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "", "P", "Z", "t0", "()Z", "drawUnderStatusBar", "Q", "s0", "drawUnderNavigationBar", "x0", "()LFz/f;", "binding", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductCollectedSuccessDialog extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private Fz.f f91246M;

    /* renamed from: N  reason: collision with root package name */
    private final C16824o f91247N;

    /* renamed from: O  reason: collision with root package name */
    private final String f91248O = "scanandgo/dialog/product-collected-success?title={title}&qty={qty}";

    /* renamed from: P  reason: collision with root package name */
    private final boolean f91249P = true;

    /* renamed from: Q  reason: collision with root package name */
    private final boolean f91250Q = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;", "it", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess.ProductCollectedSuccessDialog$onViewCreated$2", f = "ProductCollectedSuccessDialog.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<a.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91251c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91252d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductCollectedSuccessDialog f91253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ProductCollectedSuccessDialog productCollectedSuccessDialog, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91253e = productCollectedSuccessDialog;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f91253e, eVar);
            aVar.f91252d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(a.c cVar, C17164e<? super C16807N> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91251c == 0) {
                y.b(obj);
                a.c cVar = (a.c) this.f91252d;
                this.f91253e.C0(cVar);
                a.b e10 = cVar.e();
                if (e10 != null) {
                    this.f91253e.z0(e10);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91254c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f91254c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91254c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91255c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f91255c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91255c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91256c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f91256c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91256c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91257c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91257c = aVar;
            this.f91258d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91257c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91258d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91259c = oVar;
            this.f91260d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91260d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91259c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ProductCollectedSuccessDialog() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f91247N = W.b(this, P.b(a.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N B0(q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        lC.l a10 = qVar.a();
        C14615b.c cVar = C14615b.c.f127858b;
        a10.a(cVar);
        qVar.b().a(cVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void C0(a.c cVar) {
        x0().f110120c.setText(requireContext().getString(Ez.f.f109710l0, new Object[]{Integer.valueOf(cVar.d()), cVar.c()}));
    }

    private final Fz.f x0() {
        Fz.f fVar = this.f91246M;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final a y0() {
        return (a) this.f91247N.getValue();
    }

    /* access modifiers changed from: private */
    public final void z0(a.b bVar) {
        if (C17542s.e(bVar, a.b.C1993a.f91265a)) {
            dismiss();
            return;
        }
        throw new t();
    }

    /* renamed from: A0 */
    public LinearLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Fz.f c10 = Fz.f.c(layoutInflater, viewGroup, false);
        this.f91246M = c10;
        LinearLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        rw.d.a(this, Boolean.TRUE, "product_collected_request_key");
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        b(new C11265a());
        C16519P<a.c> m10 = y0().m();
        r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g<a.c> R10 = C16534i.R(C5208k.a(m10, lifecycle, r.b.STARTED), new a(this, (C17164e<? super a>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: protected */
    public boolean s0() {
        return this.f91250Q;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f91249P;
    }
}
