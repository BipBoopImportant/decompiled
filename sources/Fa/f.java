package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class f extends k implements g {
    public static g J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new e(iBinder);
    }
}
