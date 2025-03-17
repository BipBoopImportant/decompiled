package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class Customer implements Parcelable {
    public static final Parcelable.Creator<Customer> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121772a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121773b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121774c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121775d;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f121776a;

        /* renamed from: b  reason: collision with root package name */
        private String f121777b;

        /* renamed from: c  reason: collision with root package name */
        private String f121778c;

        /* renamed from: d  reason: collision with root package name */
        private String f121779d;

        public Customer build() {
            return new Customer(this.f121776a, this.f121777b, this.f121778c, this.f121779d, (a) null);
        }

        public Builder setEmail(String str) {
            this.f121779d = str;
            return this;
        }

        public Builder setGivenName(String str) {
            this.f121776a = str;
            return this;
        }

        public Builder setPhone(String str) {
            this.f121778c = str;
            return this;
        }

        public Builder setSurname(String str) {
            this.f121777b = str;
            return this;
        }
    }

    class a implements Parcelable.Creator<Customer> {
        a() {
        }

        /* renamed from: a */
        public Customer createFromParcel(Parcel parcel) {
            return new Customer(parcel);
        }

        /* renamed from: a */
        public Customer[] newArray(int i10) {
            return new Customer[i10];
        }
    }

    /* synthetic */ Customer(String str, String str2, String str3, String str4, a aVar) {
        this(str, str2, str3, str4);
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
        Customer customer = (Customer) obj;
        return Objects.equals(this.f121772a, customer.f121772a) && Objects.equals(this.f121773b, customer.f121773b) && Objects.equals(this.f121774c, customer.f121774c) && Objects.equals(this.f121775d, customer.f121775d);
    }

    public String getEmail() {
        return this.f121775d;
    }

    public String getGivenName() {
        return this.f121772a;
    }

    public String getPhone() {
        return this.f121774c;
    }

    public String getSurname() {
        return this.f121773b;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121772a, this.f121773b, this.f121774c, this.f121775d});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121772a);
        parcel.writeString(this.f121773b);
        parcel.writeString(this.f121774c);
        parcel.writeString(this.f121775d);
    }

    private Customer(String str, String str2, String str3, String str4) {
        this.f121772a = str;
        this.f121773b = str2;
        this.f121774c = str3;
        this.f121775d = str4;
    }

    protected Customer(Parcel parcel) {
        this.f121772a = parcel.readString();
        this.f121773b = parcel.readString();
        this.f121774c = parcel.readString();
        this.f121775d = parcel.readString();
    }
}
