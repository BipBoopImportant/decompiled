package ea;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class s0 extends C7820d implements t0 {
    public s0() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C7832p.d(parcel);
        M((Status) C7832p.a(parcel, Status.CREATOR), (Location) C7832p.a(parcel, Location.CREATOR));
        return true;
    }
}
