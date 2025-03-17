package pa;

import android.os.Parcel;
import fa.c;
import fa.d;
import fa.k;
import fa.l;

/* renamed from: pa.k  reason: case insensitive filesystem */
public abstract class C8650k extends k implements C8651l {
    public C8650k() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        d J32 = c.J3(parcel.readStrongBinder());
        l.b(parcel);
        a(J32);
        parcel2.writeNoException();
        return true;
    }
}
