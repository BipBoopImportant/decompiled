package pa;

import android.os.Parcel;
import fa.k;
import fa.l;
import fa.q;
import fa.r;

public abstract class i0 extends k implements j0 {
    public i0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        r J32 = q.J3(parcel.readStrongBinder());
        l.b(parcel);
        G3(J32);
        parcel2.writeNoException();
        return true;
    }
}
