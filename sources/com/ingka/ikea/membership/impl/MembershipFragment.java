package com.ingka.ikea.membership.impl;

import Av.o;
import Rv.c;
import Rv.m;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import Vv.l;
import Vv.u;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import dI.C17168i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import uI.C18059h;
import yv.C8999d;
import yv.C9000e;
import yv.C9001f;
import yv.C9002g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u0002"}, d2 = {"Lcom/ingka/ikea/membership/impl/MembershipFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "E0", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "", "X", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "Y", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LVv/e;", "Z", "LVv/e;", "Q0", "()LVv/e;", "setNavigationContract", "(LVv/e;)V", "navigationContract", "LDr/d;", "y0", "LDr/d;", "P0", "()LDr/d;", "setMembershipListsKreativCard", "(LDr/d;)V", "membershipListsKreativCard", "Law/a;", "z0", "LXH/o;", "R0", "()Law/a;", "viewModel", "A0", "a", "LRv/m;", "uiState", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MembershipFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public static final a f50657A0 = new a((DefaultConstructorMarker) null);

    /* renamed from: B0  reason: collision with root package name */
    public static final int f50658B0 = 8;

    /* renamed from: X  reason: collision with root package name */
    private final String f50659X = "membership/membership_page";

    /* renamed from: Y  reason: collision with root package name */
    private final C17631a<C16807N> f50660Y = new C9002g();

    /* renamed from: Z  reason: collision with root package name */
    public Vv.e f50661Z;

    /* renamed from: y0  reason: collision with root package name */
    public Dr.d f50662y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f50663z0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/membership/impl/MembershipFragment$a;", "", "<init>", "()V", "", "POSTPONE_TIMEOUT_MILLIS", "J", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<Rv.c, C16807N> {
        b(Object obj) {
            super(1, obj, aw.a.class, "onEvent", "onEvent(Lcom/ingka/ikea/membership/impl/model/Membership$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Rv.c) obj);
            return C16807N.f139792a;
        }

        public final void t(Rv.c cVar) {
            C17542s.j(cVar, "p0");
            ((aw.a) this.receiver).d0(cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f50664c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f50664c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f50664c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f50665c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f50665c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f50665c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f50666c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f50666c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f50666c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f50667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f50668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f50667c = aVar;
            this.f50668d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f50667c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f50668d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f50669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f50670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f50669c = oVar;
            this.f50670d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f50670d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f50669c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public MembershipFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f50663z0 = W.b(this, P.b(aw.a.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private static final m K0(A1<? extends m> a12) {
        return (m) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(MembershipFragment membershipFragment, A1 a12) {
        if (K0(a12).g()) {
            membershipFragment.startPostponedEnterTransition();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(C18059h hVar) {
        ((C17642l) hVar).invoke(c.e.f39775a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(C18059h hVar, u uVar) {
        C17542s.j(uVar, "it");
        ((C17642l) hVar).invoke(new c.f(uVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0() {
        return C16807N.f139792a;
    }

    private final aw.a R0() {
        return (aw.a) this.f50663z0.getValue();
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(542198494);
        if (C4895p.J()) {
            C4895p.S(542198494, i10, -1, "com.ingka.ikea.membership.impl.MembershipFragment.FragmentContent (MembershipFragment.kt:43)");
        }
        A1<m> c10 = j3.a.c(R0().m(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        aw.a R02 = R0();
        mVar.W(-405459178);
        boolean F10 = mVar.F(R02);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new b(R02);
            mVar.u(D10);
        }
        C18059h hVar = (C18059h) D10;
        mVar.P();
        mVar.W(-405457824);
        boolean V10 = mVar.V(c10) | mVar.F(this);
        Object D11 = mVar.D();
        if (V10 || D11 == C4889m.f14007a.a()) {
            D11 = new C8999d(this, c10);
            mVar.u(D11);
        }
        mVar.P();
        U0.P.i((C17631a) D11, mVar, 0);
        mVar.W(-405453320);
        Vv.e Q02 = Q0();
        l a10 = K0(c10).a();
        mVar.W(-1794423671);
        boolean V11 = mVar.V(hVar);
        Object D12 = mVar.D();
        if (V11 || D12 == C4889m.f14007a.a()) {
            D12 = new C9000e(hVar);
            mVar.u(D12);
        }
        mVar.P();
        Q02.b(a10, (C17631a) D12, mVar, 0);
        mVar.W(-1794419894);
        boolean V12 = mVar.V(hVar);
        Object D13 = mVar.D();
        if (V12 || D13 == C4889m.f14007a.a()) {
            D13 = new C9001f(hVar);
            mVar.u(D13);
        }
        mVar.P();
        Q02.a((C17642l) D13, mVar, 0);
        mVar.P();
        o.w(K0(c10), (C17642l) hVar, P0(), mVar, 0, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        postponeEnterTransition(300, TimeUnit.MILLISECONDS);
    }

    public final Dr.d P0() {
        Dr.d dVar = this.f50662y0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("membershipListsKreativCard");
        return null;
    }

    public final Vv.e Q0() {
        Vv.e eVar = this.f50661Z;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("navigationContract");
        return null;
    }
}
