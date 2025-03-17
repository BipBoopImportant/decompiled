package pa;

import android.os.Parcel;
import fa.k;
import fa.l;

public abstract class C extends k implements D {
    public C() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        boolean zzb = zzb();
        parcel2.writeNoException();
        int i12 = l.f51215b;
        parcel2.writeInt(zzb ? 1 : 0);
        return true;
    }
}
