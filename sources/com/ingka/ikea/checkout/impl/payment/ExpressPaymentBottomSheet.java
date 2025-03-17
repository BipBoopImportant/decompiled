package com.ingka.ikea.checkout.impl.payment;

import HJ.C15854t;
import QJ.Q;
import Uw.C13736a;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import android.content.Context;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.checkout.impl.payment.a;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.oppwa.mobile.connect.provider.AsyncPaymentActivity;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
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
import ro.C11835a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ingka/ikea/checkout/impl/payment/ExpressPaymentBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "LUw/a;", "U", "LUw/a;", "O0", "()LUw/a;", "setPaymentNavigation", "(LUw/a;)V", "paymentNavigation", "LEo/a;", "X", "LEo/a;", "N0", "()LEo/a;", "setChromeApi", "(LEo/a;)V", "chromeApi", "Lro/a;", "Y", "LXH/o;", "Q0", "()Lro/a;", "viewModel", "", "Z", "P0", "()Ljava/lang/String;", "shopperResultUrlString", "y0", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressPaymentBottomSheet extends b {

    /* renamed from: y0  reason: collision with root package name */
    public static final b f94630y0 = new b((DefaultConstructorMarker) null);

    /* renamed from: z0  reason: collision with root package name */
    public static final int f94631z0 = 8;

    /* renamed from: U  reason: collision with root package name */
    public C13736a f94632U;

    /* renamed from: X  reason: collision with root package name */
    public Eo.a f94633X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f94634Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f94635Z = C16825p.b(new po.c(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.payment.ExpressPaymentBottomSheet$BottomSheetContent$3$1", f = "ExpressPaymentBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94636c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ExpressPaymentBottomSheet f94637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ExpressPaymentBottomSheet expressPaymentBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f94637d = expressPaymentBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f94637d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94636c == 0) {
                y.b(obj);
                this.f94637d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/checkout/impl/payment/ExpressPaymentBottomSheet$b;", "", "<init>", "()V", "", "checkoutId", "Lcom/ingka/ikea/checkout/impl/payment/ExpressPaymentBottomSheet;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/impl/payment/ExpressPaymentBottomSheet;", "TAG", "Ljava/lang/String;", "CHECKOUT_ID", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExpressPaymentBottomSheet a(String str) {
            C17542s.j(str, "checkoutId");
            ExpressPaymentBottomSheet expressPaymentBottomSheet = new ExpressPaymentBottomSheet();
            expressPaymentBottomSheet.setArguments(D2.d.b(C16796C.a(AsyncPaymentActivity.EXTRA_CHECKOUT_ID, str)));
            return expressPaymentBottomSheet;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94638c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f94638c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94638c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94639c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f94639c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94639c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94640c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f94640c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94640c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94641c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94641c = aVar;
            this.f94642d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94641c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94642d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94643c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94643c = oVar;
            this.f94644d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94644d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94643c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ExpressPaymentBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f94634Y = W.b(this, P.b(C11835a.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(ExpressPaymentBottomSheet expressPaymentBottomSheet) {
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
                String a10 = C11818a.a("onExpressFlowCreated, set result and dismiss", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = expressPaymentBottomSheet.getClass().getName();
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
        C5197z.c(expressPaymentBottomSheet, "ExpressPaymentBottomSheet_REQUEST_KEY", D2.d.b(C16796C.a("ExpressPaymentBottomSheet_BUNDLE_KEY", a.C2106a.f94645a)));
        expressPaymentBottomSheet.dismiss();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(ExpressPaymentBottomSheet expressPaymentBottomSheet, String str) {
        C17542s.j(str, "it");
        expressPaymentBottomSheet.N0().a(expressPaymentBottomSheet.getContext(), str);
        return C16807N.f139792a;
    }

    private final String P0() {
        return (String) this.f94635Z.getValue();
    }

    private final C11835a Q0() {
        return (C11835a) this.f94634Y.getValue();
    }

    /* access modifiers changed from: private */
    public static final String R0(ExpressPaymentBottomSheet expressPaymentBottomSheet) {
        C13736a O02 = expressPaymentBottomSheet.O0();
        Context requireContext = expressPaymentBottomSheet.requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        return O02.b(requireContext);
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    public final Eo.a N0() {
        Eo.a aVar = this.f94633X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeApi");
        return null;
    }

    public final C13736a O0() {
        C13736a aVar = this.f94632U;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("paymentNavigation");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r10, int r11) {
        /*
            r9 = this;
            r0 = 340604780(0x144d376c, float:1.0360785E-26)
            r10.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.checkout.impl.payment.ExpressPaymentBottomSheet.BottomSheetContent (ExpressPaymentBottomSheet.kt:38)"
            U0.C4895p.S(r0, r11, r1, r2)
        L_0x0012:
            ro.a r3 = r9.Q0()
            java.lang.String r4 = r9.P0()
            r11 = -927240535(0xffffffffc8bb6ea9, float:-383861.28)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x0032
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x003a
        L_0x0032:
            po.a r0 = new po.a
            r0.<init>(r9)
            r10.u(r0)
        L_0x003a:
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r10.P()
            r11 = -927226759(0xffffffffc8bba479, float:-384291.78)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x0058
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0060
        L_0x0058:
            po.b r0 = new po.b
            r0.<init>(r9)
            r10.u(r0)
        L_0x0060:
            r6 = r0
            nI.l r6 = (nI.C17642l) r6
            r10.P()
            r8 = 0
            r7 = r10
            to.C11957o0.n(r3, r4, r5, r6, r7, r8)
            XH.N r11 = XH.C16807N.f139792a
            r0 = -927221125(0xffffffffc8bbba7b, float:-384467.84)
            r10.W(r0)
            boolean r0 = r10.F(r9)
            java.lang.Object r1 = r10.D()
            if (r0 != 0) goto L_0x0085
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x008e
        L_0x0085:
            com.ingka.ikea.checkout.impl.payment.ExpressPaymentBottomSheet$a r1 = new com.ingka.ikea.checkout.impl.payment.ExpressPaymentBottomSheet$a
            r0 = 0
            r1.<init>(r9, r0)
            r10.u(r1)
        L_0x008e:
            nI.p r1 = (nI.p) r1
            r10.P()
            r0 = 6
            U0.P.g(r11, r1, r10, r0)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x00a0
            U0.C4895p.R()
        L_0x00a0:
            r10.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.payment.ExpressPaymentBottomSheet.u0(U0.m, int):void");
    }
}
