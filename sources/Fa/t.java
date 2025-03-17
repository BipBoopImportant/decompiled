package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class t extends k implements u {
    public static u J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return queryLocalInterface instanceof u ? (u) queryLocalInterface : new s(iBinder);
    }
}
