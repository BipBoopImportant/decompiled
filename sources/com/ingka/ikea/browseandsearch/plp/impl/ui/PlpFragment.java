package com.ingka.ikea.browseandsearch.plp.impl.ui;

import Bn.k;
import Cn.o;
import Cn.p;
import QJ.Q;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import YH.C16877v;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.browseandsearch.plp.impl.ui.f;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import sB.C15035a;
import wn.C12288c;
import yn.e2;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016XD¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u001eR\u001b\u0010%\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u001e¨\u0006&"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/PlpFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "LBn/k;", "X", "LBn/k;", "S0", "()LBn/k;", "setNavigationContract", "(LBn/k;)V", "navigationContract", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/e;", "Y", "LXH/o;", "T0", "()Lcom/ingka/ikea/browseandsearch/plp/impl/ui/e;", "plpViewModel", "", "Z", "Ljava/lang/String;", "R0", "()Ljava/lang/String;", "destId", "y0", "Q0", "argsId", "z0", "P0", "argsComponent", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlpFragment extends c {

    /* renamed from: X  reason: collision with root package name */
    public k f93499X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f93500Y;

    /* renamed from: Z  reason: collision with root package name */
    private final String f93501Z = "browse/plp/plp?id={id}&useIdAsGroupParameter={useIdAsGroupParameter}&fallbackTitle={fallbackTitle}&type={type}&component={component}&preAppliedFilters={preAppliedFilters}&includedProductNos={includedProductNos}&prioritiser={prioritiser}";

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f93502y0 = C16825p.b(new o(this));

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f93503z0 = C16825p.b(new p(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpFragment$FragmentContent$1$1", f = "PlpFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93504c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PlpFragment f93505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PlpFragment plpFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f93505d = plpFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f93505d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93504c == 0) {
                y.b(obj);
                this.f93505d.T0().c0(new e2.h(this.f93505d.P0(), this.f93505d.Q0()));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93506c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f93506c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93506c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93507c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f93507c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93507c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93508c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f93508c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93508c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93509c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93509c = aVar;
            this.f93510d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93509c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93510d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93511c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93511c = oVar;
            this.f93512d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93512d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93511c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PlpFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f93500Y = W.b(this, P.b(e.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(PlpFragment plpFragment, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            String b10 = cVar != null ? cVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            plpFragment.T0().b0(new f.e(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String N0(PlpFragment plpFragment) {
        String string = plpFragment.requireArguments().getString("component");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final String O0(PlpFragment plpFragment) {
        String string = plpFragment.requireArguments().getString("id");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final String P0() {
        return (String) this.f93503z0.getValue();
    }

    /* access modifiers changed from: private */
    public final String Q0() {
        return (String) this.f93502y0.getValue();
    }

    /* access modifiers changed from: private */
    public final e T0() {
        return (e) this.f93500Y.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r9, int r10) {
        /*
            r8 = this;
            r0 = -1554734425(0xffffffffa354a2a7, float:-1.1526986E-17)
            r9.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpFragment.FragmentContent (PlpFragment.kt:53)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0012:
            Bn.k r10 = r8.S0()
            r0 = 0
            r1 = 2
            r2 = 0
            Cn.n.d(r10, r2, r9, r0, r1)
            XH.N r10 = XH.C16807N.f139792a
            r0 = -127172803(0xfffffffff86b7f3d, float:-1.9105788E34)
            r9.W(r0)
            boolean r0 = r9.F(r8)
            java.lang.Object r1 = r9.D()
            if (r0 != 0) goto L_0x0036
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x003e
        L_0x0036:
            com.ingka.ikea.browseandsearch.plp.impl.ui.PlpFragment$a r1 = new com.ingka.ikea.browseandsearch.plp.impl.ui.PlpFragment$a
            r1.<init>(r8, r2)
            r9.u(r1)
        L_0x003e:
            nI.p r1 = (nI.p) r1
            r9.P()
            r0 = 6
            U0.P.g(r10, r1, r9, r0)
            U0.I0 r10 = Vo.b.c()
            java.lang.Object r10 = r9.Q(r10)
            androidx.fragment.app.o r10 = (androidx.fragment.app.C5187o) r10
            r0 = -127163108(0xfffffffff86ba51c, float:-1.911779E34)
            r9.W(r0)
            java.lang.Object r0 = r9.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x006a
            x4.o r0 = androidx.navigation.fragment.a.a(r10)
            r9.u(r0)
        L_0x006a:
            r2 = r0
            x4.o r2 = (x4.C8951o) r2
            r9.P()
            java.lang.String r3 = r8.R0()
            r10 = -127154860(0xfffffffff86bc554, float:-1.9128001E34)
            r9.W(r10)
            boolean r10 = r9.F(r8)
            java.lang.Object r0 = r9.D()
            if (r10 != 0) goto L_0x008a
            java.lang.Object r10 = r1.a()
            if (r0 != r10) goto L_0x0092
        L_0x008a:
            Cn.q r0 = new Cn.q
            r0.<init>(r8)
            r9.u(r0)
        L_0x0092:
            r5 = r0
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 384(0x180, float:5.38E-43)
            java.lang.String r4 = "ChooseListBottomSheet.RequestKey"
            r6 = r9
            qw.l.d(r2, r3, r4, r5, r6, r7)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00a9
            U0.C4895p.R()
        L_0x00a9:
            r9.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.PlpFragment.D0(U0.m, int):void");
    }

    public String R0() {
        return this.f93501Z;
    }

    public final k S0() {
        k kVar = this.f93499X;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("navigationContract");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        T0().h0(getResources().getInteger(C12288c.f105880a));
    }
}
