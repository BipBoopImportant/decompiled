package na;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public final class o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        ArrayList<LocationRequest> arrayList = null;
        boolean z11 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                arrayList = b.k(parcel, u10, LocationRequest.CREATOR);
            } else if (m10 == 2) {
                z10 = b.n(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                z11 = b.n(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new h(arrayList, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
