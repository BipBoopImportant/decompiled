package na;

import android.os.IBinder;
import android.os.IInterface;
import ea.C7820d;

public abstract class D extends C7820d implements E {
    public static E J3(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof E ? (E) queryLocalInterface : new C(iBinder);
    }
}
