package ha;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class H8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String[] strArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                strArr = b.h(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new I8(i10, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new I8[i10];
    }
}
