package fa;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public final class b extends a implements d {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final void D(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        K3(14, J32);
    }

    public final void E1(String str) {
        Parcel J32 = J3();
        J32.writeString(str);
        K3(5, J32);
    }

    public final void F(float f10) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        K3(27, J32);
    }

    public final void I2(float f10, float f11) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        J32.writeFloat(f11);
        K3(19, J32);
    }

    public final void R2(String str) {
        Parcel J32 = J3();
        J32.writeString(str);
        K3(7, J32);
    }

    public final void S(LatLng latLng) {
        Parcel J32 = J3();
        l.c(J32, latLng);
        K3(3, J32);
    }

    public final void U2(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        K3(9, J32);
    }

    public final void Y0(T9.b bVar) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        K3(18, J32);
    }

    public final int e() {
        Parcel I32 = I3(17, J3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final LatLng f() {
        Parcel I32 = I3(4, J3());
        LatLng latLng = (LatLng) l.a(I32, LatLng.CREATOR);
        I32.recycle();
        return latLng;
    }

    public final void i1(float f10) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        K3(22, J32);
    }

    public final boolean j1() {
        Parcel I32 = I3(13, J3());
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final void l0(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        K3(20, J32);
    }

    public final void n() {
        K3(1, J3());
    }

    public final boolean o1() {
        Parcel I32 = I3(15, J3());
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final void o3(float f10) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        K3(25, J32);
    }

    public final void w0(T9.b bVar) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        K3(29, J32);
    }

    public final boolean x1(d dVar) {
        Parcel J32 = J3();
        l.d(J32, dVar);
        Parcel I32 = I3(16, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final void z(float f10, float f11) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        J32.writeFloat(f11);
        K3(24, J32);
    }

    public final void zzD() {
        K3(11, J3());
    }
}
