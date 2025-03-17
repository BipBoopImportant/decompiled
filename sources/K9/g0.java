package K9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class g0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                z10 = b.n(parcel, u10);
            } else if (m10 == 3) {
                z11 = b.n(parcel, u10);
            } else if (m10 == 4) {
                i11 = b.w(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                i12 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C6622u(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6622u[i10];
    }
}
