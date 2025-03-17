package pa;

import android.os.Parcel;
import fa.c;
import fa.d;
import fa.k;
import fa.l;

/* renamed from: pa.y  reason: case insensitive filesystem */
public abstract class C8663y extends k implements C8664z {
    public C8663y() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        d J32 = c.J3(parcel.readStrongBinder());
        l.b(parcel);
        boolean a10 = a(J32);
        parcel2.writeNoException();
        parcel2.writeInt(a10 ? 1 : 0);
        return true;
    }
}
