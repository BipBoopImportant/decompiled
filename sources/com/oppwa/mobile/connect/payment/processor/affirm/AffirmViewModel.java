package com.oppwa.mobile.connect.payment.processor.affirm;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import com.affirm.android.Affirm;
import com.affirm.android.model.Checkout;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.affirm.AffirmPaymentParams;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.ITransactionListener;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Optional;

public class AffirmViewModel extends f0 implements ITransactionListener {
    public static final String IS_AFFIRM_CHECKOUT_STARTED = "isAffirmCheckoutStarted";

    /* renamed from: a  reason: collision with root package name */
    private final U f121890a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Transaction f121891b;

    /* renamed from: c  reason: collision with root package name */
    private OppPaymentProvider f121892c;

    /* renamed from: d  reason: collision with root package name */
    private C14128a f121893d;

    /* renamed from: e  reason: collision with root package name */
    private CheckoutInfo f121894e;

    /* renamed from: f  reason: collision with root package name */
    private CheckoutData f121895f;

    /* renamed from: g  reason: collision with root package name */
    private final K<Checkout> f121896g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final K<PaymentError> f121897h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final K<Transaction> f121898i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f121899j;

    /* renamed from: k  reason: collision with root package name */
    private final Affirm.CheckoutCallbacks f121900k = new a();

    class a implements Affirm.CheckoutCallbacks {
        a() {
        }

        public void onAffirmCheckoutCancelled() {
            Logger.error("Affirm checkout is cancelled.");
            AffirmViewModel.this.f121897h.postValue(PaymentError.getAffirmError("Transaction is cancelled."));
        }

        public void onAffirmCheckoutError(String str) {
            Logger.error("Affirm checkout error: " + str);
            K a10 = AffirmViewModel.this.f121897h;
            a10.postValue(PaymentError.getAffirmError("Affirm checkout error: " + str));
        }

        public void onAffirmCheckoutSuccess(String str) {
            Logger.info("Affirm checkout is successful.");
            AffirmViewModel.this.setAffirmToken(str);
            AffirmViewModel.this.f121898i.postValue(AffirmViewModel.this.f121891b);
        }
    }

    public AffirmViewModel(U u10) {
        this.f121890a = u10;
        this.f121896g = new K<>();
        this.f121897h = new K<>();
        this.f121898i = new K<>();
        this.f121893d = new C14128a();
        Transaction transaction = (Transaction) u10.f(AffirmProcessorActivity.TRANSACTION_EXTRA_KEY);
        this.f121891b = transaction;
        Optional.ofNullable(transaction).map(new C14138k()).map(new C14139l()).ifPresent(new C14140m());
        this.f121899j = Boolean.TRUE.equals(u10.f(IS_AFFIRM_CHECKOUT_STARTED));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException d() {
        return new PaymentException(PaymentError.getAffirmError("Checkout data is null."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException e() {
        return new PaymentException(PaymentError.getAffirmError("Affirm config is invalid."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException f() {
        return new PaymentException(PaymentError.getPaymentProviderInternalError("Affirm config is invalid."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException g() {
        return new IllegalStateException("Payment provider is null.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException h() {
        return new IllegalStateException("Transaction is null.");
    }

    private OppPaymentProvider i() {
        return (OppPaymentProvider) Optional.ofNullable(this.f121892c).orElseThrow(new C14144q());
    }

    private Transaction j() {
        return (Transaction) Optional.ofNullable(this.f121891b).orElseThrow(new C14141n());
    }

    private void k() {
        Transaction transaction = this.f121891b;
        if (transaction == null) {
            throw new PaymentException(PaymentError.getAffirmError("Transaction is null."));
        } else if (!(transaction.getPaymentParams() instanceof AffirmPaymentParams)) {
            throw new PaymentException(PaymentError.getAffirmError("Affirm payment params are invalid."));
        }
    }

    public F<Checkout> getAffirmCheckoutLiveData() {
        return this.f121896g;
    }

    public F<PaymentError> getPaymentErrorLiveData() {
        return this.f121897h;
    }

    public Transaction getTransaction() {
        return this.f121891b;
    }

    public K<Transaction> getTransactionResultLiveData() {
        return this.f121898i;
    }

    public void handleAffirmCheckoutResult(int i10, int i11, Intent intent) {
        if (!Affirm.handleCheckoutData(this.f121900k, i10, i11, intent)) {
            Logger.error("Affirm handle checkout processing failed.");
        }
    }

    public void init(Context context) {
        if (!this.f121899j) {
            k();
            if (this.f121892c == null) {
                this.f121892c = new OppPaymentProvider(context, j().getPaymentParams().getProviderMode());
            }
            this.f121892c.requestCheckoutInfo(j().getPaymentParams().getCheckoutId(), this);
        }
    }

    public boolean isAffirmCheckoutStarted() {
        return this.f121899j;
    }

    public boolean isVcnEnabled() {
        return ((Boolean) Optional.ofNullable(this.f121894e).map(new r()).map(new C14145s()).orElseThrow(new C14146t())).booleanValue();
    }

    public void paymentConfigRequestFailed(PaymentError paymentError) {
        this.f121897h.postValue(paymentError);
    }

    public void paymentConfigRequestSucceeded(CheckoutInfo checkoutInfo) {
        this.f121894e = checkoutInfo;
        i().requestCheckoutData(j().getPaymentParams().getCheckoutId(), new C14134g(this));
    }

    public void setAffirmCheckoutStarted(boolean z10) {
        this.f121899j = z10;
        this.f121890a.m(IS_AFFIRM_CHECKOUT_STARTED, Boolean.valueOf(z10));
    }

    public void setAffirmToken(String str) {
        ((AffirmPaymentParams) j().getPaymentParams()).setAffirmToken(str);
    }

    public void transactionCompleted(Transaction transaction) {
    }

    public void transactionFailed(Transaction transaction, PaymentError paymentError) {
    }

    private void a(String str) {
        Affirm.initialize(new Affirm.Configuration.Builder(str).setEnvironment(a()).setLogLevel(Integer.MAX_VALUE).setMerchantName((String) Optional.ofNullable(this.f121895f).map(new C14142o()).map(new C14143p()).orElse((Object) null)).build());
    }

    private void b() {
        try {
            Optional.ofNullable(this.f121894e).orElseThrow(new C14147u());
            Optional.ofNullable(this.f121895f).orElseThrow(new C14148v());
            a((String) Optional.of(this.f121894e).map(new r()).map(new C14135h()).filter(new C14136i()).orElseThrow(new C14137j()));
            this.f121896g.postValue(this.f121893d.a(this.f121895f));
        } catch (PaymentException e10) {
            Logger.error((Throwable) e10);
            e10.printStackTrace();
            this.f121897h.postValue(e10.getError());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException c() {
        return new PaymentException(PaymentError.getAffirmError("Checkout info is null."));
    }

    /* access modifiers changed from: protected */
    public Affirm.Environment a() {
        return Connect.ProviderMode.LIVE.equals(j().getPaymentParams().getProviderMode()) ? Affirm.Environment.PRODUCTION : Affirm.Environment.SANDBOX;
    }

    /* access modifiers changed from: protected */
    public void a(CheckoutData checkoutData, PaymentError paymentError) {
        if (paymentError != null) {
            this.f121897h.postValue(paymentError);
            return;
        }
        this.f121895f = checkoutData;
        b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str) {
        return !str.isEmpty();
    }
}
