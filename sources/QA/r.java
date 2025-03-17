package qa;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 2) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new g(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
