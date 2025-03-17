package va;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                arrayList = b.i(parcel, u10);
            } else if (m10 != 2) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
