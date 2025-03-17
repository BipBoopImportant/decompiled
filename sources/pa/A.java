package pa;

import android.os.Parcel;
import fa.c;
import fa.d;
import fa.k;
import fa.l;

public abstract class A extends k implements B {
    public A() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            d J32 = c.J3(parcel.readStrongBinder());
            l.b(parcel);
            M0(J32);
        } else if (i10 == 2) {
            d J33 = c.J3(parcel.readStrongBinder());
            l.b(parcel);
            a(J33);
        } else if (i10 != 3) {
            return false;
        } else {
            d J34 = c.J3(parcel.readStrongBinder());
            l.b(parcel);
            q(J34);
        }
        parcel2.writeNoException();
        return true;
    }
}
