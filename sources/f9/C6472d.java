package F9;

import L9.b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F9.d  reason: case insensitive filesystem */
public final class C6472d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                intent = (Intent) b.f(parcel, u10, Intent.CREATOR);
            }
        }
        b.l(parcel, C10);
        return new C6469a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6469a[i10];
    }
}
