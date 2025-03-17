package ha;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.h  reason: case insensitive filesystem */
public final class C8018h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
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
                i10 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new U7(str, str2, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new U7[i10];
    }
}
