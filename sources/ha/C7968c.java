package ha;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ha.c  reason: case insensitive filesystem */
public final class C7968c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 2) {
                d10 = b.q(parcel, u10);
            } else if (m10 != 3) {
                b.B(parcel, u10);
            } else {
                d11 = b.q(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C8143t5(d10, d11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8143t5[i10];
    }
}
