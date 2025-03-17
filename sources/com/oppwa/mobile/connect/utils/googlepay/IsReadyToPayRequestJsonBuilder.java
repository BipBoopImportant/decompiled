package com.oppwa.mobile.connect.utils.googlepay;

import org.json.JSONArray;
import org.json.JSONObject;

public class IsReadyToPayRequestJsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f122217a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f122218b;

    public IsReadyToPayRequestJsonBuilder setAllowedPaymentMethods(JSONArray jSONArray) {
        this.f122217a = jSONArray;
        return this;
    }

    public IsReadyToPayRequestJsonBuilder setExistingPaymentMethodRequired(boolean z10) {
        this.f122218b = Boolean.valueOf(z10);
        return this;
    }

    public JSONObject toJson() {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).putOpt("allowedPaymentMethods", this.f122217a).putOpt("existingPaymentMethodRequired", this.f122218b);
    }
}
