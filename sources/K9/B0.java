package K9;

import T9.b;
import android.os.IBinder;
import android.os.Parcel;
import ca.C7107a;

public final class B0 extends C7107a implements X {
    B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() {
        Parcel I32 = I3(2, K3());
        int readInt = I32.readInt();
        I32.recycle();
        return readInt;
    }

    public final b zzd() {
        Parcel I32 = I3(1, K3());
        b J32 = b.a.J3(I32.readStrongBinder());
        I32.recycle();
        return J32;
    }
}
