package com.oppwa.mobile.connect.payment.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public class CardPaymentParams extends BaseCardPaymentParams {
    public static final Parcelable.Creator<CardPaymentParams> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    private byte[] f121847j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f121848k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f121849l;

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f121850m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f121851n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f121852o;

    /* renamed from: p  reason: collision with root package name */
    private BillingAddress f121853p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f121854q;

    class a implements Parcelable.Creator<CardPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public CardPaymentParams createFromParcel(Parcel parcel) {
            return new CardPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public CardPaymentParams[] newArray(int i10) {
            return new CardPaymentParams[i10];
        }
    }

    /* synthetic */ CardPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    private void a(BillingAddress billingAddress, Map<String, String> map) {
        a("billing.country", billingAddress.getCountry(), map);
        a("billing.state", billingAddress.getState(), map);
        a("billing.city", billingAddress.getCity(), map);
        a("billing.postcode", billingAddress.getPostCode(), map);
        a("billing.street1", billingAddress.getStreet1(), map);
        a("billing.street2", billingAddress.getStreet2(), map);
    }

    public static boolean isCardExpired(String str, String str2) {
        if (!isExpiryMonthValid(str) || !isExpiryYearValid(str2)) {
            return false;
        }
        int i10 = Calendar.getInstance().get(1);
        int i11 = Calendar.getInstance().get(2) + 1;
        int parseInt = Integer.parseInt(str);
        int parseInt2 = Integer.parseInt(str2);
        return parseInt2 < i10 || (parseInt2 == i10 && parseInt < i11);
    }

    public static boolean isCountryCodeValid(String str) {
        return str != null && a.e().matcher(str).matches();
    }

    public static boolean isExpiryMonthValid(String str) {
        return str != null && a.b().matcher(str).matches();
    }

    public static boolean isExpiryYearValid(String str) {
        return str != null && a.c().matcher(str).matches();
    }

    public static boolean isHolderValid(String str) {
        if (str == null) {
            return false;
        }
        String normalizeHolder = Utils.normalizeHolder(str);
        return normalizeHolder.isEmpty() || (a.d().matcher(normalizeHolder).matches() && !Pattern.compile("^[0-9]{10,}$").matcher(Utils.normalizeCardNumber(str)).matches() && !a.a().matcher(str).matches());
    }

    public static boolean isMobilePhoneNumberValid(String str) {
        return str != null && a.e().matcher(str).matches();
    }

    public static boolean isNumberValid(String str, boolean z10) {
        String normalizeCardNumber = Utils.normalizeCardNumber(str);
        if (normalizeCardNumber == null || !a.f().matcher(normalizeCardNumber).matches()) {
            return false;
        }
        if (z10) {
            return b.a(normalizeCardNumber);
        }
        return true;
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
        CardPaymentParams cardPaymentParams = (CardPaymentParams) obj;
        return this.f121854q == cardPaymentParams.f121854q && Arrays.equals(this.f121847j, cardPaymentParams.f121847j) && Arrays.equals(this.f121848k, cardPaymentParams.f121848k) && Arrays.equals(this.f121849l, cardPaymentParams.f121849l) && Arrays.equals(this.f121850m, cardPaymentParams.f121850m) && Arrays.equals(this.f121851n, cardPaymentParams.f121851n) && Arrays.equals(this.f121852o, cardPaymentParams.f121852o) && Objects.equals(this.f121853p, cardPaymentParams.f121853p);
    }

    public BillingAddress getBillingAddress() {
        return this.f121853p;
    }

    public String getCountryCode() {
        return Utils.stringFromBytes(this.f121852o);
    }

    public String getExpiryMonth() {
        return Utils.stringFromBytes(this.f121849l);
    }

    public String getExpiryYear() {
        return Utils.stringFromBytes(this.f121850m);
    }

    public String getHolder() {
        return Utils.stringFromBytes(this.f121848k);
    }

    public String getMobilePhone() {
        return Utils.stringFromBytes(this.f121851n);
    }

    public String getNumber() {
        return Utils.stringFromBytes(this.f121847j);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        if (this.f121848k != null) {
            paramsForRequest.put("card.holder", getHolder());
        }
        paramsForRequest.put("card.number", getNumber());
        if (this.f121849l != null) {
            paramsForRequest.put("card.expiryMonth", getExpiryMonth());
        }
        if (this.f121850m != null) {
            paramsForRequest.put("card.expiryYear", getExpiryYear());
        }
        if (this.f121854q) {
            paramsForRequest.put("createRegistration", "true");
        }
        if (this.f121851n != null) {
            paramsForRequest.put("customer.mobile", getMobilePhone());
        }
        if (this.f121852o != null) {
            paramsForRequest.put("customParameters[MOBILE_COUNTRY_CODE]", getCountryCode());
        }
        BillingAddress billingAddress = this.f121853p;
        if (billingAddress != null) {
            a(billingAddress, paramsForRequest);
        }
        return paramsForRequest;
    }

    public int hashCode() {
        return (((((((((((Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121853p, Boolean.valueOf(this.f121854q)}) * 31) + Arrays.hashCode(this.f121847j)) * 31) + Arrays.hashCode(this.f121848k)) * 31) + Arrays.hashCode(this.f121849l)) * 31) + Arrays.hashCode(this.f121850m)) * 31) + Arrays.hashCode(this.f121851n)) * 31) + Arrays.hashCode(this.f121852o);
    }

    public boolean isTokenizationEnabled() {
        return this.f121854q;
    }

    public void mask() {
        super.mask();
        String number = getNumber();
        if (number.length() > 4) {
            this.f121847j = number.substring(number.length() - 4).getBytes();
        }
    }

    public PaymentParams setBillingAddress(BillingAddress billingAddress) {
        this.f121853p = billingAddress;
        return this;
    }

    public void setCountryCode(String str) {
        this.f121852o = Utils.bytesFromString(str);
    }

    public void setMobilePhone(String str) {
        this.f121851n = Utils.bytesFromString(str);
    }

    public CardPaymentParams setTokenizationEnabled(boolean z10) {
        this.f121854q = z10;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        Utils.writeByteArray(parcel, this.f121848k);
        Utils.writeByteArray(parcel, this.f121847j);
        Utils.writeByteArray(parcel, this.f121849l);
        Utils.writeByteArray(parcel, this.f121850m);
        Utils.writeByteArray(parcel, this.f121851n);
        Utils.writeByteArray(parcel, this.f121852o);
        parcel.writeParcelable(this.f121853p, 0);
        parcel.writeByte(this.f121854q ? (byte) 1 : 0);
    }

    public CardPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str, str2);
        if (str4 != null && !isHolderValid(str4)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardHolderInvalidError());
        } else if (!isNumberValid(str3, false)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardNumberInvalidError());
        } else if (str5 != null && !isExpiryMonthValid(str5)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardMonthInvalidError());
        } else if (str6 != null && !isExpiryYearValid(str6)) {
            throw new PaymentException(PaymentError.getPaymentParamsCardYearInvalidError());
        } else if (str7 == null || BaseCardPaymentParams.isCvvValid(str7)) {
            this.f121848k = Utils.bytesFromString(Utils.normalizeHolder(str4));
            this.f121847j = Utils.normalizeCardNumber(str3).getBytes();
            this.f121849l = Utils.bytesFromString(str5);
            this.f121850m = Utils.bytesFromString(str6);
            a(str7);
            this.f121854q = false;
        } else {
            throw new PaymentException(PaymentError.getPaymentParamsCardCvvInvalidError());
        }
    }

    public CardPaymentParams(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, "", str2, str3, str4, str5, str6);
    }

    private CardPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121848k = Utils.readByteArray(parcel);
        this.f121847j = Utils.readByteArray(parcel);
        this.f121849l = Utils.readByteArray(parcel);
        this.f121850m = Utils.readByteArray(parcel);
        this.f121851n = Utils.readByteArray(parcel);
        this.f121852o = Utils.readByteArray(parcel);
        this.f121853p = (BillingAddress) parcel.readParcelable(BillingAddress.class.getClassLoader());
        this.f121854q = parcel.readByte() != 0;
    }
}
