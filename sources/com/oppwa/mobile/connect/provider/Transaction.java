package com.oppwa.mobile.connect.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.provider.model.yookassa.YooKassaInfo;
import com.oppwa.mobile.connect.utils.ParcelUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Transaction implements Parcelable {
    public static final String AFTERPAY_PACIFIC_CALLBACK_URL_KEY = "callbackUrl";
    public static final String AFTERPAY_PACIFIC_FAILURE_CALLBACK_URL_KEY = "failureCallbackUrl";
    public static final String AFTERPAY_PACIFIC_REDIRECT_URL = "redirectCheckoutUrl";
    public static final String BANCONTACT_LINK_APP_SCHEME_URL_KEY = "secureTransactionId";
    public static final String CASH_APP_PAY_CALLBACK_URL_KEY = "callbackUrl";
    public static final String CASH_APP_PAY_FAILURE_CALLBACK_URL_KEY = "failureCallbackUrl";
    public static final String CASH_APP_PAY_TOKEN_KEY = "clientToken";
    public static final Parcelable.Creator<Transaction> CREATOR = new a();
    public static final String KLARNA_INLINE_CALLBACK_URL_KEY = "callbackUrl";
    public static final String KLARNA_INLINE_CLIENT_TOKEN_KEY = "clientToken";
    public static final String KLARNA_INLINE_FAILURE_CALLBACK_URL_KEY = "failureCallbackUrl";
    public static final String KLARNA_INLINE_INITIAL_TRANSACTION_ID = "connectorId";

    /* renamed from: a  reason: collision with root package name */
    private final PaymentParams f121995a;

    /* renamed from: b  reason: collision with root package name */
    private TransactionType f121996b;

    /* renamed from: c  reason: collision with root package name */
    private String f121997c;

    /* renamed from: d  reason: collision with root package name */
    private String f121998d;

    /* renamed from: e  reason: collision with root package name */
    private ThreeDS2Info f121999e;

    /* renamed from: f  reason: collision with root package name */
    private YooKassaInfo f122000f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f122001g;

    class a implements Parcelable.Creator<Transaction> {
        a() {
        }

        /* renamed from: a */
        public Transaction createFromParcel(Parcel parcel) {
            return new Transaction(parcel, (a) null);
        }

        /* renamed from: a */
        public Transaction[] newArray(int i10) {
            return new Transaction[i10];
        }
    }

    /* synthetic */ Transaction(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException a() {
        return new IllegalStateException("TransactionType can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException b() {
        return new IllegalStateException("PaymentParams can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException c() {
        return new IllegalStateException("BrandSpecificInfo can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException d() {
        return new PaymentException(PaymentError.getThreeDS2Error("ThreeDS2Info can't be null"));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return Objects.equals(this.f121995a, transaction.f121995a) && this.f121996b == transaction.f121996b && Objects.equals(this.f121997c, transaction.f121997c) && Objects.equals(this.f121998d, transaction.f121998d) && Objects.equals(this.f121999e, transaction.f121999e) && Objects.equals(this.f122000f, transaction.f122000f) && Objects.equals(this.f122001g, transaction.f122001g);
    }

    public Map<String, String> getBrandSpecificInfo() {
        return this.f122001g;
    }

    public PaymentParams getPaymentParams() {
        return this.f121995a;
    }

    public String getRedirectUrl() {
        return this.f121997c;
    }

    public ThreeDS2Info getThreeDS2Info() {
        return this.f121999e;
    }

    public String getThreeDS2MethodRedirectUrl() {
        return this.f121998d;
    }

    public TransactionType getTransactionType() {
        return this.f121996b;
    }

    public YooKassaInfo getYooKassaInfo() {
        return this.f122000f;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121995a, this.f121996b, this.f121997c, this.f121998d, this.f121999e, this.f122000f, this.f122001g});
    }

    public ThreeDS2Info requireThreeDS2Info() {
        return (ThreeDS2Info) Optional.ofNullable(this.f121999e).orElseThrow(new E());
    }

    public void setRedirectUrl(String str) {
        this.f121997c = str;
    }

    public void setThreeDS2Info(ThreeDS2Info threeDS2Info) {
        this.f121999e = threeDS2Info;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.f121996b = transactionType;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f121996b, 0);
        parcel.writeParcelable(this.f121995a, 0);
        parcel.writeString(this.f121997c);
        parcel.writeString(this.f121998d);
        parcel.writeParcelable(this.f121999e, 0);
        parcel.writeParcelable(this.f122000f, 0);
        ParcelUtils.writeStringMap(parcel, this.f122001g);
    }

    public Transaction(PaymentParams paymentParams) {
        this.f121996b = TransactionType.SYNC;
        this.f122001g = new HashMap();
        if (paymentParams != null) {
            this.f121995a = paymentParams;
            return;
        }
        throw new PaymentException(PaymentError.getPaymentParamsInvalidError());
    }

    private Transaction(Parcel parcel) {
        this.f121996b = TransactionType.SYNC;
        this.f122001g = new HashMap();
        this.f121996b = (TransactionType) Optional.ofNullable((TransactionType) parcel.readParcelable(TransactionType.class.getClassLoader())).orElseThrow(new F());
        this.f121995a = (PaymentParams) Optional.ofNullable((PaymentParams) parcel.readParcelable(PaymentParams.class.getClassLoader())).orElseThrow(new G());
        this.f121997c = parcel.readString();
        this.f121998d = parcel.readString();
        this.f121999e = (ThreeDS2Info) parcel.readParcelable(ThreeDS2Info.class.getClassLoader());
        this.f122000f = (YooKassaInfo) parcel.readParcelable(YooKassaInfo.class.getClassLoader());
        this.f122001g = (Map) Optional.ofNullable(ParcelUtils.readStringMap(parcel)).orElseThrow(new H());
    }
}
