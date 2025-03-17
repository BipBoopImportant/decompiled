package pa;

import T9.b;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import fa.a;
import fa.l;

public final class E extends a implements C8640a {
    E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final b J0(LatLngBounds latLngBounds, int i10, int i11, int i12) {
        Parcel J32 = J3();
        l.c(J32, latLngBounds);
        J32.writeInt(i10);
        J32.writeInt(i11);
        J32.writeInt(i12);
        Parcel I32 = I3(11, J32);
        b J33 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }

    public final b N0(CameraPosition cameraPosition) {
        Parcel J32 = J3();
        l.c(J32, cameraPosition);
        Parcel I32 = I3(7, J32);
        b J33 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }

    public final b d2(LatLng latLng) {
        Parcel J32 = J3();
        l.c(J32, latLng);
        Parcel I32 = I3(8, J32);
        b J33 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }

    public final b h1(float f10) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        Parcel I32 = I3(4, J32);
        b J33 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }

    public final b l1(LatLng latLng, float f10) {
        Parcel J32 = J3();
        l.c(J32, latLng);
        J32.writeFloat(f10);
        Parcel I32 = I3(9, J32);
        b J33 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }
}
