package M9;

import K9.C6624w;
import aa.C6988a;
import aa.C6990c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class a extends C6988a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void L3(C6624w wVar) {
        Parcel I32 = I3();
        C6990c.c(I32, wVar);
        K3(1, I32);
    }
}
