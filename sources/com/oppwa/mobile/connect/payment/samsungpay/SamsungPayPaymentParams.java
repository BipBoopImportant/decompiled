package com.oppwa.mobile.connect.payment.samsungpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.VirtualAccountPaymentParams;
import java.util.Map;
import java.util.Optional;
import org.json.JSONObject;

public class SamsungPayPaymentParams extends VirtualAccountPaymentParams {
    public static final Parcelable.Creator<SamsungPayPaymentParams> CREATOR = new a();

    class a implements Parcelable.Creator<SamsungPayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public SamsungPayPaymentParams createFromParcel(Parcel parcel) {
            return new SamsungPayPaymentParams(parcel);
        }

        /* renamed from: a */
        public SamsungPayPaymentParams[] newArray(int i10) {
            return new SamsungPayPaymentParams[i10];
        }
    }

    public SamsungPayPaymentParams(String str, String str2) {
        super(str, CheckoutConstants.PaymentBrands.SAMSUNGPAY, str2);
        this.f121812g = a(getPaymentToken());
    }

    private String a(String str) {
        try {
            return new JSONObject(str).getJSONObject("3DS").toString();
        } catch (Exception e10) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_SAMSUNGPAY, "Failed to parse Samsung payment token from json. " + ((String) Optional.ofNullable(e10.getMessage()).orElse(""))));
        }
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[tokenSource]", CheckoutConstants.PaymentBrands.SAMSUNGPAY);
        paramsForRequest.put("threeDSecure.mobileFlow", "auto");
        return paramsForRequest;
    }

    protected SamsungPayPaymentParams(Parcel parcel) {
        super(parcel);
    }
}
