package na;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        long j10 = -1;
        long j11 = -1;
        int i10 = 1;
        int i11 = 1;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                i11 = b.w(parcel, u10);
            } else if (m10 == 3) {
                j10 = b.y(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                j11 = b.y(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new s(i10, i11, j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
