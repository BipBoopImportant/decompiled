package na;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ea.C7820d;
import ea.C7832p;

public abstract class A extends C7820d implements B {
    public A() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static B J3(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof B ? (B) queryLocalInterface : new z(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C7832p.d(parcel);
            L1((LocationResult) C7832p.a(parcel, LocationResult.CREATOR));
        } else if (i10 == 2) {
            C7832p.d(parcel);
            h0((LocationAvailability) C7832p.a(parcel, LocationAvailability.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            i();
        }
        return true;
    }
}
