package com.ingka.ikea.familyrewards.implementation.fragment;

import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import Zq.j;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import or.C11712e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsHistoryFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsHistoryFragment$c;", "result", "LXH/N;", "A0", "(Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsHistoryFragment$c;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "u0", "(LU0/m;I)V", "Lor/e;", "Q", "LXH/o;", "B0", "()Lor/e;", "familyRewardsHistoryViewModel", "R", "c", "a", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyRewardsHistoryFragment extends e {

    /* renamed from: R  reason: collision with root package name */
    public static final a f95889R = new a((DefaultConstructorMarker) null);

    /* renamed from: S  reason: collision with root package name */
    public static final int f95890S = 8;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f95891Q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsHistoryFragment$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "RESULT_KEY", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FamilyRewardsHistoryFragment f95892a;

        b(FamilyRewardsHistoryFragment familyRewardsHistoryFragment) {
            this.f95892a = familyRewardsHistoryFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(FamilyRewardsHistoryFragment familyRewardsHistoryFragment) {
            familyRewardsHistoryFragment.A0(c.GoToRewards);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(FamilyRewardsHistoryFragment familyRewardsHistoryFragment) {
            familyRewardsHistoryFragment.A0(c.Dismiss);
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(307848586, i10, -1, "com.ingka.ikea.familyrewards.implementation.fragment.FamilyRewardsHistoryFragment.DialogContent.<anonymous> (FamilyRewardsHistoryFragment.kt:43)");
                }
                C11712e z02 = this.f95892a.B0();
                mVar.W(-1823224784);
                boolean F10 = mVar.F(this.f95892a);
                FamilyRewardsHistoryFragment familyRewardsHistoryFragment = this.f95892a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(familyRewardsHistoryFragment);
                    mVar.u(D10);
                }
                C17631a aVar = (C17631a) D10;
                mVar.P();
                mVar.W(-1823221172);
                boolean F11 = mVar.F(this.f95892a);
                FamilyRewardsHistoryFragment familyRewardsHistoryFragment2 = this.f95892a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(familyRewardsHistoryFragment2);
                    mVar.u(D11);
                }
                mVar.P();
                j.p(z02, aVar, (C17631a) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsHistoryFragment$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "Dismiss", "GoToRewards", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        Dismiss("Dismiss"),
        GoToRewards("GoToRewards");
        
        public static final a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/FamilyRewardsHistoryFragment$c$a;", "", "<init>", "()V", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private c(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95893c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f95893c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95893c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95894c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f95894c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95894c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95895c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f95895c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95895c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95896c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95896c = aVar;
            this.f95897d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95896c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95897d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95898c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95898c = oVar;
            this.f95899d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95899d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95898c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FamilyRewardsHistoryFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f95891Q = W.b(this, P.b(C11712e.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    /* access modifiers changed from: private */
    public final void A0(c cVar) {
        C5197z.c(this, "FamilyRewardsHistoryFragment-RequestCode", D2.d.b(C16796C.a("FamilyRewardsHistoryFragment-ResultKey", cVar.b())));
        dismiss();
    }

    /* access modifiers changed from: private */
    public final C11712e B0() {
        return (C11712e) this.f95891Q.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawableResource(17170445);
        }
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(738076208);
        if (C4895p.J()) {
            C4895p.S(738076208, i10, -1, "com.ingka.ikea.familyrewards.implementation.fragment.FamilyRewardsHistoryFragment.DialogContent (FamilyRewardsHistoryFragment.kt:41)");
        }
        TC.e.e(false, c1.c.e(307848586, true, new b(this), mVar, 54), mVar, 48, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
