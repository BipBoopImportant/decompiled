package com.ingka.ikea.settings.impl.theme;

import IC.C13023e;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import rA.C14962a;
import tA.C15059e;
import uI.C18059h;
import vA.C15124a;
import vA.C15126c;
import x4.C8951o;
import yA.C15276a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014XD¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0014XD¢\u0006\f\n\u0004\b\u0011\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u000f8\u0014XD¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/settings/impl/theme/ThemeFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "K0", "D0", "(LU0/m;I)V", "", "X", "Ljava/lang/String;", "I0", "()Ljava/lang/String;", "destId", "", "Y", "Z", "v0", "()Z", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "y0", "t0", "drawUnderDisplayCutout", "LyA/a;", "z0", "LXH/o;", "J0", "()LyA/a;", "viewModel", "LvA/c;", "uiState", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemeFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    private final String f120209X = "settings/theme";

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f120210Y = true;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f120211Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f120212y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f120213z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C15124a, C16807N> {
        a(Object obj) {
            super(1, obj, C15276a.class, "onEvent", "onEvent(Lcom/ingka/ikea/settings/impl/theme/model/Theme$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C15124a) obj);
            return C16807N.f139792a;
        }

        public final void t(C15124a aVar) {
            C17542s.j(aVar, "p0");
            ((C15276a) this.receiver).F(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120214c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f120214c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120214c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120215c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f120215c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120215c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120216c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f120216c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120216c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120217c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120217c = aVar;
            this.f120218d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120217c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120218d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120219c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120219c = oVar;
            this.f120220d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120220d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120219c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ThemeFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f120213z0 = W.b(this, P.b(C15276a.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    private static final C15126c H0(A1<C15126c> a12) {
        return a12.getValue();
    }

    private final C15276a J0() {
        return (C15276a) this.f120213z0.getValue();
    }

    private final void K0() {
        rw.f.d(this, I0(), new C14962a());
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        oVar.k0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-853767116);
        if (C4895p.J()) {
            C4895p.S(-853767116, i10, -1, "com.ingka.ikea.settings.impl.theme.ThemeFragment.FragmentContent (ThemeFragment.kt:33)");
        }
        A1<C15126c> c10 = j3.a.c(J0().m(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        if (H0(c10).b()) {
            K0();
            J0().F(C15124a.c.f131404a);
        }
        C15126c H02 = H0(c10);
        C15276a J02 = J0();
        mVar.W(-157938831);
        boolean F10 = mVar.F(J02);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(J02);
            mVar.u(D10);
        }
        mVar.P();
        C15059e.g(H02, (C17642l) ((C18059h) D10), mVar, C13023e.f110931a);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public String I0() {
        return this.f120209X;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f120212y0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f120211Z;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f120210Y;
    }
}
