package Aa;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

public final class d implements Parcelable.Creator<LandmarkParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i11 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            int m10 = b.m(u10);
            if (m10 == 1) {
                i10 = b.w(parcel, u10);
            } else if (m10 == 2) {
                f10 = b.s(parcel, u10);
            } else if (m10 == 3) {
                f11 = b.s(parcel, u10);
            } else if (m10 != 4) {
                b.B(parcel, u10);
            } else {
                i11 = b.w(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new LandmarkParcel(i10, f10, f11, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LandmarkParcel[i10];
    }
}
