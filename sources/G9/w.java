package G9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                z10 = b.n(parcel, u10);
            } else if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 == 3) {
                i11 = b.w(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                i10 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new v(z10, str, i11, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
