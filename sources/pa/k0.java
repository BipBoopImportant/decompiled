package pa;

import android.os.Parcel;
import fa.k;
import fa.l;
import fa.t;
import fa.u;

public abstract class k0 extends k implements l0 {
    public k0() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        u J32 = t.J3(parcel.readStrongBinder());
        l.b(parcel);
        c1(J32);
        parcel2.writeNoException();
        return true;
    }
}
