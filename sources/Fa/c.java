package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class c extends k implements d {
    public static d J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }
}
