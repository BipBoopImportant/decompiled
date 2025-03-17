package ha;

import L9.b;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

public final class L8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        double d10 = 0.0d;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        S4 s42 = null;
        C8164v6 v6Var = null;
        W6 w62 = null;
        U7 u72 = null;
        C8185x7 x7Var = null;
        C8143t5 t5Var = null;
        C8102p3 p3Var = null;
        Q3 q32 = null;
        C8122r4 r4Var = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    i10 = b.w(parcel2, u10);
                    break;
                case 3:
                    str = b.g(parcel2, u10);
                    break;
                case 4:
                    str2 = b.g(parcel2, u10);
                    break;
                case 5:
                    i11 = b.w(parcel2, u10);
                    break;
                case 6:
                    pointArr = (Point[]) b.j(parcel2, u10, Point.CREATOR);
                    break;
                case 7:
                    s42 = (S4) b.f(parcel2, u10, S4.CREATOR);
                    break;
                case 8:
                    v6Var = (C8164v6) b.f(parcel2, u10, C8164v6.CREATOR);
                    break;
                case 9:
                    w62 = (W6) b.f(parcel2, u10, W6.CREATOR);
                    break;
                case 10:
                    u72 = (U7) b.f(parcel2, u10, U7.CREATOR);
                    break;
                case 11:
                    x7Var = (C8185x7) b.f(parcel2, u10, C8185x7.CREATOR);
                    break;
                case 12:
                    t5Var = (C8143t5) b.f(parcel2, u10, C8143t5.CREATOR);
                    break;
                case 13:
                    p3Var = (C8102p3) b.f(parcel2, u10, C8102p3.CREATOR);
                    break;
                case 14:
                    q32 = (Q3) b.f(parcel2, u10, Q3.CREATOR);
                    break;
                case 15:
                    r4Var = (C8122r4) b.f(parcel2, u10, C8122r4.CREATOR);
                    break;
                case 16:
                    bArr = b.b(parcel2, u10);
                    break;
                case 17:
                    z10 = b.n(parcel2, u10);
                    break;
                case 18:
                    d10 = b.q(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new C8166v8(i10, str, str2, i11, pointArr, s42, v6Var, w62, u72, x7Var, t5Var, p3Var, q32, r4Var, bArr, z10, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8166v8[i10];
    }
}
