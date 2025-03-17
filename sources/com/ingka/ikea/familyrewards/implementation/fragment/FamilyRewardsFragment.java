package com.ingka.ikea.familyrewards.implementation.fragment;

import LD.C13183a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import dr.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kr.C11527a;
import kr.C11528b;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import or.i;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002XD¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u00105R\u001a\u00109\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u00105R\u001a\u0010<\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b:\u0010\"\u001a\u0004\b;\u00105¨\u0006>"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "O0", "Lkr/a;", "destination", "", "K0", "(Lkr/a;)Z", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "LAe/e;", "X", "LAe/e;", "getAnalytics", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LHq/a;", "Y", "LHq/a;", "L0", "()LHq/a;", "setNavigation", "(LHq/a;)V", "navigation", "LLD/a;", "Z", "LLD/a;", "N0", "()LLD/a;", "setWalletNavigation", "(LLD/a;)V", "walletNavigation", "Lor/i;", "y0", "LXH/o;", "M0", "()Lor/i;", "viewModel", "", "z0", "Ljava/lang/String;", "destId", "A0", "v0", "()Z", "drawUnderStatusBar", "B0", "u0", "drawUnderNavigationBar", "C0", "t0", "drawUnderDisplayCutout", "a", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyRewardsFragment extends d {

    /* renamed from: D0  reason: collision with root package name */
    public static final a f95871D0 = new a((DefaultConstructorMarker) null);

    /* renamed from: E0  reason: collision with root package name */
    public static final int f95872E0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    private final boolean f95873A0 = true;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f95874B0 = true;

    /* renamed from: C0  reason: collision with root package name */
    private final boolean f95875C0 = true;

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f95876X;

    /* renamed from: Y  reason: collision with root package name */
    public Hq.a f95877Y;

    /* renamed from: Z  reason: collision with root package name */
    public C13183a f95878Z;

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f95879y0;

    /* renamed from: z0  reason: collision with root package name */
    private final String f95880z0 = "familyRewards/rewards?show_collect_points={show_collect_points}";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsFragment$a;", "", "<init>", "()V", "", "BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<C11527a, Boolean> {
        b(Object obj) {
            super(1, obj, FamilyRewardsFragment.class, "consumeNavigation", "consumeNavigation(Lcom/ingka/ikea/familyrewards/implementation/model/FamilyRewards$Destination;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(C11527a aVar) {
            return Boolean.valueOf(((FamilyRewardsFragment) this.receiver).K0(aVar));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f95881a;

        static {
            int[] iArr = new int[Hq.b.values().length];
            try {
                iArr[Hq.b.OpenCollectKeys.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f95881a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95882c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f95882c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95882c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95883c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f95883c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95883c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95884c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f95884c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95884c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95885c = aVar;
            this.f95886d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95885c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95886d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95887c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95887c = oVar;
            this.f95888d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95888d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95887c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FamilyRewardsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f95879y0 = W.b(this, P.b(i.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(FamilyRewardsFragment familyRewardsFragment) {
        familyRewardsFragment.startPostponedEnterTransition();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final boolean K0(C11527a aVar) {
        C8951o f10 = rw.f.f(this, this.f95880z0, (C17642l) null, 2, (Object) null);
        if (f10 == null || aVar == null) {
            return false;
        }
        if (aVar instanceof C11527a.C2244a) {
            androidx.navigation.fragment.a.a(this).k0();
            return true;
        } else if (aVar instanceof C11527a.b) {
            f10.X(Uri.parse(ow.c.b("ikea://navigation/familyRewards/faq")));
            return true;
        } else if (aVar instanceof C11527a.c) {
            L0().e(f10);
            return true;
        } else if (aVar instanceof C11527a.d) {
            L0().b(f10, ((C11527a.d) aVar).a(), "FamilyRewardDetailsFragment-REQUEST_KEY");
            return true;
        } else if (aVar instanceof C11527a.e) {
            L0().a(f10, ((C11527a.e) aVar).a(), "FamilyRewards-RewardsBottomSheet", false);
            return true;
        } else if (aVar instanceof C11527a.f) {
            N0().a(f10, rw.c.f28698a.d().a());
            return true;
        } else {
            throw new t();
        }
    }

    private final i M0() {
        return (i) this.f95879y0.getValue();
    }

    private final void O0() {
        C5197z.d(this, "FamilyRewardDetailsFragment-REQUEST_KEY", new ir.e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(FamilyRewardsFragment familyRewardsFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        Hq.b d10 = familyRewardsFragment.L0().d(bundle);
        int i10 = d10 == null ? -1 : c.f95881a[d10.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                familyRewardsFragment.M0().j(C11528b.g.f99093a);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-600353794);
        if (C4895p.J()) {
            C4895p.S(-600353794, i10, -1, "com.ingka.ikea.familyrewards.implementation.fragment.FamilyRewardsFragment.FragmentContent (FamilyRewardsFragment.kt:53)");
        }
        i M02 = M0();
        mVar.W(-1137771007);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new b(this);
            mVar.u(D10);
        }
        mVar.P();
        C17642l lVar = (C17642l) ((C18059h) D10);
        mVar.W(-1137769615);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new ir.d(this);
            mVar.u(D11);
        }
        mVar.P();
        m.s(M02, lVar, (C17631a) D11, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        postponeEnterTransition();
        O0();
    }

    public final Hq.a L0() {
        Hq.a aVar = this.f95877Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("navigation");
        return null;
    }

    public final C13183a N0() {
        C13183a aVar = this.f95878Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("walletNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f95875C0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f95874B0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f95873A0;
    }
}
