package fa;

import android.os.IBinder;
import android.os.Parcel;

public final class p extends a implements r {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    public final int b() {
        Parcel I32 = I3(18, J3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final boolean i0(r rVar) {
        Parcel J32 = J3();
        l.d(J32, rVar);
        Parcel I32 = I3(17, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final void m() {
        K3(1, J3());
    }
}
