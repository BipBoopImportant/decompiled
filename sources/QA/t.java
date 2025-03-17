package qa;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

public final class t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                latLng = (LatLng) b.f(parcel, u10, LatLng.CREATOR);
            } else if (m10 == 3) {
                str = b.g(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                str2 = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new j(latLng, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
