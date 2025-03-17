package Ba;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class E implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                arrayList = b.i(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C6394s(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6394s[i10];
    }
}
