package va;

import K9.S;
import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        S s10 = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                s10 = (S) b.f(parcel, u10, S.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new j(i10, s10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
