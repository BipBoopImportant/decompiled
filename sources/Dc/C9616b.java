package dc;

import L9.b;
import L9.c;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dc.b  reason: case insensitive filesystem */
public class C9616b implements Parcelable.Creator<C9615a> {
    static void c(C9615a aVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, aVar.F(), false);
        c.u(parcel, 2, aVar.B(), false);
        c.n(parcel, 3, aVar.U());
        c.r(parcel, 4, aVar.x());
        c.e(parcel, 5, aVar.J(), false);
        c.t(parcel, 6, aVar.t0(), i10, false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public C9615a createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    str = b.g(parcel, u10);
                    break;
                case 2:
                    str2 = b.g(parcel, u10);
                    break;
                case 3:
                    i10 = b.w(parcel, u10);
                    break;
                case 4:
                    j10 = b.y(parcel, u10);
                    break;
                case 5:
                    bundle = b.a(parcel, u10);
                    break;
                case 6:
                    uri = (Uri) b.f(parcel, u10, Uri.CREATOR);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new C9615a(str, str2, i10, j10, bundle, uri);
    }

    /* renamed from: b */
    public C9615a[] newArray(int i10) {
        return new C9615a[i10];
    }
}
