package pa;

import android.os.Parcel;
import fa.k;
import fa.l;

public abstract class g0 extends k implements h0 {
    public g0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        l.b(parcel);
        d(readInt);
        parcel2.writeNoException();
        return true;
    }
}
