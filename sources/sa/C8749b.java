package sa;

import L9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sa.b  reason: case insensitive filesystem */
public final class C8749b implements Parcelable.Creator<C8750c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = b.C(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            if (b.m(u10) != 1) {
                b.B(parcel, u10);
            } else {
                bundle = b.a(parcel, u10);
            }
        }
        b.l(parcel, C10);
        return new C8750c(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8750c[i10];
    }
}
