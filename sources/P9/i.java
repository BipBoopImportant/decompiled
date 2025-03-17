package P9;

import H9.C6532f;
import aa.C6988a;
import aa.C6990c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class i extends C6988a implements IInterface {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void L3(h hVar, a aVar) {
        Parcel I32 = I3();
        C6990c.d(I32, hVar);
        C6990c.c(I32, aVar);
        J3(1, I32);
    }

    public final void M3(h hVar, a aVar, k kVar) {
        Parcel I32 = I3();
        C6990c.d(I32, hVar);
        C6990c.c(I32, aVar);
        C6990c.d(I32, kVar);
        J3(2, I32);
    }

    public final void N3(C6532f fVar, k kVar) {
        Parcel I32 = I3();
        C6990c.d(I32, fVar);
        C6990c.d(I32, kVar);
        J3(6, I32);
    }
}
