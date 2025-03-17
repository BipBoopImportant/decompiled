package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class i extends k implements j {
    public static j J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof j ? (j) queryLocalInterface : new h(iBinder);
    }
}
