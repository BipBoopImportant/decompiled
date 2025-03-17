package com.oppwa.mobile.connect.payment.processor.cashapppay;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16533h;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayViewModel;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.utils.Logger;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u0003J!\u0010!\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010)R\"\u0010,\u001a\u00020+8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayProcessorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "checkForDeepLinkIntent$oppwa_mobile_6_19_0_release", "checkForDeepLinkIntent", "", "isStatusProcessing$oppwa_mobile_6_19_0_release", "()Z", "isStatusProcessing", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "handleOnNewIntent$oppwa_mobile_6_19_0_release", "handleOnNewIntent", "handleBackPressed$oppwa_mobile_6_19_0_release", "handleBackPressed", "isCashAppAvailable$oppwa_mobile_6_19_0_release", "isCashAppAvailable", "onStart", "Lcom/oppwa/mobile/connect/provider/Transaction;", "transaction", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "error", "onError$oppwa_mobile_6_19_0_release", "(Lcom/oppwa/mobile/connect/provider/Transaction;Lcom/oppwa/mobile/connect/exception/PaymentError;)V", "onError", "onComplete$oppwa_mobile_6_19_0_release", "(Lcom/oppwa/mobile/connect/provider/Transaction;)V", "onComplete", "a", "Z", "isDeepLinkIntentReceived$oppwa_mobile_6_19_0_release", "setDeepLinkIntentReceived$oppwa_mobile_6_19_0_release", "(Z)V", "isDeepLinkIntentReceived", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel;", "cashAppPayViewModel", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel;", "getCashAppPayViewModel$oppwa_mobile_6_19_0_release", "()Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel;", "setCashAppPayViewModel$oppwa_mobile_6_19_0_release", "(Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel;)V", "Companion", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
public final class CashAppPayProcessorActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ERROR_EXTRA = "com.oppwa.mobile.connect.payment.processor.cashapppay.error";
    public static final int RESULT_ERROR = 1002;
    public static final String TRANSACTION_EXTRA = "com.oppwa.mobile.connect.payment.processor.cashapppay.transaction";

    /* renamed from: a  reason: collision with root package name */
    private boolean f121922a;
    public CashAppPayViewModel cashAppPayViewModel;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayProcessorActivity$Companion;", "", "()V", "ERROR_EXTRA", "", "RESULT_ERROR", "", "TRANSACTION_EXTRA", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 7, 1})
    @f(c = "com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity$onStart$1", f = "CashAppPayProcessorActivity.kt", l = {121}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f121923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CashAppPayProcessorActivity f121924b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;", "it", "LXH/N;", "a", "(Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$CashAppPayResult;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity$a$a  reason: collision with other inner class name */
        static final class C3014a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CashAppPayProcessorActivity f121925a;

            C3014a(CashAppPayProcessorActivity cashAppPayProcessorActivity) {
                this.f121925a = cashAppPayProcessorActivity;
            }

            /* renamed from: a */
            public final Object emit(CashAppPayViewModel.CashAppPayResult cashAppPayResult, C17164e<? super C16807N> eVar) {
                if (cashAppPayResult instanceof CashAppPayViewModel.CashAppPayResult.CashAppPaySuccess) {
                    this.f121925a.onComplete$oppwa_mobile_6_19_0_release(((CashAppPayViewModel.CashAppPayResult.CashAppPaySuccess) cashAppPayResult).getTransaction());
                } else if (cashAppPayResult instanceof CashAppPayViewModel.CashAppPayResult.CashAppPayFailed) {
                    CashAppPayViewModel.CashAppPayResult.CashAppPayFailed cashAppPayFailed = (CashAppPayViewModel.CashAppPayResult.CashAppPayFailed) cashAppPayResult;
                    this.f121925a.onError$oppwa_mobile_6_19_0_release(cashAppPayFailed.getTransaction(), cashAppPayFailed.getError());
                } else if (!C17542s.e(cashAppPayResult, CashAppPayViewModel.CashAppPayResult.Initial.INSTANCE)) {
                    C17542s.e(cashAppPayResult, CashAppPayViewModel.CashAppPayResult.Processing.INSTANCE);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CashAppPayProcessorActivity cashAppPayProcessorActivity, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f121924b = cashAppPayProcessorActivity;
        }

        /* renamed from: a */
        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f121924b, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f121923a;
            if (i10 == 0) {
                y.b(obj);
                C16519P<CashAppPayViewModel.CashAppPayResult> cashAppPayResult = this.f121924b.getCashAppPayViewModel$oppwa_mobile_6_19_0_release().getCashAppPayResult();
                C3014a aVar = new C3014a(this.f121924b);
                this.f121923a = 1;
                if (cashAppPayResult.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    public final void checkForDeepLinkIntent$oppwa_mobile_6_19_0_release() {
        if (isStatusProcessing$oppwa_mobile_6_19_0_release() && !this.f121922a) {
            Transaction transaction = getCashAppPayViewModel$oppwa_mobile_6_19_0_release().getTransaction();
            PaymentError cashAppPayError = PaymentError.getCashAppPayError("Transaction state is unknown, request payment status to get the actual state.");
            C17542s.i(cashAppPayError, "getCashAppPayError(\n    …state.\"\n                )");
            onError$oppwa_mobile_6_19_0_release(transaction, cashAppPayError);
        }
    }

    public final CashAppPayViewModel getCashAppPayViewModel$oppwa_mobile_6_19_0_release() {
        CashAppPayViewModel cashAppPayViewModel2 = this.cashAppPayViewModel;
        if (cashAppPayViewModel2 != null) {
            return cashAppPayViewModel2;
        }
        C17542s.z("cashAppPayViewModel");
        return null;
    }

    public final void handleBackPressed$oppwa_mobile_6_19_0_release() {
        getOnBackPressedDispatcher().i(this, new CashAppPayProcessorActivity$handleBackPressed$1(this));
    }

    public final void handleOnNewIntent$oppwa_mobile_6_19_0_release(Intent intent) {
        this.f121922a = C17542s.e(getString(R.string.oppwa_scheme), intent != null ? intent.getScheme() : null);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isCashAppAvailable$oppwa_mobile_6_19_0_release() {
        /*
            r5 = this;
            boolean r0 = com.oppwa.mobile.connect.utils.LibraryHelper.isCashAppPayAvailable
            if (r0 == 0) goto L_0x000a
            boolean r0 = com.oppwa.mobile.connect.utils.LibraryHelper.isAfterpayPacificAvailable
            if (r0 == 0) goto L_0x000a
            r0 = 1
            goto L_0x0041
        L_0x000a:
            android.content.Intent r0 = r5.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x0032
            com.oppwa.mobile.connect.utils.Extensions r2 = com.oppwa.mobile.connect.utils.Extensions.INSTANCE
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            java.lang.String r4 = "com.oppwa.mobile.connect.payment.processor.cashapppay.transaction"
            if (r2 < r3) goto L_0x0022
            java.lang.Class<com.oppwa.mobile.connect.provider.Transaction> r1 = com.oppwa.mobile.connect.provider.Transaction.class
            java.lang.Object r0 = r0.getParcelableExtra(r4, r1)
            goto L_0x002f
        L_0x0022:
            android.os.Parcelable r0 = r0.getParcelableExtra(r4)
            boolean r2 = r0 instanceof com.oppwa.mobile.connect.provider.Transaction
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r0
        L_0x002c:
            r0 = r1
            com.oppwa.mobile.connect.provider.Transaction r0 = (com.oppwa.mobile.connect.provider.Transaction) r0
        L_0x002f:
            r1 = r0
            com.oppwa.mobile.connect.provider.Transaction r1 = (com.oppwa.mobile.connect.provider.Transaction) r1
        L_0x0032:
            java.lang.String r0 = "The 'com.afterpay:afterpay-android' and 'app.cash.paykit:core' dependencies are required to use Cash App Pay"
            com.oppwa.mobile.connect.exception.PaymentError r0 = com.oppwa.mobile.connect.exception.PaymentError.getCashAppPayError(r0)
            java.lang.String r2 = "getCashAppPayError(\"The …red to use Cash App Pay\")"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            r5.onError$oppwa_mobile_6_19_0_release(r1, r0)
            r0 = 0
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity.isCashAppAvailable$oppwa_mobile_6_19_0_release():boolean");
    }

    public final boolean isDeepLinkIntentReceived$oppwa_mobile_6_19_0_release() {
        return this.f121922a;
    }

    public final boolean isStatusProcessing$oppwa_mobile_6_19_0_release() {
        return C17542s.e(getCashAppPayViewModel$oppwa_mobile_6_19_0_release().getCashAppPayResult().getValue(), CashAppPayViewModel.CashAppPayResult.Initial.INSTANCE) ? getCashAppPayViewModel$oppwa_mobile_6_19_0_release().isStatusProcessing() : C17542s.e(getCashAppPayViewModel$oppwa_mobile_6_19_0_release().getCashAppPayResult().getValue(), CashAppPayViewModel.CashAppPayResult.Processing.INSTANCE);
    }

    public final void onComplete$oppwa_mobile_6_19_0_release(Transaction transaction) {
        C17542s.j(transaction, "transaction");
        transaction.setTransactionType(TransactionType.SYNC);
        Logger.sendLogs();
        Intent intent = new Intent();
        intent.putExtra(TRANSACTION_EXTRA, transaction);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isCashAppAvailable$oppwa_mobile_6_19_0_release()) {
            setCashAppPayViewModel$oppwa_mobile_6_19_0_release((CashAppPayViewModel) new i0((k0) this).a(CashAppPayViewModel.class));
            getCashAppPayViewModel$oppwa_mobile_6_19_0_release().initCashAppPay();
            handleBackPressed$oppwa_mobile_6_19_0_release();
        }
    }

    public final void onError$oppwa_mobile_6_19_0_release(Transaction transaction, PaymentError paymentError) {
        C17542s.j(paymentError, UiComponentContainer.RESULT_ERROR);
        if (transaction != null) {
            transaction.setTransactionType(TransactionType.SYNC);
        }
        Logger.error(paymentError.getErrorCode() + " - " + paymentError.getErrorMessage());
        Logger.sendLogs();
        Intent intent = new Intent();
        intent.putExtra(TRANSACTION_EXTRA, transaction);
        intent.putExtra(ERROR_EXTRA, paymentError);
        setResult(RESULT_ERROR, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleOnNewIntent$oppwa_mobile_6_19_0_release(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        checkForDeepLinkIntent$oppwa_mobile_6_19_0_release();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final void setCashAppPayViewModel$oppwa_mobile_6_19_0_release(CashAppPayViewModel cashAppPayViewModel2) {
        C17542s.j(cashAppPayViewModel2, "<set-?>");
        this.cashAppPayViewModel = cashAppPayViewModel2;
    }

    public final void setDeepLinkIntentReceived$oppwa_mobile_6_19_0_release(boolean z10) {
        this.f121922a = z10;
    }
}
