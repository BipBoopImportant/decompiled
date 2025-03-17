package va;

import aa.C6989b;
import aa.C6990c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class e extends C6989b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C6990c.a(parcel, ConnectionResult.CREATOR);
                b bVar = (b) C6990c.a(parcel, b.CREATOR);
                C6990c.b(parcel);
                break;
            case 4:
                Status status = (Status) C6990c.a(parcel, Status.CREATOR);
                C6990c.b(parcel);
                break;
            case 6:
                Status status2 = (Status) C6990c.a(parcel, Status.CREATOR);
                C6990c.b(parcel);
                break;
            case 7:
                Status status3 = (Status) C6990c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C6990c.a(parcel, GoogleSignInAccount.CREATOR);
                C6990c.b(parcel);
                break;
            case 8:
                C6990c.b(parcel);
                v0((l) C6990c.a(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) C6990c.a(parcel, h.CREATOR);
                C6990c.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
