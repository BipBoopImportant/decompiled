package za;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import za.a;

public final class f implements Parcelable.Creator<a.b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    i10 = b.w(parcel, u10);
                    break;
                case 3:
                    i11 = b.w(parcel, u10);
                    break;
                case 4:
                    i12 = b.w(parcel, u10);
                    break;
                case 5:
                    i13 = b.w(parcel, u10);
                    break;
                case 6:
                    i14 = b.w(parcel, u10);
                    break;
                case 7:
                    i15 = b.w(parcel, u10);
                    break;
                case 8:
                    z10 = b.n(parcel, u10);
                    break;
                case 9:
                    str = b.g(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new a.b(i10, i11, i12, i13, i14, i15, z10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.b[i10];
    }
}
