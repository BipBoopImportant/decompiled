package com.oppwa.mobile.connect.payment.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.Customer;
import com.oppwa.mobile.connect.payment.VirtualAccountPaymentParams;
import java.util.Map;
import java.util.Objects;

public class GooglePayPaymentParams extends VirtualAccountPaymentParams {
    public static final Parcelable.Creator<GooglePayPaymentParams> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private final String f121872h;

    /* renamed from: i  reason: collision with root package name */
    private final BillingAddress f121873i;

    /* renamed from: j  reason: collision with root package name */
    private final Customer f121874j;

    class a implements Parcelable.Creator<GooglePayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public GooglePayPaymentParams createFromParcel(Parcel parcel) {
            return new GooglePayPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public GooglePayPaymentParams[] newArray(int i10) {
            return new GooglePayPaymentParams[i10];
        }
    }

    /* synthetic */ GooglePayPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        GooglePayPaymentParams googlePayPaymentParams = (GooglePayPaymentParams) obj;
        return Objects.equals(this.f121872h, googlePayPaymentParams.f121872h) && Objects.equals(this.f121873i, googlePayPaymentParams.f121873i) && Objects.equals(this.f121874j, googlePayPaymentParams.f121874j);
    }

    public BillingAddress getBillingAddress() {
        return this.f121873i;
    }

    public String getCardBrand() {
        return this.f121872h;
    }

    public Customer getCustomer() {
        return this.f121874j;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[tokenSource]", getPaymentBrand());
        paramsForRequest.put("threeDSecure.mobileFlow", "auto");
        BillingAddress billingAddress = this.f121873i;
        if (billingAddress != null) {
            a("billing.street1", billingAddress.getStreet1(), paramsForRequest);
            a("billing.street2", this.f121873i.getStreet2(), paramsForRequest);
            a("billing.city", this.f121873i.getCity(), paramsForRequest);
            a("billing.state", this.f121873i.getState(), paramsForRequest);
            a("billing.postcode", this.f121873i.getPostCode(), paramsForRequest);
            a("billing.country", this.f121873i.getCountry(), paramsForRequest);
        }
        Customer customer = this.f121874j;
        if (customer != null) {
            a("customer.givenName", customer.getGivenName(), paramsForRequest);
            a("customer.surname", this.f121874j.getSurname(), paramsForRequest);
            a("customer.phone", this.f121874j.getPhone(), paramsForRequest);
            a("customer.email", this.f121874j.getEmail(), paramsForRequest);
        }
        return paramsForRequest;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121872h, this.f121873i, this.f121874j});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121872h);
        parcel.writeParcelable(this.f121873i, 0);
        parcel.writeParcelable(this.f121874j, 0);
    }

    public GooglePayPaymentParams(String str, String str2, String str3) {
        this(str, str2, str3, (BillingAddress) null, (Customer) null);
    }

    public GooglePayPaymentParams(String str, String str2, String str3, String str4) {
        this(str, str2, str3, (BillingAddress) null, (Customer) null, str4);
    }

    public GooglePayPaymentParams(String str, String str2, String str3, BillingAddress billingAddress, Customer customer, String str4) {
        super(str, str4, str2);
        if (TextUtils.isEmpty(str3)) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_INVALID, "Google Pay card brand is missing."));
        } else if (TextUtils.isEmpty(str4)) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_INVALID, "Brand Name is missing"));
        } else if (str4.equals(CheckoutConstants.PaymentBrands.GOOGLEPAYTKN) || str4.equals(CheckoutConstants.PaymentBrands.GOOGLEPAY)) {
            this.f121872h = str3;
            this.f121873i = billingAddress;
            this.f121874j = customer;
        } else {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_INVALID, "Not a Google Pay or Google Pay Token brand."));
        }
    }

    public GooglePayPaymentParams(String str, String str2, String str3, BillingAddress billingAddress, Customer customer) {
        this(str, str2, str3, billingAddress, customer, CheckoutConstants.PaymentBrands.GOOGLEPAY);
    }

    private GooglePayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121872h = parcel.readString();
        this.f121873i = (BillingAddress) parcel.readParcelable(BillingAddress.class.getClassLoader());
        this.f121874j = (Customer) parcel.readParcelable(Customer.class.getClassLoader());
    }
}
