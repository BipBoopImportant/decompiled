package G9;

import L9.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    str = b.g(parcel, u10);
                    break;
                case 2:
                    z10 = b.n(parcel, u10);
                    break;
                case 3:
                    z11 = b.n(parcel, u10);
                    break;
                case 4:
                    iBinder = b.v(parcel, u10);
                    break;
                case 5:
                    z12 = b.n(parcel, u10);
                    break;
                case 6:
                    z13 = b.n(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new t(str, z10, z11, iBinder, z12, z13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
