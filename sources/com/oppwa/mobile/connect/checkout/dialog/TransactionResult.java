package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;
import java.util.Objects;

public class TransactionResult implements Parcelable {
    public static final Parcelable.Creator<TransactionResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Transaction f121089a;

    /* renamed from: b  reason: collision with root package name */
    private final PaymentError f121090b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f121091c;

    class a implements Parcelable.Creator<TransactionResult> {
        a() {
        }

        /* renamed from: a */
        public TransactionResult createFromParcel(Parcel parcel) {
            return new TransactionResult(parcel);
        }

        /* renamed from: a */
        public TransactionResult[] newArray(int i10) {
            return new TransactionResult[i10];
        }
    }

    public TransactionResult(Transaction transaction, PaymentError paymentError) {
        this.f121089a = transaction;
        this.f121090b = paymentError;
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
        TransactionResult transactionResult = (TransactionResult) obj;
        return this.f121091c == transactionResult.f121091c && this.f121089a.equals(transactionResult.f121089a) && Objects.equals(this.f121090b, transactionResult.f121090b);
    }

    public PaymentError getError() {
        return this.f121090b;
    }

    public Transaction getTransaction() {
        return this.f121089a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121089a, this.f121090b, Boolean.valueOf(this.f121091c)});
    }

    public boolean isHandled() {
        return this.f121091c;
    }

    public void setHandled(boolean z10) {
        this.f121091c = z10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f121089a, 0);
        parcel.writeParcelable(this.f121090b, 0);
        parcel.writeByte(this.f121091c ? (byte) 1 : 0);
    }

    public TransactionResult(Parcel parcel) {
        this.f121089a = (Transaction) parcel.readParcelable(Transaction.class.getClassLoader());
        this.f121090b = (PaymentError) parcel.readParcelable(PaymentError.class.getClassLoader());
        this.f121091c = parcel.readByte() != 0;
    }
}
