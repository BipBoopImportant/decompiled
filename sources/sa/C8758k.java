package sa;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.C7245a0;
import com.google.android.gms.internal.measurement.C7254b0;
import com.google.android.gms.measurement.internal.C7645m5;
import java.util.ArrayList;

/* renamed from: sa.k  reason: case insensitive filesystem */
public abstract class C8758k extends C7254b0 implements C8756i {
    public C8758k() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList<C7645m5> createTypedArrayList = parcel.createTypedArrayList(C7645m5.CREATOR);
        C7245a0.f(parcel);
        r2(createTypedArrayList);
        return true;
    }
}
