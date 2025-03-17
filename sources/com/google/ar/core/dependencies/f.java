package com.google.ar.core.dependencies;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class f extends c implements h {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    public final void d(String str, List list, Bundle bundle, j jVar) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeTypedList(list);
        e.b(a10, bundle);
        e.c(a10, jVar);
        c(1, a10);
    }

    public final void e(String str, Bundle bundle, j jVar) {
        Parcel a10 = a();
        a10.writeString(str);
        e.b(a10, bundle);
        e.c(a10, jVar);
        c(2, a10);
    }
}
