package qa;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                latLng = (LatLng) b.f(parcel, u10, LatLng.CREATOR);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                latLng2 = (LatLng) b.f(parcel, u10, LatLng.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLngBounds[i10];
    }
}
