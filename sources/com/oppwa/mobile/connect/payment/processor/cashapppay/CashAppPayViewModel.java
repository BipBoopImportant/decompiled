package com.oppwa.mobile.connect.payment.processor.cashapppay;

import HJ.C15854t;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import app.cash.paykit.core.CashAppPay;
import app.cash.paykit.core.CashAppPayFactory;
import app.cash.paykit.core.CashAppPayListener;
import app.cash.paykit.core.CashAppPayState;
import app.cash.paykit.core.exceptions.CashAppPayIntegrationException;
import app.cash.paykit.core.models.response.CustomerResponseData;
import app.cash.paykit.core.models.response.Grant;
import app.cash.paykit.core.models.sdk.CashAppPayCurrency;
import com.afterpay.android.Afterpay;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.afterpaypacific.CashAppPayPaymentParams;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.HttpUtils;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import t6.C8833b;
import u6.C8882c;
import u6.C8883d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 h2\u00020\u0001:\u0002ihB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000fJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!J'\u0010'\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\tH\u0001¢\u0006\u0004\b%\u0010&J\u0019\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b)\u0010*J\u001f\u00100\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010$\u001a\u00020\tH\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00105\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104J\u0017\u0010:\u001a\u00020\u00112\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109J\u0019\u0010?\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010;H\u0001¢\u0006\u0004\b=\u0010>J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\tH\u0001¢\u0006\u0004\bA\u0010BJ\u000f\u0010E\u001a\u00020\u0011H\u0001¢\u0006\u0004\bD\u0010\u0013J\u0017\u0010J\u001a\u00020\u00112\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bH\u0010IJ\u000f\u0010L\u001a\u00020\u0011H\u0001¢\u0006\u0004\bK\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010PR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020S0R8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010[\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010\u0010\"\u0004\bZ\u0010BR\u001a\u0010a\u001a\u00020\\8\u0000X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R!\u0010g\u001a\b\u0012\u0004\u0012\u00020O0b8FX\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006j"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/U;)V", "", "b", "()Z", "", "key", "a", "(Ljava/lang/String;)Ljava/lang/String;", "error", "Lcom/oppwa/mobile/connect/exception/PaymentException;", "(Ljava/lang/String;)Lcom/oppwa/mobile/connect/exception/PaymentException;", "()Ljava/lang/String;", "LXH/N;", "initCashAppPay", "()V", "shouldInitialize$oppwa_mobile_6_19_0_release", "shouldInitialize", "Lcom/oppwa/mobile/connect/provider/Transaction;", "requireTransaction$oppwa_mobile_6_19_0_release", "()Lcom/oppwa/mobile/connect/provider/Transaction;", "requireTransaction", "getTransaction", "isStatusProcessing", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayConfig;", "config", "Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "providerMode", "setAfterpayPacificConfig$oppwa_mobile_6_19_0_release", "(Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayConfig;Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;)V", "setAfterpayPacificConfig", "token", "currencyCode", "startCashAppPay$oppwa_mobile_6_19_0_release", "(Ljava/lang/String;Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;Ljava/lang/String;)V", "startCashAppPay", "Lapp/cash/paykit/core/CashAppPay;", "getCashAppPayInstance$oppwa_mobile_6_19_0_release", "(Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;)Lapp/cash/paykit/core/CashAppPay;", "getCashAppPayInstance", "Lu6/c;", "result", "handleCashAppSignedOrderResult$oppwa_mobile_6_19_0_release", "(Lu6/c;Ljava/lang/String;)V", "handleCashAppSignedOrderResult", "Lapp/cash/paykit/core/CashAppPayState;", "newState", "cashAppStateChange$oppwa_mobile_6_19_0_release", "(Lapp/cash/paykit/core/CashAppPayState;)V", "cashAppStateChange", "Lapp/cash/paykit/core/models/response/CustomerResponseData;", "response", "validateCashAppOrder$oppwa_mobile_6_19_0_release", "(Lapp/cash/paykit/core/models/response/CustomerResponseData;)V", "validateCashAppOrder", "Lu6/d;", "cashAppValidationResponse", "handleValidationResult$oppwa_mobile_6_19_0_release", "(Lu6/d;)V", "handleValidationResult", "callbackUrl", "sendCashAppPayCallback$oppwa_mobile_6_19_0_release", "(Ljava/lang/String;)V", "sendCashAppPayCallback", "onCheckoutSuccess$oppwa_mobile_6_19_0_release", "onCheckoutSuccess", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "paymentError", "onCheckoutFailed$oppwa_mobile_6_19_0_release", "(Lcom/oppwa/mobile/connect/exception/PaymentError;)V", "onCheckoutFailed", "deInit$oppwa_mobile_6_19_0_release", "deInit", "Landroidx/lifecycle/U;", "LTJ/B;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "LTJ/B;", "_cashAppPayResult", "", "Lapp/cash/paykit/core/models/sdk/CashAppPayCurrency;", "c", "Ljava/util/Map;", "currencyMap", "d", "Ljava/lang/String;", "getShopperResultUrl$oppwa_mobile_6_19_0_release", "setShopperResultUrl$oppwa_mobile_6_19_0_release", "shopperResultUrl", "Lapp/cash/paykit/core/CashAppPayListener;", "e", "Lapp/cash/paykit/core/CashAppPayListener;", "getCashAppPayListener$oppwa_mobile_6_19_0_release", "()Lapp/cash/paykit/core/CashAppPayListener;", "cashAppPayListener", "LTJ/P;", "f", "LXH/o;", "getCashAppPayResult", "()LTJ/P;", "cashAppPayResult", "Companion", "CashAppPayResult", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
public final class CashAppPayViewModel extends f0 {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String IS_INITIALIZED = "com.oppwa.mobile.connect.payment.processor.cashapppay.isinitialized";
    public static final String STATUS_EXTRA = "com.oppwa.mobile.connect.payment.processor.cashapppay.status";
    public static final String TOKEN_EXTRA = "com.oppwa.mobile.connect.payment.processor.cashapppay.token";

