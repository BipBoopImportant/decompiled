package com.google.android.gms.auth.api.signin;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 4) {
                str = b.g(parcel, u10);
            } else if (m10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) b.f(parcel, u10, GoogleSignInAccount.CREATOR);
            } else if (m10 != 8) {
                b.B(parcel, u10);
            } else {
                str2 = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
