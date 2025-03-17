package fa;

import android.os.IBinder;
import android.os.Parcel;

public final class e extends a implements g {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    public final boolean a2(g gVar) {
        Parcel J32 = J3();
        l.d(J32, gVar);
        Parcel I32 = I3(19, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final int b() {
        Parcel I32 = I3(20, J3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final void n() {
        K3(1, J3());
    }
}
