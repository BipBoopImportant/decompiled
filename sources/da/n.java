package Da;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        d dVar = null;
        f fVar = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 == 3) {
                dVar = (d) b.f(parcel, u10, d.CREATOR);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                fVar = (f) b.f(parcel, u10, f.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new c(str, dVar, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
