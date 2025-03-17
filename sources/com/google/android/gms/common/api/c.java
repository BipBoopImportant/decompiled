package com.google.android.gms.common.api;

import H9.C6528b;
import K9.C6620s;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import j0.C5445a;
import java.util.ArrayList;

public class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final C5445a f47999a;

    public c(C5445a aVar) {
        this.f47999a = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C6528b bVar : this.f47999a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C6620s.l((ConnectionResult) this.f47999a.get(bVar));
            z10 &= !connectionResult.U();
            arrayList.add(bVar.b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
