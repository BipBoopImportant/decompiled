package com.oppwa.mobile.connect.checkout.dialog;

import Ba.C6385i;
import Ba.C6386j;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.v;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.gson.Gson;
import com.google.gson.p;
import com.oppwa.mobile.connect.checkout.dialog.C14053b0;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay.CopyAndPayFragment;
import com.oppwa.mobile.connect.checkout.meta.AfterpayPacificActivityResultContract;
import com.oppwa.mobile.connect.checkout.meta.CheckoutMsdkUi;
import com.oppwa.mobile.connect.checkout.meta.OnBeforeSubmitCallback;
import com.oppwa.mobile.connect.checkout.meta.PaymentDetails;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.checkout.meta.SamsungPayConfig;
import com.oppwa.mobile.connect.checkout.meta.WpwlOptions;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.meta.UiComponentType;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentContainer;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.affirm.AffirmPaymentParams;
import com.oppwa.mobile.connect.payment.afterpaypacific.AfterpayPacificPaymentParams;
import com.oppwa.mobile.connect.payment.afterpaypacific.CashAppPayPaymentParams;
import com.oppwa.mobile.connect.payment.afterpaypacific.ClearpayPaymentParams;
import com.oppwa.mobile.connect.payment.amazonpay.AmazonPayConfig;
import com.oppwa.mobile.connect.payment.amazonpay.AmazonPayPaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.IdealPaymentParams;
import com.oppwa.mobile.connect.payment.card.BaseCardPaymentParams;
import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData;
import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams;
import com.oppwa.mobile.connect.payment.inicis.InicisPaymentParams;
import com.oppwa.mobile.connect.payment.klarna.KlarnaInlinePaymentParams;
import com.oppwa.mobile.connect.payment.processor.ProcessorActivityResult;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorResultContract;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayConfig;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivityResultContract;
import com.oppwa.mobile.connect.payment.samsungpay.SamsungPayPaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.FeatureSwitch;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import com.samsung.android.sdk.samsungpay.v2.SamsungPay;
import com.samsung.android.sdk.samsungpay.v2.StatusListener;
import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.PaymentManager;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import g.C5314c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import qE.C14953m;

