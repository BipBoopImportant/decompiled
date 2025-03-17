package Aa;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = L9.b.C(parcel);
        PointF[] pointFArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = L9.b.u(parcel);
            int m10 = L9.b.m(u10);
            if (m10 == 2) {
                pointFArr = (PointF[]) L9.b.j(parcel, u10, PointF.CREATOR);
            } else if (m10 != 3) {
                L9.b.B(parcel, u10);
            } else {
                i10 = L9.b.w(parcel, u10);
            }
        }
        L9.b.l(parcel, C10);
        return new a(pointFArr, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
