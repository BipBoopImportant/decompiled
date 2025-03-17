package com.oppwa.mobile.connect.checkout.dialog;

import Ba.C6381e;
import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.b;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.utils.googlepay.IsReadyToPayRequestJsonBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xa.C8965f;

public class GooglePayHelper {
    public static final String GATEWAY = "aciworldwide";

    static void a(PaymentsClient paymentsClient, C6381e eVar, C8965f<Boolean> fVar) {
        paymentsClient.D(eVar).c(fVar);
    }

    public static PaymentsClient getPaymentsClient(Context context, Connect.ProviderMode providerMode) {
        return b.a(context, new b.a.C0825a().b(providerMode == Connect.ProviderMode.LIVE ? 1 : 3).a());
    }

    public static void isReadyToPayWithGoogle(Context context, Connect.ProviderMode providerMode, String str, C8965f<Boolean> fVar) {
        a(getPaymentsClient(context, providerMode), C6381e.x(a(str).toString()), fVar);
    }

    static JSONObject a(String str) {
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("allowedPaymentMethods");
            if (optJSONArray == null) {
                return new JSONObject();
            }
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                optJSONArray.getJSONObject(i10).remove("tokenizationSpecification");
            }
            return new IsReadyToPayRequestJsonBuilder().setAllowedPaymentMethods(optJSONArray).toJson();
        } catch (JSONException e10) {
            throw new PaymentException(PaymentError.getUnexpectedExceptionError(e10));
        }
    }
}
