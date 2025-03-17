package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;
import java.util.Objects;

public class CheckoutActivityResult implements Parcelable {
    public static final Parcelable.Creator<CheckoutActivityResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Transaction f121367a;

    /* renamed from: b  reason: collision with root package name */
    private final PaymentError f121368b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121369c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f121370d;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Transaction f121371a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public PaymentError f121372b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f121373c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f121374d;

        public CheckoutActivityResult build() {
            return new CheckoutActivityResult(this, (a) null);
        }

        public Builder setCanceled(boolean z10) {
            this.f121374d = z10;
            return this;
        }

        public Builder setPaymentError(PaymentError paymentError) {
            this.f121372b = paymentError;
            return this;
        }

        public Builder setResourcePath(String str) {
            this.f121373c = str;
            return this;
        }

        public Builder setTransaction(Transaction transaction) {
            this.f121371a = transaction;
            return this;
        }
    }

    class a implements Parcelable.Creator<CheckoutActivityResult> {
        a() {
        }

        /* renamed from: a */
        public CheckoutActivityResult createFromParcel(Parcel parcel) {
            return new CheckoutActivityResult(parcel, (a) null);
        }

        /* renamed from: a */
        public CheckoutActivityResult[] newArray(int i10) {
            return new CheckoutActivityResult[i10];
        }
    }

    /* synthetic */ CheckoutActivityResult(Parcel parcel, a aVar) {
        this(parcel);
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
        CheckoutActivityResult checkoutActivityResult = (CheckoutActivityResult) obj;
        return this.f121370d == checkoutActivityResult.f121370d && Objects.equals(this.f121367a, checkoutActivityResult.f121367a) && Objects.equals(this.f121368b, checkoutActivityResult.f121368b) && Objects.equals(this.f121369c, checkoutActivityResult.f121369c);
    }

    public PaymentError getPaymentError() {
        return this.f121368b;
    }

    public String getResourcePath() {
        return this.f121369c;
    }

    public Transaction getTransaction() {
        return this.f121367a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121367a, this.f121368b, this.f121369c, Boolean.valueOf(this.f121370d)});
    }

    public boolean isCanceled() {
        return this.f121370d;
    }

    public boolean isErrored() {
        return this.f121368b != null;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f121367a, 0);
        parcel.writeParcelable(this.f121368b, 0);
        parcel.writeString(this.f121369c);
        parcel.writeByte(this.f121370d ? (byte) 1 : 0);
    }

    /* synthetic */ CheckoutActivityResult(Builder builder, a aVar) {
        this(builder);
    }

    private CheckoutActivityResult(Builder builder) {
        this.f121367a = builder.f121371a;
        this.f121368b = builder.f121372b;
        this.f121369c = builder.f121373c;
        this.f121370d = builder.f121374d;
    }

    private CheckoutActivityResult(Parcel parcel) {
        this.f121367a = (Transaction) parcel.readParcelable(Transaction.class.getClassLoader());
        this.f121368b = (PaymentError) parcel.readParcelable(PaymentError.class.getClassLoader());
        this.f121369c = parcel.readString();
        this.f121370d = parcel.readByte() != 0;
    }
}
