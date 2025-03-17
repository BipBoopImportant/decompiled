package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import com.nsoftware.ipworks3ds.sdk.ThreeDS2Service;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.meta.DisposableLiveData;
import com.oppwa.mobile.connect.checkout.meta.OnBeforeSubmitCallback;
import com.oppwa.mobile.connect.checkout.meta.PaymentDetails;
import com.oppwa.mobile.connect.checkout.meta.TransactionResultLiveData;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.HttpUtils;
import com.oppwa.mobile.connect.provider.ITransactionListener;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.ThreeDSWorkflowListener;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Optional;

public class CheckoutViewModel extends f0 implements ITransactionListener {
    public static final String BRANDS_VALIDATION = "brandsValidation";
    public static final String CHECKOUT_INFO_KEY = "checkoutInfo";
    public static final String CHECKOUT_SETTINGS = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_SETTINGS";
    public static final String TRANSACTION_PROCESSING_KEY = "transactionProcessing";

    /* renamed from: a  reason: collision with root package name */
    private final U f120894a;

    /* renamed from: b  reason: collision with root package name */
    private OppPaymentProvider f120895b;

    /* renamed from: c  reason: collision with root package name */
    private final K<CheckoutInfo> f120896c;

    /* renamed from: d  reason: collision with root package name */
    private final K<BrandsValidation> f120897d;

    /* renamed from: e  reason: collision with root package name */
    private K<ImagesRequest> f120898e;

    /* renamed from: f  reason: collision with root package name */
    private I<TransactionResult> f120899f;

    /* renamed from: g  reason: collision with root package name */
    private final K<PaymentError> f120900g = new K<>();

    /* renamed from: h  reason: collision with root package name */
    private final K<TransactionResult> f120901h = new K<>();

    /* renamed from: i  reason: collision with root package name */
    private final DisposableLiveData<PaymentDetails> f120902i = new DisposableLiveData<>();

    /* renamed from: j  reason: collision with root package name */
    private boolean f120903j;

    /* renamed from: k  reason: collision with root package name */
    private String f120904k;

    /* renamed from: l  reason: collision with root package name */
    private final CheckoutSettings f120905l;

    class a implements ThreeDSWorkflowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f120906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ThreeDSConfig f120907b;

        a(Activity activity, ThreeDSConfig threeDSConfig) {
            this.f120906a = activity;
            this.f120907b = threeDSConfig;
        }

        public Activity onThreeDSChallengeRequired() {
            return this.f120906a;
        }

