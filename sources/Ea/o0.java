package ea;

import android.os.Parcel;

public abstract class o0 extends C7820d implements p0 {
    public o0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C7832p.d(parcel);
            p0((l0) C7832p.a(parcel, l0.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            h();
        }
        return true;
    }
}
