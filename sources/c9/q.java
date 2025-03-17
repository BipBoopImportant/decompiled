package C9;

import Z9.d;
import android.os.Parcel;

public abstract class q extends d implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            U();
        } else if (i10 != 2) {
            return false;
        } else {
            A();
        }
        return true;
    }
}
