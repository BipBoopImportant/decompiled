package com.oppwa.mobile.connect.checkout.dialog;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.HashMap;
import java.util.Map;

public final class CheckoutActivity extends BaseServiceActivity {
    public static final String ACTION_ON_BEFORE_SUBMIT = "com.oppwa.mobile.connect.checkout.dialog.action.ACTION_ON_BEFORE_SUBMIT";
    public static final String CHECKOUT_PAYMENT_BUTTON_METHOD = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_PAYMENT_BUTTON_METHOD";
    public static final String CHECKOUT_RECEIVER = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_RECEIVER";
    public static final String CHECKOUT_RESULT_ERROR = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_ERROR";
    public static final String CHECKOUT_RESULT_RESOURCE_PATH = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_RESOURCE_PATH";
    public static final String CHECKOUT_RESULT_SETTINGS = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_SETTINGS";
    public static final String CHECKOUT_RESULT_TRANSACTION = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_TRANSACTION";
    public static final String CHECKOUT_SETTINGS = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_SETTINGS";
    public static final String EXTRA_CHECKOUT_ID = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_ID";
    public static final String EXTRA_GOOGLE_PAY_PAYMENT_DATA = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_GOOGLE_PAY_PAYMENT_DATA";
    public static final String EXTRA_ORDER_SUMMARY = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_ORDER_SUMMARY";
    public static final String EXTRA_PAYMENT_BRAND = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_PAYMENT_BRAND";
    public static final String EXTRA_SAMSUNG_PAY_PAYMENT_DATA = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_SAMSUNG_PAY_PAYMENT_DATA";
    public static final String EXTRA_SENDER_COMPONENT_NAME = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_SENDER_COMPONENT_NAME";
    public static final String EXTRA_THREEDS_WARNINGS = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_THREEDS_WARNINGS";
    public static final String EXTRA_TRANSACTION_ABORTED = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_TRANSACTION_ABORTED";
    public static final int RESULT_CANCELED = 101;
    public static final int RESULT_ERROR = 102;
    public static final int RESULT_OK = 100;

