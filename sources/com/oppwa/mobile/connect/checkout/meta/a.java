package com.oppwa.mobile.connect.checkout.meta;

import com.oppwa.mobile.connect.utils.Utils;
import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final CustomSheetPaymentInfo f121457a;

    public a(CustomSheetPaymentInfo customSheetPaymentInfo) {
        this.f121457a = customSheetPaymentInfo;
    }

    private boolean a(CustomSheetPaymentInfo customSheetPaymentInfo, CustomSheetPaymentInfo customSheetPaymentInfo2) {
        if (customSheetPaymentInfo == customSheetPaymentInfo2) {
            return true;
        }
        if (customSheetPaymentInfo == null || customSheetPaymentInfo2 == null) {
            return false;
        }
        if (!Objects.equals(customSheetPaymentInfo.getVersion(), customSheetPaymentInfo2.getVersion()) || !Objects.equals(customSheetPaymentInfo.getMerchantId(), customSheetPaymentInfo2.getMerchantId()) || !Objects.equals(customSheetPaymentInfo.getMerchantName(), customSheetPaymentInfo2.getMerchantName()) || !Objects.equals(customSheetPaymentInfo.getOrderNumber(), customSheetPaymentInfo2.getOrderNumber()) || customSheetPaymentInfo.getPaymentProtocol() != customSheetPaymentInfo2.getPaymentProtocol() || customSheetPaymentInfo.getAddressInPaymentSheet() != customSheetPaymentInfo2.getAddressInPaymentSheet() || !Objects.equals(customSheetPaymentInfo.getAllowedCardBrands(), customSheetPaymentInfo2.getAllowedCardBrands()) || !a(customSheetPaymentInfo.getCardInfo(), customSheetPaymentInfo2.getCardInfo()) || customSheetPaymentInfo.getIsCardHolderNameRequired() != customSheetPaymentInfo2.getIsCardHolderNameRequired() || customSheetPaymentInfo.getIsRecurring() != customSheetPaymentInfo2.getIsRecurring() || !Objects.equals(customSheetPaymentInfo.getMerchantCountryCode(), customSheetPaymentInfo2.getMerchantCountryCode()) || !a(customSheetPaymentInfo.getCustomSheet(), customSheetPaymentInfo2.getCustomSheet()) || !Utils.equals(customSheetPaymentInfo.getExtraPaymentInfo(), customSheetPaymentInfo2.getExtraPaymentInfo())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a(this.f121457a, ((a) obj).f121457a);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121457a.getVersion(), this.f121457a.getMerchantId(), this.f121457a.getMerchantName(), this.f121457a.getOrderNumber(), this.f121457a.getPaymentProtocol(), this.f121457a.getAddressInPaymentSheet(), this.f121457a.getAllowedCardBrands(), Boolean.valueOf(this.f121457a.getIsCardHolderNameRequired()), Boolean.valueOf(this.f121457a.getIsRecurring()), this.f121457a.getMerchantCountryCode()}) + a() + c() + e();
    }

    public String toString() {
        return "CustomSheetPaymentInfo{version='" + this.f121457a.getVersion() + '\'' + ", merchantId='" + this.f121457a.getMerchantId() + '\'' + ", merchantName='" + this.f121457a.getMerchantName() + '\'' + ", orderNumber='" + this.f121457a.getOrderNumber() + '\'' + ", paymentProtocol=" + this.f121457a.getPaymentProtocol() + ", addressInPaymentSheet=" + this.f121457a.getAddressInPaymentSheet() + ", allowedCardBrand=" + this.f121457a.getAllowedCardBrands() + ", cardInfo=" + b() + ", isCardHolderNameRequired=" + this.f121457a.getIsCardHolderNameRequired() + ", isRecurring=" + this.f121457a.getIsRecurring() + ", merchantCountryCode='" + this.f121457a.getMerchantCountryCode() + '\'' + ", customSheet=" + d() + ", extraPaymentInfo=" + this.f121457a.getExtraPaymentInfo() + '}';
    }

    private int c() {
        return ((Integer) Optional.ofNullable(this.f121457a.getCustomSheet()).map(new r()).orElse(0)).intValue();
    }

    private String d() {
        return (String) Optional.ofNullable(this.f121457a.getCustomSheet()).map(new w(this)).orElse("null");
    }

    private int e() {
        return ((Integer) Optional.ofNullable(this.f121457a.getExtraPaymentInfo()).map(new x()).orElse(0)).intValue();
    }

    public CustomSheetPaymentInfo f() {
        return this.f121457a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer b(CustomSheet customSheet) {
        return (Integer) Optional.ofNullable(customSheet.getSheetControls()).map(new s()).orElse(0);
    }

    private String b() {
        return (String) Optional.ofNullable(this.f121457a.getCardInfo()).map(new y(this)).orElse("null");
    }

    /* access modifiers changed from: private */
    public String b(List<SheetControl> list) {
        StringBuilder sb2 = new StringBuilder("[");
        for (SheetControl next : list) {
            sb2.append("{");
            sb2.append("controlType=");
            sb2.append(next.getControltype());
            sb2.append(", controlId='");
            sb2.append(next.getControlId());
            sb2.append("'}");
        }
        sb2.append("]");
        return sb2.toString();
    }

    private boolean a(CardInfo cardInfo, CardInfo cardInfo2) {
        if (cardInfo == cardInfo2) {
            return true;
        }
        if (cardInfo == null || cardInfo2 == null) {
            return false;
        }
        if (cardInfo.getBrand() != cardInfo2.getBrand() || !Objects.equals(cardInfo.getCardId(), cardInfo2.getCardId()) || !Utils.equals(cardInfo.getCardMetaData(), cardInfo2.getCardMetaData())) {
            return false;
        }
        return true;
    }

    private boolean a(CustomSheet customSheet, CustomSheet customSheet2) {
        if (customSheet == customSheet2) {
            return true;
        }
        if (customSheet == null || customSheet2 == null) {
            return false;
        }
        return Objects.equals(customSheet.getSheetControls(), customSheet2.getSheetControls());
    }

    private int a() {
        return ((Integer) Optional.ofNullable(this.f121457a.getCardInfo()).map(new u()).orElse(0)).intValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(List list) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        list.forEach(new t(atomicInteger));
        return Integer.valueOf(atomicInteger.get());
    }

    /* access modifiers changed from: private */
    public String a(CardInfo cardInfo) {
        return "{brand=" + cardInfo.getBrand() + ", cardId='" + cardInfo.getCardId() + '\'' + ", cardMetaData=" + cardInfo.getCardMetaData() + '}';
    }

    /* access modifiers changed from: private */
    public String a(CustomSheet customSheet) {
        return "{sheetControls=" + ((String) Optional.ofNullable(customSheet.getSheetControls()).map(new v(this)).orElse("null")) + '}';
    }
}
