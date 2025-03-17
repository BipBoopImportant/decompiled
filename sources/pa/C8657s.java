package pa;

import android.os.Parcel;
import fa.k;

/* renamed from: pa.s  reason: case insensitive filesystem */
public abstract class C8657s extends k implements C8658t {
    public C8657s() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
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
