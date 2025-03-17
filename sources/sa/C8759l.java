package sa;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.C7245a0;
import com.google.android.gms.internal.measurement.C7254b0;
import com.google.android.gms.measurement.internal.C7707v5;

/* renamed from: sa.l  reason: case insensitive filesystem */
public abstract class C8759l extends C7254b0 implements C8760m {
    public C8759l() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        C7245a0.f(parcel);
        G1((C7707v5) C7245a0.a(parcel, C7707v5.CREATOR));
        return true;
    }
}
