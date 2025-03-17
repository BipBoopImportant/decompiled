package com.ingka.ikea.wallet.impl;

import GD.C12934g;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.view.Window;
import android.view.WindowManager;
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
import tD.C15065b;
import tD.C15068e;
import uI.C18059h;
import vD.u;
import vm.C12190a;
import vm.C12192c;
import x4.C8951o;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00138\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/ingka/ikea/wallet/impl/WalletFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LGD/g;", "navigateTo", "", "K0", "(LGD/g;)Z", "", "value", "LXH/N;", "P0", "(F)V", "D0", "(LU0/m;I)V", "onResume", "onPause", "", "X", "Ljava/lang/String;", "N0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "Y", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LtD/e;", "Z", "LXH/o;", "O0", "()LtD/e;", "viewModel", "Lvm/a;", "y0", "Lvm/a;", "M0", "()Lvm/a;", "setBarcode", "(Lvm/a;)V", "barcode", "LRd/a;", "z0", "LRd/a;", "L0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WalletFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    private final String f120676X = "wallet/wallet_page?redemptionCode={redemptionCode}";

    /* renamed from: Y  reason: collision with root package name */
    private final C17631a<C16807N> f120677Y = new C15065b();

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f120678Z;

    /* renamed from: y0  reason: collision with root package name */
    public C12190a f120679y0;

    /* renamed from: z0  reason: collision with root package name */
    public Rd.a f120680z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WalletFragment f120681a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.wallet.impl.WalletFragment$a$a  reason: collision with other inner class name */
        /* synthetic */ class C3009a extends C17540p implements C17642l<C12934g, Boolean> {
            C3009a(Object obj) {
                super(1, obj, WalletFragment.class, "consumeNavigationEvent", "consumeNavigationEvent(Lcom/ingka/ikea/wallet/impl/model/Wallet$Destination;)Z", 0);
            }

            /* renamed from: t */
            public final Boolean invoke(C12934g gVar) {
                return Boolean.valueOf(((WalletFragment) this.receiver).K0(gVar));
            }
        }

        a(WalletFragment walletFragment) {
            this.f120681a = walletFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-106806111, i10, -1, "com.ingka.ikea.wallet.impl.WalletFragment.FragmentContent.<anonymous> (WalletFragment.kt:40)");
                }
                C15068e I02 = this.f120681a.O0();
                WalletFragment walletFragment = this.f120681a;
                mVar.W(-714714175);
                boolean F10 = mVar.F(walletFragment);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C3009a(walletFragment);
                    mVar.u(D10);
                }
                mVar.P();
                u.A(I02, (C17642l) ((C18059h) D10), mVar, 0);
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
        final /* synthetic */ C5187o f120682c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f120682c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120682c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120683c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f120683c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120683c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120684c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f120684c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120684c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120685c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120685c = aVar;
            this.f120686d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120685c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120686d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120687c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120687c = oVar;
            this.f120688d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120688d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120687c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public WalletFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f120678Z = W.b(this, P.b(C15068e.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final boolean K0(C12934g gVar) {
        C8951o f10;
        if (gVar == null || (f10 = rw.f.f(this, N0(), (C17642l) null, 2, (Object) null)) == null) {
            return false;
        }
        if (C17542s.e(gVar, C12934g.a.f110369a)) {
            f10.k0();
            return true;
        } else if (C17542s.e(gVar, C12934g.b.f110370a)) {
            L0().f(f10);
            return true;
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final C15068e O0() {
        return (C15068e) this.f120678Z.getValue();
    }

    private final void P0(float f10) {
        Window window = requireActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f10;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1730498207);
        if (C4895p.J()) {
            C4895p.S(-1730498207, i10, -1, "com.ingka.ikea.wallet.impl.WalletFragment.FragmentContent (WalletFragment.kt:38)");
        }
        C4910x.a(C12192c.d().d(M0()), c1.c.e(-106806111, true, new a(this), mVar, 54), mVar, J0.f13770i | 48);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final Rd.a L0() {
        Rd.a aVar = this.f120680z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final C12190a M0() {
        C12190a aVar = this.f120679y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("barcode");
        return null;
    }

    public String N0() {
        return this.f120676X;
    }

    public void onPause() {
        super.onPause();
        P0(-1.0f);
    }

    public void onResume() {
        super.onResume();
        P0(0.75f);
    }
}
