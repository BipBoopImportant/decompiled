package pa;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import fa.k;
import fa.l;

/* renamed from: pa.u  reason: case insensitive filesystem */
public abstract class C8659u extends k implements C8660v {
    public C8659u() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        l.b(parcel);
        r((LatLng) l.a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
