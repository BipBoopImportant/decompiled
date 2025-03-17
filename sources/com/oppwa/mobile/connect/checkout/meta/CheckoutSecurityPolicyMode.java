package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;

public enum CheckoutSecurityPolicyMode implements Parcelable {
    DEVICE_AUTH_REQUIRED,
    DEVICE_AUTH_REQUIRED_IF_AVAILABLE,
    DEVICE_AUTH_NOT_REQUIRED;
    
    public static final Parcelable.Creator<CheckoutSecurityPolicyMode> CREATOR = null;

    class a implements Parcelable.Creator<CheckoutSecurityPolicyMode> {
        a() {
        }

        /* renamed from: a */
        public CheckoutSecurityPolicyMode createFromParcel(Parcel parcel) {
            return CheckoutSecurityPolicyMode.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutSecurityPolicyMode[] newArray(int i10) {
            return new CheckoutSecurityPolicyMode[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    public static CheckoutSecurityPolicyMode getByName(String str) {
        for (CheckoutSecurityPolicyMode checkoutSecurityPolicyMode : values()) {
            if (checkoutSecurityPolicyMode.name().equalsIgnoreCase(str)) {
                return checkoutSecurityPolicyMode;
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
