package fa;

import android.os.IBinder;
import android.os.Parcel;

public final class s extends a implements u {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    public final boolean F3(u uVar) {
        Parcel J32 = J3();
        l.d(J32, uVar);
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

    public final void m() {
        K3(1, J3());
    }
}
