package bo;

import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import KJ.C15987c;
import Nn.C10806i;
import Nn.C10813p;
import Nn.u;
import RC.m;
import RC.n;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import Yn.C10994i;
import androidx.lifecycle.F;
import androidx.lifecycle.f0;
import ao.C11072a;
import ao.C11076e;
import com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity;
import com.ingka.ikea.mcomsettings.MComConfig;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import jo.C11435a;
import jo.C11436b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import lo.j;
import nI.p;
import nI.q;
import nI.r;
import nI.s;
import no.C11663a;
import rv.C11848a;
import rv.C11849b;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002Z[B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010&\u001a\u0004\u0018\u00010%*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020*¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0A8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120=8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u0002090I8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010KR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160=8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010?R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140=8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010?R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00180=8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010?R\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020U0T8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b/\u0010X¨\u0006\\"}, d2 = {"Lbo/f;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LIl/a;", "appConfigApi", "Lao/e;", "getConfirmationPriceSummaryUseCase", "Lao/c;", "getConfirmationDataUseCase", "Lao/a;", "getConfirmationConfigUseCase", "Lao/g;", "getOrderAssemblyServicesUseCase", "<init>", "(Landroidx/lifecycle/U;LIl/a;Lao/e;Lao/c;Lao/a;Lao/g;)V", "Lbo/f$a;", "confirmationHolder", "Lao/a$a;", "confirmationConfig", "LRC/m;", "priceSummary", "Lbo/f$b$a$a;", "assemblyInformation", "Lbo/f$b$a;", "G", "(Lbo/f$a;Lao/a$a;LRC/m;Lbo/f$b$a$a;)Lbo/f$b$a;", "Lbo/f$b$a$c;", "E", "(Lbo/f$a;Lao/a$a;)Lbo/f$b$a$c;", "Lbo/f$b$a$b;", "D", "(Lbo/f$a;)Lbo/f$b$a$b;", "Lbo/f$a$a;", "", "Lno/a;", "checkoutProductItems", "Ljo/b;", "k", "(Lbo/f$a$a;Ljava/util/List;)Ljo/b;", "LIC/e;", "message", "LXH/N;", "H", "(LIC/e;)V", "I", "()V", "m", "LIl/a;", "n", "Lao/g;", "", "o", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "checkoutId", "", "p", "Z", "showTotalExclTaxInCartAndCheckout", "LTJ/g;", "q", "LTJ/g;", "configFlow", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "r", "Landroidx/lifecycle/F;", "F", "()Landroidx/lifecycle/F;", "surveyConfig", "s", "LTJ/B;", "t", "LTJ/B;", "u", "snackbarMessage", "v", "hasError", "w", "x", "y", "uiData", "LTJ/P;", "Lbo/f$b;", "z", "LTJ/P;", "()LTJ/P;", "uiState", "a", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final Il.a f90521m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final ao.g f90522n;

    /* renamed from: o  reason: collision with root package name */
    private final String f90523o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f90524p;

    /* renamed from: q  reason: collision with root package name */
    private final C16532g<C11072a.C1955a> f90525q;

    /* renamed from: r  reason: collision with root package name */
    private final F<MComConfig.f> f90526r;

    /* renamed from: s  reason: collision with root package name */
    private final C16532g<C11072a.C1955a> f90527s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<a> f90528t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<C13023e> f90529u;

    /* renamed from: v  reason: collision with root package name */
    private final C16505B<Boolean> f90530v;

    /* renamed from: w  reason: collision with root package name */
    private final C16532g<b.a.C1968a> f90531w;

    /* renamed from: x  reason: collision with root package name */
    private final C16532g<m> f90532x;

    /* renamed from: y  reason: collision with root package name */
    private final C16532g<b.a> f90533y;

    /* renamed from: z  reason: collision with root package name */
    private final C16519P<b> f90534z;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001:\u0001\u001aBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001d\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b%\u0010\"¨\u0006*"}, d2 = {"Lbo/f$a;", "", "", "orderNumber", "LNn/i;", "priceHolder", "", "Lno/a;", "checkoutProductItems", "Lbo/f$a$a;", "delivery", "", "amountPaidWithoutGiftCard", "LNn/F;", "transactions", "<init>", "(Ljava/lang/String;LNn/i;Ljava/util/List;Lbo/f$a$a;Ljava/lang/Double;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LNn/i;", "d", "()LNn/i;", "Ljava/util/List;", "()Ljava/util/List;", "Lbo/f$a$a;", "()Lbo/f$a$a;", "e", "Ljava/lang/Double;", "getAmountPaidWithoutGiftCard", "()Ljava/lang/Double;", "f", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f90535a;

        /* renamed from: b  reason: collision with root package name */
        private final C10806i f90536b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C11663a> f90537c;

        /* renamed from: d  reason: collision with root package name */
        private final C1967a f90538d;

        /* renamed from: e  reason: collision with root package name */
        private final Double f90539e;

        /* renamed from: f  reason: collision with root package name */
        private final List<Nn.F> f90540f;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006$"}, d2 = {"Lbo/f$a$a;", "", "", "deliveryServiceId", "LNn/p;", "deliveryServiceType", "LNn/u;", "fulfillmentServiceType", "", "Ljo/a;", "deliveryArrangements", "Lcom/ingka/ikea/checkout/impl/confirmation/ConfirmationActivity$a;", "deliveryAddressDetails", "<init>", "(Ljava/lang/String;LNn/p;LNn/u;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LNn/p;", "d", "()LNn/p;", "LNn/u;", "e", "()LNn/u;", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bo.f$a$a  reason: collision with other inner class name */
        public static final class C1967a {

            /* renamed from: a  reason: collision with root package name */
            private final String f90541a;

            /* renamed from: b  reason: collision with root package name */
            private final C10813p f90542b;

            /* renamed from: c  reason: collision with root package name */
            private final u f90543c;

            /* renamed from: d  reason: collision with root package name */
            private final List<C11435a> f90544d;

            /* renamed from: e  reason: collision with root package name */
            private final List<ConfirmationActivity.a> f90545e;

            public C1967a(String str, C10813p pVar, u uVar, List<C11435a> list, List<ConfirmationActivity.a> list2) {
                C17542s.j(str, "deliveryServiceId");
                C17542s.j(pVar, "deliveryServiceType");
                C17542s.j(uVar, "fulfillmentServiceType");
                C17542s.j(list2, "deliveryAddressDetails");
                this.f90541a = str;
                this.f90542b = pVar;
                this.f90543c = uVar;
                this.f90544d = list;
                this.f90545e = list2;
            }

            public final List<ConfirmationActivity.a> a() {
                return this.f90545e;
            }

            public final List<C11435a> b() {
                return this.f90544d;
            }

            public final String c() {
                return this.f90541a;
            }

            public final C10813p d() {
                return this.f90542b;
            }

            public final u e() {
                return this.f90543c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1967a)) {
                    return false;
                }
                C1967a aVar = (C1967a) obj;
                return C17542s.e(this.f90541a, aVar.f90541a) && this.f90542b == aVar.f90542b && this.f90543c == aVar.f90543c && C17542s.e(this.f90544d, aVar.f90544d) && C17542s.e(this.f90545e, aVar.f90545e);
            }

            public int hashCode() {
                int hashCode = ((((this.f90541a.hashCode() * 31) + this.f90542b.hashCode()) * 31) + this.f90543c.hashCode()) * 31;
                List<C11435a> list = this.f90544d;
                return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f90545e.hashCode();
            }

            public String toString() {
                String str = this.f90541a;
                C10813p pVar = this.f90542b;
                u uVar = this.f90543c;
                List<C11435a> list = this.f90544d;
                List<ConfirmationActivity.a> list2 = this.f90545e;
                return "Delivery(deliveryServiceId=" + str + ", deliveryServiceType=" + pVar + ", fulfillmentServiceType=" + uVar + ", deliveryArrangements=" + list + ", deliveryAddressDetails=" + list2 + ")";
            }
        }

        public a(String str, C10806i iVar, List<C11663a> list, C1967a aVar, Double d10, List<? extends Nn.F> list2) {
            C17542s.j(iVar, "priceHolder");
            C17542s.j(list, "checkoutProductItems");
            C17542s.j(aVar, "delivery");
            C17542s.j(list2, "transactions");
            this.f90535a = str;
            this.f90536b = iVar;
            this.f90537c = list;
            this.f90538d = aVar;
            this.f90539e = d10;
            this.f90540f = list2;
        }

        public final List<C11663a> a() {
            return this.f90537c;
        }

        public final C1967a b() {
            return this.f90538d;
        }

        public final String c() {
            return this.f90535a;
        }

        public final C10806i d() {
            return this.f90536b;
        }

        public final List<Nn.F> e() {
            return this.f90540f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f90535a, aVar.f90535a) && C17542s.e(this.f90536b, aVar.f90536b) && C17542s.e(this.f90537c, aVar.f90537c) && C17542s.e(this.f90538d, aVar.f90538d) && C17542s.e(this.f90539e, aVar.f90539e) && C17542s.e(this.f90540f, aVar.f90540f);
        }

        public int hashCode() {
            String str = this.f90535a;
            int i10 = 0;
            int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.f90536b.hashCode()) * 31) + this.f90537c.hashCode()) * 31) + this.f90538d.hashCode()) * 31;
            Double d10 = this.f90539e;
            if (d10 != null) {
                i10 = d10.hashCode();
            }
            return ((hashCode + i10) * 31) + this.f90540f.hashCode();
        }

        public String toString() {
            String str = this.f90535a;
            C10806i iVar = this.f90536b;
            List<C11663a> list = this.f90537c;
            C1967a aVar = this.f90538d;
            Double d10 = this.f90539e;
            List<Nn.F> list2 = this.f90540f;
            return "ConfirmationHolder(orderNumber=" + str + ", priceHolder=" + iVar + ", checkoutProductItems=" + list + ", delivery=" + aVar + ", amountPaidWithoutGiftCard=" + d10 + ", transactions=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lbo/f$b;", "", "Lbo/f$b$a;", "uiData", "LIC/e;", "snackbarMessage", "", "hasError", "<init>", "(Lbo/f$b$a;LIC/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbo/f$b$a;", "c", "()Lbo/f$b$a;", "b", "LIC/e;", "()LIC/e;", "Z", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f90546a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f90547b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f90548c;

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001:\u0005 -'$)By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b \u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b'\u0010\u0018¨\u0006:"}, d2 = {"Lbo/f$b$a;", "", "Lbo/f$b$a$c;", "payment", "", "LYn/i;", "collapsedDetails", "Ljo/b;", "deliveryDetails", "Lbo/f$b$a$a;", "assemblyInformation", "Lbo/f$b$a$b;", "orderSummary", "LRC/m;", "priceSummary", "Lbo/f$b$a$e;", "viewOrderDetails", "Lbo/f$b$a$d;", "surveyConfig", "", "contactUri", "<init>", "(Lbo/f$b$a$c;Ljava/util/List;Ljo/b;Lbo/f$b$a$a;Lbo/f$b$a$b;LRC/m;Lbo/f$b$a$e;Lbo/f$b$a$d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbo/f$b$a$c;", "f", "()Lbo/f$b$a$c;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljo/b;", "d", "()Ljo/b;", "Lbo/f$b$a$a;", "()Lbo/f$b$a$a;", "e", "Lbo/f$b$a$b;", "()Lbo/f$b$a$b;", "LRC/m;", "g", "()LRC/m;", "Lbo/f$b$a$e;", "i", "()Lbo/f$b$a$e;", "h", "Lbo/f$b$a$d;", "()Lbo/f$b$a$d;", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final c f90549a;

            /* renamed from: b  reason: collision with root package name */
            private final List<C10994i> f90550b;

            /* renamed from: c  reason: collision with root package name */
            private final C11436b f90551c;

            /* renamed from: d  reason: collision with root package name */
            private final C1968a f90552d;

            /* renamed from: e  reason: collision with root package name */
            private final C1969b f90553e;

            /* renamed from: f  reason: collision with root package name */
            private final m f90554f;

            /* renamed from: g  reason: collision with root package name */
            private final e f90555g;

            /* renamed from: h  reason: collision with root package name */
            private final d f90556h;

            /* renamed from: i  reason: collision with root package name */
            private final String f90557i;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lbo/f$b$a$a;", "", "LIC/e;", "title", "description", "", "orderId", "<init>", "(LIC/e;LIC/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: bo.f$b$a$a  reason: collision with other inner class name */
            public static final class C1968a {

                /* renamed from: d  reason: collision with root package name */
                public static final int f90558d = C13023e.f110931a;

                /* renamed from: a  reason: collision with root package name */
                private final C13023e f90559a;

                /* renamed from: b  reason: collision with root package name */
                private final C13023e f90560b;

                /* renamed from: c  reason: collision with root package name */
                private final String f90561c;

                public C1968a(C13023e eVar, C13023e eVar2, String str) {
                    C17542s.j(eVar, "title");
                    C17542s.j(eVar2, "description");
                    C17542s.j(str, "orderId");
                    this.f90559a = eVar;
                    this.f90560b = eVar2;
                    this.f90561c = str;
                }

                public final C13023e a() {
                    return this.f90560b;
                }

                public final String b() {
                    return this.f90561c;
                }

                public final C13023e c() {
                    return this.f90559a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1968a)) {
                        return false;
                    }
                    C1968a aVar = (C1968a) obj;
                    return C17542s.e(this.f90559a, aVar.f90559a) && C17542s.e(this.f90560b, aVar.f90560b) && C17542s.e(this.f90561c, aVar.f90561c);
                }

                public int hashCode() {
                    return (((this.f90559a.hashCode() * 31) + this.f90560b.hashCode()) * 31) + this.f90561c.hashCode();
                }

                public String toString() {
                    C13023e eVar = this.f90559a;
                    C13023e eVar2 = this.f90560b;
                    String str = this.f90561c;
                    return "AssemblyInformation(title=" + eVar + ", description=" + eVar2 + ", orderId=" + str + ")";
                }
            }

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbo/f$b$a$b;", "", "LIC/e;", "title", "description", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: bo.f$b$a$b  reason: collision with other inner class name */
            public static final class C1969b {

                /* renamed from: c  reason: collision with root package name */
                public static final int f90562c = C13023e.f110931a;

                /* renamed from: a  reason: collision with root package name */
                private final C13023e f90563a;

                /* renamed from: b  reason: collision with root package name */
                private final C13023e f90564b;

                public C1969b(C13023e eVar, C13023e eVar2) {
                    C17542s.j(eVar, "title");
                    C17542s.j(eVar2, "description");
                    this.f90563a = eVar;
                    this.f90564b = eVar2;
                }

                public final C13023e a() {
                    return this.f90564b;
                }

                public final C13023e b() {
                    return this.f90563a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1969b)) {
                        return false;
                    }
                    C1969b bVar = (C1969b) obj;
                    return C17542s.e(this.f90563a, bVar.f90563a) && C17542s.e(this.f90564b, bVar.f90564b);
                }

                public int hashCode() {
                    return (this.f90563a.hashCode() * 31) + this.f90564b.hashCode();
                }

                public String toString() {
                    C13023e eVar = this.f90563a;
                    C13023e eVar2 = this.f90564b;
                    return "OrderSummaryDetails(title=" + eVar + ", description=" + eVar2 + ")";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbo/f$b$a$c;", "", "LKJ/c;", "Lbo/f$b$a$c$a;", "transactions", "Lkp/d;", "currencyConfig", "<init>", "(LKJ/c;Lkp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "b", "()LKJ/c;", "Lkp/d;", "()Lkp/d;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c {

                /* renamed from: a  reason: collision with root package name */
                private final C15987c<C1970a> f90565a;

                /* renamed from: b  reason: collision with root package name */
                private final C11522d f90566b;

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lbo/f$b$a$c$a;", "", "<init>", "()V", "b", "a", "Lbo/f$b$a$c$a$a;", "Lbo/f$b$a$c$a$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: bo.f$b$a$c$a  reason: collision with other inner class name */
                public static abstract class C1970a {

                    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lbo/f$b$a$c$a$a;", "Lbo/f$b$a$c$a;", "", "amount", "", "entityId", "paymentReference", "expiryDate", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "c", "d", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: bo.f$b$a$c$a$a  reason: collision with other inner class name */
                    public static final class C1971a extends C1970a {

                        /* renamed from: a  reason: collision with root package name */
                        private final double f90567a;

                        /* renamed from: b  reason: collision with root package name */
                        private final String f90568b;

                        /* renamed from: c  reason: collision with root package name */
                        private final String f90569c;

                        /* renamed from: d  reason: collision with root package name */
                        private final String f90570d;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public C1971a(double d10, String str, String str2, String str3) {
                            super((DefaultConstructorMarker) null);
                            C17542s.j(str, "entityId");
                            C17542s.j(str2, "paymentReference");
                            this.f90567a = d10;
                            this.f90568b = str;
                            this.f90569c = str2;
                            this.f90570d = str3;
                        }

                        public final double a() {
                            return this.f90567a;
                        }

                        public final String b() {
                            return this.f90568b;
                        }

                        public final String c() {
                            return this.f90570d;
                        }

                        public final String d() {
                            return this.f90569c;
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C1971a)) {
                                return false;
                            }
                            C1971a aVar = (C1971a) obj;
                            return Double.compare(this.f90567a, aVar.f90567a) == 0 && C17542s.e(this.f90568b, aVar.f90568b) && C17542s.e(this.f90569c, aVar.f90569c) && C17542s.e(this.f90570d, aVar.f90570d);
                        }

                        public int hashCode() {
                            int hashCode = ((((Double.hashCode(this.f90567a) * 31) + this.f90568b.hashCode()) * 31) + this.f90569c.hashCode()) * 31;
                            String str = this.f90570d;
                            return hashCode + (str == null ? 0 : str.hashCode());
                        }

                        public String toString() {
                            double d10 = this.f90567a;
                            String str = this.f90568b;
                            String str2 = this.f90569c;
                            String str3 = this.f90570d;
                            return "AccountVoucher(amount=" + d10 + ", entityId=" + str + ", paymentReference=" + str2 + ", expiryDate=" + str3 + ")";
                        }
                    }

                    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lbo/f$b$a$c$a$b;", "Lbo/f$b$a$c$a;", "", "authorisationCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: bo.f$b$a$c$a$b  reason: collision with other inner class name */
                    public static final class C1972b extends C1970a {

                        /* renamed from: a  reason: collision with root package name */
                        private final String f90571a;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public C1972b(String str) {
                            super((DefaultConstructorMarker) null);
                            C17542s.j(str, "authorisationCode");
                            this.f90571a = str;
                        }

                        public final String a() {
                            return this.f90571a;
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1972b) && C17542s.e(this.f90571a, ((C1972b) obj).f90571a);
                        }

                        public int hashCode() {
                            return this.f90571a.hashCode();
                        }

                        public String toString() {
                            String str = this.f90571a;
                            return "CreditCard(authorisationCode=" + str + ")";
                        }
                    }

                    public /* synthetic */ C1970a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private C1970a() {
                    }
                }

                public c(C15987c<? extends C1970a> cVar, C11522d dVar) {
                    C17542s.j(cVar, "transactions");
                    C17542s.j(dVar, "currencyConfig");
                    this.f90565a = cVar;
                    this.f90566b = dVar;
                }

                public final C11522d a() {
                    return this.f90566b;
                }

                public final C15987c<C1970a> b() {
                    return this.f90565a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return C17542s.e(this.f90565a, cVar.f90565a) && C17542s.e(this.f90566b, cVar.f90566b);
                }

                public int hashCode() {
                    return (this.f90565a.hashCode() * 31) + this.f90566b.hashCode();
                }

                public String toString() {
                    C15987c<C1970a> cVar = this.f90565a;
                    C11522d dVar = this.f90566b;
                    return "PaymentDetails(transactions=" + cVar + ", currencyConfig=" + dVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lbo/f$b$a$d;", "", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d {

                /* renamed from: a  reason: collision with root package name */
                private final String f90572a;

                /* renamed from: b  reason: collision with root package name */
                private final String f90573b;

                public d(String str, String str2) {
                    C17542s.j(str, "title");
                    this.f90572a = str;
                    this.f90573b = str2;
                }

                public final String a() {
                    return this.f90573b;
                }

                public final String b() {
                    return this.f90572a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return C17542s.e(this.f90572a, dVar.f90572a) && C17542s.e(this.f90573b, dVar.f90573b);
                }

                public int hashCode() {
                    int hashCode = this.f90572a.hashCode() * 31;
                    String str = this.f90573b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    String str = this.f90572a;
                    String str2 = this.f90573b;
                    return "SurveyConfig(title=" + str + ", description=" + str2 + ")";
                }
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lbo/f$b$a$e;", "", "", "orderId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class e {

                /* renamed from: a  reason: collision with root package name */
                private final String f90574a;

                public e(String str) {
                    C17542s.j(str, "orderId");
                    this.f90574a = str;
                }

                public final String a() {
                    return this.f90574a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && C17542s.e(this.f90574a, ((e) obj).f90574a);
                }

                public int hashCode() {
                    return this.f90574a.hashCode();
                }

                public String toString() {
                    String str = this.f90574a;
                    return "ViewOrderDetails(orderId=" + str + ")";
                }
            }

            public a() {
                this((c) null, (List) null, (C11436b) null, (C1968a) null, (C1969b) null, (m) null, (e) null, (d) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            public final C1968a a() {
                return this.f90552d;
            }

            public final List<C10994i> b() {
                return this.f90550b;
            }

            public final String c() {
                return this.f90557i;
            }

            public final C11436b d() {
                return this.f90551c;
            }

            public final C1969b e() {
                return this.f90553e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f90549a, aVar.f90549a) && C17542s.e(this.f90550b, aVar.f90550b) && C17542s.e(this.f90551c, aVar.f90551c) && C17542s.e(this.f90552d, aVar.f90552d) && C17542s.e(this.f90553e, aVar.f90553e) && C17542s.e(this.f90554f, aVar.f90554f) && C17542s.e(this.f90555g, aVar.f90555g) && C17542s.e(this.f90556h, aVar.f90556h) && C17542s.e(this.f90557i, aVar.f90557i);
            }

            public final c f() {
                return this.f90549a;
            }

            public final m g() {
                return this.f90554f;
            }

            public final d h() {
                return this.f90556h;
            }

            public int hashCode() {
                c cVar = this.f90549a;
                int i10 = 0;
                int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
                List<C10994i> list = this.f90550b;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                C11436b bVar = this.f90551c;
                int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                C1968a aVar = this.f90552d;
                int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                C1969b bVar2 = this.f90553e;
                int hashCode5 = (hashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
                m mVar = this.f90554f;
                int hashCode6 = (hashCode5 + (mVar == null ? 0 : mVar.hashCode())) * 31;
                e eVar = this.f90555g;
                int hashCode7 = (hashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
                d dVar = this.f90556h;
                int hashCode8 = (hashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
                String str = this.f90557i;
                if (str != null) {
                    i10 = str.hashCode();
                }
                return hashCode8 + i10;
            }

            public final e i() {
                return this.f90555g;
            }

            public String toString() {
                c cVar = this.f90549a;
                List<C10994i> list = this.f90550b;
                C11436b bVar = this.f90551c;
                C1968a aVar = this.f90552d;
                C1969b bVar2 = this.f90553e;
                m mVar = this.f90554f;
                e eVar = this.f90555g;
                d dVar = this.f90556h;
                String str = this.f90557i;
                return "UiData(payment=" + cVar + ", collapsedDetails=" + list + ", deliveryDetails=" + bVar + ", assemblyInformation=" + aVar + ", orderSummary=" + bVar2 + ", priceSummary=" + mVar + ", viewOrderDetails=" + eVar + ", surveyConfig=" + dVar + ", contactUri=" + str + ")";
            }

            public a(c cVar, List<C10994i> list, C11436b bVar, C1968a aVar, C1969b bVar2, m mVar, e eVar, d dVar, String str) {
                this.f90549a = cVar;
                this.f90550b = list;
                this.f90551c = bVar;
                this.f90552d = aVar;
                this.f90553e = bVar2;
                this.f90554f = mVar;
                this.f90555g = eVar;
                this.f90556h = dVar;
                this.f90557i = str;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ a(bo.f.b.a.c r11, java.util.List r12, jo.C11436b r13, bo.f.b.a.C1968a r14, bo.f.b.a.C1969b r15, RC.m r16, bo.f.b.a.e r17, bo.f.b.a.d r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
                /*
                    r10 = this;
                    r0 = r20
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000a
                L_0x0009:
                    r1 = r11
                L_0x000a:
                    r3 = r0 & 2
                    if (r3 == 0) goto L_0x0010
                    r3 = r2
                    goto L_0x0011
                L_0x0010:
                    r3 = r12
                L_0x0011:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0017
                    r4 = r2
                    goto L_0x0018
                L_0x0017:
                    r4 = r13
                L_0x0018:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001e
                    r5 = r2
                    goto L_0x001f
                L_0x001e:
                    r5 = r14
                L_0x001f:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0025
                    r6 = r2
                    goto L_0x0026
                L_0x0025:
                    r6 = r15
                L_0x0026:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x002c
                    r7 = r2
                    goto L_0x002e
                L_0x002c:
                    r7 = r16
                L_0x002e:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0034
                    r8 = r2
                    goto L_0x0036
                L_0x0034:
                    r8 = r17
                L_0x0036:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x003c
                    r9 = r2
                    goto L_0x003e
                L_0x003c:
                    r9 = r18
                L_0x003e:
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L_0x0043
                    goto L_0x0045
                L_0x0043:
                    r2 = r19
                L_0x0045:
                    r11 = r10
                    r12 = r1
                    r13 = r3
                    r14 = r4
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r8
                    r19 = r9
                    r20 = r2
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: bo.f.b.a.<init>(bo.f$b$a$c, java.util.List, jo.b, bo.f$b$a$a, bo.f$b$a$b, RC.m, bo.f$b$a$e, bo.f$b$a$d, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        public b() {
            this((a) null, (C13023e) null, false, 7, (DefaultConstructorMarker) null);
        }

        public final boolean a() {
            return this.f90548c;
        }

        public final C13023e b() {
            return this.f90547b;
        }

        public final a c() {
            return this.f90546a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f90546a, bVar.f90546a) && C17542s.e(this.f90547b, bVar.f90547b) && this.f90548c == bVar.f90548c;
        }

        public int hashCode() {
            a aVar = this.f90546a;
            int i10 = 0;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            C13023e eVar = this.f90547b;
            if (eVar != null) {
                i10 = eVar.hashCode();
            }
            return ((hashCode + i10) * 31) + Boolean.hashCode(this.f90548c);
        }

        public String toString() {
            a aVar = this.f90546a;
            C13023e eVar = this.f90547b;
            boolean z10 = this.f90548c;
            return "UiState(uiData=" + aVar + ", snackbarMessage=" + eVar + ", hasError=" + z10 + ")";
        }

        public b(a aVar, C13023e eVar, boolean z10) {
            this.f90546a = aVar;
            this.f90547b = eVar;
            this.f90548c = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(a aVar, C13023e eVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lao/a$a;", "config", "LXH/N;", "<anonymous>", "(Lao/a$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationViewModel$confirmationConfig$1", f = "ConfirmationViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<C11072a.C1955a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90575c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90576d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f90577e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f90577e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f90577e, eVar);
            cVar.f90576d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C11072a.C1955a aVar, C17164e<? super C16807N> eVar) {
            return ((c) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90575c == 0) {
                y.b(obj);
                C11072a.C1955a aVar = (C11072a.C1955a) this.f90576d;
                this.f90577e.f90524p = aVar != null ? aVar.c() : false;
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lao/a$a;", "config", "Lbo/f$a;", "confirmationHolder", "LRC/m;", "<anonymous>", "(Lao/a$a;Lbo/f$a;)LRC/m;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationViewModel$priceSummary$1", f = "ConfirmationViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements q<C11072a.C1955a, a, C17164e<? super m>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90578c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90579d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f90580e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11076e f90581f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C11076e eVar, C17164e<? super d> eVar2) {
            super(3, eVar2);
            this.f90581f = eVar;
        }

        /* renamed from: i */
        public final Object invoke(C11072a.C1955a aVar, a aVar2, C17164e<? super m> eVar) {
            d dVar = new d(this.f90581f, eVar);
            dVar.f90579d = aVar;
            dVar.f90580e = aVar2;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90578c == 0) {
                y.b(obj);
                C11072a.C1955a aVar = (C11072a.C1955a) this.f90579d;
                a aVar2 = (a) this.f90580e;
                if (aVar2 == null) {
                    return null;
                }
                return this.f90581f.a(aVar2.d(), aVar != null ? aVar.c() : false, aVar2.b().d(), aVar2.e());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationViewModel$special$$inlined$flatMapLatest$1", f = "ConfirmationViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class e extends l implements q<C16533h<? super b.a.C1968a>, a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90582c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f90583d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f90584e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f90585f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17164e eVar, f fVar) {
            super(3, eVar);
            this.f90585f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super b.a.C1968a> hVar, a aVar, C17164e<? super C16807N> eVar) {
            e eVar2 = new e(eVar, this.f90585f);
            eVar2.f90583d = hVar;
            eVar2.f90584e = aVar;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
            if (r1 == null) goto L_0x0066;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f90582c
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                XH.y.b(r10)
                goto L_0x0074
            L_0x000f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0017:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f90583d
                TJ.h r10 = (TJ.C16533h) r10
                java.lang.Object r1 = r9.f90584e
                bo.f$a r1 = (bo.f.a) r1
                if (r1 == 0) goto L_0x0066
                bo.f r3 = r9.f90585f
                ao.g r3 = r3.f90522n
                java.lang.String r4 = r1.c()
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = YH.C16877v.y(r1, r6)
                r5.<init>(r6)
                java.util.Iterator r1 = r1.iterator()
            L_0x0043:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0060
                java.lang.Object r6 = r1.next()
                no.a r6 = (no.C11663a) r6
                fm.b$b r7 = new fm.b$b
                java.lang.String r8 = r6.c()
                int r6 = r6.d()
                r7.<init>(r8, r6)
                r5.add(r7)
                goto L_0x0043
            L_0x0060:
                TJ.g r1 = r3.a(r4, r5)
                if (r1 != 0) goto L_0x006b
            L_0x0066:
                r1 = 0
                TJ.g r1 = TJ.C16534i.J(r1)
            L_0x006b:
                r9.f90582c = r2
                java.lang.Object r10 = TJ.C16534i.x(r10, r1, r9)
                if (r10 != r0) goto L_0x0074
                return r0
            L_0x0074:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.f$f  reason: collision with other inner class name */
    public static final class C1973f implements C16532g<MComConfig.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90586a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bo.f$f$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90587a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationViewModel$special$$inlined$map$1$2", f = "ConfirmationViewModel.kt", l = {50}, m = "emit")
            /* renamed from: bo.f$f$a$a  reason: collision with other inner class name */
            public static final class C1974a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90588c;

                /* renamed from: d  reason: collision with root package name */
                int f90589d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f90590e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1974a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90590e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90588c = obj;
                    this.f90589d |= Integer.MIN_VALUE;
                    return this.f90590e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f90587a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof bo.f.C1973f.a.C1974a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    bo.f$f$a$a r0 = (bo.f.C1973f.a.C1974a) r0
                    int r1 = r0.f90589d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90589d = r1
                    goto L_0x0018
                L_0x0013:
                    bo.f$f$a$a r0 = new bo.f$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f90588c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90589d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f90587a
                    ao.a$a r5 = (ao.C11072a.C1955a) r5
                    if (r5 == 0) goto L_0x003f
                    com.ingka.ikea.mcomsettings.MComConfig$f r5 = r5.d()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f90589d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: bo.f.C1973f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1973f(C16532g gVar) {
            this.f90586a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90586a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lao/a$a;", "confirmationConfig", "Lbo/f$a;", "confirmationHolder", "LRC/m;", "priceSummary", "Lbo/f$b$a$a;", "assemblyInformation", "Lbo/f$b$a;", "<anonymous>", "(Lao/a$a;Lbo/f$a;LRC/m;Lbo/f$b$a$a;)Lbo/f$b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationViewModel$uiData$1", f = "ConfirmationViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements s<C11072a.C1955a, a, m, b.a.C1968a, C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90591c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90592d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f90593e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f90594f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f90595g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f90596h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, C17164e<? super g> eVar) {
            super(5, eVar);
            this.f90596h = fVar;
        }

        /* renamed from: i */
        public final Object z(C11072a.C1955a aVar, a aVar2, m mVar, b.a.C1968a aVar3, C17164e<? super b.a> eVar) {
            g gVar = new g(this.f90596h, eVar);
            gVar.f90592d = aVar;
            gVar.f90593e = aVar2;
            gVar.f90594f = mVar;
            gVar.f90595g = aVar3;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90591c == 0) {
                y.b(obj);
                a aVar = (a) this.f90593e;
                return this.f90596h.G(aVar, (C11072a.C1955a) this.f90592d, (m) this.f90594f, (b.a.C1968a) this.f90595g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbo/f$b$a;", "uiData", "LIC/e;", "snackbarMessage", "", "error", "Lbo/f$b;", "<anonymous>", "(Lbo/f$b$a;LIC/e;Z)Lbo/f$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.viewmodel.ConfirmationViewModel$uiState$1", f = "ConfirmationViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements r<b.a, C13023e, Boolean, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90597c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90598d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f90599e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f90600f;

        h(C17164e<? super h> eVar) {
            super(4, eVar);
        }

        public final Object i(b.a aVar, C13023e eVar, boolean z10, C17164e<? super b> eVar2) {
            h hVar = new h(eVar2);
            hVar.f90598d = aVar;
            hVar.f90599e = eVar;
            hVar.f90600f = z10;
            return hVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90597c == 0) {
                y.b(obj);
                return new b((b.a) this.f90598d, (C13023e) this.f90599e, this.f90600f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((b.a) obj, (C13023e) obj2, ((Boolean) obj3).booleanValue(), (C17164e) obj4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x010a, code lost:
        r4 = r1.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(androidx.lifecycle.U r25, Il.a r26, ao.C11076e r27, ao.C11074c r28, ao.C11072a r29, ao.g r30) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r30
            java.lang.String r6 = "savedStateHandle"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            java.lang.String r6 = "appConfigApi"
            kotlin.jvm.internal.C17542s.j(r2, r6)
            java.lang.String r6 = "getConfirmationPriceSummaryUseCase"
            kotlin.jvm.internal.C17542s.j(r3, r6)
            java.lang.String r6 = "getConfirmationDataUseCase"
            kotlin.jvm.internal.C17542s.j(r4, r6)
            java.lang.String r6 = "getConfirmationConfigUseCase"
            r7 = r29
            kotlin.jvm.internal.C17542s.j(r7, r6)
            java.lang.String r6 = "getOrderAssemblyServicesUseCase"
            kotlin.jvm.internal.C17542s.j(r5, r6)
            r24.<init>()
            r0.f90521m = r2
            r0.f90522n = r5
            java.lang.String r2 = "CHECKOUT_ID_KEY"
            java.lang.Object r1 = r1.f(r2)
            if (r1 == 0) goto L_0x0256
            java.lang.String r1 = (java.lang.String) r1
            r0.f90523o = r1
            TJ.g r2 = r29.invoke()
            r0.f90525q = r2
            bo.f$f r5 = new bo.f$f
            r5.<init>(r2)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            androidx.lifecycle.F r5 = androidx.lifecycle.C5210m.c(r5, r6, r7, r9, r10)
            r0.f90526r = r5
            bo.f$c r5 = new bo.f$c
            r5.<init>(r0, r6)
            TJ.g r2 = TJ.C16534i.R(r2, r5)
            r0.f90527s = r2
            TJ.B r5 = TJ.C16521S.a(r6)
            r0.f90528t = r5
            TJ.B r7 = TJ.C16521S.a(r6)
            r0.f90529u = r7
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            TJ.B r8 = TJ.C16521S.a(r8)
            r0.f90530v = r8
            bo.f$e r9 = new bo.f$e
            r9.<init>(r6, r0)
            TJ.g r9 = TJ.C16534i.g0(r5, r9)
            r0.f90531w = r9
            bo.f$d r10 = new bo.f$d
            r10.<init>(r3, r6)
            TJ.g r3 = TJ.C16534i.n(r2, r5, r10)
            r0.f90532x = r3
            bo.f$g r10 = new bo.f$g
            r10.<init>(r0, r6)
            TJ.g r2 = TJ.C16534i.l(r2, r5, r3, r9, r10)
            r0.f90533y = r2
            bo.f$h r3 = new bo.f$h
            r3.<init>(r6)
            TJ.g r2 = TJ.C16534i.m(r2, r7, r8, r3)
            QJ.Q r3 = androidx.lifecycle.g0.a(r24)
            TJ.L r5 = ip.f.a()
            bo.f$b r13 = new bo.f$b
            r11 = 7
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            TJ.P r2 = TJ.C16534i.c0(r2, r3, r5, r13)
            r0.f90534z = r2
            bo.f$a r1 = r4.a(r1)
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ce:
            boolean r5 = r3.hasNext()
            r7 = 1
            if (r5 == 0) goto L_0x00e6
            java.lang.Object r5 = r3.next()
            r8 = r5
            qv.b r8 = (qv.C11819b) r8
            boolean r7 = r8.b(r2, r7)
            if (r7 == 0) goto L_0x00ce
            r4.add(r5)
            goto L_0x00ce
        L_0x00e6:
            java.util.Iterator r3 = r4.iterator()
            r4 = r6
            r5 = r4
        L_0x00ec:
            boolean r8 = r3.hasNext()
            java.lang.String r9 = "|"
            java.lang.String r10 = "b"
            java.lang.String r11 = "m"
            java.lang.String r13 = "main"
            java.lang.String r14 = "Kt"
            java.lang.Class<bo.f> r17 = bo.f.class
            r12 = 2
            if (r8 == 0) goto L_0x018a
            java.lang.Object r8 = r3.next()
            qv.b r8 = (qv.C11819b) r8
            r15 = 0
            if (r4 != 0) goto L_0x0132
            if (r1 == 0) goto L_0x0115
            bo.f$a$a r4 = r1.b()
            if (r4 == 0) goto L_0x0115
            java.util.List r4 = r4.a()
            goto L_0x0116
        L_0x0115:
            r4 = r6
        L_0x0116:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "confirmationAddressDetails: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r15)
            if (r4 != 0) goto L_0x012e
            goto L_0x018a
        L_0x012e:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x0132:
            if (r5 != 0) goto L_0x0175
            java.lang.String r5 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 0
            r7 = 36
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r6, r12, r6)
            r15 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r15, r6, r12, r6)
            int r6 = r7.length()
            if (r6 != 0) goto L_0x014f
            goto L_0x0153
        L_0x014f:
            java.lang.String r5 = HJ.C15854t.P0(r7, r14)
        L_0x0153:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r7 = 1
            boolean r6 = HJ.C15854t.b0(r6, r13, r7)
            if (r6 == 0) goto L_0x0163
            r10 = r11
        L_0x0163:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            r6.append(r9)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L_0x0175:
            r25 = r8
            r26 = r2
            r27 = r5
            r6 = 1
            r28 = r6
            r7 = 0
            r29 = r7
            r30 = r4
            r25.a(r26, r27, r28, r29, r30)
            r7 = r6
            r6 = 0
            goto L_0x00ec
        L_0x018a:
            if (r1 != 0) goto L_0x0246
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x019f:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x01b7
            java.lang.Object r4 = r2.next()
            r6 = r4
            qv.b r6 = (qv.C11819b) r6
            boolean r5 = r6.b(r1, r5)
            if (r5 == 0) goto L_0x019f
            r3.add(r4)
            goto L_0x019f
        L_0x01b7:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r6 = 0
        L_0x01bd:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0231
            java.lang.Object r4 = r2.next()
            r18 = r4
            qv.b r18 = (qv.C11819b) r18
            r4 = 0
            if (r6 != 0) goto L_0x01db
            java.lang.String r6 = "Unable to show confirmation"
            java.lang.String r6 = qv.C11818a.a(r6, r4)
            if (r6 != 0) goto L_0x01d7
            goto L_0x0231
        L_0x01d7:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x01db:
            if (r3 != 0) goto L_0x0221
            java.lang.String r3 = r17.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r7 = 0
            r8 = 36
            java.lang.String r15 = HJ.C15854t.s1(r3, r8, r7, r12, r7)
            r8 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r8, r7, r12, r7)
            int r16 = r15.length()
            if (r16 != 0) goto L_0x01f8
            goto L_0x01fc
        L_0x01f8:
            java.lang.String r3 = HJ.C15854t.P0(r15, r14)
        L_0x01fc:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r7 = 1
            boolean r15 = HJ.C15854t.b0(r15, r13, r7)
            if (r15 == 0) goto L_0x020d
            r15 = r11
            goto L_0x020e
        L_0x020d:
            r15 = r10
        L_0x020e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            r7.append(r9)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            goto L_0x0223
        L_0x0221:
            r8 = 46
        L_0x0223:
            r19 = r1
            r20 = r3
            r21 = r5
            r22 = r4
            r23 = r6
            r18.a(r19, r20, r21, r22, r23)
            goto L_0x01bd
        L_0x0231:
            TJ.B<java.lang.Boolean> r2 = r0.f90530v
        L_0x0233:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = r2.e(r1, r3)
            if (r1 == 0) goto L_0x0233
            goto L_0x0255
        L_0x0246:
            TJ.B<bo.f$a> r2 = r0.f90528t
        L_0x0248:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            bo.f$a r4 = (bo.f.a) r4
            boolean r3 = r2.e(r3, r1)
            if (r3 == 0) goto L_0x0248
        L_0x0255:
            return
        L_0x0256:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.f.<init>(androidx.lifecycle.U, Il.a, ao.e, ao.c, ao.a, ao.g):void");
    }

    private final b.a.C1969b D(a aVar) {
        String c10 = aVar.c();
        C13023e a10 = (c10 == null || c10.length() == 0) ? C13026h.a(C11849b.f102293f1) : C13026h.b(C11849b.f102358v2, c10);
        int size = aVar.a().size();
        return new b.a.C1969b(a10, C13026h.d(C11848a.f102160c, C13020b.a(size), Integer.valueOf(size)));
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [bo.f$b$a$c$a$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final bo.f.b.a.c E(bo.f.a r18, ao.C11072a.C1955a r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            if (r18 == 0) goto L_0x0150
            java.util.List r0 = r18.e()
            if (r0 == 0) goto L_0x0150
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r4.next()
            Nn.F r0 = (Nn.F) r0
            boolean r5 = r0 instanceof Nn.F.a
            if (r5 == 0) goto L_0x0110
            r5 = r0
            Nn.F$a r5 = (Nn.F.a) r5
            java.time.LocalDateTime r0 = r5.i()
            if (r0 == 0) goto L_0x00fc
            if (r19 == 0) goto L_0x003a
            java.lang.String r6 = r19.b()     // Catch:{ Exception -> 0x0038 }
            if (r6 != 0) goto L_0x003c
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            goto L_0x004c
        L_0x003a:
            java.lang.String r6 = "yyyy-MM-dd HH:mm"
        L_0x003c:
            Il.a r7 = r1.f90521m     // Catch:{ Exception -> 0x0038 }
            java.util.Locale r7 = r7.A()     // Catch:{ Exception -> 0x0038 }
            java.time.format.DateTimeFormatter r6 = java.time.format.DateTimeFormatter.ofPattern(r6, r7)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = r6.format(r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x00fa
        L_0x004c:
            qv.e r12 = qv.e.ERROR
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x005f:
            boolean r8 = r6.hasNext()
            r13 = 0
            if (r8 == 0) goto L_0x0077
            java.lang.Object r8 = r6.next()
            r9 = r8
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r12, r13)
            if (r9 == 0) goto L_0x005f
            r7.add(r8)
            goto L_0x005f
        L_0x0077:
            java.util.Iterator r14 = r7.iterator()
            r6 = r2
            r7 = r6
        L_0x007d:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x00f9
            java.lang.Object r8 = r14.next()
            qv.b r8 = (qv.C11819b) r8
            if (r6 != 0) goto L_0x0099
            java.lang.String r6 = "Unable to parse date"
            java.lang.String r6 = qv.C11818a.a(r6, r0)
            if (r6 != 0) goto L_0x0095
            goto L_0x00f9
        L_0x0095:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x0099:
            r15 = r6
            if (r7 != 0) goto L_0x00e9
            java.lang.Class<bo.f> r6 = bo.f.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r7 = 36
            r9 = 2
            java.lang.String r7 = HJ.C15854t.s1(r6, r7, r2, r9, r2)
            r10 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r10, r2, r9, r2)
            int r9 = r7.length()
            if (r9 != 0) goto L_0x00b9
            goto L_0x00bf
        L_0x00b9:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r7, r6)
        L_0x00bf:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = "main"
            r10 = 1
            boolean r7 = HJ.C15854t.b0(r7, r9, r10)
            if (r7 == 0) goto L_0x00d3
            java.lang.String r7 = "m"
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r7 = "b"
        L_0x00d5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = "|"
            r9.append(r7)
            r9.append(r6)
            java.lang.String r7 = r9.toString()
        L_0x00e9:
            r16 = r7
            r6 = r8
            r7 = r12
            r8 = r16
            r9 = r13
            r10 = r0
            r11 = r15
            r6.a(r7, r8, r9, r10, r11)
            r6 = r15
            r7 = r16
            goto L_0x007d
        L_0x00f9:
            r0 = r2
        L_0x00fa:
            r11 = r0
            goto L_0x00fd
        L_0x00fc:
            r11 = r2
        L_0x00fd:
            bo.f$b$a$c$a$a r0 = new bo.f$b$a$c$a$a
            double r7 = r5.a()
            java.lang.String r9 = r5.h()
            java.lang.String r10 = r5.j()
            r6 = r0
            r6.<init>(r7, r9, r10, r11)
            goto L_0x0149
        L_0x0110:
            boolean r5 = r0 instanceof Nn.F.b
            if (r5 == 0) goto L_0x012d
            Nn.F$b r0 = (Nn.F.b) r0
            java.lang.String r0 = r0.h()
            if (r0 == 0) goto L_0x0148
            int r5 = r0.length()
            if (r5 <= 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r0 = r2
        L_0x0124:
            if (r0 == 0) goto L_0x0148
            bo.f$b$a$c$a$b r5 = new bo.f$b$a$c$a$b
            r5.<init>(r0)
            r0 = r5
            goto L_0x0149
        L_0x012d:
            boolean r5 = r0 instanceof Nn.F.c
            if (r5 != 0) goto L_0x0148
            boolean r5 = r0 instanceof Nn.F.d
            if (r5 != 0) goto L_0x0148
            boolean r5 = r0 instanceof Nn.F.e
            if (r5 != 0) goto L_0x0148
            boolean r5 = r0 instanceof Nn.F.f
            if (r5 != 0) goto L_0x0148
            boolean r0 = r0 instanceof Nn.F.g
            if (r0 == 0) goto L_0x0142
            goto L_0x0148
        L_0x0142:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0148:
            r0 = r2
        L_0x0149:
            if (r0 == 0) goto L_0x0016
            r3.add(r0)
            goto L_0x0016
        L_0x0150:
            r3 = r2
        L_0x0151:
            if (r3 == 0) goto L_0x0169
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x015a
            goto L_0x0169
        L_0x015a:
            bo.f$b$a$c r2 = new bo.f$b$a$c
            KJ.c r0 = KJ.C15985a.h(r3)
            Il.a r3 = r1.f90521m
            kp.d r3 = r3.s()
            r2.<init>(r0, r3)
        L_0x0169:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.f.E(bo.f$a, ao.a$a):bo.f$b$a$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r15.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bo.f.b.a G(bo.f.a r15, ao.C11072a.C1955a r16, RC.m r17, bo.f.b.a.C1968a r18) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0010
            java.lang.String r1 = r15.c()
            if (r1 == 0) goto L_0x0010
            bo.f$b$a$e r2 = new bo.f$b$a$e
            r2.<init>(r1)
            r10 = r2
            goto L_0x0011
        L_0x0010:
            r10 = r0
        L_0x0011:
            bo.f$b$a$c r4 = r14.E(r15, r16)
            if (r15 == 0) goto L_0x0028
            bo.f$a$a r1 = r15.b()
            if (r1 == 0) goto L_0x0028
            java.util.List r2 = r15.a()
            r13 = r14
            jo.b r1 = r14.k(r1, r2)
            r6 = r1
            goto L_0x002a
        L_0x0028:
            r13 = r14
            r6 = r0
        L_0x002a:
            if (r16 == 0) goto L_0x0041
            com.ingka.ikea.mcomsettings.MComConfig$f r1 = r16.d()
            if (r1 == 0) goto L_0x0041
            bo.f$b$a$d r2 = new bo.f$b$a$d
            java.lang.String r3 = r1.d()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            r11 = r2
            goto L_0x0042
        L_0x0041:
            r11 = r0
        L_0x0042:
            if (r15 == 0) goto L_0x0080
            bo.f$a$a r1 = r15.b()
            if (r1 == 0) goto L_0x0080
            java.util.List r1 = r1.a()
            if (r1 == 0) goto L_0x0080
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0061:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x007e
            java.lang.Object r3 = r1.next()
            com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity$a r3 = (com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity.a) r3
            Yn.i r5 = new Yn.i
            java.lang.String r7 = r3.b()
            java.util.List r3 = r3.a()
            r5.<init>(r7, r3)
            r2.add(r5)
            goto L_0x0061
        L_0x007e:
            r5 = r2
            goto L_0x0081
        L_0x0080:
            r5 = r0
        L_0x0081:
            if (r15 == 0) goto L_0x0089
            bo.f$b$a$b r1 = r14.D(r15)
            r8 = r1
            goto L_0x008a
        L_0x0089:
            r8 = r0
        L_0x008a:
            if (r16 == 0) goto L_0x0090
            java.lang.String r0 = r16.a()
        L_0x0090:
            r12 = r0
            bo.f$b$a r0 = new bo.f$b$a
            r3 = r0
            r7 = r18
            r9 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.f.G(bo.f$a, ao.a$a, RC.m, bo.f$b$a$a):bo.f$b$a");
    }

    private final C11436b k(a.C1967a aVar, List<C11663a> list) {
        List<C11435a> b10 = aVar.b();
        if (b10 == null) {
            return null;
        }
        String c10 = aVar.c();
        C10813p d10 = aVar.d();
        u e10 = aVar.e();
        Iterable iterable = b10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        boolean z10 = false;
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C11435a aVar2 = (C11435a) next;
            j jVar = r1;
            j jVar2 = new j(c10, d10, e10, aVar2, b10.size(), i11, true, false, j.a.f99401d.a(d10, aVar2.h(), z10));
            arrayList.add(jVar);
            i10 = i11;
            z10 = z10;
        }
        Iterable<C11663a> iterable2 = list;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (C11663a aVar3 : iterable2) {
            arrayList2.add(new Yn.F(aVar3.c(), aVar3.d(), aVar3.b()));
        }
        return new C11436b((n) null, arrayList, false, arrayList2, true);
    }

    public final String C() {
        return this.f90523o;
    }

    public final F<MComConfig.f> F() {
        return this.f90526r;
    }

    public final void H(C13023e eVar) {
        C13023e value;
        C17542s.j(eVar, "message");
        C16505B<C13023e> b10 = this.f90529u;
        do {
            value = b10.getValue();
            C13023e eVar2 = value;
        } while (!b10.e(value, eVar));
    }

    public final void I() {
        C13023e value;
        C16505B<C13023e> b10 = this.f90529u;
        do {
            value = b10.getValue();
            C13023e eVar = value;
        } while (!b10.e(value, null));
    }

    public final C16519P<b> m() {
        return this.f90534z;
    }
}