public abstract class BaseActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    protected OppPaymentProvider f120802a;

    /* renamed from: b  reason: collision with root package name */
    protected CheckoutViewModel f120803b;

    /* renamed from: c  reason: collision with root package name */
    protected C14066f f120804c;

    /* renamed from: d  reason: collision with root package name */
    protected r f120805d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f120806e = true;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f120807f = false;

    /* renamed from: g  reason: collision with root package name */
    protected ComponentName f120808g;

    /* renamed from: h  reason: collision with root package name */
    protected String f120809h;

    /* renamed from: i  reason: collision with root package name */
    protected C14122y f120810i;

    /* renamed from: j  reason: collision with root package name */
    protected PaymentsClient f120811j;

    /* renamed from: k  reason: collision with root package name */
    protected PaymentParams f120812k;

    /* renamed from: l  reason: collision with root package name */
    protected C14053b0 f120813l;

    /* renamed from: m  reason: collision with root package name */
    protected GooglePayHelper f120814m = new GooglePayHelper();

    /* renamed from: n  reason: collision with root package name */
    protected PaymentError f120815n;

    /* renamed from: o  reason: collision with root package name */
    protected int f120816o;

    /* renamed from: p  reason: collision with root package name */
    private v f120817p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f120818q;

    /* renamed from: r  reason: collision with root package name */
    protected final C5314c<String> f120819r = registerForActivityResult(new AfterpayPacificActivityResultContract(), new E(this));

    /* renamed from: s  reason: collision with root package name */
    protected final C5314c<Transaction> f120820s = registerForActivityResult(new CashAppPayProcessorActivityResultContract(), new F(this));

    /* renamed from: t  reason: collision with root package name */
    protected final C5314c<Transaction> f120821t = registerForActivityResult(new AffirmProcessorResultContract(), new G(this));

    class a extends v {
        a(boolean z10) {
            super(z10);
        }

        public void handleOnBackPressed() {
            BaseActivity baseActivity = BaseActivity.this;
            if (baseActivity.f120806e) {
                if (!baseActivity.f120804c.j()) {
                    BaseActivity baseActivity2 = BaseActivity.this;
                    if (baseActivity2.f120807f) {
                        baseActivity2.f120804c.f();
                        return;
                    }
                }
                BaseActivity.this.o();
            }
        }
    }

    class b implements StatusListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SamsungPay f120823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120824b;

        b(SamsungPay samsungPay, String str) {
            this.f120823a = samsungPay;
            this.f120824b = str;
        }

        public void onFail(int i10, Bundle bundle) {
            BaseActivity.this.a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayCheckStatusError(i10, bundle)));
        }

        public void onSuccess(int i10, Bundle bundle) {
            if (i10 == 0) {
                BaseActivity.this.a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayCheckStatusError(i10, bundle)));
            } else if (i10 == 1) {
                int i11 = bundle.getInt("errorReason");
                if (i11 == -356) {
                    this.f120823a.activateSamsungPay();
                } else if (i11 == -357) {
                    this.f120823a.goToUpdatePage();
                }
            } else if (i10 == 2) {
                BaseActivity.this.h(this.f120824b);
            }
        }
    }

    class c implements PaymentManager.CustomSheetTransactionInfoListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PaymentManager f120826a;

        c(PaymentManager paymentManager) {
            this.f120826a = paymentManager;
        }

        public void onCardInfoUpdated(CardInfo cardInfo, CustomSheet customSheet) {
            BaseActivity.this.a(this.f120826a, cardInfo, customSheet);
        }

        public void onFailure(int i10, Bundle bundle) {
            BaseActivity.this.a(i10, bundle);
        }

        public void onSuccess(CustomSheetPaymentInfo customSheetPaymentInfo, String str, Bundle bundle) {
            BaseActivity.this.a(customSheetPaymentInfo, str);
        }
    }

    /* access modifiers changed from: private */
    public void b(String str, Bundle bundle) {
        Transaction transaction = (Transaction) bundle.getParcelable(BaseFragment.TRANSACTION_RESULT_KEY);
        PaymentError paymentError = (PaymentError) bundle.getParcelable(BaseFragment.PAYMENT_ERROR_RESULT_KEY);
        if (paymentError != null) {
            b(transaction, paymentError);
        } else if (transaction != null) {
            a(transaction);
        } else {
            o();
        }
    }

    /* access modifiers changed from: private */
    public void c(String str, Bundle bundle) {
        p();
        try {
            x();
        } catch (Exception e10) {
            a((Transaction) null, e10);
        }
    }

    /* access modifiers changed from: private */
    public void e(String str, Bundle bundle) {
        Optional.ofNullable(bundle.getParcelable("PAYMENT_PARAMS_RESULT_KEY")).ifPresent(new C14073h0(this, bundle));
    }

    /* access modifiers changed from: private */
    public void f(String str, Bundle bundle) {
        Optional.ofNullable(bundle.getString("PAYMENT_METHOD_RESULT_KEY")).ifPresent(new X(this, bundle));
    }

    private boolean i() {
        return this.f120804c.g() && (this.f120804c.b() instanceof BlikPaymentInfoFragment);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException j() {
        return new PaymentException(PaymentError.getAfterpayPacificError("Missing transaction."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException k() {
        return new PaymentException(PaymentError.getAfterpayPacificError("Missing callback url."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException l() {
        return new PaymentException(PaymentError.getCashAppPayError("The Cash App Pay configuration is missing."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException m() {
        return new PaymentException(PaymentError.getAmazonPayError("The Amazon Pay configuration is missing."));
    }

    private void s() {
        C5187o b10 = this.f120804c.b();
        if (this.f120805d == r.PAYMENT_BUTTON && !this.f120804c.k() && !(b10 instanceof PaymentMethodSelectionFragment)) {
            r();
        }
    }

    private void t() {
        UiComponentType uiComponentType = UiComponentType.PROCESSING;
        String a10 = C14057c0.a(uiComponentType, this.f120803b.requireCheckoutSettings());
        if (a10 != null) {
            this.f120804c.a((Class<? extends C5187o>) uiComponentType.getContainerClass(), b(a10));
        } else {
            this.f120804c.a((C5187o) new ProcessingFragment());
        }
    }

    /* access modifiers changed from: protected */
    public abstract Intent a(Transaction transaction, PaymentError paymentError);

    /* access modifiers changed from: protected */
    public void d(String str, Bundle bundle) {
        Optional.ofNullable((PaymentParams) bundle.getParcelable(PaymentDetailsUiComponentContainer.RESULT_PAYMENT_PARAMS)).ifPresent(new C14076i0(this, bundle));
    }

    /* access modifiers changed from: protected */
    public abstract Connect.ProviderMode f();

    /* access modifiers changed from: protected */
    public void g(String str, Bundle bundle) {
        Optional.ofNullable((PaymentMethod) bundle.getParcelable(PaymentMethodSelectionUiComponentContainer.RESULT_PAYMENT_METHOD)).ifPresent(new C14088m0(this));
    }

    /* access modifiers changed from: protected */
    public void h(String str, Bundle bundle) {
        if (bundle.containsKey(UiComponentContainer.RESULT_CANCELLED)) {
            o();
        } else {
            Optional.ofNullable((PaymentError) bundle.getParcelable(UiComponentContainer.RESULT_ERROR)).ifPresent(new H(this));
        }
    }

    /* access modifiers changed from: protected */
    public void n() {
        a((C6385i) null, (CustomSheetPaymentInfo) null);
    }

    /* access modifiers changed from: protected */
    public void o() {
        Logger.warning("Checkout was canceled");
        Logger.sendLogs();
        a((int) CheckoutActivity.RESULT_CANCELED, (Transaction) null, (PaymentError) null);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 700) {
            a(i11 == -1);
        } else if (i10 == 777) {
            try {
                a(i11, intent);
            } catch (Exception e10) {
                a((Transaction) null, e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CheckoutViewModel checkoutViewModel = (CheckoutViewModel) new i0((k0) this).a(CheckoutViewModel.class);
        this.f120803b = checkoutViewModel;
        if (checkoutViewModel.getCheckoutSettings() == null) {
            Logger.error("checkout setting is null");
            b((Transaction) null, PaymentError.getCheckoutSettingsMissedError());
            return;
        }
        a();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f120817p = new a(true);
        this.f120803b.getPaymentDetailsLiveData().observe(this, new N(this));
        getOnBackPressedDispatcher().i(this, this.f120817p);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f120817p.remove();
    }

    /* access modifiers changed from: protected */
    public void p() {
        t();
    }

    /* access modifiers changed from: protected */
    public void q() {
        t();
    }

    /* access modifiers changed from: protected */
    public void r() {
        UiComponentType uiComponentType = UiComponentType.PAYMENT_METHOD_SELECTION;
        String a10 = C14057c0.a(uiComponentType, this.f120803b.requireCheckoutSettings());
        if (a10 != null) {
            Bundle b10 = b(a10);
            b10.putParcelableArray(PaymentMethodSelectionUiComponentContainer.ARG_PAYMENT_METHODS, e());
            this.f120804c.a((Class<? extends C5187o>) uiComponentType.getContainerClass(), b10);
            return;
        }
        this.f120804c.a((C5187o) PaymentMethodSelectionFragment.newInstance(this.f120810i));
    }

    /* access modifiers changed from: protected */
    public void u() {
        try {
            this.f120821t.a(new Transaction(this.f120812k));
        } catch (PaymentException e10) {
            Logger.error((Throwable) e10);
            b((Transaction) null, e10.getError());
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        if (this.f120811j == null) {
            this.f120811j = GooglePayHelper.getPaymentsClient(this, this.f120803b.requireCheckoutSettings().getProviderMode());
        }
        String googlePayPaymentDataRequestJson = this.f120803b.requireCheckoutSettings().getGooglePayPaymentDataRequestJson();
        C6386j x10 = googlePayPaymentDataRequestJson != null ? C6386j.x(googlePayPaymentDataRequestJson) : null;
        if (x10 != null) {
            com.google.android.gms.wallet.a.c(this.f120811j.E(x10), this, 777);
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, "Payment data request is invalid."));
    }

    /* access modifiers changed from: protected */
    public abstract void x();

    private void w() {
        Connect.ProviderMode providerMode = this.f120803b.requireCheckoutSettings().getProviderMode();
        String g10 = g();
        if (g10 != null) {
            SamsungPay samsungPay = SamsungPayHelper.getSamsungPay(this, g());
            samsungPay.getSamsungPayStatus(new b(samsungPay, g10));
        } else if (providerMode == Connect.ProviderMode.TEST) {
            a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayServiceIdError()));
        }
    }

    private PaymentError d() {
        return new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, "Google Pay payment data is empty.");
    }

    private PaymentMethod[] e() {
        Token[] d10 = this.f120810i.d();
        String[] strArr = (String[]) this.f120810i.b().toArray(new String[0]);
        LinkedList linkedList = new LinkedList();
        Bundle labels = this.f120803b.requireBrandsValidation().getLabels();
        if (d10 != null) {
            for (Token token : d10) {
                linkedList.add(a(token.getPaymentBrand(), token, labels));
            }
        }
        for (String a10 : strArr) {
            linkedList.add(a(a10, (Token) null, labels));
        }
        return (PaymentMethod[]) linkedList.toArray(new PaymentMethod[0]);
    }

    /* access modifiers changed from: protected */
    public void g(String str) {
        Utils.showCustomTabs(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean c(String str) {
        if (str == null) {
            return false;
        }
        return Optional.ofNullable(this.f120803b.requireCheckoutSettings().getWpwlOptions()).map(new C14067f0(str)).isPresent();
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        return this.f120803b.requireBrandsValidation().isCardBrand(str);
    }

    /* access modifiers changed from: protected */
    public boolean f(String str) {
        if (CheckoutConstants.PaymentBrands.RATEPAY_INVOICE.equals(str) && !this.f120803b.requireCheckoutSettings().isShowBirthDate()) {
            return true;
        }
        if (CheckoutConstants.PaymentBrands.ACI_INSTANTPAY.equals(str)) {
            return !CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY.equals((String) Optional.ofNullable(this.f120803b.requireCheckoutInfo().getCountryCode()).orElse(this.f120803b.requireCheckoutSettings().getAciInstantPayCountry()));
        }
        if (CheckoutConstants.PaymentBrands.BLIK.equals(str) && !this.f120803b.requireCheckoutSettings().isShowOtpEnabled()) {
            return true;
        }
        if (!CheckoutConstants.PaymentBrands.IDEAL.equals(str) || TextUtils.isEmpty(this.f120803b.requireCheckoutSettings().getIdealBankAccountCountry())) {
            return CheckoutConstants.PaymentBrands.b(str);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return (String) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getSamsungPayConfig()).map(new I()).orElse((Object) null);
    }

    private void a() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.R1(BaseFragment.class.getName(), this, new V(this));
        supportFragmentManager.R1(PaymentMethodSelectionFragment.class.getName(), this, new W(this));
        supportFragmentManager.R1(OrderSummaryFragment.class.getName(), this, new Y(this));
        supportFragmentManager.R1(PaymentInfoFragment.class.getName(), this, new Z(this));
        if (this.f120803b.requireCheckoutSettings().getUiComponentsConfig() != null || FeatureSwitch.isActivated(FeatureSwitch.DEFAULT_UI_COMPONENTS)) {
            a(supportFragmentManager);
        }
    }

    private boolean h() {
        return ((Boolean) Optional.ofNullable(this.f120812k).map(new A()).map(new L(CheckoutConstants.PaymentBrands.AFFIRM)).orElse(Boolean.FALSE)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void d(String str, Token token) {
        s();
        this.f120804c.a((Class<? extends C5187o>) CopyAndPayFragment.class, a(str, token != null));
    }

    private CustomSheetPaymentInfo c() {
        return (CustomSheetPaymentInfo) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getSamsungPayConfig()).map(new C14070g0()).orElse((Object) null);
    }

    /* access modifiers changed from: protected */
    public void b(Transaction transaction, PaymentError paymentError) {
        this.f120815n = paymentError;
        if (this.f120803b.getCheckoutSettings() != null) {
            Logger.error(paymentError.getErrorCode() + " - " + paymentError.getErrorMessage());
            Logger.sendLogs();
        }
        a((int) CheckoutActivity.RESULT_ERROR, transaction, paymentError);
    }

    private void c(String str, Token token) {
        PaymentParams paymentParams;
        String checkoutId = this.f120803b.requireCheckoutSettings().getCheckoutId();
        if (token != null) {
            paymentParams = new TokenPaymentParams(checkoutId, token.getTokenId(), str);
        } else {
            paymentParams = b(checkoutId, str);
        }
        a(paymentParams, token != null);
    }

    /* access modifiers changed from: private */
    public void h(String str) {
        PaymentManager paymentManager = SamsungPayHelper.getPaymentManager(this, str);
        CustomSheetPaymentInfo c10 = c();
        if (c10 == null) {
            b((Transaction) null, PaymentError.getSamsungPayCustomSheetPaymentInfoError());
        } else {
            paymentManager.startInAppPayWithCustomSheet(c10, new c(paymentManager));
        }
    }

    private void b(C6385i iVar) {
        String str;
        String U10 = iVar.U();
        if (U10 == null) {
            str = iVar.x().B();
        } else {
            str = null;
            try {
                str = (String) Optional.ofNullable((GooglePayPaymentData) new Gson().n(U10, GooglePayPaymentData.class)).map(new Q()).map(new S()).map(new T()).orElse((Object) null);
            } catch (p e10) {
                Logger.error(e10.getMessage() != null ? e10.getMessage() : "Failed to parse Google Pay response json.");
            }
        }
        if ("MASTERCARD".equals(str)) {
            str = "MASTER";
        }
        this.f120803b.a(str);
    }

    private void e(String str) {
        c(str, (Token) null);
    }

    private void a(FragmentManager fragmentManager) {
        fragmentManager.R1(UiComponentContainer.getRequestKey(), this, new J(this));
        fragmentManager.R1(PaymentMethodSelectionUiComponentContainer.getRequestKey(), this, new K(this));
        fragmentManager.R1(PaymentDetailsUiComponentContainer.getRequestKey(), this, new M(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle, String str) {
        a(str, (Token) bundle.getParcelable("TOKEN_RESULT_KEY"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle, Object obj) {
        a((PaymentParams) obj, bundle.getBoolean("TOKENIZED_RESULT_KEY", false));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PaymentError paymentError) {
        b((Transaction) null, paymentError);
    }

    /* access modifiers changed from: protected */
    public void b(ProcessorActivityResult processorActivityResult) {
        Transaction transaction = processorActivityResult.getTransaction();
        if (processorActivityResult.getPaymentError() != null) {
            b(processorActivityResult.getTransaction(), processorActivityResult.getPaymentError());
        } else if (transaction == null) {
            b((Transaction) null, PaymentError.getCashAppPayError("Transaction is null"));
        } else {
            a(transaction);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle, PaymentParams paymentParams) {
        a(paymentParams, bundle.containsKey(PaymentDetailsUiComponentContainer.RESULT_TOKENIZED));
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction) {
        Logger.sendLogs();
        a(100, transaction, (PaymentError) null);
    }

    /* access modifiers changed from: protected */
    public void a(PaymentParams paymentParams, boolean z10) {
        this.f120812k = paymentParams;
        String paymentBrand = paymentParams.getPaymentBrand();
        if (this.f120804c.b() instanceof KlarnaInlinePaymentInfoFragment) {
            try {
                x();
            } catch (Exception e10) {
                a((Transaction) null, e10);
            }
        } else if (this.f120813l.a(paymentBrand, z10)) {
            this.f120813l.a((AppCompatActivity) this, (C14053b0.a) new U(this));
        } else {
            if (!i()) {
                p();
            }
            n();
        }
    }

    private Bundle b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(UiComponentContainer.ARG_UI_COMPONENT_CLASS_NAME, str);
        bundle.putParcelable("checkoutSettings", this.f120803b.requireCheckoutSettings());
        Optional.ofNullable(this.f120803b.getCheckoutInfoLiveData().getValue()).ifPresent(new P(bundle));
        return bundle;
    }

    private Optional<SamsungPayConfig.CardInfoUpdateListener> b() {
        return Optional.ofNullable(this.f120803b.requireCheckoutSettings().getSamsungPayConfig()).map(new D());
    }

    /* access modifiers changed from: protected */
    public void a(PaymentMethod paymentMethod) {
        a(paymentMethod.getBrand(), paymentMethod.getToken());
    }

    /* access modifiers changed from: protected */
    public void a(String str, Token token) {
        try {
            if (CheckoutMsdkUi.HYBRID.equals(this.f120803b.requireCheckoutInfo().getMsdkUi()) && d(str)) {
                d(str, token);
            } else if (CheckoutConstants.PaymentBrands.GOOGLEPAY.equals(str)) {
                v();
            } else if (CheckoutConstants.PaymentBrands.GOOGLEPAYTKN.equals(str)) {
                this.f120818q = true;
                v();
            } else if (CheckoutConstants.PaymentBrands.SAMSUNGPAY.equals(str)) {
                w();
            } else if (c(str)) {
                e(str);
            } else if (f(str)) {
                b(str, token);
            } else {
                UiComponentType a10 = C14057c0.a(str, token, d(str));
                String str2 = (String) Optional.ofNullable(a10).map(new C14064e0(this)).orElse((Object) null);
                if (str2 != null) {
                    a((Class<? extends C5187o>) a10.getContainerClass(), str2, str, token);
                    return;
                }
                PaymentInfoFragment a11 = C14119x.a(str, d(str));
                if (a11 != null) {
                    a((C5187o) a11, str, token, (Transaction) null);
                } else {
                    b(str, token);
                }
            }
        } catch (Exception e10) {
            a((Transaction) null, e10);
        }
    }

    private void b(String str, Token token) {
        c(str, token);
    }

    private PaymentParams b(String str, String str2) {
        if (CheckoutConstants.PaymentBrands.PAYTRAIL.equals(str2)) {
            return BankAccountPaymentParams.createPaytrailPaymentParams(str);
        }
        if (CheckoutConstants.PaymentBrands.b(str2) && LibraryHelper.isKlarnaAvailable) {
            return new KlarnaInlinePaymentParams(str, str2);
        }
        if (CheckoutConstants.PaymentBrands.INICIS.equals(str2)) {
            return new InicisPaymentParams(str, str2);
        }
        if (!CheckoutConstants.PaymentBrands.a(str2) || !LibraryHelper.isAfterpayPacificAvailable) {
            if (CheckoutConstants.PaymentBrands.CASH_APP_PAY.equals(str2)) {
                return new CashAppPayPaymentParams(str, (CashAppPayConfig) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getBrandConfig()).map(new C14091n0()).orElseThrow(new C14094o0()));
            }
            if (CheckoutConstants.PaymentBrands.IDEAL.equals(str2)) {
                return BankAccountPaymentParams.createIdealTwoPaymentParams(str, (String) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getIdealBankAccountCountry()).orElse(IdealPaymentParams.DEFAULT_COUNTRY));
            }
            if (CheckoutConstants.PaymentBrands.AFFIRM.equals(str2)) {
                return new AffirmPaymentParams(str, this.f120803b.requireCheckoutSettings().getProviderMode());
            }
            if (CheckoutConstants.PaymentBrands.AMAZONPAY.equals(str2)) {
                return new AmazonPayPaymentParams(str, (AmazonPayConfig) Optional.ofNullable(this.f120803b.requireCheckoutSettings().getBrandConfig()).map(new B()).orElseThrow(new C()));
            }
            return new PaymentParams(str, str2);
        } else if (CheckoutConstants.PaymentBrands.CLEARPAY.equals(str2)) {
            return new ClearpayPaymentParams(str);
        } else {
            return new AfterpayPacificPaymentParams(str);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(UiComponentType uiComponentType) {
        return C14057c0.a(uiComponentType, this.f120803b.requireCheckoutSettings());
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10) {
        if (z10) {
            C14125z zVar = new C14125z(this.f120812k);
            zVar.a();
            this.f120812k = zVar.b();
            if (!i()) {
                p();
            }
            n();
        } else if (!this.f120804c.g()) {
            o();
        }
    }

    /* access modifiers changed from: protected */
    public void a(C6385i iVar) {
        a(iVar, (CustomSheetPaymentInfo) null);
    }

    /* access modifiers changed from: protected */
    public void a(CustomSheetPaymentInfo customSheetPaymentInfo) {
        a((C6385i) null, customSheetPaymentInfo);
    }

    private void a(C6385i iVar, CustomSheetPaymentInfo customSheetPaymentInfo) {
        this.f120806e = false;
        List<C14953m> a10 = a(this.f120812k);
        OnBeforeSubmitCallback onBeforeSubmitCallback = this.f120803b.requireCheckoutSettings().getOnBeforeSubmitCallback();
        if (onBeforeSubmitCallback != null) {
            a(onBeforeSubmitCallback, iVar, customSheetPaymentInfo, a10);
        } else if (this.f120808g != null) {
            a(iVar, customSheetPaymentInfo, a10);
        } else if (h()) {
            u();
        } else {
            try {
                x();
            } catch (Exception e10) {
                a((Transaction) null, e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(PaymentDetails paymentDetails) {
        try {
            if (!paymentDetails.isCanceled()) {
                String checkoutId = paymentDetails.getCheckoutId();
                if (!TextUtils.isEmpty(checkoutId)) {
                    Logger.setCurrentCheckoutId(checkoutId);
                    a(checkoutId);
                }
                OrderSummary orderSummary = paymentDetails.getOrderSummary();
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
            } else {
                throw new PaymentException(PaymentError.getTransactionAbortedError());
            }
        } catch (Exception e10) {
            a((Transaction) null, e10);
        }
    }

    /* access modifiers changed from: protected */
    public List<C14953m> a(PaymentParams paymentParams) {
        if (!LibraryHelper.isThreeDS2Available) {
            return null;
        }
        if (!(paymentParams instanceof BaseCardPaymentParams) && !(paymentParams instanceof GooglePayPaymentParams)) {
            return null;
        }
        try {
            return this.f120802a.getThreeDS2Warnings();
        } catch (PaymentException e10) {
            Logger.error("CheckoutUI", "Failed to get ThreeDS warnings.", e10);
            return null;
        }
    }

    private void a(int i10, Intent intent) {
        if (i10 != -1) {
            if (i10 == 0) {
                o();
            } else if (i10 == 1) {
                throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, a(intent)));
            }
        } else if (intent != null) {
            C6385i B10 = C6385i.B(intent);
            if (B10 != null) {
                p();
                b(B10);
                this.f120812k = CheckoutHelper.a(this.f120803b.requireCheckoutSettings().getCheckoutId(), B10, this.f120803b.b(), this.f120803b.requireCheckoutSettings().getGooglePaySubmit(), this.f120818q);
                a(B10);
                return;
            }
            throw new PaymentException(d());
        } else {
            throw new PaymentException(d());
        }
    }

    private String a(Intent intent) {
        Status a10 = com.google.android.gms.wallet.a.a(intent);
        if (a10 == null || a10.J() == null) {
            return "Google Pay error with no status message";
        }
        return a10.J();
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        String str;
        Logger.info("AfterpayPacific result code: " + i10);
        Transaction transaction = null;
        try {
            Transaction transaction2 = (Transaction) Optional.ofNullable(this.f120803b.getTransactionResultLiveData().getValue()).map(new C14079j0()).orElseThrow(new C14082k0());
            if (i10 == -1) {
                try {
                    str = transaction2.getBrandSpecificInfo().get("callbackUrl");
                } catch (PaymentException e10) {
                    e = e10;
                    transaction = transaction2;
                    b(transaction, e.getError());
                }
            } else {
                str = transaction2.getBrandSpecificInfo().get("failureCallbackUrl");
            }
            this.f120803b.sendAfterpayPacificCallback((String) Optional.ofNullable(str).orElseThrow(new C14085l0()), CheckoutHelper.getShopperResultUrl(), transaction2);
        } catch (PaymentException e11) {
            e = e11;
            b(transaction, e.getError());
        }
    }

    /* access modifiers changed from: private */
    public void a(PaymentManager paymentManager, CardInfo cardInfo, CustomSheet customSheet) {
        try {
            b().ifPresent(new O(cardInfo, customSheet));
            paymentManager.updateSheet(customSheet);
        } catch (Exception e10) {
            a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayCardInfoUpdatedError(e10)));
        }
    }

    /* access modifiers changed from: private */
    public void a(CustomSheetPaymentInfo customSheetPaymentInfo, String str) {
        try {
            Logger.info("SamsungPay", "PaymentCredential: " + str);
            p();
            this.f120812k = new SamsungPayPaymentParams(this.f120803b.requireCheckoutSettings().getCheckoutId(), str);
            a(customSheetPaymentInfo);
        } catch (Exception unused) {
            a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayCustomSheetPaymentInfoError()));
        }
    }

    /* access modifiers changed from: private */
    public void a(int i10, Bundle bundle) {
        if (i10 == -7) {
            o();
        } else {
            a((Transaction) null, (Exception) new PaymentException(PaymentError.getSamsungPayTokenError(i10, bundle)));
        }
    }

    /* access modifiers changed from: protected */
    public void a(ProcessorActivityResult processorActivityResult) {
        if (processorActivityResult.getPaymentError() != null) {
            b(processorActivityResult.getTransaction(), processorActivityResult.getPaymentError());
            return;
        }
        Transaction transaction = processorActivityResult.getTransaction();
        if (transaction == null) {
            b((Transaction) null, PaymentError.getAffirmError("Transaction is null."));
            return;
        }
        this.f120812k = transaction.getPaymentParams();
        try {
            x();
        } catch (PaymentException e10) {
            Logger.error((Throwable) e10);
            b(transaction, e10.getError());
        }
    }

    private PaymentMethod a(String str, Token token, Bundle bundle) {
        return new PaymentMethod.Builder(str, a(str, bundle)).setToken(token).setCard(this.f120803b.requireBrandsValidation().isCardBrand(str)).build();
    }

    private String a(String str, Bundle bundle) {
        int c10 = C14069g.c(this, str);
        if (c10 != 0) {
            return getString(c10);
        }
        String string = bundle.getString(str);
        return TextUtils.isEmpty(string) ? Utils.formatPaymentBrandString(str) : string;
    }

    /* access modifiers changed from: protected */
    public void a(C5187o oVar, String str, Token token, Transaction transaction) {
        s();
        oVar.setArguments(a(str, token, transaction, f()));
        this.f120804c.a(oVar);
    }

    private void a(Class<? extends C5187o> cls, String str, String str2, Token token) {
        s();
        this.f120804c.a(cls, a(str, str2, token));
    }

    private Bundle a(String str, String str2, Token token) {
        Bundle b10 = b(str);
        b10.putParcelable("brandsValidation", this.f120803b.requireBrandsValidation());
        b10.putString(PaymentDetailsUiComponentContainer.ARG_PAYMENT_BRAND, str2);
        b10.putParcelable(PaymentDetailsUiComponentContainer.ARG_PAYMENT_TOKEN, token);
        b10.putBoolean(PaymentDetailsUiComponentContainer.ARG_SKIP_PAYMENT_METHOD_SELECTION, this.f120804c.k());
        return b10;
    }

    /* access modifiers changed from: protected */
    public void a(OrderSummary orderSummary, String str) {
        this.f120804c.a((C5187o) OrderSummaryFragment.newInstance(orderSummary, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ WpwlOptions a(String str, Map map) {
        return (WpwlOptions) map.get(str);
    }

    /* access modifiers changed from: protected */
    public void a(Transaction transaction, Exception exc) {
        PaymentError paymentError;
        if (exc instanceof PaymentException) {
            paymentError = ((PaymentException) exc).getError();
        } else {
            paymentError = PaymentError.getUnexpectedExceptionError(exc);
        }
        b(transaction, paymentError);
    }

    private void a(OnBeforeSubmitCallback onBeforeSubmitCallback, C6385i iVar, CustomSheetPaymentInfo customSheetPaymentInfo, List<C14953m> list) {
        this.f120803b.onBeforeSubmit(onBeforeSubmitCallback, CheckoutHelper.a(this.f120812k.getCheckoutId(), this.f120812k.getPaymentBrand(), iVar, customSheetPaymentInfo, list));
    }

    private void a(C6385i iVar, CustomSheetPaymentInfo customSheetPaymentInfo, List<C14953m> list) {
        sendBroadcast(CheckoutHelper.a(this, this.f120808g, this.f120812k, iVar, customSheetPaymentInfo, list));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        String checkoutId = this.f120812k.getCheckoutId();
        String resourcePath = this.f120803b.requireCheckoutInfo().getResourcePath();
        if (!str.equals(checkoutId)) {
            this.f120812k.setCheckoutId(str);
            this.f120803b.requireCheckoutSettings().setCheckoutId(str);
            if (resourcePath != null) {
                this.f120803b.requireCheckoutInfo().setResourcePath(resourcePath.replace(checkoutId, str));
            }
            a(checkoutId, str);
        }
    }

    private static void a(String str, String str2) {
        Logger.info("Checkout id was changed:\nNew checkout id: " + str2 + "\nOld checkout id: " + str);
    }

    private Bundle a(String str, Token token, Transaction transaction, Connect.ProviderMode providerMode) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_SETTINGS", this.f120803b.requireCheckoutSettings());
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_INFO", this.f120803b.requireCheckoutInfo());
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_BRANDS_VALIDATION", this.f120803b.requireBrandsValidation());
        bundle.putString(CheckoutActivity.EXTRA_PAYMENT_BRAND, str);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_TOKEN", token);
        bundle.putBoolean("com.oppwa.mobile.connect.checkout.dialog.EXTRA_SKIP_PAYMENT_METHOD_SELECTION_SCREEN", this.f120804c.k());
        if (providerMode != null) {
            bundle.putString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PROVIDER_MODE", providerMode.name());
        }
        if (transaction != null) {
            bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_TRANSACTION", transaction);
        }
        return bundle;
    }

    private Bundle a(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("checkoutSettings", this.f120803b.requireCheckoutSettings());
        bundle.putString(CopyAndPayFragment.BRAND_KEY, str);
        bundle.putBoolean(CopyAndPayFragment.IS_PAYMENT_SELECTION_SKIPPED_KEY, this.f120804c.k());
        if (d(str)) {
            bundle.putParcelable("brandsValidation", this.f120803b.requireBrandsValidation());
            bundle.putStringArray(CopyAndPayFragment.CARD_BRANDS_KEY, this.f120810i.b(this.f120803b.requireBrandsValidation()));
            bundle.putBoolean(CopyAndPayFragment.IS_TOKEN_KEY, z10);
        }
        return bundle;
    }

    private void a(int i10, Transaction transaction, PaymentError paymentError) {
        this.f120816o = i10;
        setResult(i10, a(transaction, paymentError));
        C14066f fVar = this.f120804c;
        if (fVar != null) {
            fVar.a();
        } else {
            finish();
        }
    }
}
