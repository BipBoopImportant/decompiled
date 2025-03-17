package P9;

import O9.h;
import aa.C6989b;
import aa.C6990c;
import android.os.Parcel;

public abstract class j extends C6989b implements k {
    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C6990c.b(parcel);
        i3((h) C6990c.a(parcel, h.CREATOR));
        return true;
    }
}
