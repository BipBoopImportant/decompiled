package fa;

import android.os.IBinder;
import android.os.IInterface;

public abstract class n extends k implements o {
    public static o J3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof o ? (o) queryLocalInterface : new m(iBinder);
    }
}
