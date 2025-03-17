package Ca;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    str = b.g(parcel, u10);
                    break;
                case 2:
                    i10 = b.w(parcel, u10);
                    break;
                case 3:
                    z10 = b.n(parcel, u10);
                    break;
                case 4:
                    str2 = b.g(parcel, u10);
                    break;
                case 5:
                    str3 = b.g(parcel, u10);
                    break;
                case 6:
                    str4 = b.g(parcel, u10);
                    break;
                case 7:
                    str5 = b.g(parcel, u10);
                    break;
                case 8:
                    str6 = b.g(parcel, u10);
                    break;
                case 9:
                    str7 = b.g(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new b(str, i10, z10, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
