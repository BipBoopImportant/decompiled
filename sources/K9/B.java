package K9;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class B implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<C6618p> arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                arrayList = b.k(parcel, u10, C6618p.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new C6624w(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6624w[i10];
    }
}
