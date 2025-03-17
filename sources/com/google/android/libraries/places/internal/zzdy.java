package com.google.android.libraries.places.internal;

import com.android.volley.a;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.s;
import com.android.volley.t;
import com.android.volley.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

final class zzdy {
    static b zza(u uVar) {
        int i10 = uVar instanceof j ? 7 : uVar instanceof t ? 15 : ((uVar instanceof s) || (uVar instanceof m)) ? 8 : uVar instanceof a ? PlacesStatusCodes.REQUEST_DENIED : 13;
        k kVar = uVar.f46283a;
        return new b(new Status(i10, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", new Object[]{kVar == null ? "N/A" : String.valueOf(kVar.f46225a), uVar})));
    }
}
