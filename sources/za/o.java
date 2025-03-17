package za;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import za.a;

public final class o implements Parcelable.Creator<a.l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 == 3) {
                str2 = b.g(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                i10 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new a.l(str, str2, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.l[i10];
    }
}
