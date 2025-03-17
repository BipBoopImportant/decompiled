package com.ingka.ikea.familyrewards.implementation.fragment;

import Ar.j;
import IC.C13023e;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import dI.C17164e;
import eI.C17187b;
import ir.l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import or.r;
import x4.C8951o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 62\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0003R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/RewardsDetailsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "LXH/N;", "E0", "", "rewardId", "", "showGreeting", "G0", "(Ljava/lang/String;Z)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "u0", "(LU0/m;I)V", "w0", "LAr/j;", "Q", "LAr/j;", "B0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LHq/a;", "R", "LHq/a;", "C0", "()LHq/a;", "setNavigation", "(LHq/a;)V", "navigation", "Lor/r;", "S", "LXH/o;", "D0", "()Lor/r;", "viewModel", "T", "Ljava/lang/String;", "destId", "U", "Z", "t0", "()Z", "drawUnderStatusBar", "X", "getRequestKey", "()Ljava/lang/String;", "requestKey", "Y", "a", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RewardsDetailsFragment extends g {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f95917Y = new a((DefaultConstructorMarker) null);

    /* renamed from: Z  reason: collision with root package name */
    public static final int f95918Z = 8;

    /* renamed from: Q  reason: collision with root package name */
    public j f95919Q;

    /* renamed from: R  reason: collision with root package name */
    public Hq.a f95920R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f95921S;

    /* renamed from: T  reason: collision with root package name */
    private final String f95922T = "familyRewards/details?rewardId={rewardId}&requestKey={requestKey}";

    /* renamed from: U  reason: collision with root package name */
    private final boolean f95923U = true;

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f95924X = C16825p.b(new l(this));

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/RewardsDetailsFragment$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "LHq/b;", "a", "(Landroid/os/Bundle;)LHq/b;", "", "BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "REQUEST_KEY", "RESULT_KEY", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Hq.b a(Bundle bundle) {
            T t10;
            C17542s.j(bundle, "bundle");
            String string = bundle.getString("FamilyRewardDetails-RESULT_KEY");
            Iterator<T> it = Hq.b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((Hq.b) t10).j(), string)) {
                    break;
                }
            }
            return (Hq.b) t10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.fragment.RewardsDetailsFragment$observeSideEffects$$inlined$collectOnStarted$1", f = "RewardsDetailsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.l implements p<r.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f95925c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f95926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RewardsDetailsFragment f95927e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, RewardsDetailsFragment rewardsDetailsFragment) {
            super(2, eVar);
            this.f95927e = rewardsDetailsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar, this.f95927e);
            bVar.f95926d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(r.b bVar, C17164e<? super C16807N> eVar) {
            return ((b) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f95925c == 0) {
                y.b(obj);
                r.b bVar = (r.b) this.f95926d;
                if (bVar instanceof r.b.d) {
                    this.f95927e.G0(((r.b.d) bVar).a(), true);
                } else if (bVar instanceof r.b.c) {
                    this.f95927e.G0(((r.b.c) bVar).a(), false);
                } else if (bVar instanceof r.b.e) {
                    j B02 = this.f95927e.B0();
                    View requireView = this.f95927e.requireView();
                    C17542s.i(requireView, "requireView(...)");
                    C13023e a10 = ((r.b.e) bVar).a();
                    Context requireContext = this.f95927e.requireContext();
                    C17542s.i(requireContext, "requireContext(...)");
                    j.a.s(B02, requireView, a10.b(requireContext), (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
                } else if (bVar instanceof r.b.a) {
                    kotlin.coroutines.jvm.internal.b.a(androidx.navigation.fragment.a.a(this.f95927e).k0());
                } else if (bVar instanceof r.b.C2365b) {
                    RewardsDetailsFragment rewardsDetailsFragment = this.f95927e;
                    String z02 = rewardsDetailsFragment.getRequestKey();
                    Hq.b bVar2 = Hq.b.OpenCollectKeys;
                    C5197z.c(rewardsDetailsFragment, z02, D2.d.b(C16796C.a("FamilyRewardDetails-RESULT_KEY", bVar2.j())));
                    rw.d.a(this.f95927e, bVar2, this.f95927e.getRequestKey());
                    this.f95927e.dismiss();
                } else {
                    throw new t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95928c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f95928c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95928c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95929c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f95929c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95929c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95930c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f95930c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95930c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95931c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95931c = aVar;
            this.f95932d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95931c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95932d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95933c = oVar;
            this.f95934d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95934d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95933c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public RewardsDetailsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f95921S = W.b(this, P.b(r.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final r D0() {
        return (r) this.f95921S.getValue();
    }

    private final void E0() {
        C16532g R10 = C16534i.R(C5208k.b(D0().E(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new b((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.getString("requestKey");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String F0(com.ingka.ikea.familyrewards.implementation.fragment.RewardsDetailsFragment r1) {
        /*
            android.os.Bundle r1 = r1.getArguments()
            if (r1 == 0) goto L_0x000e
            java.lang.String r0 = "requestKey"
            java.lang.String r1 = r1.getString(r0)
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r1 = "FamilyRewardDetailsFragment-REQUEST_KEY"
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.familyrewards.implementation.fragment.RewardsDetailsFragment.F0(com.ingka.ikea.familyrewards.implementation.fragment.RewardsDetailsFragment):java.lang.String");
    }

    /* access modifiers changed from: private */
    public final void G0(String str, boolean z10) {
        C8951o f10 = rw.f.f(this, this.f95922T, (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C0().a(f10, str, "FamilyRewardsDetails-RewardsBottomSheet", z10);
        }
    }

    /* access modifiers changed from: private */
    public final String getRequestKey() {
        return (String) this.f95924X.getValue();
    }

    public final j B0() {
        j jVar = this.f95919Q;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Hq.a C0() {
        Hq.a aVar = this.f95920R;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("navigation");
        return null;
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
        }
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f95923U;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(1926952624);
        if (C4895p.J()) {
            C4895p.S(1926952624, i10, -1, "com.ingka.ikea.familyrewards.implementation.fragment.RewardsDetailsFragment.DialogContent (RewardsDetailsFragment.kt:64)");
        }
        Wq.p.A(D0(), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void w0() {
        E0();
    }
}
