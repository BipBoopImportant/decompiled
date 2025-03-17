package com.google.android.gms.auth.api.signin;

import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    final String f47949a;

    /* renamed from: b  reason: collision with root package name */
    private final GoogleSignInAccount f47950b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    final String f47951c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f47950b = googleSignInAccount;
        this.f47949a = C6620s.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f47951c = C6620s.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f47949a;
        int a10 = c.a(parcel);
        c.u(parcel, 4, str, false);
        c.t(parcel, 7, this.f47950b, i10, false);
        c.u(parcel, 8, this.f47951c, false);
        c.b(parcel, a10);
    }

    public final GoogleSignInAccount x() {
        return this.f47950b;
    }
}
