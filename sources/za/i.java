package za;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import za.a;

public final class i implements Parcelable.Creator<a.f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 3) {
                str = b.g(parcel, u10);
            } else if (m10 == 4) {
                str2 = b.g(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                str3 = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new a.f(i10, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.f[i10];
    }
}
