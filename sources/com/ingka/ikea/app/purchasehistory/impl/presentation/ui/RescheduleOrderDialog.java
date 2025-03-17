package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ai.C1;
import Ci.C10624D;
import Ei.C10670E;
import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.l;
import com.sugarcube.core.logger.DslKt;
import ip.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/RescheduleOrderDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "LXH/N;", "x0", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "z0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "P", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "LEi/E;", "Q", "LXH/o;", "w0", "()LEi/E;", "viewModel", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RescheduleOrderDialog extends Hilt_RescheduleOrderDialog {

    /* renamed from: P  reason: collision with root package name */
    private final String f90905P = "purchaseHistory/order/reschedule?orderId={orderId}&deliveryNumber={deliveryNumber}";

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f90906Q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RescheduleOrderDialog f90907a;

        a(RescheduleOrderDialog rescheduleOrderDialog) {
            this.f90907a = rescheduleOrderDialog;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(RescheduleOrderDialog rescheduleOrderDialog) {
            rescheduleOrderDialog.dismiss();
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1518404557, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.RescheduleOrderDialog.onCreateView.<anonymous>.<anonymous> (RescheduleOrderDialog.kt:61)");
                }
                C10670E v02 = this.f90907a.w0();
                mVar.W(632527408);
                boolean F10 = mVar.F(this.f90907a);
                RescheduleOrderDialog rescheduleOrderDialog = this.f90907a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new m(rescheduleOrderDialog);
                    mVar.u(D10);
                }
                mVar.P();
                C1.b(v02, (C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90908c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f90908c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90908c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90909c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f90909c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90909c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90910c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f90910c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90910c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90911c = aVar;
            this.f90912d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90911c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90912d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90913c = oVar;
            this.f90914d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90914d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90913c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public RescheduleOrderDialog() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f90906Q = W.b(this, P.b(C10670E.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final C10670E w0() {
        return (C10670E) this.f90906Q.getValue();
    }

    private final void x0() {
        if (rw.a.b(this)) {
            F<C10670E.b> I10 = w0().I();
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            j.a(I10, viewLifecycleOwner, new C10624D(this));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y0(RescheduleOrderDialog rescheduleOrderDialog, C10670E.b bVar) {
        char c10;
        RescheduleOrderDialog rescheduleOrderDialog2 = rescheduleOrderDialog;
        C10670E.b bVar2 = bVar;
        C17542s.j(bVar2, "it");
        char c11 = '$';
        if (C17542s.e(bVar2, C10670E.b.a.f80381a)) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar3 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Fetch time slots error, closing", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = rescheduleOrderDialog.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar3.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
                c11 = '$';
            }
            rw.d.a(rescheduleOrderDialog2, l.a.f90953a, "RescheduleOrderDialogRequestKey");
        } else if (C17542s.e(bVar2, C10670E.b.d.f80384a)) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar4 : arrayList2) {
                if (str4 == null) {
                    String a11 = C11818a.a("Select time slot error, closing", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                if (str5 == null) {
                    String name2 = rescheduleOrderDialog.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar4.a(eVar2, str5, false, (Throwable) null, str4);
            }
            rw.d.a(rescheduleOrderDialog2, l.b.f90955a, "RescheduleOrderDialogRequestKey");
        } else if (C17542s.e(bVar2, C10670E.b.e.f80385a)) {
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar5 : arrayList3) {
                if (str6 == null) {
                    String a12 = C11818a.a("New time slot selected, closing", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str6 = C11820c.a(a12);
                }
                if (str7 == null) {
                    String name3 = rescheduleOrderDialog.getClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar5.a(eVar3, str7, false, (Throwable) null, str6);
            }
            rw.d.a(rescheduleOrderDialog2, l.d.f90959a, "RescheduleOrderDialogRequestKey");
        } else if (C17542s.e(bVar2, C10670E.b.c.f80383a)) {
            rw.d.a(rescheduleOrderDialog2, l.c.f90957a, "RescheduleOrderDialogRequestKey");
        } else if (C17542s.e(bVar2, C10670E.b.C1518b.f80382a)) {
            qv.e eVar4 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar6 : arrayList4) {
                if (str8 == null) {
                    String a13 = C11818a.a("No change made, closing", (Throwable) null);
                    if (a13 == null) {
                        break;
                    }
                    str8 = C11820c.a(a13);
                }
                if (str9 == null) {
                    String name4 = rescheduleOrderDialog.getClass().getName();
                    C17542s.g(name4);
                    c10 = '$';
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                } else {
                    c10 = '$';
                }
                char c12 = c10;
                bVar6.a(eVar4, str9, false, (Throwable) null, str8);
            }
        } else {
            throw new t();
        }
        rescheduleOrderDialog.dismiss();
        return C16807N.f139792a;
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

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        x0();
    }

    /* renamed from: z0 */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        TC.e.l(composeView, false, c1.c.c(-1518404557, true, new a(this)), 1, (Object) null);
        return composeView;
    }
}
