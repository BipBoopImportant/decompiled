package P9;

import G9.C6521b;
import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<C6521b> arrayList = null;
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                arrayList = b.k(parcel, u10, C6521b.CREATOR);
            } else if (m10 == 2) {
                z10 = b.n(parcel, u10);
            } else if (m10 == 3) {
                str2 = b.g(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new a(arrayList, z10, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
