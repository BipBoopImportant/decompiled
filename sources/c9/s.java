package C9;

import Z9.d;
import Z9.e;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

public abstract class s extends d implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case CheckoutActivity.RESULT_CANCELED /*101*/:
                e.b(parcel);
                C0((GoogleSignInAccount) e.a(parcel, GoogleSignInAccount.CREATOR), (Status) e.a(parcel, Status.CREATOR));
                break;
            case CheckoutActivity.RESULT_ERROR /*102*/:
                e.b(parcel);
                M2((Status) e.a(parcel, Status.CREATOR));
                break;
            case 103:
                e.b(parcel);
                z2((Status) e.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
