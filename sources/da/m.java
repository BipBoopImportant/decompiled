package Da;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        int i10 = -1;
        long j10 = 0;
        String str = null;
        String str2 = null;
        double d10 = 0.0d;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    i11 = b.w(parcel2, u10);
                    break;
                case 3:
                    str = b.g(parcel2, u10);
                    break;
                case 4:
                    d10 = b.q(parcel2, u10);
                    break;
                case 5:
                    str2 = b.g(parcel2, u10);
                    break;
                case 6:
                    j10 = b.y(parcel2, u10);
                    break;
                case 7:
                    i10 = b.w(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new d(i11, str, d10, str2, j10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