        public ThreeDSConfig onThreeDSConfigRequired() {
            return this.f120907b;
        }
    }

    public CheckoutViewModel(U u10) {
        this.f120894a = u10;
        this.f120903j = Boolean.TRUE.equals(u10.f(TRANSACTION_PROCESSING_KEY));
        this.f120905l = (CheckoutSettings) u10.f("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_SETTINGS");
        this.f120896c = u10.g("checkoutInfo");
        this.f120897d = u10.g("brandsValidation");
        if (this.f120903j) {
            a();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException c() {
        return new IllegalStateException("BrandsValidation is null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException d() {
        return new IllegalStateException("CheckoutInfo is null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException e() {
        return new IllegalStateException("CheckoutSetting is null");
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f120904k;
    }

    public void brandsValidationRequestFailed(PaymentError paymentError) {
        this.f120900g.postValue(paymentError);
    }

    public void brandsValidationRequestSucceeded(BrandsValidation brandsValidation) {
        brandsValidation.setBrandDetectionPriority(requireCheckoutSettings().getBrandDetectionPriority());
        this.f120897d.postValue(brandsValidation);
    }

    public F<TransactionResult> getAfterpayPacificResultLiveData() {
        return this.f120901h;
    }

    public BrandsValidation getBrandsValidation() {
        return this.f120897d.getValue();
    }

    public F<BrandsValidation> getBrandsValidationLiveData() {
        return this.f120897d;
    }

    public F<CheckoutInfo> getCheckoutInfoLiveData() {
        return this.f120896c;
    }

    public CheckoutSettings getCheckoutSettings() {
        return this.f120905l;
    }

    public F<ImagesRequest> getImagesRequestLiveData(String[] strArr, OppPaymentProvider oppPaymentProvider) {
        if (this.f120898e == null) {
            this.f120898e = new K<>();
            oppPaymentProvider.requestImages(strArr, this);
        }
        return this.f120898e;
    }

    public DisposableLiveData<PaymentDetails> getPaymentDetailsLiveData() {
        return this.f120902i;
    }

    public F<PaymentError> getPaymentErrorLiveData() {
        return this.f120900g;
    }

    public F<TransactionResult> getTransactionResultLiveData() {
        if (this.f120899f == null) {
            I<TransactionResult> i10 = new I<>();
            this.f120899f = i10;
            i10.b(TransactionResultLiveData.getInstance(), new D1(this));
        }
        return this.f120899f;
    }

    public void imagesRequestFailed() {
        this.f120898e.postValue(null);
    }

    public void imagesRequestSucceeded(ImagesRequest imagesRequest) {
        this.f120898e.postValue(imagesRequest);
    }

    public void onBeforeSubmit(OnBeforeSubmitCallback onBeforeSubmitCallback, PaymentDetails paymentDetails) {
        onBeforeSubmitCallback.onBeforeSubmit(paymentDetails, new C1(this));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f120895b = null;
        Optional.ofNullable(this.f120899f).ifPresent(new J1());
    }

    public void paymentConfigRequestFailed(PaymentError paymentError) {
        this.f120900g.postValue(paymentError);
    }

    public void paymentConfigRequestSucceeded(CheckoutInfo checkoutInfo) {
        this.f120896c.postValue(checkoutInfo);
    }

    public void requestBrandsValidation(String str, String[] strArr, OppPaymentProvider oppPaymentProvider) {
        oppPaymentProvider.requestBrandsValidation(str, strArr, this);
    }

    public void requestCheckoutInfo(String str, OppPaymentProvider oppPaymentProvider) {
        oppPaymentProvider.requestCheckoutInfo(str, this);
    }

    public BrandsValidation requireBrandsValidation() {
        return (BrandsValidation) Optional.of(this.f120897d).map(new C14124y1()).orElseThrow(new B1());
    }

    public CheckoutInfo requireCheckoutInfo() {
        return (CheckoutInfo) Optional.of(this.f120896c).map(new G1()).orElseThrow(new H1());
    }

    public CheckoutSettings requireCheckoutSettings() {
        return (CheckoutSettings) Optional.ofNullable(this.f120905l).orElseThrow(new E1());
    }

    public void sendAfterpayPacificCallback(String str, String str2, Transaction transaction) {
        new Thread(new I1(this, str, str2, transaction)).start();
    }

    public void sendTransaction(Activity activity, ThreeDSConfig threeDSConfig, Transaction transaction, String str, OppPaymentProvider oppPaymentProvider) {
        if (!this.f120903j) {
            a(true);
            a(activity, threeDSConfig, oppPaymentProvider);
            if (!((Boolean) Optional.of(getCheckoutInfoLiveData()).map(new C14127z1()).map(new A1()).orElse(Boolean.FALSE)).booleanValue() || !LibraryHelper.isIovationAvailable) {
                oppPaymentProvider.sendTransaction(transaction, str, this);
            } else {
                a(activity.getApplicationContext(), transaction, str, oppPaymentProvider);
            }
        }
    }

    public void transactionCompleted(Transaction transaction) {
        a(false);
        a(transaction, (PaymentError) null);
    }

    public void transactionFailed(Transaction transaction, PaymentError paymentError) {
        a(false);
        a(transaction, paymentError);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TransactionResult transactionResult) {
        this.f120899f.postValue(transactionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void a(String str, String str2, Transaction transaction) {
        PaymentError paymentError;
        if (!HttpUtils.sendCallbackRequestToPaypipe(str, str2).booleanValue()) {
            ErrorCode errorCode = ErrorCode.ERROR_CODE_AFTERPAY_PACIFIC;
            paymentError = new PaymentError(errorCode, "Error sending request to: " + str2);
        } else {
            paymentError = null;
        }
        this.f120901h.postValue(new TransactionResult(transaction, paymentError));
    }

    private void a(Activity activity, ThreeDSConfig threeDSConfig, OppPaymentProvider oppPaymentProvider) {
        oppPaymentProvider.setThreeDSWorkflowListener(new a(activity, threeDSConfig));
    }

    private void a(Context context, Transaction transaction, String str, OppPaymentProvider oppPaymentProvider) {
        new C14093o(context).a(new F1(this, transaction, oppPaymentProvider, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Transaction transaction, OppPaymentProvider oppPaymentProvider, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            transaction.getPaymentParams().addParam("customer.browserFingerprint.value", str2);
        }
        oppPaymentProvider.sendTransaction(transaction, str, this);
    }

    private void a(Transaction transaction, PaymentError paymentError) {
        TransactionResult transactionResult = new TransactionResult(transaction, paymentError);
        I<TransactionResult> i10 = this.f120899f;
        if (i10 == null || !i10.hasObservers()) {
            Logger.info("CheckoutActivity was destroyed in the background.");
            TransactionResultLiveData.getInstance().postValue(transactionResult);
            return;
        }
        this.f120899f.postValue(transactionResult);
    }

    /* access modifiers changed from: private */
    public void a(PaymentDetails paymentDetails) {
        this.f120902i.postValue(paymentDetails);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f120904k = str;
    }

    /* access modifiers changed from: package-private */
    public OppPaymentProvider a(Context context, Connect.ProviderMode providerMode) {
        if (this.f120895b == null) {
            this.f120895b = new OppPaymentProvider(context, providerMode);
        }
        return this.f120895b;
    }

    private void a(boolean z10) {
        this.f120903j = z10;
        this.f120894a.m(TRANSACTION_PROCESSING_KEY, Boolean.valueOf(z10));
    }

    private void a() {
        if (LibraryHelper.isThreeDS2Available && ThreeDS2Service.a()) {
            this.f120900g.postValue(PaymentError.getThreeDS2Error("Failed to restore 3DS transaction state."));
        }
    }
}
