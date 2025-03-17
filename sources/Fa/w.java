package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class w extends k implements x {
    public static x J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return queryLocalInterface instanceof x ? (x) queryLocalInterface : new v(iBinder);
    }
}
