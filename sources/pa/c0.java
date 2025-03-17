package pa;

import android.os.Parcel;
import fa.k;

public abstract class c0 extends k implements d0 {
    public c0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
