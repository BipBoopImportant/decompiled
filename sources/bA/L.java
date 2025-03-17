package Ba;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class L implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        boolean z10 = false;
        boolean z11 = true;
        ArrayList<Integer> arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                arrayList = b.e(parcel, u10);
            } else if (m10 == 2) {
                z11 = b.n(parcel, u10);
            } else if (m10 == 3) {
                z10 = b.n(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                i10 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C6379c(arrayList, z11, z10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6379c[i10];
    }
}
