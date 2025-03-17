package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

public class IdealPaymentParams extends BankAccountPaymentParams {
    public static final Parcelable.Creator<IdealPaymentParams> CREATOR = new a();
    public static final String DEFAULT_COUNTRY = "NL";

    class a implements Parcelable.Creator<IdealPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public IdealPaymentParams createFromParcel(Parcel parcel) {
            return new IdealPaymentParams(parcel);
        }

        /* renamed from: a */
        public IdealPaymentParams[] newArray(int i10) {
            return new IdealPaymentParams[i10];
        }
    }

    IdealPaymentParams(String str, String str2) {
        this(str, str2, DEFAULT_COUNTRY);
        if (!BankAccountPaymentParams.isBankNameValid(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankNameInvalidError());
        }
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        String bankName = getBankName();
        if (bankName != null) {
            paramsForRequest.put("bankAccount.bankName", bankName);
        } else {
            paramsForRequest.put("customParameters[SHOPPER_ENABLE_IDEAL_V2_WIDGET]", "true");
        }
        paramsForRequest.put("bankAccount.country", getCountry());
        return paramsForRequest;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    IdealPaymentParams(String str, String str2, String str3) {
        super(str, CheckoutConstants.PaymentBrands.IDEAL, (String) null, (String) null, (String) null, (String) null, (String) null, str3, str2);
        if (!BankAccountPaymentParams.isCountryValid(str3)) {
            throw new PaymentException(PaymentError.getPaymentParamsCountryCodeInvalidError());
        }
    }

    protected IdealPaymentParams(Parcel parcel) {
        super(parcel);
    }
}
