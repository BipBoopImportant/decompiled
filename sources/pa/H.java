package pa;

import android.os.Parcel;
import fa.k;
import fa.l;
import qa.j;

public abstract class H extends k implements I {
    public H() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l.b(parcel);
        z3((j) l.a(parcel, j.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
