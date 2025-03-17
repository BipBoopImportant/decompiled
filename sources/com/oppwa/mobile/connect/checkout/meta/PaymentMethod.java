package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Objects;

public class PaymentMethod implements Parcelable {
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121443b;

    /* renamed from: c  reason: collision with root package name */
    private final Token f121444c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f121445d;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f121446a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f121447b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Token f121448c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f121449d;

        public Builder(String str, String str2) {
            this.f121446a = str;
            this.f121447b = str2;
        }

        public PaymentMethod build() {
            return new PaymentMethod(this, (a) null);
        }

        public Builder setCard(boolean z10) {
            this.f121449d = z10;
            return this;
        }

        public Builder setToken(Token token) {
            this.f121448c = token;
            return this;
        }
    }

    class a implements Parcelable.Creator<PaymentMethod> {
        a() {
        }

        /* renamed from: a */
        public PaymentMethod createFromParcel(Parcel parcel) {
            return new PaymentMethod(parcel, (a) null);
        }

        /* renamed from: a */
        public PaymentMethod[] newArray(int i10) {
            return new PaymentMethod[i10];
        }
    }

    /* synthetic */ PaymentMethod(Parcel parcel, a aVar) {
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
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return this.f121445d == paymentMethod.f121445d && this.f121442a.equals(paymentMethod.f121442a) && this.f121443b.equals(paymentMethod.f121443b) && Objects.equals(this.f121444c, paymentMethod.f121444c);
    }

    public String getBrand() {
        return this.f121442a;
    }

    public String getDisplayableName() {
        return this.f121443b;
    }

    public Token getToken() {
        return this.f121444c;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121442a, this.f121443b, this.f121444c, Boolean.valueOf(this.f121445d)});
    }

    public boolean isCard() {
        return this.f121445d;
    }

    public boolean isToken() {
        return this.f121444c != null;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121442a);
        parcel.writeString(this.f121443b);
        parcel.writeParcelable(this.f121444c, i10);
        parcel.writeByte(this.f121445d ? (byte) 1 : 0);
    }

    /* synthetic */ PaymentMethod(Builder builder, a aVar) {
        this(builder);
    }

    private PaymentMethod(Builder builder) {
        this.f121442a = builder.f121446a;
        this.f121443b = builder.f121447b;
        this.f121444c = builder.f121448c;
        this.f121445d = builder.f121449d;
    }

    private PaymentMethod(Parcel parcel) {
        this.f121442a = parcel.readString();
        this.f121443b = parcel.readString();
        this.f121444c = (Token) parcel.readParcelable(Token.class.getClassLoader());
        this.f121445d = parcel.readByte() != 0;
    }
}
