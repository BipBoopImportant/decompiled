package com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.fragment;

import Bj.h;
import Iz.C13047m;
import U0.C4889m;
import U0.C4895p;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import zj.C12527h;
import zj.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0014\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productdetails/presentation/ui/fragment/ProductDetailsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "Lzj/h;", "navAction", "LXH/N;", "K0", "(Lzj/h;)V", "D0", "(LU0/m;I)V", "", "X", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "", "Y", "Z", "v0", "()Z", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "y0", "t0", "drawUnderDisplayCutout", "LIz/m;", "z0", "LIz/m;", "I0", "()LIz/m;", "setNavigation$scanandgo_implementation_release", "(LIz/m;)V", "navigation", "Lyj/e;", "A0", "LXH/o;", "J0", "()Lyj/e;", "viewModel", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailsFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f91666A0;

    /* renamed from: X  reason: collision with root package name */
    private final String f91667X = "scanandgo/product/details?productNo={productNo}&isCombination={isCombination}";

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f91668Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f91669Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f91670y0;

    /* renamed from: z0  reason: collision with root package name */
    public C13047m f91671z0;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productdetails/presentation/ui/fragment/ProductDetailsFragment$a", "LBj/a;", "Lzj/i;", "action", "LXH/N;", "b", "(Lzj/i;)V", "Lzj/h;", "navAction", "a", "(Lzj/h;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Bj.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductDetailsFragment f91672a;

        a(ProductDetailsFragment productDetailsFragment) {
            this.f91672a = productDetailsFragment;
        }

        public void a(C12527h hVar) {
            C17542s.j(hVar, "navAction");
            this.f91672a.K0(hVar);
        }

        public void b(i iVar) {
            C17542s.j(iVar, "action");
            this.f91672a.J0().E(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91673c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f91673c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91673c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91674c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f91674c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91674c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91675c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f91675c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91675c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91676c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91676c = aVar;
            this.f91677d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91676c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91677d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91678c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91678c = oVar;
            this.f91679d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91679d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91678c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ProductDetailsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f91666A0 = W.b(this, P.b(yj.e.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final yj.e J0() {
        return (yj.e) this.f91666A0.getValue();
    }

    /* access modifiers changed from: private */
    public final void K0(C12527h hVar) {
        if (C17542s.e(hVar, C12527h.a.f107389a)) {
            androidx.navigation.fragment.a.a(this).k0();
        } else if (C17542s.e(hVar, C12527h.b.f107390a)) {
            J0().E(i.b.f107395a);
        } else if (hVar instanceof C12527h.c) {
            C12527h.c cVar = (C12527h.c) hVar;
            I0().a(androidx.navigation.fragment.a.a(this), cVar.a(), cVar.c(), cVar.b().m());
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-737667686);
        if (C4895p.J()) {
            C4895p.S(-737667686, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.fragment.ProductDetailsFragment.FragmentContent (ProductDetailsFragment.kt:34)");
        }
        h.j(J0(), new a(this), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final C13047m I0() {
        C13047m mVar = this.f91671z0;
        if (mVar != null) {
            return mVar;
        }
        C17542s.z("navigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f91670y0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f91669Z;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f91668Y;
    }
}
