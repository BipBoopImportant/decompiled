package pa;

import android.os.Parcel;
import fa.c;
import fa.d;
import fa.k;
import fa.l;

/* renamed from: pa.m  reason: case insensitive filesystem */
public abstract class C8652m extends k implements C8653n {
    public C8652m() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        d J32 = c.J3(parcel.readStrongBinder());
        l.b(parcel);
        a(J32);
        parcel2.writeNoException();
        return true;
    }
}
