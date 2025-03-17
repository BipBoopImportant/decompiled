package ma;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

public final class o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                strArr = b.h(parcel, u10);
            } else if (m10 == 2) {
                iArr = b.d(parcel, u10);
            } else if (m10 == 3) {
                remoteViews = (RemoteViews) b.f(parcel, u10, RemoteViews.CREATOR);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                bArr = b.b(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new n(strArr, iArr, remoteViews, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
