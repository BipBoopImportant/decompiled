package com.ingka.ikea.benefits.impl.presentation;

import Jm.c;
import Jm.d;
import Jm.h;
import Nm.a;
import U0.A1;
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
import uI.C18059h;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\u0019\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063²\u0006\f\u00102\u001a\u0002018\nX\u0002"}, d2 = {"Lcom/ingka/ikea/benefits/impl/presentation/BenefitsListFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LJm/c;", "navigateTo", "", "J0", "(LJm/c;)Z", "LXH/N;", "D0", "(LU0/m;I)V", "", "X", "Ljava/lang/String;", "L0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "Y", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "Z", "v0", "()Z", "drawUnderStatusBar", "y0", "u0", "drawUnderNavigationBar", "z0", "t0", "drawUnderDisplayCutout", "LHm/e;", "A0", "LXH/o;", "M0", "()LHm/e;", "viewModel", "LNm/a;", "B0", "LNm/a;", "K0", "()LNm/a;", "setBenefitsNavigation", "(LNm/a;)V", "benefitsNavigation", "LJm/e;", "uiState", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BenefitsListFragment extends b {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f93199A0;

    /* renamed from: B0  reason: collision with root package name */
    public Nm.a f93200B0;

    /* renamed from: X  reason: collision with root package name */
    private final String f93201X = "benefits/benefits_page?is_take_a_tour_key={is_take_a_tour_key}";

    /* renamed from: Y  reason: collision with root package name */
    private final C17631a<C16807N> f93202Y = new Hm.a();

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f93203Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f93204y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f93205z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<Jm.d, C16807N> {
        a(Object obj) {
            super(1, obj, Hm.e.class, "onEvent", "onEvent(Lcom/ingka/ikea/benefits/impl/presentation/model/BenefitsList$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Jm.d) obj);
            return C16807N.f139792a;
        }

        public final void t(Jm.d dVar) {
            C17542s.j(dVar, "p0");
            ((Hm.e) this.receiver).Q(dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93206c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f93206c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93206c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93207c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f93207c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93207c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93208c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f93208c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93208c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93209c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93209c = aVar;
            this.f93210d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93209c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93210d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93211c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93211c = oVar;
            this.f93212d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93212d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93211c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public BenefitsListFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f93199A0 = W.b(this, P.b(Hm.e.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    private static final Jm.e H0(A1<? extends Jm.e> a12) {
        return (Jm.e) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I0() {
        return C16807N.f139792a;
    }

    private final boolean J0(Jm.c cVar) {
        C8951o f10 = rw.f.f(this, L0(), (C17642l) null, 2, (Object) null);
        if (f10 == null || cVar == null) {
            return false;
        }
        if (cVar instanceof c.b) {
            f10.k0();
            return true;
        } else if (cVar instanceof c.a) {
            f10.Y(h.a(((c.a) cVar).a()), rw.c.f28698a.c().a());
            return true;
        } else if (cVar instanceof c.C1623c) {
            a.C1689a.a(K0(), f10, ((c.C1623c) cVar).a(), (C) null, 4, (Object) null);
            return true;
        } else {
            throw new t();
        }
    }

    private final Hm.e M0() {
        return (Hm.e) this.f93199A0.getValue();
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(439806826);
        if (C4895p.J()) {
            C4895p.S(439806826, i10, -1, "com.ingka.ikea.benefits.impl.presentation.BenefitsListFragment.FragmentContent (BenefitsListFragment.kt:40)");
        }
        A1<Jm.e> c10 = j3.a.c(M0().m(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        if (J0(H0(c10).a())) {
            M0().Q(d.c.f82621a);
        }
        Jm.e H02 = H0(c10);
        Hm.e M02 = M0();
        mVar.W(-178101694);
        boolean F10 = mVar.F(M02);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(M02);
            mVar.u(D10);
        }
        mVar.P();
        Im.h.k(H02, (C17642l) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final Nm.a K0() {
        Nm.a aVar = this.f93200B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("benefitsNavigation");
        return null;
    }

    public String L0() {
        return this.f93201X;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f93205z0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f93204y0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f93203Z;
    }
}
