package ea;

import android.os.Parcel;
import na.j;

/* renamed from: ea.b  reason: case insensitive filesystem */
public abstract class C7818b extends C7820d implements C7819c {
    public C7818b() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean I3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C7832p.d(parcel);
        a1((j) C7832p.a(parcel, j.CREATOR));
        return true;
    }
}
