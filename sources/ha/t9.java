package ha;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class t9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    str = b.g(parcel2, u10);
                    break;
                case 3:
                    str2 = b.g(parcel2, u10);
                    break;
                case 4:
                    str3 = b.g(parcel2, u10);
                    break;
                case 5:
                    str4 = b.g(parcel2, u10);
                    break;
                case 6:
                    str5 = b.g(parcel2, u10);
                    break;
                case 7:
                    str6 = b.g(parcel2, u10);
                    break;
                case 8:
                    str7 = b.g(parcel2, u10);
                    break;
                case 9:
                    str8 = b.g(parcel2, u10);
                    break;
                case 10:
                    str9 = b.g(parcel2, u10);
                    break;
                case 11:
                    str10 = b.g(parcel2, u10);
                    break;
                case 12:
                    str11 = b.g(parcel2, u10);
                    break;
                case 13:
                    str12 = b.g(parcel2, u10);
                    break;
                case 14:
                    str13 = b.g(parcel2, u10);
                    break;
                case 15:
                    str14 = b.g(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new C8122r4(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8122r4[i10];
    }
}
