package com.ingka.ikea.populartimes.impl.ui;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import ex.C14430a;
import ex.C14431b;
import ex.C14432c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u0002"}, d2 = {"Lcom/ingka/ikea/populartimes/impl/ui/PopularTimesBottomSheetFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lex/c;", "L", "LXH/o;", "y0", "()Lex/c;", "viewModel", "Lex/b;", "state", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PopularTimesBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f119334L;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PopularTimesBottomSheetFragment f119335a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment$a$a  reason: collision with other inner class name */
        static final class C2983a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PopularTimesBottomSheetFragment f119336a;

            C2983a(PopularTimesBottomSheetFragment popularTimesBottomSheetFragment) {
                this.f119336a = popularTimesBottomSheetFragment;
            }

            private static final C14431b e(A1<? extends C14431b> a12) {
                return (C14431b) a12.getValue();
            }

            /* access modifiers changed from: private */
            public static final C16807N f(PopularTimesBottomSheetFragment popularTimesBottomSheetFragment) {
                if (rw.a.b(popularTimesBottomSheetFragment)) {
                    androidx.navigation.fragment.a.a(popularTimesBottomSheetFragment).i0();
                } else {
                    popularTimesBottomSheetFragment.dismiss();
                }
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(PopularTimesBottomSheetFragment popularTimesBottomSheetFragment, C14430a aVar) {
                C17542s.j(aVar, "it");
                popularTimesBottomSheetFragment.y0().F(aVar);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(U0.C4889m r10, int r11) {
                /*
                    r9 = this;
                    r0 = r11 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r10.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r10.L()
                    goto L_0x00e3
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PopularTimesBottomSheetFragment.kt:52)"
                    r2 = -2009108896(0xffffffff883f6e60, float:-5.7606717E-34)
                    U0.C4895p.S(r2, r11, r0, r1)
                L_0x0020:
                    r11 = -2091753245(0xffffffff835260e3, float:-6.1824674E-37)
                    r10.W(r11)
                    U0.I0 r11 = androidx.compose.ui.platform.C5135u0.a()
                    java.lang.Object r11 = r10.Q(r11)
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    r0 = 0
                    if (r11 != 0) goto L_0x005c
                    U0.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                    java.lang.Object r11 = r10.Q(r11)
                    android.content.Context r11 = (android.content.Context) r11
                    android.app.Activity r11 = Xo.c.a(r11)
                    if (r11 == 0) goto L_0x005e
                    T0.c r11 = T0.a.a(r11, r10, r0)
                    int r11 = r11.b()
                    T0.d$a r1 = T0.d.f13504b
                    int r1 = r1.d()
                    boolean r11 = T0.d.F(r11, r1)
                    if (r11 != 0) goto L_0x005c
                    r0 = 1
                L_0x005c:
                    r1 = r0
                    goto L_0x0066
                L_0x005e:
                    java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                    java.lang.String r11 = "Required value was null."
                    r10.<init>(r11)
                    throw r10
                L_0x0066:
                    r10.P()
                    com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment r11 = r9.f119336a
                    ex.c r11 = r11.y0()
                    TJ.P r2 = r11.getState()
                    r7 = 0
                    r8 = 7
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = r10
                    U0.A1 r11 = j3.a.c(r2, r3, r4, r5, r6, r7, r8)
                    ex.b r0 = e(r11)
                    r11 = -2091735965(0xffffffff8352a463, float:-6.190216E-37)
                    r10.W(r11)
                    com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment r11 = r9.f119336a
                    boolean r11 = r10.F(r11)
                    com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment r2 = r9.f119336a
                    java.lang.Object r3 = r10.D()
                    if (r11 != 0) goto L_0x009d
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r3 != r11) goto L_0x00a5
                L_0x009d:
                    com.ingka.ikea.populartimes.impl.ui.a r3 = new com.ingka.ikea.populartimes.impl.ui.a
                    r3.<init>(r2)
                    r10.u(r3)
                L_0x00a5:
                    r2 = r3
                    nI.a r2 = (nI.C17631a) r2
                    r10.P()
                    r11 = -2091727174(0xffffffff8352c6ba, float:-6.194158E-37)
                    r10.W(r11)
                    com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment r11 = r9.f119336a
                    boolean r11 = r10.F(r11)
                    com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment r3 = r9.f119336a
                    java.lang.Object r4 = r10.D()
                    if (r11 != 0) goto L_0x00c7
                    U0.m$a r11 = U0.C4889m.f14007a
                    java.lang.Object r11 = r11.a()
                    if (r4 != r11) goto L_0x00cf
                L_0x00c7:
                    com.ingka.ikea.populartimes.impl.ui.b r4 = new com.ingka.ikea.populartimes.impl.ui.b
                    r4.<init>(r3)
                    r10.u(r4)
                L_0x00cf:
                    r3 = r4
                    nI.l r3 = (nI.C17642l) r3
                    r10.P()
                    r5 = 0
                    r4 = r10
                    fx.I.n(r0, r1, r2, r3, r4, r5)
                    boolean r10 = U0.C4895p.J()
                    if (r10 == 0) goto L_0x00e3
                    U0.C4895p.R()
                L_0x00e3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment.a.C2983a.c(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(PopularTimesBottomSheetFragment popularTimesBottomSheetFragment) {
            this.f119335a = popularTimesBottomSheetFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(134039942, i10, -1, "com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (PopularTimesBottomSheetFragment.kt:51)");
                }
                TC.e.e(false, c1.c.e(-2009108896, true, new C2983a(this.f119335a), mVar, 54), mVar, 48, 1);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119337c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f119337c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119337c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119338c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f119338c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119338c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119339c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f119339c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119339c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119340c = aVar;
            this.f119341d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119340c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119341d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119342c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119342c = oVar;
            this.f119343d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119343d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119342c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PopularTimesBottomSheetFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f119334L = W.b(this, P.b(C14432c.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final C14432c y0() {
        return (C14432c) this.f119334L.getValue();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C17542s.i(onCreateDialog, "onCreateDialog(...)");
        if ((onCreateDialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) onCreateDialog : null) != null) {
            com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
            aVar.o().X0(3);
            aVar.o().W0(true);
        }
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c1.c.c(134039942, true, new a(this)));
        return composeView;
    }
}
