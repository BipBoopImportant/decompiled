package Da;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<a> c10 = com.google.android.gms.common.util.b.c();
        String str = null;
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
                c10 = b.k(parcel, u10, a.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new b(str, str2, c10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
