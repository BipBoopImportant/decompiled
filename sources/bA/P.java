package Ba;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class P implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList<Integer> arrayList2 = null;
        String str3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 2:
                    arrayList = b.e(parcel, u10);
                    break;
                case 4:
                    str = b.g(parcel, u10);
                    break;
                case 5:
                    str2 = b.g(parcel, u10);
                    break;
                case 6:
                    arrayList2 = b.e(parcel, u10);
                    break;
                case 7:
                    z10 = b.n(parcel, u10);
                    break;
                case 8:
                    str3 = b.g(parcel, u10);
                    break;
                default:
                    b.B(parcel, u10);
                    break;
            }
        }
        b.l(parcel, C10);
        return new C6381e(arrayList, str, str2, arrayList2, z10, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6381e[i10];
    }
}
