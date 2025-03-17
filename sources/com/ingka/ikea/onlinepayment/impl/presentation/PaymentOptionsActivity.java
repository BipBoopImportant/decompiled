package com.ingka.ikea.onlinepayment.impl.presentation;

import HJ.C15854t;
import KC.s;
import Nn.C;
import Nn.C10807j;
import Nn.H;
import Ow.l;
import Qw.C13463a;
import Sw.C13670b;
import Tw.C13695h;
import Tw.C13710m;
import U0.C4889m;
import U0.r;
import XH.C16807N;
import XH.C16824o;
import XH.t;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.activity.j;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import ay.C13992a;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.provider.Connect;
import com.sugarcube.core.logger.DslKt;
import e.C5282e;
import e.C5286i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lg.C10024a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;
import x4.C8935A;
import x4.y;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 f2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0019H\u0014¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0003R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010X\u001a\u00020S8PX\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0014XD¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010b8TX\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/ingka/ikea/onlinepayment/impl/presentation/PaymentOptionsActivity;", "Lcom/ingka/ikea/onlinepayment/impl/presentation/BasePaymentActivity;", "<init>", "()V", "LTw/m$a;", "startPaymentAction", "Le/i;", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutActivityResult;", "aciLauncher", "LXH/N;", "b1", "(LTw/m$a;Le/i;)V", "LTw/m$b;", "c1", "(LTw/m$b;)V", "LTw/m$c;", "d1", "(LTw/m$c;)V", "R0", "", "link", "a1", "(Ljava/lang/String;)V", "Z0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "outState", "onSaveInstanceState", "onResume", "onBackPressed", "LAe/e;", "K", "LAe/e;", "S0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "L", "Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "X0", "()Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "setProviderMode", "(Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;)V", "providerMode", "LEo/a;", "M", "LEo/a;", "U0", "()LEo/a;", "setChromeTabsApi", "(LEo/a;)V", "chromeTabsApi", "LYg/a;", "N", "LYg/a;", "V0", "()LYg/a;", "setGiftCardComposable", "(LYg/a;)V", "giftCardComposable", "LKC/s;", "O", "LKC/s;", "W0", "()LKC/s;", "setGiftCardValidator", "(LKC/s;)V", "giftCardValidator", "Lay/a;", "P", "Lay/a;", "Y0", "()Lay/a;", "setReassuranceNavigation", "(Lay/a;)V", "reassuranceNavigation", "LTw/h;", "Q", "LXH/o;", "G0", "()LTw/h;", "paymentViewModel", "", "R", "Z", "z0", "()Z", "drawUnderStatusBar", "T0", "()Ljava/lang/String;", "checkoutId", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "D0", "()Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderNameValidation", "S", "a", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentOptionsActivity extends j {

    /* renamed from: S  reason: collision with root package name */
    public static final a f119304S = new a((DefaultConstructorMarker) null);

    /* renamed from: T  reason: collision with root package name */
    public static final int f119305T = 8;

    /* renamed from: K  reason: collision with root package name */
    public Ae.e f119306K;

    /* renamed from: L  reason: collision with root package name */
    public Connect.ProviderMode f119307L;

    /* renamed from: M  reason: collision with root package name */
    public Eo.a f119308M;

    /* renamed from: N  reason: collision with root package name */
    public Yg.a f119309N;

    /* renamed from: O  reason: collision with root package name */
    public s f119310O;

    /* renamed from: P  reason: collision with root package name */
    public C13992a f119311P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f119312Q = new h0(P.b(C13695h.class), new d(this), new c(this), new e((C17631a) null, this));

    /* renamed from: R  reason: collision with root package name */
    private final boolean f119313R;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/onlinepayment/impl/presentation/PaymentOptionsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "checkoutId", "", "isExpressGooglePay", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;", "CHECKOUT_ID_KEY", "Ljava/lang/String;", "EXPRESS_GOOGLE_PAY", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String str, boolean z10) {
            C17542s.j(context, "context");
            C17542s.j(str, "checkoutId");
            Intent intent = new Intent(context, PaymentOptionsActivity.class);
            intent.putExtra("CHECKOUT_ID_KEY", str);
            intent.putExtra("EXPRESS_GOOGLE_PAY", z10);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PaymentOptionsActivity f119314a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements p<C13710m.a, C5286i<CheckoutSettings, CheckoutActivityResult>, C16807N> {
            a(Object obj) {
                super(2, obj, PaymentOptionsActivity.class, "startAci", "startAci(Lcom/ingka/ikea/onlinepayment/impl/presentation/viewmodel/StartPaymentAction$Aci;Landroidx/activity/compose/ManagedActivityResultLauncher;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                t((C13710m.a) obj, (C5286i) obj2);
                return C16807N.f139792a;
            }

            public final void t(C13710m.a aVar, C5286i<CheckoutSettings, CheckoutActivityResult> iVar) {
                C17542s.j(aVar, "p0");
                C17542s.j(iVar, "p1");
                ((PaymentOptionsActivity) this.receiver).b1(aVar, iVar);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity$b$b  reason: collision with other inner class name */
        /* synthetic */ class C2982b extends C17540p implements C17642l<C13710m.b, C16807N> {
            C2982b(Object obj) {
                super(1, obj, PaymentOptionsActivity.class, "startExternalPayment", "startExternalPayment(Lcom/ingka/ikea/onlinepayment/impl/presentation/viewmodel/StartPaymentAction$ExternalUrl;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((C13710m.b) obj);
                return C16807N.f139792a;
            }

            public final void t(C13710m.b bVar) {
                C17542s.j(bVar, "p0");
                ((PaymentOptionsActivity) this.receiver).c1(bVar);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends C17540p implements C17642l<C13710m.c, C16807N> {
            c(Object obj) {
                super(1, obj, PaymentOptionsActivity.class, "startSwishPayment", "startSwishPayment(Lcom/ingka/ikea/onlinepayment/impl/presentation/viewmodel/StartPaymentAction$Swish;)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t((C13710m.c) obj);
                return C16807N.f139792a;
            }

            public final void t(C13710m.c cVar) {
                C17542s.j(cVar, "p0");
                ((PaymentOptionsActivity) this.receiver).d1(cVar);
            }
        }

        b(PaymentOptionsActivity paymentOptionsActivity) {
            this.f119314a = paymentOptionsActivity;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(PaymentOptionsActivity paymentOptionsActivity, C8935A a10, y yVar) {
            C17542s.j(yVar, "$this$NavHost");
            C13695h G02 = paymentOptionsActivity.G0();
            a aVar = new a(paymentOptionsActivity);
            C2982b bVar = new C2982b(paymentOptionsActivity);
            y yVar2 = yVar;
            C8935A a11 = a10;
            l.o(yVar2, a11, G02, new l(paymentOptionsActivity, a10), aVar, new c(paymentOptionsActivity), bVar, paymentOptionsActivity.Y0().a());
            paymentOptionsActivity.Y0().d(yVar, a10);
            l.h(yVar, a10, paymentOptionsActivity.W0(), paymentOptionsActivity.V0());
            l.j(yVar, new m(paymentOptionsActivity));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(PaymentOptionsActivity paymentOptionsActivity, C8935A a10, C13463a aVar) {
            C17542s.j(aVar, "event");
            if (aVar instanceof C13463a.b) {
                paymentOptionsActivity.a1(((C13463a.b) aVar).a());
            } else if (C17542s.e(aVar, C13463a.c.f114889a)) {
                paymentOptionsActivity.finish();
            } else if (C17542s.e(aVar, C13463a.d.f114890a)) {
                paymentOptionsActivity.Y0().b(a10);
            } else if (C17542s.e(aVar, C13463a.e.f114891a)) {
                paymentOptionsActivity.Z0();
            } else if (C17542s.e(aVar, C13463a.C2820a.f114887a)) {
                paymentOptionsActivity.G0().T();
                paymentOptionsActivity.setResult(3336);
                paymentOptionsActivity.finish();
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(PaymentOptionsActivity paymentOptionsActivity) {
            paymentOptionsActivity.setResult(3335);
            paymentOptionsActivity.finish();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(U0.C4889m r17, int r18) {
            /*
                r16 = this;
                r0 = r16
                r12 = r17
                r1 = r18
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0016
                boolean r2 = r17.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                r17.L()
                goto L_0x0078
            L_0x0016:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0025
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:109)"
                r4 = -488526494(0xffffffffe2e1ad62, float:-2.0815055E21)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0025:
                r1 = 0
                x4.I[] r2 = new x4.I[r1]
                x4.A r1 = z4.m.e(r2, r12, r1)
                r2 = 242614745(0xe7601d9, float:3.032273E-30)
                r12.W(r2)
                com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity r2 = r0.f119314a
                boolean r2 = r12.F(r2)
                boolean r3 = r12.F(r1)
                r2 = r2 | r3
                com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity r3 = r0.f119314a
                java.lang.Object r4 = r17.D()
                if (r2 != 0) goto L_0x004d
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x0055
            L_0x004d:
                com.ingka.ikea.onlinepayment.impl.presentation.k r4 = new com.ingka.ikea.onlinepayment.impl.presentation.k
                r4.<init>(r3, r1)
                r12.u(r4)
            L_0x0055:
                r11 = r4
                nI.l r11 = (nI.C17642l) r11
                r17.P()
                r14 = 0
                r15 = 1020(0x3fc, float:1.43E-42)
                java.lang.String r2 = "payment/options"
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r13 = 48
                r12 = r17
                z4.n.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0078
                U0.C4895p.R()
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity.b.e(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f119315c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar) {
            super(0);
            this.f119315c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f119315c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f119316c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar) {
            super(0);
            this.f119316c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f119316c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119317c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f119318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, j jVar) {
            super(0);
            this.f119317c = aVar;
            this.f119318d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f119317c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f119318d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.onlinepayment.impl.presentation.PaymentOptionsActivity.e.invoke():l3.a");
        }
    }

    private final void R0() {
        overridePendingTransition(C10024a.f75255g, C10024a.f75254f);
    }

    private final String T0() {
        String stringExtra = getIntent().getStringExtra("CHECKOUT_ID_KEY");
        if (stringExtra != null) {
            return stringExtra;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No checkout id available");
        qv.e eVar = qv.e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = PaymentOptionsActivity.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
        return "";
    }

    /* access modifiers changed from: private */
    public final void Z0() {
        int i10 = G0().q0() ? 3334 : 3333;
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
                String a10 = C11818a.a("Purchase completed. Send " + i10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = PaymentOptionsActivity.class.getName();
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
        setResult(i10);
        finish();
    }

    /* access modifiers changed from: private */
    public final void a1(String str) {
        U0().a(this, str);
    }

    /* access modifiers changed from: private */
    public final void b1(C13710m.a aVar, C5286i<CheckoutSettings, CheckoutActivityResult> iVar) {
        String str;
        char c10;
        char c11;
        String f10;
        G0().B0(true);
        H i02 = G0().i0();
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<PaymentOptionsActivity> cls = PaymentOptionsActivity.class;
        if (i02 == null || (f10 = i02.f()) == null) {
            IllegalStateException illegalStateException = new IllegalStateException("No sessionId available when starting ACI");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c11 = 2;
                    c10 = '$';
                    str = str2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                    c11 = 2;
                    c10 = '$';
                }
                char c12 = c11;
                char c13 = c10;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str2 = str;
            }
            return;
        }
        CheckoutSettings E02 = E0(f10, aVar.c(), aVar.a(), X0(), aVar.b());
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str5 = null;
        String str6 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str5 == null) {
                String a11 = C11818a.a("Start aci with aci checkoutId: " + E02.getCheckoutId(), (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str5 = C11820c.a(a11);
            }
            String str7 = str5;
            if (str6 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            String str8 = str6;
            bVar2.a(eVar2, str8, false, (Throwable) null, str7);
            str6 = str8;
            str5 = str7;
            eVar2 = eVar2;
        }
        iVar.a(E02);
    }

    /* access modifiers changed from: private */
    public final void c1(C13710m.b bVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Open external url", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = PaymentOptionsActivity.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        U0().a(this, bVar.a());
    }

    /* access modifiers changed from: private */
    public final void d1(C13710m.c cVar) {
        String a10 = cVar.a();
        PackageManager packageManager = getPackageManager();
        C17542s.i(packageManager, "getPackageManager(...)");
        if (C13670b.b(a10, this, packageManager, G0().k0())) {
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
                    String a11 = C11818a.a("Swish started", (Throwable) null);
                    if (a11 != null) {
                        str = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = PaymentOptionsActivity.class.getName();
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
            return;
        }
        G0().C0(C11849b.f102229Q2);
    }

    /* access modifiers changed from: protected */
    public MComConfig.b D0() {
        return G0().d0();
    }

    public C13695h G0() {
        return (C13695h) this.f119312Q.getValue();
    }

    public final Ae.e S0() {
        Ae.e eVar = this.f119306K;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Eo.a U0() {
        Eo.a aVar = this.f119308M;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public final Yg.a V0() {
        Yg.a aVar = this.f119309N;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("giftCardComposable");
        return null;
    }

    public final s W0() {
        s sVar = this.f119310O;
        if (sVar != null) {
            return sVar;
        }
        C17542s.z("giftCardValidator");
        return null;
    }

    public final Connect.ProviderMode X0() {
        Connect.ProviderMode providerMode = this.f119307L;
        if (providerMode != null) {
            return providerMode;
        }
        C17542s.z("providerMode");
        return null;
    }

    public final C13992a Y0() {
        C13992a aVar = this.f119311P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("reassuranceNavigation");
        return null;
    }

    public void onBackPressed() {
        super.onBackPressed();
        R0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        overridePendingTransition(C10024a.f75252d, C10024a.f75256h);
        super.onCreate(bundle);
        setTitle(C11849b.f102349t1);
        C13695h G02 = G0();
        String T02 = T0();
        PackageManager packageManager = getPackageManager();
        C17542s.i(packageManager, "getPackageManager(...)");
        G02.p0(T02, C13670b.a(packageManager));
        if (bundle != null) {
            G0().w0(new C10807j(bundle.getString("CHECKOUT_ID_KEY"), (C) bundle.getParcelable("PAYMENT_HOLDER_KEY"), (H) bundle.getParcelable("PSP_SESSION_KEY"), (List) bundle.getParcelable("CHECKOUT_ITEMS_KEY")));
        }
        C5282e.b(this, (r) null, c1.c.c(-488526494, true, new b(this)), 1, (Object) null);
        F0().e(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        S0().e(this, "payment_landing");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        G0().x0(T0(), bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        U0().d(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        U0().c(this);
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f119313R;
    }
}
