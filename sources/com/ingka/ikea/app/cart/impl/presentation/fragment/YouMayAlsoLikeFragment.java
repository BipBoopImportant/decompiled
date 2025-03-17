package com.ingka.ikea.app.cart.impl.presentation.fragment;

import Kf.C9133b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import eg.C9655e;
import eg.C9656f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import x4.C8951o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b\u001a\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/presentation/fragment/YouMayAlsoLikeFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "Leg/e$a$a;", "message", "LXH/N;", "L0", "(Leg/e$a$a;)V", "D0", "(LU0/m;I)V", "LKf/b;", "X", "LKf/b;", "J0", "()LKf/b;", "setCartApi", "(LKf/b;)V", "cartApi", "Leg/f;", "Y", "LXH/o;", "K0", "()Leg/f;", "viewModel", "", "Z", "v0", "()Z", "drawUnderStatusBar", "y0", "u0", "drawUnderNavigationBar", "z0", "t0", "drawUnderDisplayCutout", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class YouMayAlsoLikeFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    public C9133b f71848X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f71849Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f71850Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f71851y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f71852z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C9655e.a.C1246a, C16807N> {
        a(Object obj) {
            super(1, obj, YouMayAlsoLikeFragment.class, "handleAddToCartError", "handleAddToCartError(Lcom/ingka/ikea/app/cart/impl/presentation/viewmodel/YouMayAlsoLikeUiState$Message$AddToCartError;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C9655e.a.C1246a) obj);
            return C16807N.f139792a;
        }

        public final void t(C9655e.a.C1246a aVar) {
            C17542s.j(aVar, "p0");
            ((YouMayAlsoLikeFragment) this.receiver).L0(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71853c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f71853c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f71853c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71854c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f71854c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f71854c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f71855c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f71855c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f71855c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f71857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f71856c = aVar;
            this.f71857d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f71856c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f71857d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71858c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f71859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f71858c = oVar;
            this.f71859d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f71859d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f71858c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public YouMayAlsoLikeFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f71849Y = W.b(this, P.b(C9656f.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(C8951o oVar) {
        oVar.k0();
        return C16807N.f139792a;
    }

    private final C9656f K0() {
        return (C9656f) this.f71849Y.getValue();
    }

    /* access modifiers changed from: private */
    public final void L0(C9655e.a.C1246a aVar) {
        C9133b J02 = J0();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        View requireView = requireView();
        C17542s.i(requireView, "requireView(...)");
        J02.showAddToCartException(requireContext, requireView, aVar.b(), aVar.a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: nI.a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r8, int r9) {
        /*
            r7 = this;
            r0 = -1550490657(0xffffffffa39563df, float:-1.619691E-17)
            r8.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.cart.impl.presentation.fragment.YouMayAlsoLikeFragment.FragmentContent (YouMayAlsoLikeFragment.kt:31)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x0012:
            java.lang.Class<Zf.n> r9 = Zf.n.class
            java.lang.Object r9 = dH.C17158b.c(r7, r9)
            r4 = r9
            Zf.n r4 = (Zf.n) r4
            x4.o r3 = androidx.navigation.fragment.a.a(r7)
            eg.f r0 = r7.K0()
            r9 = 481663721(0x1cb59ae9, float:1.2017619E-21)
            r8.W(r9)
            boolean r9 = r8.F(r7)
            java.lang.Object r1 = r8.D()
            if (r9 != 0) goto L_0x003b
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r1 != r9) goto L_0x0043
        L_0x003b:
            com.ingka.ikea.app.cart.impl.presentation.fragment.YouMayAlsoLikeFragment$a r1 = new com.ingka.ikea.app.cart.impl.presentation.fragment.YouMayAlsoLikeFragment$a
            r1.<init>(r7)
            r8.u(r1)
        L_0x0043:
            uI.h r1 = (uI.C18059h) r1
            r8.P()
            r9 = 481668475(0x1cb5ad7b, float:1.2022419E-21)
            r8.W(r9)
            boolean r9 = r8.F(r3)
            java.lang.Object r2 = r8.D()
            if (r9 != 0) goto L_0x0060
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r2 != r9) goto L_0x0068
        L_0x0060:
            cg.a r2 = new cg.a
            r2.<init>(r3)
            r8.u(r2)
        L_0x0068:
            r9 = r2
            nI.a r9 = (nI.C17631a) r9
            r8.P()
            r2 = r1
            nI.l r2 = (nI.C17642l) r2
            r6 = 0
            r1 = r9
            r5 = r8
            ag.o.d(r0, r1, r2, r3, r4, r5, r6)
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0080
            U0.C4895p.R()
        L_0x0080:
            r8.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.impl.presentation.fragment.YouMayAlsoLikeFragment.D0(U0.m, int):void");
    }

    public final C9133b J0() {
        C9133b bVar = this.f71848X;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartApi");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f71852z0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f71851y0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f71850Z;
    }
}
