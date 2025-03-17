package K9;

import android.os.Bundle;
import android.os.Parcel;
import ca.C7110d;
import ca.C7111e;

public abstract class Y extends C7110d implements C6615m {
    public Y() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C7111e.b(parcel);
            D0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C7111e.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            C7111e.b(parcel);
            j2(parcel.readInt(), (Bundle) C7111e.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            C7111e.b(parcel);
            Z(parcel.readInt(), parcel.readStrongBinder(), (n0) C7111e.a(parcel, n0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
