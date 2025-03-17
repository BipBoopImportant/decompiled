package na;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Status status = null;
        k kVar = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                status = (Status) b.f(parcel, u10, Status.CREATOR);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                kVar = (k) b.f(parcel, u10, k.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new j(status, kVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
