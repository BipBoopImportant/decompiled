package Ba;

import L9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Bundle bundle = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                bundle = b.a(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C6388l(i10, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6388l[i10];
    }
}
