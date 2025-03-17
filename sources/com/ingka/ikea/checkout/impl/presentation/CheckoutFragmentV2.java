package com.ingka.ikea.checkout.impl.presentation;

import HJ.C15854t;
import Mn.d;
import U0.C4889m;
import U0.C4895p;
import Uw.C13736a;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import Xn.i;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import oo.g;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import so.C11876a;
import to.C11940g;
import to.C11975y;
import uI.C18059h;
import uo.C12069a;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00107\u001a\u00020.8\u0016XD¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00102R\u001b\u0010<\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/ingka/ikea/checkout/impl/presentation/CheckoutFragmentV2;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "Lto/g;", "event", "LXH/N;", "Q0", "(Lto/g;)V", "R0", "P0", "D0", "(LU0/m;I)V", "Loo/g;", "X", "Loo/g;", "I0", "()Loo/g;", "setCheckoutInternalNavigation", "(Loo/g;)V", "checkoutInternalNavigation", "LXn/i;", "Y", "LXn/i;", "N0", "()LXn/i;", "setStartActivityInteractor", "(LXn/i;)V", "startActivityInteractor", "LEo/a;", "Z", "LEo/a;", "J0", "()LEo/a;", "setChromeApi", "(LEo/a;)V", "chromeApi", "LUw/a;", "y0", "LUw/a;", "L0", "()LUw/a;", "setPaymentNavigation", "(LUw/a;)V", "paymentNavigation", "", "z0", "LXH/o;", "M0", "()Ljava/lang/String;", "shopperResultUrlString", "A0", "Ljava/lang/String;", "K0", "destId", "Luo/a;", "B0", "O0", "()Luo/a;", "viewModel", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckoutFragmentV2 extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final String f94650A0 = "checkout/checkout?checkoutId={checkoutId}";

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f94651B0;

    /* renamed from: X  reason: collision with root package name */
    public g f94652X;

    /* renamed from: Y  reason: collision with root package name */
    public i f94653Y;

    /* renamed from: Z  reason: collision with root package name */
    public Eo.a f94654Z;

    /* renamed from: y0  reason: collision with root package name */
    public C13736a f94655y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f94656z0 = C16825p.b(new C11876a(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C11940g, C16807N> {
        a(Object obj) {
            super(1, obj, CheckoutFragmentV2.class, "handleEvent", "handleEvent(Lcom/ingka/ikea/checkout/impl/presentation/compose/CheckoutUiEvent;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C11940g) obj);
            return C16807N.f139792a;
        }

        public final void t(C11940g gVar) {
            C17542s.j(gVar, "p0");
            ((CheckoutFragmentV2) this.receiver).Q0(gVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94657c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f94657c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94657c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94658c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f94658c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94658c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94659c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f94659c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94659c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94660c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94660c = aVar;
            this.f94661d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94660c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94661d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94662c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94662c = oVar;
            this.f94663d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94663d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94662c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CheckoutFragmentV2() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f94651B0 = W.b(this, P.b(C12069a.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    private final String M0() {
        return (String) this.f94656z0.getValue();
    }

    private final C12069a O0() {
        return (C12069a) this.f94651B0.getValue();
    }

    private final void P0() {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Change delivery method result received", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CheckoutFragmentV2.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        rw.d.a(this, new Mn.d(d.a.START_CHECKOUT), "CheckoutFragmentV2RequestKey");
        R0();
    }

    /* access modifiers changed from: private */
    public final void Q0(C11940g gVar) {
        String str;
        char c10;
        Class<CheckoutFragmentV2> cls;
        C11940g gVar2 = gVar;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = CheckoutFragmentV2.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("Checkout event: " + gVar2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str4 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str4 = str6;
            str3 = str5;
        }
        if (C17542s.e(gVar2, C11940g.a.f103127a)) {
            R0();
        } else if (gVar2 instanceof C11940g.b) {
            P0();
        } else if (gVar2 instanceof C11940g.c) {
            C8951o f10 = rw.f.f(this, K0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C11940g.c cVar = (C11940g.c) gVar2;
                g.a.a(I0(), f10, cVar.a(), cVar.b(), (C) null, 8, (Object) null);
                return;
            }
            return;
        } else {
            if (gVar2 instanceof C11940g.e) {
                J0().a(getContext(), ((C11940g.e) gVar2).a());
                return;
            } else if (gVar2 instanceof C11940g.d) {
                ConfirmationActivity.b bVar2 = ConfirmationActivity.f94397Q;
                Context requireContext = requireContext();
                C17542s.i(requireContext, "requireContext(...)");
                Intent a11 = bVar2.a(requireContext, ((C11940g.d) gVar2).a());
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar3 : arrayList2) {
                    if (str7 == null) {
                        String a12 = C11818a.a("Start confirmation view", (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str7 = C11820c.a(a12);
                    }
                    if (str8 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, str2, 2, str2), '.', str2, 2, str2);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar3.a(eVar2, str8, false, (Throwable) null, str7);
                    str2 = null;
                    c10 = '$';
                }
                i N02 = N0();
                Context requireContext2 = requireContext();
                C17542s.i(requireContext2, "requireContext(...)");
                N02.a(requireContext2, a11);
                R0();
                return;
            } else {
                throw new t();
            }
        }
    }

    private final void R0() {
        androidx.navigation.fragment.a.a(this).k0();
    }

    /* access modifiers changed from: private */
    public static final String S0(CheckoutFragmentV2 checkoutFragmentV2) {
        C13736a L02 = checkoutFragmentV2.L0();
        Context requireContext = checkoutFragmentV2.requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        return L02.b(requireContext);
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1777453456);
        if (C4895p.J()) {
            C4895p.S(1777453456, i10, -1, "com.ingka.ikea.checkout.impl.presentation.CheckoutFragmentV2.FragmentContent (CheckoutFragmentV2.kt:56)");
        }
        C13736a L02 = L0();
        C12069a O02 = O0();
        String M02 = M0();
        mVar.W(-673532549);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C11975y.z(L02, O02, M02, (C17642l) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final g I0() {
        g gVar = this.f94652X;
        if (gVar != null) {
            return gVar;
        }
        C17542s.z("checkoutInternalNavigation");
        return null;
    }

    public final Eo.a J0() {
        Eo.a aVar = this.f94654Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeApi");
        return null;
    }

    public String K0() {
        return this.f94650A0;
    }

    public final C13736a L0() {
        C13736a aVar = this.f94655y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("paymentNavigation");
        return null;
    }

    public final i N0() {
        i iVar = this.f94653Y;
        if (iVar != null) {
            return iVar;
        }
        C17542s.z("startActivityInteractor");
        return null;
    }
}
