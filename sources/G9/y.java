package G9;

import L9.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                str = b.g(parcel, u10);
            } else if (m10 == 2) {
                iBinder = b.v(parcel, u10);
            } else if (m10 == 3) {
                z10 = b.n(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                z11 = b.n(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new x(str, iBinder, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
