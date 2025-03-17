package com.oppwa.mobile.connect.payment.amazonpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.BrandConfig;
import java.util.Objects;
import java.util.Optional;

public class AmazonPayConfig implements Parcelable, BrandConfig {
    public static final Parcelable.Creator<AmazonPayConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final AmazonPayRegion f121815a;

    public enum AmazonPayRegion implements Parcelable {
        US("en_US"),
        DE("de_DE"),
        UK("en_GB"),
        FR("fr_FR"),
        IT("it_IT"),
        ES("es_ES"),
        JP("ja_JP");
        
        public static final Parcelable.Creator<AmazonPayRegion> CREATOR = null;

        /* renamed from: a  reason: collision with root package name */
        private final String f121819a;

        class a implements Parcelable.Creator<AmazonPayRegion> {
            a() {
            }

            /* renamed from: a */
            public AmazonPayRegion createFromParcel(Parcel parcel) {
                return AmazonPayRegion.values()[parcel.readInt()];
            }

            /* renamed from: a */
            public AmazonPayRegion[] newArray(int i10) {
                return new AmazonPayRegion[i10];
            }
        }

        static {
            CREATOR = new a();
        }

        private AmazonPayRegion(String str) {
            this.f121819a = str;
        }

        public int describeContents() {
            return 0;
        }

        public String getLanguageCode() {
            return this.f121819a;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(ordinal());
        }
    }

    class a implements Parcelable.Creator<AmazonPayConfig> {
        a() {
        }

        /* renamed from: a */
        public AmazonPayConfig createFromParcel(Parcel parcel) {
            return new AmazonPayConfig(parcel);
        }

        /* renamed from: a */
        public AmazonPayConfig[] newArray(int i10) {
            return new AmazonPayConfig[i10];
        }
    }

    public AmazonPayConfig(AmazonPayRegion amazonPayRegion) {
        this.f121815a = amazonPayRegion;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException a() {
        return new IllegalArgumentException("The region is null");
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
        return this.f121815a == ((AmazonPayConfig) obj).f121815a;
    }

    public String getPaymentBrand() {
        return CheckoutConstants.PaymentBrands.AMAZONPAY;
    }

    public AmazonPayRegion getRegion() {
        return this.f121815a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121815a});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f121815a, 0);
    }

    protected AmazonPayConfig(Parcel parcel) {
        this.f121815a = (AmazonPayRegion) Optional.ofNullable((AmazonPayRegion) parcel.readParcelable(AmazonPayRegion.class.getClassLoader())).orElseThrow(new a());
    }
}
