package Ba;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class S implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        String str = null;
        CommonWalletObject commonWalletObject = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                str = b.g(parcel, u10);
            } else if (m10 == 3) {
                str2 = b.g(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                commonWalletObject = (CommonWalletObject) b.f(parcel, u10, CommonWalletObject.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new C6383g(i10, str, str2, commonWalletObject);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6383g[i10];
    }
}
