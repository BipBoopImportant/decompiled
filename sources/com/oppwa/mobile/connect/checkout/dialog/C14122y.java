package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.b;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.meta.AfterpayPacificConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.meta.WpwlOptions;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandInfo;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import xa.C8971l;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.y  reason: case insensitive filesystem */
class C14122y implements Parcelable {
    public static final Parcelable.Creator<C14122y> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f121354a;

    /* renamed from: b  reason: collision with root package name */
    private Token[] f121355b;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.y$a */
    class a implements Parcelable.Creator<C14122y> {
        a() {
        }

        /* renamed from: a */
        public C14122y createFromParcel(Parcel parcel) {
            return new C14122y(parcel, (a) null);
        }

        /* renamed from: a */
        public C14122y[] newArray(int i10) {
            return new C14122y[i10];
        }
    }

    /* synthetic */ C14122y(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, Connect.ProviderMode providerMode) {
        if ((!this.f121354a.contains(CheckoutConstants.PaymentBrands.KLARNA_INVOICE) && !this.f121354a.contains(CheckoutConstants.PaymentBrands.KLARNA_INSTALLMENTS)) || C14104s.a(str)) {
            return;
        }
        if (providerMode != Connect.ProviderMode.TEST) {
            this.f121354a.remove(CheckoutConstants.PaymentBrands.KLARNA_INVOICE);
            this.f121354a.remove(CheckoutConstants.PaymentBrands.KLARNA_INSTALLMENTS);
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "Klarna country is not supported."));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14122y yVar = (C14122y) obj;
        return Utils.compare(this.f121354a, yVar.f121354a) && Arrays.equals(this.f121355b, yVar.d());
    }

    public int hashCode() {
        int hashCode = this.f121354a.hashCode();
        return hashCode + (hashCode * 31) + Arrays.hashCode(this.f121355b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringArray(c());
        parcel.writeTypedArray(this.f121355b, i10);
    }

    C14122y(Set<String> set, Token[] tokenArr) {
        this.f121354a = set == null ? new LinkedHashSet<>() : set;
        this.f121355b = tokenArr;
    }

    /* access modifiers changed from: package-private */
    public Set<String> b() {
        return this.f121354a;
    }

    /* access modifiers changed from: package-private */
    public String[] c() {
        return (String[]) this.f121354a.toArray(new String[0]);
    }

    /* access modifiers changed from: package-private */
    public Token[] d() {
        return this.f121355b;
    }

    /* access modifiers changed from: package-private */
    public String[] b(BrandsValidation brandsValidation) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String next : this.f121354a) {
            if (brandsValidation.isCardBrand(next)) {
                linkedHashSet.add(next);
            }
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    /* access modifiers changed from: package-private */
    public boolean c(BrandsValidation brandsValidation) {
        Token[] tokenArr = this.f121355b;
        return (tokenArr == null || tokenArr.length == 0) && !d(brandsValidation);
    }

    /* access modifiers changed from: protected */
    public void d(CheckoutSettings checkoutSettings) {
        String b10;
        if (!this.f121354a.contains(CheckoutConstants.PaymentBrands.CASH_APP_PAY) || (b10 = b(checkoutSettings)) == null) {
            return;
        }
        if (checkoutSettings.getProviderMode() == Connect.ProviderMode.LIVE) {
            Logger.error(b10);
            this.f121354a.remove(CheckoutConstants.PaymentBrands.CASH_APP_PAY);
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, b10));
    }

    /* access modifiers changed from: protected */
    public void c(CheckoutSettings checkoutSettings) {
        String a10;
        if (!this.f121354a.contains(CheckoutConstants.PaymentBrands.AMAZONPAY) || (a10 = a(checkoutSettings)) == null) {
            return;
        }
        if (checkoutSettings.getProviderMode() == Connect.ProviderMode.LIVE) {
            Logger.error(a10);
            this.f121354a.remove(CheckoutConstants.PaymentBrands.AMAZONPAY);
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, a10));
    }

    private C14122y(Parcel parcel) {
        this.f121354a = new LinkedHashSet(Arrays.asList(parcel.createStringArray()));
        this.f121355b = (Token[]) parcel.createTypedArray(Token.CREATOR);
    }

    private static String b(CheckoutSettings checkoutSettings) {
        String str;
        String str2;
        if (checkoutSettings.getBrandConfig() == null || checkoutSettings.getBrandConfig().getCashAppPayConfig() == null) {
            str = "The PaymentBrandConfig must be set in CheckoutSettings in order to use CASH_APP_PAY payment method.";
        } else {
            str = null;
        }
        if (LibraryHelper.isCashAppPayAvailable && LibraryHelper.isAfterpayPacificAvailable) {
            return str;
        }
        if (str != null) {
            str2 = str + "\n";
        } else {
            str2 = "";
        }
        return str2 + "The 'com.afterpay:afterpay-android' and 'app.cash.paykit:core' dependencies are required to use Cash App Pay";
    }

    /* access modifiers changed from: package-private */
    public void a(Connect.ProviderMode providerMode, String str) {
        PaymentError paymentError = (!(this.f121354a.contains(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYNOW) || this.f121354a.contains(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYLATER) || this.f121354a.contains(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_SLICEIT) || this.f121354a.contains(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_ONE)) || !TextUtils.isEmpty(str)) ? null : new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "The shopperResult URL is required for Klarna Payments proper configuration.");
        if (paymentError == null) {
            return;
        }
        if (providerMode != Connect.ProviderMode.TEST) {
            this.f121354a.remove(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYNOW);
            this.f121354a.remove(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYLATER);
            this.f121354a.remove(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_SLICEIT);
            this.f121354a.remove(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_ONE);
            return;
        }
        throw new PaymentException(paymentError);
    }

    private boolean d(BrandsValidation brandsValidation) {
        for (String isCardBrand : this.f121354a) {
            if (!brandsValidation.isCardBrand(isCardBrand)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(String str, Map map) {
        return Boolean.valueOf(map.get(str) == null);
    }

    private void b(CheckoutSettings checkoutSettings, boolean z10) {
        CheckoutSecurityPolicyMode securityPolicyModeForTokens = checkoutSettings.getSecurityPolicyModeForTokens();
        if (!z10 && securityPolicyModeForTokens == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED) {
            this.f121355b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(CheckoutInfo checkoutInfo, boolean z10) {
        Token[] tokenArr;
        if (checkoutInfo.isBrandsActivated() && checkoutInfo.getBrands() != null) {
            List asList = Arrays.asList(checkoutInfo.getBrands());
            if (checkoutInfo.isShopBrandsOverridden()) {
                this.f121354a = new LinkedHashSet(asList);
            } else {
                this.f121354a.retainAll(asList);
            }
        }
        if (z10 && (tokenArr = this.f121355b) != null && tokenArr.length > 0) {
            a(this.f121354a, tokenArr);
        }
    }

    private void a(Set<String> set, Token[] tokenArr) {
        Arrays.sort(tokenArr, new C2(new LinkedList(set)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(LinkedList linkedList, Token token, Token token2) {
        String paymentBrand = token.getPaymentBrand();
        String paymentBrand2 = token2.getPaymentBrand();
        if (linkedList.contains(paymentBrand) && linkedList.contains(paymentBrand2)) {
            return linkedList.indexOf(paymentBrand) - linkedList.indexOf(paymentBrand2);
        }
        if (linkedList.contains(paymentBrand2)) {
            return 1;
        }
        return linkedList.contains(paymentBrand) ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public void a(CheckoutSettings checkoutSettings, boolean z10) {
        a();
        Token[] tokenArr = this.f121355b;
        if (tokenArr != null && tokenArr.length > 0) {
            b(checkoutSettings, z10);
        }
        Iterator<String> it = this.f121354a.iterator();
        while (it.hasNext()) {
            if (checkoutSettings.getSecurityPolicyModeForBrand(it.next()) == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED && !z10) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(BrandsValidation brandsValidation) {
        for (Map.Entry next : brandsValidation.getBrandInfoMap().entrySet()) {
            String str = (String) next.getKey();
            if (((BrandInfo) next.getValue()).isCustomUiRequired() && !brandsValidation.isCardBrand(str) && !C14119x.a(str)) {
                this.f121354a.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C8971l<Boolean> lVar, Connect.ProviderMode providerMode) {
        try {
            if (!lVar.n(b.class).booleanValue()) {
                this.f121354a.remove(CheckoutConstants.PaymentBrands.GOOGLEPAY);
            }
        } catch (b e10) {
            if (providerMode == Connect.ProviderMode.LIVE) {
                this.f121354a.remove(CheckoutConstants.PaymentBrands.GOOGLEPAY);
                return;
            }
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, e10.getMessage()));
        }
    }

    private String a(CheckoutSettings checkoutSettings) {
        if (checkoutSettings.getBrandConfig() == null || checkoutSettings.getBrandConfig().getAmazonPayConfig() == null) {
            return "The PaymentBrandConfig must be set in CheckoutSettings in order to use AMAZONPAY payment method.";
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(Map<String, WpwlOptions> map, AfterpayPacificConfig afterpayPacificConfig, Connect.ProviderMode providerMode) {
        String[] strArr = {CheckoutConstants.PaymentBrands.AFTERPAY_PACIFIC, CheckoutConstants.PaymentBrands.CLEARPAY};
        for (int i10 = 0; i10 < 2; i10++) {
            a(strArr[i10], map, afterpayPacificConfig, providerMode);
        }
    }

    private void a(String str, Map<String, WpwlOptions> map, AfterpayPacificConfig afterpayPacificConfig, Connect.ProviderMode providerMode) {
        if (!this.f121354a.contains(str)) {
            return;
        }
        if (LibraryHelper.isAfterpayPacificAvailable) {
            if (afterpayPacificConfig == null) {
                if (providerMode == Connect.ProviderMode.LIVE) {
                    Logger.error("Missing AfterpayPacificConfig.");
                    this.f121354a.remove(str);
                } else {
                    ErrorCode errorCode = ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE;
                    throw new PaymentException(new PaymentError(errorCode, "The AfterpayPacificConfig must be set in CheckoutSettings in order to use " + str + " payment method."));
                }
            }
            Optional.ofNullable(map).ifPresent(new A2(str));
        } else if (((Boolean) Optional.ofNullable(map).map(new B2(str)).orElse(Boolean.TRUE)).booleanValue()) {
            this.f121354a.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Connect.ProviderMode providerMode) {
        if (!this.f121354a.contains(CheckoutConstants.PaymentBrands.AFFIRM) || LibraryHelper.isAffirmAvailable) {
            return;
        }
        if (providerMode == Connect.ProviderMode.LIVE) {
            this.f121354a.remove(CheckoutConstants.PaymentBrands.AFFIRM);
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_AFFIRM, "Affirm dependency not found."));
    }

    private void a() {
        if (!LibraryHelper.isPlayServicesWalletAvailable) {
            this.f121354a.remove(CheckoutConstants.PaymentBrands.GOOGLEPAY);
        }
        this.f121354a.remove(CheckoutConstants.PaymentBrands.APPLEPAY);
        this.f121354a.remove("CARD");
    }
}
