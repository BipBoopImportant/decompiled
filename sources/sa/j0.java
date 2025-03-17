package sa;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class j0 implements Parcelable.Creator<k0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<Integer> arrayList = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                arrayList = b.e(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new k0(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k0[i10];
    }
}
