package sa;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.measurement.internal.C7645m5;
import java.util.List;

/* renamed from: sa.j  reason: case insensitive filesystem */
public final class C8757j extends Y implements C8756i {
    C8757j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    public final void r2(List<C7645m5> list) {
        Parcel I32 = I3();
        I32.writeTypedList(list);
        L3(2, I32);
    }
}
