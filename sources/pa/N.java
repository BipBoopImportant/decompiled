package pa;

import android.os.Parcel;
import fa.k;

public abstract class N extends k implements S {
    public N() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc();
        } else if (i10 != 2) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
