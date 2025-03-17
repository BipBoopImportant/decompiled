package K9;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ca.C7110d;
import ca.C7111e;

public abstract class C0 extends C7110d implements X {
    public C0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static X J3(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof X ? (X) queryLocalInterface : new B0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            b zzd = zzd();
            parcel2.writeNoException();
            C7111e.d(parcel2, zzd);
        } else if (i10 != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
