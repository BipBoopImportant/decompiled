package pa;

import android.os.Parcel;
import fa.k;
import fa.l;
import fa.w;
import fa.x;

/* renamed from: pa.g  reason: case insensitive filesystem */
public abstract class C8646g extends k implements C8647h {
    public C8646g() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzb();
        } else if (i10 != 2) {
            return false;
        } else {
            x J32 = w.J3(parcel.readStrongBinder());
            l.b(parcel);
            m2(J32);
        }
        parcel2.writeNoException();
        return true;
    }
}
