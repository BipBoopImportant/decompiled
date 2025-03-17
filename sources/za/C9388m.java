package Za;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: Za.m  reason: case insensitive filesystem */
public abstract class C9388m extends C9383h implements C9389n {
    public C9388m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            C9384i.b(parcel);
            G2((Bundle) C9384i.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            C9384i.b(parcel);
            v((Bundle) C9384i.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
