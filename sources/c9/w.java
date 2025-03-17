package C9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

public final class w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                googleSignInOptions = (GoogleSignInOptions) b.f(parcel, u10, GoogleSignInOptions.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
