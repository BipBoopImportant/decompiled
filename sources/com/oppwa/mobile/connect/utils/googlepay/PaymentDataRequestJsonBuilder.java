package com.oppwa.mobile.connect.utils.googlepay;

import org.json.JSONArray;
import org.json.JSONObject;

public class PaymentDataRequestJsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    private String f122219a;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f122220b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f122221c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f122222d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f122223e;

    /* renamed from: f  reason: collision with root package name */
    private JSONArray f122224f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f122225g;

    private JSONObject a() {
        if (this.f122219a != null) {
            return new JSONObject().put("merchantName", this.f122219a);
        }
        return null;
    }

    private JSONObject b() {
        if (this.f122224f == null && this.f122225g == null) {
            return null;
        }
        return new JSONObject().putOpt("allowedCountryCodes", this.f122224f).putOpt("phoneNumberRequired", this.f122225g);
    }

    public PaymentDataRequestJsonBuilder setAllowedPaymentMethods(JSONArray jSONArray) {
        this.f122220b = jSONArray;
        return this;
    }

    public PaymentDataRequestJsonBuilder setEmailRequired(boolean z10) {
        this.f122222d = Boolean.valueOf(z10);
        return this;
    }

    public PaymentDataRequestJsonBuilder setMerchantInfo(String str) {
        this.f122219a = str;
        return this;
    }

    public PaymentDataRequestJsonBuilder setShippingAddressParameters(JSONArray jSONArray, Boolean bool) {
        this.f122224f = jSONArray;
        this.f122225g = bool;
        return this;
    }

    public PaymentDataRequestJsonBuilder setShippingAddressRequired(boolean z10) {
        this.f122223e = Boolean.valueOf(z10);
        return this;
    }

    public PaymentDataRequestJsonBuilder setTransactionInfo(JSONObject jSONObject) {
        this.f122221c = jSONObject;
        return this;
    }

    public JSONObject toJson() {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).putOpt("merchantInfo", a()).putOpt("allowedPaymentMethods", this.f122220b).putOpt("transactionInfo", this.f122221c).putOpt("emailRequired", this.f122222d).putOpt("shippingAddressRequired", this.f122223e).putOpt("shippingAddressParameters", b());
    }
}
