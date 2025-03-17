package com.google.ar.core.dependencies;

import android.os.Bundle;
import android.os.Parcel;

public abstract class i extends d implements j {
    public i() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i10, Parcel parcel) {
        if (i10 == 1) {
            e.d(parcel);
            b((Bundle) e.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            e.d(parcel);
            c((Bundle) e.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            Bundle bundle = (Bundle) e.a(parcel, Bundle.CREATOR);
            e.d(parcel);
        }
        return true;
    }
}
