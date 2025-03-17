package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ai.J1;
import Ai.O1;
import Ci.C10631c;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0014\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001b\u0010\"\u001a\u00020\u001d8@X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/ExpressReturnsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LAi/J1;", "expressReturnsAction", "LXH/N;", "K0", "(LAi/J1;)V", "D0", "(LU0/m;I)V", "", "X", "Ljava/lang/String;", "I0", "()Ljava/lang/String;", "destId", "", "Y", "Z", "v0", "()Z", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "y0", "t0", "drawUnderDisplayCutout", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel;", "z0", "LXH/o;", "J0", "()Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel;", "viewModel", "LEo/a;", "A0", "LEo/a;", "H0", "()LEo/a;", "setChromeTabsApi", "(LEo/a;)V", "chromeTabsApi", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressReturnsFragment extends c {

    /* renamed from: A0  reason: collision with root package name */
    public Eo.a f90784A0;

    /* renamed from: X  reason: collision with root package name */
    private final String f90785X = "purchaseHistory/returns?orderId={orderId}&liteId={liteId}";

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f90786Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f90787Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f90788y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f90789z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExpressReturnsFragment f90790a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ExpressReturnsFragment$a$a  reason: collision with other inner class name */
        /* synthetic */ class C1981a extends C17540p implements C17642l<J1, C16807N> {
            C1981a(Object obj) {
                super(1, obj, ExpressReturnsFragment.class, "onAction", "onAction(Lcom/ingka/ikea/app/purchasehistory/impl/presentation/compose/WebViewAction;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((J1) obj);
                return C16807N.f139792a;
            }

            public final void t(J1 j12) {
                C17542s.j(j12, "p0");
                ((ExpressReturnsFragment) this.receiver).K0(j12);
            }
        }

        a(ExpressReturnsFragment expressReturnsFragment) {
            this.f90790a = expressReturnsFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-274269902, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ExpressReturnsFragment.FragmentContent.<anonymous> (ExpressReturnsFragment.kt:40)");
                }
                ExpressReturnWebViewModel J02 = this.f90790a.J0();
                ExpressReturnsFragment expressReturnsFragment = this.f90790a;
                mVar.W(633836422);
                boolean F10 = mVar.F(expressReturnsFragment);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C1981a(expressReturnsFragment);
                    mVar.u(D10);
                }
                mVar.P();
                O1.k(J02, (C17642l) ((C18059h) D10), mVar, 0);
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
        final /* synthetic */ C5187o f90791c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f90791c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90791c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90792c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f90792c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90792c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90793c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f90793c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90793c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90794c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90794c = aVar;
            this.f90795d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90794c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90795d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90796c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90797d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90796c = oVar;
            this.f90797d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90797d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90796c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ExpressReturnsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f90789z0 = W.b(this, P.b(ExpressReturnWebViewModel.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final void K0(J1 j12) {
        if (C17542s.e(j12, J1.a.f78513a)) {
            C8951o f10 = rw.f.f(this, I0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                f10.i0();
            }
        } else if (C17542s.e(j12, J1.c.f78515a)) {
            rw.d.a(this, C10631c.RETURN_COMPLETED, "ExpressReturnsResult");
            C8951o f11 = rw.f.f(this, I0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                f11.i0();
            }
        } else if (j12 instanceof J1.b) {
            H0().a(getContext(), ((J1.b) j12).a());
            J0().N();
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(194316108);
        if (C4895p.J()) {
            C4895p.S(194316108, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ExpressReturnsFragment.FragmentContent (ExpressReturnsFragment.kt:38)");
        }
        TC.e.e(false, c1.c.e(-274269902, true, new a(this), mVar, 54), mVar, 48, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final Eo.a H0() {
        Eo.a aVar = this.f90784A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public String I0() {
        return this.f90785X;
    }

    public final ExpressReturnWebViewModel J0() {
        return (ExpressReturnWebViewModel) this.f90789z0.getValue();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f90788y0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f90787Z;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f90786Y;
    }
}
