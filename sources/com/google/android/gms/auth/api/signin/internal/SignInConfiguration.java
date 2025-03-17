package com.google.android.gms.auth.api.signin.internal;

import C9.b;
import C9.w;
import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    private final String f47954a;

    /* renamed from: b  reason: collision with root package name */
    private final GoogleSignInOptions f47955b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f47954a = C6620s.f(str);
        this.f47955b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f47954a.equals(signInConfiguration.f47954a)) {
            GoogleSignInOptions googleSignInOptions = this.f47955b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f47955b;
            if (googleSignInOptions != null) {
                return googleSignInOptions.equals(googleSignInOptions2);
            }
            if (googleSignInOptions2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        return new b().a(this.f47954a).a(this.f47955b).b();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f47954a;
        int a10 = c.a(parcel);
        c.u(parcel, 2, str, false);
        c.t(parcel, 5, this.f47955b, i10, false);
        c.b(parcel, a10);
    }

    public final GoogleSignInOptions x() {
        return this.f47955b;
    }
}
