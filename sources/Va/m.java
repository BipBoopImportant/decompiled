package va;

import K9.U;
import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        U u10 = null;
        while (parcel.dataPosition() < C10) {
            int u11 = b.u(parcel);
            int m10 = b.m(u11);
            if (m10 == 1) {
                i10 = b.w(parcel, u11);
            } else if (m10 == 2) {
                connectionResult = (ConnectionResult) b.f(parcel, u11, ConnectionResult.CREATOR);
            } else if (m10 != 3) {
                b.B(parcel, u11);
            } else {
                u10 = (U) b.f(parcel, u11, U.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new l(i10, connectionResult, u10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
