package ea;

import K9.C6606d;
import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public final class S implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        long j10 = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList<C6606d> arrayList = null;
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                locationRequest = (LocationRequest) b.f(parcel2, u10, LocationRequest.CREATOR);
            } else if (m10 == 5) {
                arrayList = b.k(parcel2, u10, C6606d.CREATOR);
            } else if (m10 == 8) {
                z10 = b.n(parcel2, u10);
            } else if (m10 != 9) {
                switch (m10) {
                    case 11:
                        z12 = b.n(parcel2, u10);
                        break;
                    case 12:
                        z13 = b.n(parcel2, u10);
                        break;
                    case 13:
                        str = b.g(parcel2, u10);
                        break;
                    case 14:
                        j10 = b.y(parcel2, u10);
                        break;
                    default:
                        b.B(parcel2, u10);
                        break;
                }
            } else {
                z11 = b.n(parcel2, u10);
            }
        }
        b.l(parcel2, C10);
        return new Q(locationRequest, arrayList, z10, z11, z12, z13, str, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q[i10];
    }
}
