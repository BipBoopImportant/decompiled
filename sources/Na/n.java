package na;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import ea.J;

public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        J j10 = null;
        int i10 = 0;
        boolean z10 = false;
        long j11 = Long.MAX_VALUE;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                j11 = b.y(parcel, u10);
            } else if (m10 == 2) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 3) {
                z10 = b.n(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                j10 = (J) b.f(parcel, u10, J.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new C8596e(j11, i10, z10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8596e[i10];
    }
}
