package ha;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.p  reason: case insensitive filesystem */
public final class C8098p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 3) {
                i11 = b.w(parcel, u10);
            } else if (m10 == 4) {
                i12 = b.w(parcel, u10);
            } else if (m10 == 5) {
                j10 = b.y(parcel, u10);
            } else if (m10 != 6) {
                b.B(parcel, u10);
            } else {
                i13 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C8088o(i10, i11, i12, j10, i13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8088o[i10];
    }
}
