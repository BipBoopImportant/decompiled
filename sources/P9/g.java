package P9;

import O9.b;
import O9.e;
import aa.C6989b;
import aa.C6990c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class g extends C6989b implements h {
    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C6990c.b(parcel);
            Y((Status) C6990c.a(parcel, Status.CREATOR), (b) C6990c.a(parcel, b.CREATOR));
        } else if (i10 == 2) {
            C6990c.b(parcel);
            N2((Status) C6990c.a(parcel, Status.CREATOR), (O9.g) C6990c.a(parcel, O9.g.CREATOR));
        } else if (i10 == 3) {
            C6990c.b(parcel);
            r3((Status) C6990c.a(parcel, Status.CREATOR), (e) C6990c.a(parcel, e.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            C6990c.b(parcel);
            g3((Status) C6990c.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
