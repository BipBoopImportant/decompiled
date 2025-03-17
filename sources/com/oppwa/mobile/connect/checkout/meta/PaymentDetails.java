package com.oppwa.mobile.connect.checkout.meta;

import Ba.C6385i;
import com.oppwa.mobile.connect.checkout.dialog.OrderSummary;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import java.util.List;
import java.util.Objects;
import qE.C14953m;

public class PaymentDetails {

    /* renamed from: a  reason: collision with root package name */
    private String f121435a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121436b;

    /* renamed from: c  reason: collision with root package name */
    private C6385i f121437c;

    /* renamed from: d  reason: collision with root package name */
    private a f121438d;

    /* renamed from: e  reason: collision with root package name */
    private List<C14953m> f121439e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f121440f = false;

    /* renamed from: g  reason: collision with root package name */
    private OrderSummary f121441g;

    public PaymentDetails(String str, String str2) {
        this.f121435a = str;
        this.f121436b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaymentDetails paymentDetails = (PaymentDetails) obj;
        return this.f121440f == paymentDetails.f121440f && this.f121435a.equals(paymentDetails.f121435a) && Objects.equals(this.f121436b, paymentDetails.f121436b) && Objects.equals(this.f121437c, paymentDetails.f121437c) && Objects.equals(this.f121438d, paymentDetails.f121438d) && Objects.equals(this.f121439e, paymentDetails.f121439e) && Objects.equals(this.f121441g, paymentDetails.f121441g);
    }

    public String getCheckoutId() {
        return this.f121435a;
    }

    public C6385i getGooglePayData() {
        return this.f121437c;
    }

    public OrderSummary getOrderSummary() {
        return this.f121441g;
    }

    public String getPaymentBrand() {
        return this.f121436b;
    }

    public CustomSheetPaymentInfo getSamsungPayData() {
        a aVar = this.f121438d;
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    public List<C14953m> getThreeDS2Warnings() {
        return this.f121439e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121435a, this.f121436b, this.f121437c, this.f121438d, this.f121439e, Boolean.valueOf(this.f121440f), this.f121441g});
    }

    public boolean isCanceled() {
        return this.f121440f;
    }

    public void setCanceled(boolean z10) {
        this.f121440f = z10;
    }

    public void setCheckoutId(String str) {
        this.f121435a = str;
    }

    public void setGooglePayData(C6385i iVar) {
        this.f121437c = iVar;
    }

    public void setOrderSummary(OrderSummary orderSummary) {
        this.f121441g = orderSummary;
    }

    public void setSamsungPayData(CustomSheetPaymentInfo customSheetPaymentInfo) {
        if (customSheetPaymentInfo != null) {
            this.f121438d = new a(customSheetPaymentInfo);
        }
    }

    public void setThreeDS2Warnings(List<C14953m> list) {
        this.f121439e = list;
    }

    public String toString() {
        return "PaymentDetails{checkoutId=" + this.f121435a + ", paymentBrand=" + this.f121436b + ", googlePayData=" + this.f121437c + ", samsungPayData=" + this.f121438d + ", threeDS2Warnings=" + this.f121439e + ", abortCheckout=" + this.f121440f + ", orderSummary=" + this.f121441g + '}';
    }
}
