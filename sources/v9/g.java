package V9;

import T9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import da.C7781b;
import da.C7782c;

public abstract class g extends C7781b implements f {
    public g() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            init(b.a.J3(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), C7782c.b(parcel), parcel.readInt());
            parcel2.writeNoException();
            C7782c.a(parcel2, booleanFlagValue);
        } else if (i10 == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i10 == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i10 != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
