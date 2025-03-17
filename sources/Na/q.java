package na;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    z10 = b.n(parcel, u10);
                    break;
                case 2:
                    z11 = b.n(parcel, u10);
                    break;
                case 3:
                    z12 = b.n(parcel, u10);
                    break;
                case 4:
                    z13 = b.n(parcel, u10);
                    break;
                case 5:
                    z14 = b.n(parcel, u10);
                    break;
                case 6:
                    z15 = b.n(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new k(z10, z11, z12, z13, z14, z15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
