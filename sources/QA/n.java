package qa;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        float f12 = 0.0f;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                latLng = (LatLng) b.f(parcel, u10, LatLng.CREATOR);
            } else if (m10 == 3) {
                f10 = b.s(parcel, u10);
            } else if (m10 == 4) {
                f12 = b.s(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                f11 = b.s(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new CameraPosition(latLng, f10, f12, f11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
