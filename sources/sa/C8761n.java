package sa;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C7245a0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.measurement.internal.C7707v5;

/* renamed from: sa.n  reason: case insensitive filesystem */
public final class C8761n extends Y implements C8760m {
    C8761n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    public final void G1(C7707v5 v5Var) {
        Parcel I32 = I3();
        C7245a0.d(I32, v5Var);
        L3(2, I32);
    }
}
