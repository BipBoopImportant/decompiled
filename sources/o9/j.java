package O9;

import L9.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                pendingIntent = (PendingIntent) b.f(parcel, u10, PendingIntent.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new e(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
