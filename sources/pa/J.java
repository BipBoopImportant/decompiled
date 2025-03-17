package pa;

import android.os.Parcel;
import fa.f;
import fa.g;
import fa.k;
import fa.l;

public abstract class J extends k implements K {
    public J() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        g J32 = f.J3(parcel.readStrongBinder());
        l.b(parcel);
        z1(J32);
        parcel2.writeNoException();
        return true;
    }
}
