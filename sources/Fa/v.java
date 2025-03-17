package fa;

import android.os.IBinder;
import android.os.Parcel;

public final class v extends a implements x {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    public final boolean a3(x xVar) {
        Parcel J32 = J3();
        l.d(J32, xVar);
        Parcel I32 = I3(5, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final int i() {
        Parcel I32 = I3(6, J3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }
}
