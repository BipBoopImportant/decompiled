package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ai.H1;
import Ci.C10626F;
import Di.C10657a;
import Ei.C10675J;
import Hx.c;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.content.Context;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0015¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b\u001b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010#\u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/ShowInvoicesFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "", "fileName", "LHx/c$d$d;", "invoice", "LXH/N;", "L0", "(Ljava/lang/String;LHx/c$d$d;)V", "", "byteArray", "M0", "(Ljava/lang/String;[B)V", "D0", "(LU0/m;I)V", "LDi/a;", "X", "LDi/a;", "J0", "()LDi/a;", "setOpenInvoiceUseCase", "(LDi/a;)V", "openInvoiceUseCase", "", "Y", "Z", "v0", "()Z", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "y0", "t0", "drawUnderDisplayCutout", "LEi/J;", "z0", "LXH/o;", "K0", "()LEi/J;", "viewModel", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowInvoicesFragment extends h {

    /* renamed from: X  reason: collision with root package name */
    public C10657a f90915X;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f90916Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f90917Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f90918y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f90919z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements p<String, c.d.C2666d, C16807N> {
        a(Object obj) {
            super(2, obj, ShowInvoicesFragment.class, "onInvoiceClicked", "onInvoiceClicked(Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/domain/models/PurchaseDetails$OrderAction$Invoice;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((String) obj, (c.d.C2666d) obj2);
            return C16807N.f139792a;
        }

        public final void t(String str, c.d.C2666d dVar) {
            C17542s.j(str, "p0");
            C17542s.j(dVar, "p1");
            ((ShowInvoicesFragment) this.receiver).L0(str, dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90920c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f90920c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90920c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90921c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f90921c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90921c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90922c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f90922c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90922c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90923c = aVar;
            this.f90924d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90923c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90924d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90925c = oVar;
            this.f90926d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90926d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90925c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ShowInvoicesFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f90919z0 = W.b(this, P.b(C10675J.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(ShowInvoicesFragment showInvoicesFragment) {
        C8951o f10 = rw.f.f(showInvoicesFragment, "purchaseHistory/order/details/invoices?orderId={orderId}", (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    private final C10675J K0() {
        return (C10675J) this.f90919z0.getValue();
    }

    /* access modifiers changed from: private */
    public final void L0(String str, c.d.C2666d dVar) {
        byte[] a10 = dVar.a();
        if (a10 != null) {
            M0(str, a10);
        } else {
            K0().C();
        }
    }

    private final void M0(String str, byte[] bArr) {
        Context context = getContext();
        if (context != null) {
            J0().a(context, str, bArr, getView());
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-919598676);
        if (C4895p.J()) {
            C4895p.S(-919598676, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ShowInvoicesFragment.FragmentContent (ShowInvoicesFragment.kt:31)");
        }
        C10675J K02 = K0();
        mVar.W(-1401531201);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        p pVar = (p) ((C18059h) D10);
        mVar.W(-1401530177);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new C10626F(this);
            mVar.u(D11);
        }
        mVar.P();
        H1.g(K02, pVar, (C17631a) D11, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final C10657a J0() {
        C10657a aVar = this.f90915X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("openInvoiceUseCase");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f90918y0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f90917Z;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f90916Y;
    }
}