    /* renamed from: g  reason: collision with root package name */
    private static CashAppPay f121927g;

    /* renamed from: a  reason: collision with root package name */
    private final U f121928a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C16505B<CashAppPayResult> f121929b = C16521S.a(CashAppPayResult.Initial.INSTANCE);

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, CashAppPayCurrency> f121930c = X.f(C16796C.a("USD", CashAppPayCurrency.USD));

    /* renamed from: d  reason: collision with root package name */
    private String f121931d = "";

    /* renamed from: e  reason: collision with root package name */
    private final CashAppPayListener f121932e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f121933f;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "", "()V", "CashAppPayFailed", "CashAppPaySuccess", "Initial", "Processing", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$CashAppPayFailed;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$CashAppPaySuccess;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$Initial;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$Processing;", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class CashAppPayResult {

        @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$CashAppPayFailed;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "Lcom/oppwa/mobile/connect/provider/Transaction;", "component1", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "component2", "transaction", "error", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/oppwa/mobile/connect/provider/Transaction;", "getTransaction", "()Lcom/oppwa/mobile/connect/provider/Transaction;", "b", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "getError", "()Lcom/oppwa/mobile/connect/exception/PaymentError;", "<init>", "(Lcom/oppwa/mobile/connect/provider/Transaction;Lcom/oppwa/mobile/connect/exception/PaymentError;)V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
        public static final class CashAppPayFailed extends CashAppPayResult {

            /* renamed from: a  reason: collision with root package name */
            private final Transaction f121934a;

            /* renamed from: b  reason: collision with root package name */
            private final PaymentError f121935b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CashAppPayFailed(Transaction transaction, PaymentError paymentError) {
                super((DefaultConstructorMarker) null);
                C17542s.j(paymentError, UiComponentContainer.RESULT_ERROR);
                this.f121934a = transaction;
                this.f121935b = paymentError;
            }

