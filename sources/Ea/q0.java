package ea;

import H9.C6532f;
import K9.C6614l;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import na.C8592a;
import na.C8596e;
import na.h;

public final class q0 extends C7817a implements r0 {
    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void I0(T t10) {
        Parcel I32 = I3();
        C7832p.b(I32, t10);
        K3(59, I32);
    }

    public final C6614l K0(C8592a aVar, O o10) {
        Parcel I32 = I3();
        C7832p.b(I32, aVar);
        C7832p.b(I32, o10);
        Parcel J32 = J3(92, I32);
        C6614l J33 = C6614l.a.J3(J32.readStrongBinder());
        J32.recycle();
        return J33;
    }

    public final C6614l b2(C8592a aVar, t0 t0Var) {
        Parcel I32 = I3();
        C7832p.b(I32, aVar);
        C7832p.c(I32, t0Var);
        Parcel J32 = J3(87, I32);
        C6614l J33 = C6614l.a.J3(J32.readStrongBinder());
        J32.recycle();
        return J33;
    }

    public final void c0(O o10, LocationRequest locationRequest, C6532f fVar) {
        Parcel I32 = I3();
        C7832p.b(I32, o10);
        C7832p.b(I32, locationRequest);
        C7832p.c(I32, fVar);
        K3(88, I32);
    }

    public final void e0(h hVar, C7819c cVar, String str) {
        Parcel I32 = I3();
        C7832p.b(I32, hVar);
        C7832p.c(I32, cVar);
        I32.writeString((String) null);
        K3(63, I32);
    }

    public final void e3(C8596e eVar, O o10) {
        Parcel I32 = I3();
        C7832p.b(I32, eVar);
        C7832p.b(I32, o10);
        K3(90, I32);
    }

    public final void r1(O o10, C6532f fVar) {
        Parcel I32 = I3();
        C7832p.b(I32, o10);
        C7832p.c(I32, fVar);
        K3(89, I32);
    }

    public final void v2(C8596e eVar, t0 t0Var) {
        Parcel I32 = I3();
        C7832p.b(I32, eVar);
        C7832p.c(I32, t0Var);
        K3(82, I32);
    }

    public final Location zzs() {
        Parcel J32 = J3(7, I3());
        Location location = (Location) C7832p.a(J32, Location.CREATOR);
        J32.recycle();
        return location;
    }
}
