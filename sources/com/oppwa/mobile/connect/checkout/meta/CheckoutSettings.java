package com.oppwa.mobile.connect.checkout.meta;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.IPaymentFormListener;
import com.oppwa.mobile.connect.checkout.uicomponent.meta.UiComponentsConfig;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import com.oppwa.mobile.connect.utils.ParcelUtils;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class CheckoutSettings implements Parcelable {
    public static final Parcelable.Creator<CheckoutSettings> CREATOR = new a();

    /* renamed from: A  reason: collision with root package name */
    private UiComponentsConfig f121382A;

    /* renamed from: B  reason: collision with root package name */
    private MbWayConfig f121383B;

    /* renamed from: C  reason: collision with root package name */
    private EnumSet<GooglePaySubmitType> f121384C;

    /* renamed from: D  reason: collision with root package name */
    private AfterpayPacificConfig f121385D;

    /* renamed from: E  reason: collision with root package name */
    private CheckoutPaymentBrandConfig f121386E;

    /* renamed from: F  reason: collision with root package name */
    private int f121387F;

    /* renamed from: G  reason: collision with root package name */
    private double f121388G;

    /* renamed from: H  reason: collision with root package name */
    private double f121389H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f121390I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f121391J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f121392K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f121393L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f121394M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f121395N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f121396O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f121397P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f121398Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f121399R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f121400S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f121401T;

    /* renamed from: a  reason: collision with root package name */
    private String f121402a;

    /* renamed from: b  reason: collision with root package name */
    private String f121403b;

    /* renamed from: c  reason: collision with root package name */
    private String f121404c;

    /* renamed from: d  reason: collision with root package name */
    private String f121405d;

    /* renamed from: e  reason: collision with root package name */
    private String f121406e;

    /* renamed from: f  reason: collision with root package name */
    private String f121407f;

    /* renamed from: g  reason: collision with root package name */
    private String f121408g;

    /* renamed from: h  reason: collision with root package name */
    private Connect.ProviderMode f121409h;

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f121410i;

    /* renamed from: j  reason: collision with root package name */
    private CheckoutStorePaymentDetailsMode f121411j;

    /* renamed from: k  reason: collision with root package name */
    private CheckoutSkipCVVMode f121412k;

    /* renamed from: l  reason: collision with root package name */
    private CheckoutCardBrandsDisplayMode f121413l;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, CheckoutSecurityPolicyMode> f121414m;

    /* renamed from: n  reason: collision with root package name */
    private CheckoutSecurityPolicyMode f121415n;

    /* renamed from: o  reason: collision with root package name */
    private IPaymentFormListener f121416o;

    /* renamed from: p  reason: collision with root package name */
    private OnBeforeSubmitCallback f121417p;

    /* renamed from: q  reason: collision with root package name */
    private Integer[] f121418q;

    /* renamed from: r  reason: collision with root package name */
    private CheckoutBrandDetectionType f121419r;

    /* renamed from: s  reason: collision with root package name */
    private CheckoutBrandDetectionAppearanceStyle f121420s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f121421t;

    /* renamed from: u  reason: collision with root package name */
    private SamsungPayConfig f121422u;

    /* renamed from: v  reason: collision with root package name */
    private Map<String, Integer> f121423v;

    /* renamed from: w  reason: collision with root package name */
    private BillingAddress f121424w;

    /* renamed from: x  reason: collision with root package name */
    private ComponentName f121425x;

    /* renamed from: y  reason: collision with root package name */
    private ThreeDSConfig f121426y;

    /* renamed from: z  reason: collision with root package name */
    private Map<String, WpwlOptions> f121427z;

    class a implements Parcelable.Creator<CheckoutSettings> {
        a() {
        }

        /* renamed from: a */
        public CheckoutSettings createFromParcel(Parcel parcel) {
            return new CheckoutSettings(parcel, (a) null);
        }

        /* renamed from: a */
        public CheckoutSettings[] newArray(int i10) {
            return new CheckoutSettings[i10];
        }
    }

    /* synthetic */ CheckoutSettings(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException a() {
        return new IllegalStateException("CheckoutId can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException c() {
        return new IllegalStateException("CheckoutSkipCVVMode can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException d() {
        return new IllegalStateException("CheckoutCardBrandsDisplayMode can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException e() {
        return new IllegalStateException("BrandDetectionType can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException f() {
        return new IllegalStateException("BrandDetectionAppearanceStyle can't be null");
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
        CheckoutSettings checkoutSettings = (CheckoutSettings) obj;
        return this.f121398Q == checkoutSettings.f121398Q && this.f121395N == checkoutSettings.f121395N && this.f121387F == checkoutSettings.f121387F && this.f121391J == checkoutSettings.f121391J && this.f121397P == checkoutSettings.f121397P && this.f121396O == checkoutSettings.f121396O && this.f121390I == checkoutSettings.f121390I && this.f121392K == checkoutSettings.f121392K && this.f121399R == checkoutSettings.f121399R && Double.compare(checkoutSettings.f121388G, this.f121388G) == 0 && Double.compare(checkoutSettings.f121389H, this.f121389H) == 0 && Arrays.equals(this.f121418q, checkoutSettings.f121418q) && Utils.compare(this.f121402a, checkoutSettings.f121402a) && Utils.compare(this.f121409h, checkoutSettings.f121409h) && Utils.compare(this.f121410i, checkoutSettings.f121410i) && Utils.compare(this.f121411j, checkoutSettings.f121411j) && Utils.compare(this.f121412k, checkoutSettings.f121412k) && Utils.compare(this.f121413l, checkoutSettings.f121413l) && Utils.compare(this.f121415n, checkoutSettings.f121415n) && Utils.compare(this.f121419r, checkoutSettings.f121419r) && Utils.compare(this.f121420s, checkoutSettings.f121420s) && Utils.compare(this.f121421t, checkoutSettings.f121421t) && Utils.compare(this.f121403b, checkoutSettings.f121403b) && Utils.compare(this.f121404c, checkoutSettings.f121404c) && Utils.compare(this.f121405d, checkoutSettings.f121405d) && Utils.compare(this.f121414m, checkoutSettings.f121414m) && Utils.compare(this.f121423v, checkoutSettings.f121423v) && Utils.compare(this.f121424w, checkoutSettings.f121424w) && Utils.compare(Boolean.valueOf(this.f121400S), Boolean.valueOf(checkoutSettings.f121400S)) && Utils.compare(Boolean.valueOf(this.f121394M), Boolean.valueOf(checkoutSettings.f121394M)) && Utils.compare(Boolean.valueOf(this.f121401T), Boolean.valueOf(checkoutSettings.f121401T)) && Utils.compare(this.f121425x, checkoutSettings.f121425x) && Utils.compare(this.f121407f, checkoutSettings.f121407f) && Utils.compare(this.f121406e, checkoutSettings.f121406e) && Utils.compare(this.f121422u, checkoutSettings.f121422u) && Utils.compare(this.f121426y, checkoutSettings.f121426y) && Utils.compare(this.f121427z, checkoutSettings.f121427z) && Utils.compare(this.f121382A, checkoutSettings.f121382A) && Utils.compare(this.f121383B, checkoutSettings.f121383B) && Utils.compare(Boolean.valueOf(this.f121393L), Boolean.valueOf(checkoutSettings.f121393L)) && Utils.compare(this.f121384C, checkoutSettings.f121384C) && Utils.compare(this.f121408g, checkoutSettings.f121408g) && Utils.compare(this.f121385D, checkoutSettings.f121385D) && Utils.compare(this.f121386E, checkoutSettings.f121386E);
    }

    public String getAciInstantPayCountry() {
        return this.f121405d;
    }

    public AfterpayPacificConfig getAfterpayPacificConfig() {
        return this.f121385D;
    }

    public BillingAddress getBillingAddress() {
        return this.f121424w;
    }

    public CheckoutPaymentBrandConfig getBrandConfig() {
        return this.f121386E;
    }

    public CheckoutBrandDetectionAppearanceStyle getBrandDetectionAppearanceStyle() {
        return this.f121420s;
    }

    public List<String> getBrandDetectionPriority() {
        return this.f121421t;
    }

    public CheckoutBrandDetectionType getBrandDetectionType() {
        return this.f121419r;
    }

    public CheckoutCardBrandsDisplayMode getCardBrandsDisplayMode() {
        return this.f121413l;
    }

    public String getCheckoutId() {
        return this.f121402a;
    }

    public ComponentName getComponentName() {
        return this.f121425x;
    }

    public Map<String, Integer> getCustomLogos() {
        return this.f121423v;
    }

    public String getGooglePayPaymentDataRequestJson() {
        return this.f121406e;
    }

    public EnumSet<GooglePaySubmitType> getGooglePaySubmit() {
        return this.f121384C;
    }

    public String getIdealBankAccountCountry() {
        return this.f121408g;
    }

    public Integer[] getInstallmentOptions() {
        return this.f121418q;
    }

    public String getKlarnaCountry() {
        return this.f121404c;
    }

    public double getKlarnaInstallmentsFee() {
        return this.f121389H;
    }

    public double getKlarnaInvoiceFee() {
        return this.f121388G;
    }

    public String getLocale() {
        return this.f121403b;
    }

    public MbWayConfig getMbWayConfig() {
        return this.f121383B;
    }

    public OnBeforeSubmitCallback getOnBeforeSubmitCallback() {
        return this.f121417p;
    }

    public Set<String> getPaymentBrands() {
        return this.f121410i;
    }

    public String getPaymentButtonBrand() {
        return this.f121407f;
    }

    public IPaymentFormListener getPaymentFormListener() {
        return this.f121416o;
    }

    public Connect.ProviderMode getProviderMode() {
        return this.f121409h;
    }

    public SamsungPayConfig getSamsungPayConfig() {
        return this.f121422u;
    }

    public CheckoutSecurityPolicyMode getSecurityPolicyModeForBrand(String str) {
        return this.f121414m.get(str);
    }

    public CheckoutSecurityPolicyMode getSecurityPolicyModeForTokens() {
        return this.f121415n;
    }

    public CheckoutSkipCVVMode getSkipCVVMode() {
        return this.f121412k;
    }

    public CheckoutStorePaymentDetailsMode getStorePaymentDetailsMode() {
        return this.f121411j;
    }

    public int getThemeResId() {
        return this.f121387F;
    }

    public ThreeDSConfig getThreeDS2Config() {
        return this.f121426y;
    }

    public UiComponentsConfig getUiComponentsConfig() {
        return this.f121382A;
    }

    public Map<String, WpwlOptions> getWpwlOptions() {
        return this.f121427z;
    }

    public int hashCode() {
        int hashCode = ((this.f121402a.hashCode() * 31) + this.f121409h.hashCode()) * 31;
        Set<String> set = this.f121410i;
        int i10 = 0;
        int hashCode2 = (((((((((((((((((hashCode + (set != null ? set.hashCode() : 0)) * 31) + this.f121411j.hashCode()) * 31) + this.f121412k.hashCode()) * 31) + this.f121413l.hashCode()) * 31) + (this.f121397P ? 1 : 0)) * 31) + (this.f121398Q ? 1 : 0)) * 31) + (this.f121399R ? 1 : 0)) * 31) + (this.f121395N ? 1 : 0)) * 31) + this.f121414m.hashCode()) * 31;
        CheckoutSecurityPolicyMode checkoutSecurityPolicyMode = this.f121415n;
        int hashCode3 = (((((hashCode2 + (checkoutSecurityPolicyMode != null ? checkoutSecurityPolicyMode.hashCode() : 0)) * 31) + this.f121419r.hashCode()) * 31) + this.f121420s.hashCode()) * 31;
        List<String> list = this.f121421t;
        int hashCode4 = (((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f121387F) * 31;
        String str = this.f121403b;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + (this.f121391J ? 1 : 0)) * 31;
        String str2 = this.f121404c;
        int hashCode6 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f121388G);
        int hashCode7 = ((((hashCode5 + hashCode6) * 31) + this.f121405d.hashCode()) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f121389H);
        int hashCode8 = ((((((((((((hashCode7 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + (this.f121396O ? 1 : 0)) * 31) + (this.f121390I ? 1 : 0)) * 31) + Arrays.hashCode(this.f121418q)) * 31) + this.f121423v.hashCode()) * 31) + (this.f121392K ? 1 : 0)) * 31;
        BillingAddress billingAddress = this.f121424w;
        int hashCode9 = (hashCode8 + (billingAddress != null ? billingAddress.hashCode() : 0)) * 31;
        ComponentName componentName = this.f121425x;
        int hashCode10 = (hashCode9 + (componentName != null ? componentName.hashCode() : 0)) * 31;
        String str3 = this.f121407f;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f121406e;
        int hashCode12 = (hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31;
        SamsungPayConfig samsungPayConfig = this.f121422u;
        int hashCode13 = (((((((hashCode12 + (samsungPayConfig != null ? samsungPayConfig.hashCode() : 0)) * 31) + (this.f121400S ? 1 : 0)) * 31) + (this.f121394M ? 1 : 0)) * 31) + (this.f121401T ? 1 : 0)) * 31;
        ThreeDSConfig threeDSConfig = this.f121426y;
        int hashCode14 = (hashCode13 + (threeDSConfig != null ? threeDSConfig.hashCode() : 0)) * 31;
        Map<String, WpwlOptions> map = this.f121427z;
        int hashCode15 = (hashCode14 + (map != null ? map.hashCode() : 0)) * 31;
        UiComponentsConfig uiComponentsConfig = this.f121382A;
        int hashCode16 = (hashCode15 + (uiComponentsConfig != null ? uiComponentsConfig.hashCode() : 0)) * 31;
        MbWayConfig mbWayConfig = this.f121383B;
        int hashCode17 = (((((((hashCode16 + (mbWayConfig != null ? mbWayConfig.hashCode() : 0)) * 31) + (this.f121393L ? 1 : 0)) * 31) + ((Integer) Optional.ofNullable(this.f121385D).map(new p()).orElse(0)).intValue()) * 31) + ((Integer) Optional.ofNullable(this.f121386E).map(new f()).orElse(0)).intValue()) * 31;
        EnumSet<GooglePaySubmitType> enumSet = this.f121384C;
        if (enumSet != null) {
            i10 = enumSet.hashCode();
        }
        return ((hashCode17 + i10) * 31) + ((Integer) Optional.ofNullable(this.f121408g).map(new g()).orElse(0)).intValue();
    }

    public boolean isBackButtonAvailable() {
        return this.f121390I;
    }

    public boolean isCardExpiryDateValidationDisabled() {
        return this.f121401T;
    }

    public boolean isCardHolderVisible() {
        return this.f121395N;
    }

    public boolean isCardScanningEnabled() {
        return this.f121394M;
    }

    public boolean isIBANRequired() {
        return this.f121398Q;
    }

    public boolean isInstallmentEnabled() {
        return this.f121396O;
    }

    public boolean isPaymentBrandsOrderUsedForTokens() {
        return this.f121399R;
    }

    public boolean isSTCPayQrCodeRequired() {
        return this.f121392K;
    }

    public boolean isShowBirthDate() {
        return this.f121400S;
    }

    public boolean isShowOtpEnabled() {
        return this.f121393L;
    }

    public boolean isTotalAmountRequired() {
        return this.f121397P;
    }

    public boolean isWindowSecurityEnabled() {
        return this.f121391J;
    }

    public CheckoutSettings setAciInstantPayCountry(String str) {
        this.f121405d = str;
        return this;
    }

    public CheckoutSettings setAfterpayPacificConfig(AfterpayPacificConfig afterpayPacificConfig) {
        this.f121385D = afterpayPacificConfig;
        return this;
    }

    public CheckoutSettings setBackButtonAvailable(boolean z10) {
        this.f121390I = z10;
        return this;
    }

    public CheckoutSettings setBillingAddress(BillingAddress billingAddress) {
        this.f121424w = billingAddress;
        return this;
    }

    public CheckoutSettings setBrandConfig(CheckoutPaymentBrandConfig checkoutPaymentBrandConfig) {
        this.f121386E = checkoutPaymentBrandConfig;
        return this;
    }

    public CheckoutSettings setBrandDetectionAppearanceStyle(CheckoutBrandDetectionAppearanceStyle checkoutBrandDetectionAppearanceStyle) {
        this.f121420s = checkoutBrandDetectionAppearanceStyle;
        return this;
    }

    public CheckoutSettings setBrandDetectionPriority(List<String> list) {
        this.f121421t = list;
        return this;
    }

    public CheckoutSettings setBrandDetectionType(CheckoutBrandDetectionType checkoutBrandDetectionType) {
        this.f121419r = checkoutBrandDetectionType;
        return this;
    }

    public CheckoutSettings setCardBrandsDisplayMode(CheckoutCardBrandsDisplayMode checkoutCardBrandsDisplayMode) {
        this.f121413l = checkoutCardBrandsDisplayMode;
        return this;
    }

    public CheckoutSettings setCardExpiryDateValidationDisabled(boolean z10) {
        this.f121401T = z10;
        return this;
    }

    public CheckoutSettings setCardHolderVisible(boolean z10) {
        this.f121395N = z10;
        return this;
    }

    public CheckoutSettings setCardScanningEnabled(boolean z10) {
        this.f121394M = z10;
        return this;
    }

    public void setCheckoutId(String str) {
        this.f121402a = str;
    }

    public CheckoutSettings setComponentName(ComponentName componentName) {
        this.f121425x = componentName;
        return this;
    }

    public CheckoutSettings setCustomLogo(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            this.f121423v.put(str, Integer.valueOf(i10));
        }
        return this;
    }

    public CheckoutSettings setGooglePayPaymentDataRequestJson(String str) {
        this.f121406e = str;
        return this;
    }

    public CheckoutSettings setGooglePaySubmit(EnumSet<GooglePaySubmitType> enumSet) {
        this.f121384C = enumSet;
        return this;
    }

    public CheckoutSettings setIBANRequired(boolean z10) {
        this.f121398Q = z10;
        return this;
    }

    public CheckoutSettings setIdealBankAccountCountry(String str) {
        this.f121408g = str;
        return this;
    }

    public CheckoutSettings setInstallmentEnabled(boolean z10) {
        this.f121396O = z10;
        return this;
    }

    public CheckoutSettings setInstallmentOptions(Integer[] numArr) {
        this.f121418q = numArr;
        return this;
    }

    public CheckoutSettings setKlarnaCountry(String str) {
        this.f121404c = str;
        return this;
    }

    public CheckoutSettings setKlarnaInstallmentsFee(double d10) {
        this.f121389H = d10;
        return this;
    }

    public CheckoutSettings setKlarnaInvoiceFee(double d10) {
        this.f121388G = d10;
        return this;
    }

    public CheckoutSettings setLocale(String str) {
        this.f121403b = str;
        return this;
    }

    public CheckoutSettings setMbWayConfig(MbWayConfig mbWayConfig) {
        this.f121383B = mbWayConfig;
        return this;
    }

    public CheckoutSettings setOnBeforeSubmitCallback(OnBeforeSubmitCallback onBeforeSubmitCallback) {
        this.f121417p = onBeforeSubmitCallback;
        return this;
    }

    public CheckoutSettings setPaymentBrands(Set<String> set) {
        this.f121410i = set;
        return this;
    }

    public CheckoutSettings setPaymentBrandsOrderUsedForTokens(boolean z10) {
        this.f121399R = z10;
        return this;
    }

    public CheckoutSettings setPaymentButtonBrand(String str) {
        this.f121407f = str;
        return this;
    }

    public CheckoutSettings setPaymentFormListener(IPaymentFormListener iPaymentFormListener) {
        this.f121416o = iPaymentFormListener;
        return this;
    }

    public CheckoutSettings setProviderMode(Connect.ProviderMode providerMode) {
        this.f121409h = providerMode;
        return this;
    }

    public CheckoutSettings setSTCPayQrCodeRequired(boolean z10) {
        this.f121392K = z10;
        return this;
    }

    public CheckoutSettings setSamsungPayConfig(SamsungPayConfig samsungPayConfig) {
        this.f121422u = samsungPayConfig;
        return this;
    }

    public CheckoutSettings setSecurityPolicyModeForBrand(String str, CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        this.f121414m.put(str, checkoutSecurityPolicyMode);
        return this;
    }

    public CheckoutSettings setSecurityPolicyModeForTokens(CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        this.f121415n = checkoutSecurityPolicyMode;
        return this;
    }

    public CheckoutSettings setShowBirthDate(boolean z10) {
        this.f121400S = z10;
        return this;
    }

    public CheckoutSettings setShowOtpEnabled(boolean z10) {
        this.f121393L = z10;
        return this;
    }

    public CheckoutSettings setSkipCVVMode(CheckoutSkipCVVMode checkoutSkipCVVMode) {
        this.f121412k = checkoutSkipCVVMode;
        return this;
    }

    public CheckoutSettings setStorePaymentDetailsMode(CheckoutStorePaymentDetailsMode checkoutStorePaymentDetailsMode) {
        this.f121411j = checkoutStorePaymentDetailsMode;
        return this;
    }

    public CheckoutSettings setThemeResId(int i10) {
        this.f121387F = i10;
        return this;
    }

    public CheckoutSettings setThreeDS2Config(ThreeDSConfig threeDSConfig) {
        this.f121426y = threeDSConfig;
        return this;
    }

    public CheckoutSettings setTotalAmountRequired(boolean z10) {
        this.f121397P = z10;
        return this;
    }

    public CheckoutSettings setUiComponentsConfig(UiComponentsConfig uiComponentsConfig) {
        this.f121382A = uiComponentsConfig;
        return this;
    }

    public CheckoutSettings setWindowSecurityEnabled(boolean z10) {
        this.f121391J = z10;
        return this;
    }

    public CheckoutSettings setWpwlOptions(Map<String, WpwlOptions> map) {
        this.f121427z = map;
        return this;
    }

    public String toString() {
        return "CheckoutSettings{checkoutId=" + this.f121402a + ", providerMode=" + this.f121409h + ", paymentBrands=" + this.f121410i + ", storePaymentDetailsMode=" + this.f121411j + ", skipCVVMode=" + this.f121412k + ", cardBrandsDisplayMode=" + this.f121413l + ", isTotalAmountRequired=" + this.f121397P + ", isCardHolderVisible=" + this.f121395N + ", isIBANRequired=" + this.f121398Q + ", securityPolicies=" + this.f121414m + ", securityPolicyModeForTokens=" + this.f121415n + ", themeResId=" + this.f121387F + ", locale=" + this.f121403b + ", isWindowSecurityEnabled=" + this.f121391J + ", klarnaCountry=" + this.f121404c + ", aciInstantPayCountry=" + this.f121405d + ", klarnaInvoiceFee=" + this.f121388G + ", klarnaInstallmentsFee=" + this.f121389H + ", paymentFormListener=" + this.f121416o + ", onBeforeSubmitCallback=" + this.f121417p + ", isInstallmentEnabled=" + this.f121396O + ", isBackButtonAvailable=" + this.f121390I + ", installmentOptions=" + Arrays.toString(this.f121418q) + ", brandDetectionType=" + this.f121419r + ", brandDetectionAppearanceStyle=" + this.f121420s + ", brandDetectionPriority=" + this.f121421t + ", googlePayPaymentDataRequestJson=" + this.f121406e + ", samsungPayConfig=" + this.f121422u + ", isSTCPayQrCodeRequired=" + this.f121392K + ", customLogos=" + this.f121423v.keySet() + ", billingAddress=" + this.f121424w + ", componentName=" + this.f121425x + ", paymentButtonBrand=" + this.f121407f + ", isPaymentBrandsOrderUsedForTokens=" + this.f121399R + ", isShowBirthDate=" + this.f121400S + ", isCardScanningEnabled=" + this.f121394M + ", isCardExpiryDateValidationDisabled=" + this.f121401T + ", threeDS2Config=" + this.f121426y + ", wpwlOptions=" + this.f121427z + ", uiComponentsConfig=" + this.f121382A + ", mbWayConfig=" + this.f121383B + ", afterpayPacificConfig=" + this.f121385D + ", brandConfig=" + this.f121386E + ", isShowOtpEnabled=" + this.f121393L + ", idealBankAccountCountry='" + this.f121408g + '\'' + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121402a);
        parcel.writeString(this.f121409h.name());
        parcel.writeStringArray((String[]) this.f121410i.toArray(new String[0]));
        parcel.writeParcelable(this.f121411j, 0);
        parcel.writeParcelable(this.f121412k, 0);
        parcel.writeParcelable(this.f121413l, 0);
        parcel.writeByte(this.f121397P ? (byte) 1 : 0);
        parcel.writeByte(this.f121398Q ? (byte) 1 : 0);
        parcel.writeByte(this.f121395N ? (byte) 1 : 0);
        ParcelUtils.writeParcelableMap(parcel, this.f121414m);
        ParcelUtils.writeIntegerMap(parcel, this.f121423v);
        parcel.writeParcelable(this.f121415n, 0);
        parcel.writeInt(this.f121387F);
        parcel.writeString(this.f121403b);
        parcel.writeString(this.f121404c);
        parcel.writeString(this.f121405d);
        parcel.writeDouble(this.f121388G);
        parcel.writeDouble(this.f121389H);
        parcel.writeByte(this.f121391J ? (byte) 1 : 0);
        parcel.writeParcelable(this.f121416o, 0);
        parcel.writeParcelable(this.f121417p, 0);
        parcel.writeByte(this.f121396O ? (byte) 1 : 0);
        parcel.writeByte(this.f121390I ? (byte) 1 : 0);
        parcel.writeArray(this.f121418q);
        parcel.writeParcelable(this.f121419r, 0);
        parcel.writeParcelable(this.f121420s, 0);
        parcel.writeByte((byte) (this.f121421t != null ? 1 : 0));
        List<String> list = this.f121421t;
        if (list != null) {
            parcel.writeStringList(list);
        }
        parcel.writeByte(this.f121392K ? (byte) 1 : 0);
        parcel.writeParcelable(this.f121424w, 0);
        parcel.writeParcelable(this.f121425x, 0);
        parcel.writeString(this.f121407f);
        parcel.writeString(this.f121406e);
        parcel.writeParcelable(this.f121422u, 0);
        parcel.writeByte(this.f121399R ? (byte) 1 : 0);
        parcel.writeByte(this.f121400S ? (byte) 1 : 0);
        parcel.writeByte(this.f121394M ? (byte) 1 : 0);
        parcel.writeByte(this.f121401T ? (byte) 1 : 0);
        parcel.writeParcelable(this.f121426y, 0);
        ParcelUtils.writeParcelableMap(parcel, this.f121427z);
        parcel.writeParcelable(this.f121382A, 0);
        parcel.writeParcelable(this.f121383B, 0);
        parcel.writeByte(this.f121393L ? (byte) 1 : 0);
        parcel.writeParcelable(this.f121385D, 0);
        parcel.writeParcelable(this.f121386E, 0);
        EnumSet<GooglePaySubmitType> enumSet = this.f121384C;
        parcel.writeByte((byte) (enumSet != null ? enumSet.size() : -1));
        EnumSet<GooglePaySubmitType> enumSet2 = this.f121384C;
        if (enumSet2 != null) {
            enumSet2.forEach(new e(parcel));
        }
        parcel.writeString(this.f121408g);
    }

    public CheckoutSettings(String str, Set<String> set, Connect.ProviderMode providerMode) {
        this.f121405d = CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY;
        this.f121411j = CheckoutStorePaymentDetailsMode.NEVER;
        this.f121412k = CheckoutSkipCVVMode.NEVER;
        this.f121413l = CheckoutCardBrandsDisplayMode.GROUPED;
        this.f121414m = new HashMap();
        this.f121418q = new Integer[]{1, 3, 5};
        this.f121419r = CheckoutBrandDetectionType.REGEX;
        this.f121420s = CheckoutBrandDetectionAppearanceStyle.ACTIVE;
        this.f121423v = new HashMap();
        this.f121390I = true;
        this.f121391J = true;
        this.f121392K = true;
        this.f121393L = true;
        this.f121394M = true;
        this.f121395N = true;
        this.f121402a = str;
        this.f121410i = set;
        if (set != null) {
            for (String securityPolicyModeForBrand : set) {
                setSecurityPolicyModeForBrand(securityPolicyModeForBrand, CheckoutSecurityPolicyMode.DEVICE_AUTH_NOT_REQUIRED);
            }
        } else {
            this.f121410i = new LinkedHashSet();
        }
        this.f121409h = providerMode;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ LinkedHashSet a(String[] strArr) {
        return new LinkedHashSet(Arrays.asList(strArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException b() {
        return new IllegalStateException("StorePaymentDetailsMode can't be null");
    }

    private CheckoutSettings(Parcel parcel) {
        this.f121405d = CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY;
        this.f121411j = CheckoutStorePaymentDetailsMode.NEVER;
        this.f121412k = CheckoutSkipCVVMode.NEVER;
        this.f121413l = CheckoutCardBrandsDisplayMode.GROUPED;
        this.f121414m = new HashMap();
        boolean z10 = true;
        this.f121418q = new Integer[]{1, 3, 5};
        this.f121419r = CheckoutBrandDetectionType.REGEX;
        this.f121420s = CheckoutBrandDetectionAppearanceStyle.ACTIVE;
        this.f121423v = new HashMap();
        this.f121390I = true;
        this.f121391J = true;
        this.f121392K = true;
        this.f121393L = true;
        this.f121394M = true;
        this.f121395N = true;
        this.f121402a = (String) Optional.ofNullable(parcel.readString()).orElseThrow(new h());
        this.f121409h = Connect.ProviderMode.valueOf(parcel.readString());
        this.f121410i = (Set) Optional.ofNullable(parcel.createStringArray()).map(new i()).orElse((Object) null);
        this.f121411j = (CheckoutStorePaymentDetailsMode) Optional.ofNullable((CheckoutStorePaymentDetailsMode) parcel.readParcelable(CheckoutStorePaymentDetailsMode.class.getClassLoader())).orElseThrow(new j());
        this.f121412k = (CheckoutSkipCVVMode) Optional.ofNullable((CheckoutSkipCVVMode) parcel.readParcelable(CheckoutSkipCVVMode.class.getClassLoader())).orElseThrow(new k());
        this.f121413l = (CheckoutCardBrandsDisplayMode) Optional.ofNullable((CheckoutCardBrandsDisplayMode) parcel.readParcelable(CheckoutCardBrandsDisplayMode.class.getClassLoader())).orElseThrow(new l());
        this.f121397P = parcel.readByte() != 0;
        this.f121398Q = parcel.readByte() != 0;
        this.f121395N = parcel.readByte() != 0;
        this.f121414m = (Map) Optional.ofNullable(ParcelUtils.readParcelableMap(parcel)).orElseGet(new m());
        this.f121423v = (Map) Optional.ofNullable(ParcelUtils.readIntegerMap(parcel)).orElseGet(new m());
        this.f121415n = (CheckoutSecurityPolicyMode) parcel.readParcelable(CheckoutSecurityPolicyMode.class.getClassLoader());
        this.f121387F = parcel.readInt();
        this.f121403b = parcel.readString();
        this.f121404c = parcel.readString();
        this.f121405d = (String) Optional.ofNullable(parcel.readString()).orElse(CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
        this.f121388G = parcel.readDouble();
        this.f121389H = parcel.readDouble();
        this.f121391J = parcel.readByte() != 0;
        this.f121416o = (IPaymentFormListener) parcel.readParcelable(IPaymentFormListener.class.getClassLoader());
        this.f121417p = (OnBeforeSubmitCallback) parcel.readParcelable(OnBeforeSubmitCallback.class.getClassLoader());
        this.f121396O = parcel.readByte() != 0;
        this.f121390I = parcel.readByte() != 0;
        this.f121418q = (Integer[]) Optional.ofNullable(ParcelUtils.readIntegerArray(parcel)).orElse(new Integer[0]);
        this.f121419r = (CheckoutBrandDetectionType) Optional.ofNullable((CheckoutBrandDetectionType) parcel.readParcelable(CheckoutBrandDetectionType.class.getClassLoader())).orElseThrow(new n());
        this.f121420s = (CheckoutBrandDetectionAppearanceStyle) Optional.ofNullable((CheckoutBrandDetectionAppearanceStyle) parcel.readParcelable(CheckoutBrandDetectionAppearanceStyle.class.getClassLoader())).orElseThrow(new o());
        if (parcel.readByte() > 0) {
            ArrayList arrayList = new ArrayList();
            this.f121421t = arrayList;
            parcel.readStringList(arrayList);
        }
        this.f121392K = parcel.readByte() != 0;
        this.f121424w = (BillingAddress) parcel.readParcelable(BillingAddress.class.getClassLoader());
        this.f121425x = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f121407f = parcel.readString();
        this.f121406e = parcel.readString();
        this.f121422u = (SamsungPayConfig) parcel.readParcelable(SamsungPayConfig.class.getClassLoader());
        this.f121399R = parcel.readByte() != 0;
        this.f121400S = parcel.readByte() != 0;
        this.f121394M = parcel.readByte() != 0;
        this.f121401T = parcel.readByte() != 0;
        this.f121426y = (ThreeDSConfig) parcel.readParcelable(ThreeDSConfig.class.getClassLoader());
        this.f121427z = ParcelUtils.readParcelableMap(parcel);
        this.f121382A = (UiComponentsConfig) parcel.readParcelable(UiComponentsConfig.class.getClassLoader());
        this.f121383B = (MbWayConfig) parcel.readParcelable(MbWayConfig.class.getClassLoader());
        this.f121393L = parcel.readByte() == 0 ? false : z10;
        this.f121385D = (AfterpayPacificConfig) parcel.readParcelable(AfterpayPacificConfig.class.getClassLoader());
        this.f121386E = (CheckoutPaymentBrandConfig) parcel.readParcelable(CheckoutPaymentBrandConfig.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > -1) {
            Class<GooglePaySubmitType> cls = GooglePaySubmitType.class;
            this.f121384C = EnumSet.noneOf(cls);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f121384C.add((GooglePaySubmitType) parcel.readParcelable(cls.getClassLoader()));
            }
        }
        this.f121408g = parcel.readString();
    }
}