            public static /* synthetic */ CashAppPayFailed copy$default(CashAppPayFailed cashAppPayFailed, Transaction transaction, PaymentError paymentError, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    transaction = cashAppPayFailed.f121934a;
                }
                if ((i10 & 2) != 0) {
                    paymentError = cashAppPayFailed.f121935b;
                }
                return cashAppPayFailed.copy(transaction, paymentError);
            }

            public final Transaction component1() {
                return this.f121934a;
            }

            public final PaymentError component2() {
                return this.f121935b;
            }

            public final CashAppPayFailed copy(Transaction transaction, PaymentError paymentError) {
                C17542s.j(paymentError, UiComponentContainer.RESULT_ERROR);
                return new CashAppPayFailed(transaction, paymentError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CashAppPayFailed)) {
                    return false;
                }
                CashAppPayFailed cashAppPayFailed = (CashAppPayFailed) obj;
                return C17542s.e(this.f121934a, cashAppPayFailed.f121934a) && C17542s.e(this.f121935b, cashAppPayFailed.f121935b);
            }

            public final PaymentError getError() {
                return this.f121935b;
            }

            public final Transaction getTransaction() {
                return this.f121934a;
            }

            public int hashCode() {
                Transaction transaction = this.f121934a;
                return ((transaction == null ? 0 : transaction.hashCode()) * 31) + this.f121935b.hashCode();
            }

            public String toString() {
                return "CashAppPayFailed(transaction=" + this.f121934a + ", error=" + this.f121935b + ')';
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$CashAppPaySuccess;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "Lcom/oppwa/mobile/connect/provider/Transaction;", "component1", "transaction", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/oppwa/mobile/connect/provider/Transaction;", "getTransaction", "()Lcom/oppwa/mobile/connect/provider/Transaction;", "<init>", "(Lcom/oppwa/mobile/connect/provider/Transaction;)V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
        public static final class CashAppPaySuccess extends CashAppPayResult {

            /* renamed from: a  reason: collision with root package name */
            private final Transaction f121936a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CashAppPaySuccess(Transaction transaction) {
                super((DefaultConstructorMarker) null);
                C17542s.j(transaction, "transaction");
                this.f121936a = transaction;
            }

            public static /* synthetic */ CashAppPaySuccess copy$default(CashAppPaySuccess cashAppPaySuccess, Transaction transaction, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    transaction = cashAppPaySuccess.f121936a;
                }
                return cashAppPaySuccess.copy(transaction);
            }

            public final Transaction component1() {
                return this.f121936a;
            }

            public final CashAppPaySuccess copy(Transaction transaction) {
                C17542s.j(transaction, "transaction");
                return new CashAppPaySuccess(transaction);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashAppPaySuccess) && C17542s.e(this.f121936a, ((CashAppPaySuccess) obj).f121936a);
            }

            public final Transaction getTransaction() {
                return this.f121936a;
            }

            public int hashCode() {
                return this.f121936a.hashCode();
            }

            public String toString() {
                return "CashAppPaySuccess(transaction=" + this.f121936a + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$Initial;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "()V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Initial extends CashAppPayResult {
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult$Processing;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "()V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Processing extends CashAppPayResult {
            public static final Processing INSTANCE = new Processing();

            private Processing() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ CashAppPayResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CashAppPayResult() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$Companion;", "", "()V", "IS_INITIALIZED", "", "PROCESSING", "STATUS_EXTRA", "TAG", "TOKEN_EXTRA", "cashAppPay", "Lapp/cash/paykit/core/CashAppPay;", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/P;", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "a", "()LTJ/P;"}, k = 3, mv = {1, 7, 1})
    static final class a extends C17544u implements C17631a<C16519P<? extends CashAppPayResult>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CashAppPayViewModel f121937a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CashAppPayViewModel cashAppPayViewModel) {
            super(0);
            this.f121937a = cashAppPayViewModel;
        }

        /* renamed from: a */
        public final C16519P<CashAppPayResult> invoke() {
            return C16534i.c(this.f121937a.f121929b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu6/c;", "result", "LXH/N;", "a", "(Lu6/c;)V"}, k = 3, mv = {1, 7, 1})
    static final class b extends C17544u implements C17642l<C8882c, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CashAppPayViewModel f121938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f121939b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CashAppPayViewModel cashAppPayViewModel, String str) {
            super(1);
            this.f121938a = cashAppPayViewModel;
            this.f121939b = str;
        }

        public final void a(C8882c cVar) {
            C17542s.j(cVar, "result");
            this.f121938a.handleCashAppSignedOrderResult$oppwa_mobile_6_19_0_release(cVar, this.f121939b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8882c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<C8883d, C16807N> {
        c(Object obj) {
            super(1, obj, CashAppPayViewModel.class, "handleValidationResult", "handleValidationResult$oppwa_mobile_6_19_0_release(Lcom/afterpay/android/cashapp/CashAppValidationResponse;)V", 0);
        }

        public final void a(C8883d dVar) {
            ((CashAppPayViewModel) this.receiver).handleValidationResult$oppwa_mobile_6_19_0_release(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8883d) obj);
            return C16807N.f139792a;
        }
    }

    public CashAppPayViewModel(U u10) {
        C17542s.j(u10, "savedStateHandle");
        this.f121928a = u10;
        CashAppPayViewModel$cashAppPayListener$1 cashAppPayViewModel$cashAppPayListener$1 = new CashAppPayViewModel$cashAppPayListener$1(this);
        this.f121932e = cashAppPayViewModel$cashAppPayListener$1;
        this.f121933f = C16825p.b(new a(this));
        if (b() && f121927g == null) {
            Logger.error("cashApp is null and probably a case of process death.");
            PaymentError cashAppPayError = PaymentError.getCashAppPayError("Transaction state is unknown, request payment status to get the actual state.");
            C17542s.i(cashAppPayError, "getCashAppPayError(\"Tran…o get the actual state.\")");
            onCheckoutFailed$oppwa_mobile_6_19_0_release(cashAppPayError);
        }
        CashAppPay cashAppPay = f121927g;
        if (cashAppPay != null) {
            cashAppPay.registerForStateUpdates(cashAppPayViewModel$cashAppPayListener$1);
        }
    }

    private final String a(String str) {
        return requireTransaction$oppwa_mobile_6_19_0_release().getBrandSpecificInfo().get(str);
    }

    private final boolean b() {
        Boolean bool = (Boolean) this.f121928a.f(IS_INITIALIZED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void cashAppStateChange$oppwa_mobile_6_19_0_release(CashAppPayState cashAppPayState) {
        C17542s.j(cashAppPayState, "newState");
        Logger.info("CashAppPayViewModel", "Cash App Pay request state: " + cashAppPayState);
        boolean z10 = true;
        if (C17542s.e(cashAppPayState, CashAppPayState.NotStarted.INSTANCE) ? true : C17542s.e(cashAppPayState, CashAppPayState.CreatingCustomerRequest.INSTANCE) ? true : C17542s.e(cashAppPayState, CashAppPayState.UpdatingCustomerRequest.INSTANCE) ? true : C17542s.e(cashAppPayState, CashAppPayState.RetrievingExistingCustomerRequest.INSTANCE) ? true : C17542s.e(cashAppPayState, CashAppPayState.Refreshing.INSTANCE) ? true : C17542s.e(cashAppPayState, CashAppPayState.PollingTransactionStatus.INSTANCE)) {
            return;
        }
        if (cashAppPayState instanceof CashAppPayState.Authorizing) {
            this.f121929b.setValue(CashAppPayResult.Processing.INSTANCE);
            this.f121928a.m(STATUS_EXTRA, "PROCESSING");
        } else if (cashAppPayState instanceof CashAppPayState.ReadyToAuthorize) {
            try {
                CashAppPay cashAppPay = f121927g;
                if (cashAppPay != null) {
                    cashAppPay.authorizeCustomerRequest();
                }
            } catch (CashAppPayIntegrationException e10) {
                String message = e10.getMessage();
                if (message == null) {
                    message = "cashAppPay authorize error";
                }
                PaymentError cashAppPayError = PaymentError.getCashAppPayError(message);
                C17542s.i(cashAppPayError, "getCashAppPayError(e.mes…hAppPay authorize error\")");
                onCheckoutFailed$oppwa_mobile_6_19_0_release(cashAppPayError);
            }
        } else if (cashAppPayState instanceof CashAppPayState.Approved) {
            CustomerResponseData responseData = ((CashAppPayState.Approved) cashAppPayState).getResponseData();
            List grants = responseData.getGrants();
            if (grants == null || !(!grants.isEmpty())) {
                z10 = false;
            }
            if (z10 && responseData.getCustomerProfile() != null) {
                validateCashAppOrder$oppwa_mobile_6_19_0_release(responseData);
            }
        } else if (C17542s.e(cashAppPayState, CashAppPayState.Declined.INSTANCE)) {
            String a10 = a("failureCallbackUrl");
            if (a10 != null) {
                sendCashAppPayCallback$oppwa_mobile_6_19_0_release(a10);
                return;
            }
            PaymentError cashAppPayError2 = PaymentError.getCashAppPayError("Error getting callback url");
            C17542s.i(cashAppPayError2, "getCashAppPayError(\n    …or getting callback url\")");
            onCheckoutFailed$oppwa_mobile_6_19_0_release(cashAppPayError2);
        } else if (cashAppPayState instanceof CashAppPayState.CashAppPayExceptionState) {
            String message2 = ((CashAppPayState.CashAppPayExceptionState) cashAppPayState).getException().getMessage();
            if (message2 == null) {
                message2 = "cashAppPay exception";
            }
            PaymentError cashAppPayError3 = PaymentError.getCashAppPayError(message2);
            C17542s.i(cashAppPayError3, "getCashAppPayError(newSt…: \"cashAppPay exception\")");
            onCheckoutFailed$oppwa_mobile_6_19_0_release(cashAppPayError3);
        }
    }

    public final void deInit$oppwa_mobile_6_19_0_release() {
        CashAppPay cashAppPay = f121927g;
        if (cashAppPay != null) {
            cashAppPay.unregisterFromStateUpdates();
        }
        f121927g = null;
    }

    public final CashAppPay getCashAppPayInstance$oppwa_mobile_6_19_0_release(Connect.ProviderMode providerMode) {
        String m10;
        C17542s.j(providerMode, "providerMode");
        C8833b f10 = Afterpay.f45951a.f();
        if (f10 == null || (m10 = f10.m()) == null) {
            throw b("Error getting AfterPay instance");
        }
        CashAppPay create = providerMode == Connect.ProviderMode.LIVE ? CashAppPayFactory.INSTANCE.create(m10) : CashAppPayFactory.INSTANCE.createSandbox(m10);
        f121927g = create;
        return create;
    }

    public final CashAppPayListener getCashAppPayListener$oppwa_mobile_6_19_0_release() {
        return this.f121932e;
    }

    public final C16519P<CashAppPayResult> getCashAppPayResult() {
        return (C16519P) this.f121933f.getValue();
    }

    public final String getShopperResultUrl$oppwa_mobile_6_19_0_release() {
        return this.f121931d;
    }

    public final Transaction getTransaction() {
        return (Transaction) this.f121928a.f(CashAppPayProcessorActivity.TRANSACTION_EXTRA);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleCashAppSignedOrderResult$oppwa_mobile_6_19_0_release(u6.C8882c r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "currencyCode"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            boolean r0 = r7 instanceof u6.C8882c.b
            if (r0 == 0) goto L_0x007a
            androidx.lifecycle.U r0 = r6.f121928a
            u6.c$b r7 = (u6.C8882c.b) r7
            u6.a r1 = r7.a()
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "com.oppwa.mobile.connect.payment.processor.cashapppay.token"
            r0.m(r2, r1)
            java.util.Map<java.lang.String, app.cash.paykit.core.models.sdk.CashAppPayCurrency> r0 = r6.f121930c
            java.lang.Object r0 = r0.get(r8)
            app.cash.paykit.core.models.sdk.CashAppPayCurrency r0 = (app.cash.paykit.core.models.sdk.CashAppPayCurrency) r0
            if (r0 == 0) goto L_0x0059
            app.cash.paykit.core.models.sdk.CashAppPayPaymentAction$OneTimeAction r1 = new app.cash.paykit.core.models.sdk.CashAppPayPaymentAction$OneTimeAction
            u6.a r2 = r7.a()
            double r2 = r2.a()
            r4 = 100
            double r4 = (double) r4
            double r2 = r2 * r4
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            u6.a r3 = r7.a()
            java.lang.String r3 = r3.c()
            r1.<init>(r0, r2, r3)
            app.cash.paykit.core.CashAppPay r0 = f121927g
            if (r0 == 0) goto L_0x0059
            u6.a r7 = r7.a()
            java.lang.String r7 = r7.d()
            r0.createCustomerRequest(r1, r7)
            XH.N r7 = XH.C16807N.f139792a
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            if (r7 != 0) goto L_0x0089
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Currency is not supported: "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.oppwa.mobile.connect.exception.PaymentError r7 = com.oppwa.mobile.connect.exception.PaymentError.getCashAppPayError(r7)
            java.lang.String r8 = "getCashAppPayError(\n    …cyCode\"\n                )"
            kotlin.jvm.internal.C17542s.i(r7, r8)
            r6.onCheckoutFailed$oppwa_mobile_6_19_0_release(r7)
            goto L_0x0089
        L_0x007a:
            boolean r7 = r7 instanceof u6.C8882c.a
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = "failureCallbackUrl"
            java.lang.String r7 = r6.a(r7)
            if (r7 == 0) goto L_0x0089
            r6.sendCashAppPayCallback$oppwa_mobile_6_19_0_release(r7)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayViewModel.handleCashAppSignedOrderResult$oppwa_mobile_6_19_0_release(u6.c, java.lang.String):void");
    }

    public final void handleValidationResult$oppwa_mobile_6_19_0_release(C8883d dVar) {
        Logger.info("Cash App Pay validation response: " + dVar);
        String a10 = dVar instanceof C8883d.b ? a("callbackUrl") : a("failureCallbackUrl");
        if (a10 != null) {
            sendCashAppPayCallback$oppwa_mobile_6_19_0_release(a10);
            return;
        }
        PaymentError cashAppPayError = PaymentError.getCashAppPayError("Error getting callback url");
        C17542s.i(cashAppPayError, "getCashAppPayError(\n    …or getting callback url\")");
        onCheckoutFailed$oppwa_mobile_6_19_0_release(cashAppPayError);
    }

    public final void initCashAppPay() {
        try {
            if (shouldInitialize$oppwa_mobile_6_19_0_release()) {
                this.f121928a.m(IS_INITIALIZED, Boolean.TRUE);
                String a10 = a("clientToken");
                String a11 = a("callbackUrl");
                String a12 = a("failureCallbackUrl");
                if (a10 == null || a10.length() == 0 || a11 == null || a11.length() == 0 || a12 == null || a12.length() == 0) {
                    throw b("CashAppPay payments params are invalid.");
                }
                PaymentParams paymentParams = requireTransaction$oppwa_mobile_6_19_0_release().getPaymentParams();
                CashAppPayPaymentParams cashAppPayPaymentParams = paymentParams instanceof CashAppPayPaymentParams ? (CashAppPayPaymentParams) paymentParams : null;
                if (cashAppPayPaymentParams != null) {
                    CashAppPayConfig cashAppPayConfig = cashAppPayPaymentParams.getCashAppPayConfig();
                    if (cashAppPayConfig != null) {
                        String shopperResultUrl = cashAppPayPaymentParams.getShopperResultUrl();
                        if (shopperResultUrl != null) {
                            this.f121931d = shopperResultUrl;
                            Connect.ProviderMode providerMode = requireTransaction$oppwa_mobile_6_19_0_release().getPaymentParams().getProviderMode();
                            C17542s.i(providerMode, "requireTransaction().paymentParams.providerMode");
                            setAfterpayPacificConfig$oppwa_mobile_6_19_0_release(cashAppPayConfig, providerMode);
                            Connect.ProviderMode providerMode2 = requireTransaction$oppwa_mobile_6_19_0_release().getPaymentParams().getProviderMode();
                            C17542s.i(providerMode2, "requireTransaction().paymentParams.providerMode");
                            String currencyCode = cashAppPayConfig.getCurrencyCode();
                            C17542s.i(currencyCode, "config.currencyCode");
                            startCashAppPay$oppwa_mobile_6_19_0_release(a10, providerMode2, currencyCode);
                            return;
                        }
                        throw b("Shopper result url is null.");
                    }
                    throw b("CashAppPayConfig is null.");
                }
                throw b("CashAppPayPaymentParams is null.");
            }
        } catch (PaymentException e10) {
            PaymentError error = e10.getError();
            C17542s.i(error, "e.error");
            onCheckoutFailed$oppwa_mobile_6_19_0_release(error);
        }
    }

    public final boolean isStatusProcessing() {
        String str = (String) this.f121928a.f(STATUS_EXTRA);
        if (str != null) {
            return C17542s.e(str, "PROCESSING");
        }
        return false;
    }

    public final void onCheckoutFailed$oppwa_mobile_6_19_0_release(PaymentError paymentError) {
        C17542s.j(paymentError, "paymentError");
        this.f121929b.setValue(new CashAppPayResult.CashAppPayFailed(getTransaction(), paymentError));
        deInit$oppwa_mobile_6_19_0_release();
    }

    public final void onCheckoutSuccess$oppwa_mobile_6_19_0_release() {
        this.f121929b.setValue(new CashAppPayResult.CashAppPaySuccess(requireTransaction$oppwa_mobile_6_19_0_release()));
        deInit$oppwa_mobile_6_19_0_release();
    }

    public final Transaction requireTransaction$oppwa_mobile_6_19_0_release() {
        Transaction transaction = (Transaction) this.f121928a.f(CashAppPayProcessorActivity.TRANSACTION_EXTRA);
        if (transaction != null) {
            return transaction;
        }
        throw new PaymentException(PaymentError.getCashAppPayError("Transaction is null"));
    }

    public final void sendCashAppPayCallback$oppwa_mobile_6_19_0_release(String str) {
        C17542s.j(str, "callbackUrl");
        new Thread(new b(str, this)).start();
    }

    public final void setAfterpayPacificConfig$oppwa_mobile_6_19_0_release(CashAppPayConfig cashAppPayConfig, Connect.ProviderMode providerMode) {
        C17542s.j(cashAppPayConfig, "config");
        C17542s.j(providerMode, "providerMode");
        C8833b bVar = providerMode == Connect.ProviderMode.LIVE ? C8833b.PRODUCTION : C8833b.SANDBOX;
        try {
            String minimumAmount = cashAppPayConfig.getMinimumAmount();
            String maximumAmount = cashAppPayConfig.getMaximumAmount();
            C17542s.i(maximumAmount, "config.maximumAmount");
            String currencyCode = cashAppPayConfig.getCurrencyCode();
            C17542s.i(currencyCode, "config.currencyCode");
            Locale locale = cashAppPayConfig.getLocale();
            C17542s.i(locale, "config.locale");
            Afterpay.j(minimumAmount, maximumAmount, currencyCode, locale, bVar, cashAppPayConfig.getConsumerLocale());
        } catch (Exception e10) {
            throw new PaymentException(PaymentError.getUnexpectedExceptionError(e10));
        }
    }

    public final void setShopperResultUrl$oppwa_mobile_6_19_0_release(String str) {
        C17542s.j(str, "<set-?>");
        this.f121931d = str;
    }

    public final boolean shouldInitialize$oppwa_mobile_6_19_0_release() {
        if (b()) {
            return false;
        }
        if (C15854t.H(requireTransaction$oppwa_mobile_6_19_0_release().getPaymentParams().getPaymentBrand(), CheckoutConstants.PaymentBrands.CASH_APP_PAY, true)) {
            return true;
        }
        this.f121929b.setValue(new CashAppPayResult.CashAppPayFailed(requireTransaction$oppwa_mobile_6_19_0_release(), new PaymentError(ErrorCode.ERROR_CODE_UNEXPECTED_EXCEPTION, "This can only be invoked for CashAppPay")));
        return false;
    }

    public final void startCashAppPay$oppwa_mobile_6_19_0_release(String str, Connect.ProviderMode providerMode, String str2) {
        C17542s.j(str, "token");
        C17542s.j(providerMode, "providerMode");
        C17542s.j(str2, "currencyCode");
        CashAppPay cashAppPayInstance$oppwa_mobile_6_19_0_release = getCashAppPayInstance$oppwa_mobile_6_19_0_release(providerMode);
        f121927g = cashAppPayInstance$oppwa_mobile_6_19_0_release;
        if (cashAppPayInstance$oppwa_mobile_6_19_0_release != null) {
            cashAppPayInstance$oppwa_mobile_6_19_0_release.registerForStateUpdates(this.f121932e);
        }
        Afterpay.m(str, new b(this, str2));
    }

    public final void validateCashAppOrder$oppwa_mobile_6_19_0_release(CustomerResponseData customerResponseData) {
        C16807N n10;
        C17542s.j(customerResponseData, "response");
        String a10 = a();
        if (a10 != null) {
            String id2 = customerResponseData.getId();
            List grants = customerResponseData.getGrants();
            C17542s.g(grants);
            Afterpay.n(a10, id2, ((Grant) grants.get(0)).getId(), new c(this));
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            PaymentError cashAppPayError = PaymentError.getCashAppPayError("Error getting cashApp token");
            C17542s.i(cashAppPayError, "getCashAppPayError(\n    …r getting cashApp token\")");
            onCheckoutFailed$oppwa_mobile_6_19_0_release(cashAppPayError);
        }
    }

    private final String a() {
        return (String) this.f121928a.f(TOKEN_EXTRA);
    }

    private final PaymentException b(String str) {
        return new PaymentException(PaymentError.getCashAppPayError(str));
    }

    /* access modifiers changed from: private */
    public static final void a(String str, CashAppPayViewModel cashAppPayViewModel) {
        C17542s.j(str, "$callbackUrl");
        C17542s.j(cashAppPayViewModel, "this$0");
        Boolean sendCallbackRequestToPaypipe = HttpUtils.sendCallbackRequestToPaypipe(str, cashAppPayViewModel.f121931d);
        C17542s.i(sendCallbackRequestToPaypipe, "sendCallbackRequestToPay…ackUrl, shopperResultUrl)");
        if (!sendCallbackRequestToPaypipe.booleanValue()) {
            ErrorCode errorCode = ErrorCode.ERROR_CODE_CASH_APP_PAY;
            cashAppPayViewModel.onCheckoutFailed$oppwa_mobile_6_19_0_release(new PaymentError(errorCode, "Error sending request to: " + str));
            return;
        }
        cashAppPayViewModel.onCheckoutSuccess$oppwa_mobile_6_19_0_release();
    }
}
