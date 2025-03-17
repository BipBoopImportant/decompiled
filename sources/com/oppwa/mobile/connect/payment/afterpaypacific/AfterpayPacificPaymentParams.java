package com.oppwa.mobile.connect.payment.afterpaypacific;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Map;

public class AfterpayPacificPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<AfterpayPacificPaymentParams> CREATOR = new a();

    class a implements Parcelable.Creator<AfterpayPacificPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public AfterpayPacificPaymentParams createFromParcel(Parcel parcel) {
            return new AfterpayPacificPaymentParams(parcel);
        }

        /* renamed from: a */
        public AfterpayPacificPaymentParams[] newArray(int i10) {
            return new AfterpayPacificPaymentParams[i10];
        }
    }

    public AfterpayPacificPaymentParams(String str) {
        super(str, CheckoutConstants.PaymentBrands.AFTERPAY_PACIFIC);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[inlineFlow]", "true");
        return paramsForRequest;
    }

    protected AfterpayPacificPaymentParams(String str, String str2) {
        super(str, str2);
        if (TextUtils.isEmpty(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsPaymentSchemeInvalidError());
        }
    }

    protected AfterpayPacificPaymentParams(Parcel parcel) {
        super(parcel);
    }
}
