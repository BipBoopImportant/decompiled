package K9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class M implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    i11 = b.w(parcel2, u10);
                    break;
                case 2:
                    i12 = b.w(parcel2, u10);
                    break;
                case 3:
                    i13 = b.w(parcel2, u10);
                    break;
                case 4:
                    j10 = b.y(parcel2, u10);
                    break;
                case 5:
                    j11 = b.y(parcel2, u10);
                    break;
                case 6:
                    str = b.g(parcel2, u10);
                    break;
                case 7:
                    str2 = b.g(parcel2, u10);
                    break;
                case 8:
                    i14 = b.w(parcel2, u10);
                    break;
                case 9:
                    i10 = b.w(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new C6618p(i11, i12, i13, j10, j11, str, str2, i14, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6618p[i10];
    }
}
