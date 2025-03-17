package com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.fragment;

import Bj.i;
import Bj.o;
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
import com.ingka.ikea.core.android.fragments.BaseComposeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import yj.C12347a;
import zj.C12520a;
import zj.C12521b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productdetails/presentation/ui/fragment/ProductDetailsSectionFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "Lzj/a;", "navAction", "LXH/N;", "J0", "(Lzj/a;)V", "D0", "(LU0/m;I)V", "", "S", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "", "T", "Z", "v0", "()Z", "drawUnderStatusBar", "U", "u0", "drawUnderNavigationBar", "X", "t0", "drawUnderDisplayCutout", "Lyj/a;", "Y", "LXH/o;", "I0", "()Lyj/a;", "viewModel", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailsSectionFragment extends BaseComposeFragment {

    /* renamed from: S  reason: collision with root package name */
    private final String f91680S = "scanandgo/product/details/section?productNo={productNo}&isCombination={isCombination}&sectionType={sectionType}";

    /* renamed from: T  reason: collision with root package name */
    private final boolean f91681T;

    /* renamed from: U  reason: collision with root package name */
    private final boolean f91682U;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f91683X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f91684Y;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/productdetails/presentation/ui/fragment/ProductDetailsSectionFragment$a", "LBj/i;", "Lzj/b;", "action", "LXH/N;", "b", "(Lzj/b;)V", "Lzj/a;", "navAction", "a", "(Lzj/a;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductDetailsSectionFragment f91685a;

        a(ProductDetailsSectionFragment productDetailsSectionFragment) {
            this.f91685a = productDetailsSectionFragment;
        }

        public void a(C12520a aVar) {
            C17542s.j(aVar, "navAction");
            this.f91685a.J0(aVar);
        }

        public void b(C12521b bVar) {
            C17542s.j(bVar, "action");
            this.f91685a.I0().F(bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91686c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f91686c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91686c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91687c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f91687c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91687c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91688c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f91688c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91688c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91690d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91689c = aVar;
            this.f91690d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91689c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91690d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91691c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91691c = oVar;
            this.f91692d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91692d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91691c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ProductDetailsSectionFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f91684Y = W.b(this, P.b(C12347a.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final C12347a I0() {
        return (C12347a) this.f91684Y.getValue();
    }

    /* access modifiers changed from: private */
    public final void J0(C12520a aVar) {
        if (C17542s.e(aVar, C12520a.C2561a.f107365a)) {
            androidx.navigation.fragment.a.a(this).k0();
        } else if (!C17542s.e(aVar, C12520a.b.f107366a)) {
            throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(639045400);
        if (C4895p.J()) {
            C4895p.S(639045400, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.fragment.ProductDetailsSectionFragment.FragmentContent (ProductDetailsSectionFragment.kt:27)");
        }
        o.h(I0(), new a(this), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f91683X;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f91682U;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f91681T;
    }
}
