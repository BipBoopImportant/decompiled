package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class q extends k implements r {
    public static r J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new p(iBinder);
    }
}
