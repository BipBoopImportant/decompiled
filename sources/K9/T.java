package K9;

import L9.b;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class T implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                account = (Account) b.f(parcel, u10, Account.CREATOR);
            } else if (m10 == 3) {
                i11 = b.w(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.f(parcel, u10, GoogleSignInAccount.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new S(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new S[i10];
    }
}
