package com.oppwa.mobile.connect.payment.afterpaypacific;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutHelper;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayConfig;
import java.util.Objects;

public class CashAppPayPaymentParams extends AfterpayPacificPaymentParams {
    public static final Parcelable.Creator<CashAppPayPaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final CashAppPayConfig f121814g;

    class a implements Parcelable.Creator<CashAppPayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public CashAppPayPaymentParams createFromParcel(Parcel parcel) {
            return new CashAppPayPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public CashAppPayPaymentParams[] newArray(int i10) {
            return new CashAppPayPaymentParams[i10];
        }
    }

    /* synthetic */ CashAppPayPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CashAppPayPaymentParams) && super.equals(obj)) {
            return Objects.equals(this.f121814g, ((CashAppPayPaymentParams) obj).f121814g);
        }
        return false;
    }

    public CashAppPayConfig getCashAppPayConfig() {
        return this.f121814g;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121814g});
    }

    public void setShopperResultUrl(String str) {
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f121814g, i10);
    }

    public CashAppPayPaymentParams(String str, CashAppPayConfig cashAppPayConfig) {
        super(str, CheckoutConstants.PaymentBrands.CASH_APP_PAY);
        this.f121814g = cashAppPayConfig;
        super.setShopperResultUrl(CheckoutHelper.getCashAppPayShopperResultUrl());
    }

    private CashAppPayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121814g = (CashAppPayConfig) parcel.readParcelable(CashAppPayConfig.class.getClassLoader());
    }
}
