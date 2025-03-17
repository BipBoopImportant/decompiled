package dc;

import L9.b;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import dc.j;

public class l implements Parcelable.Creator<j.a> {
    static void c(j.a aVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, aVar.x(), false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public j.a createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 2) {
                b.B(parcel, u10);
            } else {
                str = b.g(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new j.a(str);
    }

    /* renamed from: b */
    public j.a[] newArray(int i10) {
        return new j.a[i10];
    }
}
