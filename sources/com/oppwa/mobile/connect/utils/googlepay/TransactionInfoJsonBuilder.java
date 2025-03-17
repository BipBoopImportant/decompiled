package com.oppwa.mobile.connect.utils.googlepay;

import org.json.JSONObject;

public class TransactionInfoJsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    private String f122226a;

    /* renamed from: b  reason: collision with root package name */
    private String f122227b;

    /* renamed from: c  reason: collision with root package name */
    private String f122228c;

    /* renamed from: d  reason: collision with root package name */
    private String f122229d;

    /* renamed from: e  reason: collision with root package name */
    private String f122230e;

    /* renamed from: f  reason: collision with root package name */
    private String f122231f;

    /* renamed from: g  reason: collision with root package name */
    private String f122232g;

    public TransactionInfoJsonBuilder setCheckoutOption(String str) {
        this.f122232g = str;
        return this;
    }

    public TransactionInfoJsonBuilder setCountryCode(String str) {
        this.f122227b = str;
        return this;
    }

    public TransactionInfoJsonBuilder setCurrencyCode(String str) {
        this.f122226a = str;
        return this;
    }

    public TransactionInfoJsonBuilder setTotalPrice(String str) {
        this.f122230e = str;
        return this;
    }

    public TransactionInfoJsonBuilder setTotalPriceLabel(String str) {
        this.f122231f = str;
        return this;
    }

    public TransactionInfoJsonBuilder setTotalPriceStatus(String str) {
        this.f122229d = str;
        return this;
    }

    public TransactionInfoJsonBuilder setTransactionId(String str) {
        this.f122228c = str;
        return this;
    }

    public JSONObject toJson() {
        return new JSONObject().putOpt("currencyCode", this.f122226a).putOpt("countryCode", this.f122227b).putOpt("transactionId", this.f122228c).putOpt("totalPriceStatus", this.f122229d).putOpt("totalPrice", this.f122230e).putOpt("totalPriceLabel", this.f122231f).putOpt("checkoutOption", this.f122232g);
    }
}
