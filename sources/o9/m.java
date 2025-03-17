package O9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Long l10 = null;
        Long l11 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                i11 = b.w(parcel, u10);
            } else if (m10 == 3) {
                l10 = b.z(parcel, u10);
            } else if (m10 == 4) {
                l11 = b.z(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                i12 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new h(i10, i11, l10, l11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
