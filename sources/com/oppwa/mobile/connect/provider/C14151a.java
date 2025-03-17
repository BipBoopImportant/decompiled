package com.oppwa.mobile.connect.provider;

import android.text.TextUtils;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.model.BinInfo;
import com.oppwa.mobile.connect.provider.parser.BinInfoResponseParser;
import com.oppwa.mobile.connect.provider.parser.BrandsValidationResponseParser;
import com.oppwa.mobile.connect.provider.parser.CheckoutDataResponseParser;
import com.oppwa.mobile.connect.provider.parser.CheckoutInfoResponseParser;
import com.oppwa.mobile.connect.provider.parser.ImagesResponseParser;
import com.oppwa.mobile.connect.provider.parser.ThreeDSAuthResponseParser;
import com.oppwa.mobile.connect.provider.parser.transaction.TransactionResponseParserFactory;
import com.oppwa.mobile.connect.utils.Logger;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.provider.a  reason: case insensitive filesystem */
class C14151a {
    C14151a() {
    }

    /* access modifiers changed from: package-private */
    public Transaction a(Connect.ProviderMode providerMode, String str, Transaction transaction) {
        PaymentParams paymentParams = transaction.getPaymentParams();
        String format = String.format("/v1/checkouts/%s%s", new Object[]{paymentParams.getCheckoutId(), str});
        try {
            Map<String, String> paramsForRequest = paymentParams.getParamsForRequest();
            a(paymentParams, format);
            TransactionResponseParserFactory.createParser(paymentParams.getPaymentBrand()).parse(StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, format, paramsForRequest, paymentParams.getCheckoutId())), transaction);
            return transaction;
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    public CheckoutInfo b(Connect.ProviderMode providerMode, String str) {
        String format = String.format("/v1/checkouts/%1$s", new Object[]{str});
        Logger.info("Request: [GET] " + format);
        try {
            String inputStreamToString = StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, format, (Map<String, String>) null, str));
            if (!TextUtils.isEmpty(inputStreamToString)) {
                return (CheckoutInfo) new CheckoutInfoResponseParser().parse(inputStreamToString);
            }
            throw new IllegalArgumentException("CheckoutInfo response is empty");
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> c(Connect.ProviderMode providerMode, String str) {
        try {
            String inputStreamToString = StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, String.format("/v1/checkouts/%1$s/configuration/IDEAL_BANKS", new Object[]{str}), (Map<String, String>) null, str));
            if (!inputStreamToString.isEmpty()) {
                return a(new JSONArray(inputStreamToString));
            }
            return null;
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    public CheckoutData a(Connect.ProviderMode providerMode, String str) {
        try {
            return (CheckoutData) new CheckoutDataResponseParser().parse(StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, String.format("/v1/checkouts/%1$s/data", new Object[]{str}), (Map<String, String>) null, str)));
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError((String) Optional.ofNullable(e10.getMessage()).orElse("Malformed server response.")));
        }
    }

    /* access modifiers changed from: package-private */
    public BrandsValidation a(Connect.ProviderMode providerMode, String str, String[] strArr) {
        String str2 = String.format("/v1/checkouts/%1$s/brand?names=", new Object[]{str}) + a(strArr);
        Logger.info("Request: [GET] " + str2);
        try {
            return new BrandsValidation(new BrandsValidation.Filter((Map) new BrandsValidationResponseParser().parse(StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, str2, (Map<String, String>) null, str)))).filter(strArr));
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    public ImagesRequest a(Connect.ProviderMode providerMode, String[] strArr) {
        try {
            return (ImagesRequest) new ImagesResponseParser().parse(StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, "/v1/images?brands=" + a(strArr), (Map<String, String>) null, (String) null)));
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    public BinInfo a(Connect.ProviderMode providerMode, String str, String str2) {
        try {
            return (BinInfo) new BinInfoResponseParser().parse(StringUtils.inputStreamToString(HttpUtils.makeRequest(providerMode, "/v1/checkouts/" + str2 + "/bins", Collections.singletonMap("bin", str), (String) null)));
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    public ThreeDS2Info a(String str, String str2) {
        try {
            return (ThreeDS2Info) new ThreeDSAuthResponseParser().parse(StringUtils.inputStreamToString(HttpUtils.a(str, (Map<String, String>) Collections.singletonMap("clientAuthRequest", str2))));
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new PaymentException(PaymentError.getPaymentProviderConnectionMalformedResponseError(e10.getMessage()));
        }
    }

    private static String a(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private HashMap<String, String> a(JSONArray jSONArray) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            hashMap.put(jSONObject.getString("name"), jSONObject.getString("id"));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void a(PaymentParams paymentParams, String str) {
        StringBuilder sb2 = new StringBuilder("Request: [POST] " + str + "\n");
        paymentParams.mask();
        Logger.info(sb2.toString());
        StringUtils.wipeString(sb2);
    }
}
