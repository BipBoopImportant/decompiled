package pa;

import T9.b;
import android.os.Parcel;
import fa.c;
import fa.d;
import fa.k;
import fa.l;

public abstract class W extends k implements X {
    public W() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            d J32 = c.J3(parcel.readStrongBinder());
            l.b(parcel);
            b q10 = q(J32);
            parcel2.writeNoException();
            l.d(parcel2, q10);
        } else if (i10 != 2) {
            return false;
        } else {
            d J33 = c.J3(parcel.readStrongBinder());
            l.b(parcel);
            b a10 = a(J33);
            parcel2.writeNoException();
            l.d(parcel2, a10);
        }
        return true;
    }
}
