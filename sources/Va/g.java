package va;

import aa.C6988a;
import aa.C6990c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class g extends C6988a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void L3(j jVar, f fVar) {
        Parcel I32 = I3();
        C6990c.c(I32, jVar);
        C6990c.d(I32, fVar);
        J3(12, I32);
    }
}
