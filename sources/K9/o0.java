package K9;

import G9.C6521b;
import L9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class o0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Bundle bundle = null;
        C6608f fVar = null;
        int i10 = 0;
        C6521b[] bVarArr = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                bundle = b.a(parcel, u10);
            } else if (m10 == 2) {
                bVarArr = (C6521b[]) b.j(parcel, u10, C6521b.CREATOR);
            } else if (m10 == 3) {
                i10 = b.w(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                fVar = (C6608f) b.f(parcel, u10, C6608f.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new n0(bundle, bVarArr, i10, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n0[i10];
    }
}
