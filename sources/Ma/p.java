package ma;

import Ba.C6381e;
import Ba.C6386j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class p extends a implements IInterface {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void L3(C6381e eVar, Bundle bundle, r rVar) {
        Parcel I32 = I3();
        d.c(I32, eVar);
        d.c(I32, bundle);
        d.d(I32, rVar);
        K3(14, I32);
    }

    public final void M3(C6386j jVar, Bundle bundle, r rVar) {
        Parcel I32 = I3();
        d.c(I32, jVar);
        d.c(I32, bundle);
        d.d(I32, rVar);
        K3(19, I32);
    }
}
