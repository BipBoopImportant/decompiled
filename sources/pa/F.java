package pa;

import android.location.Location;
import android.os.Parcel;
import fa.k;
import fa.l;

public abstract class F extends k implements G {
    public F() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l.b(parcel);
        j0((Location) l.a(parcel, Location.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
