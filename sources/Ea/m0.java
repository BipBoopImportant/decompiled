package ea;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class m0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Status status = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                status = (Status) b.f(parcel, u10, Status.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new l0(status);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l0[i10];
    }
}
