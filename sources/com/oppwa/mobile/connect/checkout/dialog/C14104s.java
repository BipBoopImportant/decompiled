package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.oppwa.mobile.connect.payment.bankaccount.IdealPaymentParams;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.s  reason: case insensitive filesystem */
class C14104s {

    /* renamed from: a  reason: collision with root package name */
    private static final String f121313a = "com.oppwa.mobile.connect.checkout.dialog.s";

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f121314b = {IdealPaymentParams.DEFAULT_COUNTRY, "DE", "AT", "DK", "FI", "NO", "SE"};

    static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equalsIgnoreCase : f121314b) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    static C14107t a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C14107t tVar = new C14107t();
            tVar.d(a(jSONObject.getJSONObject("title"), str2));
            tVar.b(a(jSONObject.getJSONObject("linkTitle"), str2));
            tVar.a(a(jSONObject.getJSONObject("link"), str2));
            tVar.c(a(jSONObject.getJSONObject("terms"), str2));
            return tVar;
        } catch (JSONException e10) {
            Log.e(f121313a, e10.getMessage());
            return null;
        }
    }

    static String a(Context context) {
        String country = context.getResources().getConfiguration().locale.getCountry();
        if (a(country)) {
            return country;
        }
        return "DE";
    }

    private static String a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
