package dc;

import L9.b;
import L9.c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import dc.j;
import java.util.ArrayList;

public class k implements Parcelable.Creator<j> {
    static void c(j jVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, jVar.B(), i10, false);
        c.t(parcel, 2, jVar.x(), i10, false);
        c.y(parcel, 3, jVar.F(), false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public j createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList<j.a> arrayList = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                uri = (Uri) b.f(parcel, u10, Uri.CREATOR);
            } else if (m10 == 2) {
                uri2 = (Uri) b.f(parcel, u10, Uri.CREATOR);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                arrayList = b.k(parcel, u10, j.a.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new j(uri, uri2, arrayList);
    }

    /* renamed from: b */
    public j[] newArray(int i10) {
        return new j[i10];
    }
}
