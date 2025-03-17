package X9;

import android.os.IBinder;
import android.os.Parcel;

public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean R(boolean z10) {
        Parcel I32 = I3();
        c.a(I32, true);
        Parcel J32 = J3(2, I32);
        boolean b10 = c.b(J32);
        J32.recycle();
        return b10;
    }

    public final String zzc() {
        Parcel J32 = J3(1, I3());
        String readString = J32.readString();
        J32.recycle();
        return readString;
    }
}
