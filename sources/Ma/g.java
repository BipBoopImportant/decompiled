package ma;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 2) {
                b.B(parcel, u10);
            } else {
                bArr = b.b(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new f(bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