    private void T() {
        HashMap hashMap = new HashMap();
        Map<String, Integer> customLogos = this.f120803b.requireCheckoutSettings().getCustomLogos();
        if (!customLogos.isEmpty()) {
            for (Map.Entry next : customLogos.entrySet()) {
                Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), ((Integer) next.getValue()).intValue());
                if (decodeResource != null) {
                    hashMap.put((String) next.getKey(), decodeResource);
                }
            }
        }
        ImageCache.getInstance().a((Map<String, Bitmap>) hashMap);
    }

    private void U() {
        getWindow().setFlags(8192, 8192);
    }

    private void W() {
        CheckoutSettings requireCheckoutSettings = this.f120803b.requireCheckoutSettings();
        if (requireCheckoutSettings.getThemeResId() != 0) {
            setTheme(requireCheckoutSettings.getThemeResId());
        }
        String locale = requireCheckoutSettings.getLocale();
        if (locale != null) {
            CheckoutHelper.setLocale(getBaseContext(), locale);
        }
    }

    private void X() {
        Token token;
        if (this.f120810i.d() != null) {
            token = CheckoutHelper.a(this.f120809h, this.f120810i.d());
            if (token != null) {
                this.f120809h = token.getPaymentBrand();
            }
        } else {
            token = null;
        }
        a(this.f120809h, token);
    }

    private void Y() {
        if (this.f120804c.k()) {
            a(this.f120810i.b().size() == 1 ? this.f120810i.b().iterator().next() : "CARD", (Token) null);
        } else if (!this.f120810i.b().isEmpty()) {
            r();
        } else {
            throw new PaymentException(PaymentError.getNoAvailablePaymentMethodsError());
        }
    }

    private void b(Intent intent) {
        if (!intent.getBooleanExtra(EXTRA_TRANSACTION_ABORTED, false)) {
            String stringExtra = intent.getStringExtra(EXTRA_CHECKOUT_ID);
            if (!TextUtils.isEmpty(stringExtra)) {
                Logger.setCurrentCheckoutId(stringExtra);
                a(stringExtra);
                return;
            }
            throw new PaymentException(PaymentError.getPaymentParamsCheckoutIdInvalidError());
        }
        throw new PaymentException(PaymentError.getTransactionAbortedError());
    }

    /* access modifiers changed from: protected */
    public void R() {
        if (!this.f120807f && this.f120803b.getBrandsValidation() != null) {
            this.f120807f = true;
            a(this.f120810i);
            try {
                if (this.f120805d == r.CHECKOUT_UI) {
                    Y();
                } else {
                    X();
                }
            } catch (Exception e10) {
                a((Transaction) null, e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C14066f V() {
        return this.f120804c;
    }

    /* access modifiers changed from: protected */
    public Intent a(Transaction transaction, PaymentError paymentError) {
        Intent intent = new Intent();
        intent.putExtra(CHECKOUT_RESULT_SETTINGS, this.f120803b.getCheckoutSettings());
        intent.putExtra(CHECKOUT_RESULT_TRANSACTION, transaction);
        intent.putExtra(CHECKOUT_RESULT_ERROR, paymentError);
        if (this.f120803b.getCheckoutInfoLiveData().getValue() != null) {
            intent.putExtra(CHECKOUT_RESULT_RESOURCE_PATH, this.f120803b.getCheckoutInfoLiveData().getValue().getResourcePath());
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.checkOutdatedFiles(this);
        CheckoutSettings checkoutSettings = this.f120803b.getCheckoutSettings();
        if (checkoutSettings != null) {
            this.f120808g = (ComponentName) getIntent().getParcelableExtra(CHECKOUT_RECEIVER);
            String stringExtra = getIntent().getStringExtra(CHECKOUT_PAYMENT_BUTTON_METHOD);
            this.f120809h = stringExtra;
            this.f120805d = stringExtra == null ? r.CHECKOUT_UI : r.PAYMENT_BUTTON;
            if (checkoutSettings.isWindowSecurityEnabled()) {
                U();
            }
            setContentView(R.layout.opp_activity_checkout);
            this.f120804c = new C14066f(this);
            if (checkoutSettings.getKlarnaCountry() == null) {
                checkoutSettings.setKlarnaCountry(C14104s.a((Context) this));
            }
            a(checkoutSettings);
            W();
            CheckoutHelper.a((Context) this, checkoutSettings.getCheckoutId(), checkoutSettings.getProviderMode());
            this.f120813l = new C14053b0(this, checkoutSettings);
            T();
            if (bundle != null) {
                a(bundle);
            } else if (this.f120805d == r.CHECKOUT_UI) {
                q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent.getAction();
        try {
            if (getString(R.string.oppwa_scheme).equals(intent.getScheme())) {
                Logger.info("Handle redirect to :" + intent.getDataString());
                C();
            } else if (ACTION_ON_BEFORE_SUBMIT.equals(action)) {
                b(intent);
                OrderSummary orderSummary = (OrderSummary) intent.getParcelableExtra(EXTRA_ORDER_SUMMARY);
                String currencyCode = this.f120803b.requireCheckoutInfo().getCurrencyCode();
                if (CheckoutConstants.PaymentBrands.GOOGLEPAY.equals(this.f120812k.getPaymentBrand()) && orderSummary != null && currencyCode != null) {
                    this.f120806e = true;
                    a(orderSummary, currencyCode);
                } else if (CheckoutConstants.PaymentBrands.AFFIRM.equals(this.f120812k.getPaymentBrand())) {
                    u();
                } else if (!c(this.f120812k.getPaymentBrand()) || (!CheckoutConstants.PaymentBrands.AFTERPAY_PACIFIC.equals(this.f120812k.getPaymentBrand()) && !CheckoutConstants.PaymentBrands.ONEY.equals(this.f120812k.getPaymentBrand()))) {
                    x();
                } else {
                    this.f120806e = true;
                    d(this.f120812k.getPaymentBrand(), (Token) null);
                }
            }
        } catch (Exception e10) {
            a((Transaction) null, e10);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Transaction transaction = this.f120834u;
        if (transaction != null) {
            b(transaction, PaymentError.getAsyncCallbackFailedError("Transaction state is unknown, request payment status to get the actual state."));
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_PAYMENT_PARAMS", this.f120812k);
        bundle.putBoolean("com.oppwa.mobile.connect.checkout.dialog.STATE_IS_CHECKOUT_FRAGMENT_INITIATED", this.f120807f);
        bundle.putBoolean("com.oppwa.mobile.connect.checkout.dialog.STATE_IS_GOOGLE_PAY_TOKEN_BRAND", this.f120818q);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_ASYNC_TRANSACTION", this.f120834u);
    }

    private void a(Bundle bundle) {
        this.f120812k = (PaymentParams) bundle.getParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_PAYMENT_PARAMS");
        this.f120807f = bundle.getBoolean("com.oppwa.mobile.connect.checkout.dialog.STATE_IS_CHECKOUT_FRAGMENT_INITIATED");
        this.f120834u = (Transaction) bundle.getParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_ASYNC_TRANSACTION");
        this.f120818q = bundle.getBoolean("com.oppwa.mobile.connect.checkout.dialog.STATE_IS_GOOGLE_PAY_TOKEN_BRAND");
    }

    private static void a(CheckoutSettings checkoutSettings) {
        Logger.info("Checkout started:\n" + checkoutSettings);
    }

    private static void a(C14122y yVar) {
        Logger.info("Configured payment brands: " + yVar.b());
    }
}
