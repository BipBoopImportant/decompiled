package fa;

import android.os.IBinder;
import android.os.Parcel;

public final class h extends a implements j {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    public final void j() {
        K3(1, J3());
    }

    public final boolean j3(j jVar) {
        Parcel J32 = J3();
        l.d(J32, jVar);
        Parcel I32 = I3(15, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final int zzh() {
        Parcel I32 = I3(16, J3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }
}
