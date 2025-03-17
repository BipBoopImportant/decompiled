package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import xa.C8962c;
import xa.C8971l;
import xa.C8974o;

public final /* synthetic */ class zzeq implements C8962c {
    public static final /* synthetic */ zzeq zza = new zzeq();

    private /* synthetic */ zzeq() {
    }

    public final Object then(C8971l lVar) {
        Exception l10 = lVar.l();
        if (l10 == null) {
            return lVar;
        }
        return C8974o.e(l10 instanceof b ? (b) l10 : new b(new Status(13, l10.toString())));
    }
}
