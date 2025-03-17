package com.ingka.ikea.instore.impl.foodmobile.ui;

import At.a;
import Et.a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YC.C13858c;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import yt.C12509B;
import yt.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158@X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\u001b8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ingka/ikea/instore/impl/foodmobile/ui/FoodMobileFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "Lyt/f$c;", "redirectActions", "LXH/N;", "C0", "(Lyt/f$c;)V", "LAt/a$a;", "result", "z0", "(LAt/a$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "u0", "(LU0/m;I)V", "onStart", "onDestroy", "LEt/c;", "Q", "LXH/o;", "B0", "()LEt/c;", "viewModel", "Lkotlin/Function1;", "Lyt/f;", "R", "LnI/l;", "getFoodMobileActions$instore_implementation_release", "()LnI/l;", "getFoodMobileActions$instore_implementation_release$annotations", "foodMobileActions", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FoodMobileFragment extends a {

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f96227Q;

    /* renamed from: R  reason: collision with root package name */
    private final C17642l<f, C16807N> f96228R = new Bt.a(this);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96229c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f96229c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f96229c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96230c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f96230c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f96230c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f96231c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f96231c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f96231c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96232c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f96232c = aVar;
            this.f96233d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f96232c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f96233d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f96234c = oVar;
            this.f96235d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f96235d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f96234c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FoodMobileFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f96227Q = W.b(this, P.b(Et.c.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N A0(FoodMobileFragment foodMobileFragment, f fVar) {
        C17542s.j(fVar, "it");
        if (C17542s.e(fVar, f.a.f107287a)) {
            foodMobileFragment.dismiss();
        } else if (C17542s.e(fVar, f.b.f107288a)) {
            foodMobileFragment.dismiss();
        } else if (fVar instanceof f.c) {
            foodMobileFragment.C0((f.c) fVar);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void C0(f.c cVar) {
        if (C17542s.e(cVar, f.c.b.f107290a)) {
            z0(a.C1465a.OrderDone);
        } else if (C17542s.e(cVar, f.c.a.f107289a)) {
            z0(a.C1465a.ChangeStore);
        } else {
            throw new t();
        }
    }

    private final void z0(a.C1465a aVar) {
        rw.d.a(this, aVar, a.C1465a.REQUEST_KEY);
        dismiss();
    }

    public final Et.c B0() {
        return (Et.c) this.f96227Q.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public void onDestroy() {
        super.onDestroy();
        B0().b(new a.C1545a.h(true));
    }

    public void onStart() {
        super.onStart();
        Et.c B02 = B0();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        B02.b(new a.C1545a.f(C13858c.b(requireContext)));
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(836660374);
        if (C4895p.J()) {
            C4895p.S(836660374, i10, -1, "com.ingka.ikea.instore.impl.foodmobile.ui.FoodMobileFragment.DialogContent (FoodMobileFragment.kt:46)");
        }
        C12509B.u(B0(), (C5221y) null, this.f96228R, mVar, 0, 2);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
