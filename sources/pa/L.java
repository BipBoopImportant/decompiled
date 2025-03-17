package pa;

import android.os.Parcel;
import fa.i;
import fa.j;
import fa.k;
import fa.l;

public abstract class L extends k implements M {
    public L() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        j J32 = i.J3(parcel.readStrongBinder());
        l.b(parcel);
        n2(J32);
        parcel2.writeNoException();
        return true;
    }
}
