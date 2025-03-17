package Ba;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class D implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        String str = null;
        String str2 = null;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 == 3) {
                str2 = b.g(parcel, u10);
            } else if (m10 == 4) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 5) {
                b.B(parcel, u10);
            } else {
                i11 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C(str, str2, i10, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C[i10];
    }
}
