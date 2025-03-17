package com.oppwa.mobile.connect.utils.googlepay;

import com.oppwa.mobile.connect.checkout.dialog.GooglePayHelper;
import org.json.JSONArray;
import org.json.JSONObject;

public class CardPaymentMethodJsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f122207a;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f122208b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f122209c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f122210d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f122211e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f122212f;

    /* renamed from: g  reason: collision with root package name */
    private String f122213g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f122214h;

    /* renamed from: i  reason: collision with root package name */
    private String f122215i;

    /* renamed from: j  reason: collision with root package name */
    private String f122216j = GooglePayHelper.GATEWAY;

    private JSONObject a() {
        if (this.f122213g == null && this.f122214h == null) {
            return null;
        }
        return new JSONObject().putOpt("format", this.f122213g).putOpt("phoneNumberRequired", this.f122214h);
    }

    private JSONObject b() {
        return new JSONObject().putOpt("allowedAuthMethods", this.f122207a).putOpt("allowedCardNetworks", this.f122208b).putOpt("allowPrepaidCards", this.f122209c).putOpt("allowCreditCards", this.f122210d).putOpt("assuranceDetailsRequired", this.f122211e).putOpt("billingAddressRequired", this.f122212f).putOpt("billingAddressParameters", a());
    }

    private JSONObject c() {
        return new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", this.f122216j).putOpt("gatewayMerchantId", this.f122215i));
    }

    public CardPaymentMethodJsonBuilder setAllowCreditCards(boolean z10) {
        this.f122210d = Boolean.valueOf(z10);
        return this;
    }

    public CardPaymentMethodJsonBuilder setAllowPrepaidCards(boolean z10) {
        this.f122209c = Boolean.valueOf(z10);
        return this;
    }

    public CardPaymentMethodJsonBuilder setAllowedAuthMethods(JSONArray jSONArray) {
        this.f122207a = jSONArray;
        return this;
    }

    public CardPaymentMethodJsonBuilder setAllowedCardNetworks(JSONArray jSONArray) {
        this.f122208b = jSONArray;
        return this;
    }

    public CardPaymentMethodJsonBuilder setAssuranceDetailsRequired(boolean z10) {
        this.f122211e = Boolean.valueOf(z10);
        return this;
    }

    public CardPaymentMethodJsonBuilder setBillingAddressParameters(String str, boolean z10) {
        this.f122213g = str;
        this.f122214h = Boolean.valueOf(z10);
        return this;
    }

    public CardPaymentMethodJsonBuilder setBillingAddressRequired(boolean z10) {
        this.f122212f = Boolean.valueOf(z10);
        return this;
    }

    public CardPaymentMethodJsonBuilder setGateway(String str) {
        this.f122216j = str;
        return this;
    }

    public CardPaymentMethodJsonBuilder setGatewayMerchantId(String str) {
        this.f122215i = str;
        return this;
    }

    public JSONObject toJson() {
        return new JSONObject().put("type", "CARD").put("parameters", b()).put("tokenizationSpecification", c());
    }
}
