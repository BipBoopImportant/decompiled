package com.oppwa.mobile.connect.checkout.dialog;

import Ba.C6381e;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.C5187o;
import com.afterpay.android.Afterpay;
import com.google.android.gms.wallet.PaymentsClient;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.meta.AfterpayPacificConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import t6.C8833b;
import xa.C8965f;
import xa.C8971l;

public abstract class BaseServiceActivity extends BaseActivity {

    /* renamed from: u  reason: collision with root package name */
    protected Transaction f120834u;

    class a implements StatusListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f120835a;

        a(CountDownLatch countDownLatch) {
            this.f120835a = countDownLatch;
        }

        public void onFail(int i10, Bundle bundle) {
            BaseServiceActivity.this.f120810i.b().remove(CheckoutConstants.PaymentBrands.SAMSUNGPAY);
            this.f120835a.countDown();
        }

        public void onSuccess(int i10, Bundle bundle) {
            int i11;
            if (i10 == 0) {
                BaseServiceActivity.this.f120810i.b().remove(CheckoutConstants.PaymentBrands.SAMSUNGPAY);
            } else if (!(i10 != 1 || (i11 = bundle.getInt("errorReason")) == -356 || i11 == -357)) {
                BaseServiceActivity.this.f120810i.b().remove(CheckoutConstants.PaymentBrands.SAMSUNGPAY);
            }
            this.f120835a.countDown();
        }
    }

    private Transaction B() {
        C14125z zVar = new C14125z(this.f120812k);
        zVar.a(this.f120805d);
        zVar.a(CheckoutHelper.getShopperResultUrl());
        return new Transaction(zVar.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException F() {
        return new PaymentException(PaymentError.getAfterpayPacificError("AfterpayPacificConfig is not set."));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G() {
        try {
            O();
        } catch (PaymentException e10) {
            a((Transaction) null, (Exception) e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        runOnUiThread(new C0(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException I() {
        return new PaymentException(PaymentError.getPaymentProviderInternalError("Transaction is null."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException J() {
        return new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_PAYMENT_BRAND_INVALID, "Missing payment brand for Klarna inline flow"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException K() {
        return new PaymentException(PaymentError.getPaymentProviderInternalError("Klarna inline fragment is null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException L() {
        return new PaymentException(PaymentError.getAfterpayPacificError("Currency is null."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException M() {
        return new PaymentException(PaymentError.getPaymentProviderInternalError("Endpoint can't be null"));
    }

    private void S() {
        C14122y yVar = this.f120810i;
        if (yVar == null || yVar.b().isEmpty()) {
            throw new PaymentException(this.f120805d == r.CHECKOUT_UI ? PaymentError.getNoAvailablePaymentMethodsError() : PaymentError.getPaymentMethodNotAvailableError());
        }
    }

    private void d(Transaction transaction) {
        C5187o b10 = this.f120804c.b();
        if (b10 instanceof BlikPaymentInfoFragment) {
            ((BlikPaymentInfoFragment) b10).continueWithPayment(transaction);
            this.f120806e = true;
            return;
        }
        throw new PaymentException(PaymentError.getBlikError("The Blik fragment is not presented."));
    }

    private void e(Transaction transaction) {
        this.f120820s.a(transaction);
    }

    /* access modifiers changed from: protected */
    public void A() {
        Connect.ProviderMode f10 = f();
        if (g() != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            SamsungPayHelper.getSamsungPay(this, g()).getSamsungPayStatus(new a(countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                a((Transaction) null, (Exception) e10);
            }
        } else if (f10 == Connect.ProviderMode.LIVE) {
            this.f120810i.b().remove(CheckoutConstants.PaymentBrands.SAMSUNGPAY);
        } else {
            a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayServiceIdError()));
        }
    }

    /* access modifiers changed from: protected */
    public void C() {
        Transaction transaction = (Transaction) Optional.ofNullable(this.f120834u).orElseThrow(new G0());
        transaction.setTransactionType(TransactionType.SYNC);
        this.f120834u = null;
        a(transaction);
    }

    /* access modifiers changed from: protected */
    public boolean D() {
        return this.f120810i.b().contains(CheckoutConstants.PaymentBrands.GOOGLEPAY) && LibraryHelper.isPlayServicesWalletAvailable;
    }

    /* access modifiers changed from: protected */
    public boolean E() {
        return this.f120810i.b().contains(CheckoutConstants.PaymentBrands.SAMSUNGPAY) && LibraryHelper.isSamsungPayAvailable;
    }

    /* access modifiers changed from: protected */
    public ThreeDSConfig N() {
        ThreeDSConfig threeDSConfig = (ThreeDSConfig) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getThreeDS2Config()).orElse(new ThreeDSConfig.Builder().build());
        if (threeDSConfig.getLocale() != null || TextUtils.isEmpty(this.f120803b.requireCheckoutSettings().getLocale())) {
            return threeDSConfig;
        }
        ThreeDSConfig.Builder builder = new ThreeDSConfig.Builder(threeDSConfig);
        builder.setLocale(this.f120803b.requireCheckoutSettings().getLocale());
        return builder.build();
    }

    /* access modifiers changed from: protected */
    public void O() {
        S();
        this.f120803b.getBrandsValidationLiveData().observe(this, new C14114v0(this));
        CheckoutViewModel checkoutViewModel = this.f120803b;
        checkoutViewModel.requestBrandsValidation(checkoutViewModel.requireCheckoutSettings().getCheckoutId(), this.f120810i.c(), this.f120802a);
    }

    /* access modifiers changed from: protected */
    public void P() {
        this.f120803b.getCheckoutInfoLiveData().observe(this, new C14105s0(this));
        CheckoutViewModel checkoutViewModel = this.f120803b;
        checkoutViewModel.requestCheckoutInfo(checkoutViewModel.requireCheckoutSettings().getCheckoutId(), this.f120802a);
    }

    /* access modifiers changed from: protected */
    public void Q() {
        this.f120803b.getImagesRequestLiveData(this.f120810i.c(), this.f120802a).observe(this, new C14126z0(this));
    }

    /* access modifiers changed from: protected */
    public abstract void R();

    /* access modifiers changed from: protected */
    public void a(CheckoutInfo checkoutInfo) {
        if (checkoutInfo != null) {
            try {
                CheckoutSettings requireCheckoutSettings = this.f120803b.requireCheckoutSettings();
                Connect.ProviderMode providerMode = requireCheckoutSettings.getProviderMode();
                C14122y yVar = new C14122y(requireCheckoutSettings.getPaymentBrands(), checkoutInfo.getTokens());
                this.f120810i = yVar;
                yVar.a(checkoutInfo, requireCheckoutSettings.isPaymentBrandsOrderUsedForTokens());
                this.f120810i.a(requireCheckoutSettings, this.f120813l.d());
                this.f120810i.a(requireCheckoutSettings.getKlarnaCountry(), providerMode);
                this.f120810i.a(providerMode, CheckoutHelper.getShopperResultUrl());
                String str = this.f120809h;
                if (str != null && !"CARD".equals(str)) {
                    this.f120810i.b().add(this.f120809h);
                }
                this.f120810i.a(requireCheckoutSettings.getWpwlOptions(), requireCheckoutSettings.getAfterpayPacificConfig(), providerMode);
                this.f120810i.d(requireCheckoutSettings);
                this.f120810i.a(requireCheckoutSettings.getProviderMode());
                this.f120810i.c(requireCheckoutSettings);
                CompletableFuture.allOf((CompletableFuture[]) z().toArray(new CompletableFuture[0])).thenRun(new F0(this));
            } catch (Exception e10) {
                a((Transaction) null, e10);
            }
        } else {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_INTERNAL_ERROR, "CheckoutInfo is null"));
        }
    }

    /* access modifiers changed from: protected */
    public void b(PaymentError paymentError) {
        b((Transaction) null, paymentError);
    }

    /* access modifiers changed from: protected */
    public void c(Transaction transaction, PaymentError paymentError) {
        if (this.f120804c.b() instanceof KlarnaInlinePaymentInfoFragment) {
            ((KlarnaInlinePaymentInfoFragment) this.f120804c.b()).continueWithPayment(transaction, paymentError);
        } else if (TextUtils.isEmpty(transaction.getBrandSpecificInfo().get("clientToken")) || TextUtils.isEmpty(transaction.getBrandSpecificInfo().get("callbackUrl")) || TextUtils.isEmpty(transaction.getBrandSpecificInfo().get("failureCallbackUrl")) || TextUtils.isEmpty(transaction.getBrandSpecificInfo().get(Transaction.KLARNA_INLINE_INITIAL_TRANSACTION_ID))) {
            throw new PaymentException(PaymentError.getPaymentProviderInternalError("Klarna inline payments params are invalid"));
        } else {
            this.f120806e = true;
            String str = (String) Optional.ofNullable(transaction.getPaymentParams().getPaymentBrand()).orElseThrow(new D0());
            a((C5187o) Optional.ofNullable(C14119x.a(str, false)).orElseThrow(new E0()), str, (Token) null, transaction);
        }
    }

    /* access modifiers changed from: protected */
    public Connect.ProviderMode f() {
        OppPaymentProvider oppPaymentProvider = this.f120802a;
        if (oppPaymentProvider != null) {
            return oppPaymentProvider.getProviderMode();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f120803b.getCheckoutSettings() != null) {
            CheckoutSettings requireCheckoutSettings = this.f120803b.requireCheckoutSettings();
            Logger.setProviderMode(requireCheckoutSettings.getProviderMode());
            Logger.setCurrentCheckoutId(requireCheckoutSettings.getCheckoutId());
            this.f120802a = this.f120803b.a(getApplicationContext(), requireCheckoutSettings.getProviderMode());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f120803b.getPaymentErrorLiveData().observe(this, new I0(this));
        try {
            P();
        } catch (Exception e10) {
            a((Transaction) null, e10);
        }
        this.f120803b.getTransactionResultLiveData().observe(this, new C14108t0(this));
        this.f120803b.getAfterpayPacificResultLiveData().observe(this, new C14111u0(this));
    }

    /* access modifiers changed from: protected */
    public void x() {
        this.f120806e = false;
        this.f120803b.sendTransaction(this, N(), B(), (String) Optional.ofNullable(this.f120803b.requireCheckoutInfo().getEndpoint()).orElseThrow(new H0()), this.f120802a);
        this.f120812k = null;
    }

    /* access modifiers changed from: protected */
    public void y() {
        Connect.ProviderMode f10 = f();
        this.f120811j = GooglePayHelper.getPaymentsClient(this, this.f120803b.requireCheckoutSettings().getProviderMode());
        C14117w0 w0Var = new C14117w0(this);
        String googlePayPaymentDataRequestJson = this.f120803b.requireCheckoutSettings().getGooglePayPaymentDataRequestJson();
        if (googlePayPaymentDataRequestJson != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                a(this.f120811j, googlePayPaymentDataRequestJson, w0Var);
                countDownLatch.countDown();
            } catch (PaymentException e10) {
                if (f10 == Connect.ProviderMode.LIVE) {
                    this.f120810i.b().remove(CheckoutConstants.PaymentBrands.GOOGLEPAY);
                } else {
                    a((Transaction) null, (Exception) e10);
                }
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e11) {
                a((Transaction) null, (Exception) e11);
            }
        } else if (f10 == Connect.ProviderMode.LIVE) {
            this.f120810i.b().remove(CheckoutConstants.PaymentBrands.GOOGLEPAY);
        } else {
            a((Transaction) null, (Exception) new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, "GooglePayPaymentDataRequestJson is not set.")));
        }
    }

    /* access modifiers changed from: protected */
    public List<CompletableFuture<Void>> z() {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.add(CompletableFuture.runAsync(new C14120x0(this)));
        } else {
            this.f120810i.b().remove(CheckoutConstants.PaymentBrands.GOOGLEPAY);
        }
        if (E()) {
            arrayList.add(CompletableFuture.runAsync(new C14123y0(this)));
        } else {
            this.f120810i.b().remove(CheckoutConstants.PaymentBrands.SAMSUNGPAY);
        }
        return arrayList;
    }

    private void f(Transaction transaction) {
        String paymentBrand = transaction.getPaymentParams().getPaymentBrand();
        if (paymentBrand != null) {
            if (CheckoutConstants.PaymentBrands.b(paymentBrand) && LibraryHelper.isKlarnaAvailable) {
                c(transaction, (PaymentError) null);
                return;
            } else if (paymentBrand.equals(CheckoutConstants.PaymentBrands.BANCONTACT_LINK)) {
                c(transaction);
                return;
            } else if (CheckoutConstants.PaymentBrands.a(paymentBrand) && LibraryHelper.isAfterpayPacificAvailable) {
                b(transaction);
                return;
            } else if (paymentBrand.equals(CheckoutConstants.PaymentBrands.CASH_APP_PAY)) {
                e(transaction);
                return;
            } else if (paymentBrand.equals(CheckoutConstants.PaymentBrands.BLIK) && this.f120803b.requireCheckoutSettings().isShowOtpEnabled()) {
                d(transaction);
                return;
            }
        }
        if (transaction.getTransactionType() == TransactionType.ASYNC) {
            String redirectUrl = transaction.getRedirectUrl();
            CheckoutHelper.b(redirectUrl);
            g(redirectUrl);
            this.f120834u = transaction;
            return;
        }
        a(transaction);
    }

    /* access modifiers changed from: protected */
    public void b(TransactionResult transactionResult) {
        if (!transactionResult.isHandled()) {
            transactionResult.setHandled(true);
            Transaction transaction = transactionResult.getTransaction();
            PaymentError error = transactionResult.getError();
            if (error == null) {
                try {
                    f(transaction);
                } catch (Exception e10) {
                    a(transaction, e10);
                }
            } else if (error.getErrorCode() == ErrorCode.ERROR_CODE_THREEDS2_CANCELED) {
                o();
            } else {
                d(transaction, error);
            }
        }
    }

    private void d(Transaction transaction, PaymentError paymentError) {
        String paymentBrand = transaction.getPaymentParams().getPaymentBrand();
        if (CheckoutConstants.PaymentBrands.b(paymentBrand) && LibraryHelper.isKlarnaAvailable) {
            c(transaction, paymentError);
        } else if (CheckoutConstants.PaymentBrands.a(paymentBrand) && LibraryHelper.isAfterpayPacificAvailable) {
            b(transaction);
        } else if (!CheckoutConstants.PaymentBrands.BLIK.equals(paymentBrand) || !this.f120803b.requireCheckoutSettings().isShowOtpEnabled()) {
            b(transaction, paymentError);
        } else {
            d(transaction);
        }
    }

    /* access modifiers changed from: protected */
    public void b(Transaction transaction) {
        if (TextUtils.isEmpty(transaction.getBrandSpecificInfo().get(Transaction.AFTERPAY_PACIFIC_REDIRECT_URL)) || TextUtils.isEmpty(transaction.getBrandSpecificInfo().get("callbackUrl")) || TextUtils.isEmpty(transaction.getBrandSpecificInfo().get("failureCallbackUrl"))) {
            throw new PaymentException(PaymentError.getAfterpayPacificError("AfterpayPacific payments params are invalid."));
        }
        a((AfterpayPacificConfig) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getAfterpayPacificConfig()).orElseThrow(new A0()));
        this.f120819r.a(transaction.getBrandSpecificInfo().get(Transaction.AFTERPAY_PACIFIC_REDIRECT_URL));
    }

    private void c(Transaction transaction) {
        String str = transaction.getBrandSpecificInfo().get(Transaction.BANCONTACT_LINK_APP_SCHEME_URL_KEY);
        if (TextUtils.isEmpty(str)) {
            b(transaction, PaymentError.getBancontactLinkAppSchemeUrlMissingError());
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            this.f120834u = transaction;
        } catch (ActivityNotFoundException unused) {
            b(transaction, PaymentError.getBancontactLinkAppNotInstalledError());
        }
    }

    /* access modifiers changed from: protected */
    public void a(BrandsValidation brandsValidation) {
        if (brandsValidation != null) {
            try {
                this.f120810i.a(brandsValidation);
                S();
                this.f120804c.a(a(this.f120810i, brandsValidation));
                Q();
            } catch (Exception e10) {
                a((Transaction) null, e10);
            }
        } else {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_INTERNAL_ERROR, "BrandsValidation is null"));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(C14122y yVar, BrandsValidation brandsValidation) {
        if (this.f120805d == r.PAYMENT_BUTTON && !this.f120803b.requireCheckoutSettings().isBackButtonAvailable()) {
            return true;
        }
        if (yVar.d() != null && yVar.d().length > 0) {
            return false;
        }
        if (yVar.b().size() == 1 && this.f120809h != null) {
            return true;
        }
        if (this.f120803b.requireCheckoutSettings().getCardBrandsDisplayMode() != CheckoutCardBrandsDisplayMode.GROUPED || !yVar.c(brandsValidation)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(ImagesRequest imagesRequest) {
        ImageLoader.getInstance(this).a(imagesRequest);
        R();
    }

    private void a(AfterpayPacificConfig afterpayPacificConfig) {
        C8833b bVar;
        if (this.f120803b.requireCheckoutSettings().getProviderMode() == Connect.ProviderMode.LIVE) {
            bVar = C8833b.PRODUCTION;
        } else {
            bVar = C8833b.SANDBOX;
        }
        C8833b bVar2 = bVar;
        try {
            Afterpay.j(afterpayPacificConfig.getMinimumAmount(), afterpayPacificConfig.getMaximumAmount(), (String) Optional.ofNullable(this.f120803b.requireCheckoutInfo().getCurrencyCode()).orElseThrow(new B0()), afterpayPacificConfig.getLocale(), bVar2, afterpayPacificConfig.getConsumerLocale());
        } catch (Exception e10) {
            throw new PaymentException(PaymentError.getUnexpectedExceptionError(e10));
        }
    }

    /* access modifiers changed from: private */
    public void a(TransactionResult transactionResult) {
        if (transactionResult != null) {
            Transaction transaction = transactionResult.getTransaction();
            PaymentError error = transactionResult.getError();
            if (error != null) {
                b(transaction, error);
            } else {
                a(transaction);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(C8971l lVar) {
        try {
            this.f120810i.a((C8971l<Boolean>) lVar, this.f120803b.requireCheckoutSettings().getProviderMode());
        } catch (Exception e10) {
            a((Transaction) null, e10);
        }
    }

    /* access modifiers changed from: protected */
    public void a(PaymentsClient paymentsClient, String str, C8965f<Boolean> fVar) {
        GooglePayHelper.a(paymentsClient, C6381e.x(GooglePayHelper.a(str).toString()), fVar);
    }
}
