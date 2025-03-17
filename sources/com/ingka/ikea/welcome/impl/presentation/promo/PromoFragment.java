package com.ingka.ikea.welcome.impl.presentation.promo;

import TD.C13682a;
import U0.C4889m;
import U0.C4895p;
import UD.r;
import XD.C13803a;
import XD.C13804b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.core.android.fragments.BaseComposeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010)\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010+¨\u0006-"}, d2 = {"Lcom/ingka/ikea/welcome/impl/presentation/promo/PromoFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "J0", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "D0", "(LU0/m;I)V", "onDestroy", "", "S", "Ljava/lang/String;", "H0", "()Ljava/lang/String;", "destId", "LTD/a;", "T", "LXH/o;", "I0", "()LTD/a;", "viewModel", "", "U", "Z", "v0", "()Z", "drawUnderStatusBar", "X", "u0", "drawUnderNavigationBar", "Y", "t0", "drawUnderDisplayCutout", "LXD/a;", "LXD/a;", "callback", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromoFragment extends BaseComposeFragment {

    /* renamed from: S  reason: collision with root package name */
    private final String f120692S = "onboarding/promo";

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f120693T;

    /* renamed from: U  reason: collision with root package name */
    private final boolean f120694U;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f120695X;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f120696Y;

    /* renamed from: Z  reason: collision with root package name */
    private C13803a f120697Z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, PromoFragment.class, "onDismiss", "onDismiss()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((PromoFragment) this.receiver).J0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120698c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f120698c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120698c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120699c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f120699c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120699c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120700c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f120700c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120700c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120701c = aVar;
            this.f120702d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120701c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120702d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120703c = oVar;
            this.f120704d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120704d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120703c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PromoFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f120693T = W.b(this, P.b(C13682a.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
        this.f120694U = true;
        this.f120695X = true;
        this.f120696Y = true;
    }

    private final C13682a I0() {
        return (C13682a) this.f120693T.getValue();
    }

    /* access modifiers changed from: private */
    public final void J0() {
        C13803a aVar = this.f120697Z;
        if (aVar != null) {
            aVar.b0();
            return;
        }
        rw.d.a(this, C13804b.a.C2916b.f117804a, "Promo");
        C8951o.o0(androidx.navigation.fragment.a.a(this), H0(), true, false, 4, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1839698817);
        if (C4895p.J()) {
            C4895p.S(-1839698817, i10, -1, "com.ingka.ikea.welcome.impl.presentation.promo.PromoFragment.FragmentContent (PromoFragment.kt:43)");
        }
        C13682a I02 = I0();
        mVar.W(1160959239);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        r.p(I02, (C17631a) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        rw.d.a(this, C13804b.a.C2914a.f117803a, "Promo");
    }

    public String H0() {
        return this.f120692S;
    }

    public void onAttach(Context context) {
        C17542s.j(context, "context");
        super.onAttach(context);
        C5191t activity = getActivity();
        this.f120697Z = activity instanceof C13803a ? (C13803a) activity : null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f120697Z = null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f120696Y;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f120695X;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f120694U;
    }
}
