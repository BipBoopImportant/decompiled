package com.ingka.ikea.benefits.impl.presentation;

import Bm.o;
import J1.j;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.J;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.benefits.impl.presentation.c;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import uI.C18059h;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0014XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u0002"}, d2 = {"Lcom/ingka/ikea/benefits/impl/presentation/FeaturedBenefitBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Lcom/ingka/ikea/benefits/impl/presentation/a;", "R", "LXH/o;", "L0", "()Lcom/ingka/ikea/benefits/impl/presentation/a;", "viewModel", "", "S", "Z", "z0", "()Z", "showTopHandle", "Lcom/ingka/ikea/benefits/impl/presentation/c;", "uiState", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeaturedBenefitBottomSheet extends BottomSheetComposeDialogFragment {

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f93213R;

    /* renamed from: S  reason: collision with root package name */
    private final boolean f93214S;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.benefits.impl.presentation.FeaturedBenefitBottomSheet$BottomSheetContent$1$1", f = "FeaturedBenefitBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FeaturedBenefitBottomSheet f93216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<c> f93217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FeaturedBenefitBottomSheet featuredBenefitBottomSheet, A1<? extends c> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f93216d = featuredBenefitBottomSheet;
            this.f93217e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f93216d, this.f93217e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93215c == 0) {
                y.b(obj);
                if (FeaturedBenefitBottomSheet.H0(this.f93217e) instanceof c.a) {
                    this.f93216d.dismiss();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.benefits.impl.presentation.FeaturedBenefitBottomSheet$BottomSheetContent$2$1", f = "FeaturedBenefitBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FeaturedBenefitBottomSheet f93219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FeaturedBenefitBottomSheet featuredBenefitBottomSheet, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f93219d = featuredBenefitBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f93219d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93218c == 0) {
                y.b(obj);
                this.f93219d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, FeaturedBenefitBottomSheet.class, "dismissBottomSheet", "dismissBottomSheet()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((FeaturedBenefitBottomSheet) this.receiver).w0();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
        d(Object obj) {
            super(0, obj, FeaturedBenefitBottomSheet.class, "dismissBottomSheet", "dismissBottomSheet()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((FeaturedBenefitBottomSheet) this.receiver).w0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93220c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f93220c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93220c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93221c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f93221c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93221c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93222c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f93222c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93222c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93223c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93223c = aVar;
            this.f93224d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93223c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93224d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93225c = oVar;
            this.f93226d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93226d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93225c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FeaturedBenefitBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f93213R = W.b(this, P.b(a.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
    }

    /* access modifiers changed from: private */
    public static final c H0(A1<? extends c> a12) {
        return (c) a12.getValue();
    }

    private final a L0() {
        return (a) this.f93213R.getValue();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-1562048736);
        if (C4895p.J()) {
            C4895p.S(-1562048736, i10, -1, "com.ingka.ikea.benefits.impl.presentation.FeaturedBenefitBottomSheet.BottomSheetContent (FeaturedBenefitBottomSheet.kt:26)");
        }
        A1<c> c10 = j3.a.c(L0().m(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        c H02 = H0(c10);
        mVar.W(959435070);
        boolean V10 = mVar.V(c10) | mVar.F(this);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this, c10, (C17164e<? super a>) null);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.g(H02, (p) D10, mVar, 0);
        c H03 = H0(c10);
        if (!(H03 instanceof c.a) && !(H03 instanceof c.b)) {
            if (H03 instanceof c.C2077c) {
                C16807N n10 = C16807N.f139792a;
                mVar.W(959444440);
                boolean F10 = mVar.F(this);
                Object D11 = mVar.D();
                if (F10 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(this, (C17164e<? super b>) null);
                    mVar.u(D11);
                }
                mVar.P();
                U0.P.g(n10, (p) D11, mVar, 6);
                Mm.a a10 = ((c.C2077c) H03).a();
                mVar.W(959450193);
                boolean F11 = mVar.F(this);
                Object D12 = mVar.D();
                if (F11 || D12 == C4889m.f14007a.a()) {
                    D12 = new c(this);
                    mVar.u(D12);
                }
                C18059h hVar = (C18059h) D12;
                mVar.P();
                String b10 = j.b(Oo.b.f84438M0, mVar, 0);
                mVar.W(959454545);
                boolean F12 = mVar.F(this);
                Object D13 = mVar.D();
                if (F12 || D13 == C4889m.f14007a.a()) {
                    D13 = new d(this);
                    mVar.u(D13);
                }
                mVar.P();
                o.D(a10, b10, j.b(Oo.b.f84428L0, mVar, 0), Km.b.a(mVar, 0), (C17631a) hVar, (C17631a) ((C18059h) D13), J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), mVar, 1572864, 0);
            } else {
                throw new t();
            }
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f93214S;
    }
}
