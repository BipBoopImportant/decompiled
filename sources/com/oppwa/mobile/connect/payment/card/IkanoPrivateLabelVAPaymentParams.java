package com.oppwa.mobile.connect.payment.card;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.Arrays;
import java.util.Map;

public class IkanoPrivateLabelVAPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<IkanoPrivateLabelVAPaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f121855g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f121856h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f121857i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f121858j;

    class a implements Parcelable.Creator<IkanoPrivateLabelVAPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public IkanoPrivateLabelVAPaymentParams createFromParcel(Parcel parcel) {
            return new IkanoPrivateLabelVAPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public IkanoPrivateLabelVAPaymentParams[] newArray(int i10) {
            return new IkanoPrivateLabelVAPaymentParams[i10];
        }
    }

    /* synthetic */ IkanoPrivateLabelVAPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static boolean isAccountExpired(String str, String str2) {
        return CardPaymentParams.isCardExpired(str, str2);
    }

    public static boolean isAccountNumberValid(String str) {
        return CardPaymentParams.isNumberValid(str, false);
    }

    public static boolean isAccountVerificationValid(String str) {
        return str != null && a.g().matcher(str).matches();
    }

    public static boolean isExpiryMonthValid(String str) {
        return CardPaymentParams.isExpiryMonthValid(str);
    }

    public static boolean isExpiryYearValid(String str) {
        return CardPaymentParams.isExpiryYearValid(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        IkanoPrivateLabelVAPaymentParams ikanoPrivateLabelVAPaymentParams = (IkanoPrivateLabelVAPaymentParams) obj;
        return Arrays.equals(this.f121855g, ikanoPrivateLabelVAPaymentParams.f121855g) && Arrays.equals(this.f121856h, ikanoPrivateLabelVAPaymentParams.f121856h) && Arrays.equals(this.f121857i, ikanoPrivateLabelVAPaymentParams.f121857i) && Arrays.equals(this.f121858j, ikanoPrivateLabelVAPaymentParams.f121858j);
    }

    public String getAccountNumber() {
        return Utils.stringFromBytes(this.f121855g);
    }

    public String getAccountVerification() {
        return Utils.stringFromBytes(this.f121858j);
    }

    public String getExpiryMonth() {
        return Utils.stringFromBytes(this.f121856h);
    }

    public String getExpiryYear() {
        return Utils.stringFromBytes(this.f121857i);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[GIFT_CARD_NUMBER]", getAccountNumber());
        paramsForRequest.put("customParameters[GIFT_CARD_EXPIRY_DATE]", getExpiryMonth() + "/" + getExpiryYear());
        String accountVerification = getAccountVerification();
        if (!TextUtils.isEmpty(accountVerification)) {
            paramsForRequest.put("customParameters[GIFT_CARD_CODE]", accountVerification);
        }
        return paramsForRequest;
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + Arrays.hashCode(this.f121855g)) * 31) + Arrays.hashCode(this.f121856h)) * 31) + Arrays.hashCode(this.f121857i)) * 31) + Arrays.hashCode(this.f121858j);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        Utils.writeByteArray(parcel, this.f121855g);
        Utils.writeByteArray(parcel, this.f121856h);
        Utils.writeByteArray(parcel, this.f121857i);
        Utils.writeByteArray(parcel, this.f121858j);
    }

    public IkanoPrivateLabelVAPaymentParams(String str, String str2, String str3, String str4, String str5) {
        super(str, CheckoutConstants.PaymentBrands.IKANO_PRIVATE_LABEL_VA);
        if (!isAccountNumberValid(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardNumberInvalidError());
        } else if (!isExpiryMonthValid(str3)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardMonthInvalidError());
        } else if (!isExpiryYearValid(str4)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardYearInvalidError());
        } else if (isAccountExpired(str3, str4)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardExpiredError());
        } else if (TextUtils.isEmpty(str5) || isAccountVerificationValid(str5)) {
            this.f121855g = Utils.bytesFromString(str2);
            this.f121856h = Utils.bytesFromString(str3);
            this.f121857i = Utils.bytesFromString(str4);
            this.f121858j = Utils.bytesFromString(str5);
        } else {
            throw new PaymentException(PaymentError.getPaymentParamsAccountVerificationInvalidError());
        }
    }

    private IkanoPrivateLabelVAPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121855g = Utils.readByteArray(parcel);
        this.f121856h = Utils.readByteArray(parcel);
        this.f121857i = Utils.readByteArray(parcel);
        this.f121858j = Utils.readByteArray(parcel);
    }
}
