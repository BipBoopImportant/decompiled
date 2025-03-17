package O9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                z10 = b.n(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new g(i10, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
