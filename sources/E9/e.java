package E9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class e implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                z10 = b.n(parcel, u10);
            } else if (m10 == 2) {
                j11 = b.y(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                j10 = b.y(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new d(z10, j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
