package pa;

import android.os.Parcel;
import fa.k;

public abstract class a0 extends k implements b0 {
    public a0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
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
