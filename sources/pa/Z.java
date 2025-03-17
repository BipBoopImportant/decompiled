package pa;

import T9.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import fa.a;
import fa.l;

public final class Z extends a implements C8643d {
    Z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final void B(C8662x xVar) {
        Parcel J32 = J3();
        l.d(J32, xVar);
        K3(9, J32);
    }

    public final b c() {
        Parcel I32 = I3(8, J3());
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }

    public final void g() {
        K3(13, J3());
    }

    public final void k() {
        K3(12, J3());
    }

    public final void l() {
        K3(5, J3());
    }

    public final void onLowMemory() {
        K3(6, J3());
    }

    public final void onPause() {
        K3(4, J3());
    }

    public final void onResume() {
        K3(3, J3());
    }

    public final void s(Bundle bundle) {
        Parcel J32 = J3();
        l.c(J32, bundle);
        K3(2, J32);
    }

    public final void t(Bundle bundle) {
        Parcel J32 = J3();
        l.c(J32, bundle);
        Parcel I32 = I3(7, J32);
        if (I32.readInt() != 0) {
            bundle.readFromParcel(I32);
        }
        I32.recycle();
    }
}
